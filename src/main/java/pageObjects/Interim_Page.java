package pageObjects;

import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import reusableComponents.ConstantUtils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

public class Interim_Page extends BasePage {
	Actions action = new Actions(getDriver());

	/************************** LOCATORS *****************************/

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Create Interim')]")
	public WebElement Create_Interim_Btn;

	@FindBy(how = How.XPATH, using = "//*[@name='opportunityName']")
	public WebElement Opportunity_Name_Txtbox;

	@FindBy(how = How.XPATH, using = "//*[@name='customerRelationshipName']")
	public WebElement Customer_Relationship_Txtbox;

	@FindBy(how = How.XPATH, using = "//*[@name='txtCust']")
	public WebElement Customer_Relationship_Popup;

	@FindBy(how = How.XPATH, using = "//input[@name='txtCust']/following-sibling::ul/li")
	public WebElement Customer_Relationship_Suggestion;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'searchBtn')]")
	public WebElement Cust_Rel_Search_Btn;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'customerrelationship-popup')]//div[@ref='eCenterViewport']//input")
	public List<WebElement> Cust_Relationship_List;

	@FindBy(how = How.XPATH, using = "//*[@class='custRelationshipSave_btn']")
	public WebElement Cust_Rel_Save_Btn;

	@FindBy(how = How.XPATH, using = "//*[@name='serviceGroup']")
	public WebElement Service_Group_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='subServiceGroup']")
	public WebElement Subservice_Group_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='market']")
	public WebElement Market_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='marketUnit']")
	public WebElement Market_Unit_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='clientGroup']")
	public WebElement client_Group_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='industrySegement']")
	public WebElement Industry_Segement_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='stage']")
	public WebElement Stage_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='sellingCountryLocation']")
	public WebElement selling_Country_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='eligibleFlag']")
	public WebElement Eligible_Flag_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='currency']")
	public WebElement Currency_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='responsibleDeliveryEntity']")
	public WebElement Responsible_Entity_Drpdwn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Timelines')]//ancestor::mat-expansion-panel-header")
	public WebElement TimelinesAccordion;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Proposal ')]//following-sibling::mat-form-field//div[contains(@class,'ng-star-inserted')]//button")
	public WebElement Proposal_Submission_Date;

	@FindBy(how = How.XPATH, using = "//*[@class='GenerateDeal_btn']//button")
	public WebElement Generate_Deal_Btn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'MMS ID')]//parent::mat-grid-tile//following-sibling::mat-grid-tile//p")
	public WebElement Interim_Deal_Generated;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	public WebElement Interim_Save_Btn;

	@FindBy(how = How.XPATH, using = "//img[contains(@title,'link')]")
	public WebElement Opportunity_Link_Btn;

	@FindBy(how = How.XPATH, using = ".//*[@id='SelectedMmsId_mmsid']")
	public WebElement Interim_Link_ActualMMSID;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Link')]")
	public WebElement MMSID_Link_Btn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok')]")
	public WebElement MMSID_Link_Popup_Ok;

	@FindBy(how = How.XPATH, using = "//*[@id='confidentialpopup']//lib-button/button")
	public WebElement I_understand;

	@FindBy(how = How.XPATH, using = "//*[@id='mat-expansion-panel-header-1']/span/mat-panel-title")
	public WebElement Financial_Details;

	@FindBy(how = How.XPATH, using = "//div/input[@name='revenue']")
	public WebElement TotalOppRevenue;

	@FindBy(how = How.XPATH, using = "//div/input[@name='aORevenue']")
	public WebElement AMSRevenue;

	@FindBy(how = How.XPATH, using = "//div/input[@name='sIRevenue']")
	public WebElement SIRevenue;

	@FindBy(how = How.XPATH, using = "//div/input[@name='iMSRevenue']")
	public WebElement IMSRevenue;

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-12']")
	public WebElement DealCreationDate;

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-17']")
	public WebElement ExpectedDeliveryStartDate;

	@FindBy(how = How.XPATH, using = "//*[@id='mat-input-13']")
	public WebElement PipelineEntryDate;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Pipeline ')]//following-sibling::mat-form-field//div[contains(@class,'ng-star-inserted')]//button")
	public WebElement Pipeline_Entry_Date;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'NBM ')]//following-sibling::mat-form-field//div[contains(@class,'ng-star-inserted')]//button")
	public WebElement NBM_Date;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Expected contract ')]//following-sibling::mat-form-field//div[contains(@class,'ng-star-inserted')]//button")
	public WebElement Expectedcontract_signing_Date;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-accordion-container']//div[contains(text(),'Stakeholder')]")
	public WebElement StakeHolderInfo;

	@FindBy(how = How.XPATH, using = "//*[@name='Lead_SA']//span[@class='dropdown-btn']/div")
	public WebElement LeadSADropDn;

	@FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-53']")
	public WebElement BidManagement;

	@FindBy(how = How.XPATH, using = "//*[@id='mat-select-value-55']")
	public WebElement ProposalSupport;

	@FindBy(how = How.XPATH, using = "//*[@name='Support_SA']/div/div/span")
	public WebElement SupportSA;

	@FindBy(how = How.XPATH, using = "//*[@name='Rate_SA']/div/div/span")
	public WebElement RateCardSA;

	@FindBy(how = How.XPATH, using = "//*[@name='Support_SA']//div[@class='dropdown-list']//li/input[@placeholder='Search']")
	public WebElement SupportSASearch;

	@FindBy(how = How.XPATH, using = "//*[@name='Rate_SA']//div[@class='dropdown-list']//li/input[@placeholder='Search']")
	public WebElement RateCardSASearch;

	@FindBy(how = How.XPATH, using = "//*[@name='Support_SA']//div[@class='dropdown-list']//ul[@class='item2']/li//div")
	public WebElement SupportSASearch_Name;

	@FindBy(how = How.XPATH, using = "//*[@name='Rate_SA']//div[@class='dropdown-list']//ul[@class='item2']/li//div")
	public WebElement RateCardSASearch_Name;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),' Avanade Details ')]")
	public WebElement AvanadeDetails;

	@FindBy(how = How.XPATH, using = "//*[@name='avanadeRegion']")
	public WebElement AvanadeRegion;

	@FindBy(how = How.XPATH, using = "//*[@name='aTCStatus']")
	public WebElement ATCStatus;

	@FindBy(how = How.XPATH, using = "//*[@name='aTCCountry']")
	public WebElement ATCCountry;

	@FindBy(how = How.XPATH, using = "//*[@name='aTCOpportunityOwner']")
	public WebElement ATCOpportunityOwner;

	@FindBy(how = How.XPATH, using = "//*[@id='mat-expansion-panel-header-5']//*[contains(text(),' Add Comments')]")
	public WebElement AddComments;

	@FindBy(how = How.XPATH, using = "//*[text()='Comments ']")
	public WebElement CommentsText;

	@FindBy(how = How.XPATH, using = "//*[@id='mat-input-18'][@placeholder='Enter the Text']")
	public WebElement EnterTheComment;

	@FindBy(how = How.XPATH, using = "//*[@class='GenerateDeal_btn']//button")
	public WebElement GenerateDealBtn;

	@FindBy(how = How.XPATH, using = "(//*[@class='create-interim-deal']//*[@class='title'] //span)[1]")
	public WebElement GenerateDealSuccessMsgPop;

	@FindBy(how = How.XPATH, using = "//*[@name='SA_Requestor']//div[@class='multiselect-dropdown']")
	public WebElement SA_Requester_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@name='SA_Requestor']//span/span[contains(@class,'dropdown')]")
	public WebElement SA_Requester_Icon;

	@FindBy(how = How.XPATH, using = "//*[@name='SA_Requestor']//input[@placeholder='Search']")
	public WebElement SA_Requester_Search;

	@FindBy(how = How.XPATH, using = "//input[@id='inputTypeText']")
	public WebElement Opportunity_Txtbx;

	@FindBy(how = How.XPATH, using = "//*[@name='opportunityName']/../../following-sibling::div[2]")
	public WebElement Opp_Name_Subscript;

	@FindBy(how = How.XPATH, using = "//*[@name='customerRelationshipName']/../../following-sibling::div[2]")
	public WebElement Cust_Relation_Subscript;

	@FindBy(how = How.XPATH, using = "//*[@name='serviceGroup']/../../following-sibling::div[2]")
	public WebElement Service_Grp_Subscript;

	@FindBy(how = How.XPATH, using = "//*[@name='subServiceGroup']/../../following-sibling::div[2]")
	public WebElement SubServ_Subscript;

	@FindBy(how = How.XPATH, using = "	//*[@name='sellingCountryLocation']/../../following-sibling::div[2]")
	public WebElement Selling_Country_Subscript;

	@FindBy(how = How.XPATH, using = "//*[@name='currency']/../../following-sibling::div[2]")
	public WebElement Currency_Subscript;

	@FindBy(how = How.XPATH, using = "//*[@name='responsibleDeliveryEntity']/../../following-sibling::div[2]")
	public WebElement RDE_Subscript;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Cancel')]")
	public WebElement Cancel_Button;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Opportunity')]//span[contains(@class,'showErrorMsg')]/img")
	public WebElement Opp_Success_Icon;

	@FindBy(how = How.XPATH, using = "//*[@class='popup-header-text']")
	public WebElement Cust_Relation_Popup;

	@FindBy(how = How.XPATH, using = "//*[@class='custRelationshipCancel_btn']/button")
	public WebElement Cust_Relation_Cancel;

	@FindBy(how = How.XPATH, using = "//div[@col-id='customerRelationshipNo'][@role='gridcell']")
	public WebElement Cust_Relation_Number;

	@FindBy(how = How.XPATH, using = "(//*[@role='listbox']/*[@role='option']/span)[1]")
	public WebElement SSG_Option;

	@FindBy(how = How.XPATH, using = "(//*[@role='listbox']/*[@role='option']/span)[2]")
	public WebElement market_CG_Option;

	@FindBy(how = How.XPATH, using = "//*[@name='ledBy']")
	public WebElement Led_By_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@role='listbox']//span[contains(text(),'Technology')]")
	public WebElement Tech_Option;

	@FindBy(how = How.XPATH, using = "//div[@role='tab']//div[contains(text(),'Opportunity Self-Assign')]")
	public WebElement Self_Assign_Tab;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),' Create Interim Deal')]")
	public WebElement Create_Interim_Tab;

	@FindBy(how = How.XPATH, using = "//*[@name='serviceLevel']")
	public WebElement ServiceLevelDrp;

	@FindBy(how = How.XPATH, using = "(//*[contains(@class,'showErrorMsg')])[2]")
	public WebElement showErrorMsg;

	@FindBy(how = How.XPATH, using = "//*[@class='interimCancel_btn']//button")
	public WebElement Cancel_Btn;

	@FindBy(how = How.XPATH, using = "//*[@name='serviceLevel']//span")
	public WebElement serviceLevelvalue;

	@FindBy(how = How.XPATH, using = "//*[text()=' Total Opportunities ']")
	public WebElement Total_opportunitieslink;

	@FindBy(how = How.XPATH, using = "//input[@placeholder = 'Type a text to filter']")
	public WebElement opportunitypage_inputbox;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'ag-pinned-right')]//*[@row-index='0']//img[@title='Edit']")
	public WebElement EditIcon;

	@FindBy(how = How.XPATH, using = "//*[@name='MmsId']")
	public WebElement MmsId;

	@FindBy(how = How.XPATH, using = "//*[@name='MmsId']")
	public WebElement Opportunity_Save_Btn;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Opportunity Name')]//parent::mat-grid-tile//following-sibling::mat-grid-tile//p")
	public WebElement Opportunity_Name;

	@FindBy(how = How.XPATH, using = "//*[@role='option']/span[contains(text(),'Technology')]")
	public WebElement Service_Drpdwn_Option;

	/******************** METHODS ************************/
	public Interim_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	/**
	 * Method to create an Interim deal.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public String createInterimDeal(String FilePath, String Sheet, int row) throws Exception {

		String createdInterimDeal = "";
		ArrayList<String> interimData = new ArrayList<String>();
		// Reading Interim data from excel.
		for (int i = 1; i <= 14; i++) {
			interimData.add(SetExcelPath(FilePath, Sheet, row, i));
		}
		logInfo("interimData: " + interimData);

		// Click on create Interim button
		// waitForElementToBeVisible(Create_Interim_Btn);
		clickElement(Create_Interim_Btn);
		configureOpportunityDetails(interimData);

		scrollToElement(TimelinesAccordion);
		clickElement(TimelinesAccordion);

		// Enter Proposal Submission Date
		clickElement(Proposal_Submission_Date);
		datePicker(interimData.get(13));

		clickElement(Generate_Deal_Btn);

		waitForElementToAppear(Interim_Deal_Generated);
		createdInterimDeal = getText(Interim_Deal_Generated);

		return createdInterimDeal;

	}

	/**
	 * Method to link a MMSID with an Interim deal.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void linkInterimDeal(String OppID_To_Link) throws Exception {
		clickElement(Opportunity_Link_Btn);
		clickElement(Interim_Link_ActualMMSID);
		clear(Interim_Link_ActualMMSID);
		for (int i = 0; i < OppID_To_Link.length(); i++) {
			char actualMmsChar = OppID_To_Link.charAt(i);
			String actualMmsInput = new StringBuilder().append(actualMmsChar).toString();
			sendKeys(Interim_Link_ActualMMSID, actualMmsInput);
		}

		clickElement(getDriver()
				.findElement(By.xpath("//li[contains(@class,'searchable')]//a[text()='" + OppID_To_Link + "']")));
		waitForElementToBeVisible(MMSID_Link_Btn);
		clickElement(MMSID_Link_Btn);
		clickElement(MMSID_Link_Popup_Ok);
	}

	/**
	 * Method to select proposal date.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void datePicker(String date) throws Exception {
		String[] Split = date.split("-");
		int year = Integer.parseInt(Split[2]), month = Integer.parseInt(Split[1]), day = Integer.parseInt(Split[0]);

		logInfo(Split[0] + " : " + Split[1] + " : " + Split[2]);

		clickElement(getDriver().findElement(By.xpath("//*[contains(@aria-describedby,'mat-calendar-button')]")));
		clickElement(getDriver().findElement(By.xpath("//td//button[contains(@aria-label,'" + year + "')]")));

		// getting month
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, month - 1); // Calendar months are 0-based
		String monthName = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		logInfo(monthName);

		// click on month
		clickElement(getDriver().findElement(By.xpath("//td//button[contains(@aria-label,'" + monthName + "')]")));
		// click on date
		clickElement(getDriver().findElement(By.xpath("//td//button//div[text()=' " + day + " ']")));

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_09 : Validate Financial details mandatory accordion.
	 * @date - 20/03/2024
	 * @release March 16
	 * 
	 */
	public void interimOppDetails(String FilePath, String Sheet, int row) throws Exception {
		boolean scenarioFlag = false;
		ArrayList<String> interimData = new ArrayList<String>();
		loader();
		// Reading Interim data from excel.
		for (int i = 0; i <= 14; i++) {
			interimData.add(SetExcelPath(FilePath, Sheet, row, i));
		}
		logInfo("interimData: " + interimData);

//		 Click on create Interim button
		waitForElementToBeVisible(Create_Interim_Btn);
		clickElement(Create_Interim_Btn);
		configureOpportunityDetails(interimData);

		String serviceGroup = interimData.get(2);

		// Financial Details
		scrollToElement(Financial_Details);
		clickElement(Financial_Details);
		waitForElementToBeVisible(TotalOppRevenue);
		String[] totalOppRevenue = (interimData.get(13)).split("\\.");
		// String[] aMSRevenue=(interimData.get(14)).split("\\.");
		if (TotalOppRevenue.getAttribute("value").equals(totalOppRevenue[0])) {
			logPass("Total Opportunity Revenue is displayed defaultly :" + TotalOppRevenue.getAttribute("value"));
			if (serviceGroup.equals("AMS")) {
				logPass("AMS Revenue fields is displayed defaultly :" + AMSRevenue.getAttribute("value"));
				waitForElementToBeVisible(SIRevenue);
				if (SIRevenue.getAttribute("aria-required").equals("false")
						&& IMSRevenue.getAttribute("aria-required").equals("false")) {
					logPass("SI Revenue and IMS Revenue fields are disabled");
					scenarioFlag = true;
				} else {
					logFail("SI Revenue and IMS Revenue fields are enabled");
				}
			} /*
				 * else if ((serviceGroup.equals("CON")) || (serviceGroup.equals("SC")) ||
				 * (serviceGroup.equals("SI"))) {
				 * logPass("SI Revenue fields is displayed defaultly :" +
				 * SIRevenue.getAttribute("value")); waitForElementToBeVisible(AMSRevenue); if
				 * (AMSRevenue.getAttribute("aria-required").equals("false") &&
				 * IMSRevenue.getAttribute("aria-required").equals("false")) {
				 * logPass("AMS Revenue and IMS Revenue fields are disabled"); scenarioFlag =
				 * true; } else { logFail("AMS Revenue and IMS Revenue fields are enabled"); } }
				 * else if (serviceGroup.equals("IMS")) {
				 * logPass("IMS Revenue fields is displayed defaultly :" +
				 * IMSRevenue.getAttribute("value")); waitForElementToBeVisible(AMSRevenue); if
				 * (AMSRevenue.getAttribute("aria-required").equals("false") &&
				 * SIRevenue.getAttribute("aria-required").equals("false")) {
				 * logPass("AMS Revenue and SI Revenue fields are disabled"); scenarioFlag =
				 * true; } else { logFail("AMS Revenue and SI Revenue fields are enabled"); } }
				 * else { logFail("select correct service group"); }
				 */

		} else {
			logFail("Total Opportunity Revenue field is not displayed defaultly. ");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_10 : Validate Timelines mandatory accordion.
	 * @date - 20/03/2024
	 * @release March 16
	 * 
	 */
	public void interimTimelines(String FilePath, String Sheet, int row) throws Exception {
		boolean scenarioFlag = false;
		ArrayList<String> interimData = new ArrayList<String>();
		// Reading Interim data from excel.
		for (int i = 17; i <= 20; i++) {
			interimData.add(SetExcelPath(FilePath, Sheet, row, i));
		}
		logInfo("interimData: " + interimData);

		scrollToElement(TimelinesAccordion);
		waitForElementToBeVisible(TimelinesAccordion);
		clickElement(TimelinesAccordion);

		// Create a LocalDate object representing the current date
		LocalDate currentDate = LocalDate.now();

		// Format the date using DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate.format(formatter);
		String[] parts = formattedDate.split("/");
		int month = Integer.parseInt(parts[0]);
		int day = Integer.parseInt(parts[1]);
		int year = Integer.parseInt(parts[2]);
		String currentDateFormatter = String.format("%d/%d/%d", month, day, year);
		if (PipelineEntryDate.getAttribute("value").equals(currentDateFormatter)) {
			logPass("The Pipeline Entry Date is filled by default with today's date."
					+ PipelineEntryDate.getAttribute("value"));
			scenarioFlag = true;
		} else {
			logFail("The Pipeline Entry Date is not filled by default with today's date.");
		}

		// Enter Pipeline Entry Date
		clickElement(Pipeline_Entry_Date);
		datePicker(interimData.get(0));

		// Enter Proposal Submission Date
		clickElement(Proposal_Submission_Date);
		datePicker(interimData.get(1));

		// Enter NBM Date
		clickElement(NBM_Date);
		datePicker(interimData.get(2));

		// Enter Expected contract signing Date
		clickElement(Expectedcontract_signing_Date);
		datePicker(interimData.get(3));

		// checking deal creation and expected delivery are disabled or not
		boolean isDealCreationDisabled = !DealCreationDate.isEnabled();
		boolean isExpectedDeliveryDisabled = !ExpectedDeliveryStartDate.isEnabled();
		if (isDealCreationDisabled && isExpectedDeliveryDisabled) {
			logPass("Deal Creation Date and Expected Delivery Start Date are disabled");
			scenarioFlag = true;
		} else {
			logFail("Deal Creation Date and Expected Delivery Start Date are enabled");
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_11 : Validate Stakeholder Information mandatory accordion.
	 * @date - 21/03/2024
	 * @release March 16
	 * 
	 */
	public void interimStakeholderInfo(String FilePath, String Sheet, int row, String userId) throws Exception {
		boolean scenarioFlag = false;
		ArrayList<String> interimData = new ArrayList<String>();
		// Reading Interim data from excel.
		for (int i = 0; i <= 4; i++) {
			interimData.add(SetExcelPath(FilePath, Sheet, row, i));
		}

		scrollToElement(StakeHolderInfo);
		waitForElementToBeVisible(StakeHolderInfo);
		clickElement(StakeHolderInfo);

		// Enter Bid Management Support
		clickElement(BidManagement);
		WebElement BidManagementDropDn = getDriver()
				.findElement(By.xpath("//*[@role='listbox'] //span[contains(text(),'" + interimData.get(0) + "')]"));
		clickElement(BidManagementDropDn);

		// Enter Proposal Support
		clickElement(ProposalSupport);
		WebElement ProposalSupportDropDn = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(1) + "')]"));
		clickElement(ProposalSupportDropDn);

		// checking by default,Lead SA is displayed or not
		waitForElementToBeVisible(LeadSADropDn);
		logInfo("getText(LeadSADropDn): " + getText(LeadSADropDn));
		if (userId.contains(getText(LeadSADropDn))) {
			logPass("Default LeadSA user enterprise ID is displayed :" + getText(LeadSADropDn));
			scenarioFlag = true;
		} else {
			logFail("Default LeadSA user enterprise ID is not displayed.");
		}

		// Enter Supporting SA
		waitForElementToBeVisible(SupportSA);
		clickElement(SupportSA);
		clickElement(SupportSASearch);
		sendKeys(SupportSASearch, interimData.get(3));
		waitForElementToAppear(SupportSASearch_Name);
		clickElement(SupportSASearch_Name);

		// Enter Rate Card SA
		waitForElementToBeVisible(RateCardSA);
		clickElement(RateCardSA);
		clickElement(RateCardSASearch);
		sendKeys(RateCardSASearch, interimData.get(4));
		waitForElementToAppear(RateCardSASearch_Name);
		clickElement(RateCardSASearch_Name);

		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_12 : Validate Avanade Details accordion.
	 * @date - 21/03/2024
	 * @release March 16
	 * 
	 */
	public void interimAvanadeDetails() throws Exception {
		boolean scenarioFlag = false;
		scrollToElement(AvanadeDetails);
		waitForElementToBeVisible(AvanadeDetails);
		clickElement(AvanadeDetails);
		waitForElementToBeVisible(AvanadeRegion);
		String avanadeRegion = AvanadeRegion.getAttribute("aria-disabled");
		String aTCStatus = ATCStatus.getAttribute("aria-disabled");
		String aTCCountry = ATCCountry.getAttribute("aria-disabled");
		String aTCOpportunityOwner = ATCOpportunityOwner.getAttribute("aria-disabled");
		if (avanadeRegion.equals("true") && aTCStatus.equals("true") && aTCCountry.equals("true")
				&& aTCOpportunityOwner.equals("true")) {
			logPass("Avanade region ,ATC status , ATC country and ATC opportunity owner fields are disabled");
			scenarioFlag = true;
		} else {
			logFail("Avanade region ,ATC status , ATC country and ATC opportunity owner fields are enabled");
		}
		if (scenarioFlag == true)
			scenarioPass();

		else
			scenarioFail();

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_13 : Validate Add Comment accordion.
	 * @date - 22/03/2024
	 * @release March 16
	 * 
	 */
	public void interimAddComments() throws Exception {
		boolean scenarioFlag = false;
		String addComments = "All mandatory details under all fields are filled successfully.";
		scrollToElement(AddComments);
		waitForElementToBeVisible(AddComments);
		clickElement(AddComments);
		waitForElementToBeVisible(CommentsText);
		if (isDisplayed(CommentsText)) {
			clickElement(EnterTheComment);
			sendKeys(EnterTheComment, addComments);
			logPass("Comments are added successfully under Add Comments field");
			scenarioFlag = true;
		} else {
			logFail("Comments are not added under Add Comments field");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();

	}

	/**
	 * TC_2 : Validate Opportunity/MMS ID & SA Requestor option by adding Enterprise
	 * ID. *
	 * 
	 * @since 20/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateSaRequestor(String userName) throws Exception {
		String selectedUserName = "", requestorID = "";
		boolean scenarioFlag = false;
		clickElement(Create_Interim_Btn);

		requestorID = userName.split("@")[0];
		logInfo("requestorID: " + requestorID);

		try {
			Opportunity_Txtbx.sendKeys("mmsInput");
			logFail("Opportunity/MMS ID text box is enabled");
			scenarioFlag = false;
		} catch (Exception e) {
			logPass("Opportunity/MMS ID text box is disabled");
			scenarioFlag = true;

		}

		clickElement(SA_Requester_Drpdwn);
		waitForElementToBeVisible(SA_Requester_Search);
		sendKeys(SA_Requester_Search, requestorID);
		SA_Requester_Search.sendKeys(Keys.ENTER);

		waitForElementToBeVisible(SA_Requester_Icon);
		clickElement(getDriver()
				.findElement(By.xpath("//*[@name='SA_Requestor']//div[contains(text(),'" + requestorID + "')]")));

		clickElement(SA_Requester_Icon);
		if (SA_Requester_Icon.getAttribute("class").contains("up")) {
			clickElement(SA_Requester_Icon);
		}

		selectedUserName = getText(SA_Requester_Drpdwn);
		if (selectedUserName.equalsIgnoreCase(requestorID)) {
			logPass("User is able to select the Enterprise ID in SA Requestor.");
			scenarioFlag = true;
		} else {
			logFail("User is not able to select the Enterprise ID in SA Requestor.");

		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * TC_3 : Validate Opportunity Name option under Opportunity Details accordion.
	 * 
	 * @since 20/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateOpportunityName() throws Exception {
		boolean scenarioFlag = false;
		String oppNameInput = "interimName", oppNameUI = "";

		waitForElementToBeVisible(Opportunity_Name_Txtbox);
		sendKeys(Opportunity_Name_Txtbox, oppNameInput);

		oppNameUI = Opportunity_Name_Txtbox.getAttribute("value");

		if (oppNameUI.equalsIgnoreCase(oppNameInput)) {
			logPass("User is able to enter opportunity Name");
			scenarioFlag = true;
		} else {
			logFail("User is not able to enter opportunity Name");

		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * TC_4 : Validate Opportunity Details By filling all the mandatory details.
	 * 
	 * @since 21/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateMandatoryFields(String FilePath, String Sheet, int row) throws Exception {

		List<Boolean> scenarioFlag = new ArrayList<>();
		String errorText = "Select the value", errorMsg = "Please select one value";
		ArrayList<String> interimData = new ArrayList<String>();
		clickElement(Cancel_Button);
		if (getText(Opp_Name_Subscript).equalsIgnoreCase(errorText)
				&& getText(Cust_Relation_Subscript).equalsIgnoreCase(errorText)
				&& getText(Service_Grp_Subscript).equalsIgnoreCase(errorMsg)
				&& getText(SubServ_Subscript).equalsIgnoreCase(errorMsg)
				&& getText(Selling_Country_Subscript).equalsIgnoreCase(errorMsg)
				&& getText(Currency_Subscript).equalsIgnoreCase(errorMsg)
				&& getText(RDE_Subscript).equalsIgnoreCase(errorMsg)) {
			logPass("Error message is displayed below the text box when the mandatory details are missed.");
			scenarioFlag.add(true);
		} else {
			logFail("Error message is not displayed below the text box when the mandatory details are missed.");
			scenarioFlag.add(false);
		}

		// Reading Interim data from excel.
		for (int i = 1; i <= 14; i++) {
			interimData.add(SetExcelPath(FilePath, Sheet, row, i));
		}
		logInfo("interimData: " + interimData);
		configureOpportunityDetails(interimData);

		clickElement(Generate_Deal_Btn);
		jse.executeScript("arguments[0].scrollIntoView(true);", Opp_Success_Icon);
		logInfo("Opp_Success_Icon attribute: " + Opp_Success_Icon.getAttribute("src"));
		if (Opp_Success_Icon.getAttribute("src").contains("success")) {
			logPass("Opportunity details saved successfully after filling all the mandatory details.");
			scenarioFlag.add(true);
		} else {
			logFail("Opportunity details not saved after filling all the mandatory details.");
			scenarioFlag.add(false);
		}
		if (!scenarioFlag.contains(false)) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * TC_5 : Verify select customer relationship details popup screen.
	 * 
	 * @since 21/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateCustomerRel() throws Exception {
		boolean scenarioFlag = false;
		jsClick(Customer_Relationship_Txtbox);

		String popupText = getText(Cust_Relation_Popup);
		if (popupText.equalsIgnoreCase("Select Customer Relationship Details")
				&& isDisplayed(Customer_Relationship_Popup)) {
			logPass("Select customer relationship details popup screen is shown.");
			scenarioFlag = true;
		} else {
			logFail("Select customer relationship details popup screen is not shown.");
		}
		waitForElementToBeVisible(Cust_Relation_Cancel);
		jsClick(Cust_Relation_Cancel);
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * TC_6 : Validate select customer relationship details popup screen fill the
	 * mandatory details Master Client / Customer Relationship Name *(Client name) /
	 * if user have specific data of MMS ID then user can fill that data under the
	 * given option and click on search button particular ID will display.
	 * 
	 * @since 21/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void custRelationClientCheck(String filePath, String sheet, int row) throws Exception {

		List<Boolean> scenarioFlag = new ArrayList<>();
		String selectedCustRel = "";
		String clientName = SetExcelPath(filePath, sheet, row, 2);

		jsClick(Customer_Relationship_Txtbox);

		configureCustRelationshipPopup(clientName);
		// check that on click of search button particular ID will display.
		try {
			waitForElementToBeVisible(getDriver().findElement(
					By.xpath("//div[text()='" + clientName + "'][@col-id='customerRelationshipNM']/..//input")));
			clickElement(getDriver().findElement(
					By.xpath("//div[text()='" + clientName + "'][@col-id='customerRelationshipNM']/..//input")));
			logPass("Client Name is displaying correctly on click of search button.");
			scenarioFlag.add(true);
		} catch (Exception e) {
			logFail("Client Name is not displaying correctly on click of search button.");
			scenarioFlag.add(false);
		}
		// Click cancel to erase selection
		waitForElementToAppear(Cust_Relation_Cancel);
		clickElement(Cust_Relation_Cancel);
		waitForElementToBeVisible(Customer_Relationship_Txtbox);
		selectedCustRel = Customer_Relationship_Txtbox.getAttribute("value");
		if (selectedCustRel.equals("")) {
			logPass("Data is not populated when cancel button is clicked.");
			scenarioFlag.add(true);
		} else {
			logFail("Data is populated even when cancel button is clicked.");
			scenarioFlag.add(false);
		}
		if (!scenarioFlag.contains(false)) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * TC_7 : Verify by filling the mandatory data under select customer
	 * relationship details and save it that data will reflect under Customer
	 * Relationship Name text box.
	 * 
	 * @since 21/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateCustRelationSave(String filePath, String sheet, int row) throws Exception {
		boolean scenarioFlag = true;
		String selectedCustRel = "", custRelNumber = "";
		String clientName = SetExcelPath(filePath, sheet, row, 2);

		jsClick(Customer_Relationship_Txtbox);
		configureCustRelationshipPopup(clientName);
		waitForElementToBeVisible(getDriver().findElement(
				By.xpath("//div[text()='" + clientName + "'][@col-id='customerRelationshipNM']/..//input")));
		clickElement(getDriver().findElement(
				By.xpath("//div[text()='" + clientName + "'][@col-id='customerRelationshipNM']/..//input")));
		custRelNumber = getText(Cust_Relation_Number);
		waitForElementToBeVisible(Cust_Rel_Save_Btn);
		clickElement(Cust_Rel_Save_Btn);
		String textBoxValue = custRelNumber + " - " + clientName;
		waitForElementToBeVisible(Customer_Relationship_Txtbox);
		selectedCustRel = Customer_Relationship_Txtbox.getAttribute("value");
		if (selectedCustRel.equals(textBoxValue)) {
			logPass("Customer Relationship Name text box data is populating correctly.");
		} else {
			logFail("Customer Relationship Name text box data is not populating correctly.");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	public void configureCustRelationshipPopup(String clientName) throws Exception {

		waitForElementToAppear(Customer_Relationship_Popup);
		clickElement(Customer_Relationship_Popup);
		clear(Customer_Relationship_Popup);

		for (int i = 0; i < clientName.length(); i++) {
			char custRelationshipChar = clientName.charAt(i);
			String custRelationshipInput = new StringBuilder().append(custRelationshipChar).toString();
			sendKeys(Customer_Relationship_Popup, custRelationshipInput);
		}

		waitForElementToAppear(Customer_Relationship_Suggestion);
		clickElement(Customer_Relationship_Suggestion);
		clickElement(Cust_Rel_Search_Btn);

	}

	/**
	 * TC_8 : Validate Interlink of the mandatory field under Opportunity Details
	 * screen.
	 * 
	 * @since 22/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateFieldInterlink(String filePath, String sheet, int row) throws Exception {

		String serviceGrp = "";
		List<Boolean> scenarioFlag = new ArrayList<>();

		clickElement(Self_Assign_Tab);
		clickElement(Create_Interim_Tab);

		// Select dropdown list from Service Group then Sub Service Group will get
		// enable. Otherwise it will display as disable.
		waitForElementToBeVisible(Subservice_Group_Drpdwn);
		String classBefore = Subservice_Group_Drpdwn.getAttribute("class");
		String disabledAttribute = Subservice_Group_Drpdwn.getAttribute("aria-disabled");
		if (classBefore.contains("disabled") && disabledAttribute.equals("true")) {
			logPass("SSG is disabled when service group is not selected.");
			scenarioFlag.add(true);
		} else {
			logFail("SSG is not disabled when service group is not selected.");
			scenarioFlag.add(false);
		}

		serviceGrp = "AMS";
		selectSG(serviceGrp);
		waitForElementToBeVisible(Subservice_Group_Drpdwn);
		String classAfter = Subservice_Group_Drpdwn.getAttribute("class");
		String enabledAttribute = Subservice_Group_Drpdwn.getAttribute("aria-disabled");
		if (classAfter.contains("required") && enabledAttribute.equals("false")) {
			logPass("SSG is enabled when service group is selected.");
			scenarioFlag.add(true);
		} else {
			logFail("SSG is not enabled when service group is selected.");
			scenarioFlag.add(false);
		}
		// Sub Service Group dropdown list are display onthe bases of Service Group
		// Dropdown.
		// when SG is AMS
		if (getText(SSG_Option).contains(serviceGrp)) {
			logPass("AMS SSG is displayed when AMS service group is selected.");
			scenarioFlag.add(true);
		} else {
			logFail("AMS SSG is not displayed when AMS service group is selected.");
			scenarioFlag.add(false);
		}
		action.sendKeys(Keys.ESCAPE).build().perform();
		// when SG is CON
		serviceGrp = "CON";
		selectSG(serviceGrp);
		if (getText(SSG_Option).contains(serviceGrp)) {
			logPass("CON SSGs are displayed when CON service group is selected.");
			scenarioFlag.add(true);
		} else {
			logFail("CON SSGs are not displayed when CON service group is selected.");
			scenarioFlag.add(false);
		}
		action.sendKeys(Keys.ESCAPE).build().perform();
		// when SG is IMS
		serviceGrp = "IMS";
		selectSG(serviceGrp);
		if (getText(SSG_Option).contains(serviceGrp)) {
			logPass("IMS SSGs are displayed when IMS service group is selected.");
			scenarioFlag.add(true);
		} else {
			logFail("IMS SSGs are not displayed when IMS service group is selected.");
			scenarioFlag.add(false);
		}
		action.sendKeys(Keys.ESCAPE).build().perform();
		// when SG is SC
		serviceGrp = "SC";
		selectSG(serviceGrp);
		if (getText(SSG_Option).contains(serviceGrp)) {
			logPass("SC SSGs are displayed when SC service group is selected.");
			scenarioFlag.add(true);
		} else {
			logFail("SC SSGs are not displayed when SC service group is selected.");
			scenarioFlag.add(false);
		}
		action.sendKeys(Keys.ESCAPE).build().perform();
		// when SG is SI
		serviceGrp = "SI";
		selectSG(serviceGrp);
		if (getText(SSG_Option).contains(serviceGrp)) {
			logPass("SI SSGs are displayed when SI service group is selected.");
			scenarioFlag.add(true);
		} else {
			logFail("SI SSGs are not displayed when SI service group is selected.");
			scenarioFlag.add(false);
		}
		action.sendKeys(Keys.ESCAPE).build().perform();

		// By Default Market - Market Unit - Client Group - Industry Segment data will
		// display.

		String market = getText(Market_Drpdwn.findElement(By.xpath(".//span/span")));
		String marketUnit = getText(Market_Unit_Drpdwn.findElement(By.xpath(".//span/span")));
		String clientGrp = getText(client_Group_Drpdwn.findElement(By.xpath(".//span/span")));
		String industrySegmnt = getText(Industry_Segement_Drpdwn.findElement(By.xpath(".//span/span")));
		if (market != "" && marketUnit != "" && clientGrp != "" && industrySegmnt != "") {
			logPass("Market, Market Unit, Client Group,Industry Segment data is displayed by default.");
			scenarioFlag.add(true);
		} else {
			logFail("Market, Market Unit, Client Group,Industry Segment data is not displayed by default.");
			scenarioFlag.add(false);
		}

		clickElement(Subservice_Group_Drpdwn);
		clickElement(SSG_Option);
		action.sendKeys(Keys.ESCAPE).build().perform();

		// Market Unit & Client Group data will display on the bases of Market.
		String optionSelected = "", muValue = "", cgValue = "";
		// For EMEA market
		optionSelected = "Gallia";
		selectMarket("EMEA");
		clickElement(Market_Unit_Drpdwn);
		muValue = getText(market_CG_Option);
		clickElement(market_CG_Option);
		clickElement(client_Group_Drpdwn);
		cgValue = getText(market_CG_Option);
		action.sendKeys(Keys.ESCAPE).build().perform();
		if (muValue.contains(optionSelected) && cgValue.contains(optionSelected)) {
			logPass("Market Unit & Client Group data is displayed on the basis of EMEA Market.");
			scenarioFlag.add(true);
		} else {
			logFail("Market Unit & Client Group data is not displayed on the basis of EMEA Market.");
			scenarioFlag.add(false);
		}
		// For Growth market
		optionSelected = "ANZ";
		selectMarket("Growth Markets");
		clickElement(Market_Unit_Drpdwn);
		muValue = getText(market_CG_Option);
		waitForElementToBeVisible(market_CG_Option);
		clickElement(market_CG_Option);
		clickElement(client_Group_Drpdwn);
		cgValue = getText(market_CG_Option);
		action.sendKeys(Keys.ESCAPE).build().perform();
		if (muValue.contains(optionSelected) && cgValue.contains(optionSelected)) {
			logPass("Market Unit & Client Group data is displayed on the basis of Growth Market.");
			scenarioFlag.add(true);
		} else {
			logFail("Market Unit & Client Group data is not displayed on the basis of Growth Market.");
			scenarioFlag.add(false);
		}
		// For North America market
		optionSelected = "Midwest";
		selectMarket("North America");
		clickElement(Market_Unit_Drpdwn);
		muValue = getText(market_CG_Option);
		clickElement(market_CG_Option);
		clickElement(client_Group_Drpdwn);
		cgValue = getText(market_CG_Option);
		action.sendKeys(Keys.ESCAPE).build().perform();
		if (muValue.contains(optionSelected) && cgValue.contains(optionSelected)) {
			logPass("Market Unit & Client Group data is displayed on the basis of NA Market.");
			scenarioFlag.add(true);
		} else {
			logFail("Market Unit & Client Group data is not displayed on the basis of NA Market.");
			scenarioFlag.add(false);
		}

		// Stage & Elgible Flag by default will be filled.
		String stage = getText(Stage_Drpdwn.findElement(By.xpath(".//span/span")));
		String eligibleFlag = getText(Eligible_Flag_Drpdwn.findElement(By.xpath(".//span/span")));
		if (stage != "" && eligibleFlag != "") {
			logPass("Stage and Eligible Flag is filled by default.");
			scenarioFlag.add(true);
		} else {
			logFail("Stage and Eligible Flag is not filled by default.");
			scenarioFlag.add(false);
		}

		// Lead By* dropdown will enable when user select Technology in the Responsible
		// Delivery Entity * dropdown.
		// Otherwise it will display as disable (greyout).
		jse.executeScript("arguments[0].scrollIntoView(true);", Stage_Drpdwn);
		String ledByClass = Led_By_Drpdwn.getAttribute("class");
		String ledByClassAttribute = Led_By_Drpdwn.getAttribute("aria-disabled");
		if (ledByClass.contains("disabled") && ledByClassAttribute.equals("true")) {
			logPass("Led by is disabled when technology is not selected.");
			scenarioFlag.add(true);
		} else {
			logFail("Led by is enabled when technology is not selected.");
			scenarioFlag.add(false);
		}

		clickElement(Responsible_Entity_Drpdwn);
		clickElement(Tech_Option);
		ledByClass = Led_By_Drpdwn.getAttribute("class");
		ledByClassAttribute = Led_By_Drpdwn.getAttribute("aria-disabled");
		if (!ledByClass.contains("disabled") && ledByClassAttribute.equals("false")) {
			logPass("Led by is enabled when technology is selected.");
			scenarioFlag.add(true);
		} else {
			logFail("Led by is disabled when technology is selected.");
			scenarioFlag.add(false);
		}
		if (!scenarioFlag.contains(false)) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	public void selectSG(String value) throws Exception {
		waitForElementToBeVisible(Service_Group_Drpdwn);
		clickElement(Service_Group_Drpdwn);
		WebElement serviceGroupvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + value + "')]"));
		clickElement(serviceGroupvalue);
		clickElement(Subservice_Group_Drpdwn);
	}

	public void selectMarket(String value) throws Exception {
		clickElement(Market_Drpdwn);
		WebElement marketvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + value + "')]"));
		clickElement(marketvalue);
	}

	/**
	 * TC_15: Validate After clicking on Cancel button.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nisha.maheswaran
	 * 
	 */
	public void ValidatecreateInterimDealCancel() throws Exception {
		boolean scenarioFlag = true;
		loader();
		// Click on create Interim button
		clickElement(Create_Interim_Btn);
		enterMadatoryFields(ConstantUtils.FilePath_InterimDeal_NextGen, "InterimDeal");

		clickElement(Cancel_Btn);

		if (getText(serviceLevelvalue).equals("Select")) {
			logPass("On clicking cancel button all the mandatory filled data got vanished and default data for some fields are display as usual");
		} else {
			logFail("On clicking cancel button all the mandatory filled data are not removed");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();

	}

	/**
	 * TC_14: Validate message display after clicking on Generate Deal button.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nisha.maheswaran
	 * 
	 */
	public String ValidatecreateInterimDeal() throws Exception {
		boolean scenarioFlag = true;
		refreshScreen();
		String createdInterimDeal = "";
		List<Boolean> Flag = new ArrayList<>();
		// Click on Generate_Deal button
		clickElement(Generate_Deal_Btn);
		if (getText(showErrorMsg).equals("Please fill all the mandatory fields highlighted"))
			Flag.add(true);
		else
			Flag.add(false);
		enterMadatoryFields(ConstantUtils.FilePath_InterimDeal_NextGen, "InterimDeal");

		clickElement(Generate_Deal_Btn);

		waitForElementToAppear(Interim_Deal_Generated);
		createdInterimDeal = getText(Interim_Deal_Generated);
		if (createdInterimDeal.contains("TECH-"))
			Flag.add(true);
		else
			Flag.add(false);
		if (!Flag.contains(false)) {
			logPass("SA is able to generate Interim Deal");
		} else {
			logFail("SA is not able to generate Interim Deal");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();

		return createdInterimDeal;

	}

	/**
	 * Method to create an Interim deal.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nisha.maheswaran
	 * 
	 */
	public void enterMadatoryFields(String FilePath, String Sheet) throws Exception {

		ArrayList<String> interimData = new ArrayList<String>();
		// Reading Interim data from excel.

		String serviceValue = SetExcelPath(FilePath, Sheet, 1, 1);

		// Select Service Level
		waitForElementToAppear(ServiceLevelDrp);
		jsClick(ServiceLevelDrp);
		WebElement serviceLevelvalue = getDriver()
				.findElement(By.xpath("//*[@role='option']/span[contains(text(),'" + serviceValue + "')]"));
		jsClick(serviceLevelvalue);
		for (int i = 2; i <= 15; i++) {
			interimData.add(SetExcelPath(FilePath, Sheet, i, 1));
		}
		logInfo("interimData: " + interimData);
		configureOpportunityDetails(interimData);
		scrollToElement(TimelinesAccordion);
		clickElement(TimelinesAccordion);
		String dateProposal = SetExcelPath(FilePath, Sheet, 15, 1);
		// Enter Proposal Submission Date
		clickElement(Proposal_Submission_Date);
		datePicker(dateProposal);

	}

	/**
	 * TC_17: Validate Edit icon inside Action column under Opportunity dashboard
	 * interim deal screen.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nisha.maheswaran
	 * 
	 */
	public void navigateEditInterimdeal(String OppId) throws Exception {
		boolean scenarioFlag = true;
		// Click on Opportunities Link
		clickElement(Total_opportunitieslink);
		sendKeys(opportunitypage_inputbox, OppId);
		clickElement(EditIcon);
		waitForElementToAppear(Opportunity_Name_Txtbox);
		if (isDisplayed(Opportunity_Name_Txtbox))
			logPass("On clicking edit icon user is redirected to Interim Deal creation screen successfully.");
		else {
			logFail("On clicking edit icon user not redirected to Interim Deal creation screen successfully.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();

	}

	/**
	 * TC_18: Verify Interim Deal Creation Screen after clicking on Edit Icon.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nisha.maheswaran
	 * 
	 */
	public void validateMandatoryFields(String FilePath, String Sheet) throws Exception {
		boolean scenarioFlag = true;
		ArrayList<String> interimData = new ArrayList<String>();
		// Reading Interim data from excel.
		for (int i = 0; i <= 15; i++) {
			interimData.add(SetExcelPath(FilePath, Sheet, i, 1));
		}
		logInfo("interimData: " + interimData);

		boolean mmsid = MmsId.isEnabled();
		boolean serviceLevel = getText(ServiceLevelDrp.findElement(By.xpath(".//span/span")))
				.equals(interimData.get(1));
		boolean SG = getText(Service_Group_Drpdwn.findElement(By.xpath(".//span/span"))).equals(interimData.get(4));
		boolean SSG = getText(Subservice_Group_Drpdwn.findElement(By.xpath(".//span//span")))
				.equals(interimData.get(5));
		boolean market = getText(Market_Drpdwn.findElement(By.xpath(".//span/span"))).equals(interimData.get(6));
		boolean marketUnit = getText(Market_Unit_Drpdwn.findElement(By.xpath(".//span/span")))
				.equals(interimData.get(7));
		boolean clientGrp = getText(client_Group_Drpdwn.findElement(By.xpath(".//span/span")))
				.equals(interimData.get(8));
		boolean industry = getText(Industry_Segement_Drpdwn.findElement(By.xpath(".//span/span")))
				.equals(interimData.get(9));
		boolean stage = getText(Stage_Drpdwn.findElement(By.xpath(".//span/span"))).equals(interimData.get(10));
		boolean sellingCountry = getText(selling_Country_Drpdwn.findElement(By.xpath(".//span/span")))
				.equals(interimData.get(11));
		boolean eligibleFlag = getText(Eligible_Flag_Drpdwn.findElement(By.xpath(".//span/span")))
				.equals(interimData.get(12));
		boolean currency = getText(Currency_Drpdwn.findElement(By.xpath(".//span/span"))).equals(interimData.get(13));
		boolean RDE = getText(Responsible_Entity_Drpdwn.findElement(By.xpath(".//span/span")))
				.equals(interimData.get(14));
		if (!mmsid && serviceLevel && SG && SSG && market && marketUnit && clientGrp && industry && stage
				&& sellingCountry && eligibleFlag && currency && RDE)
			logPass(" All the mandatory details are displaying as user selected.");
		else {
			logFail(" All the mandatory details are not displaying as user selected.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();

	}

	/**
	 * TC_19: Verify by changing the data. TC_20: Verify UI/Functionality flow of
	 * the application
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nisha.maheswaran
	 * 
	 */
	public void editInterimdeal(String OppId, String FilePath, String Sheet) throws Exception {
		boolean scenarioFlag = true;
		List<Boolean> Flag = new ArrayList<>();

		String OpportunityName = SetExcelPath(FilePath, Sheet, 2, 1);
		// navigate to Interim Deal Creation screen
		// navigateEditInterimdeal(OppId);
		// TC_19: Verify by changing the data.
		clear(Opportunity_Name_Txtbox);
		sendKeys(Opportunity_Name_Txtbox, "InterimTesting");
		clickElement(Cancel_Btn);
		waitForElementToAppear(Opportunity_Name_Txtbox);
		waitForElementToBeVisible(Opportunity_Name_Txtbox);
		waitForElementToAppear(Generate_Deal_Btn);
		String OpportunityNameUI = Opportunity_Name_Txtbox.getAttribute("value");
		logInfo("OpportunityNameUI: " + OpportunityNameUI + " OpportunityName: " + OpportunityName);
		if (OpportunityNameUI.equals(OpportunityName))
			Flag.add(true);
		else
			Flag.add(false);
		loader();
		clear(Opportunity_Name_Txtbox);
		sendKeys(Opportunity_Name_Txtbox, "InterimTesting");
		clickElement(Generate_Deal_Btn);
		loader();
		waitForElementToAppear(Opportunity_Name);
		waitForElementToBeVisible(Opportunity_Name);
		String oppName = getText(Opportunity_Name);
		logInfo("oppName: " + oppName);
		if (oppName.equals("InterimTesting"))
			Flag.add(true);
		else
			Flag.add(false);
		if (!Flag.contains(false)) {
			logPass("User able to edit the data");
		} else {
			logFail("User not able to edit the data");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();

	}

	public void configureOpportunityDetails(ArrayList<String> interimData) throws Exception {
		// Enter opportunity Name
		// Service level drpdwn
		waitForElementToAppear(ServiceLevelDrp);
		clickElement(ServiceLevelDrp);
		waitForElementToBeVisible(Service_Drpdwn_Option);
		clickElement(Service_Drpdwn_Option);

		waitForElementToBeVisible(Opportunity_Name_Txtbox);
		sendKeys(Opportunity_Name_Txtbox, interimData.get(0));

		// Enter Customer Relationship Name
		jsClick(Customer_Relationship_Txtbox);
		waitForElementToAppear(Customer_Relationship_Popup);
		try {
			clickElement(Customer_Relationship_Popup);
		} catch (Exception e) {
			jsClick(Customer_Relationship_Popup);
		}
		clear(Customer_Relationship_Popup);

		for (int i = 0; i < interimData.get(1).length(); i++) {
			char custRelationshipChar = interimData.get(1).charAt(i);
			String custRelationshipInput = new StringBuilder().append(custRelationshipChar).toString();
			sendKeys(Customer_Relationship_Popup, custRelationshipInput);

		}

		waitForElementToAppear(Customer_Relationship_Suggestion);
		clickElement(Customer_Relationship_Suggestion);
		clickElement(Cust_Rel_Search_Btn);

		waitForElementToBeVisible(Cust_Relationship_List);
		clickElement(Cust_Relationship_List.get(0));

		try {
			clickElement(Cust_Rel_Save_Btn);
		} catch (Exception e) {
			logInfo("Customer relationship save click failed.");
		}

		// Enter Service Group
		waitForElementToBeVisible(Service_Group_Drpdwn);
		clickElement(Service_Group_Drpdwn);
		WebElement serviceGroupvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(2) + "')]"));
		clickElement(serviceGroupvalue);

		// Enter Market
		clickElement(Market_Drpdwn);
		WebElement marketvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(4) + "')]"));
		clickElement(marketvalue);

		// Enter Sub Service Group
		clickElement(Subservice_Group_Drpdwn);
		WebElement subserviceGroupvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(3) + "')]"));
		clickElement(subserviceGroupvalue);
		action.sendKeys(Keys.ESCAPE).build().perform();

		jse.executeScript("arguments[0].scrollIntoView(true);", Opportunity_Name_Txtbox);
		// Enter Market Unit
		clickElement(Market_Unit_Drpdwn);
		WebElement marketunitvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(5) + "')]"));
		clickElement(marketunitvalue);

		// Enter client Group
		clickElement(client_Group_Drpdwn);
		WebElement clientgroupvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(6) + "')]"));
		clickElement(clientgroupvalue);

		// Enter Industry Segment
		clickElement(Industry_Segement_Drpdwn);
		WebElement industrySegmentvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(7) + "')]"));
		clickElement(industrySegmentvalue);

		// Enter Stage
		clickElement(Stage_Drpdwn);
		WebElement stagevalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(8) + "')]"));
		clickElement(stagevalue);

		// Enter Selling Country
		clickElement(selling_Country_Drpdwn);
		WebElement sellingcountryvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(9) + "')]"));
		clickElement(sellingcountryvalue);

		// Enter Eligibility Flag
		clickElement(Eligible_Flag_Drpdwn);
		WebElement eligiblevalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(10) + "')]"));
		clickElement(eligiblevalue);

		// Enter Currency
		jse.executeScript("arguments[0].scrollIntoView(true);", client_Group_Drpdwn);
		waitForElementToBeVisible(Currency_Drpdwn);
		clickElement(Currency_Drpdwn);
		WebElement currencyvalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(11) + "')]"));
		clickElement(currencyvalue);

		// Enter RDE
		clickElement(Responsible_Entity_Drpdwn);
		WebElement rdevalue = getDriver()
				.findElement(By.xpath("//*[@role='listbox']//span[contains(text(),'" + interimData.get(12) + "')]"));
		clickElement(rdevalue);
	}

}
