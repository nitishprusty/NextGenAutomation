package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import org.openqa.selenium.*;


//import commonUtility.ExcelUtilities;
import reusableComponents.ConstantUtils;
import reusableComponents.ExcelUtilities;
import reusableComponents.GlobalScreen;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.FunctionLibrary;
import org.apache.poi.ss.usermodel.*;


public class GeneratePricing_Page extends BasePage {

	public Actions action = new Actions(getDriver());
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	Random random = new Random();
	
	
	/************************** LOCATORS *****************************/
	
	@FindBy(how = How.XPATH, using = "//li//a[text()='Manage']")
	public WebElement ManageBtn;

	@FindBy(how = How.XPATH, using = "//div[@class = 'next-img']")
	public WebElement Next_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='shapingParameters']/a")
	public WebElement GeneratePricing_Tab;

	@FindBy(how = How.XPATH, using = "//a[@id='CostsimulationTab']")
	public WebElement OneClickPricing_Subtab;

	@FindBy(how = How.XPATH, using = "//*[@id='headingTwo' and @href = '#dvScpConfig']//h4//img[@title = 'Click to expand']")
	public WebElement OpenClusterManagement_Sec;

	@FindBy(how = How.XPATH, using = "//*[@id='headingTwo' and @href = '#dvScpConfig']//h4//img[@title = 'Click to collapse']")
	public WebElement CloseClusterManagement_Sec;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSCPcluster1']/img")
	public WebElement CreateCluster_Icon;

	@FindBy(how = How.XPATH, using = "//*[@id='txtclusterName']")
	public WebElement ClusterName_Input;

	@FindBy(how = How.XPATH, using = "//*[@id='ListGroups']//input")
	public List<WebElement> MapGroups;

	@FindBy(how = How.XPATH, using = "//*[@id='SCPCluster-popup']//em[text() = 'Save']")
	public WebElement AddClusterSave_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='SCPSuccessErrorMessage']/span")
	public WebElement SCP_Label;

	@FindBy(how = How.XPATH, using = "//*[@id='dvScpConfig']//tbody//tr//img[@title = 'Edit']")
	public List<WebElement> ClusterEdit_Icon;

	@FindBy(how = How.XPATH, using = "//*[@id='dvScpConfig']//tbody//tr")
	public List<WebElement> TotalCluster_Items;

	@FindBy(how = How.XPATH, using = "//*[@id='SCPCluster-popup']//em[text() = 'Update']")
	public WebElement Update_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='dvScpConfig']//tbody//tr//img[@title = 'Delete']")
	public List<WebElement> ClusterDelete_Icon;

	@FindBy(how = How.XPATH, using = "//*[@id='headingOne1']//h4//img[@title = 'Click to expand']")
	public WebElement OpenSimulationConfig_Sec;

	@FindBy(how = How.XPATH, using = "//*[@id='headingOne1']//h4//img[@title = 'Click to collapse']")
	public WebElement CloseSimulationConfig_Sec;

	@FindBy(how = How.XPATH, using = "//*[@id='rdaioPricingDesabled']")
	public WebElement StandardHrs_Radiobtn;

	@FindBy(how = How.XPATH, using = "//*[@id='rdaioPricingEnabled']")
	public WebElement MMEHrs_Radiobtn;

	@FindBy(how = How.XPATH, using = "//*[@id='txtBillingDiscount']")
	public WebElement BillingDiscount_InputField;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSaveScpScreen']")
	public WebElement OCPSave_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSimulateSolution']/em")
	public WebElement SimulateCostPrice_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='IsSCCSuggesion']//em[text() = 'OK']")
	public WebElement AlertOk_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='CostSimultion-popup']//em")
	public WebElement CostSimulation_Popup;

	@FindBy(how = How.XPATH, using = "//*[@id='nearShorePopUp']//em[text() = 'Without Nearshore']")
	public WebElement WithOutNearShore_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='divScpProgressBar']//ul//li")
	public List<WebElement> SCPProgress_Bar;

	@FindBy(how = How.XPATH, using = "//div[@class = 'year-section']//div[contains(@id,'Carousel-inner') and not(@style = 'visibility:hidden')]//input")
	public List<WebElement> Years_InputField;

	@FindBy(how = How.XPATH, using = "//div[@id = 'divScpProgressBar']//li[@id='simulationComplete']")
	public WebElement SimulationRequest_Bar;

	@FindBy(how = How.XPATH, using = "//a[@id='btnRequestPricing']")
	public WebElement RequestPricing_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='IsSCCSuggesion']//em[text() = 'OK']")
	public WebElement SCCSuggestionOK_Btn;

	@FindBy(how = How.XPATH, using = "//div[@row-index = '0']//div[@col-id = '0']//span//span")
	public WebElement TaxStatus_Sec;

	@FindBy(how = How.XPATH, using = "//*[@id='PricingFactorTab']")
	public WebElement PricingFactor_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='headingOne1']")
	public WebElement SimulationConfiguration_ParentDiv;

	@FindBy(how = How.XPATH, using = "//*[@id='dvScpConfig']")
	public WebElement ClusterManagement_ParentDiv;

	@FindBy(how = How.XPATH, using = "//*[@id='requestPricing']//button//em[text() = 'NO TAX']")
	public WebElement RequestPricingNOTAX_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSimulateSolutionAbort']/em")
	public WebElement Abort_Btn;

	@FindBy(how = How.XPATH, using = "//div[@row-index = '0']//div[@col-id = '2']//span//a")
	public WebElement MMP_Link;

	@FindBy(how = How.XPATH, using = "//div[@class = 'previous-img']")
	public WebElement Previous_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='defineProfiles']/a")
	public WebElement Profiles_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='profile-active']//div[@ref='eBodyViewport']")
	public WebElement Profile_Grid;

	@FindBy(how = How.XPATH, using = "//*[@id='gridActive']//div[@row-id = '0']//img[@title = 'Edit']")
	public WebElement ProfileTabEdit_Icon;

	@FindBy(how = How.XPATH, using = "//*[@id='spnCity']")
	public WebElement ProfileTabCity_InputField;

	@FindBy(how = How.XPATH, using = "//*[@id='frmProfileDetails']//em[text() = 'Save']")
	public WebElement ProfileTabSave_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='profile-add']//span[text() = '×']")
	public WebElement ProfileTabClose_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='AlertMsgspn']")
	public WebElement ProfileTabSaveAlert;

	@FindBy(how = How.XPATH, using = "//*[@id='defineGroups']/a")
	public WebElement GroupsTab;

	@FindBy(how = How.XPATH, using = "//*[@id='ActiveGroupsGrid']//div[@ref = 'eBodyViewport']")
	public WebElement Groups_Grid;

	@FindBy(how = How.XPATH, using = "//*[@id='ActiveGroupsGrid']//div[@row-id = '0']//img[@title = 'Edit']")
	public WebElement GroupsEdits_icon;

	@FindBy(how = How.XPATH, using = "//*[@id='btnADTier']")
	public WebElement GroupsSkillTier;

	@FindBy(how = How.XPATH, using = "//*[@id='group-add']//em[text() = 'Save']")
	public WebElement GroupsSave_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='autoRefreshPopupIDGroup']//em[text() = 'OK']")
	public WebElement GroupsOk_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='AlertspnActiveGridMsg']")
	public WebElement GroupsStatus_Label;

	@FindBy(how = How.XPATH, using = "//*[@id='btnGenerateADL']")
	public WebElement GenerateADL_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='pricing-factor-general-adl']//em")
	public WebElement ADLVersion_Popup;

	@FindBy(how = How.XPATH, using = "//*[@id='ADLGenerationPricingNo']/em")
	public WebElement DealAnalytics_Popup;

	@FindBy(how = How.XPATH, using = "//*[@id='upload-adl-to-datalake-response']//em")
	public WebElement Successful_Popup;

	@FindBy(how = How.XPATH, using = "//div[@row-index = '0']//div[@col-id = '0']//span//span")
	public WebElement ADL_Status;

	@FindBy(how = How.XPATH, using = "//div[@row-index = '0']//div[@col-id = 'AdlDocumentNm']//a//img")
	public WebElement ADLReportDownload_Btn;
	
	@FindBy(how = How.XPATH, using = "//div[@row-index = '0']//div[@col-id = 'AdlDocumentNm']//span//span")
	public WebElement ADLFileName_Sec;

	@FindBy(how = How.XPATH, using = "//*[@id='mat-dialog-0']//em")
	public WebElement ConfidentialReminder_Popup;

	@FindBy(how = How.XPATH, using = "//*[@id='btnappdealdetail']//div[contains(@class,'breadcrumb-right')]")
	public WebElement DataContent;

	@FindBy(how = How.XPATH, using = "//*[@id='btnViewSCP']/em")
	public WebElement ViewSCP_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='openModalButton']/img")
	public WebElement KDADownload_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='ddlScpExcelYearWise']")
	public WebElement KDAReportType_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='ulVersion']//li//a")
	public List<WebElement> KDAReportType_Drpdown;

	@FindBy(how = How.XPATH, using = "//*[@id='excelInfoOk']/em")
	public WebElement ExcelDownload_Btn;

	@FindBy(how = How.XPATH, using = "//*[text()= 'Manage']")
	public WebElement Manage_Btn;

	@FindBy(how = How.XPATH, using = "//div[@class='next-img']")
	public WebElement scroll;

	@FindBy(how = How.XPATH, using = "//p[@id='shapingParameters']//a")
	public WebElement generate_Price;

	@FindBy(how = How.XPATH, using = "//a[@id='PricingFactorTab']")
	public WebElement pricing_Factor;

	@FindBy(how = How.XPATH, using = "	//div[@id='headingPricingOne']")
	public WebElement working_Capital_Days;

	@FindBy(how = How.XPATH, using = "//button[@id='btnBillingDays']")
	public WebElement PricingFactor_Billing_Days;

	@FindBy(how = How.XPATH, using = "//*[@id='btnBillingDays']/../ul/li/a")
	public List<WebElement> PricingFactor_WCBillingDaysOptions;

	@FindBy(how = How.XPATH, using = "//button[@id='btnExpenceDays']")
	public WebElement PricingFactor_WCExpense_Days;

	@FindBy(how = How.XPATH, using = "//*[@id='btnExpenceDays']/../ul/li/a")
	public List<WebElement> PricingFactor_WCExpenseDaysOptions;

	@FindBy(how = How.XPATH, using = "//div[@id='headingPricingTwo']//h4")
	public WebElement Pricing_Option;
	
	@FindBy(how = How.XPATH, using = "//div[@id='headingPricingTwo']/h4/img[@title='Click to expand']")
	public WebElement Expand_Pricing;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"headingPricingTwo\"]/h4/img[@title='Click to expand']")
	public WebElement Collapse_Pricing;

	@FindBy(how = How.XPATH, using = "//input[@id='txtContigency']")
	public WebElement Negotiation_Contingency;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtContigency' and @title]")
	public WebElement Negotiation_Contingency1;
	

	@FindBy(how = How.XPATH, using = "//input[@id='txtVAT']")
	public WebElement VAT_text;

	@FindBy(how = How.XPATH, using = "//input[@id='txtEarlyPaymentDisc']")
	public WebElement Early_Payment;

	@FindBy(how = How.XPATH, using = "//input[@id='txtRevenueFXPremium']")
	public WebElement Revenue;

	@FindBy(how = How.XPATH, using = "//*[@id='headingPricingThree']/h4/img[@title='Click to expand']")
	public WebElement Billing_Option;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnBillingOption']")
	public WebElement PricingFactor_InvoiceBilling_dropdown;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnBillingOption']/../ul/li")
	public List<WebElement> PricingFactor_BillingIssueOptions;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnBillingPeriodList']")
	public WebElement PricingFactor_BillingPeriodLength_dropdown;

	@FindBy(how = How.XPATH, using = "//button[@id='btnNumOfMonthsNArrears']")
	public WebElement PricingFactor_NumberofMonthsArrears_dropdown;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnMonthsBeforeWorkStart']")
	public WebElement PricingFactor_NumberofMonthsBefore_dropdown;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnMonthsWithBillingPeriod']")
	public WebElement PricingFactor_BillingMonthPeriod_dropdown;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnMonthsWithBillingPeriod']")
	public WebElement PricingFactor_BillingMonth_dropdown;

	@FindBy(how = How.XPATH, using = "//button[@id='btnBillingPeriodList']")
	public WebElement PricingFactor_BillingPeriodLength;

	@FindBy(how = How.XPATH, using = "//button[@id='btnBillingPeriodList']/../ul/li")
	public List<WebElement> PricingFactor_BillingPeriodLengthOptions;

	@FindBy(how = How.XPATH, using = "//button[@id='btnMonthsWithBillingPeriod']")
	public WebElement PricingFactor_BillingMonthInBillingPeriod;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnMonthsWithBillingPeriod']/../ul/li")
	public List<WebElement> PricingFactor_BillingMonthOptions;

	@FindBy(how = How.XPATH, using = "//button[@id='btnNumOfMonthsNArrears']")
	public WebElement PricingFactor_NoOfMonthArrears;

	@FindBy(how = How.XPATH, using = "//button[@id='btnBillingPeriodList']")
	public WebElement PricingFactor_BillingMonthOptions_popup;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnMonthsBeforeWorkStart']/../ul/li")
	public List<WebElement> PricingFactor_NoOfMonthsBeforeWorkStartOptions;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnNumOfMonthsNArrears']/../ul/li")
	public List<WebElement> PricingFactor_MonthArrearOptions;

	@FindBy(how = How.XPATH, using = ".//*[@id='btnMonthsBeforeWorkStart']")
	public WebElement PricingFactor_NoOfMonthsBeforeWorkStart;

	@FindBy(how = How.XPATH, using = "//*[@id='headingPricingFour']")
	public WebElement Service_Credit;

	@FindBy(how = How.XPATH, using = "//*[@id='headingPricingFour']/h4/img[@title='Click to expand']")
	public WebElement Expand_service;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtTotalFeeAtRisk' and @type='text']")
	public WebElement Total_fees;

	@FindBy(how = How.XPATH, using = "//input[@id='txtProvision4ServiceCredits']")
	public WebElement Provision_service;

	@FindBy(how = How.XPATH, using = "//textarea[@id='ServiceCreditReasonTxtId']")
	public WebElement ReasonFor_service;

	@FindBy(how = How.XPATH, using = "//input[@id='txtServiceCreditAssessmentPeriod']")
	public WebElement Service_Assesment;

	@FindBy(how = How.XPATH, using = "//*[@id='sp-pricing-factors']//em[text()='Save']")
	public WebElement SavePopup;

	@FindBy(how = How.XPATH, using = "//*[@id='liADL']")
	public WebElement GenerateADLBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='ADLGrid']//*[@class='ag-body-viewport ag-layout-normal']//div[contains(@class,'ag-body-container')]//div[@row-id='0']//div[@col-id='0']/span/child::*")
	public WebElement ADLStatus;

	@FindBy(how = How.XPATH, using = "//a[@id='btnSubmitADL']")
	public WebElement GenerateADLSubmitBtn;

	@FindBy(how = How.XPATH, using = "//div[@id='IsSCCSuggesion']//em[text()='OK']")
	public WebElement ADL_Warning_OK_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='pricing-factor-general-adl']//button/em")
	public WebElement ADLSubmit_Ok_R13;

	@FindBy(how = How.XPATH, using = "//p[@id='successErrorMsgId']//span")
	public WebElement ADLSubmit_PopupMesg;

	@FindBy(how = How.XPATH, using = "//p[@id='successErrorMsgId']//span")
	public WebElement RequestPricing_PopupMesg;

	@FindBy(how = How.XPATH, using = "//*[@id='ddlADLVersion']")
	public WebElement Solutionshaping_ddlADLVersion;

	@FindBy(how = How.XPATH, using = "//*[@id='ulVersion']/li")
	public WebElement Solutionshaping_R13;

	@FindBy(how = How.XPATH, using = "//*[@id='pricing-factor-general-adl']//button//em[text()='Ok']")
	public WebElement SelectADLVersion_btnGenerateADLOK;

	@FindBy(how = How.XPATH, using = "//button[@id='ADLGenerationPricingNo']//em")
	public WebElement Upload_confirmationWarringNo;

	@FindBy(how = How.XPATH, using = "//p[@id='ADLUploadPopupMessage']")
	public WebElement ADLGeneration_ProcessTab;

	@FindBy(how = How.XPATH, using = "//*[@class='clickableImage']")
	public WebElement ADLGeneration_DownloadTab;

	@FindBy(how = How.XPATH, using = "//div[@id='cdk-overlay-0']//em")
	public WebElement ADLGeneration_IUnderstandTab;

	@FindBy(how = How.XPATH, using = "//*[@id='upload-adl-to-datalake-response']//button//em")
	public WebElement ADLGeneration_ProcessTabOK;

	@FindBy(how = How.XPATH, using = "//a[@data-button-id='manageversionid']")
	public WebElement Version_Tab;

	@FindBy(how = How.XPATH, using = "//a[@id='CSIAutoLock' and contains(text(),'144.0')]")
	public WebElement Version;

	@FindBy(how = How.XPATH, using = "//a[@id='btnRequestPricing']")
	public WebElement RequestPricingBtn;

	@FindBy(how = How.XPATH, using = "//div[@id='IsSCCSuggesion']//em[text()='OK']")
	public WebElement SCC_RequestPricing_OK_Btn;

	@FindBy(how = How.XPATH, using = "//div[@id='requestPricing']//em[text()='ACTUAL TAX']")
	public WebElement RequestPricing_TaxOption;

	@FindBy(how = How.XPATH, using = "//div[@id='nearShorePopUp']//em[text()='Without Nearshore']")
	public WebElement RequestPricing_NearshoreOption;

	@FindBy(how = How.XPATH, using = "//*[@id='MMPGrid']//*[@class='ag-body-viewport ag-layout-normal']//div[contains(@class,'ag-body-container ag-layout-normal')]//div[@row-id='1']//div[@col-id='0']/span/child::*")
	public WebElement PricingStatus;

	@FindBy(how = How.XPATH, using = "//a[@id='btnSubmitPricing']")
	public WebElement RequestPricingSubmitBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='btnappdealdetail']//h2")
	public WebElement SoluntionVersion;

	@FindBy(how = How.XPATH, using = "//div[@row-index='1']/div[contains(@col-id,'SolutionVersionNbrtooltip')]//a")
	public WebElement newVersioncopy;
	
	@FindBy(how = How.XPATH, using = "//*[@id='shapingParameters']//parent::div")
	public WebElement GeneratePricingTab;
	
	@FindBy(how = How.ID, using = "CostingTab")
	public WebElement GeneratePricing_CostingFactorsSubtab;
	
	@FindBy(how = How.ID, using = "PricingFactorTab")
	public WebElement GeneratePricing_PricingFactorsSubtab;
	
	@FindBy(how = How.ID, using = "adlStatusTab")
	public WebElement GeneratePricing_ADLStatusSubtab;
	
	@FindBy(how = How.ID, using = "PricingStatusTab")
	public WebElement GeneratePricing_PricingStatusSubtab;
	
	@FindBy(how = How.ID, using = "CostsimulationTab")
	public WebElement GeneratePricing_OneClickPricingSubtab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='ContractualCoverageApproach']")
	public List<WebElement> shapingparam_Costing_COLAContrCoverageApp_List;
	
	@FindBy(how = How.XPATH, using = "//*[@col-id='StaffingProfile'][not(@role='presentation')]")
	public List<WebElement> CostingFactors_StaffingProfile_List;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='CoverageStartDtm']//label")
	public List<WebElement> shapingparam_Costing_COLACoverageStartDtm_Rowslabel;

	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='CoverageEndDtm']//label")
	public List<WebElement> shapingparam_Costing_COLACoverageEndDtm_Rowslabel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='CoverageStartDtm']")
	public List<WebElement> shapingparam_Costing_COLACoverageStartDtm_RowsList;

	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='CoverageStartDtm']//input")
	public WebElement shapingparam_Costing_COLACoverageStartDtm_Row1Input;

	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='CoverageEndDtm']")
	public List<WebElement> shapingparam_Costing_COLACoverageEndDtm_RowsList;

	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='CoverageEndDtm']//input")
	public WebElement shapingparam_Costing_COLACoverageEndDtm_Row1Input;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='FixedCola']//input")
	public WebElement shapingparam_Costing_COLAFixedCola_Row1Input;

	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='FixedCola']")
	public List<WebElement> shapingparam_Costing_COLAFixedCola_RowsList;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='IndexCountry']")
	public List<WebElement> shapingparam_Costing_COLAIndexCountry_List;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='Index']")
	public List<WebElement> shapingparam_Costing_COLAIndex_List;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id = 'IndexApproach'][not(@role='presentation')]/span/span")
	public List<WebElement> GeneratePricing_CostingFactors_COLACoverage_IndexApproach_dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@col-id='PectofIndex'][not(@role='presentation')]")
	public List<WebElement> CostingFactors_PercentageList;

	@FindBy(how = How.XPATH, using = "//*[@col-id='PectofIndex'][not(@role='presentation')]//input")
	public WebElement PercentageInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ddindexcountry']")
	public List<WebElement> shapingparam_Costing_COLAddindexcountry;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ddindex']")
	public List<WebElement> shapingparam_Costing_COLAddindex;

	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='FixedCola']//label")
	public List<WebElement> shapingparam_Costing_COLAFixedCola_Rowslabel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ddindexapproach']")
	public List<WebElement> shapingparam_Costing_COLAddindexapproach;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='PectofIndex']//label")
	public List<WebElement> shapingparam_Costing_COLAPectofIndex_Rowslabel;
	
	@FindBy(how = How.XPATH, using = "//div[@id='headingOne']/h4")
	public WebElement ShapingParm_CostingFactors_ContractualCOLACoverage_Expand_Minimize;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id= 'StartDateForex'][not(@role= 'presentation')]")
	public WebElement GeneratePricing_CostingFactors_FXRisk_StartDate;

	@FindBy(how = How.XPATH, using = "//div[@col-id= 'EndDateForex'][not(@role= 'presentation')]")
	public WebElement GeneratePricing_CostingFactors_FXRisk_EndDate;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id= 'CoverageForex'][not(@role= 'presentation')]//input")
	public WebElement GeneratePricing_CostingFactors_FXRisk_Coverage_input;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnSaveCostingFactors']")
	public WebElement shapingparam_Costing_Save;
	
	@FindBy(how = How.XPATH, using = "//div[@id='headingThree'][@href='#collapseThree']/h4")
	public WebElement ShapingParm_CostingFactors_TransitionAccounting_expand_minimise;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='TerminationEndDate'][not(@role='presentation')]//label")
	public WebElement ShapingParm_CostingFactors_TransitionAccounting_TerminationEndDate;

	@FindBy(how = How.XPATH, using = "//div[@col-id='TerminationEndDate'][not(@role='presentation')]//input")
	public WebElement ShapingParm_CostingFactors_TransitionAccounting_TerminationEndDate_input;
	
	@FindBy(how = How.ID, using = "ErrCFSuccessMessage")
	public WebElement ShapingParm_CostingFactors_Error_Success_msg;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnSaveCostingFactors']/../..//em[text()='Cancel']")
	public WebElement ShapingParm_CostingFactors_Cancel_btn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='SolutionGroupId']")
	public WebElement Rampup_group;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulsolutiongroups']//li")
	public List<WebElement> Rampup_GroupDrpdwnli;
	
	@FindBy(how = How.XPATH, using = "//button[@id='GroupPeriodId']")
	public WebElement DStaffing_YearDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnsave']")
	public WebElement Rampup_Save;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text() ,'Auto-Refresh')]/preceding-sibling::input[@id='rbt_C']")
	public WebElement MPyramid_SolutionRefresh_Popup_rbnType;
	
	@FindBy(how = How.XPATH, using = "//div[@id= 'autoRefreshPopupID1']//em[text()='OK']")
	public WebElement RampUp_AutoRefreshPopUp_Ok;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='ProtectionFeeCoverTransition'][not(@role='presentation')]")
	public WebElement ShapingParm_CostingFactors_TransitionAccounting_TerminationFeeCover;
	
	@FindBy(how = How.ID, using = "ProtectionFeedrpDown")
	public WebElement ShapingParm_CostingFactors_TransitionAccounting_TerminationFeeCover_dropdownSelect;
	
	@FindBy(how = How.XPATH, using = "//input[@id='TransitionCost'][not(@role='presentation')]")
	public WebElement ShapingParm_CostingFactors_TransitionAccounting_TransitionCost;
	
	@FindBy(how = How.XPATH, using = "//input[@id='TransitionBillingsDeferred'][not(@role='presentation')]")
	public WebElement ShapingParm_CostingFactors_TransitionAccounting_TransitionBillingsDeferred;
	
	@FindBy(how = How.XPATH, using = "//*[@id='NavUnauthorizedpopupIdCancel']/span")
	public WebElement Popup_Close;
	
	@FindBy(how = How.XPATH, using = "//div[@id='headingFour']/h4")
	public WebElement ShapingParm_CostingFactors_Bankwarranty_expand_minimise;

	@FindBy(how = How.XPATH, using = "//*[@id ='terminationGrid']//input[@id='TextInput']")
	public WebElement ShapingParm_CostingFactors_TransitionAccounting_Input;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id = 'BankWarranty'][not(@role = 'presentation')]")
	public WebElement GeneratePricing_CostingFactors_BankWarranty_field;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'BankWarranty'][not(@role = 'presentation')]/numeric-cell/input[@id = 'TextInput']")
	public WebElement GeneratePricing_CostingFactors_BankWarranty_Input;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'BankWarrentyDttm'][not(@role = 'presentation')]")
	public WebElement GeneratePricing_CostingFactors_StartDate_field;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'BankWarrentyDttm'][not(@role = 'presentation')]//input")
	public WebElement GeneratePricing_CostingFactors_StartDate_input;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'BWDurationMonth'][not(@role = 'presentation')]")
	public WebElement GeneratePricing_CostingFactors_Duration_field;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'BWDurationMonth'][not(@role = 'presentation')]//input")
	public WebElement GeneratePricing_CostingFactors_Duration_input;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'InterestRate'][not(@role = 'presentation')]")
	public WebElement GeneratePricing_CostingFactors_IntreastRate_field;

	@FindBy(how = How.XPATH, using = "//div[@col-id = 'InterestRate'][not(@role = 'presentation')]//input")
	public WebElement GeneratePricing_CostingFactors_IntreastRate_input;

	@FindBy(how = How.XPATH, using = "//*[@col-id='BankWarrentyDttm'][not(@role='presentation')]")
	public WebElement BankWarranty_StartDate;

	@FindBy(how = How.XPATH, using = "//*[@col-id='BankWarrentyDttm'][not(@role='presentation')]//input")
	public WebElement BankWarranty_StartDate_Input;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnSaveCostingFactors']")
	public WebElement CostingFactor_Save_button;
	
	@FindBy(how = How.XPATH, using = "//div[@id='headingOne']/h4")
	public WebElement ShapingParm_CostingFactors_ColaCoverage_expand_minimise;
	
	@FindBy(how = How.XPATH, using = "//div[@id='headingTwo']/h4/parent::div")
	public WebElement ShapingParm_CostingFactors_FixRate_expand_minimise;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='FXGrid']//*[@col-id='ForeignExchangeRiskPremium'][contains(@class,'ag-cell')]")
	public WebElement CostingFactors_FXExchangeRisk;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='CostingfactorfxdrpDown']")
	public WebElement CostingFactors_FXRiskSelectDrpDown;

	@FindBy(how = How.XPATH, using = "//p[@id='PFSuccessErrorMessage']//span")
	public WebElement SavePopupMessage;

	
	/************************** METHODS *****************************/
	SolutionComponentsPage solutioncomponentspage;
	WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(60));

	public GeneratePricing_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void navigateToManage() throws Exception {
		clickElement(Manage_Btn);
	}
	
	/**
	* TC 107 : Validate if user is able to navigate to Generate Pricing tab and view Costing Factor, Pricing Factor,ADL Status,Pricing Status,one click pricing tabs.
	* 
	* @since 07/03/2024
	* @release March 16
	* @author rupali.umat
	* 
	*/
	public void GeneratePricingTabsValidation() {
	boolean scenarioFlag = true;

	if(GeneratePricingTab.getAttribute("class").contains("active"))
		logPass("User is able to navigate to Generate Pricing tab successfully");
	else {
		logFail("User is NOT able to navigate to Generate Pricing tab");
		scenarioFlag = false;
	}

	if(GeneratePricing_CostingFactorsSubtab.getText().contains("Costing Factors"))
	{
		logPass("User is able to View Costing Factors Subtab in Generate Pricing");
	}
	else
	{
		logFail("User is NOT able to View Costing Factors Subtab in Generate Pricing");
		scenarioFlag = false;
	}

	if(GeneratePricing_PricingFactorsSubtab.getText().contains("Pricing Factors"))
	{
		logPass("User is able to View Pricing Factors Subtab in Generate Pricing");
	}
	else
	{
		logFail("User is NOT able to View Pricing Factors Subtab in Generate Pricing");
		scenarioFlag = false;
	}

	if(GeneratePricing_ADLStatusSubtab.getText().contains("ADL Status"))
	{
		logPass("User is able to View ADL Status Subtab in Generate Pricing");
	}
	else
	{
		logFail("User is NOT able to View ADL Status Subtab in Generate Pricing");
		scenarioFlag = false;
	}

	if(GeneratePricing_PricingStatusSubtab.getText().contains("Pricing Status"))
	{
		logPass("User is able to View Pricing Status Subtab in Generate Pricing");
	}
	else
	{
		logFail("User is NOT able to View Pricing Status Subtab in Generate Pricing");
		scenarioFlag = false;
	}

	if(GeneratePricing_OneClickPricingSubtab.getText().contains("One Click Pricing"))
	{
		logPass("User is able to View One Click Pricing Subtab in Generate Pricing");
	}
	else
	{
		logFail("User is NOT able to View One Click Pricing Subtab in Generate Pricing");
		scenarioFlag = false;
	}

	if(scenarioFlag == true)
		scenarioPass();

	}


	
	/**
	 * TC 108 : Validate if the user is able to configure Contractual COLA Coverage,FX Risk,Transition Account,Bank Warranty under Costing Factor Screen.
	 * 
	 * @since 08/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	public void ConfigureCostingFactorSubscreen(String FilePath, String Sheet) throws Exception  {
				
		String DealStartDate = ExcelUtilities.SetExcelPath(FilePath, Sheet, 35, 1);
		String DealEndDate = ExcelUtilities.SetExcelPath(FilePath, Sheet, 36, 1);
		
		EditCostingFactors_ContractualCOLACoverage(FilePath, Sheet, 29, DealStartDate,
				DealEndDate);
		EditFXRisk(FilePath ,Sheet);	
		EditTransitionAccounting(FilePath, Sheet);
		
		EditBankWarranty(FilePath,
				Sheet);		
		SaveCostingFactor();
		
	}
	
	/**
	 * This Method is created to Enter Contractual COLA Coverage subsection in Costing factors screen
	 * 
	 * @since 12/03/2024
	 * @release April 6
	 * @author rupali.umat
	 * 
	 */
	
	public void EditCostingFactors_ContractualCOLACoverage(String Filepath, String SheetName, int Rownumber,
			String DealStartDate, String DealEndDate) throws Exception {
		
		boolean scenarioFlag = true;
		int last_column = getlastCol(Filepath, SheetName, Rownumber);
		for (int i = 1; i <= last_column; i++) {
			String StaffingProfile = ExcelUtilities.SetExcelPath(Filepath, SheetName, 29, i);
			String ContractualCoverageApproach = ExcelUtilities.SetExcelPath(Filepath, SheetName, 30, i);
			String IndexCountry = ExcelUtilities.SetExcelPath(Filepath, SheetName, 31, i);
			String Index = ExcelUtilities.SetExcelPath(Filepath, SheetName, 32, i);
			String IndexApproach = ExcelUtilities.SetExcelPath(Filepath, SheetName, 33, i);
			String CapofIndex = ExcelUtilities.SetExcelPath(Filepath, SheetName, 34, i);

			for (int j = 0; j < shapingparam_Costing_COLAContrCoverageApp_List.size(); j++) {

				String StaffingProfileActual = CostingFactors_StaffingProfile_List.get(j)
						.getAttribute("title");
				if (StaffingProfileActual.contains(StaffingProfile)) {
					scrollToElement(shapingparam_Costing_COLAContrCoverageApp_List.get(j));
					expandDropdown(shapingparam_Costing_COLAContrCoverageApp_List.get(j));
					
					new Select(getDriver().findElement(By.xpath("//div[@col-id='ContractualCoverageApproach']//select")))
							.selectByVisibleText(ContractualCoverageApproach);
					
					// action.sendKeys(Keys.TAB).perform();
					if (ContractualCoverageApproach.contains("Client will cover up to")) {
						String StartDate = ExcelUtilities.SetExcelPath(Filepath, SheetName, 35, i);
						String EndDate = ExcelUtilities.SetExcelPath(Filepath, SheetName, 36, i);
						String Fixed = ExcelUtilities.SetExcelPath(Filepath, SheetName, 37, i);
						Date ShapingStartDate = format.parse(
								getText(shapingparam_Costing_COLACoverageStartDtm_Rowslabel.get(j)));
						Date ShapingEndDate = format
								.parse(getText(shapingparam_Costing_COLACoverageEndDtm_Rowslabel.get(j)));
						logInfo(DealStartDate);
						Date DealStartDate_param = format.parse(DealStartDate);
						Date DealEndDate_param = format.parse(DealEndDate);

						clickElement(shapingparam_Costing_COLACoverageStartDtm_RowsList.get(j));
						clear(shapingparam_Costing_COLACoverageStartDtm_Row1Input);
						sendKeys(shapingparam_Costing_COLACoverageStartDtm_Row1Input,StartDate);
						
						
						clickElement(shapingparam_Costing_COLACoverageEndDtm_RowsList.get(j));
						clear(shapingparam_Costing_COLACoverageEndDtm_Row1Input);
						sendKeys(shapingparam_Costing_COLACoverageEndDtm_Row1Input,EndDate);
						
						
						clickElement(shapingparam_Costing_COLAFixedCola_RowsList.get(0));
						clear(shapingparam_Costing_COLAFixedCola_Row1Input);
						if (!Fixed.equalsIgnoreCase("empty")) {
							// shapingparam_Costing_COLAFixedCola_Row1Input.sendKeys(FixedPer);
							sendKeys(getDriver().findElement(By.xpath(
									"//*[@id='frmCostingFactor']//div[contains(@class,'ag-body-container')]//div[@col-id='FixedCola']//input"))
									,Fixed);

						}
						
					} else if (ContractualCoverageApproach.contains("Contractual coverage based on Index")) {
						String StartDate = ExcelUtilities.SetExcelPath(Filepath, SheetName, 35, i);
						
						String EndDate = ExcelUtilities.SetExcelPath(Filepath, SheetName, 36, i);
						
						clickElement(shapingparam_Costing_COLAIndexCountry_List.get(j));
						
						Select IndexCountrySelect = new Select(
								getDriver().findElement(By.xpath("//div[@col-id='IndexCountry']//select")));
						IndexCountrySelect.selectByVisibleText(IndexCountry);
						
						shapingparam_Costing_COLAIndex_List.get(j).click();
						
						Select IndexSelect = new Select(getDriver().findElement(By.xpath("//*[@col-id='Index']//select")));
						IndexSelect.selectByVisibleText(Index);
						
						clickElement(shapingparam_Costing_COLACoverageStartDtm_RowsList.get(j));
						clear(shapingparam_Costing_COLACoverageStartDtm_Row1Input);
						sendKeys(shapingparam_Costing_COLACoverageStartDtm_Row1Input,StartDate);
						clickElement(shapingparam_Costing_COLACoverageEndDtm_RowsList.get(j));
						clear(shapingparam_Costing_COLACoverageEndDtm_Row1Input);
						sendKeys(shapingparam_Costing_COLACoverageEndDtm_Row1Input,EndDate);
						clickElement(GeneratePricing_CostingFactors_COLACoverage_IndexApproach_dropdown
								.get(j));
						Select IndexApproachSelect = new Select(
								getDriver().findElement(By.xpath("//*[@col-id='IndexApproach']//select")));
						IndexApproachSelect.selectByVisibleText(IndexApproach);
						clickElement(CostingFactors_PercentageList.get(j));
						clear(PercentageInput);
						sendKeys(PercentageInput,CapofIndex);
						
					} else {
						if (shapingparam_Costing_COLAddindexcountry.get(j).getAttribute("class")
								.equalsIgnoreCase("disabled")
								&& shapingparam_Costing_COLAddindex.get(j).getAttribute("class")
										.equalsIgnoreCase("disabled")
								&& getText(shapingparam_Costing_COLACoverageStartDtm_Rowslabel.get(j))
										.equals("")
								&& getText(shapingparam_Costing_COLACoverageEndDtm_Rowslabel.get(j))
										.equals("")
								&& getText(shapingparam_Costing_COLAFixedCola_Rowslabel.get(j)).equals("")
								&& shapingparam_Costing_COLAddindexapproach.get(j).getAttribute("class")
										.equalsIgnoreCase("disabled")
								&& getText(shapingparam_Costing_COLAPectofIndex_Rowslabel.get(j))
										.equals(""))
							logPass("Upon selecting 'No Contractual Coverage value' option all the options on the grid will be disabled.");
						else {
							logFail("Upon selecting 'No Contractual Coverage value' option all the options on the grid are not disabled.");
							scenarioFlag = false;
							
						}
					}
				}

			}

		}
		
		clickElement(ShapingParm_CostingFactors_ContractualCOLACoverage_Expand_Minimize);
		
		if (scenarioFlag == true)
			scenarioPass();
	}

	public int getlastCol(String Filepath, String SheetName, int Rownumber) throws Exception {
		int i = 0;
		for (i = 1; i < i + 1; i++) {
			try {
				String data = ExcelUtilities.SetExcelPath(Filepath, SheetName, Rownumber, i);
				if (data.equals(""))
					break;
			} catch (Exception e) {
				break;
			}
		}
		return i - 1;
	}
	
	/**
	 * This Method is created to Enter FX Risk in Costing factors screen
	 * 
	 * @since 12/03/2024
	 * @release April 6
	 * @author rupali.umat
	 * 
	 */

	public void EditFXRisk(String Filepath, String SheetName) throws Exception {
		boolean scenarioFlag = true;
		String ForeignExchangeRiskPremium = ExcelUtilities.SetExcelPath(Filepath, SheetName, 39, 1);
		String coverage_valid = ExcelUtilities.SetExcelPath(Filepath, SheetName, 40, 1);
		scrollToElement(ShapingParm_CostingFactors_FixRate_expand_minimise);
		ShapingParm_CostingFactors_FixRate_expand_minimise.click();
		
		scrollToElement(CostingFactors_FXExchangeRisk);
		clickElement(CostingFactors_FXExchangeRisk);
		
		scrollToElement(CostingFactors_FXRiskSelectDrpDown);
		Select fxExchangeSelect = new Select(CostingFactors_FXRiskSelectDrpDown);
		
		fxExchangeSelect.selectByVisibleText(ForeignExchangeRiskPremium);
		
		jse.executeScript("window.scrollBy(0, -900)", "");
		if (ForeignExchangeRiskPremium.contains("FX Risk is covered by the client")) {
			clickElement(GeneratePricing_CostingFactors_FXRisk_StartDate);
			try {
				if (isDisplayed(getDriver().findElement(By.xpath("//div[@col-id= 'StartDateForex'][not(@role= 'presentation')]//input"))) == false)
					logPass("Start Date field in FX Risk section is disabled for 'FX Risk is covered by the client' option");
				else {
					logFail("Start Date field in FX Risk section is not disabled for 'FX Risk is covered by the client' option");
					scenarioFlag = false;
					
				}
			} catch (Exception e) {
				logPass("Start Date field in FX Risk section is disabled for 'FX Risk is covered by the client' option");
			}
			clickElement(GeneratePricing_CostingFactors_FXRisk_EndDate);
			try {
				if (isDisplayed(getDriver().findElement(By.xpath("//div[@col-id= 'EndDateForex'][not(@role= 'presentation')]//input"))) == false)
					logPass(" End Date field in FX Risk section is disabled for 'FX Risk is covered by the client' option");
				else {
					logFail("End Date field in FX Risk section is not disabled for 'FX Risk is covered by the client' option");
					scenarioFlag = false;
					
				}
			} catch (Exception e) {
				logPass("End Date field in FX Risk section is disabled for 'FX Risk is covered by the client' option");
			}
			clickElement(getDriver().findElement(By.xpath("//div[@col-id= 'CoverageForex'][not(@role= 'presentation')]")));
			
			try {
				if (isDisplayed(GeneratePricing_CostingFactors_FXRisk_Coverage_input) == false)
					logPass("Coverage (%) field in FX Risk section is disabled for 'FX Risk is covered by the client' option");
				else {
					logFail("Coverage (%) field in FX Risk section is not disabled for 'FX Risk is covered by the client' option");
					scenarioFlag = false;
				
				}
			} catch (Exception e) {
				logPass("Coverage (%) field in FX Risk section is disabled for 'FX Risk is covered by the client' option");
			}
		} else if (ForeignExchangeRiskPremium.contains("Client will cover up to")) {
			if (!getText(GeneratePricing_CostingFactors_FXRisk_StartDate).equals(""))
				logPass("Start Date field in FX Risk section is enabled for 'Client will cover up to' option");
			else {
				logFail("Start Date field in FX Risk section is enabled for 'Client will cover up to' option");
				scenarioFlag = false;
				}
			if (!getText(GeneratePricing_CostingFactors_FXRisk_EndDate).equals(""))
				logPass("End Date field in FX Risk section is enabled for 'Client will cover up to' option");
			else {
				logFail(" End Date field in FX Risk section is not enabled for 'Client will cover up to' option");
				scenarioFlag = false;
				}
			clickElement(getDriver().findElement(By.xpath("//div[@col-id= 'CoverageForex'][not(@role= 'presentation')]")));
			
			clear(GeneratePricing_CostingFactors_FXRisk_Coverage_input);
			sendKeys(GeneratePricing_CostingFactors_FXRisk_Coverage_input,coverage_valid);
			
			
		} else {

			clickElement(GeneratePricing_CostingFactors_FXRisk_StartDate);
			try {
				if (isDisplayed(getDriver().findElement(By.xpath("//div[@col-id= 'StartDateForex'][not(@role= 'presentation')]//input"))) == false)
					logPass("Start Date field in FX Risk section is disabled for 'Client does not cover FX Risk' option");
				else {
					logFail("Start Date field in FX Risk section is not disabled for 'Client does not cover FX Risk' option");
					scenarioFlag = false;
					
				}
			} catch (Exception e) {
				logPass("Start Date field in FX Risk section is disabled for 'Client does not cover FX Risk' option");

			}
			clickElement(GeneratePricing_CostingFactors_FXRisk_EndDate);
			try {
				if (isDisplayed(getDriver().findElement(By.xpath("//div[@col-id= 'EndDateForex'][not(@role= 'presentation')]//input"))) == false)
					logPass("End Date field in FX Risk section is disabled for 'Client does not cover FX Risk' option");
				else {
					logFail("End Date field in FX Risk section is not disabled for 'Client does not cover FX Risk' option");
					scenarioFlag = false;
					}
			} catch (Exception e) {
				logPass("End Date field in FX Risk section is disabled for 'Client does not cover FX Risk' option");

			}

			clickElement(getDriver().findElement(By.xpath("//div[@col-id= 'CoverageForex'][not(@role= 'presentation')]")));
			try {
				if (isDisplayed(GeneratePricing_CostingFactors_FXRisk_Coverage_input) == false)
					logPass(" Coverage (%) field in FX Risk section is disabled for 'Client does not cover FX Risk' option");
				else {
					logFail("Coverage (%) field in FX Risk section is not disabled for 'Client does not cover FX Risk' option");
					scenarioFlag = false;
					
				}
			} catch (Exception e) {
				logPass("Coverage (%) field in FX Risk section is disabled for 'Client does not cover FX Risk' option");
			}

		}
		clickElement(ShapingParm_CostingFactors_FixRate_expand_minimise);
		
		clickElement(shapingparam_Costing_Save);
	//	
		if (scenarioFlag == true)
			scenarioPass();
	}

	
	/**
	 * This Method is created to Enter Transition Accounting in Costing factors screen
	 * 
	 * @since 12/03/2024
	 * @release April 6
	 * @author rupali.umat
	 * 
	 */
	public void EditTransitionAccounting(String Filepath, String SheetName) throws Exception {
		String TerminationProtection = ExcelUtilities.SetExcelPath(Filepath, SheetName, 49, 1);
		String TransitionCost = ExcelUtilities.SetExcelPath(Filepath, SheetName, 50, 1);
		String TransititonBilling = ExcelUtilities.SetExcelPath(Filepath, SheetName, 51, 1);
		clickElement(ShapingParm_CostingFactors_TransitionAccounting_expand_minimise);
		
		scroll("bottom");
		expandDropdown(ShapingParm_CostingFactors_TransitionAccounting_TerminationFeeCover);
		Select select = new Select(
				ShapingParm_CostingFactors_TransitionAccounting_TerminationFeeCover_dropdownSelect);
		List<String> options = new ArrayList<String>();
		for (int i = 0; i < select.getOptions().size(); i++) {
			options.add(getText(select.getOptions().get(i)));
		}
		select.selectByVisibleText(TerminationProtection);
		
		if (TerminationProtection.equals("Partial")) {
			clickElement(ShapingParm_CostingFactors_TransitionAccounting_TransitionCost);
			clear(ShapingParm_CostingFactors_TransitionAccounting_Input);
			sendKeys(ShapingParm_CostingFactors_TransitionAccounting_Input,TransitionCost);
			
			clickElement(ShapingParm_CostingFactors_TransitionAccounting_TransitionBillingsDeferred);
			
	       
			
			clear(ShapingParm_CostingFactors_TransitionAccounting_Input);
			sendKeys(ShapingParm_CostingFactors_TransitionAccounting_Input,TransititonBilling);
			
		}
		clickElement(ShapingParm_CostingFactors_TransitionAccounting_expand_minimise);
		   
	}
	
	/**
	 * This Method is created to Enter Bank Warrenty in Costing factors screen
	 * 
	 * @since 12/03/2024
	 * @release April 6
	 * @author rupali.umat
	 * 
	 */

	public void EditBankWarranty(String Filepath, String SheetName) throws Exception {
		boolean scenarioFlag = true;
		waitForElementClickable(ShapingParm_CostingFactors_Bankwarranty_expand_minimise);
		scrollToElement(ShapingParm_CostingFactors_Bankwarranty_expand_minimise);
		jse.executeScript("arguments[0].scrollIntoView(true);", ShapingParm_CostingFactors_Bankwarranty_expand_minimise);
		ShapingParm_CostingFactors_Bankwarranty_expand_minimise.click();
		
		scroll("bottom");
		String BankWarrantyAmount = ExcelUtilities.SetExcelPath(Filepath, SheetName, 43, 1);
		String Duration = ExcelUtilities.SetExcelPath(Filepath, SheetName, 44, 1);
		String Interest = ExcelUtilities.SetExcelPath(Filepath, SheetName, 45, 1);
		String StartDate = ExcelUtilities.SetExcelPath(Filepath, SheetName, 46, 1);
		clickElement(GeneratePricing_CostingFactors_BankWarranty_field);
		clear(GeneratePricing_CostingFactors_BankWarranty_Input);
		sendKeys(GeneratePricing_CostingFactors_BankWarranty_Input,BankWarrantyAmount);
		
		clickElement(GeneratePricing_CostingFactors_StartDate_field);
		try {
			if (isDisplayed(GeneratePricing_CostingFactors_StartDate_input) == true)
				logPass("Start Date field is Editable if Bank Warranty field is greater than zero");
			else {
				logFail("Start Date field is not Editable if Bank Warranty field is greater than zero");
				
			}
		} catch (Exception e) {
			logFail("Start Date field is not Editable if Bank Warranty field is greater than zero");
			scenarioFlag = false;
			
		}
		clickElement(BankWarranty_StartDate);
		clear(BankWarranty_StartDate_Input);
		sendKeys(BankWarranty_StartDate_Input,StartDate);
	
		
		clickElement(GeneratePricing_CostingFactors_Duration_field);
		clear(GeneratePricing_CostingFactors_Duration_input);
		
		sendKeys(GeneratePricing_CostingFactors_Duration_input,Duration);
		
		

		clickElement(GeneratePricing_CostingFactors_IntreastRate_field);
		clear(GeneratePricing_CostingFactors_IntreastRate_input);
		
		sendKeys(GeneratePricing_CostingFactors_IntreastRate_input,Interest);
		
		clickElement(BankWarranty_StartDate);
		
		if (GeneratePricing_CostingFactors_IntreastRate_field.getAttribute("title").equals(Interest))
			logPass("Interest Rate field is accepting values less than 100");
		else {
			logFail("Interest Rate field is not accepting values less than 100");
			scenarioFlag = false;
			
		}

		clickElement(ShapingParm_CostingFactors_Bankwarranty_expand_minimise);
		if (scenarioFlag == true)
			scenarioPass();
	}

	public void SaveCostingFactor() throws Exception {
		clickElement(CostingFactor_Save_button);
		
	}


	
	/**
	 * TC_109: Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.
	 *
	 * @since 08/03/2024
	 *
	 * @release April 1
	 *
	 * @author shreya.sharad.jadhav
	 */
	
	public void ConfigurePricingFactorSubscreen(String Filepath, String SheetName, int row, int col) throws Exception {
		 
		boolean scenarioFlag = true;
 
		/*********** Working Capital Days ******************/
		waitForElementToAppear(PricingFactor_Billing_Days);
		waitForElementToBeVisible(PricingFactor_Billing_Days);
		clickElement(PricingFactor_Billing_Days);
		String BillingDays = ExcelUtilities.SetExcelPath(Filepath, SheetName, 1, 1);
		String fvalue = BillingDays.replaceAll("\\.0+$", "");
		for (WebElement Billing_Days : PricingFactor_WCBillingDaysOptions) {
			if (getText(Billing_Days).equals(fvalue)) {
				clickElement(Billing_Days);
				logPass("Billing Days found in the list.");
				break;
 
			}
		}
		waitForElementToAppear(PricingFactor_WCExpense_Days);
		waitForElementToBeVisible(PricingFactor_WCExpense_Days);
		clickElement(PricingFactor_WCExpense_Days);
		String ExpenseDays = ExcelUtilities.SetExcelPath(Filepath, SheetName, 2, 1);
		String Nvalue = ExpenseDays.replaceAll("\\.0+$", "");
		for (WebElement Expense_Days : PricingFactor_WCExpenseDaysOptions) {
			if (getText(Expense_Days).equals(Nvalue)) {
				clickElement(Expense_Days);
				logPass("Expense Days found in the list.");
				break;
 
			}
		}
		/*********** Pricing Option ******************/
		waitForElementToAppear(Expand_Pricing);
		waitForElementToBeVisible(Expand_Pricing);
		clickElement(Expand_Pricing);
 
		waitForElementToBeVisible(Negotiation_Contingency);
		clickElement(Negotiation_Contingency);
		// clear(Negotiation_Contingency);
		String Negotiation = ExcelUtilities.SetExcelPath(Filepath, SheetName, 7, 1);
		String NegoCon = Negotiation.replaceAll("\\.0+$", "");
		int contingency = Integer.parseInt(NegoCon);
		if ((contingency) >= 0 && (contingency) <= 100) {
			Negotiation_Contingency.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Negotiation_Contingency.sendKeys(Keys.BACK_SPACE);
			sendKeys(Negotiation_Contingency, NegoCon);
			Negotiation_Contingency.sendKeys(Keys.TAB);
 
			logInfo("Negotiation Contingency is added successfully");
		} else {
			logFail("Contigency- Please enter values between 0 – 100.");
			scenarioFlag = false;
		}
		waitForElementToBeVisible(VAT_text);
		clickElement(VAT_text);
		clear(VAT_text);
		String VAT = ExcelUtilities.SetExcelPath(Filepath, SheetName, 8, 1);
		String VatText = VAT.replaceAll("\\.0+$", "");
		int ValueTax = Integer.parseInt(VatText);
		if ((ValueTax) >= 0 && (ValueTax) <= 100) {
			sendKeys(VAT_text, VAT);
			logInfo("VAT(Value Added Tax) is added successfully");
		} else {
			logFail("VAT- Please enter values between 0 – 100.");
			scenarioFlag = false;
		}
 
		waitForElementToAppear(Early_Payment);
		waitForElementToBeVisible(Early_Payment);
		clear(Early_Payment);
		String Early_Pay = ExcelUtilities.SetExcelPath(Filepath, SheetName, 9, 1);
		String Early_Discount = Early_Pay.replaceAll("\\.0+$", "");
		int Early = Integer.parseInt(Early_Discount);
		if ((Early) >= 0 && (Early) <= 100) {
			clickElement(Early_Payment);
			Early_Payment.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Early_Payment.sendKeys(Keys.BACK_SPACE);
			sendKeys(Early_Payment, Early_Pay);
			Early_Payment.sendKeys(Keys.TAB);
			logInfo("Early Payment Discount  is added successfully");
		} else {
			logFail("Sum of Early Payment Discount % and Provision for Service Credits % should be less than or equal to 99.");
			scenarioFlag = false;
		}
		waitForElementToAppear(Revenue);
		waitForElementToBeVisible(Revenue);
		String Revenue_Tax = ExcelUtilities.SetExcelPath(Filepath, SheetName, 10, 1);
		String RevenueFX = Revenue_Tax.replaceAll("\\.0+$", "");
		int RevenuePremium = Integer.parseInt(RevenueFX);
		if ((RevenuePremium) >= 0 && (RevenuePremium) <= 100) {
			clickElement(Revenue);
			Revenue.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Revenue.sendKeys(Keys.BACK_SPACE);
			sendKeys(Revenue, RevenueFX);
			Revenue.sendKeys(Keys.TAB);
			logInfo("Revenue FX Premium is added successfully");
		} else {
			logFail("Revenue FX Premium- Please enter values between 0 – 100.");
			scenarioFlag = false;
		}
 
		/*********** Billing Option ******************/
		waitForElementToAppear(Billing_Option);
		waitForElementToBeVisible(Billing_Option);
		clickElement(Billing_Option);
 
		String TimingofInvoice = ExcelUtilities.SetExcelPath(Filepath, SheetName, 15, 1);
		String NumberOfMonthsBeforeWorkStart = ExcelUtilities.SetExcelPath(Filepath, SheetName, 16, 1);
		String NomonthsinArrears = ExcelUtilities.SetExcelPath(Filepath, SheetName, 17, 1);
		String BillingPeriodlenght = ExcelUtilities.SetExcelPath(Filepath, SheetName, 18, 1);
		String BillingPeriodInMonths = ExcelUtilities.SetExcelPath(Filepath, SheetName, 19, 1);
		waitForElementToAppear(PricingFactor_InvoiceBilling_dropdown);
		waitForElementToBeVisible(PricingFactor_InvoiceBilling_dropdown);
		clickElement(PricingFactor_InvoiceBilling_dropdown);
		for (int i = 0; i < PricingFactor_BillingIssueOptions.size(); i++) {
			if (getText(PricingFactor_BillingIssueOptions.get(i)).equals(TimingofInvoice)) {
				clickElement(PricingFactor_BillingIssueOptions.get(i));
				break;
			}
		}
		if (TimingofInvoice.contains("Billing Month Within Billing Period")) {
			if (PricingFactor_BillingPeriodLength_dropdown.getAttribute("title").contains("1")
					&& PricingFactor_BillingMonthPeriod_dropdown.getAttribute("title").contains("1"))
				logPass(" Billing period length  and Billing Month within Billing Period is defaulted to 1 when Billing Month Within Billing Period is selected form Invoice/Billing issue");
			else {
				logFail(" Billing period length and Billing Month within Billing Period  is not defaulted to 1 when Billing Month Within Billing Period is selected form Invoice/Billing issue");
				scenarioFlag = false;
 
			}
		}
 
		waitForElementToAppear(PricingFactor_BillingPeriodLength);
		waitForElementToAppear(PricingFactor_BillingPeriodLength);
		clickElement(PricingFactor_BillingPeriodLength);
		String value1 = BillingPeriodlenght.replaceAll("\\.0+$", "");
		for (WebElement BillPeriod : PricingFactor_BillingPeriodLengthOptions) {
			logInfo(BillPeriod.getAttribute("id"));
			if (BillPeriod.getAttribute("id").equalsIgnoreCase(value1)) {
				clickElement(BillPeriod);
				break;
			}
		}
		waitForElementToAppear(PricingFactor_BillingMonth_dropdown);
		waitForElementToBeVisible(PricingFactor_BillingMonth_dropdown);
		clickElement(PricingFactor_BillingMonth_dropdown);
		String BillMonthvalue = BillingPeriodInMonths.replaceAll("\\.0+$", "");
		logInfo(BillMonthvalue);
		for (WebElement BillMonthdrop : PricingFactor_BillingMonthOptions) {
			logInfo(BillMonthdrop.getAttribute("id"));
			if (BillMonthdrop.getAttribute("id").trim().equalsIgnoreCase(BillMonthvalue)) {
				clickElement(BillMonthdrop);
				break;
			}
		}
 
		/*********** Service Credit ******************/
		waitForElementToAppear(Expand_service);
		waitForElementToBeVisible(Expand_service);
		clickElement(Expand_service);
		clickElement(Total_fees);
		clear(Total_fees);
		String Fees = ExcelUtilities.SetExcelPath(Filepath, SheetName, 23, 1);
		String fvalue1 = Fees.replaceAll("\\.0+$", "");
		int TotalFee = Integer.parseInt(fvalue1);
		if ((TotalFee) >= 0 && (TotalFee) <= 100) {
			sendKeys(Total_fees, fvalue1);
			logInfo("Total Fees at Risk %: added successfully");
		} else {
			logFail("Total Fee At Risk- Please enter values between 0 – 100.");
			scenarioFlag = false;
		}
		waitForElementToAppear(Provision_service);
		waitForElementToBeVisible(Provision_service);
		clickElement(Provision_service);
		clear(Provision_service);
		String No = ExcelUtilities.SetExcelPath(Filepath, SheetName, 24, 1);
		String ProvisionCredit = No.replaceAll("\\.0+$", "");
		int credit = Integer.parseInt(ProvisionCredit);
		if ((credit) >= 0 && (credit) <= 99) {
			sendKeys(Provision_service, ProvisionCredit);
			logInfo("TProvision for service is added successfully");
		} else {
			logFail("Sum of Early Payment Discount % and Provision for Service Credits % should be less than or equal to 99.");
			scenarioFlag = false;
		}
		waitForElementToAppear(ReasonFor_service);
		waitForElementToBeVisible(ReasonFor_service);
		clickElement(ReasonFor_service);
		clear(ReasonFor_service);
		String text = ExcelUtilities.SetExcelPath(Filepath, SheetName, 25, 1);
		if ((credit) >= 0 && (credit) <= 99) {
			clickElement(ReasonFor_service);
			sendKeys(ReasonFor_service, text);
		}
		waitForElementToAppear(Service_Assesment);
		waitForElementToBeVisible(Service_Assesment);
		String Service_Ass = ExcelUtilities.SetExcelPath(Filepath, SheetName, 26, 1);
		String Assesment = Service_Ass.replaceAll("\\.0+$", "");
		logInfo(Assesment);
		int Assesment_period = Integer.parseInt(Assesment);
		if ((Assesment_period) >= 0 && (Assesment_period) <= 100) {
 
			clickElement(Service_Assesment);
			clear(Service_Assesment);
 
			sendKeys(Service_Assesment, Assesment);
			logInfo("Service Credit Assessment Period is added successfully");
		} else {
			logFail("Service Credit Assessment Period- Please enter values greater than 0.");
			scenarioFlag = false;
		}
		waitForElementToAppear(SavePopup);
		waitForElementToBeVisible(SavePopup);
		clickElement(SavePopup);
		
		String message = SavePopupMessage.getAttribute("title");
		logInfo("message: "+message);
		if (message.equals("Pricing factor details are saved successfully.")) {
			logPass("Pricing factor details are saved successfully.");
			scenarioFlag = true;
		} else {
			logFail("Pricing factor details are not saved successfully.");
		}
		
		if(scenarioFlag == true) {
			scenarioPass();
		}else {
			scenarioFail();
		}
 
	}
 
	/**
	 * This method has been created to generate the ADL 
	 *
	 * @since 08/03/2024
	 *
	 * @release April 1
	 *
	 * @author rupali.umat
	 * 
	 * 
	 */
 
	public void ADLGeneration() throws Exception {
		waitForElementToAppear(GenerateADLBtn);
		waitForElementToBeVisible(GenerateADLBtn);
		clickElement(GenerateADLBtn);
 
		try {
			clickElement(ADL_Warning_OK_Btn);
		} catch (Exception e) {
		}
		clickElement(Solutionshaping_ddlADLVersion);
		clickElement(Solutionshaping_R13);
		waitForElementToAppear(SelectADLVersion_btnGenerateADLOK);
		waitForElementToBeVisible(SelectADLVersion_btnGenerateADLOK);
		clickElement(SelectADLVersion_btnGenerateADLOK);
		clickElement(Upload_confirmationWarringNo);
		waitForElementToAppear(ADLGeneration_ProcessTab);
		waitForElementToBeVisible(ADLGeneration_ProcessTab);
		waitForElementToAppear(ADLGeneration_ProcessTabOK);
		waitForElementToBeVisible(ADLGeneration_ProcessTabOK);
		
		jsClick(ADLGeneration_ProcessTabOK);
		
		//action.click(ADLGeneration_ProcessTabOK).build().perform();
		// ADLGeneration_ProcessTabOK.click();
 
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(200))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		wait.until(ExpectedConditions.textToBePresentInElement(ADLStatus, "Completed"));
 
		if (ADLStatus.getText().contains("Completed")) {
			logPass("ADL has been Generated Successfully");
		} else if (ADLStatus.getText().contains("Validation Error")) {
			logFail("ADL has not been Generated.");
 
		}
	}
	
	/**
	 * TC 110 : Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.
	 *
	 * @since 08/03/2024
	 *
	 * @release April 1
	 *
	 * @author shreya.sharad.jadhav
	 * 
	 * 
	 */
 
	public String GenerateADlSubmit() throws Exception {
		waitForElementToAppear(pricing_Factor);
		waitForElementToBeVisible(pricing_Factor);
		clickElement(pricing_Factor);
		// pricing_Factor.click();
		String versionStatus = "";
		waitForElementToAppear(GenerateADLSubmitBtn);
		waitForElementToBeVisible(GenerateADLSubmitBtn);
		clickElement(GenerateADLSubmitBtn);
		waitForElementToAppear(ADL_Warning_OK_Btn);
		waitForElementToBeVisible(ADL_Warning_OK_Btn);
		clickElement(ADL_Warning_OK_Btn);
//		expandDropdown(Solutionshaping_ddlADLVersion);
		waitForElementToAppear(Solutionshaping_R13);
		waitForElementToBeVisible(Solutionshaping_R13);
		clickElement(Solutionshaping_R13);
		clickElement(ADLSubmit_Ok_R13);
 
		loader();
		waitForElementToAppear(ADLSubmit_PopupMesg);
		waitForElementToBeVisible(ADLSubmit_PopupMesg);
		versionStatus = ADLSubmit_PopupMesg.getAttribute("title");
		return versionStatus;
	}
 
	/*********** RequestPricing *************/
 
	/**
	 * TC 110 : Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.
	 *
	 * @since 08/03/2024
	 *
	 * @release April 1
	 *
	 * @author shreya.sharad.jadhav
	 * 
	 * 
	 */
	public void RequestPricing() throws Exception {
 
		clickElement(generate_Price);
		clickElement(pricing_Factor);
		solutioncomponentspage = new SolutionComponentsPage();
 
		String solutionGroup[] = {};
		String version = "";
 
		solutionGroup = getText(SoluntionVersion).split(" ");
		for (String s : solutionGroup) {
			System.out.println(s);
		}
		version = solutionGroup[3];
		clickElement(Version_Tab);
		solutioncomponentspage.CopyVersion(version);
 
		clickElement(newVersioncopy);
		clickElement(generate_Price);
		clickElement(pricing_Factor);
 
		clickElement(RequestPricingBtn);
		try {
			clickElement(SCC_RequestPricing_OK_Btn);
		} catch (Exception e) {
		}
		clickElement(RequestPricing_TaxOption);
		// waitForElementToBeVisible(RequestPricing_TaxOption);
		clickElement(RequestPricing_NearshoreOption);
 
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(200))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		wait1.until(ExpectedConditions.textToBePresentInElement(PricingStatus, "Completed"));
 
		if (PricingStatus.getText().contains("Completed")) {
			logPass("Request Pricing has been Generated Successfully");
		} else if (PricingStatus.getText().contains("Validation Error")) {
			logFail("Request Pricing has not been Generated.");
 
		}
	}
 
	/**
	 * TC 110 : Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.
	 *
	 * @since 08/03/2024
	 *
	 * @release April 1
	 *
	 * @author shreya.sharad.jadhav
	 * 
	 * 
	 */
	public String RequestSubmit() throws Exception {
		String requestStatus = "";
 
		clickElement(generate_Price);
 
		clickElement(pricing_Factor);
		waitForElementToBeVisible(RequestPricingSubmitBtn);
		clickElement(RequestPricingSubmitBtn);
		clickElement(SCC_RequestPricing_OK_Btn);
		clickElement(RequestPricing_NearshoreOption);
 
		requestStatus = RequestPricing_PopupMesg.getAttribute("class");
 
		return requestStatus;
	}
	
	/**
	 * TC 110 : Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.
	 *
	 * @since 08/03/2024
	 *
	 * @release April 1
	 *
	 * @author shreya.sharad.jadhav
	 * 
	 * Blocked ad RP cant be generated in Parallel Prod
	 */
 
	public void validateGenerateADLRequestPricing() throws Exception {
		boolean scenarioFlag = true;
		String adlResult = "";
		String rpResult = "";
		String result = "";
 
		result = "This solution version status is Submitted to CDTS. Hence it is locked for editing.";
		ADLGeneration();
		adlResult = GenerateADlSubmit();
		logInfo(adlResult);
//		RequestPricing();
//		rpResult = RequestSubmit();
 
		if (adlResult.equals(result)) {
 
			logPass("Solution version status is Submitted to CDTS for  ADL ");
		} else {
			logFail("Solution version status is not Submitted to CDTS for ADL ");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}
 


/*
 * Method to generate ADL 
 * 
 * @author - nitish.kumar.prusty
 */

public void generateADL() throws Exception {

//	waitForElementToAppear(PricingFactor_Tab);
//	waitForElementToBeVisible(PricingFactor_Tab);
//	clickElement(PricingFactor_Tab);

	waitForElementToAppear(GenerateADL_Btn);
	waitForElementToBeVisible(GenerateADL_Btn);
	clickElement(GenerateADL_Btn);

	waitForElementToAppear(AlertOk_Btn);
	waitForElementToBeVisible(AlertOk_Btn);
	clickElement(AlertOk_Btn);

	waitForElementToAppear(ADLVersion_Popup);
	waitForElementToBeVisible(ADLVersion_Popup);
	clickElement(ADLVersion_Popup);

	waitForElementToAppear(DealAnalytics_Popup);
	waitForElementToBeVisible(DealAnalytics_Popup);
	clickElement(DealAnalytics_Popup);

	waitForElementToAppear(Successful_Popup);
	waitForElementToBeVisible(Successful_Popup);
	jsClick(Successful_Popup);

	// checking the ADL Status to be changed to Completed
	Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(300))
			.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	wait.until(ExpectedConditions.textToBePresentInElement(ADL_Status, "Completed"));
	
	// Download the ADL Generated Report
	waitForElementToAppear(ADLReportDownload_Btn);
	waitForElementToBeVisible(ADLReportDownload_Btn);
	clickElement(ADLReportDownload_Btn);

	waitForElementToAppear(ConfidentialReminder_Popup);
	waitForElementToBeVisible(ConfidentialReminder_Popup);
	clickElement(ConfidentialReminder_Popup);
	
	scenarioPass();

}

