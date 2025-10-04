package testScripts.GeneratePricing;
 
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;
import pageObjects.BasePage;
import pageObjects.Login_Page;

import pageObjects.Manage_SA_Page;
import pageObjects.SolutionComponentsPage;
import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import pageObjects.GeneratePricing_Page;
import pageObjects.SolutionComponentsPage;
 
 
public class TestCases_GeneratePricing extends BasePage{
	Login_Page loginPage;
	SolutionComponentsPage solutionComponentsPage;
	GeneratePricing_Page generatePricingPage;
	
	String UserID = "", Password = "", OppID = "", SolID = "";
	@Parameters("browserType")
	@BeforeMethod(alwaysRun = true)
	public void initialize(String browserType) throws Exception 
	{
		initialSetup();
		startBrowser(browserType);
 
		loginPage = PageFactory.initElements(getDriver(), Login_Page.class);
		solutionComponentsPage = PageFactory.initElements(getDriver(), SolutionComponentsPage.class);
		generatePricingPage = PageFactory.initElements(getDriver(), GeneratePricing_Page.class);
 
		UserID = ConfigFileReader.getTestData("credentials.UserID1");
		Password = ConfigFileReader.getTestData("credentials.Password");
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA");
		
	}
 
	@Test()
	public void GeneratePricingValidation() throws Exception {
		
		scenario("Login mySP Application");
		loginPage.Login(UserID, Password);
		solutionComponentsPage.NavigatetoSolutionComponents(OppID);
		
		solutionComponentsPage.RefreshVersion("717.00");
		solutionComponentsPage.NavigatetoNextScreens();
		Navigate_to_Screen(GlobalScreen.GENERATE_PRICING);
		getDriver().manage().deleteAllCookies();
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
        // Execute the JavaScript code to clear the cache
        js.executeScript("window.localStorage.clear();");
        //getDriver().navigate().refresh();

//		// Configure the version till Tax screen
		
		scenario("TC 107 : Validate if user is able to navigate to Generate Pricing tab and view Costing Factor, Pricing Factor,ADL Status,Pricing Status,one click pricing tabs.");
		generatePricingPage.GeneratePricingTabsValidation();
		
		scenario("TC 108 : Validate if the user is able to configure Contractual COLA Coverage,FX Risk,Transition Account,Bank Warranty under Costing Factor Screen.");
		generatePricingPage.ConfigureCostingFactorSubscreen(ConstantUtils.FilePath_GeneratePricing, "Costing Factor"); 
		
		Navigate_to_subTab(GlobalScreen.SUBTAB_PRICING_FACTORS);
		
		scenario("TC 109 : Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.");
		generatePricingPage.ConfigurePricingFactorSubscreen(ConstantUtils.FilePath_GeneratePricing, "PricingSheet", 0, 0);
		
		scenario("TC:110 Validate if the user is able to configure Working Capital days,Pricing options,Billing options, Service Credits.");	    
		generatePricingPage.validateGenerateADLRequestPricing();
	    
		scenario("TC 111 : Validate if SA is able to see the ADL generation status in ADL status tab and able to download it from ADL Status tab.");
	    generatePricingPage.generateADL();
	    
	    /*
	     * This scenario cannot be run in parallel prod because of request pricing limitations.
	     */
	    scenario("TC 112 : Validate if SA is able to see the RP status in Pricing Status tab and is able to navigate to MMP Griddy.");
	    generatePricingPage.validateMMPGriddy();
		
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
	     */
		scenario("TC_118: Validate Actual and No Tax MMP KDA generation");
		generatePricingPage.validateActualAndNoTaxMMP();
		
		/*
		 * BUG 3501902 in Generate Pricing ADL Status screen
		 */
		scenario("TC_119: Validate if changes made in Profile and Group tabs reflect in ADL and KDA reports generated.");
		generatePricingPage.validateChangesForProfileAndGroups();
		
		scenario("TC_120: Validate if SA is able to abort on going Cost Simulation");
		generatePricingPage.validateAbortCostSimulation(ConstantUtils.FilePath_GeneratePricing,"GeneratePricing");
	
	}
}
