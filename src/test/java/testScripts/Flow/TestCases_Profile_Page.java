package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;


public class TestCases_Profile_Page extends TestCases_Parameter_Page{
	
	@Test(dependsOnMethods ={"Parameter"})
	public void Profile() throws Exception{
		
	
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

		scenario("TC_35: Validate if SA is able to Export Named Resource Template, import and then download the Named Resource Tab.");
		profile.validateNameResourceReportTab();
		
		
	}

}