/**
 * TC_114: Validate if SA is able to Create Cluster.
 * 
 * @since 08/03/2024
 * 
 * @release April 1
 * 
 * @author nitish.kumar.prusty
 */

public void validateCreateCluster() throws Exception {

	boolean scenarioFlag = false;

	String successMessage = "";
	
//	wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
//
//	waitForElementToAppear(Next_Btn);
//	waitForElementToBeVisible(Next_Btn);
//    clickElement(Next_Btn);
//	
//    waitForElementToAppear(GeneratePricing_Tab);
//	waitForElementToBeVisible(GeneratePricing_Tab);
//	clickElement(GeneratePricing_Tab);
	
	//wait until page fully load
//	wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
	
	waitForElementToAppear(OneClickPricing_Subtab);
	waitForElementToBeVisible(OneClickPricing_Subtab);
	clickElement(OneClickPricing_Subtab);
	
	waitForElementToAppear(OpenClusterManagement_Sec);
	waitForElementToBeVisible(OpenClusterManagement_Sec);
	clickElement(OpenClusterManagement_Sec);
    
	
	waitForElementToAppear(CreateCluster_Icon);
	waitForElementToBeVisible(CreateCluster_Icon);
	clickElement(CreateCluster_Icon);


	// create cluster
	createCluster();

	waitForElementToAppear(SCP_Label);
	waitForElementToBeVisible(SCP_Label);
	if (isDisplayed(SCP_Label)) {
		successMessage = getText(SCP_Label);
		if (successMessage.equals("Cluster details saved successfully.")) {
			logPass("Cluster details saved successfully.");
			scenarioFlag = true;
		} else {
			logFail("Cluster details Not saved.");
		}
	} else {
		logFail("SCP Label not Displayed");
	}

    waitForElementToAppear(CloseClusterManagement_Sec);
	waitForElementToBeVisible(CloseClusterManagement_Sec);
	clickElement(CloseClusterManagement_Sec);

	waitForElementToAppear(OCPSave_Btn);
	waitForElementToBeVisible(OCPSave_Btn);
	clickElement(OCPSave_Btn);

	if (scenarioFlag == true) {
		scenarioPass();
	} else {
		scenarioFail();
	}
}

