package pageObjects;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;


public class Parameter_Page extends BasePage{
	
//	String FilePath = ConstantUtils.TestData_Parameter;
	
	/************ Locators ********************/
	
	@FindBy(how = How.XPATH, using = "//*[@id='tabParameters']//a")
	public WebElement parameterTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='DealcurrencyId']")
	public WebElement NDSP_DealcurrencyId;

	@FindBy(how = How.XPATH, using = "//*[@id='uldealcurrency']/li")
	public List<WebElement> NDSP_Currencyoptions;

	@FindBy(how = How.XPATH, using = "//*[@id='StartDate']//button[contains(@class,'btnpicker')]")
	public WebElement NDSP_StartDateBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='EndDate']//button[contains(@class,'btnpicker')]")
	public WebElement NDSP_EndDateBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='RiskProfileId']")
	public WebElement NDSP_RiskProfileId;

	@FindBy(how = How.XPATH, using = "//*[@id='RiskProfileId']/following::ul[1]/li/a") // *[@id='solutionParameteresID']/div[2]/div[2]/div/div[2]/div/div/ul/li"));
	public List<WebElement> NDSP_RiskProfileOptions;

	@FindBy(how = How.XPATH, using = "//*[@id='publicSector']")
	public WebElement NDSP_publicSector;

	@FindBy(how = How.XPATH, using = " //*[@id='ul-Publicsector']/li") // *[@id='solutionParameteresID']/div[2]/div[2]/div/div[2]/div/div/ul/li"));
	public List<WebElement> NDSP_PublicSectorOptions;

	@FindBy(how = How.XPATH, using = "//*[@id='MaturityId']")
	public WebElement NDSP_MaturityId;

	@FindBy(how = How.XPATH, using = "//*[@id='MaturityId']/following::ul[1]/li") // *[@id='solutionParameteresID']/div[2]/div[2]/div/div[2]/div/div/ul/li"));
	public List<WebElement> NDSP_MaturityOPtions;

	@FindBy(how = How.XPATH, using = "//*[@id='ComplexityId']")
	public WebElement NDSP_ComplexityId;

	@FindBy(how = How.XPATH, using = "//*[@id='ComplexityId']/following::ul[1]/li") // *[@id='solutionParameteresID']/div[2]/div[2]/div/div[2]/div/div/ul/li"));
	public List<WebElement> NDSP_ComplexityOptions;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@id,'countryNm')]")
	public WebElement NDSP_CountryName;

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'countryPct')]")
	public WebElement NDSP_CountryPct;

	@FindBy(how = How.XPATH, using = "//input[@id='countryPct']/parent::td//following-sibling::td//a")
	public WebElement NDSP_AddCountry_btn;

	@FindBy(how = How.XPATH, using = "//button[@id='btnsave']")
	public WebElement NDSP_Savebtn;
	

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Sum of Offshore countries should be 100')]")
	public WebElement NDSP_Errormsg_offshore;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Sum of  countries should be 100')]")
	public WebElement NDSP_Errormsg_onshore;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'onshore-table-wrapper')]/table/tbody/tr/td[contains(text(), 'Offshore')]/following-sibling::td[1]")
	public List<WebElement> NDSP_OffshorePer;

	@FindBy(how = How.XPATH, using = "//*[@id='successErrorMsgId']/span")
	public WebElement NDSP_Save_OR_ErrorMsg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='FTEVariantId']")
	public WebElement FTEVariantDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lblFTEVariant']/following-sibling::div//ul//li[2]")
	public WebElement FTEVariantOptionTwo;
	
	@FindBy(how = How.XPATH, using = "//button[@id='PublicSectorId']")
	public WebElement publicSectorBtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'auto-search-result')]//li[contains(.,'India') and not(contains(.,'British India') )]")
	public WebElement searchCountryList;
	
	
	
	

	
	
	public Parameter_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void NavigateToParameter() throws Exception{
		
		waitForElementToAppear(parameterTab);
		waitForElementToBeVisible(parameterTab);
		jse.executeScript("arguments[0].scrollIntoView(true);", parameterTab);
		Navigate_to_Screen(GlobalScreen.PARAMETERS);	
		app_loader(getDriver().findElement(By.id("ng-loaderimgP")));
		
	}
	

	/**
	 * TC_26: Validate if the SA is able to fill the input fields like Start Date,End Date Deal Currency and Onshore/offshore split, etc and save the screen.
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
	public void fillData_ParameterScreen(String FilePath) throws Exception{
		
		selectDealCurrency(FilePath);
		String CurrencyValue = SetExcelPath(FilePath, "NewDSPTestData", 10, 0);
		logInfo("Currency Value from Excel "+CurrencyValue);
		waitForElementToBeVisible(NDSP_DealcurrencyId);
		String selected_Currency = getText(NDSP_DealcurrencyId);
		if(!selected_Currency.trim().contains(CurrencyValue.trim()))
		{
			logInfo("Currency is not selected. Retrying");
			selectDealCurrency(FilePath);
			waitForElementToBeVisible(NDSP_DealcurrencyId);
			selected_Currency = getText(NDSP_DealcurrencyId);
			if(!selected_Currency.trim().contains(CurrencyValue.trim()))
			{
				logFail("Currency is not selected.");
			}
			else
			{
				logInfo("Currency is selected.");
			}
		}

//		addDate(FilePath, "NewDSPTestData", 13);
		
		String Startdate = SetExcelPath(FilePath, "NewDSPTestData", 13, 0);
		String Enddate = SetExcelPath(FilePath, "NewDSPTestData", 13, 1);
		waitForElementToBeVisible(NDSP_StartDateBtn);
		clickElement(NDSP_StartDateBtn);
		DatePicker(Startdate);
		logInfo("DSP Screen:User able to select Startdate Successfully");
		waitForElementToBeVisible(NDSP_EndDateBtn);
		waitForElementClickable(NDSP_EndDateBtn);
		clickElement(NDSP_EndDateBtn);
		DatePicker(Enddate);
		
		clickElement(NDSP_RiskProfileId);
		int RiskProfileCount = NDSP_RiskProfileOptions.size();
		String RiskValue = SetExcelPath(FilePath, "NewDSPTestData", 17, 2);
		scroll("bottom");
		for (int i = 0; i < RiskProfileCount; i++) {
			if (getText(NDSP_RiskProfileOptions.get(i)).equalsIgnoreCase(RiskValue)) {
				
				jsClick(NDSP_RiskProfileOptions.get(i));
				logInfo("Risk is Profileselected");
				break;
			}
		}
		if(!publicSectorBtn.getAttribute("class").contains("disabled"))
		{		
			clickElement(NDSP_publicSector);
			int publicSectorCount = NDSP_PublicSectorOptions.size();
			String publicSectorValue = SetExcelPath(FilePath, "NewDSPTestData", 17, 4);
			for (int i = 0; i < publicSectorCount; i++) 
			{
				if (getText(NDSP_PublicSectorOptions.get(i)).equalsIgnoreCase(publicSectorValue)) 
				{
					clickElement(NDSP_PublicSectorOptions.get(i));
					logInfo("PublicSector is selected");
					break;
				}
			}
		}
		
		fill_AM_Model_dropdown(FilePath);
		fill_AD_TestingModel_dropdown(FilePath);
		Add_Countries(FilePath);

		
	}
	
	public void selectDealCurrency(String FilePath) throws Exception
	{
		expandDropdown(NDSP_DealcurrencyId);
		int CurrencyCount = NDSP_Currencyoptions.size();
		String CurrencyValue = SetExcelPath(FilePath, "NewDSPTestData", 10, 0);
		scroll("top");
		scroll(100);
		for (int i = 0; i < CurrencyCount; i++) 
		{
			if (getText(NDSP_Currencyoptions.get(i)).trim().contains(CurrencyValue.trim())) 
			{
				scrollToElement(NDSP_Currencyoptions.get(i));
				clickElement(NDSP_Currencyoptions.get(i)); 
				break;
			}
		}
		closeExpandDropdown(NDSP_DealcurrencyId);
	}
	
	public void addDate(String FilePath, String sheetName, int row) throws Exception{
		String Startdate = SetExcelPath(FilePath,sheetName, row, 0);
		String Enddate = SetExcelPath(FilePath, sheetName, row, 1);
		waitForElementToBeVisible(NDSP_StartDateBtn);
		jsClick(NDSP_StartDateBtn);
		DatePicker(Startdate);
		logInfo("DSP Screen:User able to select Startdate Successfully");
		waitForElementToBeVisible(NDSP_EndDateBtn);
		waitForElementClickable(NDSP_EndDateBtn);
		jsClick(NDSP_EndDateBtn);
		DatePicker(Enddate);
		
		NDSP_Savebtn.click();
		alertclick();
		waitForElementToBeVisible(NDSP_Save_OR_ErrorMsg);
		loader();
	}
	
	public void DatePicker(String date) throws Exception 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date Currentdate = new Date();
		String Currentdate_String = dateFormat.format(Currentdate);
		String[] Split = Currentdate_String.split("-");
		int Current_yr = Integer.parseInt(Split[0]);
		int Current_mont = Integer.parseInt(Split[1]);
		logInfo(Split[0] + "\n" + Split[1] + "\n" + Split[2]);

		// button to move prev year in calendar
		WebElement prev_yr_btn = getDriver().findElement(By.xpath("//*[@aria-label = 'Previous Year']"));

		// button to click in center of year calendar header
		WebElement yr_label = getDriver().findElement(By.xpath("//button[@class = 'headerlabelbtn yearlabel']"));

		// button to move next year in calendar
		WebElement next_yr_btn = getDriver().findElement(By.xpath("//*[@aria-label = 'Next Year']"));

		// button to move prev month in calendar
		WebElement prev_month_btn = getDriver().findElement(By.xpath("//*[@aria-label = 'Previous Month']"));

		// button to click in center of month calendar header
		WebElement month_label = getDriver().findElement(By.xpath("//*[@class = 'headerlabelbtn monthlabel']"));

		// button to move next month in calendar
		WebElement Next_month_btn = getDriver().findElement(By.xpath("//*[@aria-label = 'Next Month']"));

		String date_MM_dd_yyyy[] = date.split("/");

		// get the year difference between current year and year to set in calendar	
		int yearDiff = Integer.parseInt(date_MM_dd_yyyy[2]) - Integer.parseInt(yr_label.getText());

		if (yearDiff != 0) 
		{
			// if you have to move next year
			if (yearDiff > 0) 
			{
				for (int i = 0; i < yearDiff; i++) 
				{
					logInfo("Year Diff->" + i);
					next_yr_btn.click();
				}
			}
			// if you have to move previous year
			else if (yearDiff < 0) 
			{
				for (int i = 0; i < (yearDiff * (-1)); i++) 
				{
					logInfo("Year Diff->" + i);
					prev_yr_btn.click();
				}
			}
		}

		waitForElementToBeVisible(month_label);
		clickElement(month_label);

		List<WebElement> list_AllMonthToBook = getDriver()
				.findElements(By.xpath("//*[contains(@class, 'monthvalue')]"));
		WebElement month = list_AllMonthToBook.get(Integer.parseInt(date_MM_dd_yyyy[0]) - 1);
		
		Actions actions = new Actions(getDriver());
		actions.moveToElement(month).click().perform();

		List<WebElement> list_AllDate = getDriver()
				.findElements(By.xpath("//*[contains(@class , 'datevalue currmonth')]"));
		String r = "//Span[contains(text()," + Integer.parseInt(date_MM_dd_yyyy[1])
		+ ")]/preceding::div[@class = 'datevalue currmonth']";
		List<WebElement> list_DateToBook = getDriver().findElements(By.xpath(r));
		System.out.println(list_DateToBook.size());
		clickElement(list_AllDate.get(Integer.parseInt(date_MM_dd_yyyy[1]) - 1));
		System.out.println(Integer.parseInt(date_MM_dd_yyyy[1]));
	}
	
	public void fill_AD_TestingModel_dropdown(String FilePath) throws Exception {
		clickElement(NDSP_ComplexityId);
		int ComplexityCount = NDSP_ComplexityOptions.size();
		String ComplexityValue = "Skill Tier 2";//SetExcelPath(FilePath, "NewDSPTestData", 17, 1);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.scrollBy(0,450)", "");
		for (int i = 0; i < ComplexityCount; i++) {
			if (getText(NDSP_ComplexityOptions.get(i)).contains(ComplexityValue)) {
				clickElement(NDSP_ComplexityOptions.get(i));
				logInfo("AD/Testing skill tier is selected");
				break;
			}
		}
	}


	public void fill_AM_Model_dropdown(String FilePath) throws Exception {
		clickElement(NDSP_MaturityId);
		int MaturityCount = NDSP_MaturityOPtions.size();
		String MaturityValue = "Skill Tier 1";//SetExcelPath(FilePath, "NewDSPTestData", 17, 3);
		for (int i = 0; i < MaturityCount; i++) 
		{
			String temp = getText(NDSP_MaturityOPtions.get(i));
			if (temp.contains(MaturityValue)) 
			{
				jsClick(NDSP_MaturityOPtions.get(i));
				logInfo("AM Skill tier is selected");
				break;
			}
		}
	}
	
	
	public void Add_Countries(String FilePath) throws Exception {

		boolean scenarioFlag = true;
	
		FileInputStream fileinput = new FileInputStream(FilePath);
		XSSFWorkbook wb1 = new XSSFWorkbook(fileinput);
		XSSFSheet sheet = wb1.getSheet("NewDSPTestData");
		XSSFRow row_offshore = sheet.getRow(1);
		XSSFRow row_onshore = sheet.getRow(2);
		logInfo(row_offshore.getPhysicalNumberOfCells() + " " + row_onshore.getPhysicalNumberOfCells());
		
		int i;
		String Country;
		String Percentage;
		jse.executeScript("window.scrollBy(0,250)", "");
		for (i = 1; i < row_offshore.getPhysicalNumberOfCells(); i++) {
			String Text = "";
			try {
				Text = row_offshore.getCell(i).toString();
			} catch (Exception e) {
				Text = "";
			}
			if (Text.equals("") || Text.equals(null))
				break;

			Country = row_offshore.getCell(i).toString().split("-")[0].trim();
			Percentage = row_offshore.getCell(i).toString().split("-")[1];
			double sum_percentage = 0;
			double temp = 0;
			if (i == 1) {
				sendKeys(NDSP_CountryName,Country);

				if (Country.equals("India")) 
				{
//					By search_result_list = By.xpath("//div[contains(@class,'auto-search-result')]//li[contains(.,'India') and not(contains(.,'British India') )]");
//					waitForElementToAppear(search_result_list);
					waitForElementToAppear(searchCountryList);
					clickElement(searchCountryList);
//					clickElement(getDriver().findElement(By.xpath(
//							"//div[contains(@class,'auto-search-result')]//li[contains(.,'India') and not(contains(.,'British India') )]")));
				} 
				else 
				{
					By search_result_list = By.xpath("//div[contains(@class,'auto-search-result')]//li[contains(.,'" + Country + "')]");
					waitForElementToAppear(search_result_list);
					clickElement(getDriver().findElement(By.xpath(
							"//div[contains(@class,'auto-search-result')]//li[contains(.,'" + Country + "')]")));
				}
				clickElement(NDSP_CountryPct);
				clear(NDSP_CountryPct);
				sendKeys(NDSP_CountryPct,Percentage);
				clickElement(NDSP_AddCountry_btn);
				double per = Double.parseDouble(Percentage);
				if (per > 100.0) {
					boolean value = NDSP_Errormsg_offshore.isDisplayed();
					if (value == true) {
						logPass("Sum of Offshore countries should be 100 error message is displayed");
					} else {
						logFail("Sum of Offshore countries should be 100 error message is not displayed");
						scenarioFlag = false;
					}
				}
				
			} else {
				sendKeys(NDSP_CountryName,Country);
				if (Country.equals("India")) {
					clickElement(searchCountryList);
//					clickElement(getDriver().findElement(By.xpath(
//							"//div[contains(@class,'auto-search-result')]//li[contains(.,'India') and not(contains(.,'British India') )]")));
				} else {
					clickElement(getDriver()
							.findElement(By.xpath(
									"//div[contains(@class,'auto-search-result')]//li[contains(.,'" + Country + "')]")));
				}

				clickElement(NDSP_CountryPct);
				clear(NDSP_CountryPct);
				sendKeys(NDSP_CountryPct,Percentage);
				clickElement(NDSP_AddCountry_btn);
				for (int y = 0; y < NDSP_OffshorePer.size(); y++) {
					String sum_percentage_ = getText(NDSP_OffshorePer.get(y));
					temp = Double.parseDouble(sum_percentage_);
					sum_percentage = temp + sum_percentage;
				}
				if (sum_percentage > 100.0) {
					boolean value = NDSP_Errormsg_offshore.isDisplayed();
					if (value == true) {
						logPass("Sum of Offshore countries should be 100 error message is displayed");
					} else {
						logFail("Sum of Offshore countries should be 100 error message is not displayed");
						scenarioFlag = false;
					}
				}
			}
		}
		System.out.print(row_onshore.getPhysicalNumberOfCells());
		
		for (i = 1; i < row_onshore.getPhysicalNumberOfCells(); i++) {

			String Text = "";
			try {
				Text = row_onshore.getCell(i).toString();
			} catch (Exception e) {
				Text = "";
			}
			if (Text.equals("") || Text.equals(null))
				break;
			Country = row_onshore.getCell(i).toString().split("-")[0];
			Percentage = row_onshore.getCell(i).toString().split("-")[1];
			double sum_percentage = 0;
			double temp = 0;
			if (i == 1) {
				sendKeys(NDSP_CountryName,Country);
				if (Country.equals("India")) {
					clickElement(searchCountryList);
//					clickElement(getDriver().findElement(By.xpath(
//							"//div[contains(@class,'auto-search-result')]//li[contains(.,'India') and not(contains(.,'British India') )]")));
				} else {
					clickElement(getDriver()
							.findElement(By.xpath(
									"//div[contains(@class,'auto-search-result')]//li[contains(.,'" + Country + "')]")));
				}
				clickElement(NDSP_CountryPct);
				clear(NDSP_CountryPct);
				sendKeys(NDSP_CountryPct,Percentage);
				clickElement(NDSP_AddCountry_btn);
				double per = Double.parseDouble(Percentage);
				if (per > 100) {
					boolean value = NDSP_Errormsg_onshore.isDisplayed();

					if (value == true) {

						logPass("DSP Screen:Sum of Onshore countries should be 100, error message is displayed");
					} else {
						logFail("DSP Screen:Sum of Onshore countries should be 100, error message is not displayed");
						scenarioFlag = false;
					}

				}
			} else {
				sendKeys(NDSP_CountryName,Country);
				if (Country.equals("India")) {
					clickElement(searchCountryList);
//					clickElement(getDriver().findElement(By.xpath(
//							"//div[contains(@class,'auto-search-result')]//li[contains(.,'India') and not(contains(.,'British India') )]")));
				} else {
					clickElement(getDriver()
							.findElement(By.xpath(
									"//div[contains(@class,'auto-search-result')]//li[contains(.,'" + Country + "')]")));
				}
				clickElement(NDSP_CountryPct);
				clear(NDSP_CountryPct);
				sendKeys(NDSP_CountryPct,Percentage);
				clickElement(NDSP_AddCountry_btn);
				for (int p = 0; p < NDSP_OffshorePer.size(); p++) {
					String sum_percentage_ = getText(NDSP_OffshorePer.get(p));
					temp = Double.parseDouble(sum_percentage_);
					sum_percentage = temp + sum_percentage;
				}
				if (sum_percentage > 100.0) {
					boolean value = NDSP_Errormsg_onshore.isDisplayed();

					if (value == true)
						logPass("DSP Screen:Sum of Onshore countries should be 100, error message is displayed");
					else {
						logFail("DSP Screen:Sum of Onshore countries is not 100, error message is displayed");
						scenarioFlag = false;
					}

				}
			}			
			if (i == 1) {
				if (Country.equalsIgnoreCase("USA")) {
					clickElement(FTEVariantDrpdwn);
					waitForElementToBeVisible(FTEVariantOptionTwo);
					jsClick(FTEVariantOptionTwo);
				}
			}
		}			
	
		NDSP_Savebtn.click();
		alertclick();
		waitForElementToBeVisible(NDSP_Save_OR_ErrorMsg);
		if (NDSP_Save_OR_ErrorMsg.getAttribute("title").equalsIgnoreCase("Solution Paramenters Saved Successfully.")) {
			logPass("Solution Parameters saved successfully");
		}
		else {
			logFail("Solution Parameters was not saved successfully");
		}
		jse.executeScript("scroll(0, -250);");
		logInfo("Passed:User able to save  parameters Successfully");

		if (scenarioFlag = true)
			scenarioPass();
		else
			scenarioFail();

	}
	
	public void alertclick() throws InterruptedException {
		int j = 1;
		for (int i = 1; i <= j; i++) {
			boolean status = isAlertPresent();

			if (status == true) {
				addPaddedWait(1);
				Alert deliverableAlert = getDriver().switchTo().alert();
				deliverableAlert.accept();
				j++;
			}

		}
		getDriver().switchTo().defaultContent();

	}
	
	public boolean isAlertPresent() {
		try {
			getDriver().switchTo().alert();
			return true;
		}
		catch (NoAlertPresentException Ex) {
			return false;
		}
	}





}
