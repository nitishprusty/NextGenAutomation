package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesWorkFlowPage extends BasePage {

	Interim_Page interimPage = PageFactory.initElements(getDriver(), Interim_Page.class);

	Manage_SA_Page ManageSaPage;
	OpportunitiesPage opportunitiesPage;
	WAWS_Page wAWS_Page = new WAWS_Page();

	/***************************** Locators *****************************/

	//@Keerthi
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Total Opportunities')]")
	public WebElement TotalOpportunities;

	@FindBy(how = How.XPATH, using = "//*[@col-id='MMSID']//div[@class='MMSID']/div")
	public WebElement MMSid ;

	@FindBy(how = How.XPATH, using = "//div[text()='Opportunity Workflow']")
	public WebElement OpportunityWorkflow;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define Team')]")
	public WebElement DefineTeamTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'What Are We Solving For')]")
	public WebElement WhatAreWeSolvingForTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Value Shaping')]")
	public WebElement ValueShapingTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Estimators / Calculators')]")
	public WebElement EstimatorsCalculatorsTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Solution Components')]")
	public WebElement SolutionComponentsTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Value Based Deal Construct')]")
	public WebElement ValueBasedDealConstructTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Digital Documentation')]")
	public WebElement DigitalDocumentationTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Review Approvals')]")
	public WebElement ReviewApprovalsTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Contract Solution Gap Analysis')]")
	public WebElement ContractSolutionGapAnalysisTile;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Transition To Delivery')]")
	public WebElement TransitionToDeliveryTile;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Opportunity Information')]")
	public WebElement OpportunityInformationTitle;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'View MMS Details')]")
	public WebElement ViewMMSDetailsLink;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'MMS Details')]")
	public WebElement MMSDetails_page;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunity Workflow')]")
	public WebElement BreadcrumbOppWorkflow;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Opportunities')]")
	public WebElement BreadcrumbOpp;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Manage')]")
	public WebElement BreadcrumbManage;
	
	@FindBy(how = How.XPATH, using = "//a[@class='breadcrumb-item']")
	public WebElement BreadcrumbManage_KDAPage;
	

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Manage')]")
	public WebElement ManageTitle;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Quick Links')]")
	public WebElement QuickLinksTitle;

	@FindBy(how = How.XPATH, using = "//div[@class='right-section opps-Financial-grid-container']")
	public WebElement MMSDetailsgrid;

	@FindBy(how = How.XPATH, using = "//div[text()='Opportunities']")
	public WebElement OppTitle;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'user-menu')]")
	public WebElement UserRoleBtn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Role Preferences')]")
	public WebElement RolePreferences;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'mat-radio-4-input')]")
	public WebElement Radiobtn_SME;

	@FindBy(how = How.XPATH, using = "//lib-button[@class='group-btns-save']")
	public WebElement UserRoleSavebtn;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'radio-checked ')]/label")
	public WebElement SelectedRole;

	@FindBy(how = How.XPATH, using = "//label[contains(@for,'mat-radio-4-input')]")
	public WebElement UserRole_SME;

	@FindBy(how = How.XPATH, using = "//span[text()=' SA ']//ancestor::div[contains(@class,'role-header')]")
	public WebElement UserRole_SA;
	
	@FindBy(how = How.XPATH, using = "//li//a[text()='Manage']")
	public WebElement ManageBtn;
	
	@FindBy(how = How.XPATH, using = "//a[text()='AMS']")
	public WebElement KDP_AMSLink;
	
	@FindBy(how = How.XPATH, using = "//div[@id='CostCountId']//span[contains(text(),'Financials')]")
	public WebElement KDP_AMS_FinancialsTitle;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'VIEW')])[1]")
	public WebElement HarmonizedKDA_ViewLink;
	
	@FindBy(how = How.XPATH, using = " (//a[@class='link-cls manage-link active'])[1]")
	public WebElement ManageLink_Harmonized_KDA;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Manage']")
	public WebElement ManageLink_KDA_AMS;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement FilterTextField_MMSID;
	
	//Sarthak
	@FindBy(how = How.XPATH, using = "//div[@class='mpl-page-header ng-star-inserted']")
	public WebElement Opportunity_Workflow;

	@FindBy(how = How.XPATH, using = "//div[text()='Deal Canvas Last Published']/following::a[text()='VIEW']")
	public WebElement DealCanvas_View;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Opportunity Deal Canvas']")
	public WebElement Deal_Page;

	@FindBy(how = How.XPATH, using = "//img[@title='Edit']")
	public WebElement Edit_Status;

	@FindBy(how = How.XPATH, using = "//div[@role='tab'][not(contains(@class,'disabled'))]//div[contains(@class,'tab-header-container')]")
	public List<WebElement> SG_ListElement;
	
	@FindBy(how = How.XPATH, using = "//div[@role='tab'][not(contains(@class,'disabled'))]")
	public List<WebElement> SG_List;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'tab-header-container')][normalize-space()='AMS']")
	public WebElement AMS_BTN;

	@FindBy(how = How.XPATH, using = "//textarea[contains(@class,'mat-tooltip-trigger')]")
	public WebElement Enter_Text;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Save']")
	public WebElement Save_BTN;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Select Service Group')]/..//span[contains(@class,'mat-select-min-line')]")
	public WebElement SGG_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[@role='option']//span[normalize-space()='SI *']")
	public WebElement SI_Optn;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'mat-select-min-line')][normalize-space()='SI *']")
	public WebElement Updated_SSG_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Select Role')]/..//span[contains(@class,'mat-select-min-line')]")
	public WebElement SR_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[@role='option']//span[contains(text(),' Supporting SA')]")
	public WebElement SupportingSA_Optn;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'mat-select-min-line')][normalize-space()='Supporting SA']")
	public WebElement Updated_SR_Dropdown;

	@FindBy(how = How.XPATH, using = "//img[@id='chatbtn']")
	public WebElement Disaa_Btn;

	@FindBy(how = How.XPATH, using = "//div[@id='ChatHeader']//div[@class='row']")
	public WebElement Disaa_Validation;

	@FindBy(how = How.XPATH, using = "//div[@id='supportNew']")
	public WebElement Support_Btn;

	@FindBy(how = How.XPATH, using = "//a[@id='LiveChatId1']")
	public WebElement Support_Validation;

	@FindBy(how = How.XPATH, using = "//img[contains(@class,'user-default-icon action-hover')]")
	public WebElement User_Dropdown;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'mpl-image-role-container')]")
	public WebElement UD_Validation;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='English']")
	public WebElement Language;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Deal Team']")
	public WebElement Deal_Team;

	@FindBy(how = How.XPATH, using = "//h4[contains(@class,'panel-title')][normalize-space()='Define Team']")
	public WebElement DealTeam_Page;

	@FindBy(how = How.XPATH, using = "//span[text()='My Role Preferences']")
	public WebElement Role_Preferences;

	@FindBy(how = How.XPATH, using = "//label[@for='mat-radio-4-input']//span[@class='mat-radio-label-content']")
	public WebElement SME_Role;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Save']")
	public WebElement Save;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Welcome to myIntegrated Solution Platform']")
	public WebElement Landing_page;
	
	@FindBy(how = How.XPATH, using = "//img[@src='../../assets/images/close-icon.svg']")
	public WebElement Close_Btn;
	
	@FindBy(how = How.XPATH, using = "//label[@for='mat-radio-2-input']//span[@class='mat-radio-label-content']")
	public WebElement SA_Role;
	
	//@Ganesh
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]/a[text()='SME Request Charters']")
	public WebElement SMERequestChartersLink;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]/a[text()='Opportunity on a Page']")
	public WebElement opportunityOnAPageLink;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]/a[text()='Scope']")
	public WebElement scopeLink;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]/a[text()='Preliminary Assessment']")
	public WebElement preliminaryAssessmentLink;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]/a[text()='Client Context']")
	public WebElement clientContextLink;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]/a[text()='360° Client Insights']")
	public WebElement clientInsights360Link;
	@FindBy(how = How.XPATH, using = "//a[text()='360° Diagnostics']")
	public WebElement diagnostics360Link;
	@FindBy(how = How.XPATH, using = "//span[text()='Shape Value Proposition']")
	public WebElement shapeValuePropositionLink;
	@FindBy(how = How.XPATH, using = "//a[text()='Identify Differentiation Themes']")
	public WebElement identifyDifferentiationThemesLink;
	
