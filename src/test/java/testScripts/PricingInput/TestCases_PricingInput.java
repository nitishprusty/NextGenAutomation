package testScripts.PricingInput;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.PriceInput_Page;
import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import testComponents.Login;

public class TestCases_PricingInput extends Login {

	PriceInput_Page priceInputPage;
	String UserID = "", Password = "", OppID_LastActivity = "", SolID = "";
	
	String OppID_WAWS = "";
	String version = "";

	@Test(dependsOnMethods = { "LoginApplication" })
	public void PriceInputValidation() throws Exception {

		priceInputPage = PageFactory.initElements(getDriver(), PriceInput_Page.class);
//		OppID_WAWS = ConfigFileReader.getTestData("OppIDs.OppID_PricingInput");
//		
//		ManageSAPage.navigatetoMMSID(OppID_WAWS);
//		
//		WebElement Sol_Config = getDriver().findElement(By.xpath("//a[text() = 'Solution Configuration']"));
//		waitForElementToBeVisible(Sol_Config);
//		clickElement(Sol_Config);
//		
//		version = "638.00";
//		
//		solComponent.CopyVersion(version);
//		solComponent.RefreshVersion();
		

//		getDriver().get(
//				"https://mysolutionplannernextgencoreparallel.accenture.com/MySP/SolutionConfiguration/1456/343275/17/AMSPricingInput");

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
