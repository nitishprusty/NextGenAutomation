package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import reusableComponents.ConfigFileReader;

public class WRWS_Page extends BasePage{
	
	Interim_Page interimPage = PageFactory.initElements(getDriver(), Interim_Page.class);
	
	Manage_SA_Page ManageSaPage;
	OpportunitiesPage opportunitiesPage;
	OpportunitiesWorkFlowPage opportunitiesWorkFlowPage;
	
	/********************************Locators************************************/
	
	//Sarthak
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

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Summary']")
	public WebElement Summary_Text;

	@FindBy(how = How.XPATH, using = "//label[contains(@class,'heading_styling')][text()='Primary Deal Arche Type ']")
	public WebElement PDAT_Icon;

	@FindBy(how = How.XPATH, using = "//label[contains(@class,'heading_styling')][text()='Secondary Deal Arche Type']")
	public WebElement SDAT_Icon;

	@FindBy(how = How.XPATH, using = "//label[contains(@class,'heading_styling')][text()=' Pricing Structure']")
	public WebElement PS_Icon;

	@FindBy(how = How.XPATH, using = "//label[contains(@class,'heading_styling')][text()='Submission Date ']")
	public WebElement SD_Icon;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Is Capco Opportunity']")
	public WebElement ICO_Icon;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Is CDE Tagged']")
	public WebElement ICT_Icon;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Is Solution Command Center Deal']")
	public WebElement ISCCD_Icon;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'d-inline-flex')][text()='List your client top 1-3 problems that this solution will address']")
	public WebElement Ques_1;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'d-inline-flex')][text()='What results will the client achieve by proceeding with this deal? Clearly articulate the value which client will realize (Value is in Million)']")
	public WebElement Ques_2;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'d-inline-flex')][text()='How will we help client solve their business problem and bring value to them. Provide a concise explanation of the deal we are proposing']")
	public WebElement Ques_3;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'d-inline-flex')][text()='Provide details around Competitors']")
	public WebElement Ques_4;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'d-inline-flex')][text()='Provide details Solution Strategy']")
	public WebElement Ques_5;

	@FindBy(how = How.XPATH, using = "//button[@id='OppCancel']")
	public WebElement Cancel_Btn;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveBtnNew']")
	public WebElement Save_Btn;

	/*@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue']")
	public WebElement Continue_Btn;*/

	@FindBy(how = How.XPATH, using = "//div[contains(@data-target,'#collapseQuestion47')]//img[contains(@class,'acc__img float-right')][contains(@title,'Click to expand')]")
	public WebElement Q1_Expand;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-target,'#collapseQuestion48')]//img[contains(@class,'acc__img float-right')][contains(@title,'Click to expand')]")
	public WebElement Q2_Expand;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-target,'#collapseQuestion49')]//img[contains(@class,'acc__img float-right')][contains(@title,'Click to expand')]")
	public WebElement Q3_Expand;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-target,'#collapseQuestion50')]//img[contains(@class,'acc__img float-right')][contains(@title,'Click to expand')]")
	public WebElement Q4_Expand;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-target,'#collapseQuestion51')]//img[contains(@class,'acc__img float-right')][contains(@title,'Click to expand')]")
	public WebElement Q5_Expand;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-target,'#collapseQuestion47')]//img[contains(@class,'acc__img float-right')][contains(@title,'Click to collapse')]")
	public WebElement Q1_Collapse;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-target,'#collapseQuestion48')]//img[contains(@class,'acc__img float-right')][contains(@title,'Click to collapse')]")
	public WebElement Q2_Collapse;

	@FindBy(how = How.XPATH, using = "//textarea[contains(@class,'mmsanswer_txt1')]")
	public WebElement Q1_TextArea;

	@FindBy(how = How.XPATH, using = "//span[@class='accordion__count countnumber'][text()='1']")
	public WebElement Ques_Number;

	@FindBy(how = How.XPATH, using = "//div[@data-target='#collapseQuestion47']//span[@class='accordion__count']")
	public WebElement Q1_TickMark;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAssessment']")
	public WebElement Start_assesment_SI_Category;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Preliminary Assessment']")
	public WebElement PA_Tab;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtRDE']")
	public WebElement RDE_Type;
	
	//Ashish
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Scope')]")
	public WebElement WrwsScope;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Scope')]")
	public WebElement WrwsScopeText;
	
	@FindBy(how = How.XPATH, using = "//button[@id='Servicesbtn']")
	public WebElement ServicesTabBtn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='Technologybtn']")
	public WebElement TechnologyTabBtn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='DeliveryCenterbtn']")
	public WebElement DeliveryCenterTabBtn;
	
	@FindBy(how = How.XPATH, using = "//label[@id='lblAMS']")
	public WebElement AmsTab;
	
	@FindBy(how = How.XPATH, using = "//label[@id='lblSI']")
	public WebElement SiTab;
	
	@FindBy(how = How.XPATH, using = "//label[@id='lblBPO']")
	public WebElement BpoTab;
	
	@FindBy(how = How.XPATH, using = "//label[@id='lblIMS']")
	public WebElement ImsTab;

	@FindBy(how = How.XPATH, using = "//label[@id='lblCON']")
	public WebElement ConTab;
	
	@FindBy(how = How.XPATH, using = "//div[@id='AMSEnableDisable']")
	public WebElement AmsBox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='SIEnableDisable']")
	public WebElement SiBox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='BPOEnableDisable']")
	public WebElement BpoBox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='IMSEnableDisable']")
	public WebElement ImsBox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='CONEnableDisable']")
	public WebElement ConBox;
	
	@FindBy(how = How.XPATH, using = "//img[@id='commentsAO']")
	public WebElement AmsCommentBox;
	
	@FindBy(how = How.XPATH, using = "//img[@id='commentsSI']")
	public WebElement SiCommentBox;
	
	@FindBy(how = How.XPATH, using = "//img[@id='commentsBPO']")
	public WebElement BpoCommentBox;
	
	@FindBy(how = How.XPATH, using = "//img[@id='commentsIMS']")
	public WebElement ImsCommentBox;
	
	@FindBy(how = How.XPATH, using = "//img[@id='commentsCON']")
	public WebElement ConCommentBox;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='commentsText']")
	public WebElement AmsTextAreaField;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='commentsTextSI']")
	public WebElement SiTextAreaField;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='commentsTextBPO']")
	public WebElement BpoTextAreaField;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='commentsTextIMS']")
	public WebElement ImsTextAreaField;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='commentsTextCON']")
	public WebElement ConTextAreaField;
	
	@FindBy(how = How.XPATH, using = "//button[@id='saveCommentsAO']")
	public WebElement AmsCommentBoxSaveBtn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='saveCommentsSI']")
	public WebElement SiCommentBoxSaveBtn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='saveCommentsBOP']")
	public WebElement BpoCommentBoxSaveBtn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='saveCommentsIMS']")
	public WebElement ImsCommentBoxSaveBtn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='saveCommentsCON']")
	public WebElement ConCommentBoxSaveBtn;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='boxShadow']/tbody/tr[last()]/td)[1]")
	public WebElement AmsCommentHistory;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='boxShadow']/tbody/tr[last()]/td)[4]")
	public WebElement SiCommentHistory;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='boxShadow']/tbody/tr[last()]/td)[7]")
	public WebElement ImsCommentHistory;

	@FindBy(how = How.XPATH, using = "(//table[@class='boxShadow']/tbody/tr[last()]/td)[13]")
	public WebElement ConCommentHistory;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ViewCommentsDetail']//button[@id='OLCancelBtn']")
	public WebElement AmsCommentBoxCancelBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ViewCommentsDetailSI']//button[@id='OLCancelBtn']")
	public WebElement SiCommentBoxCancelBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ViewCommentsDetailsBPO']//button[@id='OLCancelBtn']")
	public WebElement BpoCommentBoxCancelBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ViewCommentsDetailIMS']//button[@id='OLCancelBtn']")
	public WebElement ImsCommentBoxCancelBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ViewCommentsDetailCON']//button[@id='OLCancelBtn']")
	public WebElement ConCommentBoxCancelBtn;
	
	//Shreya
	@FindBy(how = How.XPATH, using = "//li[@id='360Diagnostics']/span")
	public WebElement scopeTab;

	@FindBy(how = How.XPATH, using = "//button[@id='Servicesbtn']")
	public WebElement serviceTab;

	@FindBy(how = How.XPATH, using = "//button[@id='ScopeCancel' and @title='Cancel']")
	public WebElement cancleTab;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveBtnScope' and @title='Save']")
	public WebElement saveTab;

	@FindBy(how = How.XPATH, using = "//app-inner-layout//div[2]/button[3]")
	public WebElement continueTab;

	@FindBy(how = How.XPATH, using = "//button[@id='Technologybtn']")
	public WebElement technologyTab;

	@FindBy(how = How.XPATH, using = "//ul[@class='scope-tile-list']//li//input")
	public List<WebElement> selectDeselect;

	@FindBy(how = How.XPATH, using = "(//ul[@class='scope-tile-list']//span)[1]")
	public WebElement check;

	@FindBy(how = How.XPATH, using = "(//ul[@class='scope-tile-list']//span)[1]//input")
	public WebElement selectedValue;

	@FindBy(how = How.XPATH, using = "//div[@id='Services']//div[contains(@class,'title_header')]/..")
	public List<WebElement> AllSGNamesDisableOrNot;

	@FindBy(how = How.XPATH, using = "//div[@id='Services']//div[contains(@class,'title_header')]//input")
	public List<WebElement> AllSGNamesClicks;

	@FindBy(how = How.XPATH, using = "//div[@id='SelectServiceGroup']//button[@id='SG']")
	public WebElement SGValue;

	@FindBy(how = How.XPATH, using = "//a[text()='Opportunity Workflow']")
	public WebElement OppWorkFlow;

	@FindBy(how = How.XPATH, using = "//div[@role='listbox']//mat-option ")
	public List<WebElement> SGNamesDropDown;

	@FindBy(how = How.XPATH, using = "//a[text()='Scope']")
	public WebElement scopOpp;

	@FindBy(how = How.XPATH, using = "//a[@id='opp']//span")
	public WebElement OPPTAB;

	@FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-1']//span//span")
	public WebElement serviceGroupNameSelect;

	@FindBy(how = How.XPATH, using = "//div[@id='cdk-overlay-0']//span[contains(text(),'AMS')]")
	public WebElement AMSvalue;

	@FindBy(how = How.XPATH, using = "//div[@id='cdk-overlay-0']//span[contains(text(),'SI')]")
	public WebElement SIvalue;

	@FindBy(how = How.XPATH, using = "//button[@id='SG']")
	public WebElement DealsSG;

	@FindBy(how = How.XPATH, using = "//button[@id='SG' and contains(@title,'AMS')]")
	public WebElement DealsSGAMS;

	@FindBy(how = How.XPATH, using = "//button[@id='SG' and contains(@title,'SI')]")
	public WebElement DealsSGSI;

	@FindBy(how = How.XPATH, using = "//div[@id='AMSTechEnableDisable']")
	public WebElement AMSTab;

	@FindBy(how = How.XPATH, using = "//div[@id='SITechEnableDisable']")
	public WebElement SITab;

	@FindBy(how = How.XPATH, using = "//div[@id='MappingsChangeCheck']//div//img")
	public WebElement PopupLogo;

	@FindBy(how = How.XPATH, using = "//div[@id='MappingsChangeCheck']//div//button[2]")
	public WebElement DiscardAndContinue;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement search_filter;

	@FindBy(how = How.XPATH, using = "//a[text()='What Are We Solving For']")
	public WebElement whatAreWeSolvingTile;
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'Scope']")
	public WebElement Scope_Link;

	@FindBy(how = How.XPATH, using = "//*[@id='360Diagnostics']//span")
	public WebElement Scope_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='Technologybtn']")
	public WebElement Technology_Subtab;

	@FindBy(how = How.XPATH, using = "//*[@id='AMSTechEnableDisable']")
	public WebElement TechAMS_Section;

	// custom

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'CustomId2']//span[@class = 'dropdown-btn']")
	public WebElement TechScopeCustomDropdown_Btn;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'CustomId2']")
	public WebElement TechScopeCustom_Field;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'CustomId2']//li[@class = 'filter-textbox']//input")
	public WebElement TechScopeCustomFilter_InputField;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'CustomId2']//li[@class = 'multiselect-item-checkbox']//div")
	public WebElement TechScopeCustomDropdown_Checkbox;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'CustomId2']//ng-multiselect-dropdown[@id = 'ddCustom']")
	public WebElement TechScopeCustom_DataContainer;

	// ERP

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'ERPId2']//span[@class = 'dropdown-btn']")
	public WebElement TechScopeERPDropdown_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='labelCustom']/..//div[@id = 'ERPId2']")
	public WebElement TechScopeERP_Field;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'ERPId2']//li[@class = 'filter-textbox']//input")
	public WebElement TechScopeERPFilter_InputField;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'ERPId2']//li[@class = 'multiselect-item-checkbox']//div")
	public WebElement TechScopeERPDropdown_Checkbox;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'ERPId2']//ng-multiselect-dropdown[@id = 'ddERP']")
	public WebElement TechScopeERP_DataContainer;

	@FindBy(how = How.XPATH, using = "//*[@id='isValid']")
	public WebElement TechAlert_Sec;

	@FindBy(how = How.XPATH, using = "//*[@id='SaveBtnScope']")
	public WebElement TechSave_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='IMSTechEnableDisable']/..//div[contains(@class,'form-group')]")
	public WebElement TechIMSData_Sec;

	@FindBy(how = How.XPATH, using = "//div[@id = 'BPMSTechEnableDisable']/..//div[contains(@class,'form-group')]")
	public WebElement TechBPMSData_Sec;

	@FindBy(how = How.XPATH, using = "//div[@id = 'CONTechEnableDisable']/..//div[contains(@class,'form-group')]")
	public WebElement TechSCCONData_Sec;

	@FindBy(how = How.XPATH, using = "//*[@id='SG']")
	public WebElement ServiceGroup;

	@FindBy(how = How.XPATH, using = "//*[@id='commentsTechAMS']")
	public WebElement TechAMSComment_Icon;

	@FindBy(how = How.XPATH, using = "//*[@id='commentsTechSI']")
	public WebElement TechSIComment_Icon;

	@FindBy(how = How.XPATH, using = "//*[@id='TechViewCommentsDetailSI']/div/div")
	public WebElement TechSIComment_Popup;

	@FindBy(how = How.XPATH, using = "//*[@id='TechViewCommentsDetail']/div/div")
	public WebElement TechAMSComment_Popup;

	@FindBy(how = How.XPATH, using = "//*[@id='TechViewCommentsDetail']//button//span")
	public WebElement TechCommentPopUp_Close;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'CustomId2']//li[@class = 'multiselect-item-checkbox']//div")
	public List<WebElement> TechCustomDropdownOptions;

	@FindBy(how = How.XPATH, using = "//label[@id = 'labelCustom']/..//div[@id = 'ERPId2']//li[@class = 'multiselect-item-checkbox']//div")
	public List<WebElement> TechERPDropdownOptions;

	@FindBy(how = How.XPATH, using = "//button[text() = 'Continue']")
	public WebElement Continue_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='DeliveryCenterbtn']")
	public WebElement DeliveryCenter_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='AMSDCEnableDisable']//div[@id = 'ADHeadingId']//label")
	public WebElement DCAMS_Label;

	@FindBy(how = How.XPATH, using = "//*[@id='AMSbtnDealTypeoptions']")
	public WebElement DCAMSOpportunityType_Field;

	@FindBy(how = How.XPATH, using = "//*[@id='AMSPrimarydeliveryId']")
	public WebElement DCAMSPrimaryDeliveryCenter_Field;

	@FindBy(how = How.XPATH, using = "//*[@id='ddlADC']")
	public WebElement DCAMSAdditionalDeliveryCenter_Field;

	@FindBy(how = How.XPATH, using = "//div[@id = 'SIDCEnableDisable']//div[@id = 'SIHeadingId']//label")
	public WebElement DCSI_Label;

	@FindBy(how = How.XPATH, using = "//*[@id='SIOpportunityType']")
	public WebElement DCSIOppType_Field;

	@FindBy(how = How.XPATH, using = "//*[@id='SIPrimaryDeliveryCentre']")
	public WebElement DCSIPrimaryDeliveryCenter_Field;

	@FindBy(how = How.XPATH, using = "//*[@id='SIAddtitionalDeliveryCentres']")
	public WebElement DCSIAdditionalDeliveryCenter_Field;

	@FindBy(how = How.XPATH, using = "//*[@id='IMSDCEnableDisable']//div[@id = 'IMSHeadingId']//label")
	public WebElement DCIMS_Label;

	@FindBy(how = How.XPATH, using = "//*[@id='IMSOpportunityType']")
	public WebElement DCIMSOppType_Field;

	@FindBy(how = How.XPATH, using = "//*[@id='IMSDeliveryCentres']")
	public WebElement DCIMSPrimaryDeliveryCenter_Field;

	@FindBy(how = How.XPATH, using = "//*[@id='IMSAddtitionalDeliveryCentres']")
	public WebElement DCIMSAdditionalDeliveryCenter_Field;

	@FindBy(how = How.XPATH, using = "//*[@id='BPMSDCEnableDisable']//label[@id='lblTechBPMS']")
	public WebElement DCBPMS_Label;

	@FindBy(how = How.XPATH, using = "//*[@id='CONDCEnableDisable']//label[@id = 'lblTechCON']")
	public WebElement DCConsulting_Label;

	@FindBy(how = How.XPATH, using = "//*[@id='AMSDCEnableDisable']")
	public WebElement DCAMS_Section;

	@FindBy(how = How.XPATH, using = "//*[@id='SIDCEnableDisable']")
	public WebElement DCSI_Section;

	@FindBy(how = How.XPATH, using = "//*[@id='IMSDCEnableDisable']")
	public WebElement DCIMS_Section;
	
	@FindBy(how = How.XPATH, using = "//*[@id='opp']/span")
	public WebElement Opp_Link;


	/********************************Methods*************************************/
	
	/**
	 * TC_1: Validate that user is able to View Opportunity on a page with all the steppers.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author sarthak.gautam
	 */

	public void validateSteppers(String Req_MMSId) throws Exception {

		boolean scenarioFlag = false;
		//ManageSAPage.navigatetoMMSID(Req_MMSId);
		opportunitiesWorkFlowPage = PageFactory.initElements(getDriver(), OpportunitiesWorkFlowPage.class);
		opportunitiesWorkFlowPage.navigateToMMSID(Req_MMSId);

		//Validating whether user is able to View Opportunity on a page with all the steppers
		waitForElementToAppear(WRWS_Icon);
		jsClick(WRWS_Icon);
		waitForElementToAppear(WRWS_Heading);
		if(OOAP_Text.isDisplayed() && Scope_Text.isDisplayed() && PA_Text.isDisplayed() && CC_Text.isDisplayed() && Summary_Text.isDisplayed()) {
			logPass("The expected steppers are displayed on the opportunity of the page.");
			scenarioFlag = true;
		}
		else {
			logFail("The expected steppers are not displayed on the opportunity of the page.");
		}

		if (scenarioFlag == true)
			scenarioPass();
	}


	/**
	 * TC_2: Validate that user is able to View Deal details on Opportunity on a page.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author sarthak.gautam
	 */

	public void validateViewDeal() {

		boolean scenarioFlag = false;

		//Validating whether user is able to View Deal details on Opportunity on a page
		if(PDAT_Icon.isDisplayed() && SDAT_Icon.isDisplayed() && PS_Icon.isDisplayed() && SD_Icon.isDisplayed() && ICO_Icon.isDisplayed() && ICT_Icon.isDisplayed() && ISCCD_Icon.isDisplayed()) {
			logPass("The required fields are getting displayed on Deal details on Opportunity on a page.");
			scenarioFlag = true;
		}
		else {
			logFail("The required fields are not getting displayed on Deal details on Opportunity on a page.");
		}

		if (scenarioFlag == true)
			scenarioPass();
	}


	/**
	 * TC_3: Validate that user is able to view 5 Questionnaire on Opportunity on a page.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author sarthak.gautam
	 */

	public void validateQuestionnaire() {

		boolean scenarioFlag = false;

		//Validating whether user is able to view 5 Questionnaire on Opportunity on a page
		if(Ques_1.isDisplayed() && Ques_2.isDisplayed() && Ques_3.isDisplayed() && Ques_4.isDisplayed() && Ques_5.isDisplayed()) {
			logPass("5 Questions are getting displayed on opportunity on as page.");
			scenarioFlag = true;
		}
		else {
			logFail("5 Questions are not getting displayed on opportunity on as page.");
		}

		if (scenarioFlag == true)
			scenarioPass();
	}


	/**
	 * TC_4: Validate that user is able to view Tick mark/number for Questions on Opportunity on a page.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author sarthak.gautam
	 */

	public void validateQuesNumber() {

		boolean flag1 = false, scenarioFlag = false;

		//Validating whether user is able to view Tick mark/number for Questions on Opportunity on a page
		jsClick(Ques_1);
		waitForElementToAppear(Q1_TextArea);
		String answer = Q1_TextArea.getAttribute("value");
		
		if(answer.isEmpty()) {
			if(Ques_Number.isDisplayed()) {
				flag1 = true;
				logInfo("Answer is empty, and the question number is getting displayed.");
			}
			else {
				logInfo("Answer is empty, and the question number is not getting displayed");
			}
		}
		else {
			if(Q1_TickMark.isDisplayed()) {
				flag1 = true;
				logInfo("Answer is not empty, and the tick mark is getting displayed.");
			}
			else {
				logInfo("Answer is not empty, and the tick mark is not getting displayed");
			}
		}

		if(flag1 == true) {
			logPass("When a answer is displayed from MMS, question is displayed with a tick mark \r\n"
					+ "When there is no answer from MMS, question number is displayed.");
			scenarioFlag = true;
		}
		else {
			logFail("When a answer is displayed from MMS, question is not displayed with a tick mark \r\n"
					+ "When there is no answer from MMS, question number is not displayed.");
		}
		
		if (scenarioFlag == true)
			scenarioPass();

		jsClick(Ques_1);
	}


	/**
	 * TC_5: Validate that user is able to view Accordian for all Questions on Opportunity on a page.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author sarthak.gautam
	 */

	public void validateAccordian() {

		boolean scenarioFlag = false, flag1 = false, flag2 = false;

		//Validating whether user is able to view Accordian for all Questions on Opportunity on a page
		waitForElementToAppear(Ques_1);
		if(Q1_Expand.isDisplayed() && Q2_Expand.isDisplayed() && Q3_Expand.isDisplayed() && Q4_Expand.isDisplayed() && Q5_Expand.isDisplayed()) {
			flag1 = true;
		}

		jsClick(Ques_1);
		waitForElementToAppear(Q1_Collapse);
		jsClick(Ques_2);
		waitForElementToAppear(Q2_Collapse);
		if(Q2_Collapse.isDisplayed() && Q1_Expand.isDisplayed()) {
			flag2 = true;
		}

		if(flag1 == true && flag2 == true) {
			logPass("When one question is expanded other accordian is closed. \r\n"
					+ "Expand and collapse for all 5 questions are disaplyed.");
			scenarioFlag = true;
		}
		else {
			logFail("The accordian and the expand-collapse function are not working properly");
		}

		if (scenarioFlag == true)
			scenarioPass();

		jsClick(Ques_2);
	}


	/**
	 * TC_6: Validate that user is able to View 3 Buttons on Opportunity on a page.
	 * 
	 * @since 25/03/2024
	 * 
	 * @release March 29
	 * 
	 * @author sarthak.gautam
	 */

	public void validateButtons() {

		boolean scenarioFlag = false;

		//Validating whether user is able to View 3 Buttons on Opportunity on a page
		if(Cancel_Btn.isDisplayed() && Save_Btn.isDisplayed() && Continue_Btn.isDisplayed()) {
			logPass("3 buttons are getting displayed on Opprtunity on a page: \r\n"
					+ "Cancel, Save and Continue.");
			scenarioFlag = true;
		}
		else {
			logFail("3 buttons are not getting displayed on Opprtunity on a page \r\n"
					+ "Cancel, Save and Continue.");
		}
		
		if (scenarioFlag == true)
			scenarioPass();
	}
	
	/**
	 * TC_07: Validate that user is able to view Scope tab when clicked on 
	 * continue from opportunity on a page
	 * @since 29/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void scopeTab(String OppID_WRWS) throws Exception {
		
		opportunitiesWorkFlowPage = PageFactory.initElements(getDriver(), OpportunitiesWorkFlowPage.class);
		boolean scenarioFlag = true;

		opportunitiesWorkFlowPage.navigateToMMSID(OppID_WRWS);
		
		waitForElementClickable(WrwsScope);
		clickElement(WrwsScope);
		
		boolean scopeTitle = isDisplayed(WrwsScopeText);
		
		if(scopeTitle) {
			logPass("User is able to view Scope tab once clicked on continue on opportunity tab");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to view Scope tab once clicked on continue on opportunity tab");
			scenarioFlag = false;
		}
		
		if(scenarioFlag == true)
			scenarioPass();
	}
	
	/**
	 * TC_08: Validate that user is able to view 3 sub menus on Scope tab
	 * @since 29/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void subTabsMenu() throws Exception {
		boolean scenarioFlag = true;
		
		waitForElementClickable(ServicesTabBtn);
		clickElement(ServicesTabBtn);
		boolean servicesTitle = isDisplayed(ServicesTabBtn);
		
		waitForElementClickable(TechnologyTabBtn);
		clickElement(TechnologyTabBtn);
		boolean technologyTitle = isDisplayed(TechnologyTabBtn);
		
		waitForElementClickable(DeliveryCenterTabBtn);
		clickElement(DeliveryCenterTabBtn);
		boolean DCTitle = isDisplayed(DeliveryCenterTabBtn);
		
		if(servicesTitle && technologyTitle && DCTitle) {
			logPass("User is able to view 3 sub menus on Scope tab");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to view 3 sub menus on Scope tab");
			scenarioFlag = false;
		}
		
		if(scenarioFlag == true)
			scenarioPass();
	}
	
	/**
	 * TC_09: Validate that user is able to view 5 Sub services under Services tab
	 * @since 29/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void servicesSubTabs() throws Exception {
		
		Boolean scenarioFlag = true;
		//waitForElementClickable(ServicesTabBtn);
		//clickElement(ServicesTabBtn);
		
		Boolean AmsTitle = isDisplayed(AmsTab);
		Boolean SiTitle = isDisplayed(SiTab);
		Boolean BpoTitle = isDisplayed(BpoTab);
		Boolean ImsTitle = isDisplayed(ImsTab);
		Boolean ConTitle = isDisplayed(ConTab);
		
		if(AmsTitle && SiTitle && BpoTitle && ImsTitle && ConTitle) {
			logPass("User is able to view below 5 Sub servies under Scope tab (AMS, SI, BPMS, IMS, SC/CON)");
			scenarioFlag = true;
		}
		else {
			logFail("User is not able to view below 5 Sub servies under Scope tab (AMS, SI, BPMS, IMS, SC/CON)");
			scenarioFlag = false;
		}
		
		if(scenarioFlag == true)
			scenarioPass();
		
	}
	
	/**
	 * TC_10: Validate that user is able to view 5 Sub services under Services tab
	 * @since 29/03/2024
	 * @author Ageeru Ashish
	 * @return
	 * 
	 */
	public void addComment() throws Exception {
		Boolean scenarioFlag = true;
		String commentInAMSTable = "",commentInSiTable = "", commentInBpoTable = "", commentInImsTable = "", commentInConTable = "";
		String comments = "Test123";
		
		String AmsBoxStatus = AmsBox.getAttribute("class");
		logInfo(AmsBoxStatus);
		if(!AmsBoxStatus.contains("disabled")) {
			waitForElementClickable(AmsCommentBox);
			//clickElement(AmsCommentBox);
			jsClick(AmsCommentBox);
			
			
			sendKeys(AmsTextAreaField, comments);
			waitForElementClickable(AmsCommentBoxSaveBtn);
			clickElement(AmsCommentBoxSaveBtn);
			
			waitForElementToAppear(AmsCommentHistory);
			commentInAMSTable = AmsCommentHistory.getText();
			logInfo(commentInAMSTable);
			
			waitForElementClickable(AmsCommentBoxCancelBtn);
			jsClick(AmsCommentBoxCancelBtn);
			
			if(commentInAMSTable.equals(comments)) {
				logPass("User is able to add comment for AMS SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = true;
			}
			else {
				logFail("User is not able to add comment for AMS SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = false;
			}
		}
		else {
			logInfo("AMS Comment Box is disabled");
		}
		
		scrollToElement(SiCommentBox);
		
		String SiBoxStatus = SiBox.getAttribute("class");
		logInfo(SiBoxStatus);
		if(!SiBoxStatus.contains("disabled")) {
			waitForElementClickable(SiCommentBox);
			clickElement(SiCommentBox);
			
			
			sendKeys(SiTextAreaField, comments);
			waitForElementClickable(SiCommentBoxSaveBtn);
			clickElement(SiCommentBoxSaveBtn);
			
			waitForElementToAppear(SiCommentHistory);
			commentInSiTable = SiCommentHistory.getText();
			logInfo(commentInSiTable);
			
			waitForElementClickable(SiCommentBoxCancelBtn);
			jsClick(SiCommentBoxCancelBtn);
			
			if(commentInSiTable.equals(comments)) {
				logPass("User is able to add comment for SI SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = true;
			}
			else {
				logFail("User is not able to add comment for SI SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = false;
			}
		}
		else {
			logInfo("SI Comment Box is disabled");
		}
		
		scrollToElement(BpoCommentBox);
		
		String BpoBoxStatus = BpoBox.getAttribute("class");
		logInfo(BpoBoxStatus);
		if(!BpoBoxStatus.contains("disabled")) {
			waitForElementClickable(BpoCommentBox);
			clickElement(BpoCommentBox);
			
			
			sendKeys(BpoTextAreaField, comments);
			waitForElementClickable(BpoCommentBoxSaveBtn);
			clickElement(BpoCommentBoxSaveBtn);
			
			waitForElementToAppear(ImsCommentHistory);
			commentInBpoTable = ImsCommentHistory.getText();
			logInfo(commentInBpoTable);
			
			waitForElementClickable(BpoCommentBoxCancelBtn);
			jsClick(BpoCommentBoxCancelBtn);
			
			if(commentInBpoTable.equals(comments)) {
				logPass("User is able to add comment for BPO SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = true;
			}
			else {
				logFail("User is not able to add comment for BPO SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = false;
			}
		}
		else {
			logInfo("BPO Comment Box is disabled");
		}
		
		scrollToElement(ImsCommentBox);
		
		String ImsBoxStatus = ImsBox.getAttribute("class");
		logInfo(ImsBoxStatus);
		if(!ImsBoxStatus.contains("disabled")) {
			waitForElementClickable(ImsCommentBox);
			clickElement(ImsCommentBox);
			
			
			sendKeys(ImsTextAreaField, comments);
			waitForElementClickable(ImsCommentBoxSaveBtn);
			clickElement(ImsCommentBoxSaveBtn);
			
			waitForElementToAppear(ImsCommentHistory);
			commentInImsTable = ImsCommentHistory.getText();
			logInfo(commentInImsTable);
			
			waitForElementClickable(ImsCommentBoxCancelBtn);
			jsClick(ImsCommentBoxCancelBtn);
			
			if(commentInImsTable.equals(comments)) {
				logPass("User is able to add comment for IMS SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = true;
			}
			else {
				logFail("User is not able to add comment for IMS SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = false;
			}
			
		}
		else {
			logInfo("IMS Comment Box is disabled");
		}
		
		scrollToElement(ConCommentBox);
		
		String ConBoxStatus = ConBox.getAttribute("class");
		logInfo(ConBoxStatus);
		if(!ConBoxStatus.contains("disabled")) {
			waitForElementClickable(ConCommentBox);
			clickElement(ConCommentBox);
			
			
			sendKeys(ConTextAreaField, comments);
			waitForElementClickable(ConCommentBoxSaveBtn);
			clickElement(ConCommentBoxSaveBtn);
			
			waitForElementToAppear(ConCommentHistory);
			commentInConTable = ConCommentHistory.getText();
			logInfo(commentInConTable);
			
			waitForElementClickable(ConCommentBoxCancelBtn);
			jsClick(ConCommentBoxCancelBtn);
			
			if(commentInConTable.equals(comments)) {
				logPass("User is able to add comment for CON SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = true;
			}
			else {
				logFail("User is not able to add comment for CON SG "
						+ "(Comment popup should be displayed with all comment history)");
				scenarioFlag = false;
			}
			
		}
		else {
			logInfo("CON Comment Box is disabled");
		}
		
		if(scenarioFlag == true)
			scenarioPass();
		
	}
	
	/**
	 * @author shreya.sharad.jadhav
	 * @scenario -TC 11: Validate that user is able to select or deselect Sub
	 *           services.
	 * @date - 27/03/2024
	 * @release April 1
	 * 
	 */
	public void selectDeselectSG(String MMSID) throws Exception {
		
		opportunitiesWorkFlowPage = PageFactory.initElements(getDriver(), OpportunitiesWorkFlowPage.class);
		opportunitiesWorkFlowPage.navigateToMMSID(MMSID);

		boolean scenarioFlag = false;
		
		waitForElementClickable(WrwsScope);
		clickElement(WrwsScope);
		
		waitForElementClickable(scopeTab);
		clickElement(scopeTab);
		//waitForElementToAppear(serviceTab);
		waitForElementToBeVisible(serviceTab);

		// for(WebElement select:selectDeselect) {
		for (int i = 0; i < 1; i++) {
			// if(!select.getAttribute("class").equals("disabled"))
			if (!selectDeselect.get(i).getAttribute("class").equals("disabled")) {
				// clickElement(check);
				clickElement(selectDeselect.get(i));
				logPass("User should be able to select  SGs which is not from MMS(selected while creating a deal)");
				String id = selectDeselect.get(i).getAttribute("id");
				clickElement(getDriver().findElement(By.xpath("//input[@id='" + id + "']/..")));
				logPass("User should be able to Deselect  SGs which is not from MMS(selected while creating a deal)");
				scenarioFlag = true;
			}
		}
		if (scenarioFlag == false) {
			logFail("User is not able to select or Deselect  SGs which is not from MMS(selected while creating a deal)");
		} else {
			scenarioPass();
		}
	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario -TC 12: Validate user is able to select all SGs with select all
	 *           checkbox.
	 * @date - 27/03/2024
	 * @release April 1
	 * 
	 */
	public void selectAllSG(String MMSID) throws Exception {

		boolean scenarioFlag = true;
		waitForElementToAppear(serviceTab);
		waitForElementToBeVisible(serviceTab);
		for (int i = 0; i < AllSGNamesClicks.size(); i++) {
			if ((AllSGNamesDisableOrNot.get(i).getAttribute("class").contains("service__tile"))) {
				clickElement(AllSGNamesClicks.get(i));
				logPass("User is able to see select all checkbox next to the SG name");
			}

			else {
				logFail("User is uable to see select all checkbox next to the SG name");
				scenarioFlag = false;

			}
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario -TC 13: Validate that user is able to View 3 Buttons on Scope page.
	 * @date - 27/03/2024
	 * @release April 1
	 * 
	 */
	public void scopTabButtonCheck(String MMSID) throws Exception {
		boolean scenarioFlag = true;
		waitForElementToBeVisible(scopeTab);
		if (cancleTab.isDisplayed() && saveTab.isDisplayed() && continueTab.isDisplayed()) {
			logPass("User should be able to see 3 buttons on scope page: Cancle, Save and Continue");
		} else {
			logFail("User should not be able to see 3 buttons on scope page: Cancle, Save and Continue");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario -TC 14: Validate when user clicks on Continue, Technology tab is
	 *           displayed.
	 * @date - 28/03/2024
	 * @release April 1
	 * 
	 */
	public void navigateToTechnologyTab() throws Exception {
		boolean scenarioFlag = true;
		waitForElementToAppear(serviceTab);
		waitForElementToBeVisible(continueTab);
		clickElement(continueTab);
		if (technologyTab.isDisplayed()) {
			logPass("User is successfully navigated to Technology Tab from service tab");
		} else {
			logFail("User is unable to navigate to Technology Tab from service tab");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario -TC 15: Validate when user Navigates to Technology tab AMS/SI
	 *           details are displayed.
	 * @date - 28/03/2024
	 * @release April 1
	 * 
	 */
	public void AMSandSIValidation() throws Exception {
		boolean scenarioFlag = true;
		waitForElementToBeVisible(AMSTab);
		waitForElementToBeVisible(SITab);
		if (isDisplayed(AMSTab) && isDisplayed(SITab)) {
			logPass("User is able to view AMS and SI details under technology tab");
		} else {
			logFail("User is able to view AMS and SI details under technology tab");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

	}

	public void Oppp(String MMSID) throws Exception {

		waitForElementToBeVisible(OPPTAB);
		clickElement(OPPTAB);
		waitForElementToBeVisible(PopupLogo);
		waitForElementToBeVisible(DiscardAndContinue);
		clickElement(DiscardAndContinue);
		waitForElementToBeVisible(OPPTAB);
		clickElement(OPPTAB);
		waitForElementToBeVisible(search_filter);
		sendKeys(search_filter, MMSID);
		clickElement(getDriver().findElement(By.xpath("//div[@class='MMSID']//div[contains(text(),'" + MMSID + "')]")));
		waitForElementToAppear(whatAreWeSolvingTile);
		waitForElementToBeVisible(whatAreWeSolvingTile);
		waitForElementToBeVisible(serviceGroupNameSelect);
		if (getText(serviceGroupNameSelect).contains("SI")) {

			waitForElementToBeVisible(scopOpp);
			clickElement(scopOpp);
			waitForElementToBeVisible(continueTab);
			clickElement(continueTab);
			waitForElementToBeVisible(technologyTab);

		}
	}

	/**
	 * @author shreya.sharad.jadhav
	 * @scenario -TC 16: Validate when user select AMS deal only AMS details are
	 *           displayed under technology tab and Vice versa for SI
	 * @date - 29/03/2024
	 * @release April 1
	 * 
	 */
	public void validationOfTechnologyAMSandSI(String MMSID) throws Exception {

		boolean scenarioFlag = true;
		if (DealsSGAMS.getAttribute("title").contains("AMS")) {
			if (isDisplayed(AMSTab) && SITab.getAttribute("Class").contains("disabled")) {
				logPass("User is able to view AMS SG detail enabled on technology tab for AMS Deal");
			} else {
				logFail("User is not able to view AMS SG detail enabled on technology tab for AMS Deal");
				scenarioFlag = false;
			}
		}

		Oppp(MMSID);
		if (DealsSGSI.getAttribute("title").contains("SI")) {
			if (isDisplayed(SITab) && AMSTab.getAttribute("Class").contains("disabled")) {
				logPass("User is able to view SI SG detail enabled on technology tab for SI Deal");
			} else {
				logFail("User is able to view SI SG detail enabled on technology tab for SI Deal ");
				scenarioFlag = false;
			}
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	
	/*
	 * TC_17 : Validate when user select AMS deal and navigate on technology tab,
	 * Custom and ERF fields are displayed.(User has to select Custom/ERP field to
	 * enable workflow)
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @release April 6
	 * 
	 * @since 27/03/2024
	 * 
	 */
	public void validateCustomAndERF() throws Exception {

		boolean scenarioFlag = false;
		String OppID_WRWS = "";
		
		
		String amsSecClass = "";

		waitForElementToBeVisible(Scope_Link);
		clickElement(Scope_Link);

		waitForElementToBeVisible(Scope_Btn);
		clickElement(Scope_Btn);

		waitForElementToBeVisible(Technology_Subtab);
		clickElement(Technology_Subtab);

		waitForElementToAppear(TechAMS_Section);
		amsSecClass = TechAMS_Section.getAttribute("class");
		
		if (amsSecClass.contains("disabled")) {
			
			waitForElementToAppear(Opp_Link);
			clickElement(Opp_Link);
			OppID_WRWS = ConfigFileReader.getTestData("OppIDs.OppID_WRWS1");
			Manage_SA_Page manage_SA_Page = new Manage_SA_Page();
			manage_SA_Page.navigatetoMMSID(OppID_WRWS);
			waitForElementToBeVisible(Scope_Link);
			clickElement(Scope_Link);
			waitForElementToBeVisible(Scope_Btn);
			clickElement(Scope_Btn);

			waitForElementToBeVisible(Technology_Subtab);
			clickElement(Technology_Subtab);
			
			boolean isFlag = actionForCustomAndERF();
			if(isFlag == true) {
				scenarioFlag = true;
			}else {
				logFail("Action Not Successful");
			}
		}else {
			boolean isFlag = actionForCustomAndERF();
			if(isFlag == true) {
				scenarioFlag = true;
			}else {
				logFail("Action Not Successful");
			}
		}

		
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}
	/*
	 * Method to configure the Custom and ERF Field of AMS Service Group in Technology Sub tab.
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @since 27/03/2024
	 * 
	 */
	public boolean actionForCustomAndERF() throws Exception {
		
		boolean flag = false;
		String[] customDataSelected = {};
		String[] erpDataSelected = {};
		
		waitForElementToBeVisible(TechScopeCustom_Field);
		if (isDisplayed(TechScopeCustom_Field)) {
			logPass("Custom Field is displayed under technology tab of What Are We Solving For Page");
		} else {
			logFail("Custom Field is not displayed under technology tab of What Are We Solving For Page");
		}

		waitForElementToBeVisible(TechScopeCustomDropdown_Btn);
		clickElement(TechScopeCustomDropdown_Btn);

		waitForElementToBeVisible(TechScopeCustom_DataContainer);
		customDataSelected = TechScopeCustom_DataContainer.getAttribute("title").split(",");
		int sizeofCustomData = customDataSelected.length;

		for (int i = 0; i < sizeofCustomData; i++) {

			waitForElementToBeVisible(TechScopeCustomFilter_InputField);
			clickElement(TechScopeCustomFilter_InputField);
			TechScopeCustomFilter_InputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			TechScopeCustomFilter_InputField.sendKeys(Keys.BACK_SPACE);
			sendKeys(TechScopeCustomFilter_InputField, customDataSelected[i]);
			TechScopeCustomFilter_InputField.sendKeys(Keys.TAB);

			waitForElementToBeVisible(TechScopeCustomDropdown_Checkbox);
			clickElement(TechScopeCustomDropdown_Checkbox);
		}

		waitForElementToBeVisible(TechScopeERP_Field);
		if (isDisplayed(TechScopeERP_Field)) {
			logPass("ERP Fieled is displayed under technology tab of What Are we Solving For Page");
		} else {
			logFail("ERP Fieled is not displayed under technology tab of What Are we Solving For Page");
		}

		waitForElementToBeVisible(TechScopeERPDropdown_Btn);
		clickElement(TechScopeERPDropdown_Btn);

		waitForElementToBeVisible(TechScopeERP_DataContainer);
		erpDataSelected = TechScopeERP_DataContainer.getAttribute("title").split(",");
		int sizeofERPData = erpDataSelected.length;

		for (int i = 0; i < sizeofERPData; i++) {

			waitForElementToBeVisible(TechScopeERPFilter_InputField);
			clickElement(TechScopeERPFilter_InputField);
			TechScopeERPFilter_InputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			TechScopeERPFilter_InputField.sendKeys(Keys.BACK_SPACE);
			sendKeys(TechScopeERPFilter_InputField, erpDataSelected[i]);
			TechScopeERPFilter_InputField.sendKeys(Keys.TAB);

			waitForElementToBeVisible(TechScopeERPDropdown_Checkbox);
			clickElement(TechScopeERPDropdown_Checkbox);
		}

		waitForElementToBeVisible(TechSave_Btn);
		clickElement(TechSave_Btn);

		waitForElementToBeVisible(TechAlert_Sec);
		if (getText(TechAlert_Sec).equals("Please select Custom / ERP from dropdown list")) {
			logPass("When user clicks on Save without selecting any value alert message is displayed.");
			flag = true;
		} else {
			logFail("When user clicks on Save without selecting any value alert message is not displayed.");
		}

		waitForElementToBeVisible(TechScopeCustomDropdown_Btn);
		clickElement(TechScopeCustomDropdown_Btn);
		waitForElementToBeVisible(TechCustomDropdownOptions);
		for (int i = 0; i < TechCustomDropdownOptions.size(); i++) {
			if (i == 4) {
				break;
			}
			clickElement(TechCustomDropdownOptions.get(i));
		}

		clickElement(TechScopeCustomDropdown_Btn);

		waitForElementToBeVisible(TechScopeERPDropdown_Btn);
		clickElement(TechScopeERPDropdown_Btn);
		waitForElementToBeVisible(TechERPDropdownOptions);
		for (int i = 0; i < TechERPDropdownOptions.size(); i++) {
			if (i == 4) {
				break;
			}
			clickElement(TechERPDropdownOptions.get(i));
		}

		clickElement(TechScopeERPDropdown_Btn);

		waitForElementToBeVisible(TechSave_Btn);
		clickElement(TechSave_Btn);

		waitForElementToAppear(TechAlert_Sec);
		if (getText(TechAlert_Sec).equals("Rest of the Opportunity Workflow is Enabled.")) {
			logPass("Data Modified Successfully");
		} else {
			logFail("Data Not Modified");
		}
		
		return flag;
	}

	/*
	 * TC_18 : Validate there is no data displayed for IMS, BPMS, SC/CON under
	 * technology tab.
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @release April 6
	 * 
	 * @since 27/03/2024
	 * 
	 */
	public void validateNoData() throws Exception {

		boolean scenarioFlag = false;

		/*
		 * In the User Interface(UI), there is a div with the class name "form group"
		 * that contains the data for AMS and SI Service Groups. However, for IMS,BPMS,
		 * and SC/CON service Groups there is no such div exist. Validation is done
		 * based on the above observation.
		 */

		boolean isIMSDataSecDisplayed = isDisplayed(TechIMSData_Sec);
		boolean isBPMSDataSecDisplayed = isDisplayed(TechBPMSData_Sec);
		boolean isSCCONDataDisplayed = isDisplayed(TechSCCONData_Sec);

		if (!isIMSDataSecDisplayed && !isBPMSDataSecDisplayed && !isSCCONDataDisplayed) {
			logPass("There is no data displayed for IMS, BPMS, SC/CON under technology tab.");
			scenarioFlag = true;
		} else {
			logFail("There is data displayed for IMS, BPMS, SC/CON under technology tab.");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/*
	 * TC_19 : Validate Enabled SGs under technology will displayed with comment
	 * icon.
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @release April 6
	 * 
	 * @since 27/03/2024
	 * 
	 */
	public void validateCommentIcon() throws Exception {

		boolean scenarioFlag = false;

		String selectedServiceGroup = "";

		selectedServiceGroup = getText(ServiceGroup);
		if (selectedServiceGroup.equals("AMS")) {
			waitForElementToAppear(TechAMSComment_Icon);
			clickElement(TechAMSComment_Icon);
			waitForElementToAppear(TechAMSComment_Popup);
			if (isDisplayed(TechAMSComment_Popup)) {
				logPass("Enabled AMS SG under technology displayed with comment icon");
				scenarioFlag = true;
			} else {
				logFail("Enabled AMS SG under technology not displayed with comment icon");
			}
		} else if (selectedServiceGroup.equals("SI")) {
			waitForElementToAppear(TechSIComment_Icon);
			clickElement(TechSIComment_Icon);
			waitForElementToAppear(TechSIComment_Popup);
			if (isDisplayed(TechSIComment_Popup)) {
				logPass("Enabled SI SG under technology displayed with comment icon");
				scenarioFlag = true;
			} else {
				logFail("Enabled SI SG under technology not displayed with comment icon");
			}
		} else {
			logFail("Select AMS/SI Service Groups Only");
		}

		waitForElementToAppear(TechCommentPopUp_Close);
		clickElement(TechCommentPopUp_Close);

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/*
	 * TC_20 : Validate When user Clicks on Continue from Technology, user is
	 * navigated to Delivery Center tab.
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @release April 6
	 * 
	 * @since 28/03/2024
	 * 
	 */
	public void validateDeliveryCenterTab() throws Exception {

		boolean scenarioFlag = false;

		String colorBefore = "";
		String colorAfter = "";

		colorBefore = DeliveryCenter_Tab.getCssValue("color");

		waitForElementToAppear(Continue_Btn);
		clickElement(Continue_Btn);

		colorAfter = DeliveryCenter_Tab.getCssValue("color");

		logInfo("Before Clicking Continue Button color of Delivery Center Tab is : " + colorBefore);
		logInfo("After Clicking Continue Button color of Delivery Center Tab is : " + colorAfter);

		if (colorAfter.equals("rgba(161, 2, 255, 1)")) {
			logPass("Successfully Navigated to Delivery Center Page on clicking of Continue Button");
			scenarioFlag = true;
		} else {
			logFail("Not able to Navigate to Delivery Center Page on click of Continue Button");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/*
	 * TC_21 : Validate that user is able to view All the Delivery center details on
	 * the page.
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @release April 6
	 * 
	 * @since 28/03/2024
	 * 
	 */
	public void validateDeliveryCenterDetails() throws Exception {

		boolean scenarioFlag = false;

		waitForElementToAppear(DCAMS_Label);
		waitForElementToAppear(DCAMSOpportunityType_Field);
		waitForElementToAppear(DCAMSPrimaryDeliveryCenter_Field);
		waitForElementToAppear(DCAMSAdditionalDeliveryCenter_Field);
		waitForElementToAppear(DCSI_Label);
		waitForElementToAppear(DCSIOppType_Field);
		waitForElementToAppear(DCSIPrimaryDeliveryCenter_Field);
		waitForElementToAppear(DCSIAdditionalDeliveryCenter_Field);
		waitForElementToAppear(DCIMS_Label);
		waitForElementToAppear(DCIMSOppType_Field);
		waitForElementToAppear(DCIMSPrimaryDeliveryCenter_Field);
		waitForElementToAppear(DCIMSAdditionalDeliveryCenter_Field);
		waitForElementToAppear(DCBPMS_Label);
		waitForElementToAppear(DCConsulting_Label);

		boolean isAMStitleDisplayed = isDisplayed(DCAMS_Label);
		boolean isAMSOppTypeDisplayed = isDisplayed(DCAMSOpportunityType_Field);
		boolean isAMSPrimaryDisplayed = isDisplayed(DCAMSPrimaryDeliveryCenter_Field);
		boolean isAMSAdditionalDisplayed = isDisplayed(DCAMSAdditionalDeliveryCenter_Field);
		boolean isSItitleDisplayed = isDisplayed(DCSI_Label);
		boolean isSIOppTyeDisplayed = isDisplayed(DCSIOppType_Field);
		boolean isSIPrimaryDisplayed = isDisplayed(DCSIPrimaryDeliveryCenter_Field);
		boolean isSIAdditionalDisplayed = isDisplayed(DCSIAdditionalDeliveryCenter_Field);
		boolean isIMStitleDisplayed = isDisplayed(DCIMS_Label);
		boolean isIMSOppTyeDisplayed = isDisplayed(DCIMSOppType_Field);
		boolean isIMSPrimaryDisplayed = isDisplayed(DCIMSPrimaryDeliveryCenter_Field);
		boolean isIMSAdditionalDisplayed = isDisplayed(DCIMSAdditionalDeliveryCenter_Field);
		boolean isBPMStitleDisplayed = isDisplayed(DCBPMS_Label);
		boolean isConsutingtitleDisplayed = isDisplayed(DCConsulting_Label);

		if (isAMStitleDisplayed && isAMSOppTypeDisplayed && isAMSPrimaryDisplayed && isAMSAdditionalDisplayed
				&& isSItitleDisplayed && isSIOppTyeDisplayed && isSIPrimaryDisplayed && isSIAdditionalDisplayed
				&& isIMStitleDisplayed && isIMSOppTyeDisplayed && isIMSPrimaryDisplayed && isIMSAdditionalDisplayed
				&& isBPMStitleDisplayed && isConsutingtitleDisplayed) {
			logPass("User is able to view All the Delivery center details on the page");
			scenarioFlag = true;
		} else {
			logFail("User is not able to view All the Delivery center details on the page");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/*
	 * TC_22 : Validate that user is able to view only selected specific SG details
	 * enabled when navigated on Delivery center page.
	 * 
	 * @author nitish.kumar.prusty
	 * 
	 * @release April 6
	 * 
	 * @since 07/03/2024
	 * 
	 */
	public void validateEnabledSGDetails() throws Exception {

		boolean scenarioFlag = false;

		String currentSG = "";
		String amsSectionClass = "";
		String siSectionClass = "";
		String imsSectionClass = "";

		waitForElementToBeVisible(DCAMS_Section);
		waitForElementToBeVisible(DCSI_Section);
		waitForElementToBeVisible(DCIMS_Section);

		amsSectionClass = DCAMS_Section.getAttribute("class");
		siSectionClass = DCSI_Section.getAttribute("class");
		imsSectionClass = DCIMS_Section.getAttribute("class");

		waitForElementToBeVisible(ServiceGroup);
		currentSG = getText(ServiceGroup);

		if (currentSG.equals("AMS")) {

			if (!amsSectionClass.contains("disabled") && siSectionClass.contains("disabled")
					&& imsSectionClass.contains("disabled")) {
				logPass("User is able to view only selected specific " + currentSG
						+ " details enabled when navigated on Delivery center page.");
				scenarioFlag = true;
			} else {
				logFail("User is not able to view selected specific " + currentSG
						+ " details enabled when navigated on Delivery center page.");
			}

		} else if (currentSG.equals("SI")) {
			if (amsSectionClass.contains("disabled") && !siSectionClass.contains("disabled")
					&& imsSectionClass.contains("disabled")) {
				logPass("User is able to view only selected specific " + currentSG
						+ " details enabled when navigated on Delivery center page.");
				scenarioFlag = true;
			} else {
				logFail("User is not able to view selected specific " + currentSG
						+ " details enabled when navigated on Delivery center page.");
			}

		} else if (currentSG.equals("IMS")) {
			if (amsSectionClass.contains("disabled") && siSectionClass.contains("disabled")
					&& !imsSectionClass.contains("disabled")) {
				logPass("User is able to view only selected specific " + currentSG
						+ " details enabled when navigated on Delivery center page.");
				scenarioFlag = true;
			} else {
				logFail("User is not able to view selected specific " + currentSG
						+ " details enabled when navigated on Delivery center page.");
			}
		} else {
			logFail("Expected Service Groups is not present so not able to do the validation");
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	
	
	

}