/*
 * Method to create a Cluster.
 * 
 * @since 08/03/2024
 * 
 * @author nitish.kumar.prusty
 */

public void createCluster() throws Exception {

	String randomClusterName = "";

	randomClusterName = generateRandomString(10);
	waitForElementToAppear(ClusterName_Input);
	waitForElementToBeVisible(ClusterName_Input);
	sendKeys(ClusterName_Input, randomClusterName);
	for (WebElement ele : MapGroups) {
		if (ele.getAttribute("disabled") == null) {
			clickElement(ele);
			break;
		}
	}
	waitForElementToAppear(AddClusterSave_btn);
	clickElement(AddClusterSave_btn);

}

/*
 * Method to generate a Random String.
 * 
 * @since 08/03/2024
 * 
 * @author nitish.kumar.prusty
 */
public String generateRandomString(int length) {
	String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	StringBuilder randomString = new StringBuilder();

	random = new Random();
	for (int i = 0; i < length; i++) {
		randomString.append(characters.charAt(random.nextInt(characters.length())));
	}
	return randomString.toString();
}

/**
 * TC_115: Validate if SA is able to Edit Cluster.
 * 
 * @since 08/03/2024
 * 
 * @release April 1
 * 
 * @author nitish.kumar.prusty
 */

public void validateEditCluster() throws Exception {

	boolean scenarioFlag = false;
	random = new Random();
	String scpLabelMessage = "";
	String EditedClusterName = "";

	waitForElementToAppear(OneClickPricing_Subtab);
	waitForElementToBeVisible(OneClickPricing_Subtab);
	clickElement(OneClickPricing_Subtab);
	
	waitForElementToAppear(OpenClusterManagement_Sec);
	waitForElementToBeVisible(OpenClusterManagement_Sec);
	clickElement(OpenClusterManagement_Sec);

	// we will directly edit the cluster
	int randomIndex = random.nextInt(ClusterEdit_Icon.size());
	WebElement EditableWebElement = ClusterEdit_Icon.get(randomIndex);
	clickElement(EditableWebElement);

	EditedClusterName = generateRandomString(10) + "- Edited";

	waitForElementToAppear(ClusterName_Input);
	waitForElementToBeVisible(ClusterName_Input);
	sendKeys(ClusterName_Input, EditedClusterName);

	try {
		waitForElementToAppear(Update_btn);
		waitForElementToBeVisible(Update_btn);
		clickElement(Update_btn);
		logPass("Cluster Details Updated Successfully");
	} catch (Exception e) {
		logFail("Cluster Details Not Updated");
	}

	waitForElementToAppear(CloseClusterManagement_Sec);
	waitForElementToBeVisible(CloseClusterManagement_Sec);
	clickElement(CloseClusterManagement_Sec);

	waitForElementToAppear(OCPSave_Btn);
	waitForElementToBeVisible(OCPSave_Btn);
	clickElement(OCPSave_Btn);

	waitForElementToAppear(SCP_Label);
	waitForElementToBeVisible(SCP_Label);
	scpLabelMessage = getText(SCP_Label);

	if (scpLabelMessage.equals("One Click Pricing Solution version details saved successfully.")) {
		logPass("Successfully Edited the Cluster");
		scenarioFlag = true;
	} else {
		logFail("Cluster not Edited");
	}

	if (scenarioFlag == true) {
		scenarioPass();
	} else {
		scenarioFail();
	}

}

