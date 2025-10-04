package testScripts.ManageSA;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.DefineTeams_Page;
import pageObjects.Login_Page;
import pageObjects.Manage_SA_Page;
import pageObjects.WAWS_Page;
import reusableComponents.ConfigFileReader;
import testComponents.Login;

public class TestCases_ManageSA_AMS_Flow extends Login {
	Login_Page loginPage;
	Manage_SA_Page ManageSAPage;
	WAWS_Page WAWSPage;
	DefineTeams_Page DefineTeamsPage;
	String OppID_To_Link="", OppID_WAWS = "", userId="";
	

	@Test(dependsOnMethods={"LoginApplication"})
	public void ManageSAValidation() throws Exception {
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		loginPage = PageFactory.initElements(getDriver(),Login_Page.class);		
		OppID_To_Link = ConfigFileReader.getTestData("OppIDs.OppID_Interim_Link");
		WAWSPage = PageFactory.initElements(getDriver(), WAWS_Page.class);
		DefineTeamsPage = PageFactory.initElements(getDriver(), DefineTeams_Page.class);
		OppID_WAWS = ConfigFileReader.getTestData("OppIDs.OppID_WAWS"); // Newly created MMSID without WAWS configured is required everytime
		userId = ConfigFileReader.getTestData("credentials.UserID1");
		
		scenario("TC_1: Validate if the SA is able to login as SA at MyISP Next Gen Platform.");		
		loginPage.validateLandingPage();
		
		scenario("TC_2: Validate if the SA is able to navigate to Manage Dashboard on click of manage tab.");
		ManageSAPage.validateManageTab();
		
		scenario("TC_3: Validate if all tiles are present on Manage Dashboard.");
		ManageSAPage.validateAllTilesOnManageDashBoard();		

		scenario("TC_4: Validate if the SA is able to navigate to Opportunity Dashboard on click of Total Opportunity.");
		ManageSAPage.ValidateTotalOppLink();
		
		scenario("TC_5: Validate the Opportunity Dashboard [UI Design, ARC standards, Functionalities-Pin,Edit, Link(Interim)][All,Active,Interim],Log status.");
		ManageSAPage.ValidateOppDashboard(OppID_To_Link, userId);
		
		scenario("TC_6: Validate if the SA is able to navigate to opportunity workflow on click of respective MMS ID(AMS).");
		ManageSAPage.navigatetoMMSID(OppID_WAWS);
		
		scenario("TC_7: Validate if the SA is able to view all the components/assets of Opportunity Workflow.");
		ManageSAPage.validateAllComponents();
		
		scenario(" TC_8: Validate if the SA is able to asign required roles to themselves or others from Define Team tab.");
		DefineTeamsPage.addRole();
		
		scenario("TC_9: Validate if What are we solving Questionaire is not attempted, all other components except Define Teams are disable.");
		WAWSPage.validateAllComponentsDisabled();

	}
}
