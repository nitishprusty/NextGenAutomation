package testScripts.KDA;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import testComponents.BaseTest;

public class TestCases_KDA extends BaseTest{
	
	String OppID_WAWS="";


	@Test(dependsOnMethods ={"LoginApplication"})
	public void KDA() throws Exception{
		
		OppID_WAWS = ConfigFileReader.getTestData("OppIDs.OppID_LastActivity");
		solComponent.NavigatetoSolutionComponents(OppID_WAWS);
		
		solComponent.RefreshVersion("153.00");
		Kda.NavigateToGeneratePricing();
		
		scenario("TC_121 : Validate if SA is able to view CS steps when in progress as well and 'View Simulate Cost and Price' button gets enable when CS is completed.");
		Kda.validateViewSimulate();
		
		scenario("TC_122 : Validate if SA is able to navigate to KDA tab on click of KDA.");
		Kda.navigateToKDAScreen();
		
		scenario("TC_123 : Validate if SA is able to see 'Cost Simulation, MMP and DATA' route option in the KDA dropdown.");
		Kda.KDASourceDropDownValidation();
		
		scenario("TC_124 : Validate if SA is able to navigate to respective KDA based on the selection.");
		Kda.NavigateToKDAReport();
		
		scenario("TC_125 : Validate if SA is able to download CY,FY,MOM, Graph and View KDA reports from CS KDA.");
		Kda.download_CSKDAReports();
		
		scenario("TC_126 : Validate if SA is able to download CY,FY,MOM, Graph and View KDA reports from MMP KDA.");
		Kda.download_MMPKDAReports();

		
	}

}
