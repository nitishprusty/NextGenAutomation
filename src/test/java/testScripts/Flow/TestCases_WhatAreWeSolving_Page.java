package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import testComponents.BaseTest;

public class TestCases_WhatAreWeSolving_Page extends TestCases_ManageSA{
	
	String OppID_WAWS = "";
	
	@Test(dependsOnMethods ={"ManageSA"})
	public void WhatAreWeSolvingPage() throws Exception{
		
		OppID_WAWS = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA_AMSFlow");
	
		scenario("TC_6: Validate if the SA is able to navigate to opportunity workflow on click of respective MMS ID(AMS).");
		ManageSAPage.navigatetoMMSID(OppID_WAWS);
		
		scenario("TC_7: Validate if the SA is able to view all the components/assets of Opportunity Workflow.");
		ManageSAPage.validateAllComponents();
		
		scenario(" TC_8: Validate if the SA is able to asign required roles to themselves or others from Define Team tab.");
		DefineTeamsPage.addRole();
		
		scenario("TC_9: Validate if What are we solving Questionaire is not attempted, all other components except Define Teams are disable.");
		WAWSPage.validateAllComponentsDisabled();
		
		scenario("TC_10: Validate if What are we solving Questionnaire are attempted, all components on Opportunity Workflow should get enable.");
		WAWSPage.checkAllWAWS_Components();
	}

}
