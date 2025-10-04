package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;

public class Opportunity_Workflow extends BasePage {
	Interim_Page interimPage = PageFactory.initElements(getDriver(), Interim_Page.class);
	Manage_SA_Page ManageSaPage;
	OpportunitiesPage opportunitiesPage;

	Actions action = new Actions(getDriver());

	// Strings
	String DigitalPageTitle = "Digital Documentation";
	String PMO_Tab_Title = "Review Approvals";
	String Review_Tab_Title = "Review Approvals";
	String PMO_Tracker_Title = "PMO Tracker Checklist";
	String KDA_Title = "KDA Variance Analysis";
	String KDA_Tab_Title = "Review Approvals";
	String SolutionReviewTitle = "Solution Review & Approvals";
	String ATC_Involvement_Title = "ATC Involvement";

	/************************** LOCATORS *****************************/

	//@FindBy(how = How.XPATH, using = "//div[contains(@class,'ag-cell-value')][contains(text(),'0010888298')]")
	//public WebElement MMSID;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement Typeatexttofilter;

	@FindBy(how = How.XPATH, using = "//i[starts-with(text(),'search')]")
	public WebElement search;	

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'9900000009')]")
	public WebElement MMSID;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-main-pageHeader']/div[contains(text(),'Opportunity')]")
	public WebElement Total_Opportunities_PageTitle;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'matListItemTitle')]//following-sibling::a)[contains(text(),'Uploaded Documents')]")
	public WebElement Upload_Document_Link;

	@FindBy(how = How.XPATH, using = "//h2[contains(@class,'breadcrumb-title')]")
	public WebElement Digital_Documentation_Page;

	@FindBy(how = How.XPATH, using = "//h2[contains(@class,'breadcrumb-title')]")
	public WebElement Upload_Documents_Page;

	@FindBy(how = How.XPATH, using = "//div[@id='DigitalDocumentation']/p")
	public WebElement Digital_Documentation_Tab;

	@FindBy(how = How.XPATH, using = "//p[contains(@class,'px-3')][contains(text(),'Uploaded Documents')]")
	public WebElement Upload_Documents_Msg;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'matListItemTitle')]//following-sibling::a)[contains(text(),'PMO')]")
	public WebElement PMO_Tracker_Link;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-main-pageHeader']/div[contains(@class,'mpl-page-header')]")
	public WebElement PMO_Tracker_Page_Title;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'mat-tab-label-content')]/div[contains(text(),'Review Approvals')]")
	public WebElement Review_Approvals_Tab;

	@FindBy(how = How.XPATH, using = "//span[@class='kda-variance'][contains(text(),'PMO Tracker Checklist')]")
	public WebElement PMO_Tracker_Check_List;

	@FindBy(how = How.XPATH, using = "//a[@role='button'][contains(text(),'Opportunity Workflow')]")
	public WebElement Opportunity_Workflow_btn;

	@FindBy(how = How.ID, using = "SpanAppMsgTitleId")
	public WebElement Opportunity_err;

	@FindBy(how = How.XPATH, using = "//button[@id='NavUnauthorizedpopupIdCancel']/span")
	public WebElement Opportunity_Workflow_Close_btn;

	@FindBy(how = How.XPATH, using = "//span[@class='mpl-breadcrumb-link-wrap']//a[contains(text(),'Opportunity')]")
	public WebElement PMO_Page_Opportunity_Btn;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ng-star-inserted ')]//following-sibling::a")
	public WebElement KDA_Variance_Link;

	@FindBy(how = How.XPATH, using = "//li[@id='KDAVariance']//following-sibling::span")
	public WebElement KDA_Variance_title;

	@FindBy(how = How.ID, using = "ReviewApprovals")
	public WebElement KDA_Link_Tab;

	@FindBy(how = How.XPATH, using = "//div[@id='Review Approvals']/p")
	public WebElement SolutionTab_Title;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]//following-sibling::a[contains(text(),'Solution Review')]")
	public WebElement Solution_Review_Link;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Solution Review & Approvals')]")
	public WebElement Solution_Review_Title;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]//following-sibling::img")
	public WebElement PMO_Tracker_Dropdown;

	@FindBy(how = How.ID, using = "mat-dialog-0")
	public WebElement DropDown_Alert;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'ATC Involvement')]")
	public WebElement ATC_Involvement_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'GenAI')]")
	public WebElement GenAI_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'KDA')]")
	public WebElement KDA_Availability_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Tools')]")
	public WebElement IE_tools_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Lean Cloud Migration')]")
	public WebElement Cloud_Migration_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Data- AI')]")
	public WebElement Data_AI_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Security')]")
	public WebElement Security_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Venture')]")
	public WebElement Assets_Venture_btn;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sustainability')]")
	public WebElement Sustainability_btn;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-tab-label-content']/div[contains(text(),'ATC')]")
	public WebElement ATC_Involvement_Tab;

	@FindBy(how = How.XPATH, using = "//div[@class='ATC-Involvement']/div[contains(@class,'header-atc')]")
	public WebElement ATC_Involvement_Page_Title;

	@FindBy(how = How.XPATH, using = "//img[@class='pmo ng-star-inserted']")
	public WebElement ReviewApprovalDropdown;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Data- AI')]")
	public WebElement ReviewApprovalDataAIButton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'PMO Tracker Checklist')]")
	public WebElement ReviewApprovalPMOTrackerText;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Security')]")
	public WebElement ReviewApprovalSecurityButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'CF Assets / Venture Partners')]")
	public WebElement ReviewApprovalCFAssetsButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sustainability Adoption')]")
	public WebElement ReviewApprovalSustinabilityButton;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunity Workflow')]")
	public WebElement OpportunityWorkFlowLink;

	@FindBy(how = How.XPATH, using = "(//div[.='Transition To Delivery'])[2]")
	public WebElement delivery;

	//@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]//following-sibling::a[contains(text(),'Transition')]")
	//public WebElement delivery;


	// @FindBy(how = How.XPATH, using = "(//div[@class='ID ag-cell-value'])[1]")
	// public WebElement MmsIdText;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-page-header ng-star-inserted']")
	public WebElement Heading;

	/*
	 * @FindBy(how = How.XPATH, using = "//div[@class='matListItemLine']") public
	 * List<WebElement> Status;
	 */

	@FindBy(how = How.XPATH, using = "//div[@class='matListItemLine']//img")
	public WebElement StatusIcon;

	@FindBy(how = How.XPATH, using = "//div[@class='matListItemLine']//div")
	public WebElement StatusText;

	@FindBy(how = How.XPATH, using = "//*[text()='Define Team']/../img[2]")
	public WebElement DefineTeamIicon;

	@FindBy(how = How.XPATH, using = "//*[text()='What Are We Solving For']/../img[2]")
	public WebElement WhatTeamIicon;

	@FindBy(how = How.XPATH, using = "//*[text()='Value Shaping[BETA]']/../img[2]")
	public WebElement ValueTeamIicon;

	@FindBy(how = How.XPATH, using = "//*[text()='Solution Components']/../img[2]")
	public WebElement SolTeamIicon;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement FilterTextField;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Value Based Deal Construct')]/../img[2]")
	public WebElement ValueBaseTeam;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Review Approvals')]/../img[2]")
	public WebElement ReviewTeam;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Transition To Delivery')]/../img[2]")
	public WebElement TransitionTeam;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Digital Documentation')]/../img[2]")
	public WebElement DigitalTeam;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Deal Team')]")
	public WebElement DealTeam;

	@FindBy(how = How.XPATH, using = "(//img[@src='/assets/images/Started.svg'])[2]")
	public WebElement GreenTick;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Not Started')]")
	public WebElement NotStartText;

	@FindBy(how = How.XPATH, using = "(//img[@src='/assets/images/Not_Started.svg'])[1]")
	public WebElement NotStartIcon;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Not Applicable')]")
	public WebElement NotApplicableText;

	@FindBy(how = How.XPATH, using = "(//img[@src='/assets/images/Not_Applicable.svg'])[1]")
	public WebElement NotApplicableIcon;

	@FindBy(how = How.XPATH, using = "(//div[@class='matListItemLine']//div)[2]")
	public WebElement StartedText;

	@FindBy(how = How.XPATH, using = "(//img[@src='/assets/images/Started.svg'])[1]")
	public WebElement StartedIcon;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'KDA Availability')]")
	public WebElement Kda;

	@FindBy(how = How.XPATH, using = "(//div[contains(.,'KDA Availability')])[10]")
	public WebElement KdaInside;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='mat-input-1'])[1]")
	public WebElement TextArea;

	@FindBy(how = How.XPATH, using = "(//button[@class='mat-focus-indicator mat-raised-button mat-button-base secondary-medium-button ng-star-inserted'])[1]")
	public WebElement SaveBtn;

	@FindBy(how = How.XPATH, using = "//img[contains(@title,'Allows Solution to visualize \"What If\" Risk reward scenarios. Based on the Risk/Reward KPI configuration they can view theimpact on CCI% in sensitivity analyzers screen and consider it for further optimization to the model.')]")
	public WebElement ValueBasedIcon;

	@FindBy(how = How.XPATH, using = "//*[@col-id='MMSID']//div[@class='MMSID']/div")
	public WebElement MMSid;

	// @FindBy(how = How.XPATH, using ="//li[@class='mpl-header-tab-list
	// ng-star-inserted active']")
	// public WebElement Manage_btn;
	@FindBy(how = How.XPATH, using = "//a[text()= 'Manage']")
	public WebElement Manage_btn;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Total Opportunities')]")
	public WebElement TotalOpportunities;

	@FindBy(how = How.XPATH, using = "(//div[@class='ID ag-cell-value'])[1]")
	public WebElement MmsIdText;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunities')]")
	public WebElement Breadcrumbs;

	@FindBy(how = How.XPATH, using = "//div[text()='Opportunities']")
	public WebElement OpportunitiesText;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Active Deals')]")
	public WebElement OppActiveDeals;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Interim Deals')]")
	public WebElement OppInterimDeals;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'All')]")
	public WebElement OppAll;
	@FindBy(how = How.XPATH, using = "//div[@class='recently-section-linktext']/a")
	public WebElement RecentlyWorkedOpportunity;

	@FindBy(how = How.XPATH, using = "//a[text()='Solution Components']")
	public WebElement SolutionComponents;

	@FindBy(how = How.XPATH, using = "//label[text()='Opportunity Information']")
	public WebElement OpportunityInformation;

	// @FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to
	// filter']")
	// public WebElement FilterTextField;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'/assets/images/Filter_icon.svg')]")
	public WebElement OpportunitiesFilterSymbol;
	@FindBy(how = How.XPATH, using = "//p[text() = 'Opportunities' and @class = 'mat-card-head']")
	public WebElement Opportunites_Sec;

	@FindBy(how = How.XPATH, using = "//p[text() = 'Clients ' and @class = 'mat-card-head']")
	public WebElement Clients_Sec;

	@FindBy(how = How.XPATH, using = "//label[text() = 'Coming Soon']") /*
	 * Need to be updated once App_sec will be
	 * active
	 */
	public WebElement App_Sec;

	@FindBy(how = How.XPATH, using = "//h3[text() = 'Analytics and Insights']")
	public WebElement AnalyticsAndInsights_Sec;

	@FindBy(how = How.XPATH, using = "//h3[text() = 'Client Insights 360°']")
	public WebElement ClientInsights_Sec;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Status')]")
	public WebElement FilterStatus;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Stage')]")
	public WebElement FilterStage;

	@FindBy(how = How.XPATH, using = "//input[contains(@name,'search-ag-grid')]")
	public WebElement SearchFilter;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunities')]")
	public WebElement BacktoOpportunitiesbtn;

	@FindBy(how = How.XPATH, using = "//span[@ref='lbRecordCount']")
	public WebElement TotalActiveDealsCount;

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-tab-label-content'])[5]")
	public WebElement ActiveDealCount;

	/*
	 * @FindBy(how = How.XPATH, using = "//*[@col-id='MMSID']") public
	 * List<WebElement> MMSID;
	 */

	// @FindBy(how = How.XPATH, using = "//div[contains(text(),'0010888298')]")
	// public WebElement MMSID;

	@FindBy(how = How.XPATH, using = "//div[@id='PriDealArchId']//ul/li/a")

	public List<WebElement> primaryArchList;

	@FindBy(how = How.XPATH, using = "//div[@id='div1PricingStructureId']//span[@class='dropdown-down']")

	public WebElement pricingStructDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='div1PricingStructureId']//span[@class='dropdown-up']")

	public WebElement pricingStructDropUP;

	@FindBy(how = How.XPATH, using = "//div[@id='div1PricingStructureId']//ul[@class='item2']/li//div")

	public WebElement pricingStrct_Option;

	@FindBy(how = How.XPATH, using = "//div/*[@id='ddlPricingStructure']")

	public WebElement pricingStrctTextValue;

	@FindBy(how = How.XPATH, using = "//*[@id='ddlPricingStructure']//following-sibling::div//ul[@class='item1']//input[@type='text']")

	public WebElement pricingStrct_searchSpace;

	@FindBy(how = How.XPATH, using = "//div[text()='Opportunities']")
	public WebElement OpportunitiesTitle;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Lead SA (AMS)')])[1]")
	public WebElement RoleNameText;

	/*
	 * @FindBy(how = How.XPATH, using =
	 * "((//span[@role='presentation'][normalize-space()='EMEA-Nordic FS'])[1]")
	 * public WebElement MarketCGText;
	 */

	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Type a text to filter')]")
	public WebElement TextFilter;

	@FindBy(how = How.XPATH, using = "(//em[contains(text(),'Save')])[1]")
	public WebElement btn_Save;

	@FindBy(how = How.XPATH, using = "//img[@title='Log Status']")
	public WebElement LogStatusBtn;

	@FindBy(how = How.XPATH, using = "//textarea[@data-placeholder='Enter the text']")
	public WebElement LogStatusTextArea;

	@FindBy(how = How.XPATH, using = "//button[contains(.,'Save')]")
	public WebElement LogStatusSave;

	@FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-container']")
	public WebElement LogStatusSuccesfulMsg;

	@FindBy(how = How.XPATH, using = "//a[contains(.,'Manage')]")
	public WebElement ManageBtn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Total Opportunities ')]/../../..")
	public WebElement opportunitytile;

	@FindBy(how = How.XPATH, using = "//*[text()=' Total Opportunities ']")
	public WebElement Total_opportunitieslink;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement search_filter;

	@FindBy(how = How.XPATH, using = "//span[@id='ag-4-row-count']")
	public WebElement TotalRow_count;

	@FindBy(how = How.XPATH, using = "//span[@id='ag-4-first-row']")
	public WebElement FromRow_count;

	@FindBy(how = How.XPATH, using = "//span[@id='ag-4-last-row']")
	public WebElement ToRow_count;

	@FindBy(how = How.XPATH, using = "//span[@id='ag-4-of-page-number']")
	public WebElement Page_count;

	@FindBy(how = How.XPATH, using = "//div[@role='gridcell' and @col-id='MMSID']")
	public List<WebElement> CountPerPage;

	@FindBy(how = How.XPATH, using = "//div[@ref='btNext']//span")
	public WebElement NextPageIcon;

	@FindBy(how = How.XPATH, using = "//p[text() = 'Last Activity' and @class = 'mat-card-head']")
	public WebElement LastActivity_Sec;

	// @FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to
	// filter']")
	// public WebElement FilterTextField;
	//
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'FI_HH_Hospital District of Helsinki_ HUS')]")
	public WebElement ClientNameText;

	@FindBy(how = How.XPATH, using = "//div[@class='ag-cell-value']")
	public WebElement OpportunityNameText;

	@FindBy(how = How.XPATH, using = "//p[@id='addrole']")
	public WebElement AddRole;
	@FindBy(how = How.XPATH, using = "(//div[@class='mpl-table-cell-wrapper'])[1]")
	public WebElement LogStatusText;

	// @FindBy(how = How.XPATH, using = "(//a[text()='Deal Team']")
	// public WebElement DealTeam;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	public WebElement LogStatusCancelBtn;

	// @FindBy(how = How.XPATH, using =
	// "//*[@col-id='MMSID']//div[@class='MMSID']/div")
	// public WebElement MMSid;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'9900000009')]")
	public WebElement MmsIDDetails;

	@FindBy(how = How.XPATH, using = "//button[@id='PriDealArchbtn']")
	public WebElement primaryArchdropdown;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Deal Team')]")
	public WebElement freshDealElement;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Last Activity')]/../..")
	public WebElement Lastactivitytile;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Last Activity')]/../..//a[contains(text(),'Continue ')]")
	public WebElement Lastactivitytile_Continue;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Opportunities')]/../../../..")
	public WebElement Opportunitiestile;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Last Activity')]/../..//p[contains(@class,'mat-content-mmsid')]")
	public WebElement Lastactivitytile_MMSID;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Last Activity')]/../..//p[contains(@class,'mat-content-sg')]")
	public WebElement Lastactivitytile_ServiceGroup;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Last Activity')]/../..//p[contains(@class,'mat-content-disc')]")
	public WebElement Lastactivitytile_Screenname;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Last Activity')]/../..//p[contains(@class,'mat-content-date')]")
	public WebElement Lastactivitytile_Dateandtime;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Deal Team')]")
	public WebElement DealTeamButton;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'save')]/button")
	public WebElement UserRoleSaveBtn;

	@FindBy(how = How.XPATH, using = "//button[contains(@id,'SaveBtn') and text()='Save']")
	public WebElement Savebutton;

	@FindBy(how = How.XPATH, using = "(//button[@id='SaveBtn'])[1]")
	public WebElement Savebtn;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Estimators / Calculators')]")
	public WebElement Estimators;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Cost Calculators']")
	public WebElement CostCalculators;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'user-menu')]")
	public WebElement UserRoleBtn;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'radio-checked ')]/ancestor::div[contains(@class,'bodyPositioning')]/following-sibling::div[1]")
	public WebElement RoletobeSelected;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Role Preferences')]")
	public WebElement RolePreferenceLink;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'radio-checked ')]/label")
	public WebElement SelectedRole;

	@FindBy(how = How.XPATH, using = "(//mat-card-title[@class='mat-card-title']//following-sibling::a)[contains(text(),'Contract Solution')]")
	public WebElement ContractSolutionGapAnalysis;

	@FindBy(how = How.XPATH, using = "	(//a[@id='AMS for DBR'])[1]")
	public WebElement AMSforDBR;

	@FindBy(how = How.XPATH, using = "(//ng-multiselect-dropdown[@id='ddlPricingStructure'])[1]")
	public WebElement PricingStructure;

	@FindBy(how = How.XPATH, using = "//a[@class='breadcrumb-item' and text()='Manage']")
	public WebElement Manage_breadcrumb;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveBtnNew']")
	public WebElement SaveButton;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunity on a Page')]")
	public WebElement WRWS_Opportunityonpage;

	@FindBy(how = How.XPATH, using = "//*[contains(@src,'user-default')]")
	public WebElement ProfileIcon1;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'VIEW')]")
	public WebElement Quicklinks;

	@FindBy(how = How.XPATH, using = "//button[@id='OppCancel']")
	public WebElement oppcancel;

	@FindBy(how = How.XPATH, using = "(//img[@src='/assets/images/Not_Started.svg'])[4]")
	public WebElement NotStartedicon;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Client Context')]")
	public WebElement Tiles;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Status:')]")
	public WebElement icon;

	@FindBy(how = How.XPATH, using = "//Select[@id='drpDwon']")
	public WebElement SelectSME;

	@FindBy(how = How.XPATH, using = "//*[@id=\"drpDwon\"]/option[2]")
	public WebElement Agile_SME;

	@FindBy(how = How.XPATH, using = "//*[@class='ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-no-focus warning-cell ag-cell-value']")
	public WebElement RoleName;

	@FindBy(how = How.XPATH, using = "//div[@role='row']//div//span[contains(text(),'Automation SME')]")
	public WebElement Existing_RoleName;

	@FindBy(how = How.XPATH, using = "//div[@role='gridcell']//span//following-sibling::span[1]/img")
	public WebElement Delete_Role;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'View MMS Details')]")
	public WebElement ViewMMSDetailsLink;

	@FindBy(how = How.XPATH, using = "//a[text()='AMS']")
	public WebElement KDP_AMSLink;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'VIEW')])[1]")
	public WebElement HarmonizedKDA_ViewLink;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'VIEW')])[2]")
	public WebElement DealCanvas_ViewLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunities')]")
	public WebElement BreadcrumbOpp;

	@FindBy(how = How.XPATH, using = "//a[@class='mat-tooltip-trigger'][normalize-space()='Manage']")
	public WebElement BreadcrumbManage;

	@FindBy(how = How.XPATH, using = "//*[contains(@src,'user-default')]")
	public WebElement ProfileIcon;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Deal Team')]")
	public WebElement DealTeamlink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'SME Request Charters')]")
	public WebElement SMERequestCharters;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunity on a Page')]")
	public WebElement OpportunityonaPage;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Scope')]")
	public WebElement Scope;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Preliminary Assessment')]")
	public WebElement PreliminaryAssessment;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Client Context')]")
	public WebElement ClientContext;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'360° Client Insights')]")
	public WebElement ClientInsights;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'360° Diagnostics')]")
	public WebElement Diagnostics;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Shape Value Proposition')]")
	public WebElement ShapeValueProposition;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Identify Differentiation Themes')]")
	public WebElement IdentifyDifferentiationThemes;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Solution Configuration')]")
	public WebElement SolutionConfiguration;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Parameters')]")
	public WebElement Parameters;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Staffing')]")
	public WebElement Staffing;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Costing')]")
	public WebElement Costing;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Pricing')]")
	public WebElement Pricing;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'- Reports')]")
	public WebElement Reports;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define Ratecard')]")
	public WebElement DefineRatecard;


	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Build Quadrants for Value Based BSC')]")
	public WebElement BuildQuadrants ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define Weight / Review KPIs')]")
	public WebElement DefineWeight  ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define Risk / Reward Fees')]")
	public WebElement DefineRisk  ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Define KPI Target Values')]")
	public WebElement KPITargetValues ;


	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Run Sensitivity Analyzer')]")
	public WebElement RunSensitivity ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Digital Solution Plan Designer')]")
	public WebElement DigitalSolution ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Deal Canvas')]")
	public WebElement DealCanvas ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Multi-Service Deal Analytics')]")
	public WebElement MultiService  ;

	@FindBy(how = How.XPATH, using =" //a[contains(text(),'Uploaded Documents')]")
	public WebElement UploadedDocuments ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'PMO Tracker Checklist')]")
	public WebElement PMOTracker ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'KDA Variance Analysis')]")
	public WebElement KDA ;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Solution Review & Approvals')]")
	public WebElement SolutionReview ;

	@FindBy(how = How.XPATH, using = "//div[@class='matListItemTitle ng-star-inserted']")
	public WebElement matListItemTitle ;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Transition To Delivery')])[2]")
	public WebElement TransitionToDelivery;



	public void Opportunity_WorkFlow_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/****************************** Methods ************************************/

	/**
	 * TC_39: Validate user is able to navigate to Uploaded Documents Page when
	 * navigated from Digital Documentation tile
	 * 
	 * @since 19/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */

	public void UploadDocumentsHyperlinkValidation() throws Exception {
		boolean scenarioFlag = true;
		// clickElement(MMSID);
		waitForElementToAppear(Upload_Document_Link);
		clickElement(Upload_Document_Link);
		waitForTextToBePresentInElement(Digital_Documentation_Page, DigitalPageTitle);

		WebElement Digital_Documentation = waitForElementToBeVisible(Digital_Documentation_Tab);
		WebElement Upload_Document_MSG = waitForElementToBeVisible(Upload_Documents_Msg);

		if (Digital_Documentation.isDisplayed() && Upload_Document_MSG.isDisplayed()) {

			logPass("After Clicking on Upload Document link the user is able to Navigate to Digital Documentation Page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on Upload Document link the user not able to Navigate to Digital Documentation Page");

		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}


		if (Opportunity_err.isDisplayed()) {

			clickElement(Opportunity_Workflow_Close_btn); }


		//getDriver().navigate().back();
		clickElement(OpportunityWorkFlowLink); 
		//clickElement(OpportunityWorkFlowLink);

		// clickElement(Opportunity_Workflow_btn);
		// waitForElementToBeVisible(Total_Opportunities_PageTitle);
	}

	/**
	 * TC_40: Validate user is able to navigate to PMO Tracker Checklist Page when
	 * navigated from Review Approvals tile
	 * 
	 * @since 19/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */
	public void PMOTrackerHyperlinkValidation() throws Exception {
		boolean scenarioFlag = true;
		// clickElement(MMSID);
		waitForElementToAppear(PMO_Tracker_Link);
		clickElement(PMO_Tracker_Link);
		waitForTextToBePresentInElement(PMO_Tracker_Page_Title, PMO_Tab_Title);
		waitForTextToBePresentInElement(Review_Approvals_Tab, Review_Tab_Title);
		waitForTextToBePresentInElement(PMO_Tracker_Check_List, PMO_Tracker_Title);

		if (((PMO_Tracker_Check_List.isDisplayed())) && (Review_Approvals_Tab.isDisplayed())) {

			logPass("After Clicking on PMO Tracker Checklist Link user can able to navigate PMO Tracker Checklist page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on PMO Tracker Checklist Link user not able to navigate PMO Tracker Checklist page");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

		//getDriver().navigate().back();
		waitForElementClickable(OpportunityWorkFlowLink);
		clickElement(OpportunityWorkFlowLink); 
		clickElement(OpportunityWorkFlowLink);

		// jsClick(PMO_Page_Opportunity_Btn);
		// waitForElementClickable(PMO_Page_Opportunity_Btn);
		// System.out.println("Opportunity button has clicked");
		// waitForElementToBeVisible(Total_Opportunities_PageTitle);
	}

	/**
	 * TC_41: Validate user is able to navigate to KDA Variance Analysis Page when
	 * navigated from Review Approvals tile
	 * 
	 * @since 20/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */
	public void KDAVarianceHyperlinkValidation() throws Exception {
		boolean scenarioFlag = true;
		// clickElement(MMSID);
		waitForElementToAppear(KDA_Variance_Link);
		clickElement(KDA_Variance_Link);
		waitForTextToBePresentInElement(KDA_Variance_title, KDA_Title);
		waitForTextToBePresentInElement(KDA_Link_Tab, KDA_Tab_Title);

		if (KDA_Variance_title.isDisplayed()) {

			logPass("After Clicking on  KDA Variance Analysis Link user can able to navigate KDA Variance Analysis page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on  KDA Variance Analysis Link user is not able to navigate KDA Variance Analysis page");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

		//getDriver().navigate().back();
		//clickElement(OpportunityWorkFlowLink); 
		//clickElement(OpportunityWorkFlowLink);

		// waitForElementClickable(PMO_Page_Opportunity_Btn);
		// waitForElementToBeVisible(Total_Opportunities_PageTitle);

	}

	/**
	 * TC_42: Validate user is able to navigate to Solution Review & Approvals Page
	 * when navigated from Review Approvals tile
	 * 
	 * @since 20/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */
	public void SolutionReviewandApprovalsHyperlinkValidation() throws Exception {
		boolean scenarioFlag = true;
		// clickElement(MMSID);
		waitForElementToAppear(Solution_Review_Link);
		clickElement(Solution_Review_Link);
		waitForTextToBePresentInElement(SolutionTab_Title, KDA_Tab_Title);
		waitForTextToBePresentInElement(Solution_Review_Title, SolutionReviewTitle);

		if (Solution_Review_Title.isDisplayed()) {

			logPass("After Clicking on Solution Review & Approvals Hyperlink Link user can able to navigate to Solution Review & Approvals page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on Solution Review & Approvals Hyperlink Link user is not navigate to Solution Review & Approvals page");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
		getDriver().navigate().back();
		//clickElement(OpportunityWorkFlowLink); 
		//clickElement(OpportunityWorkFlowLink);

	}

	/**
	 * TC_43: Validate user is able to view and click on the drop down arrow present
	 * beside PMO Tracker Checklist hyperlink
	 * 
	 * @since 20/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */
	public void PMOTrackerDroppDownValidation() throws Exception {
		boolean scenarioFlag = true;
		waitForElementToAppear(PMO_Tracker_Dropdown);
		clickElement(PMO_Tracker_Dropdown);
		waitForElementToBeVisible(DropDown_Alert);
		waitForElementToBeVisible(ATC_Involvement_btn);
		waitForElementToBeVisible(GenAI_btn);
		waitForElementToBeVisible(KDA_Availability_btn);
		waitForElementToBeVisible(IE_tools_btn);
		waitForElementToBeVisible(Cloud_Migration_btn);
		waitForElementToBeVisible(Data_AI_btn);
		waitForElementToBeVisible(Security_btn);
		waitForElementToBeVisible(Assets_Venture_btn);
		waitForElementToBeVisible(Sustainability_btn);

		if (ATC_Involvement_btn.isDisplayed() && GenAI_btn.isDisplayed() && KDA_Availability_btn.isDisplayed()
				&& KDA_Availability_btn.isDisplayed() && IE_tools_btn.isDisplayed() && Cloud_Migration_btn.isDisplayed()
				&& Data_AI_btn.isDisplayed() && Security_btn.isDisplayed() && Assets_Venture_btn.isDisplayed()
				&& Sustainability_btn.isDisplayed())

		{
			logPass("After Clicking on PMO Tracker Dropdown user can able to view the sections available in PMO Tracker Checklist");
			scenarioFlag = true;
		} else
			logFail("After Clicking on PMO Tracker Dropdown user can is not able to view the sections  available in PMO Tracker Checklist");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}


	}

	/**
	 * TC_44: Validate user is able to click on ATC Involvement from the pop up
	 * displayed
	 * 
	 * @since 21/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */

	public void ATC_Involvement_Page_Navigation() throws Exception {
		boolean scenarioFlag = true;
		// clickElement(PMO_Tracker_Dropdown);
		waitForElementToAppear(DropDown_Alert);
		waitForElementToBeVisible(DropDown_Alert);
		waitForElementToBeVisible(ATC_Involvement_btn);
		clickElement(ATC_Involvement_btn);
		waitForElementToBeVisible(ATC_Involvement_Tab);
		waitForTextToBePresentInElement(ATC_Involvement_Page_Title, ATC_Involvement_Title);

		if (ATC_Involvement_Tab.isDisplayed()) {

			logPass("After Clicking on ATC Involvement button the user can able to Navigate to ATC Involvement page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on ATC Involvement button the user is not able to Navigate to ATC Involvement page");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

		//getDriver().navigate().back();
		loader();
		clickElement(OpportunityWorkFlowLink); 
		clickElement(OpportunityWorkFlowLink);
		// getDriver().navigate().refresh();

	}

	/**
	 * TC_45: Validate user is able to click on GenAI from the pop up displayed
	 * 
	 * @since 21/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */

	public void Gen_AI_Page_Navigation() throws Exception {
		boolean scenarioFlag = true;
		clickElement(PMO_Tracker_Dropdown);
		waitForElementToAppear(DropDown_Alert);
		waitForElementToBeVisible(DropDown_Alert);
		waitForElementToBeVisible(GenAI_btn);
		clickElement(GenAI_btn);
		waitForElementToBeVisible(ATC_Involvement_Tab);
		waitForTextToBePresentInElement(ATC_Involvement_Page_Title, ATC_Involvement_Title);

		if (ATC_Involvement_Tab.isDisplayed()) {

			logPass("After Clicking on Gen_AI button the user can able to Navigate to GenAI page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on Gen_AI button the user is not able to Navigate to GenAI page");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
		getDriver().navigate().back();
		// getDriver().navigate().refresh();

	}

	/**
	 * TC_46: Validate user is able to click on KDA Availability from the pop up
	 * displayed
	 * 
	 * @since 21/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */

	public void KDA_Availability_Page_Navigation() throws Exception {
		boolean scenarioFlag = true;
		//clickElement(PMO_Tracker_Dropdown);
		waitForElementToAppear(DropDown_Alert);
		waitForElementToBeVisible(DropDown_Alert);
		waitForElementToBeVisible(KDA_Availability_btn);
		clickElement(KDA_Availability_btn);
		waitForElementToBeVisible(ATC_Involvement_Tab);
		waitForElementToAppear(ATC_Involvement_Page_Title);
		waitForTextToBePresentInElement(ATC_Involvement_Page_Title, ATC_Involvement_Title);

		if (ATC_Involvement_Tab.isDisplayed()) {

			logPass("After Clicking on KDA Availability button the user can able to Navigate to KDA Availability page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on KDA Availability button the user can is not able to Navigate to KDA Availability page");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
		getDriver().navigate().back();
		// getDriver().navigate().refresh();

	}

	/**
	 * TC_47: Validate user is able to click on IE Tools from the pop up displayed
	 * 
	 * @since 21/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */

	public void IE_Tools_Page_Navigation() throws Exception {
		boolean scenarioFlag = true;
		//waitForElementToAppear(PMO_Tracker_Dropdown);
		//clickElement(PMO_Tracker_Dropdown);
		waitForElementToAppear(DropDown_Alert);
		waitForElementToBeVisible(DropDown_Alert);
		waitForElementToBeVisible(IE_tools_btn);
		clickElement(IE_tools_btn);
		waitForElementToBeVisible(ATC_Involvement_Tab);
		waitForTextToBePresentInElement(ATC_Involvement_Page_Title, ATC_Involvement_Title);

		if (ATC_Involvement_Tab.isDisplayed()) {

			logPass("After Clicking on IE Tools button the user can able to Navigate to IE Tools page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on IE Tools button the user is not able to Navigate to IE Tools page");
		if (scenarioFlag == true)
			scenarioPass();

		else {
			scenarioFail();
		}

		//getDriver().navigate().back();
		// getDriver().navigate().refresh();

	}

	/**
	 * TC_48:Validate user is able to click on Lean Cloud Migration from the pop up
	 * displayed
	 * 
	 * @since 21/03/2024
	 * 
	 * @author shaik.Mahaboobpeer
	 * 
	 * 
	 */
	public void Lean_Cloud_Migration_Page_Navigation() throws Exception {
		boolean scenarioFlag = true;
		clickElement(OpportunityWorkFlowLink); 
		clickElement(OpportunityWorkFlowLink);
		waitForElementToBeVisible(PMO_Tracker_Dropdown);
		clickElement(PMO_Tracker_Dropdown);
		waitForElementToAppear(DropDown_Alert);
		waitForElementToBeVisible(DropDown_Alert);
		waitForElementToBeVisible(Cloud_Migration_btn);
		clickElement(Cloud_Migration_btn);
		waitForElementToBeVisible(ATC_Involvement_Tab);
		waitForTextToBePresentInElement(ATC_Involvement_Page_Title, ATC_Involvement_Title);

		if (ATC_Involvement_Tab.isDisplayed()) {

			logPass("After Clicking on Lean Cloud Migration button the user can able to Navigate to Lean Cloud Migration page");
			scenarioFlag = true;
		} else
			logFail("After Clicking on Lean Cloud Migration button the user is not able to Navigate to Lean Cloud Migration page");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
		getDriver().navigate().back();
		// getDriver().navigate().refresh();
	}

	/**
	 * TC_49: Validate user is able to click on DATA AI from the pop up displayed
	 * (Not Applicable for AMS and hence the field will be in disabled mode)
	 * 
	 * @since 19/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * 
	 */

	public void reviewApprovalDataAICheck(String OppID_ServiceGroup_SI) throws Exception {
		boolean scenarioFlag = true;
		/*
		 * ManageSaPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		 * opportunitiesPage = PageFactory.initElements(getDriver(),
		 * OpportunitiesPage.class); ManageSaPage.navigateToManage();
		 * clickElement(opportunitiesPage.TotalOpportunities);
		 * sendKeys(opportunitiesPage.FilterTextField, OppID_ServiceGroup_SI);
		 * clickElement(opportunitiesPage.MmsIdText);
		 */
		//clickElement(ReviewApprovalDropdown);
		clickElement(ReviewApprovalDataAIButton);
		if (isDisplayed(ReviewApprovalPMOTrackerText)) {
			logPass("user is able to click on DATA AI from the pop up displayed");
			scenarioFlag = true;
		} else {
			logFail("user is not able to click on DATA AI from the pop up displayed");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

		//getDriver().navigate().back();
	}

	/**
	 * TC_50: Validate user is able to click on Security from the pop up displayed
	 * 
	 * @since 19/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * 
	 */

	public void reviewApprovalSecurityCheck() throws Exception {
		boolean scenarioFlag = true;

		clickElement(OpportunityWorkFlowLink); 
		clickElement(OpportunityWorkFlowLink);
		clickElement(ReviewApprovalDropdown);

		clickElement(ReviewApprovalSecurityButton);
		if (isDisplayed(ReviewApprovalPMOTrackerText)) {
			logPass("user is able to click on Security from the pop up displayed");
			scenarioFlag = true;
		} else {
			logFail("user is not able to click on Security from the pop up displayed");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

		//getDriver().navigate().back();
	}

	/**
	 * TC_51: Validate user is able to click on CF Assets/ Venture Partners from the
	 * pop up displayed (Not Applicable for AMS and hence the field will be in
	 * disabled mode)
	 * 
	 * @since 20/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * 
	 */

	public void reviewApprovalCFAssetsCheck() throws Exception {
		boolean scenarioFlag = true;

		clickElement(OpportunityWorkFlowLink); 
		clickElement(OpportunityWorkFlowLink);
		clickElement(ReviewApprovalDropdown);
		clickElement(ReviewApprovalCFAssetsButton);
		if (isDisplayed(ReviewApprovalPMOTrackerText)) {
			logPass("user is able to click on CF Assets/ Venture Partners from the pop up displayed");
			scenarioFlag = true;
		} else {
			logFail("user is not able to click on CF Assets/ Venture Partners from the pop up displayed");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

		//getDriver().navigate().back();
	}

	/**
	 * TC_52: Validate user is able to click on Sustainability Adoption from the pop
	 * up displayed (Not Applicable for AMS and hence the field will be in disabled
	 * mode)
	 * 
	 * @since 20/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * 
	 */

	public void reviewApprovalSustainabilityCheck() throws Exception {
		boolean scenarioFlag = true;

		clickElement(OpportunityWorkFlowLink);
		clickElement(OpportunityWorkFlowLink);
		clickElement(ReviewApprovalDropdown);

		clickElement(ReviewApprovalSustinabilityButton);
		if (isDisplayed(ReviewApprovalPMOTrackerText)) {
			logPass("user is able to click on Sustainability Adoption from the pop up displayed");
			scenarioFlag = true;
		} else {
			logFail("user is not able to click on Sustainability Adoption from the pop up displayed");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

		//getDriver().navigate().back();
	}

	/**
	 * TC_53: Validate when the user is able to see the border color as Orange
	 * 
	 * @since 21/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * @throws Exception
	 * 
	 */

	public void reviewApprovalBorderCheck() throws Exception {
		boolean scenarioFlag = true;

		clickElement(OpportunityWorkFlowLink); 
		clickElement(OpportunityWorkFlowLink);
		clickElement(ReviewApprovalDropdown);

		String beforeHoverColor = ReviewApprovalSustinabilityButton.getCssValue("border-color");
		clickElement(ReviewApprovalSustinabilityButton);
		clickElement(OpportunityWorkFlowLink);
		clickElement(OpportunityWorkFlowLink);
		clickElement(ReviewApprovalDropdown);
		String afterHoverColor = ReviewApprovalSustinabilityButton.getCssValue("border-color");
		if (beforeHoverColor.equals(afterHoverColor)) {
			logPass("user is able to see the border color as Orange");
			scenarioFlag = true;
		} else {
			logFail("user is not able to see the border color as Orange");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

		//getDriver().navigate().back();
	}

	/**
	 * TC_54: "The border should change it's color to green when data saving is done
	 * " *
	 * 
	 * @since 18/03/2024
	 * @author s.b.sudhir.kulkarni
	 * @return
	 * 
	 */
	public void borderColor(String Opid) throws Exception {

		boolean scenarioFlag = true;
		String id = Opid;
		String text1 = "pqr";
		//clickElement(ReviewApprovalDropdown);
		String beforeHoverColor = Kda.getCssValue("border-color");

		if (beforeHoverColor.equals("rgb(255, 120, 0)") || beforeHoverColor.equals("#ff7800")) {
			clickElement(Kda);
			clickElement(KdaInside);
			sendKeys(TextArea, text1);
			clickElement(SaveBtn);
			clickElement(OpportunityWorkFlowLink);
			clickElement(OpportunityWorkFlowLink);
			clickElement(ReviewApprovalDropdown);

			String afterHoverColor = Kda.getCssValue("border-color");
			clickElement(ReviewApprovalDropdown);

			if (afterHoverColor.equals("rgb(90, 167, 0)") || afterHoverColor.equals("#5aa700")) {
				logPass("User is able to see the border color as Green");
				scenarioFlag = true;
			} else {

				logFail("user is not able to see the border color as Green");
				scenarioFlag = false;
			}
		} else {
			logPass("user has alredy saved data");
		}


		if (scenarioFlag == true)
			scenarioPass();
		refreshScreen();

		//getDriver().navigate().back();
	}

	/**
	 * TC_55: "User should able to navigate to Transition To Delivery page" *
	 * 
	 * @since 18/03/2024
	 * @author s.b.sudhir.kulkarni
	 * @return
	 * 
	 */

	public void navigateToDelivery(String Opid) throws Exception {
		List<Boolean> Flag = new ArrayList<>();
		// clickElement(MMSid);
		boolean scenarioFlag = true;

		//clickElement(OpportunityWorkFlowLink); 
		//clickElement(OpportunityWorkFlowLink);

		//waitForElementToAppear(delivery);
		waitForElementToBeVisible(delivery);
		scrollToElement(delivery);
		clickElement(delivery);

		if (Heading.isDisplayed()) {
			logPass("Page is succesfully navigated");
		} else {
			logFail("Page is not navigated");
		}

		if (scenarioFlag == true)
			scenarioPass();

		//getDriver().navigate().back();
	}

	/**
	 * TC_56: "User should able to view the message on hover of Info icon" *
	 * 
	 * @since 19/03/2024
	 * @author s.b.sudhir.kulkarni
	 * @return
	 * 
	 */
	public void hoverIicon(String Opid) throws Exception {
		List<Boolean> Flag = new ArrayList<>();
		// clickElement(MMSid);
		boolean scenarioFlag = true;

		clickElement(OpportunityWorkFlowLink); 
		clickElement(OpportunityWorkFlowLink);


		if (isDisplayed(DefineTeamIicon) && !(DefineTeamIicon.getAttribute("title").equals(""))) {
			Flag.add(true);
		} else
			Flag.add(false);

		if (isDisplayed(WhatTeamIicon) && !(WhatTeamIicon.getAttribute("title").equals(""))) {
			Flag.add(true);
		} else
			Flag.add(false);

		if (isDisplayed(ValueTeamIicon) && !(ValueTeamIicon.getAttribute("title").equals(""))) {
			Flag.add(true);
		} else
			Flag.add(false);

		if (isDisplayed(SolTeamIicon) && !(SolTeamIicon.getAttribute("title").equals(""))) {
			Flag.add(true);
		} else
			Flag.add(false);

		if (isDisplayed(ValueBaseTeam) && !(ValueBaseTeam.getAttribute("title").equals(""))) {
			Flag.add(true);
		} else
			Flag.add(false);

		if (isDisplayed(DigitalTeam) && !(DigitalTeam.getAttribute("title").equals(""))) {
			Flag.add(true);
		} else
			Flag.add(false);

		if (isDisplayed(ReviewTeam) && !(ReviewTeam.getAttribute("title").equals(""))) {
			Flag.add(true);
		} else
			Flag.add(false);

		if (isDisplayed(TransitionTeam) && !(TransitionTeam.getAttribute("title").equals(""))) {
			Flag.add(true);
		} else
			Flag.add(false);

		if (!Flag.contains(false)) {
			logPass("User able to view the message on hover of Info icon");
		} else {
			logFail("User unable to view the message on hover of Info icon");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();


	}

	/**
	 * TC_57: "Validate user is able to view the icon/message:Status: Not Started,
	 * Started, Not Applicable" *
	 * 
	 * @since 19/03/2024
	 * @author s.b.sudhir.kulkarni
	 * @return
	 * 
	 */

	public void validateStatus(String Opid) throws Exception {
		List<Boolean> Flag = new ArrayList<>();
		// clickElement(MMSid);
		boolean scenarioFlag = true;
		String NotStartTextMsg = NotStartText.getText();
		String NotApplicableTextMsg = NotApplicableText.getText();
		String StartedTextMsg = StartedText.getText();
		boolean isIconDisplayed = NotStartIcon.isDisplayed();
		boolean isIconDisplayed1 = NotApplicableIcon.isDisplayed();
		boolean isIconDisplayed2 = StartedIcon.isDisplayed();

		if ((NotStartTextMsg.contains("Not Started") && isIconDisplayed)
				&& (NotApplicableTextMsg.contains("Not Applicable") && isIconDisplayed1)
				&& (StartedTextMsg.contains("Started") && isIconDisplayed2)) {
			logPass("user is able to view the icon/message");

		} else {
			logFail("user is unable to view the icon/message");

		}

		if (scenarioFlag == true)
			scenarioPass();

		//getDriver().navigate().back();
	}

	/**
	 * TC_58: "Validate the by default status of Deal Team as Started" *
	 * 
	 * @since 19/03/2024
	 * @author s.b.sudhir.kulkarni
	 * @return
	 * 
	 */

	public void validateDealStatus(String Opid) throws Exception {
		List<Boolean> Flag = new ArrayList<>();
		// clickElement(MMSid);
		boolean scenarioFlag = true;
		//clickElement(OpportunityWorkFlowLink);
		//clickElement(OpportunityWorkFlowLink);

		String dealMsg = DealTeam.getText();
		boolean isIconDisplayed = GreenTick.isDisplayed();

		if (dealMsg.contains("Deal") && isIconDisplayed) {
			logPass("default status of Deal Team as Started");
		} else {
			logFail("default status of Deal Team as not Started");
		}

		if (scenarioFlag == true)
			scenarioPass();
		//getDriver().navigate().back();
	}

	/**
	 * TC_59: Validate user is able to view the status changed to Not Started to
	 * Started in all the tiles
	 * 
	 * @since 18/03/2024
	 * @author Sanjana Yesireddy
	 * @return
	 * 
	 */


	public void DefineTeamStatusCheck() throws Exception { 
		boolean scenarioFlag=true; 
		ManageSaPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		ManageSaPage.navigateToManage(); 
		clickElement(TotalOpportunities);
		sendKeys(Typeatexttofilter,"9900000009");
		clickElement(search); 
		clickElement(MMSID);
		waitForElementToAppear(DealTeamButton);
		waitForElementToAppear(DealTeamButton);
		clickElement(DealTeamButton);

		/*if (Existing_RoleName.isDisplayed()) {
					clickElement(Delete_Role); 
					} */ 

		waitForElementToBeVisible(AddRole);
		clickElement(AddRole);
		clickElement(RoleName);
		waitForElementClickable(SelectSME);
		clickElement(SelectSME);
		clickElement(Agile_SME);
		clickElement(Savebtn);
		loader();
		waitForElementToBeVisible(Savebtn);
		scrollToElement(OpportunityWorkFlowLink);
		waitForElementToAppear(OpportunityWorkFlowLink);
		clickElement(OpportunityWorkFlowLink);
		waitForElementToBeVisible(StartedIcon);

		boolean scenarioFlag1= true; 
		if(isDisplayed(Manage_btn)) {
			logPass("User should be able to view the status change from Not Started to Started only if data is saved"
					);

		} else {
			logFail("User should not able to view the status change from Not Started to Started only if data is not saved"
					); 
			scenarioFlag1 = false; 
		}
		if (scenarioFlag1 == true) 
			scenarioPass();
	}

	/**
	 * TC_60: Validate user is able to view no change in status if no data saving is done
	 * 
	 * @since 19/03/2024
	 * @author Sanjana Yesireddy
	 * @return
	 * 
	 */
	public void validateNoChangeInStatus() throws Exception { 
		boolean scenarioFlag = true;
		clickElement(Manage_btn);
		clickElement(TotalOpportunities);
		sendKeys(Typeatexttofilter,"9900000009");
		clickElement(search);
		clickElement(MMSID);
		waitForElementToAppear(WRWS_Opportunityonpage);
		clickElement(WRWS_Opportunityonpage);
		clickElement(OpportunityWorkFlowLink);

		if(isDisplayed(NotStartedicon)) {
			logPass("user is able to view no change in status if no data saving is done");

		} 
		else {
			logFail("user is not able to view the change in status if data saving is done");
			scenarioFlag = false; } if (scenarioFlag == true) scenarioPass(); }


	/**
	 * TC_61: Validate user is able to view no change in status if no data saving is
	 * done
	 * 
	 * @since 19/03/2024
	 * @author Sanjana Yesireddy
	 * @return
	 * 
	 */


	public void NotApplicableStatus() throws Exception { 
		boolean scenarioFlag =true;
		clickElement(ManageBtn); 
		waitForElementToAppear(TotalOpportunities);
		clickElement(TotalOpportunities);
		sendKeys(Typeatexttofilter,"9900000009");
		clickElement(search);
		clickElement(MMSID);
		waitForElementToAppear(Estimators);
		scroll("bottom");
		waitForElementToAppear(ContractSolutionGapAnalysis);	


		if (isDisplayed(Estimators) && (isDisplayed(ContractSolutionGapAnalysis)))
		{
			logPass("User should be able to view the status Not Applicable ");
			scenarioFlag = true;
		} else {
			logFail("User should not be able to view the status Not Applicable ");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}



	/**
	 * TC_62: Validate the hover functionality when hovered on the hyperlinks present in the Workflow page
	 * 
	 * @since 19/03/2024
	 * @author Sanjana Yesireddy
	 * @return
	 * 
	 */				
	public void hover()throws Exception {
		boolean scenarioFlag = true;
		clickElement(Manage_btn);
		waitForElementToAppear(TotalOpportunities);
		clickElement(TotalOpportunities);
		sendKeys(Typeatexttofilter,"9900000009");
		clickElement(search);
		clickElement(MMSID);
		loader();
		String beforeHoverMMSLink= ViewMMSDetailsLink.getCssValue("color");
		logInfo(beforeHoverMMSLink);
		action.moveToElement(ViewMMSDetailsLink).build().perform();
		loader();
		String afterHoverMMSLink =ViewMMSDetailsLink.getCssValue("color");
		logInfo(afterHoverMMSLink);
		
		String beforeKDP_AMSLink= KDP_AMSLink.getCssValue("color");  
		action.moveToElement(KDP_AMSLink).build().perform();
		loader();
		String afterKDP_AMSLink =KDP_AMSLink.getCssValue("color");
		logInfo(afterKDP_AMSLink);

		String beforeHarmonizedKDALink= HarmonizedKDA_ViewLink.getCssValue("color");  
		action.moveToElement(HarmonizedKDA_ViewLink).build().perform();
		loader();
		String afterHarmonizedKDALink =HarmonizedKDA_ViewLink.getCssValue("color");
		logInfo(afterHarmonizedKDALink);
		
		String beforeDealCanvasLink= DealCanvas_ViewLink.getCssValue("color");  
		action.moveToElement(DealCanvas_ViewLink).build().perform();
		loader();
		String afterDealCanvasLink =DealCanvas_ViewLink.getCssValue("color");
		logInfo(afterDealCanvasLink);

		String beforeBreadcrumbOpp= BreadcrumbOpp.getCssValue("color");  
		action.moveToElement(BreadcrumbOpp).build().perform();
		String afterBreadcrumbOpp =BreadcrumbOpp.getCssValue("color");
		logInfo(afterBreadcrumbOpp);
		
		String beforeBreadcrumbManage= BreadcrumbManage.getCssValue("color");  
		action.moveToElement(BreadcrumbManage).build().perform();
		String afterBreadcrumbManage =BreadcrumbManage.getCssValue("color");
		logInfo(afterBreadcrumbManage);


		String beforeDealTeam= DealTeamlink.getCssValue("color");  
		action.moveToElement(DealTeamlink).build().perform();
		String afterDealTeam =DealTeamlink.getCssValue("color");
		logInfo(afterDealTeam);

		String beforeOpportunityonaPage= OpportunityonaPage.getCssValue("color");  
		action.moveToElement(OpportunityonaPage).build().perform();
		String afterOpportunityonaPage =OpportunityonaPage.getCssValue("color");
		logInfo(afterOpportunityonaPage);

		String beforeClientInsights= ClientInsights.getCssValue("color");  
		action.moveToElement(ClientInsights).build().perform();
		String afterClientInsights=ClientInsights.getCssValue("color");
		logInfo(afterClientInsights);

		String beforeSolutionConfiguration= SolutionConfiguration.getCssValue("color");  
		action.moveToElement(SolutionConfiguration).build().perform();
		String afterSolutionConfiguration=SolutionConfiguration.getCssValue("color");
		logInfo(afterSolutionConfiguration);

		String beforeBuildQuadrants= BuildQuadrants.getCssValue("color");  
		action.moveToElement(BuildQuadrants).build().perform();
		String afterBuildQuadrants=BuildQuadrants.getCssValue("color");
		logInfo(afterBuildQuadrants);

		String beforeDigitalSolution= DigitalSolution.getCssValue("color");  
		action.moveToElement(DigitalSolution).build().perform();
		String afterDigitalSolution=DigitalSolution.getCssValue("color");
		logInfo(afterDigitalSolution);
		
		String beforePMOTracker= PMOTracker.getCssValue("color");  
		action.moveToElement(PMOTracker).build().perform();
		String afterPMOTracker=PMOTracker.getCssValue("color");
		logInfo(afterPMOTracker);


		if (!beforeHoverMMSLink.equals(afterHoverMMSLink) &&
				afterHoverMMSLink.equals("rgba(161, 0, 255, 1)") &&	
				!beforeKDP_AMSLink.equals(afterKDP_AMSLink) &&
				afterKDP_AMSLink.equals("rgba(161, 0, 255, 1)") &&
				!beforeHarmonizedKDALink.equals(afterHarmonizedKDALink) &&
				afterHarmonizedKDALink.equals("rgba(161, 0, 255, 1)") &&
				!beforeDealCanvasLink.equals(afterDealCanvasLink) &&
				afterDealCanvasLink.equals("rgba(161, 0, 255, 1)") &&
				!beforeBreadcrumbOpp.equals(afterBreadcrumbOpp) &&
				afterBreadcrumbOpp.equals("rgba(161, 0, 255, 1)") &&
				!beforeBreadcrumbManage.equals(afterBreadcrumbManage) &&	
				afterBreadcrumbManage.equals("rgba(161, 0, 255, 1)") &&		
				!beforeDealTeam.equals(afterDealTeam) &&		
				afterDealTeam.equals("rgba(161, 0, 255, 1)") &&
				!beforeOpportunityonaPage.equals(afterOpportunityonaPage) &&
				afterOpportunityonaPage.equals("rgba(161, 0, 255, 1)") &&
				!beforeClientInsights.equals(afterClientInsights) &&
				afterClientInsights.equals("rgba(161, 0, 255, 1)") &&
				!beforeDigitalSolution.equals(afterDigitalSolution) &&
				afterDigitalSolution.equals("rgba(161, 0, 255, 1)") &&
				!beforePMOTracker.equals(afterPMOTracker) &&	
				afterPMOTracker.equals("rgba(161, 0, 255, 1)"))		
										
		{
			logPass("Hyperlinks are highlighted in purple when hovered."); 

		}else {
			logFail("Hyperlinks are not highlighted in purple when it is not hovered.");
			scenarioFlag = false; }

		if (scenarioFlag == true) {
			scenarioPass();	
		}

	}
}