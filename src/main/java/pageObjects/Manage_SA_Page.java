package pageObjects;


import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import reusableComponents.ConstantUtils;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import pageObjects.Interim_Page;



public class  Manage_SA_Page extends BasePage
{
	Interim_Page interimPage = PageFactory.initElements(getDriver(), Interim_Page.class);
	
	/************************** LOCATORS *****************************/

	@FindBy(how = How.XPATH, using = "//*[text()='InProgress']")
	public List<WebElement> Inprogress_Deals_List;

	@FindBy(how = How.XPATH, using = "//div[@col-id='MMSStatus'][not (contains(@role,'columnheader'))]")
	public List<WebElement> Inprogress_Hold_Deals_List;

	@FindBy(how = How.XPATH, using = "//*[text()='Closed']")
	public List<WebElement> Closed_Deals_List;

	@FindBy(how = How.XPATH, using = "//*[text()='Onhold']")
	public List<WebElement> Onhold_Deals_List;

	@FindBy(how = How.XPATH, using = "//*[text()= 'Manage']")
	public WebElement Manage_Btn;

	@FindBy(how = How.XPATH, using = "//a[@title='In Progress']/../../h6")
	public WebElement Inprogress_Card;

	@FindBy(how = How.XPATH, using = "//span[contains(@id,'of-page-number')]")
	public WebElement Total_Pages_Grid;

