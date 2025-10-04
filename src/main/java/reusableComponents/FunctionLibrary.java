package reusableComponents;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import browserFactory.BrowserFactory;
import browserFactory.DriverFactory;
import resources.ExtentListener;


/**
 * 
 * Function Library Contains all Framework methods
 *
 */
public class FunctionLibrary extends ClassObjectRepo {

	//GLOBAL VARIABLES
	protected int timeout = 60;
	protected int timeoutMax = 180;
	protected int pollTime = 500;
	BrowserFactory browserFactory;

	/****************************** WebDriver And Browser Methods ********************************/

	public void initialSetup() throws Exception {
		browserFactory = new BrowserFactory();
//		browserFactory = new BrowserFactory();
		configFileReader = new ConfigFileReader();
		extentListener = new ExtentListener();
		softAssertion = new SoftAssert();
		asynchronousWaitUtil = new AsynchronousWaitUtil();
		scrollUtilities = new ScrollUtilities();
		printUtility = new PrintUtility();
		actionEngine = new ActionEngine();
		randomUtilities = new RandomUtilities();
		lightHouseUtil = new LightHouseUtil();
		browserUtilities = new BrowserUtilities();
		devToolUtilities = new DevToolUtilities();
	}

	public WebDriver getDriver() 
	{
		return DriverFactory.getInstance().getDriver();
	}
	

	public void launchBrowser(String Browser, String AppURL) throws Exception 
	{
		String runType = ConfigFileReader.getTestData("config.runType");
		switch (runType) {
		case "LOCAL":
			DriverFactory.getInstance().setDriver(browserFactory.createBrowserInstance(Browser));
			getDriver().get(AppURL);
			jse = (JavascriptExecutor) getDriver();
			logPass("Succesfully Opend URL: " + getDriver().getCurrentUrl());
			break;
		case "SAUCE":
			DriverFactory.getInstance().setDriver(browserFactory.createSauceBrowserInstance(Browser));
			getDriver().get(AppURL);
			jse = (JavascriptExecutor) getDriver();
			logPass("Succesfully Opend URL: " + getDriver().getCurrentUrl());
			break;
		}
	}
	
	public void launchBrowserDebug(String Browser, String AppURL, String portNumber) throws Exception 
	{
		String runType = ConfigFileReader.getTestData("config.runType");
		switch (runType) {
		case "LOCAL":
			DriverFactory.getInstance().setDriver(browserFactory.createBrowserInstanceForDebug(Browser, portNumber));
			getDriver().get(AppURL);
			jse = (JavascriptExecutor) getDriver();
			logPass("Succesfully Opend URL: " + getDriver().getCurrentUrl());
			break;
		case "SAUCE":
			DriverFactory.getInstance().setDriver(browserFactory.createSauceBrowserInstance(Browser));
			getDriver().get(AppURL);
			jse = (JavascriptExecutor) getDriver();
			logPass("Succesfully Opend URL: " + getDriver().getCurrentUrl());
			break;
		}
	}
	
