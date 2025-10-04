package testScripts.Parameters;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Manage_SA_Page;
import pageObjects.Parameter_Page;
import pageObjects.SolutionComponentsPage;
import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import testComponents.Login;

public class TestCases_Parameters extends Login{
	
	SolutionComponentsPage solComponent;
	Parameter_Page parameter;
	Manage_SA_Page ManageSAPage;
	
	String OppID = "", version = "";


	@Test(dependsOnMethods={"LoginApplication"})
	public void Parameter() throws Exception {
	
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		solComponent = PageFactory.initElements(getDriver(), SolutionComponentsPage.class);
		parameter = PageFactory.initElements(getDriver(), Parameter_Page.class);
		
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA");
		
		ManageSAPage.navigatetoMMSID(OppID);
		
		scenario("TC_11: Validate if the SA is able to navigate to Manage Version Screen on click Solution components.");
		solComponent.navigateToManageVersionPage();
		
		scenario("TC_12: Validate if SA is able to create a new Version on click of Create Version button.\r\n"
				+ "TC_13: Validate if SA is able to add Version Name, Solution Type,Self Enable Pricing , Version Flow, Milestone and save the version.");
		solComponent.createNewVersion_WithDetails();
		
		version = solComponent.RefreshVersion();
		solComponent.navigateBackToVersion();
		
		scenario("TC_14: Validate if the SA is able to copy an exiting Version using copy button in actions column.");
		solComponent.CopyVersion(version);
		
		solComponent.RefreshVersion();
		
		parameter.NavigateToParameter();
		
		scenario("TC_26: Validate if the SA is able to fill the input fields like Start Date,End Date Deal Currency and Onshore/offshore split, etc and save the screen.");
		parameter.fillData_ParameterScreen(ConstantUtils.TestData_Parameter);
		
		
		
		
		
		
		
		
	}
	
	
	

}
