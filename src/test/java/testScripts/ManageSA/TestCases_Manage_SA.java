package testScripts.ManageSA;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Manage_SA_Page;
import reusableComponents.ConfigFileReader;
import testComponents.Login;

public class TestCases_Manage_SA extends Login {
	
	Manage_SA_Page ManageSAPage;
	String UserID = "", Password = "", OppID_LastActivity = "";	

	@Test(dependsOnMethods={"LoginApplication"})
	public void ManageSAValidation() throws Exception {
		
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		OppID_LastActivity = ConfigFileReader.getTestData("OppIDs.OppID_Define");

		scenario("TC_1: Validate that user is able to View Last Activity tiles in Manage page");
		scenario("TC_2: Validate that user is able to view Latest modified screen name with MMS ID"
				+ " and SG in Last Activity tiles");
		scenario("TC_3: Validate that user is able to view latest modified \r\n"
				+ "date and time in Last Activity tiles");
		scenario("TC_4: Validate that Clicking on continue user is able to navigate to Particular screen which"
				+ " is avalable in Last Activity tiles");
		ManageSAPage.LastActivitytile(OppID_LastActivity);

		scenario("TC_5: Validate that opportunties tile is available at Manage SA page");
		scenario("TC_6: Validate the total opp count is correct on Opp tile on Manage SA page");
		scenario("TC_7: Validate the total opp hyperlink on Opp tile on Manage SA page");
		ManageSAPage.Opportuntiestile();

		scenario("TC_8: Validate the In progress count is correct on Opp tile on Manage SA page"); 
		ManageSAPage.validateInprogressTabCount();
		  
		scenario("TC_9: Validate the In progress hyperlink on Opp title on Manage SA page"); 
		ManageSAPage.activeDealsTabValidation();
		  
	    scenario("TC_10: Validate the Interim count is correct on Opp tile on Manage SA page"); 
		ManageSAPage.validateInterimTabCount();
		  
		scenario("TC_11: Validate the Interim hyperlink on Opp title on Manage SA page"); 
		ManageSAPage.interimDealsTabValidation();
		  
		scenario("TC_12: Validate the Closed count is correct on Opp tile on Manage SA page"); 
		ManageSAPage.validateClosedTabCount();
		  
		scenario("TC_13: Validate the Closed hyperlink on Opp title on Manage SA page"); 
		ManageSAPage.closeDealsTabValidation();
		  
		scenario("TC_14: Validate the On Hold count is correct hyperlink on Opp tile on Manage SA page"); 
		ManageSAPage.validateOnHoldTabCount();		  

		scenario("TC_15: Validate the On Hold progress hyperlink on Opp tile on Manage SA page");
		ManageSAPage.ValidateOnHoldLink();

		scenario("TC_16: Validate the hyperlink name of Recently Worked Opportunity on Opp tile on Manage SA page.");
		ManageSAPage.hyperLinkName_MMSId();

		scenario("TC_17: Validate the hyperlink navigation of Recently Worked Opportunity on Opp tile on Manage SA page");
		ManageSAPage.ValidateRecentlyWorkedOpportunity();
		
		scenario("TC_18: Validate the Self Assign button Opp tile on Manage SA page");
		ManageSAPage.ValidateSelfAssignButton();
		  
		scenario("TC_19: Validate the Create Interim button Opp tile on Manage SA page"); 
		ManageSAPage.ValidateCreateInterimButton();
		
		scenario("TC_20: Validate that user is able to change the roles from role preference list from Manage SA page");
		ManageSAPage.ChangeUserRole();

		scenario("TC_21: Validate that user is able to click on DisAA icon on Manage SA page");
		ManageSAPage.ValidateDisAAChatbot(); 

		scenario("TC_23: Validate that user is navigating to landing page if clicked on myISP/accenture logo"); 
		ManageSAPage.NavigatetoLandingPage();
		  
		scenario("TC_27: Validate the IT Spend Prediction and Benchmarks link and icon on Client Insights 360° tile on Manage SA page");
		ManageSAPage.NavigatetoITSpendPrediction();
		  
		scenario("TC_24: Validate that drop down on Analytics and Insights tile on Manage SA page"); 
		ManageSAPage.DropdownASE();
		
		scenario("TC_29 : Validate that user is able to View Last Activity tiles in Manage page");
		ManageSAPage.validateLastActivityOfClientTile();
		
		scenario("TC_30 : Validate that user is able to view total count header in Clients tiles");
		ManageSAPage.totalClient();
		
		scenario("TC_31 : Validate that user is able to view  Recently worked  client name in clients tiles");
		ManageSAPage.recentlyWorkedClient();
		
		scenario("TC_32 : Validate that user is able to view My favourite client section in client tiles");
		ManageSAPage.favouriteClient();
		
		scenario("TC_33 : Validate that clicking on clients user will navigate to clients page and see list of client names");
		ManageSAPage.totalClientbutton();
		
		scenario("TC_34 : Validate that All clients colunm is available in clients page and clicking on this user is able to see clients names");
		ManageSAPage.allClientbutton();
		
		scenario("TC_35 : Validate that favourities clients colunm is available in clients page and clicking on this user is able to see favourities names");
		scenario("TC_36 : Validate that user is able mark a client as favourite");
		ManageSAPage.favouriteClientbutton();
		
		scenario("TC_37 : Validate that clicking on view details user is able navigate on details page");
		ManageSAPage.Client_ViewDetails();

	}
}