	public String getChromeDebugPort() throws InterruptedException
	{
		return browserFactory.getChromeDebugPort();
	}

	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}
	

	/***************************** Excel Utilities Methods ****************************************/

	/**
	 * Create work book in specified excel file.
	 * 
	 * @param path
	 */
	public boolean createWorkbook(String path) {
		return excelUtilities.createWorkbook(path);
	}

	/**
	 * Open work book in specified excel file.
	 * 
	 * @param path
	 */
	public Workbook openWorkbook(String path) {
		return excelUtilities.openWorkbook(path);
	}

	/**
	 * Close work book in specified excel file.
	 * 
	 */
	public boolean closeWorkbook() {
		return excelUtilities.closeWorkbook();
	}

	/**
	 * Save work book already opened excel.
	 * 
	 */
	public boolean saveWorkbook() {
		return excelUtilities.saveWorkbook();
	}

	/**
	 * Save work book in specified excel file.
	 * 
	 * @param path
	 */
	public boolean saveWorkbook(String path) {
		return excelUtilities.saveWorkbook(path);
	}

	/**
	 * Get row text/Value in specified row index.
	 * 
	 * @param Integer
	 */
	public List<String> getRowTextValues(int rowIndex) {
		return excelUtilities.getRowTextValues(rowIndex);
	}

	/**
	 * Get cell text/Value in specified row index and column index.
	 * 
	 * @param Integer, Integer
	 */
	public String getCellText(int rowIndex, int columnIndex) {
		return excelUtilities.getCellText(rowIndex, columnIndex);
	}

	/**
	 * Get row text/Value in specified row index. @ String
	 */
	public Sheet createSheet(String sheetName) {
		return excelUtilities.createSheet(sheetName);
	}

	/**
	 * Get workbook.
	 * 
	 */
	public Workbook getWorkbook() {
		return excelUtilities.getWorkbook();
	}

	/**
	 * Get active sheet.
	 * 
	 */
	public Sheet getActiveSheet() {
		return excelUtilities.getActiveSheet();
	}

	/**
	 * Set a sheet as active sheet with specified Index.
	 * 
	 * @param Integer
	 */
	public boolean setActiveSheet(int sheetIndex) {
		return excelUtilities.setActiveSheet(sheetIndex);
	}

	/**
	 * Set excel file path.
	 * 
	 * @param Integer
	 */
	public static String SetExcelPath(String Path, String SheetName, int rowNum, int cellNum) throws Exception {
		return ExcelUtilities.SetExcelPath(Path, SheetName, rowNum, cellNum);
	}

	/**
	 * Get excel file data.
	 * 
	 * @param Integer
	 */
	public static String getExcelValue(String excelFilePath, String sheetName, int rowNum, int cellNum)
			throws Exception {
		return ExcelUtilities.getExcelValue(excelFilePath, sheetName, rowNum, cellNum);
	}

	/**
	 * Get excel file data row count.
	 * 
	 * @param Integer
	 * @throws IOException
	 */
	public static int getRowCount(String WorkbookPath, String SheetName) throws IOException {
		return ExcelUtilities.getRowCount(WorkbookPath, SheetName);
	}

	/**
	 * Get excel cell data with specified Row number.
	 * 
	 * @param Integer
	 */
	public String getCellContentRowNo(String WorkbookPath, String SheetName, int RowNo, String ColName) {
		return excelUtilities.getCellContentRowNo(WorkbookPath, SheetName, RowNo, ColName);
	}

	/**
	 * Set Cell data with specific row and column.
	 * 
	 * @param Integer
	 */
	public static void setCellData(String Result, int RowNum, int ColNum, String Path) throws Exception {
		ExcelUtilities.setCellData(Result, RowNum, ColNum, Path);
	}

	/**
	 * Set Cell data with specific row and column and sheet.
	 * 
	 * @param Integer
	 */
	public static void writeDataToExcel(String filePath, String sheetName, int rowNum, int colNum, String value)
			throws InvalidFormatException, IOException {
		ExcelUtilities.writeDataToExcel(filePath, sheetName, rowNum, colNum, value);
	}

	
	public static void writeData(String filePath, String sheetName, int rowNum, int colNum, String value)
			throws InvalidFormatException, IOException {
		ExcelUtilities.writeData(filePath, sheetName, rowNum, colNum, value);
	}

	/***************************** Security Class Methods ****************************************/
	/**
	 * Uses provided key to encrypt provided message using simple XOR
	 * 
	 * @param String, String
	 */

	public static String encryptXOR(String message, String key) {
		return SecurityClass.encryptXOR(message, key);
	}

	/**
	 * Uses provided key to decrypt provided message encrypted using the same key
	 * 
	 * @param String, String
	 */

	public static String decryptXOR(String message, String key) {
		return SecurityClass.decryptXOR(message, key);
	}

	/**
	 * Create Folder if does not exist
	 * 
	 * @param By, String
	 * @throws IOException
	 */
	public static void createDirectoryIfNotExists(String path, String DirectoryName) {
		String projectPath = path;
		String directoryName = DirectoryName;
		File testOutput = new File(projectPath);
		File directory = new File(projectPath + "\\" + directoryName);
		if (!checkIfFolderExists(projectPath)) {
			testOutput.mkdir();
		}
		if (!checkIfFolderExists(directoryName)) {
			directory.mkdir();
		}
	}

	public static boolean checkIfFolderExists(String folderName) {
		boolean found = false;
		try {
			File file = new File(folderName);
			if (file.exists() && file.isDirectory()) {
				found = true;
			}
		} catch (Exception exp1) {
			exp1.printStackTrace();
		}
		return found;
	}

	
	
	public boolean checkIfFileExists(String fileName) {
		boolean found = false;
		try {
			File file = new File(fileName);
			if (file.exists() && file.isFile()) {
				found = true;
			}
		} catch (Exception exp1) {
			logWarn(fileName + "not found.");
		}
		return found;
	}

	public By getByLocator(WebElement we) 
	{
		String[] data0;
		String locator;
		String term;
		if(we.toString().contains("DefaultElementLocator"))
		{
			data0 = we.toString().split("DefaultElementLocator");
			String data1 = data0[1];
			String data[] = replaceLast(data1,"[']", "").split(": ");
			String data_loc0 = data[0].replaceFirst("[']", "");
			String data_loc1[] = data_loc0.split("[.]");
			locator = data_loc1[1];
			term = data[1];
		}
		else
		{
			data0 = we.toString().split(" -> ");
			String data1 = data0[1];
			String data[] = replaceLast(data1,"]", "").split(": ");
			locator = data[0];
			term = data[1];
		}
	    
	    switch (locator) 
	    {
		    case "xpath":
		        return By.xpath(term);
		    case "css selector":
		        return By.cssSelector(term);
		    case "id":
		        return By.id(term);
		    case "tag name":
		        return By.tagName(term);
		    case "name":
		        return By.name(term);
		    case "link text":
		        return By.linkText(term);
		    case "class name":
		        return By.className(term);
	    }
	    return (By) we;
	}
	
	 public String replaceLast(String text, String regex, String replacement) 
	 {
	        return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
	 }
	
	//************************* Dynamic Waits *************************************************//
	 
	 public WebElement waitForElementToAppear(WebElement element) 
 	 {
		long start = System.currentTimeMillis();
		WebElement ele = null;
		try
		{
	 		handleAsyncWait();
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
			ele = wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			
		}
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForElementToAppear()",totalTime,getByLocator(element));
		return ele;
 	 }
	 
	 
	 public WebElement waitForElementToAppear(By element) 
 	 {
		long start = System.currentTimeMillis();
		WebElement ele = null;
		try
		{
	 		handleAsyncWait();
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
			ele = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			
		}
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForElementToAppear()",totalTime,element);
		return ele;
 	 }
	 
 	public WebElement waitForElementToBeVisible(WebElement element) 
 	{
 		long start = System.currentTimeMillis();
 		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
		WebElement ele;
		ele = wait.until(ExpectedConditions.visibilityOf(element));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForElementToBeVisible()",totalTime,getByLocator(element)); 
		return ele;
	}
 	
	public WebElement waitForElementToBeVisible(By element) 
 	{
 		long start = System.currentTimeMillis();
 		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
		WebElement ele;
		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForElementToBeVisible()",totalTime,element); 
		return ele;
	}
	
 	
 	public List<WebElement> waitForElementToBeVisible(List<WebElement> element) 
	{
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
		try 
		{
			element = wait.until(ExpectedConditions.visibilityOfAllElements(element));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			printWaitTime("waitForElementToBeVisible()",totalTime,getByLocator(element.get(0))); 
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("waitForElementToBeVisible(): Element not found -> "+element);
		}
		return element;
	}
	
 	
 	

	public void waitForAttributeToChange(WebElement element, String attribute, String attributeValue) 
	{
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutMax));
		wait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForAttributeToChange()",totalTime,getByLocator(element)); 
	}
	
	public void waitForAttributeToChange(By element, String attribute, String attributeValue) 
	{
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutMax));
		wait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForAttributeToChange()",totalTime,element); 
	}

	public void waitForElementAttributeContainsString(WebElement element, String attribute, String expectedString) 
	{
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutMax));
		ExpectedCondition<Boolean> elementAttributeContainsString ;
		elementAttributeContainsString = arg0 -> element.getAttribute(attribute).contains(expectedString);
		wait.until(elementAttributeContainsString);
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForElementAttributeContainsString()",totalTime,getByLocator(element)); 
	}

	public WebElement waitForElementClickable(WebElement element) 
	{
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
		WebElement element_clickable;
		element_clickable = wait.until(ExpectedConditions.elementToBeClickable(element));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForElementClickable()",totalTime,getByLocator(element)); 
		return element_clickable;
	}

	public WebElement waitForElementToBePresent(WebElement element) throws Exception
	{
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
		WebElement element_appear = null;
		try 
		{
			element_appear = wait.until(ExpectedConditions.presenceOfElementLocated(getByLocator(element)));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			printWaitTime("waitForElementToBePresent()",totalTime,getByLocator(element)); 
		}
		catch (Exception e) 
		{
			System.out.println("waitForElementToBePresent(): Element not found -> "+getByLocator(element));
			throw e;
		}
		return element_appear;
	}
	
	public WebElement waitForElementToBePresent(List<WebElement> element) 
	{
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
		WebElement element_appear = null;
		try 
		{
			element_appear = wait.until(ExpectedConditions.presenceOfElementLocated(getByLocator(element.get(0))));
			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			printWaitTime("waitForElementToBePresent()",totalTime,getByLocator(element.get(0))); 
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("waitForElementToBePresent(): Element not found -> "+getByLocator(element.get(0)));
		}
		return element_appear;
	}
	
	
	public boolean waitForTextToBePresentInElement(WebElement element, String expectedText) 
	{
		boolean result=false;
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout), Duration.ofMillis(pollTime));
		result = wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForTextToBePresentInElement()",totalTime,getByLocator(element)); 
		return result;
	}
	
	public void waitForElementToBeInvisible(WebElement element) 
	{
		long start = System.currentTimeMillis();
		handleAsyncWait();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout), Duration.ofMillis(pollTime));
		By byElement =	getByLocator(element);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(byElement));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("waitForElementToBeInvisible()",totalTime,getByLocator(element)); 
	}
	
	
	
	public void handleAsyncWait() 
	{
		long start = System.currentTimeMillis();
		try
		{
			waitForAngularRequestsToFinish();
		}
		catch (Exception e) 
		{
			waitUntilJQueryReady();
			waitForAngularRequestsToFinish_Exp();
		}
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		//printWaitTime("handleAsyncWait()",totalTime); 
	}
	

	 /****************************** AsynchronousWaitUtil Methods ****************************************/
	
	
	 public void waitForAngularRequestsToFinish()
	 {
		 asynchronousWaitUtil.waitForAngularRequestsToFinish();
	 }
	 
	 public void waitForAngularRequestsToFinish_Exp()
	 {
		 asynchronousWaitUtil.waitForAngularRequestsToFinish_Exp();
	 }
	 
	 public void ajaxComplete()
	 {
		 asynchronousWaitUtil.ajaxComplete();
	 }
	 
	 public void waitUntilJSReady()
	 {
		 asynchronousWaitUtil.waitUntilJSReady();
	 }
	 
	 public void waitUntilJQueryReady()
	 {
		 asynchronousWaitUtil.waitUntilJQueryReady();
	 }
	 
	 public void waitUntilAngularReady()
	 {
		 asynchronousWaitUtil.waitUntilAngularReady();
	 }
	 
	 public boolean waitUntilAngular5Ready()
	 {
		 return asynchronousWaitUtil.waitUntilAngular5Ready();
	 }
	 
	 public void addSecondaryPaddedWait()
	 {
		 asynchronousWaitUtil.addSecondaryPaddedWait();
	 }
	 
	 public void addPaddedWait(int seconds) 
	 {
		 asynchronousWaitUtil.addPaddedWait(seconds);
	 }
	 
	 public void addPaddedWaitPro(int seconds) throws InterruptedException 
	 {
		 asynchronousWaitUtil.addPaddedWaitPro(seconds);
	 }
	 
	 
	 /****************************** ScrollUtilities Methods ****************************************/
	 
	 public void scroll(int pixel)
	 {
		 scrollUtilities.scroll(pixel);
	 }
	 
	 public void scroll(String position) 
	 {
		 scrollUtilities.scroll(position); 
	 }
	 
	 public WebElement scrollToElement(WebElement element) 
	 {
		 return scrollUtilities.scrollToElement(element); 
	 }
	 
	 public WebElement scrollHorizontallyInsideElement(WebElement element, int pixel) 
	 {
		 return scrollUtilities.scrollHorizontallyInsideElement(element, pixel);
	 }
	 
	 public WebElement scrollVerticallyInsideElement(WebElement element, int pixel) 
	 {
		 return scrollUtilities.scrollVerticallyInsideElement(element, pixel);
	 }
	 
	 public void scrollToElementAndClick(WebElement element) throws Exception
	 {
		 scrollUtilities.scrollToElementAndClick(element);
	 }
	 
	 /**
	 *
	 * Prints Test case scenario in logger and console
	 *
	 */
	public void scenario(String scenario) 
	{
		printUtility.scenario(scenario);
	}

	/**
	 *
	 * Prints Scenario pass status in logger
	 *
	 */
	public void scenarioPass() 
	{
		printUtility.scenarioPass();
	}

	/**
	 *
	 * Prints Scenario pass status in logger
	 *
	 */
	public void scenarioFail() 
	{
		printUtility.scenarioFail();
	}

	/**
	 *
	 * Prints Test case fail status in logger
	 *
	 */
	public void logFail(String message) 
	{
		printUtility.logFail(message);
	}


	/**
	 *
	 * Prints Warning Message to the Console Log and Report
	 *
	 */
	public void logWarn(String message) 
	{
		printUtility.logWarn(message);
	}

	/**
	 *
	 * Prints Skip event status in logger in console and report
	 *
	 */
	public void logSkip(String message) 
	{
		printUtility.logSkip(message);
	}

	/**
	 *
	 * Prints Test case pass status in logger
	 *
	 */
	public void logPass(String message) 
	{
		printUtility.logPass(message);
	}

	/**
	 *
	 * Prints Information in between steps or logs in Extent Report
	 *
	 */
	public void logInfoReport(String message) 
	{
		printUtility.logInfoReport(message);
	}
	
	/**
	 *
	 * Prints Information in between steps or logs in Console
	 *
	 */
	public void logInfo(String message) 
	{
		printUtility.logInfo(message);
	}
	
	/**
	 *
	 * Prints Information in between steps or logs.
	 *
	 */
	public void logInfoMessage(String url, String report_filepath) {
		System.out.println(ConsoleColors.Info_turquoise + "\nInfo: " + url + ConsoleColors.RESET);
		extentListener.logInfoMessage("\nInfo: " + url, report_filepath);
	}


	/**
	 *
	 * Prints Test case fail status in logger
	 *
	 */
	public void logStep(String message) 
	{
		printUtility.logStep(message);
	}

	/**
	 *
	 * Assigns category of test case Type. Example: Sanity/Functional
	 * Testing/Regression
	 * 
	 * @param String
	 */
	public void category(String category) 
	{
		printUtility.category(category);
	}

	 public void printWaitTime(String waitMethodType, long time, By locator)
	 {
		 printUtility.printWaitTime(waitMethodType, time, locator);
	 }
	 
	 public void printWaitTime(String waitMethodType, long time, String msg, By locator)
	 {
		 printUtility.printWaitTime(waitMethodType, time, msg, locator);
	 }
	 
	 public void printWaitTime(String waitMethodType, long time)
	 {
		 printUtility.printWaitTime(waitMethodType, time);
	 }
	 
	 
	 public void sendKeys(WebElement element,String text)
	 {
		 actionEngine.sendKeys(element, text);
	 }
	 
	 public void clickElement(WebElement element) throws Exception
	 {
		 actionEngine.clickElement(element);
	 }
	 
	 public void clear(WebElement element)
	 {
		 actionEngine.clear(element);
	 }
	 
	 public void moveToElementAndHover(WebElement element)
	 {
		 actionEngine.moveToElementAndHover(element);
	 }
	 
	 public boolean isElementPresent(WebElement element)
	 {
		 return actionEngine.isElementPresent(element);
	 }
	 
	 public String getText(WebElement element)
	 {
		 return actionEngine.getText(element);
	 }
	 
	 
	 public void jsClick(WebElement element)
	 {
		 actionEngine.jsClick(element);
	 }
	 
	 
	 public void pressKeyCombination(int key1,int key2,int key3) throws AWTException
	 {
		 actionEngine.pressKeyCombination(key1, key2, key3);
	 }
	 
	 public void click(int x, int y) throws AWTException
	 {
		 actionEngine.click(x, y);
	 }
	 
	 
	 
	 /****************************** RandomUtilities Methods ****************************************/
	 
	 public int generateRandomNumber(int minNumber, int maxNumber)
	 {
		 return generateRandomNumber(minNumber, maxNumber);
	 }
	 
	 
	 public void GenerateLightHouseReport() throws IOException, AWTException, InterruptedException
	 {
		 lightHouseUtil.GenerateLightHouseReport();
	 }
	 
	 public String  getLightHouseReport(String URL, String portNumber) throws IOException, AWTException, InterruptedException
	 {
		 return lightHouseUtil.getLightHouseReport(URL, portNumber);
	 }
	 
	 
	 
	 
	 
	 /****************************** BrwoserUtilities Methods ****************************************/
	 
	/**
	 * 
	 * Creates a new browser tab and switches the focus for future commands of this driver to the new tab.
	 * 
	 * @since 11/11/2021
	 * @author Nikhil Singh
	 */
	public void openNewTab()
	{
		browserUtilities.openNewTab();
	}
		
	/**
	 * 
	 * Creates a new browser window and switches the focus for future commands of this driver to the new window.
	 * 
	 */
	public void openNewWindow()
	{
		browserUtilities.openNewWindow();
	}
	
	/**
	 *
	 * Switch to tab with respect to index position of Opened tab (0th Index -> 1st Tab).
	 *
	 */
	public void switchToTab(int tabIndexPosition) 
	{
		browserUtilities.switchToTab(tabIndexPosition);
	}
	
	 /**
	 *
	 * close tab with respect to index position of tab (0th Index -> 1st Tab).
	 *
	 */
	public void closeTab(int tabIndexPosition) 
	{
		browserUtilities.closeTab(tabIndexPosition);
	}
		
		
	 /**
	 *
	 * Bring current window in focus.
	 *
	 */	
	public void focusCurrentWindow() 
	{
		browserUtilities.focusCurrentWindow();
	}
	
	/**
	 *
	 * Refresh browser web page of current tab.
	 *
	 */	
	public void refreshScreen() throws Exception 
	{
		browserUtilities.refreshScreen();
	}
	
	
	/**
	 *
	 * duplicate the current focused browser tab.
	 *
	 */	
	public String duplicateTab() throws Exception 
	{
		return browserUtilities.duplicateTab();
	}
	
	
	
	
	 /****************************** DevTool Utilities Methods ****************************************/
	
	/**
	 *
	 * Get Page Load Time.
	 *
	 */	
	public void getPageLoadTime(String URL)
	{
		devToolUtilities.getPageLoadTime(URL);
	}
	
	/**
	 *
	 * Get Performance.
	 *
	 */	
	public void getPerformance(String URL)
	{
		devToolUtilities.getPerformance(URL);
	}
	
	/**
	 *
	 * Get Performance.
	 *
	 */	
	public void getResponce(String URL)
	{
		devToolUtilities.getResponce(URL);
	}
	
	/**
	 *
	 * Get Performance.
	 *
	 */	
	public void getToken(String URL)
	{
		devToolUtilities.getToken(URL);
	}
	
}
