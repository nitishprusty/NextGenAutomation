package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

//simport commonUtility.ExcelUtilities;

import reusableComponents.ExcelUtilities;

import reusableComponents.ConstantUtils;

import reusableComponents.GlobalScreen;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Solution_Tax_Page extends BasePage {

	public Actions action = new Actions(getDriver());

	/************************** LOCATORS *****************************/

	@FindBy(how = How.XPATH, using = "//div[@class='next-img']")
	public WebElement scroll;

	@FindBy(how = How.XPATH, using = "//p[@id='applyTax']")
	public WebElement Tax_input;

	@FindBy(how = How.XPATH, using = "//a[@id='anchTaxConfiguration']")
	public WebElement configuration;

	@FindBy(how = How.XPATH, using = "//a[@id='anchSubcontractorLoad']")
	public WebElement subContractor;

	@FindBy(how = How.XPATH, using = "//a[@id='anchTPReleaseLoad']")
	public WebElement thirdPartyRelease;

	@FindBy(how = How.XPATH, using = "//a[@id='anchTPPurchaseLoad']")
	public WebElement thirdPartyPurchase;

	@FindBy(how = How.XPATH, using = "//a[@id='anchTaxIPLLoad']")
	public WebElement intellectProp;

	@FindBy(how = How.XPATH, using = "//a[@id='anchAcquiringClientAssetsLoad']")
	public WebElement aquaringLoad;

	@FindBy(how = How.XPATH, using = "//a[@id='anchContractandPricingLoad']")
	public WebElement contractPrice;

	@FindBy(how = How.XPATH, using = "//div[@class='parameter-tab']//ul[ @role='tablist']//li")
	public List<WebElement> Tax_TabsList;

	@FindBy(how = How.XPATH, using = "//div[@class='parameter-tab']//ul[ @role='tablist']//li/a")
	public List<WebElement> Tax_anchorTabsList;

	@FindBy(how = How.XPATH, using = "//*[@id='USSwitchId']//span[@class='switch-handle']")
	public WebElement configToggle;

	@FindBy(how = How.XPATH, using = "//div[@id='IsMultipleSwitchId']//span[@class='switch-handle']")
	public WebElement configToggle2;

	@FindBy(how = How.XPATH, using = "//div[@id='divClientContracCountries']//button[@id='countryId']")
	public WebElement Tax_Config_cntry_dropdwn;

	@FindBy(how = How.XPATH, using = "//*[@id='ulClientContracCountries']/li//a")
	public List<WebElement> Tax_Config_Cntry_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//*[@id='TypeOfServicesId']")
	public WebElement Tax_Config_TService_dropdwn;

	@FindBy(how = How.XPATH, using = "//*[@id='ulTypeOfServices']/li/a")
	public List<WebElement> Tax_Config_TService_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//*[@id='BrazilianBranchId']")
	public WebElement Tax_Config_Brazilian_dropdwn;

	@FindBy(how = How.XPATH, using = "//*[@id='ulBrazilianBranch']//li//a")
	public List<WebElement> Tax_Config_Brazilian_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//button[@id='btnTaxConfigSave']//em")
	public WebElement configSave;

	@FindBy(how = How.XPATH, using = "//span[@id='errorConfig']")
	public WebElement savePopup;

	@FindBy(how = How.XPATH, using = "//div[@id='subsofticon']//span[@class='switch-label']")
	public WebElement subContractToggle;

	@FindBy(how = How.XPATH, using = "//*[text()='Contracting Country/Location']")
	public WebElement countryLocationHeading;

	@FindBy(how = How.XPATH, using = "//form[@id='subContractorForm']//div[contains(@class,'ag-body-container ag-layout-normal')]//div[@col-id='CountryName']")
	public WebElement subContrySelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_SubConfig_Contryselect_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='AcnContractingCountryName'][not(@role='presentation')]")
	public WebElement acnContractingSelect;

	@FindBy(how = How.XPATH, using = "//div[@col-id='SubworklocationName'][not(@role='presentation')]")
	public WebElement subWorkSelect;

	@FindBy(how = How.XPATH, using = "//button[@id='SubcontactorAddBtn']//em")
	public WebElement addNewRow;

	@FindBy(how = How.XPATH, using = " //select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_SubConfig_WorkLocation_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='NatureofworkName'][not(@role='presentation')]")
	public WebElement subNatureOfWorkSelect;

	@FindBy(how = How.XPATH, using = " //select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_SubConfig_NatureOfwork_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='CurrencyName' and @title='United States Dollar - USD']")
	public WebElement subCurrenecySelect;

	@FindBy(how = How.XPATH, using = " //select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_SubConfig_Currency_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//button[@id='SubcontactorsaveAddBtn']//em")
	public WebElement subContractSave;

	@FindBy(how = How.XPATH, using = "//div[@col-id='Value']//input")
	public WebElement subValueSelect;

	@FindBy(how = How.XPATH, using = "//span[@id='errorTPRelease'][text()='Record saved successfully.']")
	public WebElement subContractSavePopup;

	@FindBy(how = How.XPATH, using = "//div[@id='TPRHardSoftOn']//span[@class='switch-label']")
	public WebElement thirPartyResaleToggle;

	@FindBy(how = How.XPATH, using = "//button[@id='TPReleaseAddBtn']//em")
	public WebElement thirdResaleaddRow;

	@FindBy(how = How.XPATH, using = "//div[@col-id='VendorentityCountryName'][not(@role='presentation')]")
	public WebElement thirdResaleVendorCountrySelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_thirdResale_VendorContry_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='ClientpurchasingCountryName'][not(@role='presentation')]")
	public WebElement thirdResaleClientCountrySelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_thirdResale_ClientPurContry_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='ClientdeliveryCountryName'][not(@role='presentation')]")
	public WebElement thirdResaleClientDeliverySelect;

	@FindBy(how = How.XPATH, using = "//div[@col-id='isSoftwaredeliveredelectronicallyName'][not(@role='presentation')]")
	public WebElement softwareDeliverySelect;

	@FindBy(how = How.XPATH, using = "	//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_thirdResale_softwareDelivery_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='Value']//input")
	public WebElement salesPriceValue;

	@FindBy(how = How.XPATH, using = "//button[@id='TPReleaseSaveBtn']//em")
	public WebElement thirdResaleSave;

	@FindBy(how = How.XPATH, using = "//span[@id='errorTPRelease']")
	public WebElement thirdResaleSavePopup;

	@FindBy(how = How.XPATH, using = "//div[@id='tppurchaseHardSoftOn']//span[@class='switch-label']")
	public WebElement thirPartyPurchaseToggle;

	@FindBy(how = How.XPATH, using = "//div[ @col-id='TPPCountryName'][not(@role='presentation')]")
	public WebElement thirdResaleClientPurchaseSelect;

	@FindBy(how = How.XPATH, using = "//button[@id='TPPurchaseAddBtn']//em")
	public WebElement thirdPurchaseRow;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_thirdPuchase_ClientPurContry_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='SofthardCountryName'][not(@role='presentation')]")
	public WebElement softHardCountrySelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_thirdPurchase_SoftHardCon_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='isSoftwaredeliveredelectronicallyName'][not(@role='presentation')]")
	public WebElement softDeliverySelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_thirdPurchase_SoftDelivery_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='Value']//input")
	public WebElement softHardPriceValue;

	@FindBy(how = How.XPATH, using = "//button[@id='TPPurchaseSaveBtn']//em")
	public WebElement thirdPurchaseSave;

	@FindBy(how = How.XPATH, using = "//span[@id='errorTPPurchase']")
	public WebElement thirdPurchaseSavePopup;

	@FindBy(how = How.XPATH, using = "//button[@id='SubcontactorAddBtn']//em")
	public WebElement intellectAddRow;

	@FindBy(how = How.XPATH, using = "//div[@col-id='TaxIPLCountryName'][not(@role='presentation')]")
	public WebElement intellectPurchasingCountrySelect;

	@FindBy(how = How.XPATH, using = "//*[@id='AOTaxdrpDown']//option")
	public List<WebElement> intellectPurchasingCountryDrpDwn;

	@FindBy(how = How.XPATH, using = "//div[@col-id='AcnIPContractingCountryName'][not(@role='presentation')]")
	public WebElement contractingCountryName;

	@FindBy(how = How.XPATH, using = "//*[@id='AOTaxdrpDown']/option")
	public List<WebElement> contractingCountryNameDrpDwn;

	@FindBy(how = How.XPATH, using = "//div[@role='gridcell' and @col-id='Value']")
	public WebElement intellectValue;

	@FindBy(how = How.XPATH, using = "//input[@id='numericInputId']")
	public WebElement intellectValues;

	@FindBy(how = How.XPATH, using = "//*[@id='TaxiplSaveBtn']//em")
	public WebElement intellectSave;

	@FindBy(how = How.XPATH, using = "//*[@id='errorTPRelease']")
	public WebElement intellectSavePopUp;

	@FindBy(how = How.XPATH, using = "//div[@id='acaHardSoftOn']//span[@class='switch-label']")
	public WebElement aquaringloadToggle;

	@FindBy(how = How.XPATH, using = "//div[@col-id='LocationEmployeeName'][not(@role='presentation')]")
	public WebElement aquaringClientLoctionEMPSelect;

	@FindBy(how = How.XPATH, using = "//div[@col-id='willEmpRmnCountry'][not(@role='presentation')]")
	public WebElement employeRemainCountrySelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxACAEmployeedrpDown']//option")
	public List<WebElement> Tax_auqaringClient_EmployeeLoc_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxACAEmployeedrpDown']//option")
	public List<WebElement> Tax_auqaringClient_Employeeremain_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//*[@col-id='NoOfEmployees']//input")
	public WebElement employeeNOValues;

	@FindBy(how = How.XPATH, using = "//input[@id='numericInputId']")
	public WebElement employeeNOValues1;

	@FindBy(how = How.XPATH, using = "//div[@col-id='ThirdPartyLocationCountryCode'][not(@role='presentation')]")
	public WebElement location_thirdClient_Select;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxACAClientdrpDown']//option")
	public List<WebElement> Tax_auqaringClient_thirdClient_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='Iscontractscrossborderyesno'][not(@role='presentation')]")
	public WebElement crossBorder_Select;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxACAClientdrpDown']//option")
	public List<WebElement> Tax_auqaringClient_crossBorder_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='NatureofGoods']//input")
	public WebElement natureOfGoods;

	@FindBy(how = How.XPATH, using = "//div[@col-id='Natureofasset']//input")
	public WebElement natureOfAssests;

	@FindBy(how = How.XPATH, using = "//div[@col-id='assetcountrycode'][not(@role='presentation')]")
	public WebElement loctaionOfAssests_Select;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxACAAssetdrpDown']//option")
	public List<WebElement> Tax_auqaringClient_AssetLocation_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@col-id='isassetstayincountryyesno'][not(@role='presentation')]")
	public WebElement assetCountry_Select;

	@FindBy(how = How.XPATH, using = "//div[@col-id='purchaseprice']//input")
	public WebElement purchasePriceSelect;

	@FindBy(how = How.XPATH, using = "//button[@id='ACASaveBtn']//em")
	public WebElement aquaringSave;

	@FindBy(how = How.XPATH, using = "//*[@id='errorAcquringClientAsset']")
	public WebElement aquaringSavePopUp;

	@FindBy(how = How.XPATH, using = "//div[@id='conprisofticon']//span[@class='switch-label']")
	public WebElement contractPriceToggle;

	@FindBy(how = How.XPATH, using = "//button[@id='acaAddNewRow3']//em")
	public WebElement contactPricingAddRow;

	@FindBy(how = How.XPATH, using = "//div[@col-id='isMasterserviceagreementexistName' and @role='gridcell']//span//span")
	public WebElement masterServiceCPSelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_contractPricing_MasterService_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@role='gridcell' and @col-id='uniquepricingstructureName']")
	public WebElement strcturePriceSelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_contractPricing_priceStructure_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//div[@role='gridcell' and @col-id='isbillingnotincontractName']")
	public WebElement contractingEntitySelect;

	@FindBy(how = How.XPATH, using = "//select[@id='AOTaxdrpDown']//option")
	public List<WebElement> Tax_contractPricing_ContractPrice_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//button[@id='ContractPriceingsaveAddBtn']//em")
	public WebElement contractPriceSave;

	@FindBy(how = How.XPATH, using = "//span[@id='errorContractPrice']")
	public WebElement contractPriceSavePopup;

	@FindBy(how = How.XPATH, using = "//*[@id='taxIPLYesOrNoswitch']/label/span")
	public WebElement Intellect_toggle;

	/************************** METHODS *****************************/

	public Solution_Tax_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario -TC:99 Validate if the SA is able to navigate to Tax Input when
	 *           clicked on Tax Input and able to see Configuration,
	 *           Subcontrators,Third Party Resale,Third Party Purchase,Intellectual
	 *           Property Licensing,Acquiring Client Assets,Contract and Pricing.
	 * @date - 28/02/2024
	 * @release March 16
	 * 
	 */

	public void navigateToSolutionTaxInput() throws Exception {
		clickElement(scroll);
		Navigate_to_Screen(GlobalScreen.TAX);
//		waitForElementToBeVisible(Tax_input);
//		clickElement(Tax_input);
		boolean scenarioFlag = true;

		waitForElementToBeVisible(configuration);
		clickElement(configuration);
		String configurationTab = Tax_TabsList.get(0).getAttribute("class");
		if (configurationTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to Configuration tab  ");
		} else {
			logFail("Failed to navigate to Configuration tab ");
			scenarioFlag = false;
		}

		waitForElementToBeVisible(subContractor);
		clickElement(subContractor);
		String subContractorTab = Tax_TabsList.get(1).getAttribute("class");
		if (subContractorTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to subContractor tab ");
		} else {
			logFail("Failed to navigate to subContractor tab");
			scenarioFlag = false;
		}

		waitForElementToBeVisible(thirdPartyRelease);
		clickElement(thirdPartyRelease);
		String thirdPartyReleaseTab = Tax_TabsList.get(2).getAttribute("class");
		if (thirdPartyReleaseTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to thirdPartyRelease tab  ");
		} else {
			logFail("Failed to navigate to thirdPartyRelease tab ");
			scenarioFlag = false;
		}

		waitForElementToBeVisible(thirdPartyPurchase);
		clickElement(thirdPartyPurchase);
		String thirdPartyPurchaseTab = Tax_TabsList.get(3).getAttribute("class");
		if (thirdPartyPurchaseTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to thirdPartyPurchase tab  ");
		} else {
			logFail("Failed to navigate to thirdPartyPurchase tab ");
			scenarioFlag = false;
		}

		waitForElementToBeVisible(intellectProp);
		clickElement(intellectProp);
		String intellectPropTab = Tax_TabsList.get(4).getAttribute("class");
		if (intellectPropTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to intellectProp tab  ");
		} else {
			logFail("Failed to navigate to intellectProp tab ");
			scenarioFlag = false;
		}

		waitForElementToBeVisible(aquaringLoad);
		clickElement(aquaringLoad);
		String aquaringLoadTab = Tax_TabsList.get(5).getAttribute("class");
		if (aquaringLoadTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to aquaringLoad tab ");
		} else {
			logFail("Failed to navigate to aquaringLoad tab");
			scenarioFlag = false;
		}

		waitForElementToBeVisible(contractPrice);
		clickElement(contractPrice);
		String contractPriceTab = Tax_TabsList.get(6).getAttribute("class");
		if (contractPriceTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to contractPrice tab");
		} else {
			logFail("Failed to navigate to contractPrice tab");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario - TC:100 Validate if the SA is able to configure the configuration
	 *           tab under Tax Input and save
	 * @date - 29/02/2024
	 * @release March 16
	 * 
	 */

	public void configurationTab(String FilePath, String Sheet, int Row, int Col) throws Exception {

		boolean ScenarioFlag = true;
//		waitForElementToBeVisible(configuration);
//		clickElement(configuration);
		Navigate_to_subTab(GlobalScreen.SUBTAB_Tax_Configuration);
		String toggle = configToggle.getCssValue("background");
		String toggle2 = configToggle2.getCssValue("background");
		if (toggle.equals(GlobalScreen.toggle_grey) && (toggle2.equals(GlobalScreen.toggle_grey))) {
			clickElement(configToggle);
			clickElement(configToggle2);
		} else {

			logPass("toggle is already on Yes button");

		}

		waitForElementToBeVisible(Tax_Config_cntry_dropdwn);
		clickElement(Tax_Config_cntry_dropdwn);
		String configCountryName = ExcelUtilities.SetExcelPath(FilePath, Sheet, 1, 1);

		for (WebElement clientCountry : Tax_Config_Cntry_Drpdwnlist) {
			if (clientCountry.getText().equals(configCountryName)) {

				clickElement(clientCountry);
				logPass("Country Name found in the list.");
				break;

			}
		}

		waitForElementToBeVisible(Tax_Config_TService_dropdwn);
		clickElement(Tax_Config_TService_dropdwn);
		String serviceType = ExcelUtilities.SetExcelPath(FilePath, Sheet, 2, 1);
		for (WebElement service : Tax_Config_TService_Drpdwnlist) {
			if (service.getText().equals(serviceType)) {
				clickElement(service);
				logPass("Type of service found in the list.");
				break;
			}
		}

		waitForElementToBeVisible(Tax_Config_Brazilian_dropdwn);
		clickElement(Tax_Config_Brazilian_dropdwn);
		String brazillianBranch = ExcelUtilities.SetExcelPath(FilePath, Sheet, 3, 1);

		for (WebElement branch : Tax_Config_Brazilian_Drpdwnlist) {
			if (branch.getText().trim().equals(brazillianBranch)) {

				clickElement(branch);
				logPass("Brazillian branch found in the list.");
				break;
			}
		}

		clickElement(configSave);

		String result = "";
		try {
			result = waitForElementToBeVisible(savePopup).getAttribute("title");
		} catch (Exception e) {
		}

		if (result.contains("Record saved successfully."))
			logPass("Record is successfully saved");
		else {
			logFail("Popup gives error message: " + result);
			;
			ScenarioFlag = false;

		}
		if (ScenarioFlag == true)
			scenarioPass();

	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario - TC:101 Validate if the SA is able to configure the Sub contracts
	 *           tab under Tax Input and save
	 * @date - 1/03/2024
	 * @release March 16
	 * 
	 */

	public void subContractTab(String FilePath, String Sheet, int Row, int Col) throws Exception {

		boolean scenarioFlag = true;
//		waitForElementToBeVisible(subContractor);
//		clickElement(subContractor);
		Navigate_to_subTab(GlobalScreen.SUBTAB_Tax_SubContractor);

		waitForElementToBeVisible(subContractToggle);
		String toggle = subContractToggle.getCssValue("background");
		
		// if (toggle.equals(GlobalScreen.toggle_grey)) {
		if (toggle.contains("rgb(216, 216, 216)")) {
			clickElement(subContractToggle);
		} else {
			logPass("toggle is already on Yes button");
		}

		clickElement(subContrySelect);
		String countryName = ExcelUtilities.SetExcelPath(FilePath, Sheet, 7, 1);

		for (WebElement element : Tax_SubConfig_Contryselect_Drpdwnlist) {
			if (getText(element).contains(countryName)) {
				clickElement(element);
				logInfo("Country/Location from dropdown is slelected");
				break;
			}
		}

		clickElement(subWorkSelect);
		String workLocation = ExcelUtilities.SetExcelPath(FilePath, Sheet, 9, 1);

		for (WebElement element : Tax_SubConfig_WorkLocation_Drpdwnlist) {
			if (element.getText().contains(workLocation)) {
				clickElement(element);
				logInfo("Work Location from dropdown is slelected");
				break;
			}
		}

		clickElement(subNatureOfWorkSelect);
		String natureOfWork = ExcelUtilities.SetExcelPath(FilePath, Sheet, 10, 1);

		for (WebElement element : Tax_SubConfig_NatureOfwork_Drpdwnlist) {
			if (element.getText().contains(natureOfWork)) {
				clickElement(element);
				logInfo("Nature of work from dropdown is slelected");
				break;
			}
		}
		waitForElementToBeVisible(subValueSelect);
		clickElement(subValueSelect);
		clear(subValueSelect);
		String subContractValue = ExcelUtilities.SetExcelPath(FilePath, Sheet, 12, 1);

		sendKeys(subValueSelect, subContractValue);

		clickElement(subContractSave);

		String message = "";
		try {
			message = waitForElementToBeVisible(subContractSavePopup).getAttribute("title");
		} catch (Exception e) {
		}

		if (message.contains("Record saved successfully."))
			logPass("Record is successfully saved");
		else {
			logFail("Popup gives error message: " + message);
			scenarioFlag = false;

		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario - TC:102 Validate if the SA is able to configure the Thirdparty
	 *           Resale tab under Tax Input and save
	 * @date - 04/03/2024
	 * @release March 16
	 * 
	 */

	public void thirdPartyResale(String FilePath, String Sheet, int Row, int Col) throws Exception {
		boolean scenarioFlag = true;
		Navigate_to_subTab(GlobalScreen.SUBTAB_Tax_ThirdPartyResale);
//		waitForElementToBeVisible(thirdPartyRelease);
//		clickElement(thirdPartyRelease);

		waitForElementToBeVisible(thirPartyResaleToggle);
		String toggle = thirPartyResaleToggle.getCssValue("background");
		logInfo("toggle: " + toggle);
		// if (toggle.equals(GlobalScreen.toggle_grey)) {
		if (toggle.contains("rgb(216, 216, 216)")) {
			clickElement(thirPartyResaleToggle);
		} else {

			logPass("Toggle is already on Yes button");

		}
		
		waitForElementToBeVisible(thirdResaleVendorCountrySelect);
		clickElement(thirdResaleVendorCountrySelect);
		String vendorCountry = ExcelUtilities.SetExcelPath(FilePath, Sheet, 16, 1);

		for (WebElement element : Tax_thirdResale_VendorContry_Drpdwnlist) {
			if (element.getText().equals(vendorCountry)) {
				clickElement(element);
				logInfo("Vendor Entity Country/Location from dropdown is slelected");
				break;
			}
		}
		clickElement(thirdResaleClientCountrySelect);
		String purchaseCountry = ExcelUtilities.SetExcelPath(FilePath, Sheet, 18, 1);
		for (WebElement element : Tax_thirdResale_ClientPurContry_Drpdwnlist) {
			if (element.getText().equals(purchaseCountry)) {
				clickElement(element);
				logInfo("Client purchasing Country/Location from dropdown is slelected");
				break;
			}
		}
		clickElement(thirdResaleClientDeliverySelect);
		String deliveryCountry = ExcelUtilities.SetExcelPath(FilePath, Sheet, 19, 1);

		for (WebElement element : Tax_thirdResale_ClientPurContry_Drpdwnlist) {
			if (element.getText().equals(deliveryCountry)) {
				clickElement(element);
				logInfo("Client Delivery Country/Location from dropdown is slelected");
				break;
			}
		}
		clickElement(softwareDeliverySelect);
		String deliverySelect = ExcelUtilities.SetExcelPath(FilePath, Sheet, 20, 1);

		for (WebElement element : Tax_thirdResale_softwareDelivery_Drpdwnlist) {
			if (element.getText().equals(deliverySelect)) {
				clickElement(element);
				logInfo("Software delivery from dropdown is slelected");
				break;
			}
		}
		waitForElementToBeVisible(salesPriceValue);
		clickElement(salesPriceValue);
		clear(salesPriceValue);
		String priceValue = ExcelUtilities.SetExcelPath(FilePath, Sheet, 22, 1);
		boolean value = false;
		sendKeys(salesPriceValue, priceValue);

		clickElement(thirdResaleSave);

		String message = "";
		try {
			message = waitForElementToBeVisible(thirdResaleSavePopup).getAttribute("title");
		} catch (Exception e) {
		}

		if (message.contains("Record saved successfully."))
			logPass("Record is successfully saved");
		else {
			logFail("Popup gives error message: " + message);
			scenarioFlag = false;

		}
		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario -TC:103 Validate if the SA is able to configure the Thirdparty
	 *           Purchase tab under Tax Input and save
	 * @date - 05/03/2024
	 * @release March 16
	 * 
	 */

	public void thirdPartyPurchaseTab(String FilePath, String Sheet, int Row, int Col) throws Exception {

		boolean ScenarioFlag = true;
		Navigate_to_subTab(GlobalScreen.SUBTAB_Tax_ThirdPartyPurchase);
//		waitForElementToBeVisible(thirdPartyPurchase);
//		clickElement(thirdPartyPurchase);
		waitForElementToBeVisible(thirPartyPurchaseToggle);
		String toggle = thirPartyResaleToggle.getCssValue("background");

		logInfo("toggle: " + toggle);
		// if (toggle.equals(GlobalScreen.toggle_grey)) {
		if (toggle.contains("rgb(255, 255, 255)")) {
			clickElement(thirPartyPurchaseToggle);
		} else {

			logPass("Toggle is already on Yes button");

		}
		waitForElementToBeVisible(thirdResaleClientPurchaseSelect);
		clickElement(thirdResaleClientPurchaseSelect);
		String vendorCountry = ExcelUtilities.SetExcelPath(FilePath, Sheet, 28, 1);

		for (WebElement country : Tax_thirdResale_ClientPurContry_Drpdwnlist) {
			if (country.getText().equals(vendorCountry)) {
				clickElement(country);
				logInfo("Vendor Entity country from dropdown is slelected");
				break;
			}
		}

		clickElement(softHardCountrySelect);
		String softwareCountryUSA = ExcelUtilities.SetExcelPath(FilePath, Sheet, 30, 1);

		for (WebElement countrySH : Tax_thirdPurchase_SoftHardCon_Drpdwnlist) {
			if (countrySH.getText().equals(softwareCountryUSA)) {
				clickElement(countrySH);
				logInfo("Location where the Software/Hardwre will reside  is slelected from dropdown");
				break;
			}
		}

		clickElement(softDeliverySelect);
		String softwareDelivery = ExcelUtilities.SetExcelPath(FilePath, Sheet, 32, 1);

		for (WebElement softwareD : Tax_thirdPurchase_SoftDelivery_Drpdwnlist) {
			if (softwareD.getText().equals(softwareDelivery)) {
				clickElement(softwareD);
				logInfo("software delivered electronically is slelected from dropdown");
				break;
			}
		}

		clickElement(softHardPriceValue);
		clear(softHardPriceValue);

		String priceValue = ExcelUtilities.SetExcelPath(FilePath, Sheet, 34, 1);

		sendKeys(softHardPriceValue, priceValue);

		clickElement(thirdPurchaseSave);

		String message = "";
		try {
			message = waitForElementToBeVisible(thirdPurchaseSavePopup).getAttribute("title");
		} catch (Exception e) {
		}

		if (message.contains("Record saved successfully."))
			logPass("Record is successfully saved");
		else {
			logFail("Popup gives error message: " + message);
			ScenarioFlag = false;

		}
		if (ScenarioFlag == true)
			scenarioPass();
	}

	/**
	 * @author riya.c.goyal
	 * @scenario -TC:104 Validate if the SA is able to configure the Intellectual
	 *           Property Licensing tab under Tax Input and save
	 * @date - 06/03/2024
	 * @release March 16
	 * 
	 */

	public void intellectTab(String FilePath, String Sheet, int Row, int Col) throws Exception {
		boolean scenarioFlag = true;
		Navigate_to_subTab(GlobalScreen.SUBTAB_Tax_IntellectualPropertyLicensing);
//		waitForElementToBeVisible(intellectProp);
//		clickElement(intellectProp);		
		
		waitForElementToBeVisible(Intellect_toggle);
		String toggleColor = Intellect_toggle.getCssValue("background");
		logInfo("toggleColor: " + toggleColor);

		if (toggleColor.contains("rgb(216, 216, 216)")) {
			clickElement(Intellect_toggle);
		} else {
			logPass("Toggle is already on Yes button");
		}

		waitForElementToBeVisible(intellectPurchasingCountrySelect);

		clickElement(intellectPurchasingCountrySelect);

		String inPurchasingCountry = ExcelUtilities.SetExcelPath(FilePath, Sheet, 39, 1);

		for (WebElement ipname : intellectPurchasingCountryDrpDwn) {
			if (ipname.getText().equals(inPurchasingCountry)) {
				clickElement(ipname);
				logInfo("Purchasing Entity Country/Location from dropdown is selected");
				break;
			}
		}
		waitForElementToBeVisible(intellectValue);
		clickElement(intellectValue);
		clear(intellectValues);
		String intellectvalue = ExcelUtilities.SetExcelPath(FilePath, Sheet, 41, 1);

		sendKeys(intellectValues, intellectvalue);

		clickElement(intellectSave);

		String message = "";
		try {
			message = waitForElementToBeVisible(intellectSavePopUp).getAttribute("title");
		} catch (Exception e) {
		}

		if (message.equals("Record saved successfully."))
			logPass("Record is successfully saved");
		else {
			logFail("Popup gives error message: " + message);
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * @author shreya.sharad.jadhav riya.c.goyal
	 * @scenario -TC:105 Validate if the SA is able to configure the Acquiring
	 *           Client Assets tab under Tax Input and save
	 * @date - 07/03/2024
	 * @release March 16
	 * 
	 */

	public void aquaringClientAssests(String FilePath, String Sheet, int Row, int Col) throws Exception {

		boolean scenarioFlag = true;
		Navigate_to_subTab(GlobalScreen.SUBTAB_Tax_AcquiringClientAssets);
//		waitForElementToBeVisible(aquaringLoad);
//		clickElement(aquaringLoad);

		String ripple = aquaringloadToggle.getCssValue("background");

		logInfo(ripple);
		// if (toggle.equals(GlobalScreen.toggle_grey)) {
		if (ripple.contains("rgb(216, 216, 216)")) {
			clickElement(aquaringloadToggle);
		} else {
			logPass("Ripple is already on Yes button");
		}

		waitForElementToBeVisible(aquaringClientLoctionEMPSelect);
		clickElement(aquaringClientLoctionEMPSelect);

		String locationnEMP = ExcelUtilities.SetExcelPath(FilePath, Sheet, 46, 1);

		for (WebElement location : Tax_auqaringClient_EmployeeLoc_Drpdwnlist) {
			if (location.getText().equals(locationnEMP)) {
				clickElement(location);
				logInfo("Location of employee is selected from dropdown");
				break;
			}
		}

		clickElement(employeRemainCountrySelect);
		String EmployeeContry = ExcelUtilities.SetExcelPath(FilePath, Sheet, 47, 1);

		for (WebElement employee : Tax_auqaringClient_Employeeremain_Drpdwnlist) {
			if (employee.getText().equals(EmployeeContry)) {
				clickElement(employee);
				logInfo("Employee is remain in country or not slelected from dropdown");
				break;
			}
		}

		waitForElementToBeVisible(employeeNOValues);
		clickElement(employeeNOValues);
		clear(employeeNOValues1);
		String employeNum = ExcelUtilities.SetExcelPath(FilePath, Sheet, 48, 1);

		sendKeys(employeeNOValues1, employeNum);

		clickElement(location_thirdClient_Select);
		String clientThirdParty = ExcelUtilities.SetExcelPath(FilePath, Sheet, 52, 1);

		for (WebElement clientT : Tax_auqaringClient_thirdClient_Drpdwnlist) {
			if (clientT.getText().equals(clientThirdParty)) {
				clickElement(clientT);
				logInfo("Location of client third party contracts is slelected from dropdown");
				break;
			}
		}

		clickElement(crossBorder_Select);
		String crossBorder = ExcelUtilities.SetExcelPath(FilePath, Sheet, 53, 1);

		for (WebElement crossB : Tax_auqaringClient_crossBorder_Drpdwnlist) {
			if (crossB.getText().equals(crossBorder)) {
				clickElement(crossB);
				logInfo("Cross border agreement is slelected from dropdown");
				break;
			}
		}

		waitForElementToBeVisible(natureOfGoods);
		clickElement(natureOfGoods);
		clear(natureOfGoods);
		String natureGoods = ExcelUtilities.SetExcelPath(FilePath, Sheet, 54, 1);
		sendKeys(natureOfGoods, natureGoods);
		logInfo("Record for row 2 is filled");

		waitForElementToBeVisible(natureOfAssests);
		clickElement(natureOfAssests);
		clear(natureOfAssests);
		String natureAssests = ExcelUtilities.SetExcelPath(FilePath, Sheet, 58, 1);
		sendKeys(natureOfAssests, natureAssests);
		logInfo("Nature of Assests is filled");

		clickElement(loctaionOfAssests_Select);
		String assetsLocation = ExcelUtilities.SetExcelPath(FilePath, Sheet, 59, 1);

		for (WebElement assetL : Tax_auqaringClient_AssetLocation_Drpdwnlist) {
			if (assetL.getText().equals(assetsLocation)) {
				clickElement(assetL);
				logInfo("Location of asset is slelected from dropdown");
				break;
			}
		}

		clickElement(assetCountry_Select);
		String assetcountry = ExcelUtilities.SetExcelPath(FilePath, Sheet, 60, 1);

		for (WebElement assetC : Tax_auqaringClient_AssetLocation_Drpdwnlist) {
			if (assetC.getText().equals(assetcountry)) {
				clickElement(assetC);
				logInfo("Asset stay in that Country/Location is selected from dropdown");
				break;
			}
		}

		waitForElementToBeVisible(purchasePriceSelect);
		clickElement(purchasePriceSelect);
		clear(purchasePriceSelect);
		String pricePurchase = ExcelUtilities.SetExcelPath(FilePath, Sheet, 62, 1);
		sendKeys(purchasePriceSelect, pricePurchase);
		logInfo("Price Purchase is filled");

		clickElement(aquaringSave);
		String message = "";
		try {
			message = waitForElementToBeVisible(aquaringSavePopUp).getAttribute("title");
		} catch (Exception e) {
		}

		if (message.contains("Record saved successfully."))
			logPass("Record is successfully saved");
		else {
			logFail("Popup gives error message: " + message);
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario - TC:106 Validate if the SA is able to configure the Contract and
	 *           Pricing tab under Tax Input and save
	 * @date - 07/03/2024
	 * @release March 16
	 * 
	 */

	public void contractAndPricingTab(String FilePath, String Sheet, int Row, int Col) throws Exception {

		boolean scenarioFlag = true;
		Navigate_to_subTab(GlobalScreen.SUBTAB_Tax_ContractAndPricing);
//		waitForElementToBeVisible(contractPrice);
//		clickElement(contractPrice);
		waitForElementToBeVisible(contractPriceToggle);
		String toggle = contractPriceToggle.getCssValue("background");

		logInfo("toggle: " + toggle);
		// if (toggle.equals(GlobalScreen.toggle_grey)) {
		if (toggle.contains("rgb(216, 216, 216)")) {
			clickElement(contractPriceToggle);
		} else {
			logPass("Toggle is already on Yes button");

		}

		clickElement(masterServiceCPSelect);
		String masterService = ExcelUtilities.SetExcelPath(FilePath, Sheet, 66, 1);

		for (WebElement serviceM : Tax_contractPricing_MasterService_Drpdwnlist) {
			if (serviceM.getText().equals(masterService)) {
				clickElement(serviceM);

				logInfo("Master service agreement  is slelected from dropdown");
				break;
			}
		}

		clickElement(strcturePriceSelect);
		String priceStructure = ExcelUtilities.SetExcelPath(FilePath, Sheet, 67, 1);

		for (WebElement priceS : Tax_contractPricing_priceStructure_Drpdwnlist) {
			if (priceS.getText().equals(priceStructure)) {
				clickElement(priceS);

				logInfo("Pricing structure  is slelected from dropdown");
				break;
			}
		}

		clickElement(contractingEntitySelect);
		String contractEntity = ExcelUtilities.SetExcelPath(FilePath, Sheet, 68, 1);

		for (WebElement contractE : Tax_contractPricing_ContractPrice_Drpdwnlist) {
			if (contractE.getText().equals(contractEntity)) {
				clickElement(contractE);
				logInfo("Local country/Location is slelected from dropdown");
				break;
			}
		}

		clickElement(contractPriceSave);

		String message = "";
		try {
			message = waitForElementToBeVisible(contractPriceSavePopup).getAttribute("title");
		} catch (Exception e) {
		}

		if (message.contains("Record saved successfully."))
			logPass("Record is successfully saved");
		else {

			logFail("Popup gives error message: " + message);
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

}
