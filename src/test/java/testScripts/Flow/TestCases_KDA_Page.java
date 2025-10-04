package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.GlobalScreen;

public class TestCases_KDA_Page extends TestCases_GeneratePricing{
	
	@Test(dependsOnMethods={"GeneratePricing"})
	public void KDA() throws Exception {
		
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
		
		Navigate_to_Screen(GlobalScreen.GENERATE_PRICING);	
		Navigate_to_subTab(GlobalScreen.SUBTAB_PRICING_FACTORS);
		scenario("TC:110 Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.");	    
		generatePricingPage.validateGenerateADLRequestPricing();
		
//		Request Pricing does not work in Parallel Prod.
//		scenario("TC_126 : Validate if SA is able to download CY,FY,MOM, Graph and View KDA reports from MMP KDA.");
//		Kda.download_MMPKDAReports();		
	}

}
