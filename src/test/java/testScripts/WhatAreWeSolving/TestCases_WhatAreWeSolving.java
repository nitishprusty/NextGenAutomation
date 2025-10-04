package testScripts.WhatAreWeSolving;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.Login_Page;
import pageObjects.Manage_SA_Page;
import pageObjects.WAWS_Page;
import reusableComponents.ConfigFileReader;

public class TestCases_WhatAreWeSolving extends BasePage{

	
	Login_Page loginPage;
	Manage_SA_Page ManageSAPage;
	WAWS_Page WAWSPage;
	String OppID_WAWS = "";

	

	@Test(dependsOnMethods={"LoginApplication"})
	public void WhatAreWeSolvingValidation() throws Exception {
		
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		WAWSPage = PageFactory.initElements(getDriver(), WAWS_Page.class);
		loginPage = PageFactory.initElements(getDriver(), Login_Page.class);
		
		OppID_WAWS = ConfigFileReader.getTestData("OppIDs.OppID_WAWS");

				
		ManageSAPage.navigatetoMMSID(OppID_WAWS);
		
		scenario("TC_10: Validate if What are we solving Questionnaire are attempted, all components on Opportunity Workflow should get enable.");
		WAWSPage.checkAllWAWS_Components();
		
		
		
		
	}
	
}
