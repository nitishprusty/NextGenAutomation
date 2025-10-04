package testComponents;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.Costing_Page;
import pageObjects.DefineTeams_Page;
import pageObjects.Differentiation_Page;
import pageObjects.GeneratePricing_Page;
import pageObjects.Groups_Page;
import pageObjects.Interim_Page;
import pageObjects.KDAReport_Page;
import pageObjects.Login_Page;
import pageObjects.Manage_SA_Page;

import pageObjects.Parameter_Page;
import pageObjects.PriceInput_Page;
import pageObjects.ProductivityAssessment_Page;
import pageObjects.Profile_Page;
import pageObjects.RampUpPlanner_Page;
import pageObjects.RampUp_Page;
import pageObjects.Pyramids_Page;
import pageObjects.Manage_Staffing_Page;
import pageObjects.SolutionComponentsPage;
import pageObjects.Solution_Tax_Page;
import pageObjects.WAWS_Page;
import reusableComponents.ConfigFileReader;

//This class will contain only that test methods which are common like driver initialization,closing the driver
public class BaseTest extends BasePage {
	public int No_Of_months;
	public static String AppURL = "", UserID = "", Password = "", OppID = "", browserName = "";
	
	public Login_Page loginPage;
	public Manage_SA_Page ManageSAPage;
	public Interim_Page InterimPage;
	public SolutionComponentsPage solComponent;
	public WAWS_Page WAWSPage;
	public DefineTeams_Page DefineTeamsPage;
	public Parameter_Page parameter;
	public Profile_Page profile;
	public Groups_Page groupsPage;
	public ProductivityAssessment_Page ProductivityAssessmentPage;
	public Differentiation_Page DifferentiationPage;
	public RampUpPlanner_Page rampUpPlannerPage;
	public RampUp_Page rampUpPage;
	public Manage_Staffing_Page staffingPage;
	public Pyramids_Page pyramidsPage;
	public PriceInput_Page priceInputPage;
	public Solution_Tax_Page TaxInputPage;
	public Costing_Page CostingPage;
	public GeneratePricing_Page generatePricingPage;
	public KDAReport_Page Kda;

	@Test()
	@Parameters("browserType")
	// @BeforeMethod(alwaysRun = true)

	public void initialize(String browserType) throws Exception {
		initialSetup();
		startBrowser(browserType);
		// OppID = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA");
		UserID = ConfigFileReader.getTestData("credentials.UserID1");
		Password = ConfigFileReader.getTestData("credentials.Password");
		
		loginPage = PageFactory.initElements(getDriver(),Login_Page.class);	
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		InterimPage = PageFactory.initElements(getDriver(), Interim_Page.class);		
		WAWSPage = PageFactory.initElements(getDriver(), WAWS_Page.class);
		DefineTeamsPage = PageFactory.initElements(getDriver(), DefineTeams_Page.class);
		solComponent = PageFactory.initElements(getDriver(), SolutionComponentsPage.class);
		profile = PageFactory.initElements(getDriver(), Profile_Page.class);
		parameter = PageFactory.initElements(getDriver(), Parameter_Page.class);
		groupsPage = PageFactory.initElements(getDriver(), Groups_Page.class);
		ProductivityAssessmentPage = PageFactory.initElements(getDriver(), ProductivityAssessment_Page.class);		
		DifferentiationPage = PageFactory.initElements(getDriver(), Differentiation_Page.class);
		rampUpPlannerPage = PageFactory.initElements(getDriver(), RampUpPlanner_Page.class);
		rampUpPage = PageFactory.initElements(getDriver(), RampUp_Page.class);
		pyramidsPage = PageFactory.initElements(getDriver(), Pyramids_Page.class);
		staffingPage= PageFactory.initElements(getDriver(), Manage_Staffing_Page.class);
		priceInputPage = PageFactory.initElements(getDriver(), PriceInput_Page.class);
		TaxInputPage = PageFactory.initElements(getDriver(), Solution_Tax_Page.class);
		CostingPage = PageFactory.initElements(getDriver(), Costing_Page.class);
		generatePricingPage = PageFactory.initElements(getDriver(), GeneratePricing_Page.class);
		Kda = PageFactory.initElements(getDriver(), KDAReport_Page.class);
	}
	
	@Test(dependsOnMethods = { "initialize" })
	public void LoginApplication() throws Exception {
	loginPage.Login(UserID, Password);
	}


}
