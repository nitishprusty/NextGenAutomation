package testScripts.Opportunities;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.OpportunitiesPage;
import reusableComponents.ConfigFileReader;
import testComponents.Login;
import pageObjects.Manage_SA_Page;

public class TestCases_Opportunities extends Login {

	OpportunitiesPage opportunitiesPage;
	Manage_SA_Page ManageSAPage;
	String UserID = "", Password = "", OppID = "", OppID_CreateComposition = "";

	@Test(dependsOnMethods = { "LoginApplication" })
	public void viewOpportunitiesPage() throws Exception {
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		opportunitiesPage = PageFactory.initElements(getDriver(), OpportunitiesPage.class);
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_AMS_ServiceGroup");
		// OppID_CreateComposition =
		// ConfigFileReader.getTestData("OppIDs.OppID_SI_createcompostion");

		ManageSAPage.navigateToManage();

		scenario("TC_1: Validate that user is able to view oppoprtunities page");
		opportunitiesPage.viewOpportunitiesPage();

		scenario("TC_2: Validate that user is able to see All, Active, Interim deals columns in opp Page");
		opportunitiesPage.oppTabsValidation();

		scenario("TC_3: Validate that user is able to see all active deals in All active deals column");
		opportunitiesPage.oppValidateActiveDealData();

		scenario("TC_4: Validate that user is able to search a deal from search bar");
		opportunitiesPage.oppValidateSearchFilter(OppID);

		scenario("TC_5:  Validate that on clicking on filter user is able to see status and stage oprtions");
		opportunitiesPage.validateFilterStatusandStage();

		scenario("TC_6: Validate that user is able to filter the data based on status and stage of deal");
		opportunitiesPage.OpportunitiesFilter();

		scenario(
				"TC_7: Validate that user is able to view composition,MMS ID,Applicable SG,Role name, Client name,opportunity name,Market-CG,MMS Status,Bookmarks,Actions headers in opportunity page.");
		opportunitiesPage.OpportunitiesCheckFilter();
		
		scenario("TC-8: Validate that user is able to create a composition");
		opportunitiesPage.createComposition();

		scenario("TC-9: Validate that user is able to pin any deal ");
		opportunitiesPage.pin();

		scenario("TC_11: Validate that user is able to log the status of any deal");
		opportunitiesPage.opportunitiesLogStatus(OppID);

		scenario("TC_12: user should able to see correct pagination to view all deals");
		opportunitiesPage.pagination_count();

		scenario("TC_13: Validate that on hovering any column data the completed data should appear in the tool tip");
		opportunitiesPage.validateColumnData(OppID);

		scenario("TC_14: Validate that on hovering MMS ID colour should get changed to blue");
		opportunitiesPage.hoverMmsID();

		

	}

}
