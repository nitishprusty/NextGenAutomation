package testScripts.OpportunityWorkflow_New;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Manage_SA_Page;
import pageObjects.OpportunitiesWorkFlowPage;
import pageObjects.Opportunity_Workflow;
import pageObjects.WAWS_Page;
import reusableComponents.ConfigFileReader;
import testComponents.Login;

public class TestCases_OpportunityWorkflow extends Login {
	// String UserID = "", Password = "", OppID_LastActivity = "";
	Opportunity_Workflow Opportunity_Workflow;
	OpportunitiesWorkFlowPage opportunitiesWorkFlowPage;
	Login_Page loginPage;
	Manage_SA_Page ManageSAPage;
	String OppID_MultiTowerDeal = "";

	@Test(dependsOnMethods = { "LoginApplication" })
	public void OpportunityWorkflowValidation() throws Exception {
		// OppID_LastActivity =
		// ConfigFileReader.getTestData("OppIDs.OppID_LastActivity");
		
		opportunitiesWorkFlowPage = PageFactory.initElements(getDriver(), OpportunitiesWorkFlowPage.class);
		ManageSAPage = PageFactory.initElements(getDriver(), Manage_SA_Page.class);

		// Opportunity_Workflow = PageFactory.initElements(getDriver(),
		// Opportunity_Workflow.class);
		loginPage = PageFactory.initElements(getDriver(), Login_Page.class);

		OppID_MultiTowerDeal = ConfigFileReader.getTestData("OppIDs.OppID_MultiTowerDeal");
		opportunitiesWorkFlowPage.navigateToMMSID(OppID_MultiTowerDeal);
		Opportunity_Workflow = PageFactory.initElements(getDriver(), Opportunity_Workflow.class);

		scenario(
				"TC_39: Validate user is able to navigate to Uploaded Documents Page when navigated from Digital Documentation  tile");
		Opportunity_Workflow.UploadDocumentsHyperlinkValidation();

		scenario(
				"TC_40: Validate user is able to navigate to PMO Tracker Checklist  Page when navigated from Review Approvals tile");
		Opportunity_Workflow.PMOTrackerHyperlinkValidation();

		scenario(
				"TC_42: Validate user is able to navigate to Solution Review & Approvals Page when navigated from Review Approvals tile");
		Opportunity_Workflow.SolutionReviewandApprovalsHyperlinkValidation();

		scenario(
				"TC_43: Validate user is able to view and click on the drop down arrow present  beside PMO Tracker Checklist hyperlink");
		Opportunity_Workflow.PMOTrackerDroppDownValidation();

		scenario("TC_44: Validate user is able to click on ATC Involvement from the pop up displayed");
		Opportunity_Workflow.ATC_Involvement_Page_Navigation();

		scenario("TC_45: Validate user is able to click on GenAI from the pop up displayed");
		Opportunity_Workflow.Gen_AI_Page_Navigation();

		scenario("TC_46: Validate user is able to click on KDA Availability from the pop up displayed");
		Opportunity_Workflow.KDA_Availability_Page_Navigation();

		scenario("TC_47: Validate user is able to click on IE Tools from the pop up displayed");
		Opportunity_Workflow.IE_Tools_Page_Navigation();

		scenario("TC_48: Validate user is able to click on Lean Cloud Migration from the pop up displayed");
		Opportunity_Workflow.Lean_Cloud_Migration_Page_Navigation();

		scenario(
				"TC_49: Validate user is able to click on DATA AI from the pop up displayed (Not Applicable for AMS and hence the field will be in disabled mode)");
		Opportunity_Workflow.reviewApprovalDataAICheck(OppID);

		scenario("TC_50: Validate user is able to click on Security from the pop up displayed");
		Opportunity_Workflow.reviewApprovalSecurityCheck();

		scenario(
				"TC_51: Validate user is able to click on CF Assets/ Venture Partners  from the pop up displayed (Not Applicable for AMS and hence the field will be in disabled mode)");
		Opportunity_Workflow.reviewApprovalCFAssetsCheck();

		scenario(
				"TC_52: Validate user is able to click on Sustainability Adoption  from the pop up displayed (Not Applicable for AMS and hence the field will be in disabled mode)");
		Opportunity_Workflow.reviewApprovalSustainabilityCheck();

		scenario("TC_53: Validate when the user is able to see the border color as Orange");
		Opportunity_Workflow.reviewApprovalBorderCheck();

		scenario("TC_54: Validate when the user is able to see the border color as Green");
		Opportunity_Workflow.borderColor(OppID);

		scenario("TC_55: User should able to navigate to Transition To Delivery page");
		Opportunity_Workflow.navigateToDelivery(OppID);

		scenario("TC_56: User should able to view the message on hover of Info icon");
		Opportunity_Workflow.hoverIicon(OppID);

		scenario("TC_57: Validate user is able to view the icon/message:Status: Not Started, Started, Not Applicable");
		Opportunity_Workflow.validateStatus(OppID);

		scenario("TC_58: Validate the by default status of Deal Team as Started");
		Opportunity_Workflow.validateDealStatus(OppID);

		scenario("TC_59:Validate user is able to view the status changed to Not Started to Started in all the tiles");
		Opportunity_Workflow.DefineTeamStatusCheck();

		scenario("TC_60:Validate user is able to view no change in status if no data saving is done");
		Opportunity_Workflow.validateNoChangeInStatus();

		scenario("TC_61:Validate user is able to view Not Appliscable status ");
		Opportunity_Workflow.NotApplicableStatus();

		scenario("TC_62:Validate the hover functionality when hovered on the hyperlinks present in the Workflow page");
		Opportunity_Workflow.hover();

		scenario(
				"TC_41: Validate user is able to navigate to KDA Variance Analysis Page when navigated from Review Approvals tile");
		Opportunity_Workflow.KDAVarianceHyperlinkValidation();

	}

}
