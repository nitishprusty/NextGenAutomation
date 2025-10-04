package pageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.ConstantUtils;
import reusableComponents.ExcelUtilities;

import java.io.File;
import java.lang.ProcessHandle.Info;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class PriceInput_Page extends BasePage {

	@FindBy(how = How.XPATH, using = "//div[@class = 'next-img']")
	public WebElement Next_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='applyPricing']//a")
	public WebElement PricingInput_Link;

	@FindBy(how = How.XPATH, using = "//*[@id='anchDealWidePricing']")
	public WebElement DealWide_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='anchDealWidePricing']/..")
	public WebElement DealWideTab_List;

	@FindBy(how = How.XPATH, using = "//*[@id= 'anchPricingByGroup']")
	public WebElement Group_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id= 'anchPricingByGroup']/..")
	public WebElement GroupTab_List;

	@FindBy(how = How.XPATH, using = "//*[@id= 'anchPricingByEP']")
	public WebElement EconomicProfile_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id= 'anchPricingByEP']/..")
	public WebElement EconomicProfileTab_List;

	@FindBy(how = How.XPATH, using = "//*[@id='impexpanchorTab']")
	public WebElement ExportImport_Tab;

	@FindBy(how = How.XPATH, using = "//div[@id='istransitionBillable']//span[contains(@class,'switch-label')]")
	public WebElement Transition_SwitchLabel;

	@FindBy(how = How.XPATH, using = "//div[@id='istransitionBillable']//input[contains(@class,'switch-input')]")
	public WebElement Transition_checkbox;

	@FindBy(how = How.XPATH, using = "//*[@id='errorConfig']")
	public WebElement PricingDealWideSave_Status;

	@FindBy(how = How.XPATH, using = "//button[@id='selectedBillingTypeId']")
	public WebElement PricingSubType_Btn;

	@FindBy(how = How.XPATH, using = "//ul[@id='ulselectedBillingType']//a")
	public List<WebElement> PricingSubType_List;

	@FindBy(how = How.XPATH, using = "//div[@id='targetOrCustomSwitch']//span[contains(@class,'switch-label')]")
	public WebElement MarginType_SwitchLabel;

	@FindBy(how = How.XPATH, using = "//*[@id='targetOrCustomSwitch']//input[contains(@class,'switch-input')]")
	public WebElement MarginType_Checkbox;

	@FindBy(how = How.XPATH, using = "//div[@id='dealWide']//em[text() = 'Save']")
	public WebElement DealWideSave_btn;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveAndContinuePricing']/em")
	public WebElement SaveandContinue_btn;

	@FindBy(how = How.XPATH, using = "//div[@id='Navdialog']//span[text() = '×']")
	public WebElement AlertClose_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='SaveAndContinuePricingNav']/em")
	public WebElement AlertOkbtn;

	@FindBy(how = How.XPATH, using = "//*[@id='targetOrCustomSwitch']//label[@class = 'text-left']")
	public WebElement MarginType_txt;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'Y1']//input")
	public WebElement SDY01_InputBox;

	@FindBy(how = How.XPATH, using = "//*[@id='errorConfig']")
	public WebElement Status_msg;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ag-row-even')]//div[@col-id = 'M1']//input")
	public WebElement Transition_input;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ag-row-odd')]//div[@col-id = 'M1']//input")
	public WebElement Service_Delivery_input;

	@FindBy(how = How.XPATH, using = "//*[@id='dealWide']/section[contains(@class,'carousel-grid')]//span[contains(@class,'switch-label')]")
	public WebElement DealWideRipple_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='dealWide']/section[contains(@class,'carousel-grid')]//span[contains(@class,'switch-label')]/../input")
	public WebElement DealWideRipple_CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='pricingbygridid']//span[contains(@class,'switch-label')]")
	public WebElement RippleToggle_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='pricingbygridid']//span[contains(@class,'switch-label')]/..//input")
	public WebElement Ripple_CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='AOPricingByGroup']//div[@ref = 'gridPanel']")
	public WebElement GridPanel;

	@FindBy(how = How.XPATH, using = "//*[@id='SaveAndContinuePricingNav']/em")
	public WebElement AlertOk_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='SaveConfirmPricing']/em")
	public WebElement AlertOkChangingData_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='errorPricebygroup']")
	public WebElement PricingGroupSave_Status;

	@FindBy(how = How.XPATH, using = "//*[@id='group']//em[text() = 'Save']")
	public WebElement PricingGroupSave_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='group']//p[contains(@class ,'mms-data')]")
	public WebElement End_txt;

	@FindBy(how = How.XPATH, using = "//*[@id='AOEconomicProfile']//div[@role = 'grid']")
	public WebElement EconomicProfile_Grid;

	@FindBy(how = How.XPATH, using = "//*[@id='economicProfile']//em[text() = 'Save']")
	public WebElement EconomicProfile_Save;

	@FindBy(how = How.XPATH, using = "//*[@id='errorPriceByEconominProfile']")
	public WebElement EconomicProfile_SaveStatus;

	@FindBy(how = How.XPATH, using = "//*[@id='pricingByEpId']//span[contains(@class,'switch-label')]")
	public WebElement EconomicProfileRipple_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='pricingByEpId']//span[contains(@class,'switch-label')]/../input")
	public WebElement EconomicProfileRipple_CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='expbtn']//a[@title = 'Export Pricing File']//img")
	public WebElement Export_Btn;

	@FindBy(how = How.XPATH, using = "//a[@id = 'importPricingID2']//img")
	public WebElement Import_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='errorPriceByEconominProfile']")
	public WebElement Confirmation_Label;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'expimpstatusdesc']//a")
	public WebElement ExpImpStatus_Desc;

	@FindBy(how = How.XPATH, using = "//*[@id='SG']")
	public WebElement ServiceGroup;

	@FindBy(how = How.XPATH, using = "//*[@id='btnappdealdetail']//div[contains(@class,'breadcrumb-right')]")
	public WebElement DataContent;

	@FindBy(how = How.XPATH, using = "//*[@id='files_Pricing2']")
	public WebElement Browsefile;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'PricingOption' and contains(@class,'dropdown-cell')]//span//span")
	public List<WebElement> Total_Groups;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'PricingOptionEP' and contains(@class,'dropdown-cell')]//span//span")
	public List<WebElement> Total_EP;

	@FindBy(how = How.XPATH, using = "//div[@id = 'divImportPricingcls2']//button[@id='btnImprtPricing' and text() = 'OK']")
	public WebElement ImportOk_Btn;

	@FindBy(how = How.XPATH, using = "//div[@row-index = '1']//div[@col-id = 'FileNm']//span")
	public WebElement ImportedFile_Sec;

	@FindBy(how = How.XPATH, using = "//div[@row-index = '0']//div[@col-id = 'FileNm']//a//img")
	public WebElement ExportedFileDownload_Btn;

	@FindBy(how = How.XPATH, using = "//div[@row-index = '0']//div[@col-id = 'expimpstatusdesc']//span//span")
	public WebElement ExportStatus_Desc;

	@FindBy(how = How.XPATH, using = "//div[@row-index = '1']//div[@col-id = 'expimpstatusdesc']//span//span")
	public WebElement ImportStatus_Desc;

	@FindBy(how = How.XPATH, using = "//*[@id='mat-dialog-0']//em")
	public WebElement IUnderStand_Btn;
	
	@FindBy(how = How.XPATH, using = "//div[@row-index = '0']//div[@col-id = 'FileNm']//span")
	public WebElement FileName;
	
	@FindBy(how = How.XPATH, using = "//div[@id='istransitionBillable']//div[@class='flex_row']//span[text()='No']")
	public WebElement toggle_NO;
	

	Actions actions = new Actions(getDriver());

	Random random;
	Select select;

	public PriceInput_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	/*
	 * Method to handle pop up while switching between sub tabs in pricing input
	 * screen
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @since 07/03/2024
	 */
	public void handleAlertPopup() throws Exception {
		waitForElementToAppear(AlertOk_btn);
		waitForElementToBeVisible(AlertOk_btn);
		clickElement(AlertOk_btn);
	}

	/**
	 * TC_92: Validate if the SA is able to login as SA at MyISP Next Gen Platform.
	 * 
	 * @since 07/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 */

	public void validatePricingInputPage() throws Exception {

		boolean scenarioFlag = false;
		String pricingInputCol = "";

		waitForElementToBeVisible(Next_Btn);
		clickElement(Next_Btn);
		waitForElementToBeVisible(PricingInput_Link);
		clickElement(PricingInput_Link);
		loader();
		pricingInputCol = PricingInput_Link.getCssValue("color");
		boolean isPricingInputDisplayed = isDisplayed(PricingInput_Link);
		logInfo("Color of Pricing Input Link after it is clicked is " + pricingInputCol);

		if (isPricingInputDisplayed && pricingInputCol.equals("rgba(117, 0, 192, 1)")) {
			logPass("Succesfully Navigated to Pricing Input Page");
			scenarioFlag = true;
		} else {
			logFail("Failed to Navigate to Pricing Input Page ");
		}

		boolean isDealWideTabDisplayed = isDisplayed(DealWide_Tab);
		boolean isGroupTabDisplayed = isDisplayed(Group_Tab);
		boolean isEconomicProfileTabDisplayed = isDisplayed(EconomicProfile_Tab);
		boolean isExportImportTabDisplayed = isDisplayed(ExportImport_Tab);

		if (isDealWideTabDisplayed && isGroupTabDisplayed && isEconomicProfileTabDisplayed
				&& isExportImportTabDisplayed) {
			logPass("SA is able to see Deal Wide,group,Economic Profile and Export/Import Status tab");
		} else {
			logFail("SA is not able to see Deal Wide,group,Economic Profile and Export/Import Status tab");
			scenarioFlag = false;
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * TC_93: Valdiate if SA is able to save the pricing input type as Deal wide
	 * with Trans Billable as Yes/No, Pricing Sub-Type as Margin, Margin Type as
	 * Target/Custom.
	 * 
	 * @since 07/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 */

	public void validateDealWideForMarginSubType(String excelPath, String sheetname) throws Exception {

		boolean scenarioFlag = true;
		String pricingSubType = "";
		String transitionBillableClass = "";
		String MarginTypeClass = "";
		random = new Random();
		String data = "";
		String saveStatusTitle = "";
		String pricingSubTypeToBeSet = "";
		String dealWideListClass = "";

		/* Generate Random number between 1 to 6 */
		int randomNumber = random.nextInt(6) + 1;
		pricingSubTypeToBeSet = "Margin";
		data = ExcelUtilities.getExcelValue(excelPath, sheetname, randomNumber, 0);
		dealWideListClass = DealWide_Tab.getAttribute("aria-expanded");
		logInfo(dealWideListClass);
		clickElement(DealWide_Tab);
//		if (dealWideListClass.contains("false")) {
//			handleAlertPopup();
//		}
		try {
			handleAlertPopup();
		}catch(Exception e) {
			logInfo("Alert popup not present");
		}

		jse.executeScript("arguments[0].scrollIntoView(true);", PricingSubType_Btn);

		pricingSubType = getText(PricingSubType_Btn);
		transitionBillableClass = Transition_checkbox.getAttribute("class");

		if (!pricingSubType.equals("Margin")) {
			if (!isDisplayed(MarginType_Checkbox)) {
				commonActionForDealWide(pricingSubTypeToBeSet);
				clickElement(Transition_SwitchLabel);
				clickElement(MarginType_SwitchLabel);
				clickElement(SDY01_InputBox);
				SDY01_InputBox.clear();
				sendKeys(SDY01_InputBox, data);
				SDY01_InputBox.sendKeys(Keys.ENTER);
			} else {
				scenarioFlag = false;
			}
		} else {

			MarginTypeClass = MarginType_Checkbox.getAttribute("class");
			if ((!transitionBillableClass.contains("toggle_off") && !MarginTypeClass.contains("toggle_off")
					&& pricingSubType.equals("Margin"))
					|| (transitionBillableClass.contains("toggle_off") && !MarginTypeClass.contains("toggle_off")
							&& pricingSubType.equals("Margin"))) {
				commonActionForDealWide(pricingSubTypeToBeSet);
				clickElement(Transition_SwitchLabel);
				clickElement(MarginType_SwitchLabel);
			} else if ((transitionBillableClass.contains("toggle_off") && MarginTypeClass.contains("toggle_off"))
					|| (!transitionBillableClass.contains("toggle_off") && MarginTypeClass.contains("toggle_off")
							&& pricingSubType.equals("Margin"))) {
				commonActionForDealWide(pricingSubTypeToBeSet);
				clickElement(Transition_SwitchLabel);
				clickElement(MarginType_SwitchLabel);
				clickElement(SDY01_InputBox);
				SDY01_InputBox.clear();
				sendKeys(SDY01_InputBox, data);
				SDY01_InputBox.sendKeys(Keys.ENTER);
			} else {
				scenarioFlag = false;
			}
		}

		clickElement(DealWideSave_btn);
//		if (isDisplayed(AlertOkChangingData_btn)) {
//			clickElement(AlertOkChangingData_btn);
//		}
		
		
		try {
			waitForElementToAppear(AlertOkChangingData_btn);
			clickElement(AlertOkChangingData_btn);
			waitForElementToAppear(PricingDealWideSave_Status);
		}catch(Exception e) {
			logInfo("Pop up didnt came.");
		}

//		if (isDisplayed(PricingDealWideSave_Status)) {
			saveStatusTitle = PricingDealWideSave_Status.getAttribute("title");
			if (saveStatusTitle.equals("Margin saved successfully.")) {
				logPass("SA is able to save the pricing input type as Deal wide with Trans Billable as Yes/No, Pricing Sub-Type as Fixed Billing and Margin Type as Target/Custom.");
			} else {
				logFail("SA is not able to save the pricing input type as Deal wide with Trans Billable as Yes/No, Pricing Sub-Type as Fixed Billing and Margin Type as Target/Custom.");
				scenarioFlag = false;
			}
//		} else {
//			scenarioFlag = false;
//		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/*
	 * Common Method that will be used for Deal Wide Sub tab to set the Pricing
	 * SubType.
	 * 
	 * @since 07/03/2024
	 * 
	 * @author nitish.kumar.prusty
	 */
	public void commonActionForDealWide(String pricing) throws Exception {

		clickElement(PricingSubType_Btn);
		for (WebElement ele : PricingSubType_List) {
			if (ele.getText().equals(pricing)) {
				clickElement(ele);
				break;
			}
		}

	}

	/**
	 * TC_94: Valdiate if SA is able to save the pricing input type as Deal wide
	 * with Trans Billable as Yes/No, Pricing Sub-Type as Fixed Billing and Margin
	 * Type as Target/Custom.
	 * 
	 * @since 07/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 */
	public void validateDealWideForFixedBillingSubType(String excelPath, String sheetname) throws Exception {

		boolean scenarioFlag = true;
		String pricingSubType = "";
		String pricingSubTypeToBeSet = "";
		String transitionBillableClass = "";
		String saveStatusTitle = "";
		String dealWideListClass = "";

		dealWideListClass = DealWideTab_List.getAttribute("class");

		clickElement(DealWide_Tab);
//		if (!dealWideListClass.contains("active")) {
//			handleAlertPopup();
//		}
		
		try {
			handleAlertPopup();
		}catch(Exception e) {}

		pricingSubType = getText(PricingSubType_Btn);
		pricingSubTypeToBeSet = "Fixed Billing";

		transitionBillableClass = Transition_checkbox.getAttribute("class");

		if (!pricingSubType.equals("Fixed Billing")) {
			if (transitionBillableClass.contains("toggle_on") || !(toggle_NO.getAttribute("class").contains("font__bold"))) {
				commonActionForDealWide(pricingSubTypeToBeSet);
				//clickElement(Transition_SwitchLabel);
				enterDataForFixedBilling(excelPath, sheetname);

			} else {
				commonActionForDealWide(pricingSubTypeToBeSet);
				clickElement(Transition_SwitchLabel);
				enterDataForFixedBilling(excelPath, sheetname);

			}
		} else {

			if (transitionBillableClass.contains("toggle_on") || !(toggle_NO.getAttribute("class").contains("font__bold"))) {
				commonActionForDealWide(pricingSubTypeToBeSet);
				//clickElement(Transition_SwitchLabel);
				enterDataForFixedBilling(excelPath, sheetname);

			} else {
				commonActionForDealWide(pricingSubTypeToBeSet);
				clickElement(Transition_SwitchLabel);
				enterDataForFixedBilling(excelPath, sheetname);

			}

		}
		clickElement(DealWideSave_btn);
//		if (!dealWideListClass.contains("active")) {
//			clickElement(AlertOkChangingData_btn);
//		}
		
		try {
			waitForElementToAppear(AlertOkChangingData_btn);
			clickElement(AlertOkChangingData_btn);
			waitForElementToBeVisible(PricingDealWideSave_Status);
		}catch(Exception e) {
			logInfo("Pop up didnt come");
		}		
//		waitForElementToBeVisible(PricingDealWideSave_Status);

		saveStatusTitle = PricingDealWideSave_Status.getAttribute("title");
		if (saveStatusTitle.equals("Fixed Billing saved successfully.")) {
			logPass("SA is able to save the pricing input type as Deal wide with Trans Billable as Yes/No, Pricing Sub-Type as Fixed Billing and Margin Type as Target/Custom.");
		} else {
			logFail("SA is not able to save the pricing input type as Deal wide with Trans Billable as Yes/No, Pricing Sub-Type as Fixed Billing and Margin Type as Target/Custom.");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/*
	 * Method to enter data for Fixed Billing pricing sub Type
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @since 07/03/2024
	 */

	public void enterDataForFixedBilling(String excelPath, String sheetname) throws Exception {

		String data1 = "";
		String data2 = "";
		random = new Random();

		int randomNumber1 = random.nextInt(6) + 1;
		int randomNumber2 = random.nextInt(6) + 1;

		data1 = ExcelUtilities.getExcelValue(excelPath, sheetname, randomNumber1, 0);
		data2 = ExcelUtilities.getExcelValue(excelPath, sheetname, randomNumber2, 0);

		waitForElementToBeVisible(Transition_input);
		clickElement(Transition_input);
		Transition_input.clear();
		sendKeys(Transition_input, data1);
		Transition_input.sendKeys(Keys.ENTER);
		clickElement(Service_Delivery_input);
		Service_Delivery_input.clear();
		sendKeys(Service_Delivery_input, data2);
		Service_Delivery_input.sendKeys(Keys.ENTER);
	}

	/**
	 * TC_95: Validate if SA is able to save the Pricing input as Group wise.
	 * 
	 * @since 07/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 */
	public void groupTabValidation(String excelPath, String sheetname) throws Exception {

		boolean scenarioFlag = true;

		String randomData = "";
		String randomData2 = "";
		String groupTabListClass = "";
		String expectedSavedSatus = "";
		String saveStatusTitle = "";
		String pricingOptions_Xpath = "";
		String pricingOptionDrpDown_Xpath = "";
		String pricingOpsDropdownOptions = "";
		String marginType_Xpath = "";
		String marginTypeDrpDown_Xpath = "";
		String marginTypeDrpDownOptions = "";
		String marginInputField_Xpath = "";
		String fte_Xpath = "";
		String pricingOptiontxt = "";
		String rippleCheckboxClass = "";

		random = new Random();

		WebElement PricingOptions = null;
		WebElement PricingOptionDrpDown = null;
		List<WebElement> PricingOptionDrpDownOps = null;
		WebElement FTE = null;
		WebElement MarginType = null;
		WebElement MarginTypeDrpDown = null;
		List<WebElement> MarginTypeOptions = null;
		WebElement MarginInputField = null;

		// Margin
		groupTabListClass = GroupTab_List.getAttribute("class");
		expectedSavedSatus = "Pricing By Group saved successfully.";

		int randomNumber1 = random.nextInt(6) + 1;
		int randomNumber2 = random.nextInt(6) + 1;

		randomData = ExcelUtilities.getExcelValue(excelPath, sheetname, randomNumber1, 0);
		randomData2 = ExcelUtilities.getExcelValue(excelPath, sheetname, randomNumber2, 0);

		clickElement(Group_Tab);
		if (!groupTabListClass.contains("active")) {
			handleAlertPopup();
		}

		jse.executeScript("arguments[0].scrollIntoView(true);", End_txt);

		rippleCheckboxClass = Ripple_CheckBox.getAttribute("class");

		/* if ripple toggle is off then turn it on */
		if (!rippleCheckboxClass.contains("toggle_off")) {
			clickElement(RippleToggle_btn);
		}

		int tot = Total_Groups.size();

		for (int i = 0; i < tot; i++) {

			pricingOptions_Xpath = "//div[@row-index='" + i
					+ "']//div[@col-id = 'PricingOption' and contains(@class,'dropdown-cell')]//span//span";
			pricingOptionDrpDown_Xpath = "//div[@row-index='" + i
					+ "']//div[@col-id = 'PricingOption']//select[@id = 'AOPricedrpDown']";
			pricingOpsDropdownOptions = "//div[@row-index='" + i
					+ "']//div[@col-id = 'PricingOption']//select[@id = 'AOPricedrpDown']//option";
			fte_Xpath = "//div[@row-index='" + i + "']//div[@col-id = 'M1']//input";
			marginType_Xpath = "//div[@row-index='" + i
					+ "']//div[@col-id = 'marginflag' and contains(@class,'dropdown-cell')]//span//span";
			marginTypeDrpDown_Xpath = "//div[@row-index='" + i + "']//div[@col-id = 'marginflag']//select";
			marginTypeDrpDownOptions = "//div[@row-index='" + i
					+ "']//div[@col-id = 'marginflag']//select[@id = 'AOPricedrpDown']//option";
			marginInputField_Xpath = "//div[@row-index='" + i + "']//div[@col-id = 'margin']//input";

			if (i > 3) {
				break;
			} else {
				PricingOptions = getDriver().findElement(By.xpath(pricingOptions_Xpath));
				try {
					waitForElementToBeVisible(PricingOptions);
					pricingOptiontxt = getText(PricingOptions);
				} catch (StaleElementReferenceException e) {
					PricingOptions = getDriver().findElement(By.xpath(pricingOptions_Xpath));
					waitForElementToBeVisible(PricingOptions);
					pricingOptiontxt = getText(PricingOptions);
				}
				if ((i <= 1 && pricingOptiontxt.equals("Margin"))
						|| (i > 1 && i <= 3 && pricingOptiontxt.equals("Margin"))) {
					clickElement(PricingOptions);
					PricingOptionDrpDown = getDriver().findElement(By.xpath(pricingOptionDrpDown_Xpath));
					waitForElementToBeVisible(PricingOptionDrpDown);
					clickElement(PricingOptionDrpDown);
					PricingOptionDrpDownOps = getDriver().findElements(By.xpath(pricingOpsDropdownOptions));
					for (WebElement ele : PricingOptionDrpDownOps) {
						if (ele.getText().equals("Fixed")) {
							clickElement(ele);
							break;
						}
					}
					FTE = getDriver().findElement(By.xpath(fte_Xpath));
					waitForElementToBeVisible(FTE);
					// clear the data present in input field
					actions.moveToElement(FTE).click().sendKeys(Keys.chord(Keys.CONTROL, "a")).sendKeys(Keys.DELETE)
							.build().perform();
					// send new data
					FTE = getDriver().findElement(By.xpath(fte_Xpath));
					actions.moveToElement(FTE).sendKeys(randomData).build().perform();
					// press tab to save the data
					actions.sendKeys(Keys.TAB).build().perform();

				} else {
					PricingOptions = getDriver().findElement(By.xpath(pricingOptions_Xpath));
					clickElement(PricingOptions);
					PricingOptionDrpDown = getDriver().findElement(By.xpath(pricingOptionDrpDown_Xpath));
					waitForElementToBeVisible(PricingOptionDrpDown);
					clickElement(PricingOptionDrpDown);
					PricingOptionDrpDownOps = getDriver().findElements(By.xpath(pricingOpsDropdownOptions));
					for (WebElement ele : PricingOptionDrpDownOps) {
						if (ele.getText().equals("Margin")) {
							clickElement(ele);
							break;
						}
					}

					MarginType = getDriver().findElement(By.xpath(marginType_Xpath));
					waitForElementToBeVisible(MarginType);
					try {
						clickElement(MarginType);
					} catch (Exception e) {
						clickElement(MarginType);
					}
					try {
						MarginTypeDrpDown = getDriver().findElement(By.xpath(marginTypeDrpDown_Xpath));
						waitForElementToBeVisible(MarginTypeDrpDown);
						clickElement(MarginTypeDrpDown);
					} catch (Exception e) {
						MarginTypeDrpDown = getDriver().findElement(By.xpath(marginTypeDrpDown_Xpath));
						waitForElementToBeVisible(MarginTypeDrpDown);
						clickElement(MarginTypeDrpDown);
					}
					MarginTypeOptions = getDriver().findElements(By.xpath(marginTypeDrpDownOptions));
					for (WebElement ele : MarginTypeOptions) {
						if (ele.getText().equals("Custom")) {
							clickElement(ele);
							break;
						}
					}
					MarginInputField = getDriver().findElement(By.xpath(marginInputField_Xpath));
					waitForElementToBeVisible(MarginInputField);
					// clear Data
					actions.moveToElement(MarginInputField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					MarginInputField = getDriver().findElement(By.xpath(marginInputField_Xpath));
					// send new data
					actions.moveToElement(MarginInputField).sendKeys(randomData2).build().perform();
					// press tab to save the data
					actions.sendKeys(Keys.TAB).build().perform();
				}
			}
		}

		clickElement(RippleToggle_btn);

		clickElement(PricingGroupSave_btn);

//		if (!groupTabListClass.contains("active")) {
//			clickElement(AlertOkChangingData_btn);
//		}
//		
//		waitForElementToBeVisible(PricingGroupSave_Status);
		
		try {
			waitForElementToAppear(AlertOkChangingData_btn);
			clickElement(AlertOkChangingData_btn);
			waitForElementToBeVisible(PricingGroupSave_Status);
		}catch(Exception e) {
			logInfo("NO popup");
		}
		
		saveStatusTitle = PricingGroupSave_Status.getAttribute("title");

		if (saveStatusTitle.equals(expectedSavedSatus)) {
			logPass("SA is able to save the Pricing input as Group wise.");
		} else {
			logFail("SA is not able to save the Pricing input as Group wise.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * TC_96: Validate if SA is able to save the pricing input as Economic Profile
	 * wise.
	 * 
	 * @since 07/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 */

	public void economicProfileValidation(String excelPath, String sheetname) throws Exception {

		boolean scenarioFlag = true;

		String economicProfileTabListClass = "";
		String rippleCheckboxClass = "";
		String pricingOptions_Xpath = "";
		String pricingOptionDrpDown_Xpath = "";
		String pricingOpsDropdownOptions = "";
		String marginType_Xpath = "";
		String marginTypeDrpDown_Xpath = "";
		String marginTypeDrpDownOptions = "";
		String marginInputField_Xpath = "";
		String fte_Xpath = "";
		String pricingOptiontxt = "";
		String randomData = "";
		String randomData2 = "";
		String saveStatusTitle = "";

		random = new Random();

		WebElement pricingOptions = null;
		WebElement pricingOptionDrpDown = null;
		List<WebElement> pricingOptionDrpDownOps = null;
		WebElement FTE = null;
		WebElement MarginType = null;
		WebElement MarginTypeDrpDown = null;
		List<WebElement> MarginTypeOptions = null;
		WebElement MarginInputField = null;

		int randomNumber1 = random.nextInt(6) + 1;
		int randomNumber2 = random.nextInt(6) + 1;

		randomData = ExcelUtilities.getExcelValue(excelPath, sheetname, randomNumber1, 0);
		randomData2 = ExcelUtilities.getExcelValue(excelPath, sheetname, randomNumber2, 0);

		economicProfileTabListClass = EconomicProfileTab_List.getAttribute("class");

		clickElement(EconomicProfile_Tab);
		if (!economicProfileTabListClass.contains("active")) {
			handleAlertPopup();
		}

		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		rippleCheckboxClass = EconomicProfileRipple_CheckBox.getAttribute("class");

		/* if ripple toggle is off then turn it on */
		if (!rippleCheckboxClass.contains("toggle_off")) {
			clickElement(EconomicProfileRipple_btn);
		}

		int size = Total_EP.size();

		for (int i = 0; i < size; i++) {

			pricingOptions_Xpath = "//div[@row-index='" + i
					+ "']//div[@col-id = 'PricingOptionEP' and contains(@class,'dropdown-cell')]//span//span";
			pricingOptionDrpDown_Xpath = "//div[@row-index='" + i
					+ "']//div[@col-id = 'PricingOptionEP']//select[@id = 'AOPricedrpDown']";
			pricingOpsDropdownOptions = "//div[@row-index='" + i
					+ "']//div[@col-id = 'PricingOptionEP']//select[@id = 'AOPricedrpDown']//option";
			fte_Xpath = "//div[@row-index='" + i + "']//div[@col-id = 'M1']//input";
			marginType_Xpath = "//div[@row-index='" + i
					+ "']//div[@col-id = 'marginflagEP' and contains(@class,'dropdown-cell')]/span";
			marginTypeDrpDown_Xpath = "//div[@row-index='" + i + "']//div[@col-id = 'marginflagEP']//select";
			marginTypeDrpDownOptions = "//div[@row-index='" + i + "']//div[@col-id = 'marginflagEP']//select//option";
			marginInputField_Xpath = "//div[@row-index='" + i + "']//div[@col-id = 'MarginPct']//input";

			pricingOptions = getDriver().findElement(By.xpath(pricingOptions_Xpath));
			try {
				waitForElementToBeVisible(pricingOptions);
				pricingOptiontxt = getText(pricingOptions);
			} catch (StaleElementReferenceException e) {
				pricingOptions = getDriver().findElement(By.xpath(pricingOptions_Xpath));
				waitForElementToBeVisible(pricingOptions);
				pricingOptiontxt = getText(pricingOptions);
			}

			if ((i <= 1 && pricingOptiontxt.equals("Margin")) || (i == 2 && pricingOptiontxt.equals("Margin"))) {

				clickElement(pricingOptions);
				pricingOptionDrpDown = getDriver().findElement(By.xpath(pricingOptionDrpDown_Xpath));
				waitForElementToBeVisible(pricingOptionDrpDown);
				clickElement(pricingOptionDrpDown);
				pricingOptionDrpDownOps = getDriver().findElements(By.xpath(pricingOpsDropdownOptions));
				for (WebElement ele : pricingOptionDrpDownOps) {
					if (ele.getText().equals("Fixed")) {
						clickElement(ele);
						break;
					}
				}
				scrollHorizontallyInsideElement(EconomicProfile_Grid, 1000);
				FTE = getDriver().findElement(By.xpath(fte_Xpath));
				waitForElementToBeVisible(FTE);
				// clear the data present in input field
				actions.moveToElement(FTE).click().sendKeys(Keys.chord(Keys.CONTROL, "a")).sendKeys(Keys.DELETE).build()
						.perform();
				// send new data
				FTE = getDriver().findElement(By.xpath(fte_Xpath));
				actions.moveToElement(FTE).sendKeys(randomData).build().perform();
				// press tab to save the data
				actions.sendKeys(Keys.TAB).build().perform();
				scrollHorizontallyInsideElement(EconomicProfile_Grid, -1000);

			} else {
				pricingOptions = getDriver().findElement(By.xpath(pricingOptions_Xpath));
				clickElement(pricingOptions);
				pricingOptionDrpDown = getDriver().findElement(By.xpath(pricingOptionDrpDown_Xpath));
				waitForElementToBeVisible(pricingOptionDrpDown);
				clickElement(pricingOptionDrpDown);
				pricingOptionDrpDownOps = getDriver().findElements(By.xpath(pricingOpsDropdownOptions));
				for (WebElement ele : pricingOptionDrpDownOps) {
					if (ele.getText().equals("Margin")) {
						clickElement(ele);
						break;
					}
				}
				MarginType = getDriver().findElement(By.xpath(marginType_Xpath));
				waitForElementToAppear(MarginType);
				waitForElementToBeVisible(MarginType);
				try {
					clickElement(MarginType);
					MarginType.click();
				} catch (Exception e) {
					clickElement(MarginType);
				}
				try {
					MarginTypeDrpDown = getDriver().findElement(By.xpath(marginTypeDrpDown_Xpath));
					waitForElementToBeVisible(MarginTypeDrpDown);
					clickElement(MarginTypeDrpDown);
				} catch (Exception e) {
					MarginTypeDrpDown = getDriver().findElement(By.xpath(marginTypeDrpDown_Xpath));
					waitForElementToBeVisible(MarginTypeDrpDown);
					clickElement(MarginTypeDrpDown);
				}
				MarginTypeOptions = getDriver().findElements(By.xpath(marginTypeDrpDownOptions));
				for (WebElement ele : MarginTypeOptions) {
					if (ele.getText().equals("Custom")) {
						clickElement(ele);
						break;
					}
				}
				MarginInputField = getDriver().findElement(By.xpath(marginInputField_Xpath));
				waitForElementToBeVisible(MarginInputField);
				// clear Data
				actions.moveToElement(MarginInputField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				MarginInputField = getDriver().findElement(By.xpath(marginInputField_Xpath));
				// send new data
				actions.moveToElement(MarginInputField).sendKeys(randomData2).build().perform();
				// press tab to save the data
				actions.sendKeys(Keys.TAB).build().perform();
			}
		}

		clickElement(EconomicProfileRipple_btn);

		clickElement(EconomicProfile_Save);
////		if (!economicProfileTabListClass.contains("active")) {
////			clickElement(AlertOkChangingData_btn);
////		}
//		
//		try {
//			clickElement(AlertOkChangingData_btn);
//		}catch(Exception e) {}
		
		try {
			waitForElementToAppear(AlertOkChangingData_btn);
			clickElement(AlertOkChangingData_btn);
			waitForElementToBeVisible(EconomicProfile_SaveStatus);
		}catch(Exception e) {}

//		waitForElementToBeVisible(EconomicProfile_SaveStatus);
		saveStatusTitle = EconomicProfile_SaveStatus.getAttribute("title");

		if (saveStatusTitle.equals("Pricing By Economic Profile saved successfully.")) {
			logPass("SA is able to save the pricing input as Economic Profile wise");
		} else {
			logFail("SA is not able to save the pricing input as Economic Profile wise");
			scenarioFlag = false;
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}
	/**
	 * TC_97: Validate if SA is able to Export/Import and Price Input File.
	 *  
	 * @since 21/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 */
	public void validateImportExport(String filepath,String sheetname) throws Exception {

		boolean scenarioFlag = false;
		boolean isFileExported = false;
		boolean isFileImported = false;
		
		String economicProfileTabListClass = "";
		
		validateDealWideForFixedBillingSubType(filepath, sheetname);

		waitForElementToBeVisible(Export_Btn);
		clickElement(Export_Btn);

		waitForElementToBeVisible(ExportedFileDownload_Btn);
		clickElement(ExportedFileDownload_Btn);

		waitForElementToBeVisible(IUnderStand_Btn);
		clickElement(IUnderStand_Btn);
		
		String fileName = getText(FileName);
		logInfo("FileName - " + fileName);

		waitUntilFileDownloaded(fileName);

		boolean isFilePresent = searchFile(fileName);

		if (isFilePresent == true) {
			logPass("File is present in the downloads Path");
			isFileExported = true;

		} else {
			logFail("File is not present in the downloads Path");
		}
		
		economicProfileTabListClass = EconomicProfileTab_List.getAttribute("class");

		clickElement(EconomicProfile_Tab);
		if (!economicProfileTabListClass.contains("active")) {
			handleAlertPopup();
		}
		
		waitForElementToBeVisible(Import_btn);
		clickElement(Import_btn);
		
		try {
			waitForElementToBeVisible(getDriver().findElement(By.xpath("//div[@id='divImportPricingcls2']")));
			waitForElementToAppear(getDriver().findElement(By.xpath("//div[@id='divImportPricingcls2']")));
		}catch(Exception e) {
			clickElement(Import_btn);
			waitForElementToBeVisible(getDriver().findElement(By.xpath("//div[@id='divImportPricingcls2']")));
			waitForElementToAppear(getDriver().findElement(By.xpath("//div[@id='divImportPricingcls2']")));
		}

		File directory = new File(ConstantUtils.DownloadedFiles_FilePath);
		File[] files = directory.listFiles((dir, name) -> name.equals(fileName));

		if (files != null && files.length > 0) {
			String Pricingfilepath = files[0].getAbsolutePath();

			sendKeys(Browsefile, Pricingfilepath);
			
		} else {
			logFail("File Not Found in Downloads path");
		}

		waitForElementToBeVisible(ImportOk_Btn);
		clickElement(ImportOk_Btn);
		
		waitForElementToBeVisible(ImportedFile_Sec);

		if (isDisplayed(ImportedFile_Sec)) {
			if (fileName.contains(getText(ImportedFile_Sec).substring(0,35))) {
				logPass("File Imported Successfully");
				isFileImported = true;
			}
		} else {
			logFail("File Not Imported");
		}

		if (isFileImported && isFileExported) {
			logPass("SA is able to Export/Import Price Input File.");
			scenarioFlag = true;
		} else {
			logFail("SA is not able to Export/Import Price Input File");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * TC_98: Validate if SA is able to see the status in Export/Import Status File.
	 * 
	 * @since 21/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 */
	public void validateExportImportStatus() throws Exception {

		boolean scenarioFlag = true;
		String exportStatus = "";
		String importStatus = "";

		waitForElementToBeVisible(ExportImport_Tab);
		clickElement(ExportImport_Tab);

		if (isDisplayed(ExportStatus_Desc) && isDisplayed(ImportStatus_Desc)) {
			exportStatus = getText(ExportStatus_Desc);
			importStatus = getText(ImportStatus_Desc);

			if (exportStatus.equals("Completed") && importStatus.equals("Completed")) {
				logPass("SA is able to see the status in Export/Import Status File");
				scenarioFlag = true;
			} else {
				logFail("SA is not able to see the status in Export/Import Status File");
			}
		} else {
			logFail("Export/Import Status Desc not Displayed");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/*
	 * Method to search for a file with a provided filename
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 */
	public boolean searchFile(String fileName) throws Exception {

		File directory = new File(ConstantUtils.DownloadedFiles_FilePath);

		if (directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();
			if (files != null) {
				for (File file : files) {
					if (file.getName().equals(fileName)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	/*
	 * Method to add Explicit wait until the file is downloaded and saved in
	 * Downloads path.
	 * 
	 * @since 19/03/2024
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 */

	public void waitUntilFileDownloaded(String fileName) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				File downloadDir = new File(ConstantUtils.DownloadedFiles_FilePath);
				File[] files = downloadDir.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.getName().equals(fileName)) {
							return true;
						}
					}
				}
				return false;
			}
		});
	}
}
