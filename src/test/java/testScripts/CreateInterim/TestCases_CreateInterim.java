package testScripts.CreateInterim;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import testComponents.Login;

public class TestCases_CreateInterim extends Login {
	String UserID = "";

	@Test(dependsOnMethods = { "LoginApplication" })
	public void createInterim() throws Exception {
		UserID = ConfigFileReader.getTestData("credentials.UserID1");

		ManageSAPage.navigateToManage();
		scenario("TC_2 : Validate Opportunity/MMS ID & SA Requestor option by adding Enterprise ID.");
		InterimPage.validateSaRequestor(UserID);

		scenario("TC_3 : Validate Opportunity Name option under Opportunity Details  accordion.");
		InterimPage.validateOpportunityName();

		scenario("TC_4 : Validate  Opportunity  Details By filling all the mandatory details.");
		InterimPage.validateMandatoryFields(ConstantUtils.FilePath_InterimDeal_NextGen, "interimCreation", 2);

		scenario("TC_5 : Verify select customer relationship details popup screen.");
		InterimPage.validateCustomerRel();

		scenario(
				"TC_6 : Validate select customer relationship details popup screen fill the mandatory details Master Client / Customer Relationship Name *(Client name) / if user have specific data of MMS ID then user can fill that data under the given option and click on search button particular ID will display.");
		InterimPage.custRelationClientCheck(ConstantUtils.FilePath_InterimDeal_NextGen, "interimCreation", 2);

		scenario(
				"TC_7 : Verify by filling the mandatory data under select customer relationship details and save it that data will reflect under Customer Relationship Name text box.");
		InterimPage.validateCustRelationSave(ConstantUtils.FilePath_InterimDeal_NextGen, "interimCreation", 2);

		scenario("TC_8 : Validate Interlink of the mandatory field under Opportunity Details screen.");
		InterimPage.validateFieldInterlink(ConstantUtils.FilePath_InterimDeal_NextGen, "interimCreation", 2);

		ManageSAPage.navigateToManage();
		scenario("TC_9 : Validate Financial details mandatory  accordion.");
		InterimPage.interimOppDetails(ConstantUtils.FilePath_InterimDeal_NextGen, "createInterim", 1);

		scenario("TC_10 : Validate Timelines mandatory  accordion.");
		InterimPage.interimTimelines(ConstantUtils.FilePath_InterimDeal_NextGen, "createInterim", 1);

		scenario("TC_11 : Validate Stakeholder Information mandatory  accordion.");
		InterimPage.interimStakeholderInfo(ConstantUtils.FilePath_InterimDeal_NextGen, "createInterim", 4, UserID);

		scenario("TC_12 : Validate Avanade Details accordion.");
		InterimPage.interimAvanadeDetails();

		scenario("TC_13 : Validate Add Comment accordion.");
		InterimPage.interimAddComments();

		ManageSAPage.navigateToManage();
		scenario("TC_15: Validate After clicking on Cancel button.");
		InterimPage.ValidatecreateInterimDealCancel();

		scenario("TC_14: Validate message display after clicking on Generate Deal button.\n\r  <br/>"
				+ "TC_16: Verify Successfull message after clicking on Generate Deal button.");
		String interimDealID = InterimPage.ValidatecreateInterimDeal();

		ManageSAPage.navigateToManage();
		scenario("TC_17: Validate Edit icon inside Action column under Opportunity dashboard interim deal screen.");
		InterimPage.navigateEditInterimdeal(interimDealID);

		scenario("TC_18: Verify Interim Deal Creation Screen after clicking on Edit Icon.");
		InterimPage.validateMandatoryFields(ConstantUtils.FilePath_InterimDeal_NextGen, "InterimDeal");

		scenario("TC_20: Verify UI/Functionality flow of the application");
		ManageSAPage.navigateToManage();
		InterimPage.navigateEditInterimdeal(interimDealID);

		scenario("TC_19: Verify by changing the data.");
		InterimPage.editInterimdeal(interimDealID, ConstantUtils.FilePath_InterimDeal_NextGen, "InterimDeal");

	}
}