/**
 * TC_116: Validate if SA is able to Delete Cluster.
 * 
 * @since 08/03/2024
 * 
 * @release April 1
 * 
 * @author nitish.kumar.prusty
 */
public void validateDeleteCluster() throws Exception {

	boolean scenarioFlag = false;
	String scpLabelMessage = "";

	random = new Random();

	waitForElementToAppear(OneClickPricing_Subtab);
	waitForElementToBeVisible(OneClickPricing_Subtab);
	clickElement(OneClickPricing_Subtab);
	
	waitForElementToAppear(OpenClusterManagement_Sec);
	waitForElementToBeVisible(OpenClusterManagement_Sec);
	clickElement(OpenClusterManagement_Sec);
	
	int TotalClusterSize = TotalCluster_Items.size();
	int AfterDeleteClusterSize = 0;

	// delete the cluster
	int randomIndex = random.nextInt(ClusterDelete_Icon.size());
	WebElement Deleteicon = ClusterDelete_Icon.get(randomIndex);
	waitForElementToAppear(Deleteicon);
	waitForElementToBeVisible(Deleteicon);
	clickElement(Deleteicon);
	AfterDeleteClusterSize = TotalCluster_Items.size();

	logInfo("Total Cluster Size Before Deleting: " + TotalClusterSize);
	logInfo("Total Cluster Size After Deleting: " + AfterDeleteClusterSize);

	if (AfterDeleteClusterSize == TotalClusterSize - 1) {
		logPass("Cluster Groups Reduced");
		scenarioFlag = true;
	} else {
		logFail("Cluster Groups Not Reduced");
	}

	waitForElementToAppear(CloseClusterManagement_Sec);
	waitForElementToBeVisible(CloseClusterManagement_Sec);
	clickElement(CloseClusterManagement_Sec);

	waitForElementToAppear(OCPSave_Btn);
	waitForElementToBeVisible(OCPSave_Btn);
	clickElement(OCPSave_Btn);

	waitForElementToAppear(SCP_Label);
	waitForElementToBeVisible(SCP_Label);
	scpLabelMessage = getText(SCP_Label);

	if (scpLabelMessage.equals("One Click Pricing Solution version details saved successfully.")) {
		logPass("SA is able to delete the cluster");
		scenarioFlag = true;
	} else {
		logFail("SA is not able to delete the cluster");
	}

	if (scenarioFlag == true) {
		scenarioPass();
	} else {
		scenarioFail();
	}
}