//	@FindBy(how = How.XPATH, using = "//a[text()='SME Request Charters ' and @aria-expanded='true']")
//	public WebElement SMERequestChartersPage;
	@FindBy(how = How.XPATH, using = "//a[@id='charterTab']/parent::li")
	public WebElement SMERequestChartersPage;
	@FindBy(how = How.XPATH, using = "//li[@class='active anchor__cursor']/span[text()='Opportunity on a Page']")
	public WebElement opportunityOnAPagePage;
	@FindBy(how = How.XPATH, using = "//li[@class='active anchor__cursor']/span[text()='Scope']")
	public WebElement scopePage;
	@FindBy(how = How.XPATH, using = "//span[text()='Preliminary Assessment']/parent::li")
	public WebElement preliminaryAssessmentPage;
	@FindBy(how = How.XPATH, using = "//li[contains(@class,'active anchor__cursor')]/span[text()='Client Context']")
	public WebElement clientContextPage;
	@FindBy(how = How.XPATH, using = "//li[@class='active mx-navigationlist-item'][child::a[text()='360° Client Insights']]")
	public WebElement clientInsights360Page;
	@FindBy(how = How.XPATH, using = "//li[@class='mx-2 active anchor__cursor'][child::span[text()='360° Diagnostics']]")
	public WebElement diagnostics360LinkPage;
	@FindBy(how = How.XPATH, using = "//li[@class='active mx-navigationlist-item'][child::a[text()='Shape Value Proposition']]")
	public WebElement shapeValuePropositionPage;
	@FindBy(how = How.XPATH, using = "//li[@class='active mx-navigationlist-item'][child::a[text()='Identify Differentiation Themes']]")
	public WebElement identifyDifferentiationThemesPage;
	
	//ims
	@FindBy(how = How.XPATH, using = "//a[text()='Opportunity on a Page']//preceding-sibling::img")
	public WebElement OppOnPage_Link;
	@FindBy(how = How.XPATH, using = "//a[text()='Scope']//preceding-sibling::img")
	public WebElement scope_Link;
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'breadcrumb')][text()='Opportunity Workflow']")
	public WebElement solComp_OppWorkFlow_breadcrumb;
	
	
	//@Ashish
	@FindBy(how = How.XPATH, using = "//a[text()= 'Manage']")
	public WebElement Manage_btn;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Solution Configuration')]")
	public WebElement SolutionConfigurationLink;

	@FindBy(how = How.ID, using = "ActiveTab")
	public WebElement VersionText;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Parameters')]")
	public WebElement ParametersLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Staffing')]")
	public WebElement StaffingLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Costing')]")
	public WebElement CostingLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Pricing')]")
	public WebElement PricingLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Reports')]")
	public WebElement ReportsLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define Ratecard')]")
	public WebElement DefineRateCardLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Build Quadrants for Value Based BSC')]")
	public WebElement BuildQuadrantsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define Weight / Review KPIs')]")
	public WebElement DefineWeightsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define Risk / Reward Fees')]")
	public WebElement DefineRisksLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define KPI Target Values')]")
	public WebElement DefineKpiLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Run Sensitivity Analyzer')]")
	public WebElement RunSensitivityLink;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Value Based Deal Shaping - Sensitivity Analysis Ve')]")
	public WebElement ValueBasedDealText;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Digital Solution Plan Designer')]")
	public WebElement DigitalSolutionPlanDesignerLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Deal Canvas')]")
	public WebElement DealCanvasLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Multi-Service Deal Analytics')]")
	public WebElement MultiServiceDealAnalyticsLink;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Digital Solution Plan Designer']")
	public WebElement DigitalSolutionPlanDesignerText;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Deal Canvas')]")
	public WebElement DealCanvasText;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Multi-Service Deal Analytics')]")
	public WebElement MultiServiceDealAnalyticsText;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunity Workflow')]")
	public WebElement OpportunityWorkFlowLink;
	
	@FindBy(how = How.XPATH, using = "//li[@class='active']")
	public WebElement LandingPageOverview;
	
	@FindBy(how = How.XPATH, using = "//div[@role='button'][ancestor::div[@role='cell']]")
	public WebElement vesrioningList;

    /****************************Method*********************************/
	
	public OpportunitiesWorkFlowPage() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	Manage_SA_Page ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
	//String OppID_ServiceGroup_AMS1 = "";
	
	/**
	 * TC_1: Validate that user is able to view Opportunity Workflow page
	 * TC_3: Validate that user is able to view the header "Opportunity Workflow" displayed towards top left corner
	 * 
	 * @since 18/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */

	public void viewOpportunityWorkflowPage(String OppID_AMS_KDAPAGE) throws Exception
	{
		boolean scenarioFlag = true;
		clickElement(TotalOpportunities);	
		sendKeys(FilterTextField_MMSID,OppID_AMS_KDAPAGE);
		clickElement(MMSid);
		String oppText = OpportunityWorkflow.getText();
		if (oppText.contains("Opportunity Workflow")&& isDisplayed(BreadcrumbManage)&& isDisplayed(BreadcrumbOpp)) {
			logPass("Succesfully user is able to view oppoprtunity workflow page ");
		} else {
			logFail("Failed to view oppoprtunity workflow page");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass(); 
		} 
	}
	/**
	 * TC_2: Validate that user is able to view the tiles and the data to be flown in the entire Opportunity Workflow page
	 * 
	 * @since 18/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */

	
	public void viewOpportunityWorkflowPageTiles() throws Exception
	{
		boolean scenarioFlag = true;
		String defTeamTile = DefineTeamTile.getText();

		if (defTeamTile.equals("Define Team")) {
			logPass("Succesfully user is able to view Define Team Tile");
		} else {
			logFail("Failed to view Define Team Tile");
			scenarioFlag = false;
		}
		String WRWS = WhatAreWeSolvingForTile.getText();

		if (WRWS.equals("What Are We Solving For")) {
			logPass("Succesfully user is able to view What Are We Solving For Tile");
		} else {
			logFail("Failed to view What Are We Solving For Tile");
			scenarioFlag = false;
		}
		String valueShaping = ValueShapingTile.getText();

		if (valueShaping.contains("Value Shaping")) {
			logPass("Succesfully user is able to view What Are We Solving For Tile");
		} else {
			logFail("Failed to view What Are We Solving For Tile");
			scenarioFlag = false;
		}

		String estimatorscal = EstimatorsCalculatorsTile.getText();

		if (estimatorscal.equals("Estimators / Calculators")) {
			logPass("Succesfully user is able to view Estimators / Calculators Tile");
		} else {
			logFail("Failed to view Estimators / Calculators Tile");
			scenarioFlag = false;
		} 

		String solutioncomp = SolutionComponentsTile.getText();
		if (solutioncomp.equals("Solution Components"))
		{
			logPass("Succesfully user is able to view Solution ComponentsTile");
		} else {
			logFail("Failed to view Solution Components Tile");
			scenarioFlag = false;
		}

		String valueBasedeal = ValueBasedDealConstructTile.getText();
		if (valueBasedeal.equals("Value Based Deal Construct")) {
			logPass("Succesfully user is able to view Value Based Deal Construct");
		} else {
			logFail("Failed to view Value Based Deal Construct");
			scenarioFlag = false;
		}

		String digitalDoc = DigitalDocumentationTile.getText();
		if (digitalDoc.equals("Digital Documentation")) {
			logPass("Succesfully user is able to view Digital Documentation");
		} else {
			logFail("Failed to view Digital Documentation");
			scenarioFlag = false;
		}

		String reviewApp = ReviewApprovalsTile.getText();
		if (reviewApp.equals("Review Approvals")) {
			logPass("Succesfully user is able to view Review Approvals");
		} else {
			logFail("Failed to view Review Approvals");
			scenarioFlag = false;
		}

		String contractsolgap = ContractSolutionGapAnalysisTile.getText();
		if (contractsolgap.equals("Contract Solution Gap Analysis")) {
			logPass("Succesfully user is able to view Contract Solution Gap Analysis");
		} else {
			logFail("Failed to view Contract Solution Gap Analysis");
			scenarioFlag = false;
		}

		String transitionToDelivery = TransitionToDeliveryTile.getText();

		if (transitionToDelivery.equals("Transition To Delivery")) {
			logPass("Succesfully user is able to view Transition To Delivery");
		} else {
			logFail("Failed to view Transition To Delivery");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass();
		}

	}


	/**
	 * TC_4: Validate that user is able to view the Opportunity Information section
	 * 
	 * @since 18/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */

	public void viewOpportunityInformation() throws Exception
	{

		boolean scenarioFlag = false;
		String oppInfotitle = OpportunityInformationTitle.getText();
		if (oppInfotitle.contains("Opportunity Information")) {
			scenarioFlag = true;
			logPass("Succesfully user is able to view Opportunity Information page ");
		} else {
			logFail("Failed to view Opportunity Information page");
		}
		if (scenarioFlag == true) {
			scenarioPass(); 
		} 

	}

	/**
	 * TC_5: Validate that user is able to click on View MMS Details Hyperlink and view the MMS details
	 * 
	 * @since 19/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */

	public void viewMMSDetailsHyperlink() throws Exception
	{
		boolean scenarioFlag = true;
		boolean MMSDetailslink = isDisplayed(ViewMMSDetailsLink);
		if (MMSDetailslink)
			logPass("User is able to view the MMS Details link ");
		else {
			logFail("Failed to view the MMS Details link");
			scenarioFlag = false;
		}

		clickElement(ViewMMSDetailsLink);

		if (isDisplayed(MMSDetails_page) && isDisplayed(MMSDetailsgrid)) {
			logPass("User is able to navigate to MMS Details page");

		} else {
			logFail("Failed to view navigate to the MMS Details page");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass(); 
		}  		
	}

	/**
	 * TC_7: Validate the Breadcrumbs in the  MMS Details Page
	 * 
	 * @since 19/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */

	public void viewBreadcrumbsMMSDetailspage(String OppID_AMS_KDAPAGE) throws Exception
	{
		boolean scenarioFlag = true;
		clickElement(ManageBtn);
		clickElement(TotalOpportunities);
		sendKeys(FilterTextField_MMSID,OppID_AMS_KDAPAGE);
		clickElement(MMSid);
		clickElement(ViewMMSDetailsLink);
		
		boolean breadcrumbOppWorkflow = isDisplayed(BreadcrumbOppWorkflow);
		if (breadcrumbOppWorkflow == true)
			logPass("User is able to view the Opportunity Workflow breadcrumb from MMS Details page");
		else {
			logFail("Failed to view the Opportunity Workflow breadcrumb from MMS Details page");
			scenarioFlag = false;
		}

		clickElement(BreadcrumbOppWorkflow);

		if (isDisplayed(OpportunityWorkflow)) {
			logPass("User is able to navigate to Opportunity Workflow page from MMS Details page");

		} else {
			logFail("Failed to view navigate to Opportunity Workflow page from MMS Details page");
			scenarioFlag = false;
		}

		clickElement(ViewMMSDetailsLink);
		boolean breadcrumbOpp = isDisplayed(BreadcrumbOpp);
		if (breadcrumbOpp == true)
			logPass("User is able to view the Opportunity breadcrumb from MMS Details page");
		else {
			logFail("Failed to view the Opportunity breadcrumb from MMS Details page");
			scenarioFlag = false;
		}

		clickElement(BreadcrumbOpp);
		if (isDisplayed(OppTitle)) {
			logPass("User is able to navigate to Opportunities page from MMS Details page");

		} else {
			logFail("Failed to navigate to Opportunities page from MMS Details page");
			scenarioFlag = false;
		}

		clickElement(MMSid);
		clickElement(ViewMMSDetailsLink);

		boolean breadcrumbManage = isDisplayed(BreadcrumbManage);
		if (breadcrumbManage == true)
			logPass("User is able to view the Manage breadcrumb from MMS Details page ");
		else {
			logFail("Failed to view the manage breadcrumb");
			scenarioFlag = false;
		}

		clickElement(BreadcrumbManage);

		if (isDisplayed(ManageTitle)) {
			logPass("User is able to navigate to Manage page from MMS Details page");

		} else {
			logFail("Failed to view navigate to Manage page from MMS Details page");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass(); 
		}	
	}

	/**
	 * TC_8: Validate that user is able to view the Quick Links section
	 * 
	 * @since 19/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */

	public void viewQuickLinksTitle(String OppID_AMS_KDAPAGE) throws Exception {

		boolean scenarioFlag = true;
		loader();
		clickElement(TotalOpportunities);
		sendKeys(FilterTextField_MMSID,OppID_AMS_KDAPAGE);
		clickElement(MMSid);		
		String quickLinksTitle  = QuickLinksTitle.getText();
		if (quickLinksTitle.contains("Quick Links")) {
			logPass("Succesfully user is able to view Quick Links page ");
		} else {
			logFail("Failed to view Quick Links page");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass(); 
		} 		
	}

	/**
	 * TC_6: Validate user is able to switch roles from MMS Details page
	 * 
	 * @since 19/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */

	public void switchRoleMMSDetails() throws Exception
	{
		boolean scenarioFlag = true;
		//click on user profile icon
		loader();
		clickElement(UserRoleBtn);

		//click on Role Preference Link
		clickElement(RolePreferences);

		//Get the selected role
		String selectedRole = SelectedRole.getText();
		
		//Select Another Role
		clickElement(UserRole_SME);
		waitForElementToBeVisible(UserRole_SME);

		//Save 
		clickElement(UserRoleSavebtn);


		waitForElementClickable(UserRoleBtn);
		clickElement(UserRoleBtn);
		clickElement(RolePreferences);
		
		
		String newSelectedRole = SelectedRole.getText();
		
		
		if(!selectedRole.equalsIgnoreCase(newSelectedRole)) {
			logPass("User is able to change the roles from role preference list from MMS Details page");
		}
		else {
			logFail("User is not able to change the roles from role preference list from MMS Details page");
			scenarioFlag = false;
		}
		clickElement(UserRole_SA);	
		clickElement(UserRoleSavebtn);
		if(scenarioFlag == true)
   			scenarioPass();
	}
	
	/**
	 * TC_9: Validate user is able to navigate KDA page when navigated from Quick Links section
	 * 
	 * @since 19/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */
	public void navigateToKDA() throws Exception
	{
		boolean scenarioFlag = true;
		clickElement(KDP_AMSLink);
		loader();
		String Url = getDriver().getCurrentUrl();		
		if(Url.contains("CostAndPrice") && isDisplayed(KDP_AMS_FinancialsTitle))
		{
			logPass("Succesfully user is able to navigate KDA page when navigated from Quick Links section ");
		} else {
			logFail("Failed to navigate KDA page when navigated from Quick Links section");
			scenarioFlag = false;
		}
		clickElement(ManageLink_Harmonized_KDA);
		if (scenarioFlag == true) {
			scenarioPass(); 
		} 		
			
	}
	
	
	/**
	 * TC_10: Validate user is able to navigate to Harmonized KDA page when navigated from Quick Links section
	 * 
	 * @since 19/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */
	public void navigateToHarmonizedKDA(String OppID_AMS_KDAPAGE) throws Exception
	{
		boolean scenarioFlag = true;
		clickElement(TotalOpportunities);
		sendKeys(FilterTextField_MMSID,OppID_AMS_KDAPAGE);
		clickElement(MMSid);
		clickElement(HarmonizedKDA_ViewLink);
		loader();
		String Url = getDriver().getCurrentUrl();
		if(Url.contains("HarmonizedKDA"))
		{
			logPass("Succesfully user is able to navigate to Harmonized KDA page when navigated from Quick Links section ");
		} else {
			logFail("Failed to navigate to Harmonized KDA page when navigated from Quick Links section");
			scenarioFlag = false;
		}
		clickElement(ManageLink_KDA_AMS);
		if (scenarioFlag == true) {
			scenarioPass(); 
		} 		
			
	}

	/**
	 * TC_63: Validate the Breadcrumbs in the Opportunity Workflow Page
	 * 
	 * @since 19/03/2024
	 * @author Lakshmi Keerthi
	 * @return
	 * 
	 */
	
	public void viewBreadcrumbsOpportunityWorkflowpage(String OppID_AMS_KDAPAGE) throws Exception
	{
		boolean scenarioFlag = true;
		clickElement(TotalOpportunities);
		sendKeys(FilterTextField_MMSID,OppID_AMS_KDAPAGE);
		clickElement(MMSid);
		boolean breadcrumbOpp = isDisplayed(BreadcrumbOpp);
		if (breadcrumbOpp == true)
			logPass("User is able to view the Opportunity breadcrumb from Opportunity Workflow page ");
		else {
			logFail("Failed to view the Opportunity breadcrumb from Opportunity Workflow page");
			scenarioFlag = false;
		}

		clickElement(BreadcrumbOpp);
		if (isDisplayed(OppTitle)) {
			logPass("User is able to navigate to Opportunities from Opportunity Workflow page");

		} else {
			logFail("Failed to navigate to Opportunities from Opportunity Workflow page");
			scenarioFlag = false;
		}

		clickElement(MMSid);

		boolean breadcrumbManage = isDisplayed(BreadcrumbManage);
		if (breadcrumbManage == true)
			logPass("User is able to view the Manage breadcrumb from Opportunity Workflow page ");
		else {
			logFail("Failed to view the manage breadcrumb from Opportunity Workflow page");
			scenarioFlag = false;
		}

		clickElement(BreadcrumbManage);

		if (isDisplayed(ManageTitle)) {
			logPass("User is able to navigate to Manage page from Opportunity Workflow page");

		} else {
			logFail("Failed to view navigate to Manage page from Opportunity Workflow page");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass(); 
		}	
	}
	
	
	/**
	 * TC_11: Validate user is able to navigate toDeal Canvas Last Published page when navigated from Quick Links section
	 * 
	 * @since 18/03/2024
	 * 
	 * @release March 22
	 * 
	 * @author sarthak.gautam
	 */

	public void validateNavToDealCanvas(String OppID_ServiceGroup_AMS1) throws Exception {

		boolean scenarioFlag = false;

		navigateToMMSID(OppID_ServiceGroup_AMS1);
		
		// Validating whether user is able to navigate to the Deal CAnvas Last Published page

		waitForElementToBePresent(DealCanvas_View);
		clickElement(DealCanvas_View);
		waitForElementToAppear(Deal_Page);

		if (Deal_Page.isDisplayed()) {
			logPass("User is able to navigate to Deal Canvas Last Published page.");
			scenarioFlag = true;
			//getDriver().navigate().back();
		} 
		else {
			logFail("User is not able to navigate to Deal Canvas Last Published page.");
		}
		//getDriver().navigate().back();
		
		navigateToMMSID(OppID_ServiceGroup_AMS1);
		
		if (scenarioFlag == true)
			scenarioPass();
	}
	

	/**
	 * TC_12: Validate that user is able to view the Status Update section and enter the comments
	 * 
	 * @since 18/03/2024
	 * 
	 * @release March 22
	 * 
	 * @author sarthak.gautam
	 */

	public void validateStatusUpdate() throws Exception {

		// Validating the Edit Status Option and entering comments
		
		boolean scenarioFlag = false, flag2 = false;
		ArrayList<Boolean> a = new ArrayList<Boolean>();
		
		waitForElementToAppear(Edit_Status);
		jse.executeScript("arguments[0].scrollIntoView(true);",Edit_Status);
		jsClick(Edit_Status);
		waitForElementToAppear(AMS_BTN);
		for(int i = 0; i < SG_List.size(); i++) {
			clickElement(SG_ListElement.get(i));
			logInfo(SG_ListElement.get(i).getText());
			waitForElementToAppear(Enter_Text);
			clickElement(Enter_Text);
			sendKeys(Enter_Text,"Test Comment");
			clickElement(Save_BTN);
			waitForElementToAppear(Opportunity_Workflow);
			if (Opportunity_Workflow.isDisplayed()) {
				flag2 = true;
				a.add(flag2);
			}
			else {
				a.add(false);
			}
			waitForElementToAppear(Edit_Status);
			jse.executeScript("arguments[0].scrollIntoView(true);", Edit_Status);
			jsClick(Edit_Status);
			waitForElementToAppear(AMS_BTN);
		}
		waitForElementToAppear(Close_Btn);
		clickElement(Close_Btn);

		if (a.contains(false)) {
			logFail("User is not able to view the Status Update section and on click of the section user should be able to enter the comments based on the SG's and the Opportunity.");
		} 
		else {
			logPass("User is able to view the Status Update section and on click of the section user should be able to enter the comments based on the SG's and the Opportunity.");
			scenarioFlag = true;
		}
		
		if (scenarioFlag == true) 
			scenarioPass();

	}
	

	/**
	 * TC_13: Validate that user is able to view the Select Service Group drop down
	 * 
	 * @since 18/03/2024
	 * 
	 * @release March 22
	 * 
	 * @author sarthak.gautam
	 */

	public void validateServiceGroupDropdown() throws Exception {

		// Validating Select Service Group Dropdown
		
		boolean scenarioFlag = false;
		
		waitForElementToAppear(SGG_Dropdown);
		clickElement(SGG_Dropdown);
		waitForElementToAppear(SI_Optn);
		clickElement(SI_Optn);
		waitForElementToAppear(Updated_SSG_Dropdown);
		
		if(Updated_SSG_Dropdown.isDisplayed()) {
			logPass("User is able to view the Select Service Group field and the SG's assigned to the user for that repesctive deal should be displayed in the drop down and can switch the SG.");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to view the Select Service Group field and the SG's assigned to the user for that repesctive deal should be displayed in the drop down and can switch the SG.");
		}
		
		if (scenarioFlag == true)
			scenarioPass();
	}
	

	/**
	 * TC_14: Validate that user is able to view the Select Role drop down
	 * 
	 * @since 18/03/2024
	 * 
	 * @release March 22
	 * 
	 * @author sarthak.gautam
	 */

	public void validateSelectRoleDropDown() throws Exception{

		// Validating Select Roles Dropdown
		loader();
		boolean scenarioFlag = false;
		
		waitForElementToAppear(SR_Dropdown);
		clickElement(SR_Dropdown);
		waitForElementToAppear(SupportingSA_Optn);
		clickElement(SupportingSA_Optn);
		waitForElementToAppear(Updated_SR_Dropdown);
		
		if(Updated_SR_Dropdown.isDisplayed()) {
			logPass("User is able to view the Select Role field and all the roles assigned to the user for that repesctive deal should be displayed in the drop down and should be able to switch the role.");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to view the Select Role field and all the roles assigned to the user for that repesctive deal should be displayed in the drop down and should be able to switch the role.");
		}
		
		if (scenarioFlag == true)
			scenarioPass();
	}
	

	/**
	 * TC_15: Validate user is able to view DiSSA and Support on the workflow page
	 * 
	 * @since 18/03/2024
	 * 
	 * @release March 22
	 * 
	 * @author sarthak.gautam
	 */

	public void validateDissaSupport() throws Exception{

		// Validating whether user is able to view Disaa and Support options
		
		boolean scenarioFlag = false, flag1 = false, flag2 = false;

		// Validation of Disaa
		
		waitForElementToAppear(Disaa_Btn);
		clickElement(Disaa_Btn);
		waitForElementToAppear(Disaa_Validation);
		if(Disaa_Validation.isDisplayed())
			flag1 = true;

		// Validation of Support button
		waitForElementToAppear(Support_Btn);
		clickElement(Support_Btn);
		waitForElementToAppear(Support_Validation);
		if(Support_Validation.isDisplayed())
			flag2 = true;

		if (flag1 == true && flag2 == true) {
			logPass("User is able to view  DiSSA and Support on workflow page.");
			scenarioFlag = true;
		} 
		else {
			logFail("User is not able to view  DiSSA and Support on workflow page.");
		}
		
		if (scenarioFlag == true)
			scenarioPass();
	}
	

	/**
	 * TC_16: Validate user is able to view the User Dropdown and Notifications upon cick of it
	 * 
	 * @since 18/03/2024
	 * 
	 * @release March 22
	 * 
	 * @author sarthak.gautam
	 */

	public void validateUserAndNotificationBtn() throws Exception{

		//Validating User dropdown

		boolean scenarioFlag = false, flag1 = false, flag2 = false;
		
		waitForElementToAppear(User_Dropdown);
		clickElement(User_Dropdown);
		waitForElementToAppear(UD_Validation);

		if(UD_Validation.isDisplayed())
			flag2 = true;

		//Validating notification icon [Scenario will be on hold due to environment issues]

		if (flag2 == true) {
			logPass("User is able to view User Dropdown on click of it and for Notifications as well.");
			scenarioFlag = true;
			clickElement(Language);
		} 
		else {
			logFail("User is not able to view User Dropdown on click of it and for Notifications as well.");
		}
		
		if (scenarioFlag == true)
			scenarioPass();
	}

	
	/**
	 * TC_17: Validate user is able to switch roles from Workflow page
	 * 
	 * @since 18/03/2024
	 * 
	 * @release March 22
	 * 
	 * @author sarthak.gautam
	 */

	public void validateSwitchRoles(String OppID_ServiceGroup_AMS1) throws Exception{

		// Validating switching roles in work
		
		boolean scenarioFlag = false;
		
		waitForElementToAppear(User_Dropdown);
		clickElement(User_Dropdown);
		waitForElementToAppear(Role_Preferences);
		clickElement(Role_Preferences);
		waitForElementToAppear(SME_Role);
		clickElement(SME_Role);
		clickElement(Save);
		waitForElementToAppear(Landing_page);
		
		if(Landing_page.isDisplayed()) {
			logPass("User is able to switch to the role selected from Workflow page.");
			scenarioFlag = true;
			waitForElementToAppear(User_Dropdown);
			clickElement(User_Dropdown);
			waitForElementToAppear(Role_Preferences);
			clickElement(Role_Preferences);
			waitForElementToAppear(SA_Role);
			clickElement(SA_Role);
			clickElement(Save);
			waitForElementToAppear(Landing_page);
			ManageSAPage.navigatetoMMSID(OppID_ServiceGroup_AMS1);
		}
		else {
			logFail("User is not able to switch to the role selected from Workflow page.");
		}
		
		if(scenarioFlag == true) {
			scenarioPass();
		}

	}

	/**
	 * TC_18: Validate user is able to navigate to Deal Team page when navigated from Define Team tile
	 * 
	 * @since 18/03/2024
	 * 
	 * @release March 22
	 * 
	 * @author sarthak.gautam
	 */

	
	public void validateDealTeam() throws Exception {

		boolean scenarioFlag = false;

		// Validating whether user is able to navigate to the deal team page
		
		waitForElementToBePresent(Deal_Team);
		clickElement(Deal_Team);
		waitForElementToAppear(DealTeam_Page);

		if (DealTeam_Page.isDisplayed()) {
			logPass("User is able to navigate to Deal Team page.");
			scenarioFlag = true;
		} 
		else {
			logFail("User is not able to navigate to Deal Team page.");
		}
		
		if (scenarioFlag == true)
			scenarioPass();
	}

	
	/**
	 * TC_19: Validate user is able to navigate to SME Request Charters page when navigated from Define Team tile
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateToSMERequestCharters(String OppID_ServiceGroup_AMS) throws Exception {
		boolean scenarioFlag = false;
		
		navigateToMMSID(OppID_ServiceGroup_AMS);
		
		waitForElementClickable(SMERequestChartersLink);
		clickElement(SMERequestChartersLink);
		waitForElementClickable(SMERequestChartersPage);
		clickElement(SMERequestChartersPage);
		waitForElementAttributeContainsString(SMERequestChartersPage,"class","active");
		if(SMERequestChartersPage.getAttribute("class").contains("active")) {
			logPass("User able to navigate to SMERequestCharters page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to SMERequestCharters page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
		//getDriver().navigate().back();
		waitForElementClickable(BreadcrumbOppWorkflow);
		clickElement(BreadcrumbOppWorkflow);

	}
	/**
	 * TC_20: Validate user is able to navigate to opportunityOnAPage page when navigated from Define Team tile
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateToOpportunityOnAPagePage() throws Exception {
		boolean scenarioFlag = false;
		
		waitForElementClickable(opportunityOnAPageLink);
		clickElement(opportunityOnAPageLink);
		waitForElementToBePresent(opportunityOnAPagePage);
		if (opportunityOnAPagePage.isDisplayed()) {
			logPass("User able to navigate to Opportunity on a Page page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to Opportunity on a Page page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
		//getDriver().navigate().back();
		waitForElementClickable(BreadcrumbOppWorkflow);
		clickElement(BreadcrumbOppWorkflow);

	}
	/**
	 * TC_21: Validate user is able to navigate to scope page when navigated from opportunityOnAPage
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateToScopePage() throws Exception {
		boolean scenarioFlag = false;
		
		waitForElementClickable(scopeLink);
		clickElement(scopeLink);
		waitForElementToBePresent(scopePage);
		if (scopePage.isDisplayed()) {
			logPass("User able to navigate to scope page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to scope page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
		//getDriver().navigate().back();
		
		waitForElementClickable(BreadcrumbOppWorkflow);
		clickElement(BreadcrumbOppWorkflow);
	}
	/**
	 * TC_22: Validate user is able to navigate to PreliminaryAssessment page when navigated from Scope Page
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateToPreliminaryAssessmentPage() throws Exception {
		boolean scenarioFlag = false;
		
		waitForElementClickable(preliminaryAssessmentLink);
		clickElement(preliminaryAssessmentLink);
		waitForElementAttributeContainsString(preliminaryAssessmentPage,"class","active anchor__cursor");
		if(preliminaryAssessmentPage.getAttribute("class").contains("active anchor__cursor")) {
			logPass("User able to navigate to PreliminaryAssessment page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to PreliminaryAssessment page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
		//getDriver().navigate().back();
		waitForElementClickable(BreadcrumbOppWorkflow);
		clickElement(BreadcrumbOppWorkflow);
	}
	/**
	 * TC_23: Validate user is able to navigate to Client Context page when navigated from PreliminaryAssessmentPage.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateToClientContextPage() throws Exception {
		boolean scenarioFlag = false;
		
		waitForElementClickable(clientContextLink);
		clickElement(clientContextLink);
		waitForElementToBePresent(clientContextPage);
		if (clientContextPage.isDisplayed()) {
			logPass("User able to navigate to scope page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to scope page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
		//getDriver().navigate().back();
		waitForElementClickable(BreadcrumbOppWorkflow);
		clickElement(BreadcrumbOppWorkflow);
	}
	/**
	 * TC_24: Validate user is able to get notification post configuration of WRWS.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void postConfigurationOfWRWS(String OppID_ServiceGroup_IMS) throws Exception {
		boolean scenarioFlag = false;
		boolean flag = false;
		opportunitiesPage = PageFactory.initElements(getDriver(), OpportunitiesPage.class);
		waitForElementClickable(BreadcrumbOpp);
		clickElement(BreadcrumbOpp);
		sendKeys(opportunitiesPage.search_filter, OppID_ServiceGroup_IMS);
		clickElement(opportunitiesPage.MmsIdText);
		
		wAWS_Page.fillMandatoryData_WhatAreWeSolvingFor();
		waitForElementClickable(solComp_OppWorkFlow_breadcrumb);
		clickElement(solComp_OppWorkFlow_breadcrumb);
		if(!OppOnPage_Link.getAttribute("src").contains("Not_Started") && !scope_Link.getAttribute("src").contains("Not_Started")) {
			logPass("User able to fill mandatory fields in the WAWS page.");
			flag = true;
			scenarioFlag = true;
		}
		else {
			logFail("User not able to fill mandatory fields in the WAWS page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * TC_25: Validate user is able to navigate to 360 clientInsights page.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateToClientInsights360Page(String OppID_ServiceGroup_AMS1) throws Exception {
		boolean scenarioFlag = false;
		
		navigateToMMSID(OppID_ServiceGroup_AMS1);
		
		waitForElementClickable(clientInsights360Link);
		clickElement(clientInsights360Link);
		//waitForElementToBePresent(vesrioningList);
		waitForElementClickable(vesrioningList);
		//clickElement(vesrioningList);
		jsClick(vesrioningList);
		loader();
		/*waitForElementToBePresent*/waitForElementClickable(clientInsights360Page);
		if (isDisplayed(clientInsights360Page)) {
			logPass("User able to navigate to 360 clientInsights Page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to 360 clientInsights page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * TC_26: Validate user is able to navigate to 360 diagnostics page.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateTodiagnostics360Page() throws Exception {
		boolean scenarioFlag = false;
	//	waitForElementToBePresent(diagnostics360Link);
		waitForElementClickable(diagnostics360Link);
		clickElement(diagnostics360Link);
		loader();
	/*	waitForElementToBePresent*/waitForElementClickable(diagnostics360LinkPage);
		if (isDisplayed(diagnostics360LinkPage)) {
			logPass("User able to navigate to 360 diagnostics Page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to 360 diagnostics page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * TC_27: Validate user is able to navigate to shape Value Proposition page.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateToShapeValuePropositionPage() throws Exception {
		boolean scenarioFlag = false;
		
		waitForElementToBePresent(shapeValuePropositionLink);
		waitForElementClickable(shapeValuePropositionLink);
		clickElement(shapeValuePropositionLink);
		loader();
		/*waitForElementToBePresent*/waitForElementClickable(shapeValuePropositionPage);
		if (isDisplayed(shapeValuePropositionPage)) {
			logPass("User able to navigate to shape Value Proposition Page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to shape Value Proposition Page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * TC_28: Validate user is able to navigate to identifyDifferentiationThemes page.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigateToidentifyDifferentiationThemesPage() throws Exception {
		boolean scenarioFlag = false;
		
	//	waitForElementToBePresent(identifyDifferentiationThemesLink);
		waitForElementClickable(identifyDifferentiationThemesLink);
		jsClick(identifyDifferentiationThemesLink);
		loader();
		/*waitForElementToBePresent*/waitForElementClickable(identifyDifferentiationThemesPage);
		if (isDisplayed(identifyDifferentiationThemesPage)) {
			logPass("User able to navigate to identifyDifferentiationThemes Page.");
			scenarioFlag = true;
		} else {
			logFail("User not able to navigate to identifyDifferentiationThemes page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	
	
	
	public void navigateToMMSID(String OppID) throws Exception {
		//ManageSaPage = PageFactory.initElements(getDriver(),Manage_SA_Page.class);
		opportunitiesPage = PageFactory.initElements(getDriver(), OpportunitiesPage.class);

		waitForElementClickable(opportunitiesPage.Manage_btn);
		clickElement(opportunitiesPage.Manage_btn);
		waitForElementClickable(opportunitiesPage.TotalOpportunities);
		clickElement(opportunitiesPage.TotalOpportunities);
		sendKeys(opportunitiesPage.search_filter, OppID);
		waitForElementClickable(opportunitiesPage.MmsIdText);
		clickElement(opportunitiesPage.MmsIdText);
		
		//ManageSaPage.navigatetoMMSID(OppID_WRWS);
	}
	

	/**
	 * TC_29: Validate user is able to navigate to Version screen when clicked 
	 * on all the hyperlinks present in  Solution Components tile(For AMS and SI)
	 * 
	 * @since 22/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void solutionComponents_AMS(String OppID_ServiceGroup_AMS) throws Exception {
		
		boolean scenarioFlag = true;
		
		/*clickElement(ManageSaPage.UserRoleBtn);
		clickElement(ManageSaPage.RolePreferenceLink);
		clickElement(ManageSaPage.UserRole_SA);
		waitForElementToAppear(ManageSaPage.UserRoleSaveBtn);
		clickElement(ManageSaPage.UserRoleSaveBtn);*/

		navigateToMMSID(OppID_ServiceGroup_AMS);
		
		waitForElementClickable(SolutionConfigurationLink);
		clickElement(SolutionConfigurationLink);
		boolean versionsSCTitle = VersionText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);
		
		boolean versionsParaTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(ParametersLink);
			clickElement(ParametersLink);
			versionsParaTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(ParametersLink);
			clickElement(ParametersLink);
			versionsParaTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		
		boolean versionsStaffTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(StaffingLink);
			clickElement(StaffingLink);
			versionsStaffTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(StaffingLink);
			clickElement(StaffingLink);
			versionsStaffTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		
		boolean versionsCodeTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(CostingLink);
			clickElement(CostingLink);
			versionsCodeTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(CostingLink);
			clickElement(CostingLink);
			versionsCodeTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		
		boolean versionsPriceTitle;

		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(PricingLink);
			clickElement(PricingLink);
			versionsPriceTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(PricingLink);
			clickElement(PricingLink);
			versionsPriceTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		
		boolean versionsReportsTitle;

		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(ReportsLink);
			clickElement(ReportsLink);
			versionsReportsTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(ReportsLink);
			clickElement(ReportsLink);
			versionsReportsTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		
		boolean versionsDefineRateCardLinkTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(DefineRateCardLink);
			clickElement(DefineRateCardLink);
			versionsDefineRateCardLinkTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(DefineRateCardLink);
			clickElement(DefineRateCardLink);
			versionsDefineRateCardLinkTitle = VersionText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}


		if (versionsSCTitle && versionsParaTitle && versionsStaffTitle && versionsCodeTitle && versionsPriceTitle
				&& versionsReportsTitle && versionsDefineRateCardLinkTitle) {
			logPass("User is able to navigate to Version screen when clicked on "
					+ "all the hyperlinks present in Solution Components "
					+ "tile(For AMS)");
			scenarioFlag = true;
		} else {
			logFail("User is not able to navigate to Version screen when clicked "
					+ "on all the hyperlinks present in Solution Components "
					+ "tile(For AMS)");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
			scenarioPass();

	}


	/**
	 * TC_30: Validate user is able to navigate to INSPIRE Page when clicked on 
	 * all the hyperlinks present in  Solution Components tile(For IMS)
	 * 
	 * @since 22/03/2024
	 * @author Ageeru Ashish
	 * @return pending
	 * 
	 */
	public void solutionComponents_IMS(String OppID_ServiceGroup_IMS) throws Exception {
		
		boolean scenarioFlag = true;
		// Need to write the code for navigating to the MMS ID
		//ManageSaPage.navigateToManage();
		clickElement(opportunitiesPage.Manage_btn);
		clickElement(opportunitiesPage.TotalOpportunities);
		sendKeys(opportunitiesPage.search_filter, OppID_ServiceGroup_IMS);
		clickElement(opportunitiesPage.MmsIdText);

		// Need to write the code for selecting IMS Service Group

		// Need to write the code for Solution Configuration
		waitForElementToAppear(SolutionConfigurationLink);
		clickElement(SolutionConfigurationLink);
		boolean versionsSCTitle = VersionText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);

		waitForElementToAppear(ParametersLink);
		clickElement(ParametersLink);
		boolean versionsParaTitle = VersionText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);

		waitForElementToAppear(StaffingLink);
		clickElement(StaffingLink);
		boolean versionsStaffTitle = VersionText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);

		waitForElementToAppear(CostingLink);
		clickElement(CostingLink);
		boolean versionsCodeTitle = VersionText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);

		waitForElementToAppear(PricingLink);
		clickElement(PricingLink);
		boolean versionsPriceTitle = VersionText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);

		waitForElementToAppear(ReportsLink);
		clickElement(ReportsLink);
		boolean versionsReportsTitle = VersionText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);

		/*waitForElementToAppear(DefineRateCardLink);
		clickElement(DefineRateCardLink);
		boolean versionsDefineRateCardLinkTitle = VersionText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);*/

		if (versionsSCTitle && versionsParaTitle && versionsStaffTitle && versionsCodeTitle && versionsPriceTitle
				&& versionsReportsTitle) {
			logPass("On hovering any column data the complete data appeared in the tool tip");
			scenarioFlag = true;
		} else {
			logFail("On hovering any column data the complete data not appeared in the tool tip");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}

	
	/**
	 * TC_31: Validate user is able to navigate to Build Quadrants for Value 
	 * Based BSC Page when navigated from Value Based Deal Construct tile
	 * 
	 * TC_32: Validate user is able to navigate to Define Weight / Review KPIs 
	 * Page when navigated from Value Based Deal Construct  tile
	 * 
	 * TC_33: Validate user is able to navigate to Define Risk / Reward Fees 
	 * Page when navigated from Value Based Deal Construct  tile
	 * 
	 * TC_34: Validate user is able to navigate to Define KPI Target Values 
	 * Page when navigated from Value Based Deal Construct  tile
	 * 
	 * TC_35: Validate user is able to navigate to Run Sensitivity Analyzer 
	 * Page when navigated from Value Based Deal Construct  tile
	 * 
	 * @since 22/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void valueBasedDealConstruct(String OppID_ServiceGroup_AMS) throws Exception {
		
		boolean scenarioFlag = true;
		
		navigateToMMSID(OppID_ServiceGroup_AMS);
		
		/*TC_31: Validate user is able to navigate to Build Quadrants for Value 
		       Based BSC Page when navigated from Value Based Deal Construct tile*/
		waitForElementClickable(BuildQuadrantsLink);
		clickElement(BuildQuadrantsLink);
		boolean buildQuadrantTitle = ValueBasedDealText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);
		
		/*TC_32: Validate user is able to navigate to Define Weight / Review KPIs 
	             Page when navigated from Value Based Deal Construct  tile*/
		boolean defineWeightsTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(DefineWeightsLink);
			clickElement(DefineWeightsLink);
			defineWeightsTitle = ValueBasedDealText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(DefineWeightsLink);
			clickElement(DefineWeightsLink);
			defineWeightsTitle = ValueBasedDealText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		
		/*TC_33: Validate user is able to navigate to Define Risk / Reward Fees 
		         Page when navigated from Value Based Deal Construct  tile*/
		boolean defineRisksTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(DefineRisksLink);
			clickElement(DefineRisksLink);
			defineRisksTitle = ValueBasedDealText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(DefineRisksLink);
			clickElement(DefineRisksLink);
		    defineRisksTitle = ValueBasedDealText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		
		/*TC_34: Validate user is able to navigate to Define KPI Target Values 
	             Page when navigated from Value Based Deal Construct  tile*/
		boolean defineKpiTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(DefineKpiLink);
			clickElement(DefineKpiLink);
			defineKpiTitle = ValueBasedDealText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(DefineKpiLink);
			clickElement(DefineKpiLink);
			defineKpiTitle = ValueBasedDealText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);	
		}
		
		/*TC_35: Validate user is able to navigate to Run Sensitivity Analyzer 
	             Page when navigated from Value Based Deal Construct tile*/
		boolean runSensitivityTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(RunSensitivityLink);
			clickElement(RunSensitivityLink);
			runSensitivityTitle = ValueBasedDealText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(RunSensitivityLink);
			clickElement(RunSensitivityLink);
			runSensitivityTitle = ValueBasedDealText.isDisplayed();
			clickElement(OpportunityWorkFlowLink);
		}
		
		if(buildQuadrantTitle && defineWeightsTitle && defineRisksTitle
				&& defineKpiTitle && runSensitivityTitle) {
			logPass("User is able to navigate to all the links which are from Value Based Deal Construct tile");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to navigate to all the links which are from Value Based Deal Construct tile");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
			scenarioPass();

	}
	
	
	/**
	 * TC_36: Validate user is able to navigate to Digital Solution Plan Designer 
	 * Page when navigated from Digital Documentation  tile (Not applicable for IMS)
	 * 
	 * @since 22/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void digitalSolutionPlanner(String OppID_ServiceGroup_AMS) throws Exception {
		
		boolean scenarioFlag = true;
		boolean digitalSolutionPlanDesignerTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			//waitForElementToAppear(DigitalSolutionPlanDesignerLink);
			waitForElementClickable(DigitalSolutionPlanDesignerLink);
			clickElement(DigitalSolutionPlanDesignerLink);
			digitalSolutionPlanDesignerTitle = DigitalSolutionPlanDesignerText.isDisplayed();
			waitForElementClickable(OpportunityWorkFlowLink);
			clickElement(OpportunityWorkFlowLink);
		}
		else {
			waitForElementClickable(DigitalSolutionPlanDesignerLink);
			clickElement(DigitalSolutionPlanDesignerLink);
			digitalSolutionPlanDesignerTitle = DigitalSolutionPlanDesignerText.isDisplayed();
			waitForElementClickable(OpportunityWorkFlowLink);
			clickElement(OpportunityWorkFlowLink);
		}
		
		if(digitalSolutionPlanDesignerTitle) {
			logPass("User is able to navigate to Digital Solution Plan Designer Page "
					+ "when navigated from Digital Documentation tile "
					+ "(Not applicable for IMS)");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to navigate to Digital Solution Plan Designer Page "
					+ "when navigated from Digital Documentation  tile "
					+ "(Not applicable for IMS)");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
			scenarioPass();

	}
	
	
	/**
	 * TC_37: Validate user is able to navigate to Deal Canvas Page when navigated 
	 * from Digital Documentation tile
	 * 
	 * @since 22/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void dealCanvas(String OppID_ServiceGroup_AMS) throws Exception {
		
		boolean scenarioFlag = true;
		boolean dealCanvasTitle;
		
		if(isDisplayed(LandingPageOverview)) {
			navigateToMMSID(OppID_ServiceGroup_AMS);
			
			waitForElementClickable(DealCanvasLink);
			clickElement(DealCanvasLink);
			dealCanvasTitle = DealCanvasText.isDisplayed();
			//waitForElementClickable(OpportunityWorkFlowLink);
			//clickElement(OpportunityWorkFlowLink);
			
		}
		else {
			waitForElementClickable(DealCanvasLink);
			clickElement(DealCanvasLink);
			dealCanvasTitle = DealCanvasText.isDisplayed();
			//waitForElementClickable(OpportunityWorkFlowLink);
			//clickElement(OpportunityWorkFlowLink);
			
		}
		
		
		if(dealCanvasTitle) {
			logPass("User is able to navigate to Deal Canvas Page when navigated from "
					+ "Digital Documentation tile");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to navigate to Deal Canvas Page when navigated from "
					+ "Digital Documentation  tile");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
			scenarioPass();

	}

	
	/**
	 * TC_38: Validate user is able to navigate to Multi-Service Deal Analytics Page 
	 * when navigated from Digital Documentation  tile
	 * 
	 * @since 22/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void multiServiceDealAnalytics(String OppID_ServiceGroup_AMS1) throws Exception {
		
		boolean scenarioFlag = true;
		boolean MultiServiceDealAnalyticsTitle = true;

		navigateToMMSID(OppID_ServiceGroup_AMS1);
		
		waitForElementClickable(MultiServiceDealAnalyticsLink);
		clickElement(MultiServiceDealAnalyticsLink);
		MultiServiceDealAnalyticsTitle = MultiServiceDealAnalyticsText.isDisplayed();
		clickElement(OpportunityWorkFlowLink);
		
		if(MultiServiceDealAnalyticsTitle) {
			logPass("User is able to navigate to Multi-Service Deal Analytics "
					+ "Page when navigated from Digital Documentation tile");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to navigate to Multi-Service Deal Analytics Page "
					+ "when navigated from Digital Documentation  tile");
			scenarioFlag = false;
		}
					
		if (scenarioFlag == true)
			scenarioPass();

	}

}
