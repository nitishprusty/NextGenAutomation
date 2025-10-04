package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;

public class TestCases_TaxInput_page extends TestCases_PricingInput_Page{
	
	@Test(dependsOnMethods={"PricingInput"})
	public void TaxInput() throws Exception {
		
		scenario("TC_99 :Validate if the SA is able to navigate to Tax Input when clicked on Tax Input and able to see Configuration,Subcontrators,Third Party Resale,Third Party Purchase,Intellectual Property Licensing,Acquiring Client Assets,Contract and Pricing.");
		TaxInputPage.navigateToSolutionTaxInput();
		
		scenario("TC_100 :Validate if the SA is able to configure the configuration tab under Tax Input and save ");
		TaxInputPage.configurationTab(ConstantUtils.FilePath_TaxInput, "taxConfig", 0, 0);
		
		scenario("TC_101 :Validate if the SA is able to configure the Sub contracts tab under Tax Input and save ");
		TaxInputPage.subContractTab(ConstantUtils.FilePath_TaxInput, "taxConfig", 0, 0);
		
		scenario("TC_102 :Validate if the SA is able to configure the Thirdparty Resale tab under Tax Input and save  ");
		TaxInputPage.thirdPartyResale(ConstantUtils.FilePath_TaxInput, "taxConfig", 0, 0);
		
	    scenario("TC_103 :Validate if the SA is able to configure the Thirdparty Purchase tab under Tax Input and save  ");
	    TaxInputPage.thirdPartyPurchaseTab(ConstantUtils.FilePath_TaxInput, "taxConfig", 0, 0);
		
		scenario("TC_104 :Validate if the SA is able to configure the Intellectual Property Licensing tab under Tax Input and save   ");
		TaxInputPage.intellectTab(ConstantUtils.FilePath_TaxInput, "taxConfig", 0, 0);
		
	    scenario("TC_105 :Validate if the SA is able to configure the Acquiring Client Assets tab under Tax Input and save ");
	    TaxInputPage.aquaringClientAssests(ConstantUtils.FilePath_TaxInput, "taxConfig", 0, 0);
		
		scenario("TC_106 :Validate if the SA is able to configure the Contract and Pricing tab under Tax Input and save   ");
		TaxInputPage.contractAndPricingTab(ConstantUtils.FilePath_TaxInput, "taxConfig", 0, 0);
		
	}

}