/**
 * TC_117: Validate if SA is able to Simulate one click pricing with MME Hours
 * and Standard Hours.
 * 
 * @since 11/03/2024
 * 
 * @release April 1
 * 
 * @author nitish.kumar.prusty
 */
public void validateMMEAndStandardhrs(String excelPath, String sheetName) throws Exception {

	boolean scenarioFlag = false;
	String HoursRadiobtn1 = "";
	String HoursRadiobtn2 = "";

	waitForElementToAppear(OneClickPricing_Subtab);
	waitForElementToBeVisible(OneClickPricing_Subtab);
	clickElement(OneClickPricing_Subtab);

	HoursRadiobtn1 = "Standard Hours";
	boolean isStandardHrsSimulate = actionForMMEAndStandardhrs(HoursRadiobtn1, excelPath, sheetName);
	HoursRadiobtn2 = "MME Hours";
	boolean isMMEHrsSimulate = actionForMMEAndStandardhrs(HoursRadiobtn2, excelPath, sheetName);

	if (isStandardHrsSimulate && isMMEHrsSimulate) {
		logPass("User is able to Simulate one click pricing with MME Hours and Standard Hours.");
		scenarioFlag = true;
	} else {
		logFail("User is not able to Simulate one click pricing with MME Hours and Standard Hours.");
	}

	if (scenarioFlag == true) {
		scenarioPass();
	} else {
		scenarioFail();
	}
}

