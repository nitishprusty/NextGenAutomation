package pageObjects;

import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import reusableComponents.ConstantUtils;
import reusableComponents.ExcelUtilities;

public class OpportunitySelfAssign_Page extends BasePage {

	Actions actions = new Actions(getDriver());

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Self Assign')]")
	public WebElement OpportunitySelfAssign;

	@FindBy(how = How.XPATH, using = "//div[@role='tab']")
	public List<WebElement> TabList;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-main-header']//img")
	public List<WebElement> ProfileNotification_Icon;

	@FindBy(how = How.XPATH, using = "//*[@alt='mySP-logo']")
	public WebElement ISPlogo_Icon;//

	@FindBy(how = How.XPATH, using = "//div[@class='drop-down-container']//mat-select")
	public List<WebElement> Fields_DrpDwn;

	@FindBy(how = How.XPATH, using = "//mat-icon[text()='keyboard_arrow_up']")
	public WebElement Close_DrpDwn;

	@FindBy(how = How.XPATH, using = "//*[@class=contains(text(),'mat-select')]//span[text()='Growth Markets']")
	public WebElement Market_DrpDwn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Market Unit')]//..//span[text()='Select']")
	public WebElement MarketUnit_DrpDwn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'CG')]//..//span[text()='Select']")
	public WebElement Cg_DrpDwn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Service Group')]//..//span[text()='Select']")
	public WebElement Service_DrpDwn;

	@FindBy(how = How.XPATH, using = "//*[@class=contains(text(),'mat-select')]//span[text()='UnAssigned Opportunities']")
	public WebElement Opportuntiy_DrpDwn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Eligibility')]//..//span[text()='Eligible']")
	public WebElement Eligibility_DrpDwn;

	@FindBy(how = How.XPATH, using = "//p[text()='Client Name']//..//input")
	public WebElement ClientName_Field;

	@FindBy(how = How.XPATH, using = "//i[text()='search']//..//input")
	public WebElement SearchMMSId_Icon;

	@FindBy(how = How.XPATH, using = "//div[@ref='headerRoot']//div[@role='columnheader']//span[@ref='eText']")
	public List<WebElement> Grid_Fields;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Clear All')]")
	public WebElement Clear_All;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
	public WebElement Search_Button;

	@FindBy(how = How.XPATH, using = "//*[@role='listbox']//span")
	public List<WebElement> DrpDwnList;

	@FindBy(how = How.XPATH, using = "//*[@class='buttons']//button")
	public List<WebElement> Clear_SearchButton;

	@FindBy(how = How.XPATH, using = "//*[@role='rowgroup']//div[@row-id='0']//span")
	public List<WebElement> Added_FieldValues;

	@FindBy(how = How.XPATH, using = "//*[@role='rowgroup']//div[@row-id='0']")
	public WebElement Added_Field;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='MMSID Search']")
	public WebElement searchMMSID;

	@FindBy(how = How.XPATH, using = "//div[@row-index='0']//div[@col-id='actionIcon' and @role='gridcell']//img")
	public WebElement ActionIconMMSID;

	@FindBy(how = How.XPATH, using = "//h4[text()=contains(text(),'Assign Role')]")
	public WebElement AssignRolePopup;

	@FindBy(how = How.XPATH, using = "//div[@class='input-field-left']//span[text()='Select']")
	public WebElement AssignRoleDropdown;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']")
	public WebElement AssignRoleDropdownValues;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public WebElement AssignRoleValue;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-button-wrapper' and contains(text(),'Cancel')]")
	public WebElement AssignRoleCancel;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-button-wrapper' and contains(text(),'Assign')]")
	public WebElement AssignRoleAssign;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Email Notification')]")
	public WebElement EmailNotification;

	@FindBy(how = How.XPATH, using = "//div[@class='btn-wrap']//button[text()='Yes']")
	public WebElement EmailNotificationYes;

	@FindBy(how = How.XPATH, using = "//div[@class='search_btn']//button")
	public WebElement Search;

	@FindBy(how = How.XPATH, using = "//div[@class='btn-wrap']//button[text()='No']")
	public WebElement EmailNotificationNo;

	@FindBy(how = How.XPATH, using = "//img[@id='chatbtn']")
	public WebElement DisAA;

	@FindBy(how = How.XPATH, using = "//img[@id='supbtn2']")
	public WebElement SupportIcons;

	@FindBy(how = How.XPATH, using = "//div[text()='Pipeline Entry Date From']/..//input")
	public WebElement PipelineFrom;

	@FindBy(how = How.XPATH, using = "//div[text()='Pipeline Entry Date To']/..//input")
	public WebElement PipelineTo;

	@FindBy(how = How.XPATH, using = "//a[text()='Manage']")
	public WebElement ManageBtn;

	@FindBy(how = How.XPATH, using = "(//button[@aria-label='Open calendar']//img)[1]")
	public WebElement DatePickerFrom;

	@FindBy(how = How.XPATH, using = "(//button[@aria-label='Open calendar']//img)[3]")
	public WebElement DatePickerTo;

	@FindBy(how = How.XPATH, using = "//button[@aria-pressed='true']")
	public WebElement SelectedDate;

	@FindBy(how = How.XPATH, using = "//mat-icon[@role='img' and text()='close']")
	public WebElement Selected_Element;

	@FindBy(how = How.XPATH, using = "//p[text()='Client Name']//..//li[1]")
	public WebElement Client_Name;

	public OpportunitySelfAssign_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}

	public void navigateToManage() throws Exception {

		waitForElementToAppear(ManageBtn);
		clickElement(ManageBtn);

	}

	/**
	 * This Method is to check user is able to see opportunity "self assign" button
	 * in opportunity tiles.
	 * 
	 * @since 15/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void opportunitySelfAssign() throws Exception {

		boolean scenarioFlag = true;

		loader();
		if (isDisplayed(OpportunitySelfAssign))
			logPass("Opportunity Self Assign  is present");
		else {
			logFail("Opportunity Self Assign is not present");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * This Method is to check that on click of self assign button user is able to
	 * navigate opportunity self assign page.
	 * 
	 * @since 15/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void navigateOpportunitySelfAssign() throws Exception {
		boolean scenarioFlag = true;
		loader();
		clickElement(OpportunitySelfAssign);

		String opportunitySelfAssign = TabList.get(1).getAttribute("aria-selected");
		if (opportunitySelfAssign.equals("true"))
			logPass("Successfully navigated to OpportunitySelfAssign Page");
		else {
			logFail("Failed to navigate to OpportunitySelfAssign Page");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * This Method is to check that Profile,bell (Notification)icons are available
	 * in right side of the page
	 * 
	 * @since 15/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void profileNotification() {
		boolean scenarioFlag = true;

		if (isDisplayed(ProfileNotification_Icon.get(1)) && isDisplayed(ProfileNotification_Icon.get(2)))
			logPass("Profile Icon and Notification Icon is present");
		else {
			logFail("Profile Icon and Notification Icon is not present");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * This Method is to check that MYISP Title and accenture logo are available in
	 * left side of the page
	 * 
	 * @since 15/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void ispLogo() {

		boolean ScenarioFlag = true;

		if (isDisplayed(ISPlogo_Icon))
			logPass("IspLogo is present");
		else {
			logFail("IspLogo is not present");
			ScenarioFlag = false;
		}
		if (ScenarioFlag == true)
			scenarioPass();

	}

	/**
	 * This Method is to check that user is be able to search the MMS ID by clicking
	 * on search icon.
	 * 
	 * @since 15/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void searchMms_Id(String OppID) throws Exception {

		boolean ScenarioFlag = true;
		clickElement(SearchMMSId_Icon);
		sendKeys(SearchMMSId_Icon, OppID);
		waitForElementToAppear(Added_Field);
		if (isDisplayed(Added_Field))
			logPass("User is able to search MMSID");
		else {
			logFail("User is not able to search MMSID");
			ScenarioFlag = false;
		}
		if (ScenarioFlag == true)
			scenarioPass();

	}

	/**
	 * This Method is to check that CG and Technology dropdowns are in disabled
	 * state.
	 * 
	 * @since 18/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void cgTechField() throws Exception {
		boolean scenarioFlag = true;

		String cgDrpdwn = Fields_DrpDwn.get(2).getAttribute("aria-disabled");
		String techdrpdwn = Fields_DrpDwn.get(6).getAttribute("aria-disabled");
		if (cgDrpdwn.equals("true") && techdrpdwn.equals("true"))
			logPass("CG and Technology Fields are by default disabled.");
		else {
			logFail("CG and Technology Fields are by default not disabled. ");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * This Method is to validate that Market, Market Unit, CG,Service group,
	 * Opportunity type,eligibility, client name,Technology dropdowns are available
	 * with Proper data and Market and opportunity types should be selected by
	 * deafult as Unassigned and growth market
	 * 
	 * @since 18/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public String checkFields(String FilePath, String Sheet, int Row, int Col) throws Exception {

		boolean scenarioFlag = true;

		clickElement(MarketUnit_DrpDwn);
		String marketUnit = ExcelUtilities.SetExcelPath(FilePath, Sheet, 0, 1);

		for (WebElement element : DrpDwnList) {
			if (element.getText().trim().equals(marketUnit)) {
				clickElement(element);
				logInfo("Market Unit from dropdown is selected");

				break;
			}

		}

		actions.click(Close_DrpDwn).build().perform();

		clickElement(Cg_DrpDwn);
		String cg = ExcelUtilities.SetExcelPath(FilePath, Sheet, 1, 1);

		for (WebElement cgelement : DrpDwnList) {
			if (cgelement.getText().trim().equals(cg)) {
				clickElement(cgelement);
				logInfo("CG from dropdown is selected");
				break;
			}
		}
		actions.click(Close_DrpDwn).build().perform();

		clickElement(Service_DrpDwn);
		String service = ExcelUtilities.SetExcelPath(FilePath, Sheet, 2, 1);
		for (WebElement sergrp : DrpDwnList) {
			if (sergrp.getText().trim().equals(service)) {
				clickElement(sergrp);
				logInfo("Service Group from dropdown is selected");
				break;
			}
		}

		actions.click(Close_DrpDwn).build().perform();

		clickElement(Eligibility_DrpDwn);
		String eligiblity = ExcelUtilities.SetExcelPath(FilePath, Sheet, 3, 1);

		for (WebElement ele : DrpDwnList) {
			if (ele.getText().trim().equals(eligiblity)) {
				clickElement(ele);
				logInfo("Eligiblity from dropdown is selected");
				break;
			}
		}

		clickElement(ClientName_Field);
		String clientname = ExcelUtilities.SetExcelPath(FilePath, Sheet, 4, 1);
		sendKeys(ClientName_Field, clientname);
		String clientName = getText(Client_Name);
		clickElement(Client_Name);

		loader();

		String marketDrpdwn = getText(Market_DrpDwn);
		String oppTypesDrpdwn = getText(Opportuntiy_DrpDwn);
		if (marketDrpdwn.equalsIgnoreCase("Growth Markets")
				&& oppTypesDrpdwn.equalsIgnoreCase("UnAssigned Opportunities"))
			logPass("Market and Opportunity Fields are by default set as Growth Markets and UnAssigned Opportunities");
		else {
			logFail("Market and Opportunity Fields are by default not set as Growth Markets and UnAssigned Opportunities");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

		return clientName;

	}

	/**
	 * This Method is to validate that Pipeline entry date from and Pipeline entry
	 * date to fields is available with selected Date.
	 * 
	 * @since 18/02/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */
	public void pipelineDate() throws Exception {
		boolean scenarioFlag = true;

		if (isDisplayed(PipelineFrom) && isDisplayed(PipelineTo)) {
			clickElement(DatePickerFrom);
			if (isDisplayed(SelectedDate)) {
				logInfo("Selected Date for Pipeline Date From: " + SelectedDate.getAttribute("aria-label"));
				clickElement(SelectedDate);
			} else {
				scenarioFlag = false;
				logFail("Date is not selected for Pipeline entry date from");
			}
			clickElement(DatePickerTo);
			if (isDisplayed(SelectedDate)) {
				logInfo("Selected Date for Pipeline Date To: " + SelectedDate.getAttribute("aria-label"));
				clickElement(SelectedDate);
			} else {
				scenarioFlag = false;
				logFail("Date is not selected for Pipeline entry date To");
			}
		} else {
			scenarioFlag = false;
			logFail("Pipeline entry date from and Pipeline entry date to fields are not available in the page");
		}

		if (scenarioFlag == true)
			logPass("Pipeline entry date from and Pipeline entry date to fields are available with selected Date");
		else {
			scenarioFlag = false;
			logFail("Pipeline entry date from and Pipeline entry date to fields are not available with selected Date");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * This Method is to check that Clear all and search button is available.
	 * 
	 * @since 18/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void clearSearchButton() {

		boolean ScenarioFlag = true;

		if (isDisplayed(Clear_All) && isDisplayed(Search_Button))
			logPass("Clear All and Search Button is present");
		else {
			logFail("Clear All and Search Button is not present");
			ScenarioFlag = false;
		}
		if (ScenarioFlag == true)
			scenarioPass();

	}

	/**
	 * This Method is to check that Client name, Opportunity name,Applicable SG Deal
	 * on hold,RDE,CG and Actions fields are available in the grid.
	 * 
	 * @since 19/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */
	public void fieldsInGrid() throws Exception {
		boolean ScenarioFlag = true;
		boolean found = true;
		ArrayList<String> columnHeaderNames = new ArrayList<>(Arrays.asList("MMS ID", "Assignment-SG", "Client Name",
				"Opportunity Name", "Applicable SG (Based on MMS)", "Deal On Hold", "RDE", "CG", "Actions"));
		ArrayList<String> Grid_FieldsUI = new ArrayList<>();
		for (int i = 0; i < Grid_Fields.size(); i++) {
			Grid_FieldsUI.add(getText(Grid_Fields.get(i)));
			clickElement(Grid_Fields.get(i));
			actions.sendKeys(Keys.RIGHT).build().perform();

		}
		// System.out.println(Grid_FieldsUI);
		if (Grid_FieldsUI.containsAll(columnHeaderNames)) {
			found = true;
		} else {
			found = false;
		}

		if (found == true) {
			logPass(" All field is available in the grid.");
		} else {
			logFail(" All field is not available in the grid.");
			ScenarioFlag = false;
		}
		if (ScenarioFlag == true) {
			scenarioPass();
		}
	}

	/**
	 * This Method is to display data according to Selected MMDID
	 * 
	 * @since 19/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void dataDisplayed() throws Exception {

		boolean ScenarioFlag = true;
		for (int i = 0; i < Added_FieldValues.size() - 1; i++) {
			if (getText(Added_FieldValues.get(i)).isEmpty()) {
				logFail("Data is not displayed for selected MMSID ");
				ScenarioFlag = false;
				break;
			}
		}
		if (ScenarioFlag == true) {
			logPass("Data is displayed for selected MMSID ");
			scenarioPass();
		}
	}

	/**
	 * This Method is to Clear All the fields.
	 * 
	 * @since 19/02/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */

	public void clearAll() throws Exception {
		boolean ScenarioFlag = false;

		String clientName = checkFields(ConstantUtils.FilePath_OppSelfAssign, "Data", 0, 0);

		if (isDisplayed(Selected_Element) && !clientName.isEmpty()) {

			clickElement(Clear_All);

		} else {
			logFail("No Data in the fields to clear");
		}
		if (isDisplayed(MarketUnit_DrpDwn) && isDisplayed(Cg_DrpDwn) && isDisplayed(Service_DrpDwn)
				&& isDisplayed(ClientName_Field)) {
			String cgDrpdwn = Fields_DrpDwn.get(2).getAttribute("aria-disabled");
			if (cgDrpdwn.equals("true"))
				logPass("Fields are cleared when clicking on the Clear All Button.");

		} else {
			logFail("Fields are not cleared when clicking on the Clear All Button.");
		}

		if (ScenarioFlag == true)
			scenarioPass();

	}

	/**
	 * This Method is to validate that on click on Action icon user is able to view
	 * select role drop downs with multiples expected roles along with cancel and
	 * submit button.
	 * 
	 * @since 18/02/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */

	public void actionIcon() throws Exception {
		boolean scenarioFlag = true;
		clickElement(Search);
		clickElement(ActionIconMMSID);
		if (isDisplayed(AssignRolePopup) && isDisplayed(AssignRoleDropdown)) {
			clickElement(AssignRoleDropdown);
			if (isDisplayed(AssignRoleDropdownValues) && isDisplayed(AssignRoleCancel)
					&& isDisplayed(AssignRoleAssign)) {
				logPass("On click on Action icon  user is able to view select  role dropdowns with mutiples expected roles along with cancel and submit button");
			} else {
				scenarioFlag = false;
				logFail("User is not able to view cancel and submit button");
			}
		} else {
			scenarioFlag = false;
			logFail("On click on Action icon  user is not able to view select role dropdowns with mutiples expected roles");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * This Method is to validate that on click on Actions user is able to assign
	 * roles
	 * 
	 * @since 18/02/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */

	public void assignRoles() throws Exception {
		boolean scenarioFlag = true;
		if (isDisplayed(AssignRoleDropdownValues)) {
			clickElement(AssignRoleValue);
			clickElement(AssignRoleAssign);
			logPass("on click on Actions user is able to assign roles");
		} else {
			scenarioFlag = false;
			logFail("on click on Actions user is not able to assign roles");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * This Method is to validate that on click on submit Popup is displaying with
	 * message send Email Notification to StakeHolders with Yes/NO.
	 * 
	 * @since 19/02/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */

	public void sendNotificationYes() throws Exception {

		boolean scenarioFlag = true;

		if (isDisplayed(EmailNotification)) {
			logPass("Clicking on submit Popup is displaying with message send Email Notification to StakeHolders with Yes/NO");

			EmailNotificationYes.click();

			waitForElementToBeVisible(getDriver().findElement(By.xpath("//div[@class='toasterMsg']")));
			String successMsg = getText(getDriver().findElement(By.xpath("//div[@class='toasterMsg']")));

			if (successMsg.trim().contains("Deal has been successfully self-assigned"))
				logPass("Deal has been successfully self Assigned is displayed");
			else {
				scenarioFlag = false;
				logFail("Deal has been successfully self Assigned is not displayed");
			}
		} else {
			scenarioFlag = false;
			logFail("Clicking on submit Popup is not displaying with message send Email Notification to StakeHolders with Yes/NO");
		}
		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * This Method is to validate that clicking on NO Stakeholder should not get
	 * message.
	 * 
	 * @since 19/02/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */

	public void sendNotificationNo() throws Exception {

		boolean scenarioFlag = true;

		clickElement(Search);
		clickElement(ActionIconMMSID);
		clickElement(AssignRoleDropdown);
		clickElement(AssignRoleValue);
		clickElement(AssignRoleAssign);

		if (isDisplayed(EmailNotification)) {
			EmailNotificationNo.click();

			waitForElementToBeVisible(getDriver().findElement(By.xpath("//div[@class='toasterMsg']")));

			String successMsg = getText(getDriver().findElement(By.xpath("//div[@class='toasterMsg']")));

			if (successMsg.trim().contains("Deal has been successfully self-assigned"))
				logPass("Clicking on No Deal has been successfully self Assigned is displayed");
			else {
				scenarioFlag = false;
				logFail("Clicking on No Deal has been successfully self Assigned is not displayed");
			}

			// logPass("clicking on NO Stakeholder is not getting message");
		} else {
			scenarioFlag = false;
			logFail("Clicking on submit Popup is not displaying with message send Email Notification to StakeHolders with Yes/NO");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}

	/**
	 * This Method is to validate that DISSA and Support icons is displaying.
	 * 
	 * @since 19/02/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */
	public void supportIcons() throws Exception {
		boolean scenarioFlag = true;
		if (isDisplayed(DisAA) && isDisplayed(SupportIcons)) {
			logPass("DISSA and Support icons are displaying");
		} else {
			scenarioFlag = false;
			logFail("DISSA and Support icons are not displaying");
		}

		if (scenarioFlag == true)
			scenarioPass();
	}
}