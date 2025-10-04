package reusableComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Nikhil Singh
 *
 */
public class ExcelUtilities extends FunctionLibrary {
	private Workbook workbook = null;
	private String workbookFilePath;
	private File inputFile;

	public boolean createWorkbook(String path) {
		Workbook wb = null;
		FileOutputStream fileOut = null;
		try {
			if (this.checkIfFileExists(path)) {
				logFail("Failed to create workbook file. The file already exists. File= " + path);
				return false;
			} else {
				if (path.endsWith(".xls")) {
					wb = new HSSFWorkbook();
					fileOut = new FileOutputStream(path);
					wb.write(fileOut);
					fileOut.close();
				} else if (path.endsWith(".xlsx")) {
					wb = new XSSFWorkbook();
					fileOut = new FileOutputStream(path);
					wb.write(fileOut);
					fileOut.close();
				} else {
					logFail(
							"Failed to create workbook file. The filename must end with .xls or .xlsx File= " + path);
				}
				return true;
			}
		} catch (Exception exp1) {
			exp1.printStackTrace();
			logFail("Field to create workbook file. File = " + path + ". " + exp1.getMessage());
			return false;
		}
	}

	public Workbook openWorkbook(String path) {
		Workbook wb = null;

		try {
			if (this.checkIfFileExists(path)) {
				this.workbookFilePath = path;
				this.inputFile = new File(path);
				InputStream inputStream = new FileInputStream(this.inputFile);
				wb = WorkbookFactory.create(inputStream);
			} else {
				logWarn("Failed to open workbook file. File= " + path);
			}
		} catch (Exception exp1) {
			exp1.printStackTrace();
		}
		this.workbook = wb;
		return wb;
	}

	public boolean closeWorkbook() {
		if (this.workbook == null) {
			logWarn("Failed The workbook is not opened!");
			return false;
		} else {
			try {
				this.workbook.close();
				this.workbook = null;
				return true;
			} catch (Exception exp1) {
				logWarn("Failed to close the workbook!");
				return false;
			}
		}
	}

	public boolean saveWorkbook() {
		try {
			FileOutputStream fileOut = new FileOutputStream(this.inputFile);
			this.workbook.write(fileOut);
			fileOut.close();
			return true;
		} catch (IOException exp6) {
			exp6.printStackTrace();
			logFail("Workbook save failure File = " + this.workbookFilePath + ". " + exp6.getMessage());
			return false;
		}
	}

	public boolean saveWorkbook(String path) {
		try {
			if (this.checkIfFileExists(path)) {
				logFail("Workbook save failure. The file already exists. File = " + path);
				return false;
			} else {
				FileOutputStream fileOut = new FileOutputStream(path);
				this.workbook.write(fileOut);
				fileOut.close();
				return true;
			}
		} catch (IOException exp6) {
			exp6.printStackTrace();
			logFail("Workbook save failure File = " + this.workbookFilePath + ". " + exp6.getMessage());
			return false;
		}
	}

	public List<String> getRowTextValues(int rowIndex) {
		List<String> rowValues = new ArrayList<String>();
		Sheet sheet = this.getActiveSheet();
		DataFormatter formatter = new DataFormatter();
		if (sheet == null) {
			logWarn("Could not access the worksheet!");
			return null;
		} else if (rowIndex > sheet.getLastRowNum()) {
			logWarn("The rowIndex exceeds the number of rows on the worksheet!");
			return null;
		} else {
			Row row = sheet.getRow(rowIndex);
			@SuppressWarnings("rawtypes")
			Iterator var6 = row.iterator();
			while (var6.hasNext()) {
				Cell cell = (Cell) var6.next();
				rowValues.add(formatter.formatCellValue(cell));
			}
			return rowValues;
		}
	}

	public String getCellText(int rowIndex, int columnIndex) {
		Sheet sheet = this.getActiveSheet();
		DataFormatter formatter = new DataFormatter();
		if (sheet == null) {
			logWarn("Could not access the worksheet!");
			return null;
		} else if (rowIndex > sheet.getLastRowNum()) {
			logWarn("The rowIndex exceeds the number of rows on the worksheet!");
			return null;
		} else {
			Row row = sheet.getRow(rowIndex);
			if (columnIndex > row.getLastCellNum()) {
				logWarn("The columnIndex exceeds the number of columns in the row!");
				return null;
			} else {
				return formatter.formatCellValue(row.getCell(columnIndex));
			}
		}
	}

