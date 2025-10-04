package testScripts.Flow;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;
import testComponents.BaseTest;

public class TestCases_GeneratePricing extends TestCases_TaxInput_page{
	 
	@Test(dependsOnMethods={"TaxInput"})
	public void GeneratePricing() throws Exception {		
	
		solComponent.NavigatetoPreviousScreens();
		parameter.NavigateToParameter();
		parameter.addDate(ConstantUtils.TestData_Parameter, "NewDSPTestData", 13);
		
		solComponent.NavigatetoNextScreens();
		Navigate_to_Screen(GlobalScreen.GENERATE_PRICING);		
        app_loader(getDriver().findElement(By.id("ng-loaderimgShaping")));
      
		scenario("TC 107 : Validate if user is able to navigate to Generate Pricing tab and view Costing Factor, Pricing Factor,ADL Status,Pricing Status,one click pricing tabs.");
		generatePricingPage.GeneratePricingTabsValidation();
		
		scenario("TC 108 : Validate if the user is able to configure Contractual COLA Coverage,FX Risk,Transition Account,Bank Warranty under Costing Factor Screen.");
		generatePricingPage.ConfigureCostingFactorSubscreen(ConstantUtils.FilePath_GeneratePricing, "Costing Factor"); 
		
		Navigate_to_subTab(GlobalScreen.SUBTAB_PRICING_FACTORS);
		
		scenario("TC 109 : Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.");
		generatePricingPage.ConfigurePricingFactorSubscreen(ConstantUtils.FilePath_GeneratePricing, "PricingSheet", 0, 0);
		
		
//		solComponent.GenerateADL();
	    
		scenario("TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL."+
		"TC 111 : Validate if SA is able to see the ADL generation status in ADL status tab and able to download it from ADL Status tab.");
	    generatePricingPage.generateADL();
	    
	    /*
	     * This scenario cannot be run in parallel prod because of request pricing limitations.
	     * 
	     * scenario("TC 112 : Validate if SA is able to see the RP status in Pricing Status tab and is able to navigate to MMP Griddy.");
	     * generatePricingPage.validateMMPGriddy();
	     */
	     
		
		scenario("TC_114: Validate if SA is able to Create Cluster.");
		generatePricingPage.validateCreateCluster();
		
		scenario("TC_115: Validate if SA is able to Edit Cluster.");
		generatePricingPage.validateEditCluster();
		
		scenario("TC_116: Validate if SA is able to Delete Cluster.");
		generatePricingPage.validateDeleteCluster();
		
		scenario("TC_117: Validate if SA is able to Simulate one click pricing with MME Hours and Standard Hours.");
    	generatePricingPage.validateMMEAndStandardhrs(ConstantUtils.FilePath_GeneratePricing,"GeneratePricing");
		
    	 /*
	     * This scenario cannot be run in parallel prod because of request pricing limitations.
	     * 
	     * scenario("TC_118: Validate Actual and No Tax MMP KDA generation");
	     * generatePricingPage.validateActualAndNoTaxMMP();
	     */
		
		
		/*
		 * BUG 3501902 in Generate Pricing ADL Status screen
		 */
		scenario("TC_119: Validate if changes made in Profile and Group tabs reflect in ADL and KDA reports generated.");
		generatePricingPage.validateChangesForProfileAndGroups();
		
		scenario("TC_120: Validate if SA is able to abort on going Cost Simulation");
		generatePricingPage.validateAbortCostSimulation(ConstantUtils.FilePath_GeneratePricing,"GeneratePricing");
	
	}

}
