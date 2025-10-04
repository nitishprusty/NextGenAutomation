package testScripts.Profiles;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Manage_SA_Page;
import pageObjects.Parameter_Page;
import pageObjects.Profile_Page;
import pageObjects.SolutionComponentsPage;
import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import testComponents.Login;

public class TestCases_Profiles extends Login{
	
	SolutionComponentsPage solComponent;
	Parameter_Page parameter;
	Manage_SA_Page ManageSAPage;
	Profile_Page profile;
	
	String OppID = "", version = "";


	@Test(dependsOnMethods={"LoginApplication"})
	public void Profiles() throws Exception {
	
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		solComponent = PageFactory.initElements(getDriver(), SolutionComponentsPage.class);
		parameter = PageFactory.initElements(getDriver(), Parameter_Page.class);
		profile = PageFactory.initElements(getDriver(), Profile_Page.class);
		
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA");
		
		ManageSAPage.navigatetoMMSID(OppID);
		
		scenario("TC_11: Validate if the SA is able to navigate to Manage Version Screen on click Solution components.");
		solComponent.navigateToManageVersionPage();
		
		scenario("TC_12: Validate if SA is able to create a new Version on click of Create Version button.\r\n"
				+ "TC_13: Validate if SA is able to add Version Name, Solution Type,Self Enable Pricing , Version Flow, Milestone and save the version.");
		solComponent.createNewVersion_WithDetails();
		
		solComponent.RefreshVersion();
		
		parameter.NavigateToParameter();
		
		scenario("TC_26: Validate if the SA is able to fill the input fields like Start Date,End Date Deal Currency and Onshore/offshore split, etc and save the screen.");
		parameter.fillData_ParameterScreen(ConstantUtils.TestData_Parameter);
		
		scenario("TC_27: Validate if the SA able to navigate to profiles tab on click of 'Profiles'.");
		profile.profileScreen();
		
		scenario("TC_28: Validate if the SA is able to view Active,Inactive,Named Resource Report Status and should able to navigate to repective screen.");
		profile.profileScreenTabsValidation();
		
		scenario("TC_30: Validate if the SA is able to add city for existing profile on click of Edit button.");
		profile.add_ProfileCity(ConstantUtils.TestData_Profiles);
		
		scenario("TC_29: Validate if the SA is able to create new profile on click of 'Add Profile Icon'.");
		profile.AddProfile(ConstantUtils.TestData_Profiles, "Profile");
		
		scenario("TC_31: Validate if the SA is able to Edit a profile on click of Edit button under Action column of profile section.");
		profile.editProfile(ConstantUtils.TestData_Profiles, "ProfileParameterChange", 0, 1);
		
		scenario("TC_32: Validate if the SA is able to copy a profile.");
		profile.copyProfile(ConstantUtils.TestData_Profiles, "Profile", 4, 0, 1);
		
		scenario("TC_33: Validate if SA is able to Deactivate a profile and view it under Inactive tab.");
		profile.deactiveProfile(ConstantUtils.TestData_Profiles, "Profile", 7, 0);
		
		scenario("TC_34: Validate if SA is able to active a profile which are deactivated and view it under active tab.");
		profile.activateProfile(ConstantUtils.TestData_Profiles, "Profile",7,0);
		
		
	}

}