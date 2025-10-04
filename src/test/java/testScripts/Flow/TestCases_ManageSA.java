package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import testComponents.BaseTest;

public class TestCases_ManageSA extends BaseTest {
	String OppID_To_Link = "",userId="";
	
	@Test(dependsOnMethods = { "LoginApplication" })
	public void ManageSA() throws Exception {	
		userId = ConfigFileReader.getTestData("credentials.UserID1");
		OppID_To_Link = ConfigFileReader.getTestData("OppIDs.OppID_Interim_Link");
		
		scenario("TC_1: Validate if the SA is able to login as SA at MyISP Next Gen Platform.");
		loginPage.validateLandingPage();

		scenario("TC_2: Validate if the SA is able to navigate to Manage Dashboard on click of manage tab.");
		ManageSAPage.validateManageTab();

		scenario("TC_3: Validate if all tiles are present on Manage Dashboard.");
		ManageSAPage.validateAllTilesOnManageDashBoard();

		scenario(
				"TC_4: Validate if the SA is able to navigate to Opportunity Dashboard on click of Total Opportunity.");
		ManageSAPage.ValidateTotalOppLink();

		scenario(
				"TC_5: Validate the Opportunity Dashboard [UI Design, ARC standards, Functionalities-Pin,Edit, Link(Interim)][All,Active,Interim],Log status.");
		ManageSAPage.ValidateOppDashboard(OppID_To_Link, userId);

	}

}
