package testScripts.Groups;
 
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
import pageObjects.Parameter_Page;
import pageObjects.Profile_Page;
import pageObjects.Groups_Page;
import pageObjects.SolutionComponentsPage;
import reusableComponents.ConfigFileReader;

 
 
public class TestCases_Groups extends BasePage{
	Login_Page loginPage;
	Parameter_Page parameterPage;
	Profile_Page profilePage;
	Groups_Page groupsPage;
	SolutionComponentsPage solutionComponentsPage;
	String UserID = "", Password = "", OppID = "", SolID = "";
	@Parameters("browserType")
	@BeforeMethod(alwaysRun = true)
	public void initialize(String browserType) throws Exception 
	{
		initialSetup();
		startBrowser(browserType);
 
		loginPage = PageFactory.initElements(getDriver(), Login_Page.class);
		parameterPage = PageFactory.initElements(getDriver(), Parameter_Page.class);
		profilePage = PageFactory.initElements(getDriver(), Profile_Page.class);
		groupsPage = PageFactory.initElements(getDriver(), Groups_Page.class);
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
		  String versioncreated = solutionComponentsPage.RefreshVersion(); 
		  
		  scenario("Validate if the SA is able to navigate to Parameter tab");
		  Navigate_to_Screen(GlobalScreen.PARAMETERS);
		  parameterPage.fillData_ParameterScreen(ConstantUtils.TestData_Parameter);
		  
		  scenario("Validate if the SA is able to navigate to Profiles tab");
		  Navigate_to_Screen(GlobalScreen.PROFILES);
		  profilePage.add_ProfileCity(ConstantUtils.TestData_Profiles);
		
		  scenario("Validate if SA is able to navigate to Groups tab on click of groups");
		  Navigate_to_Screen(GlobalScreen.GROUPS);
		  groupsPage.NavigatetoGroupsTab();
		
		  scenario("Validate if SA is able Edit the existing By default group and map profiles in it.");
		  groupsPage.EditGroup(ConstantUtils.FilePath_Groups_Page, "GroupsPage", 0, 0);
		
		  scenario("Validate if SA is able to create new Group on click of Add Group button.");
		  groupsPage.AddNewGroup(ConstantUtils.FilePath_Groups_Page, "GroupsPage", 0, 0);
		
		  scenario("Validate if SA is able to Copy Group using copy functionality.");
		  groupsPage.CopyGroup(ConstantUtils.FilePath_Groups_Page, "GroupsPage", 0, 0);
		  
		  scenario("Validate if SA is able to Deactivate a group and view it in Inactive tab.");
		  groupsPage.DeactivateGroup(ConstantUtils.FilePath_Groups_Page, "GroupsPage", 0, 0);
	}
}
