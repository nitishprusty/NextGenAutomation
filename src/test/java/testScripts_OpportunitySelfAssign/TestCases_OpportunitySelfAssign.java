package testScripts_OpportunitySelfAssign;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;
import testComponents.Login;
import pageObjects.BasePage;
import pageObjects.OpportunitySelfAssign_Page;
import pageObjects.Login_Page;
import reusableComponents.ConfigFileReader;

public class TestCases_OpportunitySelfAssign extends Login {
	OpportunitySelfAssign_Page opportunitySelfAssignPage;
	String OppID = "";

	@Test(dependsOnMethods={"LoginApplication"})
	public void OpportunitySelfAssignValidation() throws Exception {
		
		opportunitySelfAssignPage = PageFactory.initElements(getDriver(), OpportunitySelfAssign_Page.class);
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_SelfAssign");

		opportunitySelfAssignPage.navigateToManage();
		
		scenario("TC:1 Validate that user is able to see opportunity self assign button in opportunity tiles");
		opportunitySelfAssignPage.opportunitySelfAssign();

		scenario("TC:2 Validate that on click of self assign button user is able to navigate  opportunity self assign page");
		opportunitySelfAssignPage.navigateOpportunitySelfAssign();

		scenario("TC:3 Validate that Profile,bell (Notification)icons are available in right side of the page");
		opportunitySelfAssignPage.profileNotification();

		scenario("TC:4 Validate that MYISP Title and accenture logo are available in left side of the page");
		opportunitySelfAssignPage.ispLogo();

		scenario("TC:5 Validate that user is be able to search the MMS ID by clicking on search icon");
		opportunitySelfAssignPage.searchMms_Id(OppID);
		
		scenario("TC:11 Validate that Clicking on search based on the selection MMS ID should get displayed with all the data");	
		opportunitySelfAssignPage.dataDisplayed();

		scenario("TC:7 Validate that CG and Technology dropdowns are  in disabled state");
		opportunitySelfAssignPage.cgTechField();
		
		scenario("TC:6 Validate that Market, Market Unit, CG,Service group, Opportunity type,eligibility, client name, "
				+ "Technology dropdowns are available with Proper data and Market and opportunity types should be "
				+ "selected by deafult as Unassigned and growth market");
		scenario("TC:12 Validate that on click on Clear All button All all data will be vanished");
		opportunitySelfAssignPage.clearAll();

		scenario("TC:8 Validate that Pipeline entry date from and Pipeline entry date to fields is available with selected Date");
		opportunitySelfAssignPage.pipelineDate();

		scenario("TC:9 Validate that Clear all and search button is available");
		opportunitySelfAssignPage.clearSearchButton();

		scenario("TC:10 Validate that Client name, Opportunity name,Applicable SG Deal on hold,RDE,CG and Actions fields are available in the grid.");
		opportunitySelfAssignPage.fieldsInGrid();

		scenario("TC:13 Validate that on click on Action icon  user is able to view select  role dropdowns with mutiples expected roles along with cancel and submit button.");
		opportunitySelfAssignPage.actionIcon();

		scenario("TC:14 Validate that on click on Actions user is able to assign roles");
		opportunitySelfAssignPage.assignRoles();

		scenario("TC:15 Validate that on click on submit Popup is displaying with message send Email Notification to StakeHolders with Yes/NO.");
		opportunitySelfAssignPage.sendNotificationYes();

		scenario("TC:16 Validate that clicking on NO Stakeholder should not get message");
		opportunitySelfAssignPage.sendNotificationNo();

		scenario("TC:17 Validate that DISSA and Support icons is displaying");
		opportunitySelfAssignPage.supportIcons();
	}
}