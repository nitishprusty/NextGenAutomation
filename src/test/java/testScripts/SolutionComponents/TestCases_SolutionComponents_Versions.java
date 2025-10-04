package testScripts.SolutionComponents;
 
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import reusableComponents.ConstantUtils;
import pageObjects.BasePage;
import pageObjects.Login_Page;

import pageObjects.Manage_SA_Page;
import pageObjects.SolutionComponentsPage;
import reusableComponents.ConfigFileReader;
 
 
public class TestCases_SolutionComponents_Versions extends BasePage{
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
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA");
		
	}
 
	@Test()
	public void SolutionComponentsValidation() throws Exception {
		
		scenario("Login mySP Application");
		loginPage.Login(UserID, Password);
		
		solutionComponentsPage.NavigatetoSolutionComponents(OppID);
		solutionComponentsPage.CreateNewVersion();
		
		scenario("TC 18 : Validate if the SA is able to Lock/Unlock the version on click of Lock/Unlock button under Action column.");
		solutionComponentsPage.Lock_unlock_version();
		
		scenario("TC 19 : Validate if the SA is able to Add comment on click of Comment button under Action column.");
		solutionComponentsPage.add_comment();
		
		scenario("TC 17 : Validate if the SA is able to Delete a version on click of Delete button under Action column");
		solutionComponentsPage.DeleteVersion();
		
		scenario("TC 20 : Validate if the SA is able to navigate to Parameters tab of the respective Version by clicking on the Verison Number.");
		solutionComponentsPage.NavigationtoParametersTab();
		
	}
}