/*
 * Common method to simulate one click pricing with Standard and MME Hours
 * 
 * @since 11/03/2024
 * 
 * @author nitish.kumar.prusty
 */
public boolean actionForMMEAndStandardhrs(String option, String excelPath, String sheetName) throws Exception {

	boolean isSimulationCompleted = false;

	String data = "";
	String inputId = "";
	String simulationRequestBarClass = "";

	WebElement Hours_RadioBtn = null;

	random = new Random();

	if (option.equals("Standard Hours")) {
		inputId = "rdaioPricingDesabled";
	} else if (option.equals("MME Hours")) {
		inputId = "rdaioPricingEnabled";
	} else {
		logInfo("Correct Hour Radio btn not selected");
	}

	Hours_RadioBtn = getDriver().findElement(By.xpath("//*[@id='" + inputId + "']"));

	waitForElementToAppear(Hours_RadioBtn);
	waitForElementToBeVisible(Hours_RadioBtn);
	clickElement(Hours_RadioBtn);

	int randomrow = random.nextInt(5) + 1;
	data = ExcelUtilities.getExcelValue(excelPath, sheetName, randomrow, 0);

	for(int i = 0;i < Years_InputField.size(); i++ ) {
		waitForElementToAppear(Years_InputField.get(i));
		waitForElementToBeVisible(Years_InputField.get(i));
		action.click(Years_InputField.get(i)).build().perform();
		Years_InputField.get(i).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Years_InputField.get(i).sendKeys(Keys.BACK_SPACE);
		sendKeys(Years_InputField.get(i), data);
		Years_InputField.get(i).sendKeys(Keys.TAB);
	}

	jse.executeScript("arguments[0].scrollIntoView(true);", BillingDiscount_InputField);

	waitForElementToAppear(BillingDiscount_InputField);
	waitForElementToBeVisible(BillingDiscount_InputField);
	BillingDiscount_InputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	BillingDiscount_InputField.sendKeys(Keys.BACK_SPACE);
	sendKeys(BillingDiscount_InputField, data);

	waitForElementToAppear(OCPSave_Btn);
	waitForElementToBeVisible(OCPSave_Btn);
	clickElement(OCPSave_Btn);

	jse.executeScript("arguments[0].scrollIntoView(true);", SimulateCostPrice_btn);

	WebElement SimulateCostPricBtn = getDriver().findElement(By.xpath("//*[@id='btnSimulateSolution']//em"));
	waitForElementToAppear(SimulateCostPricBtn);
	waitForElementToBeVisible(SimulateCostPricBtn);
	clickElement(SimulateCostPricBtn);
	clickElement(SimulateCostPricBtn);
		
    WebElement AlertOkBtn = getDriver().findElement(By.xpath("//*[@id='IsSCCSuggesion']//em[text() = 'OK']"));
	waitForElementToAppear(AlertOkBtn);
	waitForElementToBeVisible(AlertOkBtn);
	clickElement(AlertOkBtn);

	WebElement CostSimulationPopup = getDriver().findElement(By.xpath("//*[@id='CostSimultion-popup']//em"));
	waitForElementToAppear(CostSimulationPopup);
	waitForElementToBeVisible(CostSimulationPopup);
	clickElement(CostSimulationPopup);
	
	
    WebElement WithoutNearShoreBtn = getDriver().findElement(By.xpath("//*[@id='nearShorePopUp']//em[text() = 'Without Nearshore']"));
	waitForElementToAppear(WithoutNearShoreBtn);
	waitForElementToBeVisible(WithoutNearShoreBtn);
	clickElement(WithoutNearShoreBtn);

	waitForElementToAppear(SCP_Label);
	waitForElementToBeVisible(SCP_Label);
	waitForElementToBeVisible(SCPProgress_Bar);

	// checking the Simulation Request class Status to be changed to Completed
	Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(300))
			.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	wait.until(ExpectedConditions.attributeContains(SimulationRequest_Bar, "class", "completed"));

	
		simulationRequestBarClass = SimulationRequest_Bar.getAttribute("class");
		if (simulationRequestBarClass.equals("completed")) {
			logPass("Simulation cost and price generated successfully for " + option + ".");
			isSimulationCompleted = true;
		} else {
			logFail("Simulation cost and price not generated successfully " + option + ".");
		}

	return isSimulationCompleted;
}

