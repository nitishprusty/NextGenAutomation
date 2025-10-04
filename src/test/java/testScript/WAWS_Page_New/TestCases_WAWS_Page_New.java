package testScript.WAWS_Page_New;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import pageObjects.Login_Page;
import pageObjects.Manage_SA_Page;
import pageObjects.WAWS_Page_New;
import reusableComponents.ConfigFileReader;
import testComponents.Login;
 
public class TestCases_WAWS_Page_New extends Login {
	Login_Page loginPage;
	Manage_SA_Page ManageSAPage;
	WAWS_Page_New WAWS_Page_New;
	String OppID_MultiTowerDeal,OppID_AMS_ServiceGroup,OppID_SI_ServiceGroup2,
			OppID_SI_ServiceGroup_Song,OppID_IMS_ServiceGroup,OppIDNew = "";
	@Test(dependsOnMethods={"LoginApplication"})
	public void TestCases_WAWS_Page_Neww() throws Exception{
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);
		//Opportunity_Workflow = PageFactory.initElements(getDriver(), Opportunity_Workflow.class);
		loginPage = PageFactory.initElements(getDriver(), Login_Page.class);
		OppID_MultiTowerDeal = ConfigFileReader.getTestData("OppIDs.OppID_AMS_ServiceGroup2");
		OppID_AMS_ServiceGroup = ConfigFileReader.getTestData("OppIDs.OppID_AMS_ServiceGroup");
		OppID_SI_ServiceGroup2 = ConfigFileReader.getTestData("OppIDs.OppID_SI_ServiceGroup2");
		OppID_SI_ServiceGroup_Song = ConfigFileReader.getTestData("OppIDs.OppID_SI_ServiceGroup_Song");
		OppID_IMS_ServiceGroup = ConfigFileReader.getTestData("OppIDs.OppID_IMS_ServiceGroup");

		OppIDNew = ConfigFileReader.getTestData("OppIDs.OppID_IMS_ServiceGroup");
		OppID = ConfigFileReader.getTestData("OppIDs.OppID_AMS_assessment");

		ManageSAPage.navigatetoMMSID(OppID_MultiTowerDeal);
		WAWS_Page_New = PageFactory.initElements(getDriver(), WAWS_Page_New.class);

		scenario("TC_23: Validate when user clicks on Continue from Delivery center, user is navigated to Preliminary assessment Page");
		WAWS_Page_New.navigiatePreliminaryAssesmentFromDeliveryCenter();
		scenario("TC_24: Validate user is able to view all the 3 SG sections under Preliminary assessment screen.");
		WAWS_Page_New.validatePreliminaryAssessmentSGSections();
		scenario("TC_25: Validate for AMS start assessment assessment button is enabled if RDE is Technology.");
		WAWS_Page_New.validateStartAssesmentAMS();
		scenario("TC_27: Validate user is able to view Start assessment for SI once all the mandatory inputs are filled and navigated to assessment screen.");
		WAWS_Page_New.validateStartAssesmentSI(OppID_SI_ServiceGroup2);
		scenario("TC_28: Verify for SI when RDE=Song, and Under technology Primary technology is selected anything with ADOBE, Start/View assessment is enabled.");
		WAWS_Page_New.validateStartAssesmentSISong(OppID_SI_ServiceGroup_Song);
		scenario("TC_29: Validate on Preliminary screen no Assessment button is displayed for IMS deal");
		WAWS_Page_New.validateStartAssesmentIMS(OppID_IMS_ServiceGroup);
		
		scenario("TC_30: Validate when Completed assessment and comes back to preliminary assessment page and clicks on refresh, screen is updated with latest details");
		WAWS_Page_New.checkPremilinaryPage(OppID);

		scenario("TC_31: Validate user should be able to view 2 buttons Refresh and Continue on Preliminary assessment page");
		WAWS_Page_New.checkPremilinaryPageButton(OppIDNew);

		scenario("TC_32: Validate when user clicks on Continue from Preliminary page user is navigated to Client context page");
		WAWS_Page_New.checkClientContextPage();

		scenario("TC_33: Validate user is able to view 5 question on Client context page(Not mandatory to any SG)");
		WAWS_Page_New.clientContextPage();

		scenario("TC_34: Validate when user clicks on Save without any changes alert message is displayed(Applies to all screens in WRWS)");
		WAWS_Page_New.alertMessage();

		scenario("TC_35:Validate user is able to view 3 buttons on Client context page" ); 
		WAWS_Page_New.Button();

		scenario("TC_36:Validate When user clicks Continue on Client context page" ); 
		WAWS_Page_New.ClientContext(); 

		scenario("TC_37:Validate user is able to view Summary details in Summary page" ); 
		WAWS_Page_New.Summary();

		scenario("TC_38:Validate user should be able to see workflow Enabled when mandatory inputs are Completed");
		WAWS_Page_New.WorkFlowEnabled();

		scenario("TC_39:Validate user should be able to see workflow disabled when mandatory inputs are pending");
		WAWS_Page_New.PendingMessage();

		
	}

 
}