package testScripts.WRWS;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Manage_SA_Page;
import pageObjects.WAWS_Page;
import pageObjects.WRWS_Page;
import reusableComponents.ConfigFileReader;
import testComponents.Login;

public class TestCases_WRWS extends Login{
	
	Manage_SA_Page ManageSAPage;
	WRWS_Page WRWSpage;
	

	@Test(dependsOnMethods={"LoginApplication"})
	public void WRWS() throws Exception {
		
		ManageSAPage = PageFactory.initElements(getDriver(),Manage_SA_Page.class);
		WRWSpage = PageFactory.initElements(getDriver(), WRWS_Page.class);

		
		String OppID_WRWS = ConfigFileReader.getTestData("OppIDs.OppID_AMS_ServiceGroup");
		String OppID_WRWS_SI = ConfigFileReader.getTestData("OppIDs.OppID_SI_WRWS");
		
		scenario("TC_1: Validate that user is able to View Opportunity on a page with all the steppers.");
		WRWSpage.validateSteppers(OppID_WRWS);
		
		scenario("TC_2: Validate that user is able to View Deal details on Opportunity on a page.");
		WRWSpage.validateViewDeal();
		
		scenario("TC_3: Validate that user is able to view 5 Questionnaire on Opportunity on a page.");
		WRWSpage.validateQuestionnaire();
		
		scenario("TC_4: Validate that user is able to view Tick mark/number for Questions on Opportunity on a page.");
		WRWSpage.validateQuesNumber();
		
		scenario("TC_5: Validate that user is able to view Accordian for all Questions on Opportunity on a page.");
		WRWSpage.validateAccordian();
		
		scenario("TC_6: Validate that user is able to View 3 Buttons on Opportunity on a page.");
		WRWSpage.validateButtons();
		
		//ManageSAPage.navigatetoMMSID(OppID_WRWS);
		scenario("TC_7: Validate that user is able to view Scope tab when clicked on continue from opportunity on a page");
		WRWSpage.scopeTab(OppID_WRWS);
		
		scenario("TC_8: Validate that user is able to view 3 sub menus on Scope tab");
		//WRWSpage.subTabsMenu();
		
		scenario("TC_9: Validate that user is able to view 5 Sub services under Services tab");
		WRWSpage.servicesSubTabs();
		
		scenario("TC_10: Validate that user is able to view Comment option for each SGs under services tab");
		WRWSpage.addComment();
		
		scenario("TC 11 : Validate that user is able to select or deselect Sub services.");
		WRWSpage.selectDeselectSG(OppID_WRWS);
		
		scenario("TC 12 : Validate user is able to select all SGs with select all checkbox");
		WRWSpage.selectAllSG(OppID);
		
		scenario("TC 13 : Validate that user is able to View 3 Buttons on Scope page");
		WRWSpage.scopTabButtonCheck(OppID);
		
		scenario("TC 14 : Validate when user clicks on Continue, Technology tab is displayed");
		WRWSpage.navigateToTechnologyTab();
		
		scenario("TC 15 : Validate when user Navigates to Technology tab AMS/SI details are displayed");
		WRWSpage.AMSandSIValidation();
		
		scenario("TC 16 : Validate when user select AMS deal only AMS details are displayed under technology tab and Vice versa for SI");
		WRWSpage. validationOfTechnologyAMSandSI(OppID_WRWS_SI);
		
		ManageSAPage.navigatetoMMSID(OppID_WRWS);
		scenario("TC_17 : Validate when user select AMS deal and navigate on technology tab, Custom and ERF fields are displayed.(User has to select Custom/ERP field to enable workflow)");
		WRWSpage.validateCustomAndERF();

		scenario("TC_18 : Validate there is no data displayed for IMS, BPMS, SC/CON under technology tab.");
		WRWSpage.validateNoData();

		scenario("TC_19 : Validate Enabled SGs under technology will displayed with comment icon.");
		WRWSpage.validateCommentIcon();

		scenario(
				"TC_20 : Validate When user Clicks on Continue from Technology, user is navigated to Delivery Center tab");
		WRWSpage.validateDeliveryCenterTab();

		scenario("TC_21 : Validate that user is able to view All the Delivery center details on the page.");
		WRWSpage.validateDeliveryCenterDetails();

		scenario(
				"TC_22 : Validate that user is able to view only selected specific SG details enabled when navigated on Delivery center page.");
		WRWSpage.validateEnabledSGDetails();


	}

}