/**
 * TC_118 : Validate Actual and No Tax MMP KDA generation
 * 
 * @since 12/03/2024
 * 
 * @release April 1
 * 
 * @author nitish.kumar.prusty
 * 
 * BUG 3501902 in Generate Pricing ADL Status screen
 * 
 */
public void validateActualAndNoTaxMMP() throws Exception {

	boolean scenarioFlag = false;
	String Op1 = "";
	String Op2 = "";
	String noTaxStatus = "";
	String actualTaxStatus = "";

	Op1 = "No";
	noTaxStatus = actionForActualAndNoTaxMMP(Op1);
	Op2 = "Actual";
	actualTaxStatus = actionForActualAndNoTaxMMP(Op2);

	if (noTaxStatus.equals("Completed") && actualTaxStatus.equals("Completed")) {
		logPass("User is able to generate Actual and No Tax MMP KDA ");
		scenarioFlag = true;
	} else {
		logFail("User is not able to generate Actual and No Tax MMP KDA ");
	}

	if (scenarioFlag == true) {
		scenarioPass();
	} else {
		scenarioFail();
	}
}

/*
 * Method to generate Actual and No Tax MMP KDA.
 * 
 * @since 13/03/2024
 * 
 * @author nitish.kumar.prusty
 * 
 */

public String actionForActualAndNoTaxMMP(String Option) throws Exception {

	String innerText = "";
	WebElement TaxType = null;
	String taxXpath = "";
	String taxStatus = "";

	if (Option.equalsIgnoreCase("No")) {
		innerText = "NO TAX";
	} else if (Option.equalsIgnoreCase("Actual")) {
		innerText = "ACTUAL TAX";
	}

	waitForElementToBeVisible(PricingFactor_Tab);
	clickElement(PricingFactor_Tab);

	waitForElementToBeVisible(RequestPricing_Btn);
	clickElement(RequestPricing_Btn);

	waitForElementToBeVisible(SCCSuggestionOK_Btn);
	clickElement(SCCSuggestionOK_Btn);

	taxXpath = "//*[@id='requestPricing']//button//em[text() = '" + innerText + "']";

	TaxType = getDriver().findElement(By.xpath(taxXpath));

	waitForElementToBeVisible(TaxType);
	clickElement(TaxType);

	waitForElementToBeVisible(WithOutNearShore_btn);
	clickElement(WithOutNearShore_btn);

	// checking the Tax Request Status to be changed to Completed
	Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(600))
			.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	wait.until(ExpectedConditions.textToBePresentInElement(TaxStatus_Sec, "Completed"));

	taxStatus = getText(TaxStatus_Sec);
	return taxStatus;
}

/**
 * TC_120: Validate if SA is able to abort on going Cost Simulation
 * 
 * @since 14/03/2024
 * 
 * @release April 1
 * 
 * @author nitish.kumar.prusty
 */
public void validateAbortCostSimulation(String excelPath, String sheetName) throws Exception {

	boolean scenarioFlag = false;
	String simulationRequestBarClass = "";
	String data = "";

	WebElement MMEHours_RadioBtn = null;
	
	wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));

	waitForElementToAppear(OneClickPricing_Subtab);
	waitForElementToBeVisible(OneClickPricing_Subtab);
	clickElement(OneClickPricing_Subtab);

	MMEHours_RadioBtn = getDriver().findElement(By.xpath("//*[@id='rdaioPricingDesabled']"));

	waitForElementToAppear(MMEHours_RadioBtn);
	waitForElementToBeVisible(MMEHours_RadioBtn);
	clickElement(MMEHours_RadioBtn);

	int randomrow = random.nextInt(5) + 1;
	data = ExcelUtilities.getExcelValue(excelPath, sheetName, randomrow, 0);

	for(int i = 0;i < Years_InputField.size(); i++ ) {
		waitForElementToAppear(Years_InputField.get(i));
		waitForElementToBeVisible(Years_InputField.get(i));
		action.click(Years_InputField.get(i)).build().perform();
		Years_InputField.get(i).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Years_InputField.get(i).sendKeys(Keys.BACK_SPACE);
		sendKeys(Years_InputField.get(i), data);
		Years_InputField.get(i).sendKeys(Keys.TAB);
	}

	jse.executeScript("arguments[0].scrollIntoView(true);", BillingDiscount_InputField);

	waitForElementToAppear(BillingDiscount_InputField);
	waitForElementToBeVisible(BillingDiscount_InputField);
	BillingDiscount_InputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	BillingDiscount_InputField.sendKeys(Keys.BACK_SPACE);
	sendKeys(BillingDiscount_InputField, data);

	waitForElementToAppear(OCPSave_Btn);
	waitForElementToBeVisible(OCPSave_Btn);
	clickElement(OCPSave_Btn);

	jse.executeScript("arguments[0].scrollIntoView(true);", SimulateCostPrice_btn);

	WebElement SimulateCostPricBtn = getDriver().findElement(By.xpath("//*[@id='btnSimulateSolution']//em"));
	waitForElementToAppear(SimulateCostPricBtn);
	waitForElementToBeVisible(SimulateCostPricBtn);
	clickElement(SimulateCostPricBtn);
	clickElement(SimulateCostPricBtn);
		
    WebElement AlertOkBtn = getDriver().findElement(By.xpath("//*[@id='IsSCCSuggesion']//em[text() = 'OK']"));
	waitForElementToAppear(AlertOkBtn);
	waitForElementToBeVisible(AlertOkBtn);
	clickElement(AlertOkBtn);

	WebElement CostSimulationPopup = getDriver().findElement(By.xpath("//*[@id='CostSimultion-popup']//em"));
	waitForElementToAppear(CostSimulationPopup);
	waitForElementToBeVisible(CostSimulationPopup);
	clickElement(CostSimulationPopup);
	
	
    WebElement WithoutNearShoreBtn = getDriver().findElement(By.xpath("//*[@id='nearShorePopUp']//em[text() = 'Without Nearshore']"));
	waitForElementToAppear(WithoutNearShoreBtn);
	waitForElementToBeVisible(WithoutNearShoreBtn);
	clickElement(WithoutNearShoreBtn);
	
	waitForElementToBeVisible(SCP_Label);

	waitForElementToAppear(Abort_Btn);
	waitForElementToBeVisible(Abort_Btn);
	clickElement(Abort_Btn);
	
	
	waitForElementToBeVisible(SCPProgress_Bar);

	// checking the Simulation Request class Status to be changed to error
	Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(300))
			.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	wait.until(ExpectedConditions.attributeContains(SimulationRequest_Bar, "class", "error"));

	simulationRequestBarClass = SimulationRequest_Bar.getAttribute("class");

	if (simulationRequestBarClass.equals("error")) {
		logPass("SA is able to abort on going Cost Simulation");
		scenarioFlag = true;
	} else {
		logFail("SA is not able to abort on going Cost Simulation");
	}

	waitForElementToBeVisible(CloseSimulationConfig_Sec);
	clickElement(CloseSimulationConfig_Sec);

	if (scenarioFlag == true) {
		scenarioPass();
	} else {
		scenarioFail();
	}

}

/**
 * TC_112: Validate if SA is able to see the RP status in Pricing Status tab and
 * is able to navigate to MMP Griddy.
 * 
 * @since 14/03/2024
 * 
 * @release April 1
 * 
 * @author nitish.kumar.prusty
 * 
 * This scenario cannot be run in parallel prod because of request pricing limitations.
 */