	@FindBy(how = How.XPATH, using = "//div[@ref='btNext']")
	public WebElement Grid_Next_Btn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),' Active Deals')]")
	public WebElement Active_Deals;

	@FindBy(how = How.XPATH, using = "//a[@title='Interim']/../../h6")
	public WebElement interimCard;

	@FindBy(how = How.XPATH, using = "//a[@title='Closed']/../../h6")
	public WebElement Closed_Card;

	@FindBy(how = How.XPATH, using = "//a[@title='On Hold']/../../h6")
	public WebElement OnHold_Card;

	@FindBy(how = How.XPATH, using = "//a[@title='On Hold']")
	public WebElement Onhold_Tab_Navigation;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),' Interim Deals')]")
	public WebElement interimDeals;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'All')]")
	public WebElement All_Deals;

	@FindBy(how = How.XPATH, using = "//div[text()='InProgress']")
	public List<WebElement> interimDeals_List;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'tab-icons')]/img")
	public WebElement Filter_Icon;

	@FindBy(how = How.XPATH, using = "//div[@id='filters']//span[contains(text(),'Closed')]/preceding-sibling::span")
	public WebElement Closed_Filter_Btn;

	@FindBy(how = How.XPATH, using = "//div[@id='filters']//span[contains(text(),'Hold')]/preceding-sibling::span")
	public WebElement Onhold_Filter_Btn;

	@FindBy(how = How.XPATH, using = "//div[@id='filters']//span[contains(text(),'Apply')]")
	public WebElement Apply_Filter_Btn;

	@FindBy(how = How.XPATH, using = "//a[@title = 'In Progress']")
	public WebElement OppInProgress_HyperLink;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Active Deals')]/../..")
	public WebElement OppActiveDeals;

	@FindBy(how = How.XPATH, using = "//a[@title = 'Interim']")
	public WebElement OppinterimHyperLink;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Interim Deals')]/../..")
	public WebElement OppInterimDeals;

	@FindBy(how = How.XPATH, using = "//a[@title = 'Closed']")
	public WebElement OppClosed_HyperLink;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'All')]/../..")
	public WebElement OppAllDeals;

	@FindBy(how = How.XPATH, using = "//*[@alt='mySP-logo']")
	public WebElement accentureLogo;

	@FindBy(how = How.XPATH, using = "//h1[text()='Welcome to myIntegrated Solution Platform']")
	public WebElement welcomeText;

	@FindBy(how = How.XPATH, using = "//h5[text()='IT Spend Prediction and Benchmarks']")
	public WebElement ITSpendPrediction;

	@FindBy(how = How.XPATH, using = "//h5[text()='Explore IT Spending Insights']")
	public WebElement ExploreITSpendingInsights;

	@FindBy(how = How.XPATH, using = "//*[text()='keyboard_arrow_down']")
	public WebElement Analyticsdropdown;

	@FindBy(how = How.XPATH, using = "//span[text()=' AMS']")
	public WebElement ams;

	@FindBy(how = How.XPATH, using = "//span[text()=' SI']")
	public WebElement si;
	
	@FindBy(how = How.XPATH, using = "//li//a[text()='Manage']")
	public WebElement ManageBtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'user-menu')]")
	public WebElement UserRoleBtn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Role Preferences')]")
	public WebElement RolePreferenceLink;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'radio-checked ')]/label")
	public WebElement SelectedRole;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'save')]/button")
	public WebElement UserRoleSaveBtn;
	
	@FindBy(how = How.XPATH, using ="//*[contains(@class,'radio-checked ')]/ancestor::div[contains(@class,'bodyPositioning')]/following-sibling::div[1]")
	public WebElement RoletobeSelected; 
	
	@FindBy(how = How.XPATH, using = "//span[text()=' SA ']//ancestor::div[contains(@class,'role-header')]")
	public WebElement UserRole_SA;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Interim')]")
	public WebElement CreateinterimBtn;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Self Assign')]")
	public WebElement SelfAssign_Btn;
	
	@FindBy(how=How.XPATH,using="//a[text()='On Hold']")
	public WebElement OnHold_Link;
	
	@FindBy(how=How.XPATH,using="//div[text()='Opportunities']")
	public WebElement Opportunities;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'All')]//ancestor::div[@role='tab']")
	public WebElement AllTab;
	
	@FindBy(how=How.XPATH,using="//a//img[@id='chatbtn']")
	public WebElement DisAA_Icon;
	
	@FindBy(how=How.XPATH,using="//div[@class='recently-section-linktext']/a")
	 public WebElement RecentlyWorkedOpportunity; 
	
	@FindBy(how=How.XPATH,using="//*[text()='Opportunity Workflow']")
	 public WebElement OpportunityWorkflow; 
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'MMS ID')]//parent::mat-grid-tile//following-sibling::mat-grid-tile//p")
	 public WebElement MMS_Id;  
	
	@FindBy(how=How.XPATH,using="//button[text()=' Self Assign']")
	 public WebElement SelfAssignButton;
	
	@FindBy(how=How.XPATH,using="//*[text()='Opportunity Self-Assign']")
	 public WebElement SelfAssignText;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Create Interim']")
	 public WebElement CreateInterimButton;
	
	@FindBy(how=How.XPATH,using="//*[text()='Interim Deal Creation']")
	 public WebElement InterimText;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Manage'][not(@class)]")
	public WebElement manage_link;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Manage']")
	public WebElement manageHeading;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Manage'][contains(@class,'manage-link')]")
	public WebElement manage_link_InSolComp;
	
	@FindBy(how = How.XPATH, using = "//div[@class='card-container']//p[normalize-space(text())='Clients']")
	public WebElement clientTitleHeadingText;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'recently-worked-text')]")
	public WebElement clientRecentlyWorkTile;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Total Clients']")
	public WebElement totalClientLink;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'tab-list')]//div[contains(text(),'List of Clients')]")
	public WebElement listOfClient_Link;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'card-container')])[1]//*[contains(@class,'card-footer')]//a//span[text()='View Details']")
	public WebElement firstClientCard_viewDetails;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'card-container')])[1]//*[contains(@class,'card-title')]")
	public WebElement firstClientCard_cardTitle;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'main-pageHeader')]//div[contains(@class,'page-header')]")
	public WebElement clientDetails_Heading;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'tab-list')]//div[contains(text(),'All')]")
	public WebElement All_Opportunity_link;
	
	@FindBy(how = How.XPATH, using = "//div[@row-index='0']//div[@col-id='ClientName']")
	public WebElement Opp_ClientName;
	
	@FindBy(how = How.XPATH, using = "//div[@row-index='0']//div[@col-id='MMSID']//div//div")
	public WebElement Opp_OppID;
	
	@FindBy(how = How.XPATH, using = "//a[text()='What Are We Solving For']")
	public WebElement navigate_whatAreWeSolving;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'WRWS')]//label[normalize-space(text())='Primary Deal Arche Type']")
	public WebElement primaryArchHeading;
	
	@FindBy(how = How.XPATH, using = "//button[@id='PriDealArchbtn']")
	public WebElement primaryArchdropdown;	
	
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
	
	@FindBy(how = How.XPATH, using = "//button[text()='Continue']")
	public WebElement btn_Continue;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@id,'SaveBtn') and text()='Save']")
	public WebElement btn_Save;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Manage']")
	public WebElement Manage_Button;
 
	@FindBy(how = How.XPATH, using = "//a[@role='button' and text()='Total Clients']")
	public WebElement TotalClient_Header;
 
	@FindBy(how = How.XPATH, using = "//p[text()='Recently Worked Client']")
	public WebElement RecentlyWorkedClient_Text;
 
	@FindBy(how = How.XPATH, using = "//span[@class='fav-text-client']")
	public WebElement MyFavouriteClients_Text;
 
	@FindBy(how = How.XPATH, using = "//a[@role='button' and text()='Total Clients']")
	public WebElement TotalClient_Button;
 
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'List of Clients')]//ancestor::div[contains(@id,'tab-label')]")
	public WebElement ListofClients;
 
	@FindBy(how = How.XPATH, using = "(//div[contains (@class,'card-container')]//div[contains (@class,'card-header')]//*[contains(@class,'card-title')])[1]")
	public WebElement Client_Card;
 
	@FindBy(how = How.XPATH, using = "//span[text()='All Clients']")
	public WebElement AllClient_Button;
 
	@FindBy(how = How.XPATH, using = "//span[text()='Favourites Clients']")
	public WebElement FavouriteClients_Button;
	
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

	@FindBy(how = How.XPATH, using = "//input[@placeholder = 'Type a text to filter']")
	public WebElement opportunitypage_inputbox;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Opportunity on a Page')]")
	public WebElement Opportunityworkflow_OpportunityonaPage;

	@FindBy(how = How.XPATH, using = "//button[contains(@id,'SaveBtn') and text()='Save']")
	public WebElement Savebutton;

	@FindBy(how = How.XPATH, using = "//*[@id='SG']")
	public WebElement Servicegroup;

	@FindBy(how = How.XPATH, using = "//a[@class='breadcrumb-item' and text()='Manage']")
	public WebElement Manage_breadcrumb;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Total Opportunities ')]/../../..")
	public WebElement opportunitytile;

	@FindBy(how = How.XPATH, using = "//*[text()=' Total Opportunities ']")
	public WebElement Total_opportunitieslink;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-main-pageHeader']/div[text()='Opportunities']")
	public WebElement opportunities_page;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Total Opportunities ')]/../../..//div[contains(@class, 'total-opportunities')]//h5")
	public WebElement Totalopportunity_count;
	
	@FindBy(how = How.XPATH, using = "//img[@class='pin-black icon']")
	public WebElement Opportunity_Pin_Btn;
	
	@FindBy(how = How.XPATH, using = "//img[@title='Edit']")
	public WebElement Opportunity_Edit_Btn;	
	
	@FindBy(how = How.XPATH, using = "//img[@title='Log Status']")
	public WebElement Opp_Log_Status_Btn;
	
	@FindBy(how = How.XPATH, using = "//*[@name='Dropdown']//span/span")
	public WebElement Opp_Log_Status_Selected;
	
	@FindBy(how = How.XPATH, using = "//button[@title='Close']")
	public WebElement Log_Status_Popup_close;	
	
	@FindBy(how = How.XPATH, using = "//*[@name='Dropdown']")
	public WebElement Opp_Interim_Status_Drpdwn;	
	
	@FindBy(how = How.XPATH, using = "//span[text()=' On Hold']")
	public WebElement Opp_Interim_OnHold_Option;
	
	@FindBy(how = How.XPATH, using = "//*[@placeholder='Enter the text']")
	public WebElement Log_Status_Txtbox;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	public WebElement Log_Status_Save_Btn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Opportunity Name')]//parent::mat-grid-tile//following-sibling::mat-grid-tile//p")
	public WebElement Updated_Opportunity_Name;
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'Manage']/..")
	public WebElement Manage_list;
 
	@FindBy(how = How.XPATH, using = "//p[text() = 'Last Activity' and @class = 'mat-card-head']")
	public WebElement LastActivity_Sec;
 
	@FindBy(how = How.XPATH, using = "//p[text() = 'Opportunities' and @class = 'mat-card-head']")
	public WebElement Opportunites_Sec;
 
	@FindBy(how = How.XPATH, using = "//p[text() = 'Clients ' and @class = 'mat-card-head']")
	public WebElement Clients_Sec;
 
	@FindBy(how = How.XPATH, using = "//label[text() = 'Coming Soon']") /*Need to be updated once App_sec will be active*/
	public WebElement App_Sec;
 
	@FindBy(how = How.XPATH, using = "//h3[text() = 'Analytics and Insights']")
	public WebElement AnalyticsAndInsights_Sec;
 
	@FindBy(how = How.XPATH, using = "//h3[text() = 'Client Insights 360°']")
	public WebElement ClientInsights_Sec;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'mpl-page-header')]")
	public WebElement ManageDashBoard_header;
	
	@FindBy(how = How.XPATH, using = "//*[@class='OpportunityGridList']//div[text()='MMS ID']/../following-sibling::*//p")
	public WebElement MMSID;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Opportunity Information']")
	public WebElement OpportunityInformation;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Quick Links']")
	public WebElement QuickLinks;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Status Update']")
	public WebElement StatusUpdate;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Define Team']")
	public WebElement DefineTeam;
	
	@FindBy(how = How.XPATH, using = "//a[text()='What Are We Solving For']")
	public WebElement WAWS;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Value Shaping')]")
	public WebElement ValueShaping;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Estimators / Calculators']")
	public WebElement EstimatorCalculators;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Solution Components']")
	public WebElement SolutionComponents;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Value Based Deal Construct']")
	public WebElement VBDC;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Digital Documentation']")
	public WebElement DigitalDocumentation;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Review Approvals']")
	public WebElement ReviewApprovals;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Contract Solution Gap Analysis']")
	public WebElement ContractSolution;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Transition To Delivery']")
	public WebElement TransitionToDelivery;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'card-container')]//img)[1]")
	public WebElement favouritIcon;
	
	
	
	
	
	/************************** METHODS *****************************/
	
	public Manage_SA_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * @author rupali.umat
	 * @scenario - Validate that user is able to change the roles from role preference list from Manage SA page
	 * @date - 21/02/2024
	 * @release March 16
	 * 	 
	 */
	public void ChangeUserRole() throws Exception {
		boolean scenarioFlag = false;
		//click on user profile icon
		clickElement(UserRoleBtn);
		
		//click on Role Preference Link
		clickElement(RolePreferenceLink);
		
		//Get the selected role
		String selectedRole = SelectedRole.getText();
		
		//Select Another Role
		clickElement(RoletobeSelected);
		
		//Save 
		clickElement(UserRoleSaveBtn);
		
		waitForElementToAppear(UserRoleBtn);
		clickElement(UserRoleBtn);
		clickElement(RolePreferenceLink);
		
		String newSelectedRole = SelectedRole.getText();
		
		if(!selectedRole.equalsIgnoreCase(newSelectedRole)) {
			logPass("User is able to change the roles from role preference list from Manage SA page");
			scenarioFlag = true;
		}
		else 
			logFail("User is not able to change the roles from role preference list from Manage SA page");
			
		//Selecting SA user again to proceed with Other scenario validations
		clickElement(UserRole_SA);
		
		clickElement(UserRoleSaveBtn);
		loader();
		
		if(scenarioFlag == true)
   			scenarioPass();
		
	}
	
	
	/**
	 * @author rupali.umat
	 * @scenario - Validate the On Hold progress hyperlink on Opp tile on Manage SA page
	 * @date - 21/02/2024
	 * @release March 16
	 * 	 
	 */
	public void ValidateOnHoldLink() throws Exception{
		boolean scenarioFlag = false;
		
		//Click on Manage
		navigateToManage();
		
		//click on On hold hyperlink
		clickElement(OnHold_Link);
		
		if(Opportunities.isDisplayed() == true) {
			
			logInfo("User is navigated to Opportunities Page");
			if((AllTab.getAttribute("aria-selected")).equals("true")) {
				logPass("On click of 'On hold' hyperlink, user is navigated to the 'All ' tab of  Opportunties page");
				scenarioFlag = true;
			}
			else {
				logPass("On click of 'On hold' hyperlink, user is NOT navigated to the 'All ' tab of  Opportunties page");
			}
		}
		else 
			logFail("User is not navigated to Opportunities page on click of 'On Hold' hyperlink");
		
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
		
	}
	/**
	 * @author dhanunjay.boya
	 * @scenario - Validate the hyperlink navigation of Recently Worked Opportunity on Opp tile on Manage SA page
	 * @date - 21/02/2024
	 * @release March 16
	 * 	 
	 */
	
	public void ValidateRecentlyWorkedOpportunity() throws Exception {
		
		boolean scenarioFlag = false;
		
		//navigateToManage();
		
		waitForElementToAppear(RecentlyWorkedOpportunity);
		String MMSId =RecentlyWorkedOpportunity.getText();
		String num[]= MMSId.split("-");
		
		clickElement(RecentlyWorkedOpportunity);
		if(OpportunityWorkflow.isDisplayed()) {
			logPass("The user is navigated to the Opportunity workflow Page");
			
			waitForElementToBeVisible(MMS_Id);
			String mmsId=MMS_Id.getText(); 
			String newMMSId[] = mmsId.split("-");
			System.out.println(num[num.length-1].strip());
			System.out.println(newMMSId[newMMSId.length-1]);
			if(num[num.length-1].strip().equals(newMMSId[newMMSId.length-1])) {
				logPass("The user is Successfully navigated to the Opportunity workflow of the MMS mentioned in the hyperlink (recently worked opp)");
				scenarioFlag = true;
			}
			else {
				logFail("The user is NOT navigated to the Opportunity workflow of the MMS mentioned in the hyperlink (recently worked opp)");
			}
		}
		else
			logFail("The user is NOT navigated to the Opportunity workflow Page");
		
		if (scenarioFlag == true)
			scenarioPass();
	} 
	
	/**
	 * @author dhanunjay.boya
	 * @scenario - Validate the hyperlink name of Recently Worked Opportunity on Opp tile on Manage SA page.
	 * @date - 21/02/2024
	 * @release March 16
	 * 	 
	 */
   public void hyperLinkName_MMSId() throws Exception {
	   
	   	boolean scenarioFlag = false;
	   	navigateToManage();
		
		String OpportunityName=RecentlyWorkedOpportunity.getText();
		
		if(OpportunityName.contains("MMS ID -")) {
			logPass("The name of hyperlink is present in formate 'MMS ID - the opp id on which user has worked recently' ");
			scenarioFlag = true;
		}
		else {
			logFail("The name of hyperlink is NOT present in formate 'MMS ID - the opp id on which user has worked recently'");
		}
		if (scenarioFlag == true)
			scenarioPass();
		
   }
   
   /**
	 * @author dhanunjay.boya
	 * @scenario - Validate that user is able to click on DisAA icon on Manage SA page.
	 * @date - 21/02/2024
	 * @release March 16
	 * 	 
	 */
   public void ValidateDisAAChatbot() throws Exception
	{
	   boolean scenarioFlag = true;
	    navigateToManage();
		
		clickElement(DisAA_Icon);
		  
		String disAA_Chatbot =DisAA_Icon.getAttribute("style");
		
		if(disAA_Chatbot.equals("visibility: hidden;")) {
			logPass("The DisAA chat box Opened on Click of DisAA Icon");
		}
		else {
			logFail("The DisAA chat box is not open on click of DisAA Icon");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true) 
			scenarioPass();
		
	}

   /**
	 * @author rupali.umat
	 * @scenario - Validate the Self Assign button Opp tile on Manage SA page
	 * @date - 21/02/2024
	 * @release March 16
	 * @Prerequisite - User should have access to Self Assign Button, to get access, we need to request it by clicking on 
	 * 'Register Now' button on Landing Page. The Manual team will approve the Request and then only we can check this 
	 * scenario.
	 * 	 
	 */
   	public void ValidateSelfAssignButton() throws Exception {
   		boolean scenarioFlag = false;
   		
   		navigateToManage();
   		
   		clickElement(SelfAssignButton);
   		
   		if(SelfAssignText.isDisplayed()) {
   			logPass("The user is navigated to the Self Assign deals page");
   			scenarioFlag = true;
   		}
   		else {
   			logFail("The user is NOT navigated to the Self Assign deals page");
   		}
   		if(scenarioFlag == true)
   			scenarioPass();
      }
     
   	/**
	 * @author rupali.umat
	 * @scenario - Validate the Create Interim button Opp tile on Manage SA page
	 * @date - 21/02/2024
	 * @release March 16
	 * @Prerequisite - User should have access to 'Create Interim' Button, to get access, we need to request it by clicking on 
	 * 'Register Now' button on Landing Page. The Manual team will approve the Request and then only we can check this 
	 * scenario.
	 * 	 
	 */
   	public void ValidateCreateInterimButton() throws Exception {
   		
   		boolean scenarioFlag = false;
   		navigateToManage();
   		
   		clickElement(CreateInterimButton);
   		
   		if(InterimText.isDisplayed()) {
   			logPass("The user is navigated to the Create Interim deals page");
   			scenarioFlag = true;
   		}
   		else {
   			logFail("The user is NOT navigated to the Create Interim deals page");
   		}
   		if(scenarioFlag == true)
   			scenarioPass();
      }
   	
   	/**
	 * Method to click on Manage button
	 * 
	 * @since 22/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void navigateToManage() throws Exception {
		waitForElementToAppear(ManageBtn);
		waitForElementToAppear(ManageBtn);
		clickElement(ManageBtn);
		waitForElementToAppear(ManageBtn);
	}

	/**
	 * TC_8: Validate the In progress count is correct on Opp tile on Manage SA page
	 * 
	 * @since 20/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateInprogressTabCount() throws Exception {
		boolean scenarioFlag = true;
		int inProgressTileValue = 0, activeDealTabValue = 0, totalInProgressDeal = 0, onHoldDealValue = 0,
				totalInprogresscount = 0, totalInprogressGridItems = 0, totalOnholdDeal = 0;

		navigateToManage();
		waitForElementToBeVisible(Inprogress_Card);
		inProgressTileValue = Integer.parseInt(getText(Inprogress_Card));
		logInfo("InProgressTileValue:" + inProgressTileValue);

		clickElement(OppInProgress_HyperLink);

		activeDealTabValue = Integer.parseInt(getText(Active_Deals).split("[(]")[1].split("[)]")[0].trim());
		logInfo("activeDealTabValue: " + activeDealTabValue);

		totalInProgressDeal = opportunityGridpagination("Active");

		// onhold deals
		clickElement(All_Deals);

		applyOpportunityFilter("onHold");

		onHoldDealValue = Integer.parseInt(getText(All_Deals).split("[(]")[1].split("[)]")[0].trim());
		logInfo("onHoldDealValue: " + onHoldDealValue);
		totalInprogresscount = onHoldDealValue + activeDealTabValue;

		totalOnholdDeal = opportunityGridpagination("Onhold");
		totalInprogressGridItems = totalOnholdDeal + totalInProgressDeal;

		if (inProgressTileValue == totalInprogresscount && inProgressTileValue == totalInprogressGridItems)
			logPass("The count of deals reflecting in Active Deals tab plus the Onhold count matches with In progress count");
		else {
			logFail("The count of deals reflecting in Active Deals tab plus the Onhold count does not match with In progress count");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	/**
	 * TC_10: Validate the Interim count is correct on Opp tile on Manage SA page
	 * 
	 * @since 20/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateInterimTabCount() throws Exception {
		boolean scenarioFlag = true;
		int interimTileValue = 0, interimTabValue = 0,
				totalInterimDeal = 0;

		navigateToManage();
		waitForElementToBeVisible(interimCard);
		interimTileValue = Integer.parseInt(getText(interimCard));
		logInfo("interimTileValue:" + interimTileValue);

		clickElement(OppinterimHyperLink);

		interimTabValue = Integer.parseInt(getText(interimDeals).split("[(]")[1].split("[)]")[0].trim());
		logInfo("interimTabValue: " + interimTabValue);

		totalInterimDeal = opportunityGridpagination("Interim");

		if (interimTileValue == totalInterimDeal && totalInterimDeal == interimTabValue)
			logPass("The count of deals reflecting in Interim deals tab matches with Interim count.");
		else {
			logFail("The count of deals reflecting in Interim deals tab is not matching with Interim count.");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	/**
	 * Method to get the total number of opportunities in opportunities grid
	 * 
	 * @since 21/02/2024
	 * @author surabhi.shervegar
	 * @return
	 * 
	 */
	public int opportunityGridpagination(String tabName) throws Exception {

		int totalPageCount = 0, TotalListItems = 0, totalDealsCount = 0, totalGridItems = 0;
		List<WebElement> dealList = null;

		if (tabName.equalsIgnoreCase("Active")) {
			dealList = Inprogress_Deals_List;
		}
		else if (tabName.equalsIgnoreCase("Interim")) {
			dealList = Inprogress_Hold_Deals_List;
		}
		else if (tabName.equalsIgnoreCase("All")) {
			dealList = Inprogress_Hold_Deals_List;
		} 
		else if (tabName.equalsIgnoreCase("Closed")) {
			dealList = Closed_Deals_List;
		}
		else {
			dealList = Onhold_Deals_List;
		}


		totalPageCount = Integer.parseInt(getText(Total_Pages_Grid));
		logInfo("totalPageCount of  " + tabName + " tab is " + totalPageCount);
		// total deals in page 1
		TotalListItems = dealList.size();
		logInfo("TotalListItems: " + TotalListItems);

		for (int i = 1; i < totalPageCount; i++) {

			clickElement(Grid_Next_Btn);
			totalDealsCount = totalDealsCount + dealList.size();
		}
		logInfo("totalDealsCount: " + totalDealsCount);

		totalGridItems = TotalListItems + totalDealsCount;
		logInfo("totalGridItems: " + totalGridItems);

		return totalGridItems;

	}

	/**
	 * TC_12: Validate the Closed count is correct on Opp tile on Manage SA page
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateClosedTabCount() throws Exception {
		boolean scenarioFlag = true;
		int closedTileValue = 0, totalClosedDeal = 0, allTabValue = 0;

		navigateToManage();
		waitForElementToBeVisible(Closed_Card);
		closedTileValue = Integer.parseInt(getText(Closed_Card));
		logInfo("closedTileValue:" + closedTileValue);

		clickElement(OppClosed_HyperLink);

		// filter
		applyOpportunityFilter("Closed");

		allTabValue = Integer.parseInt(getText(All_Deals).split("[(]")[1].split("[)]")[0].trim());
		logInfo("allTabValue: " + allTabValue);

		totalClosedDeal = opportunityGridpagination("Closed");

		if (closedTileValue == totalClosedDeal && totalClosedDeal == allTabValue)
			logPass("The count of deals reflecting in All deals tab with MMS status as closed matches with Closed count on tile.");
		else {
			logFail("The count of deals reflecting in All deals tab with MMS status as closed is not matching with Closed count on tile");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	/**
	 * TC_14: Validate the On Hold count is correct hyperlink on Opp tile on Manage
	 * SA page
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateOnHoldTabCount() throws Exception {
		boolean scenarioFlag = true;
		int onholdTileValue = 0, totalOnholdDeal = 0, allTabValue = 0;

		navigateToManage();
		waitForElementToBeVisible(OnHold_Card);
		onholdTileValue = Integer.parseInt(getText(OnHold_Card));
		logInfo("onholdTileValue:" + onholdTileValue);

		clickElement(Onhold_Tab_Navigation);

		// filter
		applyOpportunityFilter("onHold");
		waitForElementToBeVisible(All_Deals);
		allTabValue = Integer.parseInt(getText(All_Deals).split("[(]")[1].split("[)]")[0].trim());
		logInfo("allTabValue: " + allTabValue);

		totalOnholdDeal = opportunityGridpagination("Onhold");

		if (onholdTileValue == totalOnholdDeal && totalOnholdDeal == allTabValue)
			logPass("The count of deals reflecting in All deals tab with MMS status as On hold matches with OnHold count on tile.");
		else {
			logFail("The count of deals reflecting in All deals tab with MMS status as On hold does not match with OnHold count on tile.");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	/**
	 * Method to apply onHold, closed filter in opportunity dashboard
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author surabhi.shervegar
	 * 
	 */
	public void applyOpportunityFilter(String choice) throws Exception {
		WebElement selectedFilter;

		clickElement(Filter_Icon);

		if (choice.equalsIgnoreCase("Closed")) {
			selectedFilter = Closed_Filter_Btn;
		} else {
			selectedFilter = Onhold_Filter_Btn;
		}

		clickElement(selectedFilter);
		clickElement(Apply_Filter_Btn);

	}

	/**
	 * TC_9: Validate the In progress hyperlink on Opp title on Manage SA page
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 */
	public void activeDealsTabValidation() throws Exception {

		boolean scenarioFlag = false;
		String oppActiveDealsClass = "";

		navigateToManage();

		clickElement(OppInProgress_HyperLink);

		oppActiveDealsClass = OppActiveDeals.getAttribute("class");
		if (oppActiveDealsClass.contains("active")) {
			scenarioFlag = true;
			logPass("Succesfully navigated to the Active deals tab of Opportunties page");
		} else {
			logFail("Failed to navigate to the Active deals tab of Opportunities page");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * TC_11: Validate the Interim hyperlink on Opp title on Manage SA page
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 */
	public void interimDealsTabValidation() throws Exception {

		boolean scenarioFlag = false;
		String oppInterimDealsClass = "";

		navigateToManage();

		clickElement(OppinterimHyperLink);

		oppInterimDealsClass = OppInterimDeals.getAttribute("class");
		if (oppInterimDealsClass.contains("active")) {
			scenarioFlag = true;
			logPass("Succesfully navigated to the Interim deals tab of Opportunties page");
		} else {
			logFail("Failed to navigate to the Interim deals tab of Opportunities page");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * TC_13: Validate the Closed hyperlink on Opp title on Manage SA page
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nitish.kumar.prusty
	 */

	public void closeDealsTabValidation() throws Exception {
		boolean scenarioFlag = false;
		String oppAlldealsClass = "";

		navigateToManage();
		
		waitForElementToAppear(OppClosed_HyperLink);
		clickElement(OppClosed_HyperLink);

		oppAlldealsClass = OppAllDeals.getAttribute("class");

		if (oppAlldealsClass.contains("active")) {
			scenarioFlag = true;
			logPass("Succesfully navigated to the All tab of Opportunties page");
		} else {
			logFail("Failed to navigate to the All tab of Opportunities page");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * TC_23: Validate that user is navigating to landing page if clicked on
	 * myISP/accenture logo
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void NavigatetoLandingPage() throws Exception {
		boolean scenarioFlag = true;
		clickElement(Manage_Btn);
		clickElement(accentureLogo);
		if (isDisplayed(welcomeText))
			logPass("User is able to navigate to landing page.");
		else {
			logFail("User not able to navigate to landing page.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * TC_27: Validate the IT Spend Prediction and Benchmarks link and icon on
	 * Client Insights 360° tile on Manage SA page
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void NavigatetoITSpendPrediction() throws Exception {
		boolean scenarioFlag = true;
		clickElement(Manage_Btn);
		clickElement(ITSpendPrediction);
		switchToTab(1);
		String currentURL = getDriver().getCurrentUrl();
		if (isDisplayed(ExploreITSpendingInsights)
				&& currentURL.contains("mySPDashboard/MySp/ExploreITSpendingInsights/"))
			logPass("User is able to navigate to IT Spend Prediction and Benchmarks.");
		else {
			logFail("User not able to navigate to IT Spend Prediction and Benchmarks.");
			scenarioFlag = false;
		}
		getDriver().close();
		switchToTab(0);

		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * TC_24: Validate that drop down on Analytics and Insights tile on Manage SA
	 * page
	 * 
	 * @since 21/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author shreya.sharad.jadhav
	 */
	public void DropdownASE() throws Exception {
		boolean scenarioFlag = true;
		clickElement(Manage_Btn);
		clickElement(Analyticsdropdown);
		if (isDisplayed(ams) && isDisplayed(si))
			logPass("Analytics and Insights dropdown has AMS and SI option.");
		else {
			logFail("Analytics and Insights dropdown doesn't have AMS and SI option.");
			scenarioFlag = false;
		}
		clickElement(ams);
		if (scenarioFlag == true)
			scenarioPass();
	}
		
	
	/**
	 * TC-29 : Validate that user is able to View Last Activity tiles in Manage page
	 * 
	 * @since 21/02/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
	public void validateLastActivityOfClientTile() throws Exception{
		
		boolean scenarioFlag = true;
		
		// click on manage button...
		clickElement(manage_link);
		
		// check if Total client tile is present or not
		boolean isClientTilePresent = isDisplayed(clientTitleHeadingText);
		
		if (isClientTilePresent) {
			logInfo("Client Tile is visible");
		}
		else {
			logInfo("Client Tile is not visible");
		}
		
		boolean isRecentlyWorkClientTile = isDisplayed(clientRecentlyWorkTile);
		
		if(isRecentlyWorkClientTile) {
			logPass("Recently Work Space in Client Tile is visible");
		}else {
			logFail("Recently Work Space in Client Tile is not visible");
			scenarioFlag = false;
		}
		
		// go inside total client
		
		clickElement(totalClientLink);
		
		String no_of_clients = getText(listOfClient_Link).split("[(]")[1].replace(")","").trim();
		
		if (!no_of_clients.equals("0")) {
			logInfo("Clients are present");
			
			// select one client exception no client present
			clickElement(firstClientCard_viewDetails);
			waitForElementToBeVisible(All_Opportunity_link);
			
			// go inside the opportunity of one client exception no opportunity present.
			String no_of_opportunity = getText(All_Opportunity_link).split("[(]")[1].replace(")","").trim();
			
			if(!no_of_opportunity.equals("0")) {
				logInfo("Opportunities are present for the Respective Client");
				
				// take the client name.
				String clientName = getText(Opp_ClientName);
				
				clickElement(Opp_OppID);
				
				//change one element of what are we solving and save the page
				clickElement(navigate_whatAreWeSolving);
				
				String archtype= "AMS for Data/AI";
				String pricingStructure = "EFFORT-BASED: Time & Materials based on MSA/Client Rate Card";
				
				clickElement(primaryArchdropdown);
				for(int i=0;i<primaryArchList.size();i++) {
					if(primaryArchList.get(i).getText().equals(archtype)) {
						clickElement(primaryArchList.get(i));
						break;
					}
				}
				
				if(!pricingStrctTextValue.getAttribute("title").equals(pricingStructure)) {
					clickElement(pricingStructDropDown);
					clickElement(pricingStrct_searchSpace);
					sendKeys(pricingStrct_searchSpace, pricingStructure);
//					addPaddedWait(2);
					clickElement(pricingStrct_Option);
					clickElement(pricingStructDropUP);
				}
				else {
					logInfo("Value already given");
				}

				clickElement(btn_Save);
				clickElement(btn_Continue);
				
				NavigateBackToManagePage();
				
				// check the total client tile have the client name or not.
				String recentWorkingClient = clientRecentlyWorkTile.findElement(By.xpath(".//p/a")).getText();
				
				if (recentWorkingClient.equals(clientName)){
					logPass("user can view recently working client in the client tiles of Manage page");
				}
				else {
					logFail("user can not view recently working client in the client tiles of Manage page");
					scenarioFlag = false;
				}	
				
			}
			else {
				logPass("No opportunities are present for respective Client");
				NavigateBackToManagePage();
			}
			
		}
		else {
			logPass("No client Present for Validation");
			NavigateBackToManagePage();
		}
		
		
		if(scenarioFlag == true)
			scenarioPass();	
		else
			scenarioFail();
	
	}
	
	/**
	 * TC_30 : Validate that user is able to view total count header in Clients tiles
	 *
	 * @since 20/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 *
	 */
	
	public void totalClient() throws Exception {	
 
		boolean scenarioFlag = false, isTotalClienttLocatable;

		waitForElementToBeVisible(Manage_Button);
		clickElement(Manage_Button);
 
		isTotalClienttLocatable = isDisplayed(TotalClient_Header);
 
		if (isTotalClienttLocatable) {
			logPass("Total Client Header is present");
			scenarioFlag = true;
		} else {
			logFail("Total Client Header is not present");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}

	/**
	 * TC_31 : Validate that user is able to view  Recently worked  client name in clients tiles
	 *
	 * @since 20/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 *
	 */

 
	public void recentlyWorkedClient() {
		
 
		boolean scenarioFlag = false, isRecentlyWorkedClient;
		isRecentlyWorkedClient = isDisplayed(RecentlyWorkedClient_Text);
 
		if (isRecentlyWorkedClient) {
			logPass("Recently Worked Client is visible");
			scenarioFlag = true;
		} else {
			logFail("Recently Worked Client is not visible ");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}
	
	/**
	 * TC_32 : Validate that user is able to view "My favorite client" section in client tiles
	 *
	 * @since 20/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 *
	 */

 
	public void favouriteClient() {
 
		boolean scenarioFlag = false, isFavouriteClient;
		isFavouriteClient = isDisplayed(MyFavouriteClients_Text);
 
		if (isFavouriteClient) {
			logPass("Favourite Client is visible");
			scenarioFlag = true;
		} else {
			logFail("Favourite Client is not visible ");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}
 
	/**
	 * TC_33 : Validate that clicking on clients user will navigate to clients page and see list of client names
	 *
	 * @since 21/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 *
	 */
	
	public void totalClientbutton() throws Exception {
 
		boolean scenarioFlag = false, isListOfClients, isClientCard;
 
		waitForElementToBeVisible(TotalClient_Button);
		clickElement(TotalClient_Button);
		waitForElementToBeVisible(ListofClients);
 
		isListOfClients = isDisplayed(ListofClients);
		isClientCard = isDisplayed(Client_Card);
		if (isListOfClients && isClientCard) {
			logPass("Client List is visible");
			scenarioFlag = true;
		} else {
			logFail("Client List is not visible ");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
 
	}
 
	/**
	 * TC_34 : Validate that "All clients" colunm is available in clients page and clicking on this user is able to see clients names
	 *
	 * @since 21/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 *
	 */
	
	public void allClientbutton() throws Exception {
 
		boolean scenarioFlag = false, isClientCard, isAllClientTab;
		isAllClientTab = isDisplayed(AllClient_Button);
		clickElement(AllClient_Button);
		
		if(isAllClientTab) {
			logPass("All Client Tab is present");
			scenarioFlag = true;
		}
		else {
			logFail("All Client Tab is not present");
		}
 
		String no_of_clients = getText(listOfClient_Link).split("[(]")[1].replace(")","").trim();
		
		if (!no_of_clients.equals("0")) {
			logInfo("Clients are present");
		
			isClientCard = isDisplayed(Client_Card);
			if(isClientCard) {
				logPass("Client List is present");
				scenarioFlag = true;
			} else {
				logFail("Client List is not present");
			}
		}
		else {
			logPass("No Client is present for validation.");
			scenarioFlag = true;
		}
		
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}
 
	
	/**
	 * TC_35 : Validate that favorites clients column is available in clients page and clicking on this user is able to see favourities clients names
	 * TC_36 : Validate that user is able mark a client as favourite
	 *
	 * @since 21/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 *
	 */
	
	public void favouriteClientbutton() throws Exception {
 
		boolean scenarioFlag = false, isFavouriteClientCard, isClientCard;
 
		waitForElementToBeVisible(FavouriteClients_Button); 
		isFavouriteClientCard = isDisplayed(FavouriteClients_Button);
		
		if(isFavouriteClientCard) {
			logPass("Favorite Client Tab is Present");
			scenarioFlag = true;
		}
		else {
			logFail("Favorite Client Tab is not Present");
		}
		
		if(favouritIcon.getAttribute("src").contains("star-hover")) {
			logInfo("First client is already masked as Favourite client.");
		}
		else {
			waitForElementToBeVisible(favouritIcon);
			clickElement(favouritIcon);
			
			waitForElementToAppear(favouritIcon);
			if(favouritIcon.getAttribute("src").contains("star-hover")) {
				logPass("User can mark client as Favourite");
				scenarioFlag = true;
			}
			else {
				logFail("User can not mark client as Favourite");
			}
		
		}
		
		clickElement(FavouriteClients_Button);
		
		String no_of_clients = getText(listOfClient_Link).split("[(]")[1].replace(")","").trim();
		
		if (!no_of_clients.equals("0")) {
			logInfo("Clients are present");
		
			isClientCard = isDisplayed(Client_Card);
			if (isClientCard) {
				logPass("In Favorite Client Tab, Favorite client List is present");
				scenarioFlag = true;
			} else {
				logFail("In Favorite Client Tab, Favorite client List is not present");
			}
		}
		else {
			logPass("No favorite Client is present for validation.");
			scenarioFlag = true;
		}
		
		NavigateBackToManagePage();
		
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}
	
	/**
	 * TC_37 : Validate that clicking on view details user is able navigate on details page
	 *
	 * @since 21/02/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 *
	 */
	
	public void Client_ViewDetails() throws Exception{
		boolean scenarioFlag = true;
		
		clickElement(totalClientLink);
		waitForElementToBeVisible(listOfClient_Link);
		
		String no_of_clients = getText(listOfClient_Link).split("[(]")[1].replace(")","").trim();
		
		if (no_of_clients != "0") {
			logInfo("Clients are present");
			
			// select one client exception no client present
			
			String cardTitle = getText(firstClientCard_cardTitle);
			
			clickElement(firstClientCard_viewDetails);
			waitForElementToBeVisible(All_Opportunity_link);
			
			String carddetailPage_Haeding = getText(clientDetails_Heading);
			
			if(carddetailPage_Haeding.equals(cardTitle)) {
				logPass("Clicking on view details user can navigate to details page.");
			}
			else {
				logFail("Clicking on view details user can not navigate to details page.");
				scenarioFlag = false;
			}
		}
			
		else {
			logInfo("No client Present");	
		}
		
		NavigateBackToManagePage();
		
		if(scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}
	

	public void NavigateBackToManagePage() throws Exception{
		try {
			
			clickElement(manage_link); 
			logInfo("Navigating Back to Manage Page from Client Details page");
		}
		catch(Exception e) {
			
			clickElement(manage_link_InSolComp);
			logInfo("Navigating Back to Manage Page From Soluion Component page.");
		}
	}

	/**
	 * TC_1: Validate that user is able to View Last Activity tiles in Manage page
	 * TC_2: Validate that user is able to view Latest modified screen name with MMS
	 * ID and SG in Last Activity tiles TC_3: Validate that user is able to view
	 * latest modified date and time in Last Activity tiles TC_4: Validate that
	 * Clicking on continue user is able to navigate to Particular screen which is
	 * available in Last Activity tiles
	 * 
	 * @since 21/02/2024
	 * @author s.ah
	 * @return
	 * 
	 */
	public void LastActivitytile(String OppId) throws Exception {

		boolean scenarioFlag = true;

		clickElement(Manage_Btn);

		boolean Value = isDisplayed(Lastactivitytile);

		if (Value == true)
			logPass("Lastactivitytile is available at Manage SA page");
		else {
			logFail("Lastactivitytile is not available at Manage SA page");
			scenarioFlag = false;
		}

		clickElement(Total_opportunitieslink);
		sendKeys(opportunitypage_inputbox,OppId);
		clickElement(getDriver().findElement(By.xpath("//div[contains(text(),'" + OppId + "')]")));
		waitForElementToBeVisible(Opportunityworkflow_OpportunityonaPage);
		clickElement(Opportunityworkflow_OpportunityonaPage);
		waitForElementToAppear(primaryArchHeading);
		waitForElementClickable(primaryArchdropdown);
		clickElement(primaryArchdropdown);
		for (int i = 0; i < primaryArchList.size(); i++) {
			if (primaryArchList.get(i).getText().contains("for DBR")) {
				clickElement(primaryArchList.get(i));
				break;
			}
		}
		clickElement(Savebutton);
		SimpleDateFormat ft = new SimpleDateFormat("dd-MMMM-yyyy");
		String str = ft.format(new Date());
		String Screename = getText(Opportunityworkflow_OpportunityonaPage);
		String SG = getText(Servicegroup);
		waitForElementToBeVisible(Manage_breadcrumb);
		clickElement(Manage_breadcrumb);

		if (getText(Lastactivitytile_Screenname).equals(Screename)
				&& getText(Lastactivitytile_MMSID).equals("MMS ID - " + OppId)
				&& getText(Lastactivitytile_ServiceGroup).equals("Service Group - " + SG)
				&& getText(Lastactivitytile_Dateandtime).contains(str.replace("-", " ")))

			logPass("user is able to view Latest modified screen name, MMS ID, date and time, and SG"
					+ " in Last Activity tiles");
		else {
			logFail("user is not able to view Latest modified screen name, MMS ID, date and time, and SG"
					+ " in Last Activity tiles");
			scenarioFlag = false;
		}

		clickElement(Lastactivitytile_Continue);
		// waitForElementToBeVisible(Opportunityworkflow_OpportunityonaPage);
		if (isDisplayed(Opportunityworkflow_OpportunityonaPage) && isDisplayed(primaryArchHeading))
			logPass(" Clicking on continue user is able to navigate to Particular screen"
					+ " which is available in Last Activity tiles");
		else {
			logFail("Clicking on continue user is not able to navigate to Particular screen "
					+ "which is available in Last Activity tiles");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	} 

	/**
	 * TC_5: Validate that opportunties tile is available at Manage SA page 
	 * TC_6: Validate the total opp count is correct on Opp tile on Manage SA page
	 * TC_7: Validate the total opp hyperlink on Opp tile on Manage SA page
	 * 
	 * @since 21/02/2024
	 * @author s.ah
	 * @return
	 * 
	 */
	public void Opportuntiestile() throws Exception
	{
		boolean scenarioFlag = true;		
		//TC_5: Validate that opportunties tile is available at Manage SA page
		waitForElementToBeVisible(Manage_Btn);
		clickElement(Manage_Btn);
		waitForElementToBeVisible(opportunitytile);
		boolean Value = isDisplayed(opportunitytile);
		if (Value == true)
			logPass("opportunties tile is available at Manage SA page");
		else {
			logFail("opportunties tile is not available at Manage SA page");
			scenarioFlag = false;
		}
		//TC_7: Validate the total opp hyperlink on Opp tile on Manage SA page
		waitForElementToBeVisible(Totalopportunity_count);
		int count = Integer.parseInt(getText(Totalopportunity_count));
		clickElement(Total_opportunitieslink);
		if (isDisplayed(opportunities_page))
			logPass("User is able to navigate to Opportunities Page");
		else {
			logFail("User is not able to navigate to Opportunities Page");
			scenarioFlag = false;
		}
		
		//TC_6: Validate the total opp count is correct on Opp tile on Manage SA page
		int Totalopppournitycount = opportunityGridpagination("All");

		if (Totalopppournitycount == count)
			logPass("Total opp count is correct on Opp tile on Manage SA page");
		else {
			logFail("Total opp count is not correct on Opp tile on Manage SA page");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * TC_4 : Validate if the SA is able to navigate to Opportunity Dashboard on
	 * click of Total Opportunity.
	 * 
	 * @since 27/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void ValidateTotalOppLink() throws Exception {
		boolean scenarioFlag = true;
		String OppAllDealsClass = "";
		navigateToManage();
		waitForElementToBeVisible(Total_opportunitieslink);
		clickElement(Total_opportunitieslink);

		OppAllDealsClass = OppAllDeals.getAttribute("class");

		if (isDisplayed(opportunities_page) && OppAllDealsClass.contains("active"))
			logPass("User is able to navigate to Opportunities Page.");
		else {
			logFail("User is not able to navigate to Opportunities Page.");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}

	/**
	 * TC_5 : Validate the Opportunity Dashboard [UI Design, ARC standards,
	 * Functionalities-Pin,Edit, Link(Interim)][All,Active,Interim],Log status
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void ValidateOppDashboard(String OppID_To_Link, String userId) throws Exception {
		boolean scenarioFlag = true;
		int row;
		String newOpportunityName = "InterimTestEdit", updatedOppName = "", logStatusInput = "textareainput",
				oppInterimDealsClass = "", oppActiveDealsClass = "", OppAllDealsClass = "", updatedLogStatus = "",
				generatedDeal = "", linkedDeals = "";
		WebElement pinnedOpportunity, savedComment;
		navigateToManage();
		waitForElementToAppear(Total_opportunitieslink);
		waitForElementToBeVisible(Total_opportunitieslink);
		clickElement(Total_opportunitieslink);
		if(userId.contains("SW")) {
			row=1;
		}else {
			row=3;
		}
		// pin an opportunity
		waitForElementToAppear(opportunitypage_inputbox);
		clickElement(opportunitypage_inputbox);
		sendKeys(opportunitypage_inputbox, OppID_To_Link);

		clickElement(Opportunity_Pin_Btn);
		waitForElementToAppear(opportunitypage_inputbox);

		pinnedOpportunity = getDriver()
				.findElement(By.xpath("//div[text()='" + OppID_To_Link + "']/preceding-sibling::img"));
		logInfo("Pinned tag opacity: " + pinnedOpportunity.getCssValue("opacity"));

		if (pinnedOpportunity.getCssValue("opacity").equals("1")) {
			logPass("User is able to pin an opportunity.");

		} else {
			logFail("User is unable to pin an opportunity.");
			scenarioFlag = false;
		}
		waitForElementToBeVisible(Opportunity_Pin_Btn);
		clickElement(Opportunity_Pin_Btn);

		// Create an interim deal
		navigateToManage();
		generatedDeal = interimPage.createInterimDeal(ConstantUtils.FilePath_InterimDeal_NextGen, "interimCreation", row);
		logInfo("generatedDeal: " + generatedDeal);

		navigateToManage();
		waitForElementToAppear(Total_opportunitieslink);
		clickElement(Total_opportunitieslink);
		// Edit an interim deal
		sendKeys(opportunitypage_inputbox, generatedDeal);
		waitForElementToBeVisible(Opportunity_Edit_Btn);
		clickElement(Opportunity_Edit_Btn);
		// Edit opportunity Name
		waitForElementToAppear(interimPage.Opportunity_Name_Txtbox);
		clear(interimPage.Opportunity_Name_Txtbox);
		sendKeys(interimPage.Opportunity_Name_Txtbox, newOpportunityName);
		clickElement(interimPage.Interim_Save_Btn);
		// waws page
		waitForElementToAppear(Updated_Opportunity_Name);
		updatedOppName = getText(Updated_Opportunity_Name);
		if (updatedOppName.equals(newOpportunityName)) {
			logPass("User is able to edit the interim deal.");
		} else {
			logFail("User is unable to edit the interim deal.");
			scenarioFlag = false;
		}

		// Log status- Should able update status and save it
		navigateToManage();
		waitForElementToBeVisible(Total_opportunitieslink);
		clickElement(Total_opportunitieslink);
		sendKeys(opportunitypage_inputbox, generatedDeal);

		waitForElementToBeVisible(Opp_Log_Status_Btn);
		clickElement(Opp_Log_Status_Btn);
		clickElement(Opp_Interim_Status_Drpdwn);
		clickElement(Opp_Interim_OnHold_Option);
		sendKeys(Log_Status_Txtbox, logStatusInput);
		clickElement(Log_Status_Save_Btn);

		waitForElementToBeVisible(Opp_Log_Status_Btn);
		clickElement(Opp_Log_Status_Btn);
		waitForElementToBeVisible(Opp_Log_Status_Selected);
		updatedLogStatus = getText(Opp_Log_Status_Selected);
		savedComment = getDriver().findElement(By.xpath("//tbody//div[text()='" + logStatusInput + "']"));
		if (updatedLogStatus.equals("On Hold") && isDisplayed(savedComment)) {
			logPass("User is able to update the status and save.");
		} else {
			logFail("User is unable to update the status and save.");
			scenarioFlag = false;
		}
		waitForElementToBeVisible(Log_Status_Popup_close);
		clickElement(Log_Status_Popup_close);

		// Link interim deal to MMS ID
		interimPage.linkInterimDeal(OppID_To_Link);

		waitForElementToBeVisible(All_Deals);
		clickElement(All_Deals);
		clear(opportunitypage_inputbox);
		sendKeys(opportunitypage_inputbox, OppID_To_Link);
		linkedDeals = (getDriver()
				.findElement(By.xpath("//div[text()='" + OppID_To_Link + "']/following-sibling::img")))
						.getAttribute("title");
		logInfo("linkedDeals: " + linkedDeals);
		if (linkedDeals.contains(generatedDeal)) {
			logPass("User is able to link an interim deal.");
		} else {
			logFail("User is unable to link an interim deal.");
			scenarioFlag = false;

		}
		OppAllDealsClass = OppAllDeals.getAttribute("class");
		clickElement(Active_Deals);
		oppActiveDealsClass = OppActiveDeals.getAttribute("class");
		clickElement(interimDeals);
		oppInterimDealsClass = OppInterimDeals.getAttribute("class");
		if (OppAllDealsClass.contains("active") && oppActiveDealsClass.contains("active")
				&& oppInterimDealsClass.contains("active")) {
			logPass("Succesfully navigated to the respective tabs on tab click.");
		} else {
			logFail("Failed to navigate to the respective tabs on tab click.");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}

	/**
	 * 
	 * TC_2: Validate if the SA is able to navigate to Manage Dashboard on click of
	 * manage tab.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nitish.kumar.prusty
	 * 
	 */
	public void validateManageTab() throws Exception {

		boolean scenarioFlag = false;
		String manageTabClass = "";

		navigateToManage();
		boolean isManageHeaderDisplayed = isDisplayed(ManageDashBoard_header);

		manageTabClass = Manage_list.getAttribute("class");
		if (manageTabClass.contains("active") && isManageHeaderDisplayed) {
			logPass("Succesfully navigated to the Manage dashboard");
			scenarioFlag = true;
		} else {
			logFail("Failed to navigate to the Manage dashboard");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * 
	 * TC_3: Validate if all tiles are present on Manage Dashboard
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nitish.kumar.prusty
	 * 
	 */
	public void validateAllTilesOnManageDashBoard() throws Exception {

		boolean scenarioFlag = false;
		navigateToManage();

		boolean isLastActivitySecDisplayed = isDisplayed(LastActivity_Sec);
		boolean isOppSecDisplayed = isDisplayed(Opportunites_Sec);
		boolean isClientsSecDisplayed = isDisplayed(Clients_Sec);
		boolean isAppsSecDisplayed = isDisplayed(App_Sec);
		boolean isAnalyticsInsightsSecDisplayed = isDisplayed(AnalyticsAndInsights_Sec);
		boolean isClientInsightsDisplayed = isDisplayed(ClientInsights_Sec);

		if (isLastActivitySecDisplayed && isOppSecDisplayed && isClientsSecDisplayed && isAppsSecDisplayed
				&& isAnalyticsInsightsSecDisplayed && isClientInsightsDisplayed) {
			logPass("All Titles are present on Manage DashBoard");
			scenarioFlag = true;
		} else {
			logFail("All Titles are not present on Manage DashBoard");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}
	/**
	 * TC_6: Validate if the SA is able to navigate to opportunity workflow on click of respective MMS ID(AMS).
	 * 
	 * @since 27/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void navigatetoMMSID(String OppId) throws Exception {
		boolean scenarioFlag = true;
		waitForElementToAppear(Manage_Btn);
		clickElement(Manage_Btn);

		waitForElementToAppear(Total_opportunitieslink);
		clickElement(Total_opportunitieslink);
		sendKeys(opportunitypage_inputbox,OppId);
		clickElement(getDriver().findElement(By.xpath("//div[contains(text(),'" + OppId + "')]")));
		waitForElementToAppear(MMSID);
		if (getText(MMSID).equals(OppId))
			logPass("SA is able to navigate to opportunity workflow on click of respective MMS ID");
		else {
			logFail("SA is not able to navigate to opportunity workflow on click of respective MMS ID");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}
	
	/**
	 * TC_7: Validate if the SA is able to view all the components/assets of Opportunity Workflow.
	 * 
	 * @since 27/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void validateAllComponents() throws Exception {
		boolean scenarioFlag = true;
		
		waitForElementToAppear(OpportunityInformation);
		if (isDisplayed(OpportunityInformation) && isDisplayed(QuickLinks) && isDisplayed(StatusUpdate) && isDisplayed(DefineTeam)
				&& isDisplayed(WAWS) && isDisplayed(ValueShaping) && isDisplayed(EstimatorCalculators)
				&& isDisplayed(SolutionComponents) && isDisplayed(VBDC) && isDisplayed(DigitalDocumentation)
				&& isDisplayed(ReviewApprovals) && isDisplayed(ContractSolution) && isDisplayed(TransitionToDelivery))
			logPass("SA is able to view all the components/assets of Opportunity Workflow.");
		else {
			logFail("SA is not able to view all the components/assets of Opportunity Workflow.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}
}
