package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import reusableComponents.GlobalScreen;
import testComponents.BaseTest;

public class TestCases_SolutionComponent_Page extends TestCases_WhatAreWeSolving_Page{
	
	String version="",OppID_WAWS;

	@Test(dependsOnMethods ={"WhatAreWeSolvingPage"})
	public void SolutionComponent() throws Exception{
//		OppID_WAWS = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA");
//		ManageSAPage.navigatetoMMSID(OppID_WAWS);
		
		scenario("TC_11: Validate if the SA is able to navigate to Manage Version Screen on click Solution components.");
		solComponent.navigateToManageVersionPage();
		
		scenario("TC_12: Validate if SA is able to create a new Version on click of Create Version button.\r\n"
				+ "TC_13: Validate if SA is able to add Version Name, Solution Type,Self Enable Pricing , Version Flow, Milestone and save the version.");
		version = solComponent.createNewVersion_WithDetails();
		
		scenario("TC_14: Validate if the SA is able to copy an exiting Version using copy button in actions column.");
		solComponent.CopyVersion(version);
		
		scenario("TC 18 : Validate if the SA is able to Lock/Unlock the version on click of Lock/Unlock button under Action column.");
		solComponent.Lock_unlock_version();
		
		scenario("TC 19 : Validate if the SA is able to Add comment on click of Comment button under Action column.");
		solComponent.add_comment();
		
		scenario("TC 17 : Validate if the SA is able to Delete a version on click of Delete button under Action column");
		solComponent.DeleteVersion();
		

//		Navigate_to_subTab(GlobalScreen.VERSIONS);
//		solComponent.RefreshVersion();
		
//		solComponent.createNewVersion_WithDetails();
		
//		solComponent.RefreshVersion();
		
		
		
		
	}

}