public void validateMMPGriddy() throws Exception {

	boolean scenarioFlag = false;
	String mmpUrl = "";

	waitForElementToBeVisible(PricingFactor_Tab);
	clickElement(PricingFactor_Tab);

	waitForElementToBeVisible(RequestPricing_Btn);
	clickElement(RequestPricing_Btn);

	waitForElementToBeVisible(SCCSuggestionOK_Btn);
	clickElement(SCCSuggestionOK_Btn);

	waitForElementToBeVisible(RequestPricingNOTAX_Btn);
	clickElement(RequestPricingNOTAX_Btn);

	waitForElementToBeVisible(WithOutNearShore_btn);
	clickElement(WithOutNearShore_btn);

	// checking the Tax Request Status to be changed to Completed
	Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(300))
			.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	wait.until(ExpectedConditions.textToBePresentInElement(TaxStatus_Sec, "Completed"));

	waitForElementToBeVisible(MMP_Link);
	if (isDisplayed(MMP_Link)) {
		logPass("MMP Link Displayed Successfully.");
		clickElement(MMP_Link);
		switchToTab(1);
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(30))
				.ignoring(Exception.class);

		// wait until the url contains "mmp.ciotest"
		wait1.until((Function<WebDriver, Boolean>) webDriver -> webDriver.getCurrentUrl().contains("mmp.ciotest"));

		mmpUrl = getDriver().getCurrentUrl();
		if (mmpUrl.contains("mmp.ciotest")) {
			logPass("SA is able to Navigate to MMP Griddy");
			scenarioFlag = true;
		} else {
			logFail("SA is not ablt to Naviagte to MMP Griddy");
		}

	} else {
		logFail("MMP Link not Displayed");
	}

	if (scenarioFlag == true) {
		scenarioPass();
	} else {
		scenarioFail();
	}

}

/**
 * TC_119: Validate if changes made in Profile and Group tabs reflect in ADL and
 * KDA reports generated.
 * 
 * @since 19/03/2024
 * 
 * @release April 1
 * 
 * @author nitish.kumar.prusty
 * 
 * BUG 3501902 in Generate Pricing ADL Status screen
 * 
 */
public void validateChangesForProfileAndGroups() throws Exception {

	boolean scenarioFlag = false;
	String kdaReportFileName = "";
	String currentURL = "";
	String adlProfileVal = "";
	String adlGroupsVal = "";
	String kdaProfileVal = "";

	String editedProfileValue = editProfileTab();
	String editedGroupsValue = editGroupsTab();

	logInfo("Edited profile Value - " + editedProfileValue);
	logInfo("Edited Group Value - " + editedGroupsValue);

	waitForElementToAppear(Next_Btn);
	waitForElementToBeVisible(Next_Btn);
	clickElement(Next_Btn);

	waitForElementToAppear(GeneratePricing_Tab);
	waitForElementToBeVisible(GeneratePricing_Tab);
	clickElement(GeneratePricing_Tab);

	generateADL();

	String adlReportFileName = getText(ADLFileName_Sec).substring(0,30);

//	// wait until the file is downloaded
	waitUntilFileDownloaded(adlReportFileName);

	System.out.println(adlReportFileName);

	boolean isADLReportDownloaded = searchFile(adlReportFileName);
	if (isADLReportDownloaded) {
		logPass("ADL Report Downloaded Successfully and saved in Downloads Path");
	} else {
		logFail("ADL Report is not Downloaded and not present in Downloads Path");
	}

	adlProfileVal = getDataFromExcel(adlReportFileName, "Cost Assumptions", 57, 5);
	adlGroupsVal = getDataFromExcel(adlReportFileName, "Cost Assumptions", 21, 2);

	logInfo("Profile Val - " + adlProfileVal);
	logInfo("Groups Val - " + adlGroupsVal);

	generateKDA();

	currentURL = getDriver().getCurrentUrl();

	if (currentURL.contains("myispnextgencore")) {

		kdaReportFileName = "OCPReport_Contract Year";
	} else {
		kdaReportFileName = "SCPReport_Contract Year";
	}

	waitUntilFileDownloaded(kdaReportFileName);

	switchToTab(0);

	boolean isKDAReportDownloaded = searchFile(kdaReportFileName);
	if (isKDAReportDownloaded) {
		logPass("KDA Report Downloaded Successfully and saved in Downloads Path");
	} else {
		logFail("KDA Report is not Downloaded and not present in Downloads Path");
	}

	kdaProfileVal = getDataFromExcel(kdaReportFileName, "CY View (YOY)-Detail", 5, 1);

	logInfo("KDA Profile Val : " + kdaProfileVal);

	if (adlProfileVal.equals(editedProfileValue) && adlGroupsVal.equals(editedGroupsValue)
			&& kdaProfileVal.contains(editedProfileValue)) {
		logPass("Changes made in Profile and Group tabs reflect in ADL and KDA reports generated.");
		scenarioFlag = true;
	} else {
		logFail("Changes made in Profile and Group tabs not reflect in ADL and KDA reports generated.");
	}

	if (scenarioFlag == true) {
		scenarioPass();
	} else {
		scenarioFail();
	}

}

/*
 * Method to Edit the Profile Screen
 * 
 * @since 19/03/2024
 * 
 * @author nitish.kumar.prusty
 * 
 */

public String editProfileTab() throws Exception {

	String profileTabCityTitle = "";
	String profileSaveStatus = "";
	String profileTabEditedCityTitle = "";

	waitForElementToAppear(Previous_Btn);
	waitForElementToBeVisible(Previous_Btn);
	clickElement(Previous_Btn);

	waitForElementToAppear(Profiles_Tab);
	waitForElementToBeVisible(Profiles_Tab);
	clickElement(Profiles_Tab);

//	By element = By.xpath("//div[text() = 'dummy'");
	waitForElementToAppear(Profile_Grid);
	waitForElementToBeVisible(Profile_Grid);

	wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
	scrollHorizontallyInsideElement(Profile_Grid, 2500);

	waitForElementToAppear(ProfileTabEdit_Icon);
	waitForElementToBeVisible(ProfileTabEdit_Icon);
	clickElement(ProfileTabEdit_Icon);

	waitForElementToAppear(ProfileTabCity_InputField);
	waitForElementToBeVisible(ProfileTabCity_InputField);

	profileTabCityTitle = ProfileTabCity_InputField.getAttribute("title");

	// first click on input field
	clickElement(ProfileTabCity_InputField);

	// clearing the data already present in that input field
	ProfileTabCity_InputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	ProfileTabCity_InputField.sendKeys(Keys.BACK_SPACE);

	// again clicking on it so that autosuggestion list get enabled.
	clickElement(ProfileTabCity_InputField);

	List<WebElement> AutoSuggestedList = getDriver().findElements(By.xpath("//*[@id='ulCity']//li//a"));

	waitForElementToBeVisible(AutoSuggestedList);

	for (WebElement ele : AutoSuggestedList) {
		if (!ele.getText().equals(profileTabCityTitle)) {
			clickElement(ele);
			break;
		}
	}

	waitForElementToAppear(ProfileTabSave_Btn);
	waitForElementToBeVisible(ProfileTabSave_Btn);
	clickElement(ProfileTabSave_Btn);

	waitForElementToAppear(ProfileTabSaveAlert);
	waitForElementToBeVisible(ProfileTabSaveAlert);

	profileSaveStatus = getText(ProfileTabSaveAlert);

	profileTabEditedCityTitle = ProfileTabCity_InputField.getAttribute("title");

	if (profileSaveStatus.equals("Profile saved successfully.")) {
		logPass("Profile Tab Edited Successfully");
	} else {
		logFail("Profile Tab Details Not Modified");
	}

	waitForElementToAppear(ProfileTabClose_Btn);
	waitForElementToBeVisible(ProfileTabClose_Btn);
	clickElement(ProfileTabClose_Btn);

	return profileTabEditedCityTitle;
}

/*
 * Method to Edit the Groups Screen
 * 
 * @since 19/03/2024
 * 
 * @author nitish.kumar.prusty
 * 
 */

public String editGroupsTab() throws Exception {

	String skillTierBeforeEdit = "";
	String skillTierAfterEdit = "";
	String groupsSavedStatus = "";

	waitForElementToAppear(GroupsTab);
	waitForElementToBeVisible(GroupsTab);
	clickElement(GroupsTab);

	waitForElementToAppear(Groups_Grid);
	waitForElementToBeVisible(Groups_Grid);
	
	wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
	scrollHorizontallyInsideElement(Groups_Grid,5000);

	waitForElementToAppear(GroupsEdits_icon);
	waitForElementToBeVisible(GroupsEdits_icon);
	jsClick(GroupsEdits_icon);

	waitForElementToAppear(GroupsSkillTier);
	waitForElementToBeVisible(GroupsSkillTier);

	skillTierBeforeEdit = getText(GroupsSkillTier);

	clickElement(GroupsSkillTier);

	List<WebElement> Skills = getDriver()
			.findElements(By.xpath("//*[@id='lblADTier']/..//ul//li[contains(@id,'Skill Tier')]//a"));

	for (WebElement ele : Skills) {
		if (!ele.getText().equals(skillTierBeforeEdit)) {
			clickElement(ele);
			break;

		}
	}

	skillTierAfterEdit = getText(GroupsSkillTier);

	waitForElementToAppear(GroupsSave_Btn);
	waitForElementToBeVisible(GroupsSave_Btn);
	clickElement(GroupsSave_Btn);

	waitForElementToAppear(GroupsOk_Btn);
	waitForElementToBeVisible(GroupsOk_Btn);
	clickElement(GroupsOk_Btn);

	waitForElementToAppear(GroupsStatus_Label);
	waitForElementToBeVisible(GroupsStatus_Label);
	groupsSavedStatus = getText(GroupsStatus_Label);
	if (groupsSavedStatus.equals("Groups saved successfully")) {
		logPass("Groups Tab Edited Successfully");
	} else {
		logFail("Groups Tab Details Not Modified");

	}

	return skillTierAfterEdit;

}


/*
 * Method to Generate KDA in Generate Pricing Screen
 * 
 * @since 19/03/2024
 * 
 * @author nitish.kumar.prusty
 * 
 */

public void generateKDA() throws Exception {

	waitForElementToAppear(OneClickPricing_Subtab);
	waitForElementToBeVisible(OneClickPricing_Subtab);
	clickElement(OneClickPricing_Subtab);
	
	
	actionForMMEAndStandardhrs("Standard Hours",ConstantUtils.FilePath_GeneratePricing,"GeneratePricing");

	waitForElementToAppear(ViewSCP_Btn);
	waitForElementToBeVisible(ViewSCP_Btn);
	clickElement(ViewSCP_Btn);

	switchToTab(1); // needs to be updated

	waitForElementToAppear(KDADownload_Btn);
	waitForElementToBeVisible(KDADownload_Btn);
	clickElement(KDADownload_Btn);

	waitForElementToAppear(KDAReportType_Btn);
	waitForElementToBeVisible(KDAReportType_Btn);
	clickElement(KDAReportType_Btn);

	waitForElementToBeVisible(KDAReportType_Drpdown);
	for (WebElement ele : KDAReportType_Drpdown) {
		if (ele.getText().equals("Contract Year View")) {
			clickElement(ele);
			break;
		}
	}

	waitForElementToAppear(ExcelDownload_Btn);
	waitForElementToBeVisible(ExcelDownload_Btn);
	clickElement(ExcelDownload_Btn);

	waitForElementToAppear(ConfidentialReminder_Popup);
	waitForElementToBeVisible(ConfidentialReminder_Popup);
	clickElement(ConfidentialReminder_Popup);

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
					if (file.getName().startsWith(fileName)) {
						return true;
					}
				}
			}
			return false;
		}
	});
}

/*
 * Method to check if the file starting with particular name is present in
 * Downloads path.
 * 
 * @since 19/03/2024
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
				if (file.getName().startsWith(fileName)) {
					return true;
				}
			}
		}
	}
	return false;
}

/*
 * Method to get the value from excel sheet starting with particular file name.
 * 
 * @since 19/03/2024
 * 
 * @author nitish.kumar.prusty
 * 
 */

public String getDataFromExcel(String fileNameStartsWith, String sheetName, int rowNum, int colNum) {
	String data = "";

	try {
		File folder = new File(ConstantUtils.DownloadedFiles_FilePath);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile() && file.getName().startsWith(fileNameStartsWith)) {
				FileInputStream fis = new FileInputStream(file);
				Workbook workbook = WorkbookFactory.create(fis);

				// Get the desired sheet
				Sheet sheet = workbook.getSheet(sheetName);

				// Get the desired cell value
				Row row = sheet.getRow(rowNum - 1);
				Cell cell = row.getCell(colNum - 1);

				if (cell != null) {
					data = cell.toString();
				}

				// close the workbook
				workbook.close();
				fis.close();

				// break out of loop
				break;
			}
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	return data;
}

}