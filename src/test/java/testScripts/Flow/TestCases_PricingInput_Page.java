package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;
import testComponents.BaseTest;

public class TestCases_PricingInput_Page extends BaseTest{
	
	@Test(dependsOnMethods = { "LoginApplication" })
	public void PricingInput() throws Exception {
		
		getDriver().get("https://mysolutionplannernextgencoreparallel.accenture.com/MySP/SolutionConfiguration/1456/343985/17/AMSPricingInput");
		
		scenario(
				"TC_92: Validate if the SA is able to navigate to piricng input on click of 'Pricing Input' and able to see Deal Wide, Egroup,Economic Profile and Export/Import Status tab.");
		priceInputPage.validatePricingInputPage();

		scenario(
				"TC_93: Valdiate if SA is able to save the pricing input type as Deal wide with Trans Billable as Yes/No, Pricing Sub-Type as Margin, Margin Type as Target/Custom.");
		priceInputPage.validateDealWideForMarginSubType(ConstantUtils.FilePath_PricingInput, "PricingInput");

		scenario(
				"TC_94: Valdiate if SA is able to save the pricing input type as Deal wide with Trans Billable as Yes/No, Pricing Sub-Type as Fixed Billing and Margin Type as Target/Custom.");
		priceInputPage.validateDealWideForFixedBillingSubType(ConstantUtils.FilePath_PricingInput, "PricingInput");

		scenario("TC_95: Validate if SA is able to save the Pricing input as Group wise.");
		priceInputPage.groupTabValidation(ConstantUtils.FilePath_PricingInput, "PricingInput");

		scenario("TC_96: Validate if SA is able to save the pricing input as Economic Profile wise.");
		priceInputPage.economicProfileValidation(ConstantUtils.FilePath_PricingInput, "PricingInput");

		scenario("TC_97: Validate if SA is able to Export/Import and Price Input File.");
		priceInputPage.validateImportExport(ConstantUtils.FilePath_PricingInput, "PricingInput");

		scenario("TC_98: Validate if SA is able to see the status in Export/Import Status File.");
		priceInputPage.validateExportImportStatus();
		
	}

}
