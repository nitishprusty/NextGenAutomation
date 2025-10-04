package pageObjects;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import org.testng.Assert;

import reusableComponents.RandomUtilities;
import reusableComponents.ConstantUtils;
import reusableComponents.VerificationLibrary;
 
public class WAWS_Page_New extends Login_Page { 
	
	Interim_Page interimPage = PageFactory.initElements(getDriver(), Interim_Page.class);
	Manage_SA_Page ManageSaPage;
	
	
	/************************** LOCATORS *****************************/
	//Manage_SA_Page ManageSAPage;


	@FindBy(how = How.XPATH, using = "//li[contains(@class,'active anchor__cursor')]/span[text()='Preliminary Assessment']")
	public WebElement preliminaryAssessmentPage;
	@FindBy(how = How.XPATH, using = "//button[text()='Continue']")
	public WebElement btn_Continue;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]/a[text()='Scope']")
	public WebElement scopeLink;
	@FindBy(how = How.XPATH, using = "//span[text()='Scope']")
	public WebElement scopelink;
	@FindBy(how = How.XPATH, using = "//span[normalize-space(text())='AMS Assessments - Delivery Model Assessment']")
	public WebElement AMSAssessmentsHeader;
	@FindBy(how = How.XPATH, using = "//span[normalize-space(text())='SI Assessments - ReInvent SI Assessment']")
	public WebElement SIAssessmentsHeader;
	@FindBy(how = How.XPATH, using = "//span[normalize-space(text())='IMS Assessments']")
	public WebElement IMSAssessmentsHeader;
	@FindBy(how = How.XPATH, using = "//button[text()='Delivery Center']")
	public WebElement deliveryCenterButton;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'matListItemTitle')]/a[text()='Preliminary Assessment']")
	public WebElement preliminaryAssessmentLink;
	@FindBy(how = How.XPATH, using = "//button[@id='SG']")
	public WebElement SG_Selected;
	@FindBy(how = How.XPATH, using = "//label[text()='No Assessment Available']")
	public WebElement assesmentForIMS;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='What Are We Solving For']")
	public WebElement WRWS_Icon;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='What Are We Solving For']")
	public WebElement WRWS_Heading;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Opportunity on a Page']")
	public WebElement OOAP_Text;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Scope']")
	public WebElement Scope_Text;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Preliminary Assessment']")
	public WebElement PA_Text;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Client Context']")
	public WebElement CC_Text;

	@FindBy(how = How.XPATH, using = "//button[@id='OppCancel']")
	public WebElement Cancel_Btn;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveBtnNew']")
	public WebElement Save_Btn;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue']")
	public WebElement Continue_Btn;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAssessment']")
	public WebElement Start_assesment_SI_Category;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnAMSAssessment']")
	public WebElement Start_assesment_AMS_Category;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Preliminary Assessment']")
	public WebElement PA_Tab;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtRDE']")
	public WebElement RDE_Type;
	
	@FindBy(how = How.XPATH, using = "//a[@id='OpportunityInfo']")
	public WebElement Opp_Info;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'fontoppinfo')][normalize-space()='Technology']")
	public WebElement RDE_Tech;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'fontoppinfo')][normalize-space()='Song']")
	public WebElement RDE_Song;
	
	@FindBy(how = How.XPATH, using = "//button[@title='ADOBE']")
	public WebElement primaryTechnology;
	
	@FindBy(how = How.XPATH, using = "//button[@id='closeInfo']//img[@alt='close']")
	public WebElement CLose_OITab;
	
	@FindBy(how = How.XPATH, using = "//button[@id='Technologybtn']")
	public WebElement technology_btn;
	
	//sherays
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Scope')]")
	public WebElement WRWSScopeButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Delivery Center')]")
	public WebElement WRWSDeliveryCentreButton;

	@FindBy(how = How.XPATH, using = "//button[contains(@title,'Continue')]")
	public WebElement WRWSDeliveryCentreContinueButton;

	@FindBy(how = How.XPATH, using = "//button[@title='Refresh']")
	public WebElement WRWSDeliveryCentreRefreshButton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Client Context')]")
	public WebElement WRWSClientContextButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'1. Who is the buyer ?')]")
	public WebElement WRWSClientContextQuestion1;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[1]")
	public WebElement WRWSClientProcedureDrivenRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[2]")
	public WebElement WRWSClientBusinessDrivenRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[3]")
	public WebElement WRWSClientITDrivenRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[4]")
	public WebElement WRWSClientOthersRadioButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'2. How is our relationship with client buyer ?')]")
	public WebElement WRWSClientContextQuestion2Button;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[5]")
	public WebElement WRWSClientRelationshipRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[6]")
	public WebElement WRWSClientTrustedButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[7]")
	public WebElement WRWSClientLimitedRadioButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'3. How does the client sees Accenture ?')]")
	public WebElement WRWSClientContextQuestion3Button;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[8]")
	public WebElement WRWSClientTransformativeRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[9]")
	public WebElement WRWSClientConsultingRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[10]")
	public WebElement WRWSClientOperationRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[11]")
	public WebElement WRWSClientNoSpecificRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[12]")
	public WebElement WRWSClientOthersNewRadioButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'4. Is the customer facing any challenges around Sustainability ?')]")
	public WebElement WRWSClientContextQuestion4Button;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[13]")
	public WebElement WRWSClientYesRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[14]")
	public WebElement WRWSClientNoRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[15]")
	public WebElement WRWSClientNotSureRadioButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'5. Is the client having any expectation around rebadging or rehire [People Transfer] ?')]")
	public WebElement WRWSClientContextQuestion5Button;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[16]")
	public WebElement WRWSClientNotPeopleRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[17]")
	public WebElement WRWSClientLessThanRadioButton;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[18]")
	public WebElement WRWSClient20RadioButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'floating__save floating_fixed_style')]/div/div//following-sibling::button[contains(text(),'Save')]")
	public WebElement WRWSClientSaveButton;

	@FindBy(how = How.XPATH, using = "//p[contains(.,'No Data Modified.')]")
	public WebElement WRWSClientNoDataModifiedText;

	@FindBy(how = How.XPATH, using = "//button[contains(@id,'SaveBtn') and text()='Save']")
	public WebElement btn_Save;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Preliminary Assessment')]")
	public WebElement WRWSPremilinaryAssessmentButton;

	@FindBy(how = How.XPATH, using = "//*[@id='btnAMSAssessment']")
	public WebElement WRWSViewAssessmentButton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit Assessment')]")
	public WebElement WRWSEditAssessmentButton;

	@FindBy(how = How.XPATH, using = "(//button[@id='dropdownMenuButton'])[1]")
	public WebElement WRWSEditAssessmentDropdownButton;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'No')]")
	public WebElement WRWSEditAssessmentDropdownNoButton;

	@FindBy(how = How.XPATH, using = "//button[contains(@id,'savepart')]")
	public WebElement WRWSEditAssessmentDropdownSaveButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Refresh')]")
	public WebElement WRWSEditAssessmentRefreshButton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Opportunities')]")
	public WebElement WRWSOpportunityBreadscrum;

	@FindBy(how = How.XPATH, using = "//div[@id='AMSEnableDisable']//div[@class='form-group']")
	public WebElement WRWSAssesmentTaken;

	@FindBy(how = How.XPATH, using = "//div[@id='AMSEnableDisable']//div[@class='form-group preliminary-text']")
	public WebElement WRWSOutcome;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Refresh')]")
	public WebElement WRWSRefreshButton;

	//Sanjana
	@FindBy(how = How.XPATH, using = "//a[text()= 'Manage']")
	public WebElement Manage_btn;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Total Opportunities')]")
	public WebElement TotalOpportunities;

	@FindBy(how = How.XPATH, using = "//div[text()='0011997976']")
	public WebElement MMSID;

	@FindBy(how = How.XPATH, using = "//button[contains(@id,'SaveBtnClient')]")
	public WebElement SaveBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='ClientCancel']")
	public WebElement CancelBtn;

	@FindBy(how = How.XPATH, using = "//button[contains(@title,'Continue')]")
	public WebElement ContinueBtn;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunity on a Page')]")
	public WebElement WRWS_Opportunityonpage;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='1'])[1]")
	public WebElement Enter_Answer;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Provide details Solution Strategy')]")
	public WebElement ProvidedetailsSolutionStrategy;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveBtnNew']")
	public WebElement WRWS_Savebutton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Scope')]")
	public WebElement WRWS_Scope;

	@FindBy(how = How.XPATH, using = "//input[@id='SUBSG144']")
	public WebElement Checkbox_ResaleIMS;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveBtnScope']")
	public WebElement WRWS_ScopeSavebutton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Client Context')]")
	public WebElement WRWS_ClientContext;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Client Context')]")
	public WebElement WRWS_ClientContextLink;

	@FindBy(how = How.XPATH, using = "(//span[@class='radio__checkmark'])[3]")
	public WebElement Scope_ITDriven;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Summary')]")
	public WebElement WRWS_Summary;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'abcd')]")
	public WebElement WRWS_SummaryOpp;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'IT Driven')]")
	public WebElement WRWS_SummaryCC;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Resale-IMS')]")
	public WebElement WRWS_SummaryScope;

	@FindBy(how = How.XPATH, using = "//a[.='Opportunity Workflow']")
	public WebElement OpportunityWorkFlowLink;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'TECH-8000005456')]")
	public WebElement MMSIDSI;

	@FindBy(how = How.XPATH, using = "(//span[@class='dropdown-down'])[2]")
	public WebElement PricingStructure_Dropdown;

	@FindBy(how = How.XPATH, using = "//*[@id='ddlPricingStructure']/div/div[2]/ul[1]/li[1]/div")
	public WebElement SelectAll;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'UnSelect All')]")
	public WebElement UnSelectAll;

	@FindBy(how = How.XPATH, using = "//p[.='Opportunity On A Page Input is pending. So rest of the lifecycle apps are disabled.']")
	public WebElement PendingMessage;

	@FindBy(how = How.XPATH, using = "//p[@class='alert-msg success-msg']")
	public WebElement EnableMessage;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement Typeatexttofilter;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'9990000014')]")
	public WebElement MMSID2;

	@FindBy(how = How.XPATH, using = "//i[starts-with(text(),'search')]")
	public WebElement search;


	
	public WAWS_Page_New () {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	Manage_SA_Page ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
	OpportunitiesPage opportunitiesPage = PageFactory.initElements(getDriver(), OpportunitiesPage.class);


	/**
	 * TC_23: Validate when user clicks on Continue from Delivery center, user is navigated to Preliminary assessment Page
	 * 
	 * @since 26/03/2024
	 * 
	 * @release April 01
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void navigiatePreliminaryAssesmentFromDeliveryCenter() throws Exception {
		boolean scenarioFlag = false;
		waitForElementClickable(scopeLink);
		clickElement(scopeLink);
		waitForElementClickable(deliveryCenterButton);
		clickElement(deliveryCenterButton);
		clickElement(btn_Continue);
		waitForElementToBePresent(preliminaryAssessmentPage);
		if (preliminaryAssessmentPage.isDisplayed()) {
			logPass("User is able to navigate to Preliminary Assessment page after clicking continue button on Delivery center");
			scenarioFlag = true;
		} else {
			logFail("User is not able to navigate toPreliminary Assessment page after clicking continue button on Delivery center");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * TC_24: Validate user is able to view all the 3 SG sections under Preliminary assessment screen.
	 * 
	 * @since 27/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void validatePreliminaryAssessmentSGSections() throws Exception {
		boolean scenarioFlag = false;

		//clickElement(btn_Continue);
		if (AMSAssessmentsHeader.isDisplayed() && SIAssessmentsHeader.isDisplayed() && IMSAssessmentsHeader.isDisplayed()) {
			logPass("User is able to view all the 3 SG sections under Preliminary assessment screen.");
			scenarioFlag = true;
		} else {
			logFail("User is able to view all the 3 SG sections under Preliminary assessment screen.");
		}
		scroll("top");
		if (scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * TC_25: Validate for AMS start assessment assessment button is enabled if RDE is Technology.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author ganesh.kumar.majeti
	 */

	public void validateStartAssesmentAMS() throws Exception {
		
		boolean scenarioFlag = false;
	//	ManageSaPage.navigatetoMMSID(Req_MMSId1);
		String SG="";
	/*	waitForElementToAppear(WRWS_Icon);
		clickElement(WRWS_Icon);
		waitForElementToAppear(WRWS_Heading);
		clickElement(PA_Tab);*/
		SG = SG_Selected.getAttribute("title");
		if(SG.equals("AMS")) {
			jsClick(Opp_Info);
			waitForElementToAppear(RDE_Tech);
			if(RDE_Tech.isDisplayed()) {
				jsClick(CLose_OITab);
				if(Start_assesment_AMS_Category.isEnabled()) {
					logPass("User is able to View start assessment button enabled for AMS.");
					scenarioFlag = true;
				}
				else {
					logFail("User is not able to View start assessment button enabled for AMS.");
				}
			}
			else {
				logPass("RDE is not technology, so assessment is not available for AMS.");
			}
	}
		scroll("top");
		
		if(scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * TC_27: Validate user is able to view Start assessment for SI once all the mandatory inputs are filled and navigated to assessment screen.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author ganesh.kumar.majeti
	 * @throws Exception 
	 */

	public void validateStartAssesmentSI(String Req_MMSId1) throws Exception {
		
		boolean scenarioFlag = false;
		ManageSAPage.navigatetoMMSID(Req_MMSId1);	
		waitForElementToAppear(WRWS_Icon);
		clickElement(WRWS_Icon);
		waitForElementToAppear(WRWS_Heading);
		clickElement(PA_Tab);
		jsClick(Opp_Info);
		waitForElementToAppear(RDE_Tech);
		if(RDE_Tech.isDisplayed()) {
			jsClick(CLose_OITab);
			if(Start_assesment_SI_Category.isEnabled()) {
				logPass("User is able to View start assessment button enabled.");
				scenarioFlag = true;
			}
			else {
				logFail("User is not able to View start assessment button enabled.");
			}
		}
		else {
			logPass("RDE is not technology, so assessment is not available.");
		}
		scroll("top");
		
		if(scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * TC_28: Verify for SI when RDE=Song, and Under technology Primary technology is selected anything with ADOBE, Start/View assessment is enabled.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author ganesh.kumar.majeti
	 * @throws Exception 
	 */

	public void validateStartAssesmentSISong(String Req_MMSId1) throws Exception {
		
		boolean scenarioFlag = false;
		ManageSAPage.navigatetoMMSID(Req_MMSId1);
		String primaryAssesment ="";
		waitForElementToAppear(WRWS_Icon);
		clickElement(WRWS_Icon);
		waitForElementToAppear(WRWS_Heading);
		waitForElementClickable(scopelink);
		clickElement(scopelink);
		waitForElementClickable(technology_btn);
		jsClick(technology_btn);
		primaryAssesment = primaryTechnology.getAttribute("title");
		scroll("top");
		scrollToElement(PA_Tab);
		waitForElementClickable(PA_Tab);
		clickElement(PA_Tab);
		jsClick(Opp_Info);
		waitForElementToAppear(RDE_Song);
		if(RDE_Song.isDisplayed() && primaryAssesment.equalsIgnoreCase("ADOBE")) {
			jsClick(CLose_OITab);
			if(Start_assesment_SI_Category.isEnabled()) {
				logPass("User is able to View start assessment button enabled for SI RED is Song.");
				scenarioFlag = true;
			}
			else {
				logFail("User is not able to View start assessment button enabled.");
			}
		}
		else {
			logPass("RDE is not technology, so assessment is not available.");
		}
		scroll("top");
		
		if(scenarioFlag == true)
			scenarioPass();
	}



	/**
	 * TC_29: Validate on Preliminary screen no Assessment button is displayed for IMS deal
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author ganesh.kumar.majeti
	 * @throws Exception 
	 */
	public void validateStartAssesmentIMS(String Req_MMSId1) throws Exception {
		
		boolean scenarioFlag = false;
		ManageSAPage.navigatetoMMSID(Req_MMSId1);
		waitForElementClickable(preliminaryAssessmentLink);
		clickElement(preliminaryAssessmentLink);
		String SG = SG_Selected.getAttribute("title");
		if(SG.equals("IMS")) {
			if (isDisplayed(assesmentForIMS)) {
				logPass("User is able to see IMS assesment is not available");
				scenarioFlag = true;
			} else {
				logFail("User is not able to IMS assesment is not available");
			}
			}
		scroll("top");

		if(scenarioFlag == true)
			scenarioPass();
		}
	

	/**
	 * TC_30: Validate when Completed assessment and comes back to preliminary assessment page and clicks on refresh, screen is updated with latest details
	 * @since 29/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * @throws Exception
	 * 
	 */

	public void checkPremilinaryPage(String OppID_AMS_assessment) throws Exception {
		boolean scenarioFlag = true;
/*		ManageSaPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		opportunitiesPage = PageFactory.initElements(getDriver(), OpportunitiesPage.class);
		ManageSaPage.navigateToManage();
		clickElement(opportunitiesPage.TotalOpportunities);
		sendKeys(opportunitiesPage.FilterTextField, OppID_AMS_assessment);*/
		ManageSAPage.navigatetoMMSID(OppID_AMS_assessment);
	//	clickElement(opportunitiesPage.MmsIdText);
		clickElement(WRWSPremilinaryAssessmentButton);
		clickElement(WRWSViewAssessmentButton);
		switchToTab(1);
		clickElement(WRWSEditAssessmentButton);
		clickElement(WRWSEditAssessmentDropdownButton);
		clickElement(WRWSEditAssessmentDropdownNoButton);
		clickElement(WRWSEditAssessmentDropdownSaveButton);
		close();
		switchToTab(0);
		clickElement(WRWSRefreshButton);
		if(isDisplayed(WRWSAssesmentTaken) && isDisplayed(WRWSOutcome)) {
			logPass("user is able click on Refresh user should be able see latest Chnages on the screen");
			scenarioFlag = true;
		} else {
			logFail("user is not able click on Refresh user should be able see latest Chnages on the screen");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * TC_31: Validate user should be able to view 2 buttons Refresh and Continue onnPreliminary assessment page
	 * @since 27/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * @throws Exception
	 * 
	 */

	public void checkPremilinaryPageButton(String OppID_IMS_ServiceGroup) throws Exception {
		boolean scenarioFlag = true;
		jsClick(WRWSOpportunityBreadscrum);
		sendKeys(opportunitiesPage.FilterTextField, OppID_IMS_ServiceGroup);
		clickElement(opportunitiesPage.MmsIdText);
		clickElement(WRWSScopeButton);
		waitForElementToBeVisible(WRWSDeliveryCentreButton);
		clickElement(WRWSDeliveryCentreButton);
		waitForElementToBeVisible(WRWSDeliveryCentreContinueButton);
		clickElement(WRWSDeliveryCentreContinueButton);
		loader();
		if (isDisplayed(WRWSDeliveryCentreRefreshButton) && isDisplayed(WRWSDeliveryCentreContinueButton)) {
			logPass("user is able to view 2 buttons Refresh and Continue on Preliminary assessment page");
			scenarioFlag = true;
		} else {
			logFail("user is not able to view 2 buttons Refresh and Continue on Preliminary assessment page");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * TC_32: Validate when user clicks on Continue from Preliminary page user is navigated to Client context page
	 * @since 27/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * @throws Exception
	 * 
	 */

	public void checkClientContextPage() throws Exception {
		boolean scenarioFlag = true;
		loader();
		waitForElementToBeVisible(WRWSDeliveryCentreContinueButton);
		clickElement(WRWSDeliveryCentreContinueButton);
		loader();
		if (isDisplayed(WRWSClientContextButton)) {
			logPass("user is able to click on Continue from Preliminary page user is navigated to Client context page");
			scenarioFlag = true;
		} else {
			logFail("user is not able to click on Continue from Preliminary page user is navigated to Client context page");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * TC_33: Validate user is able to view 5 question on Client context page(Not mandatory to any SG)
	 * @since 27/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * @throws Exception
	 * 
	 */

	public void clientContextPage() throws Exception {
		boolean scenarioFlag = true;
		loader();
		waitForElementToBeVisible(WRWSClientContextQuestion1);
		if (isDisplayed(WRWSClientContextQuestion1) && isDisplayed(WRWSClientProcedureDrivenRadioButton)
				&& isDisplayed(WRWSClientBusinessDrivenRadioButton) && isDisplayed(WRWSClientITDrivenRadioButton)
				&& isDisplayed(WRWSClientOthersRadioButton) && isDisplayed(WRWSClientContextQuestion2Button)
				&& isDisplayed(WRWSClientRelationshipRadioButton) && isDisplayed(WRWSClientTrustedButton)
				&& isDisplayed(WRWSClientLimitedRadioButton) && isDisplayed(WRWSClientContextQuestion3Button)
				&& isDisplayed(WRWSClientTransformativeRadioButton) && isDisplayed(WRWSClientConsultingRadioButton)
				&& isDisplayed(WRWSClientOperationRadioButton) && isDisplayed(WRWSClientNoSpecificRadioButton)
				&& isDisplayed(WRWSClientOthersNewRadioButton) && isDisplayed(WRWSClientContextQuestion4Button)
				&& isDisplayed(WRWSClientYesRadioButton) && isDisplayed(WRWSClientNoRadioButton)
				&& isDisplayed(WRWSClientNotSureRadioButton) && isDisplayed(WRWSClientContextQuestion5Button)
				&& isDisplayed(WRWSClientNotPeopleRadioButton) && isDisplayed(WRWSClientLessThanRadioButton)
				&& isDisplayed(WRWSClient20RadioButton)) {
			logPass("user is able to view 5 question on Client context page(Not mandatory to any SG)");
			scenarioFlag = true;
		} else {
			logFail("user is not able to view 5 question on Client context page(Not mandatory to any SG)");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * TC_34: Validate when user clicks on Save without any changes alert message is displayed(Applies to all screens in WRWS)
	 * @since 28/03/2024
	 * @author shreyash.srivastava
	 * @return
	 * @throws Exception
	 * 
	 */

	public void alertMessage() throws Exception {
		boolean scenarioFlag = true;
		jsClick(WRWSClientSaveButton);
		if (isDisplayed(WRWSClientNoDataModifiedText)) {
			logPass("user is able to click on Save without any changes alert message is displayed(Applies to all screens in WRWS)");
			scenarioFlag = true;
		} else {
			logFail("user is not able to click on Save without any changes alert message is displayed(Applies to all screens in WRWS)");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	/**
	 * @author Sanjana Yesireddy
	 * @scenario 35-Validate user is able to view 3 buttons on Client context page
	 * @date - 25/03/2024
	 * 
	 */


	public void Button() throws Exception {
		boolean scenarioFlag=true; 
		loader();
		clickElement(Manage_btn);
		loader(); 
		clickElement(TotalOpportunities);
		sendKeys(Typeatexttofilter,"9990000014");
		clickElement(search); 
		clickElement(MMSID2);
		waitForElementToBeVisible(WRWS_ClientContextLink);
		clickElement(WRWS_ClientContextLink);
		isDisplayed(SaveBtn);
		isDisplayed(CancelBtn);
		isDisplayed(ContinueBtn);
		logPass("User should be able to view 3 buttons on client context page(Cancel, Save and Continue)"); }

	/**
	 * @author Sanjana Yesireddy
	 * @scenario 36-Validate When user clicks Continue on Client context page
	 * @date - 25/03/2024
	 * 
	 */


	public void ClientContext() throws Exception {

		clickElement(Manage_btn); 
		clickElement(TotalOpportunities);
		sendKeys(Typeatexttofilter,"9990000014");
		clickElement(search); 
		clickElement(MMSID2);
		waitForElementToBeVisible(WRWS_ClientContextLink);
		jsClick(WRWS_ClientContextLink);
		//loader();
		//waitForElementToBeVisible(btn_Continue);
		jsClick(ContinueBtn);
		//clickElement(ContinueBtn);

	}


	/**
	 * @author Sanjana Yesireddy
	 * @scenario 37-Validate user is able to view Summary details in Summary page
	 * @date - 26/03/2024
	 * 
	 */



	public void Summary() throws Exception {

		boolean scenarioFlag = true; 
		loader();
		clickElement(Manage_btn);
		clickElement(TotalOpportunities);
		//clickElement(MMSID);
		sendKeys(Typeatexttofilter,"9990000014");
		clickElement(search); 
		clickElement(MMSID2);
		loader();
		loader();
		clickElement(WRWS_Opportunityonpage);
		waitForElementToBeVisible(ProvidedetailsSolutionStrategy);
		clickElement(ProvidedetailsSolutionStrategy); 
		sendKeys(Enter_Answer,"abcd");
		clickElement(WRWS_Savebutton); 
		waitForElementToBeVisible(WRWS_Scope);
		clickElement(WRWS_Scope);
		waitForElementToBeVisible(Checkbox_ResaleIMS);
		jsClick(Checkbox_ResaleIMS); 
		jsClick(Checkbox_ResaleIMS); 
		clickElement(WRWS_ScopeSavebutton);
		waitForElementToBeVisible(WRWS_ClientContext);
		clickElement(WRWS_ClientContext);	
		waitForElementToBeVisible(Scope_ITDriven);
		//clickElement(btn_Continue);
		clickElement(WRWS_Summary); 
		boolean	isWRWS_SummaryOppDisplayed=isDisplayed(WRWS_SummaryOpp);
		boolean	isWRWS_SummaryCCDisplayed =isDisplayed(WRWS_SummaryCC); 
		boolean	isWRWS_SummaryScopeDisplayed =isDisplayed(WRWS_SummaryScope);
		if (isWRWS_SummaryOppDisplayed && isWRWS_SummaryCCDisplayed &&
				isWRWS_SummaryScopeDisplayed) 
		{
			logPass("All the details are present on Summary DashBoard");
			scenarioFlag=true; 
		}
		else {
			logFail("All the details are not present on Summary DashBoard"); }
		if(scenarioFlag == true)
		{ scenarioPass(); 
		} else { 
			scenarioFail(); 
		}
		waitForElementToBeVisible(OpportunityWorkFlowLink);
		clickElement(OpportunityWorkFlowLink); 
	}

	/**
	 * @author Sanjana Yesireddy
	 * @scenario 38-Validate user should be able to see workflow Enabled when
	 *           mandatory inputs are Completed.
	 * @date - 26/03/2024
	 * 
	 */



	public void WorkFlowEnabled() throws Exception { 
		boolean scenarioFlag = true;
		clickElement(Manage_btn);
		waitForElementToBeVisible(TotalOpportunities);
		clickElement(TotalOpportunities);
		sendKeys(Typeatexttofilter,"9990000014");
		clickElement(search); 
		clickElement(MMSID2);
		//clickElement(MMSID); 
		clickElement(WRWS_Opportunityonpage);
		clickElement(ContinueBtn);
		if(isDisplayed(EnableMessage)) {
			logPass("user should be able to see workflow Enabled when mandatory inputs are Completed."); 
		} else {
			logFail("user shouldnot be able to see workflow Enabled when mandatory inputs are Completed."); 
		} 
	} 

	/**
	 * @author Sanjana Yesireddy
	 * @scenario 39-Validate user should be able to see workflow disabled when
	 *           mandatory inputs are pending
	 * @date - 26/03/2024
	 * 
	 */


	public void PendingMessage() throws Exception { 
		boolean scenarioFlag = true;
		clickElement(Manage_btn);
		clickElement(TotalOpportunities);
		sendKeys(Typeatexttofilter,"9990000014");
		clickElement(search); 
		clickElement(MMSID2);
		//clickElement(MMSID);
		waitForElementToBeVisible(WRWS_Opportunityonpage);
		clickElement(WRWS_Opportunityonpage);
		clickElement(PricingStructure_Dropdown);
		clickElement(SelectAll);
		loader();
		clickElement(UnSelectAll); 
		clickElement(WRWS_Savebutton);
		if(isDisplayed(PendingMessage)) {
			logPass("mandatory Fields pending message is displayed:"); } 
		else {
			logFail("mandatory Fields pending message is not displayed."); 
		}} 

 
}