	public Sheet createSheet(String sheetName) {
		if (this.workbook == null) {
			logWarn("Failed The workbook is not opened!");
			return null;
		} else if (sheetName.length() > 31) {
			logFail("Sheet name cannot exceed 31 characters. Name = " + sheetName);
			return null;
		} else {
			String safeName = WorkbookUtil.createSafeSheetName(sheetName);
			Sheet sheet = this.workbook.createSheet(safeName);
			return sheet;
		}
	}

	public Workbook getWorkbook() {
		return this.workbook;
	}

	public Sheet getActiveSheet() {
		if (this.workbook == null) {
			logWarn("The workbook is not opened!");
			return null;
		} else {
			return this.workbook.getSheetAt(this.workbook.getActiveSheetIndex());
		}
	}

	public boolean setActiveSheet(int sheetIndex) {
		if (this.workbook == null) {
			logWarn("The workbook is not opened!");
			return false;
		} else if (sheetIndex > this.workbook.getNumberOfSheets()) {
			logWarn("The specified sheet index exceeds the number of sheets in the workbook!");
			return false;
		} else {
			this.workbook.setActiveSheet(sheetIndex);
			return true;
		}
	}

	/**************************
	 * Custom Excel Operations
	 ***********************************/
	private static XSSFSheet ExcelSheet;
	private static XSSFWorkbook ExcelBook;
	private static String sheetdata;
	private static XSSFRow RowId;
	private static XSSFCell Cell;
	private static Workbook Workbook;

