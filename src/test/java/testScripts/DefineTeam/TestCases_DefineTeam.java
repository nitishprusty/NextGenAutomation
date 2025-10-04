package testScripts.DefineTeam;
 
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;
import testComponents.Login;
import pageObjects.BasePage;
import pageObjects.Login_Page;
import pageObjects.SolutionComponentsPage;
import pageObjects.DefineTeam_Page;
import reusableComponents.ConfigFileReader;
 
 
public class TestCases_DefineTeam extends Login{
	DefineTeam_Page Definepage;
	String OppID = "";
	
	@Test(dependsOnMethods={"LoginApplication"})
	public void DefineTeamsValidation() throws Exception {
		
		Definepage = PageFactory.initElements(getDriver(), DefineTeam_Page.class);
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_Define");
		
		scenario("TC:1 Validate user is able to see Define team tile in Opportunity workflow ");
		Definepage.ValidationDefineTeam(OppID);
		  
		scenario("TC:2 Validate user is navigated to Deal Team on click of Define Team tile ");
		Definepage.ValidationDealTeamTab();
		
		scenario("TC:3 Validate user is able to Add roles from the role names dropdown ");
		Definepage.AddRole(ConstantUtils.FilePath_DefineTeam, "DealTab", 0, 0, "First", true);
		
		scenario("TC:4 Validate user is able to see pop up opened when try to click on save button ");
		Definepage.EmailNotification(ConstantUtils.FilePath_DefineTeam, "DealTab", 0, 0);
		
		scenario("TC:8 Validate user is navigated to SME Charters");
		Definepage.SMETab();
		
		scenario("TC:9 Validate Mobilization SME Charter");
		Definepage.MobilizationTab();
		
		
		// The Below scenarios are under Bug: 
		
		//Bug 3501840:
		
		/*scenario("TC:5 Validate user is able to see cancel button next to save button ");
		Definepage.CancelButton(ConstantUtils.FilePath_DefineTeam, "DealTab", 0, 0);
		
		//BUG 3500793:

		scenario("TC:6 Validate for SME role request status is displaying ");
		Definepage.SMERole();
		
		scenario("TC:7 Validate Raise request, View request and delete icons under Action column");
		Definepage.SMERequest();
		
		// BUG 3499275:

		scenario("TC:10 Validate Industry & Functions SME Charter");
		Definepage.Industry_Tab();
		
		// BUG 3500717:

		scenario("TC:11 Validate PCAT Charter");
		Definepage.PCAT_Tab();*/

		  
	}
}
