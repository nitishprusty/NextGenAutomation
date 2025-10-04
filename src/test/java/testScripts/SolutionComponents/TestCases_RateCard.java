package testScripts.SolutionComponents;
 
import java.time.Duration;

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
 
 
public class TestCases_RateCard extends BasePage{
	Login_Page loginPage;
	SolutionComponentsPage solutionComponentsPage;
	String UserID = "", Password = "", OppID = "", SolID = "";
	@Parameters("browserType")
	@BeforeMethod(alwaysRun = true)
	public void initialize(String browserType) throws Exception 
	{
		initialSetup();
		startBrowser(browserType);
 
		loginPage = PageFactory.initElements(getDriver(), Login_Page.class);
		solutionComponentsPage = PageFactory.initElements(getDriver(), SolutionComponentsPage.class);

 
		UserID = ConfigFileReader.getTestData("credentials.UserID1");
		Password = ConfigFileReader.getTestData("credentials.Password");
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA");
		
	}
 
	@Test()
	public void RateCardValidation() throws Exception {
		
		scenario("Login mySP Application");
		loginPage.Login(UserID, Password);
		
		solutionComponentsPage.NavigatetoSolutionComponents(OppID);
		
		scenario("TC 21 : Validate if SA is able to add Rate Card.");
		solutionComponentsPage.add_RateCard(ConstantUtils.FilePath_RateCard, "Add RateCard", 0,0);
		
		scenario("TC 23 : Validate if SA is able to Export to Rate Card and see if all the records are flowing to Rate Card Exported Excel.");
		String ExportedFileName = solutionComponentsPage.ExportRateCardValidation();
		
		scenario("TC 24 : Validate if SA is able to import Rate Card and the changes made are reflecting in UI.");
		solutionComponentsPage.ImportRateCardValidation(ExportedFileName);
		
		Navigate_to_subTab(GlobalScreen.VERSIONS);
		scenario("TC 22 : Validate if SA is able to Apply Rate Card to staffing records if Pricing input is selected as Hourly.");
		
		//create a new version
		//solutionComponentsPage.CreateNewVersion();
		String versioncreated = solutionComponentsPage.RefreshVersion();
		
		/*String Value = solutionComponentsPage.DifferentitationNeededValue();
		if(Value.equals("Yes")){
			Navigate_to_Screen(GlobalScreen.DIFFERENTIATION);
			scenario("Validate user is able to add Differentition");
			solutionComponentsPage.ValidateDifferentitation();
		} */
		
		Navigate_to_Screen(GlobalScreen.STAFFING);
		solutionComponentsPage.BillCode_Apply();
		solutionComponentsPage.Apply_SkillsCapabilities();
		//fill baseline tab as well
		Navigate_to_subTab(GlobalScreen.SUBTAB_STAFFING_BASELINEEFFORT);
		solutionComponentsPage.StaffingBaselineData();
		
		Navigate_to_Screen(GlobalScreen.PRICING);
		solutionComponentsPage.Pricing_groups_navigation();
		solutionComponentsPage.ChangeGroupToHourlyRate(ConstantUtils.FilePath_RateCard, 2);
		
		Navigate_to_Screen(GlobalScreen.STAFFING);
		solutionComponentsPage.Staffing_RateCardApply(ConstantUtils.FilePath_RateCard, 2);
		
		scenario("TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.");
		
		solutionComponentsPage.NavigatetoNextScreens();
		Navigate_to_Screen(GlobalScreen.TAX);
		solutionComponentsPage.ConfigureTaxScreen(ConstantUtils.FilePath_RateCard, "TaxScreenInputs",1,1);
		Navigate_to_Screen(GlobalScreen.GENERATE_PRICING);
		Navigate_to_subTab(GlobalScreen.SUBTAB_PRICING_FACTORS);
		solutionComponentsPage.GenerateADL();
		 
	}
}
