package testScripts.OpportunitiesWorkFlow;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.OpportunitiesPage;
import pageObjects.OpportunitiesWorkFlowPage;
import reusableComponents.ConfigFileReader;
import testComponents.Login;

public class TestCases_OpportunitiesWorkFlow extends Login{
	
	/*Manage_SA_Page ManageSaPage;
	OpportunitiesPage opportunitiesPage;*/
	OpportunitiesWorkFlowPage opportunitiesWorkFlowPage;
	
	String OppID_ServiceGroup_SI = "", OppID_ServiceGroup_AMS = "", OppID_ServiceGroup_IMS = "", OppID_ServiceGroup_AMS1 = "";
	
	@Test(dependsOnMethods = "LoginApplication")
	public void opportunitiesWorkFlow() throws Exception {
		
		opportunitiesWorkFlowPage = PageFactory.initElements(getDriver(), OpportunitiesWorkFlowPage.class);

		//OppID_ServiceGroup_SI = ConfigFileReader.getTestData("OppIDs.OppID_SI_ServiceGroup");
		OppID_ServiceGroup_AMS = ConfigFileReader.getTestData("OppIDs.OppID_AMS_ServiceGroup");
		OppID_ServiceGroup_IMS = ConfigFileReader.getTestData("OppIDs.OppID_IMS_ServiceGroup");
		OppID_ServiceGroup_AMS1 = ConfigFileReader.getTestData("OppIDs.OppID_AMS_ServiceGroup1");

		
		ManageSAPage.navigateToManage();
		scenario("TC_1: Validate that user is able to view Opportunity Workflow page \r\n<br/>"
				+ "TC_3: Validate that user is able to view the header \"Opportunity Workflow\" "
				+ "displayed towards top left corner");
		opportunitiesWorkFlowPage.viewOpportunityWorkflowPage(OppID_ServiceGroup_AMS);
		
		scenario("TC_2: Validate that user is able to view the tiles and the data to be flown in the entire Opportunity Workflow page");
		opportunitiesWorkFlowPage.viewOpportunityWorkflowPageTiles();
				
		scenario("TC_4: Validate that user is able to view the Opportunity Information section");
		opportunitiesWorkFlowPage.viewOpportunityInformation();
		
		scenario("TC_5: Validate that user is able to click on View MMS Details Hyperlink and view the MMS details");
		opportunitiesWorkFlowPage.viewMMSDetailsHyperlink();
		
		scenario("TC_6: Validate user is able to switch roles from MMS Details page");
		opportunitiesWorkFlowPage.switchRoleMMSDetails();	
		
		scenario("TC_7: Validate the Breadcrumbs in the  MMS Details Page");
		opportunitiesWorkFlowPage.viewBreadcrumbsMMSDetailspage(OppID_ServiceGroup_AMS);
		
		scenario("TC_8: Validate that user is able to view the Quick Links section");
		opportunitiesWorkFlowPage.viewQuickLinksTitle(OppID_ServiceGroup_AMS);
		
		scenario("TC_9: Validate user is able to navigate KDA page when navigated from Quick Links section");
		opportunitiesWorkFlowPage.navigateToKDA();
		
		scenario("TC_10: Validate user is able to navigate to Harmonized KDA page when navigated from Quick Links section");
		opportunitiesWorkFlowPage.navigateToHarmonizedKDA(OppID_ServiceGroup_AMS);
		
		scenario("TC_63: Validate the Breadcrumbs in the Opportunity Workflow Page ");
		opportunitiesWorkFlowPage.viewBreadcrumbsOpportunityWorkflowpage(OppID_ServiceGroup_AMS);
		
		scenario("TC_11: Validate user is able to navigate toDeal Canvas Last Published page when navigated from Quick Links section.");
		opportunitiesWorkFlowPage.validateNavToDealCanvas(OppID_ServiceGroup_AMS1);
		
		scenario("TC_12: Validate that user is able to view the Status Update section and enter the comments.");
		opportunitiesWorkFlowPage.validateStatusUpdate();
		
		scenario("TC_13: Validate that user is able to view the Select Service Group drop down.");
		opportunitiesWorkFlowPage.validateServiceGroupDropdown();
		
		scenario("TC_14: Validate that user is able to view the Select Role drop down.");
		opportunitiesWorkFlowPage.validateSelectRoleDropDown();
		
		scenario("TC_15: Validate user is able to view DiSSA and Support on the workflow page.");
		opportunitiesWorkFlowPage.validateDissaSupport();
		
		scenario("TC_16: Validate user is able to view the User Dropdown and Notifications upon click of it.");
		opportunitiesWorkFlowPage.validateUserAndNotificationBtn();
		
		scenario("TC_17: Validate user is able to switch roles from Workflow page.");
		opportunitiesWorkFlowPage.validateSwitchRoles(OppID_ServiceGroup_AMS1);
		
		scenario("TC_18: Validate user is able to navigate to Deal Team page when navigated from Define Team tile.");
		opportunitiesWorkFlowPage.validateDealTeam();
		
		scenario("TC_19: Validate user is able to navigate to SME Request Charters page when navigated from Define Team tile");
		opportunitiesWorkFlowPage.navigateToSMERequestCharters(OppID_ServiceGroup_AMS);
		
		scenario("TC_20: Validate user is able to navigate to opportunityOnAPage page when navigated from Define Team tile");
		opportunitiesWorkFlowPage.navigateToOpportunityOnAPagePage();
		
		scenario("TC_21: Validate user is able to navigate to scope page when navigated from opportunityOnAPage");
		opportunitiesWorkFlowPage.navigateToScopePage();
		
		scenario("TC_22: Validate user is able to navigate to PreliminaryAssessment page when navigated from Scope Page");
		opportunitiesWorkFlowPage.navigateToPreliminaryAssessmentPage();
		
		scenario("TC_23: Validate user is able to navigate to Client Context page when navigated from "
				+ "PreliminaryAssessmentPage.");
		opportunitiesWorkFlowPage.navigateToClientContextPage();
		
		scenario("TC_24: Validate user is able to get notification post configuration of WRWS.");
		opportunitiesWorkFlowPage.postConfigurationOfWRWS(OppID_ServiceGroup_IMS);
		
		scenario("TC_25: Validate user is able to navigate to clientInsights360 Link page.");
		opportunitiesWorkFlowPage.navigateToClientInsights360Page(OppID_ServiceGroup_AMS1);
		
		scenario("TC_26: Validate user is able to navigate to diagnostics360 page");
		opportunitiesWorkFlowPage.navigateTodiagnostics360Page();
		
		scenario("TC_27: Validate user is able to navigate to shapeValueProposition page.");
		opportunitiesWorkFlowPage.navigateToShapeValuePropositionPage();
		
		scenario("TC_28: Validate user is able to navigate to identifyDifferentiationThemes page.");
		opportunitiesWorkFlowPage.navigateToidentifyDifferentiationThemesPage();

		
		scenario("TC_29: Validate user is able to navigate to Version screen when "
				+ "clicked on all the hyperlinks present in  Solution Components "
				+ "tile(For AMS and SI)");
		opportunitiesWorkFlowPage.solutionComponents_AMS(OppID_ServiceGroup_AMS);
		//opportunitiesWorkFlowPage.solutionComponents_SI(OppID_ServiceGroup_SI);

		/*scenario("TC_30: Validate user is able to navigate to INSPIRE Page when "
				+ "clicked on all the hyperlinks present in  Solution Components "
				+ "tile(For IMS)");
		opportunitiesWorkFlowPage.solutionComponents_IMS(OppID_ServiceGroup_IMS);*/

		scenario("TC_31: Validate user is able to navigate to Build Quadrants for "
				+ "Value Based BSC  Page when navigated from Value Based Deal "
				+ "Construct  tile");

		scenario("TC_32: Validate user is able to navigate to Define Weight / Review "
				+ "KPIs  Page when navigated from Value Based Deal Construct  tile");

		scenario("TC_33: Validate user is able to navigate to Define Risk / Reward "
				+ "Fees Page when navigated from Value Based Deal Construct  tile");

		scenario("TC_34: Validate user is able to navigate to Define KPI Target Values "
				+ "Page when navigated from Value Based Deal Construct  tile");

		scenario("TC_35: Validate user is able to navigate to Run Sensitivity Analyzer "
				+ "Page when navigated from Value Based Deal Construct  tile");
		opportunitiesWorkFlowPage.valueBasedDealConstruct(OppID_ServiceGroup_AMS);

		scenario("TC_36: Validate user is able to navigate to Digital Solution Plan "
				+ "Designer  Page when navigated from Digital Documentation  tile "
				+ "(Not applicable for IMS)(Not applicable for IMS)");
		opportunitiesWorkFlowPage.digitalSolutionPlanner(OppID_ServiceGroup_AMS);

		scenario("TC_37: Validate user is able to navigate to Deal Canvas Page when "
				+ "navigated from Digital Documentation  tile");
		opportunitiesWorkFlowPage.dealCanvas(OppID_ServiceGroup_AMS);

		/*scenario("TC_38: Validate user is able to navigate to Multi-Service Deal "
				+ "Analytics Page when navigated from Digital Documentation  tile");
		opportunitiesWorkFlowPage.multiServiceDealAnalytics(OppID_ServiceGroup_AMS1);*/
		
	}
	
}