	public static String SetExcelPath(String Path, String SheetName, int rowNum, int cellNum) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			ExcelBook = new XSSFWorkbook(ExcelFile);
			ExcelSheet = ExcelBook.getSheet(SheetName);
			RowId = ExcelSheet.getRow(rowNum);
			if (RowId.getCell(cellNum).getCellType() == CellType.NUMERIC) {
				double cellNumericData = RowId.getCell(cellNum).getNumericCellValue();
				sheetdata = Double.toString(cellNumericData);
			} else {
				sheetdata = RowId.getCell(cellNum).getStringCellValue();
			}
			return sheetdata;
		} catch (Exception e) {
			throw (e);
		}
	}

	public static String getExcelValue(String excelFilePath, String sheetName, int rowNum, int cellNum)
			throws Exception {
		int cellNumericData;
		FileInputStream fs = new FileInputStream(excelFilePath);
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		DataFormatter df = new DataFormatter();
		String sheetdata = df.formatCellValue(cell);
		return sheetdata;
	}

	private int getColNo(Sheet sheet, String colName) {
		Row row = null;
		int total_rows = sheet.getLastRowNum();
		int colm_no = 16380;
		boolean flag = false;
		for (int i = 0; i <= total_rows; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j <= row.getLastCellNum(); j++) {
				if (row.getCell(j) != null) {
					if (row.getCell(j).toString().trim().equals(colName)) {
						flag = true;
						colm_no = j;
						break;
					}
				}
			}
			if (flag == true)
				break;
		}
		return colm_no;
	}

	private int getRowNo(Sheet sheet, String colName) {
		Row row = null;
		int total_rows = sheet.getLastRowNum();
		int row_no = 16380;
		boolean flag = false;

		for (int i = 0; i <= total_rows; i++) {
			row = sheet.getRow(i);
			// System.out.println("total columns " + row.getLastCellNum());
			for (int j = 0; j <= row.getLastCellNum(); j++) {
				if (row.getCell(j) != null) {
					if (row.getCell(j).toString().trim().equals(colName)) {
						flag = true;
						break;
					}
				}
			}
			if (flag == true) {
				row_no = i;
				break;
			}
		}
		return row_no;
	}

	private static Workbook getWorkbook(String WorkbookPath) throws IOException {
		if (WorkbookPath.contains(".xlsx")) {
			Workbook = new XSSFWorkbook(WorkbookPath);
			// System.err.println("workbook.getNumberOfSheets() : " +
			// workbook.getNumberOfSheets());
		} else {
			FileInputStream inp = new FileInputStream(WorkbookPath);
			Workbook = new HSSFWorkbook(new POIFSFileSystem(inp));
			// System.err.println("workbook.getNumberOfSheets() : " +
			// workbook.getNumberOfSheets());
		}
		return Workbook;
	}

	private Sheet getSheet(String WorkbookPath, String SheetName) throws IOException {
		Sheet sheet = null;
		Workbook workbook = getWorkbook(WorkbookPath);
		sheet = workbook.getSheet(SheetName.trim());
		return sheet;
	}

	public static int getRowCount(String WorkbookPath, String SheetName) throws IOException {
		int sheetRow;
		Sheet sheet = null;
		Workbook workbook = getWorkbook(WorkbookPath);
		sheet = workbook.getSheet(SheetName.trim());
		return sheetRow = sheet.getLastRowNum();
	}

	public String getCellContentRowNo(String WorkbookPath, String SheetName, int RowNo, String ColName) {
		String CellContent = null;
		Sheet sheet = null;
		try {
			sheet = getSheet(WorkbookPath, SheetName);
			System.out.println("getColNo : " + getColNo(sheet, ColName));
			Cell cell = sheet.getRow(RowNo).getCell(getColNo(sheet, ColName));
			if (cell == null || cell.getCellType() == CellType.BLANK) {
				// System.err.println("OK-");
				CellContent = "";
			} else {
				CellContent = cell.toString().trim();
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Excl Exception :" + WorkbookPath);
			System.err.println("Excl Exception :" + SheetName);
			System.err.println(e.getMessage());
		}
		return CellContent;
	}

	public static void setCellData(String Result, int RowNum, int ColNum, String Path) throws Exception {
		try {
			RowId = ExcelSheet.getRow(RowNum);
			Cell = RowId.getCell(ColNum, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = RowId.createCell(ColNum);
				Cell.setCellValue(Result);
			} else {
				Cell.setCellValue(Result);
			}
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(Path);
			ExcelBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}

	public static void writeDataToExcel(String filePath, String sheetName, int rowNum, int colNum, String value)
			throws IOException, InvalidFormatException {
		File file = new File(filePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// Getting workbook instance that refers to .xlsx file
		ExcelBook = new XSSFWorkbook(inputStream);

		// Getting a Sheet object
		ExcelSheet = ExcelBook.getSheet(sheetName);
	
		
		
		  boolean Value = ExcelSheet.isSheetLocked(); 
		  System.out.println(Value);
		  
		  if (Value == true ) 
		  {
		   ExcelSheet.disableLocking();
		  System.out.println(ExcelSheet.isSheetLocked()); 
		  }
		  else
		  System.out.println("Excel sheet is enabled for editing");
		 
        
		// Getting a Sheet object
		RowId = ExcelSheet.getRow(rowNum);
		Cell = null;
		// Getting a Cell object and Setting Data
		if (Cell == null) {
			Cell = RowId.createCell(colNum);
			Cell.setCellValue(value);
		} else {
			Cell.setCellValue(value);
		}
		FileOutputStream fileOut = new FileOutputStream(filePath);
		ExcelBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	
	
	public static void writeData(String filePath, String sheetName, int rowNum, int colNum, String value)
			throws IOException, InvalidFormatException {
		File file = new File(filePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// Getting workbook instance that refers to .xlsx file
		ExcelBook = new XSSFWorkbook(inputStream);

		// Getting a Sheet object
		ExcelSheet = ExcelBook.getSheet(sheetName);
	
		
		
		  boolean Value = ExcelSheet.isSheetLocked(); 
		  System.out.println(Value);
		  
		  if (Value == true ) 
		  {
		   ExcelSheet.disableLocking();
		  System.out.println(ExcelSheet.isSheetLocked()); 
		  }
		  else
		  System.out.println("Excel sheet is enabled for editing");
		 
        
		// Getting a Sheet object
		RowId = ExcelSheet.createRow(rowNum);
		Cell = null;
		// Getting a Cell object and Setting Data
		if (Cell == null) {
			Cell = RowId.createCell(colNum);
			Cell.setCellValue(value);
		} else {
			Cell.setCellValue(value);
		}
		FileOutputStream fileOut = new FileOutputStream(filePath);
		ExcelBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}

}
