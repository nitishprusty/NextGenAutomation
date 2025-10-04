package testScripts.rampUp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Manage_SA_Page;
import pageObjects.Parameter_Page;
import pageObjects.Profile_Page;
import pageObjects.RampUp_Page;
import pageObjects.SolutionComponentsPage;
import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import testComponents.Login;

public class TestCases_RampUp extends Login {
	String Rum_OppId = "";
	RampUp_Page rampUpPage;
	Parameter_Page parameter;
	SolutionComponentsPage solutionComponentsPage;
	Profile_Page profile;
	Manage_SA_Page ManageSAPage;

	@Test(dependsOnMethods = { "LoginApplication" })
	public void rampUpValidation() throws Exception {
		Rum_OppId = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA_MobSME");
		rampUpPage = PageFactory.initElements(getDriver(), RampUp_Page.class);

		scenario(
				"TC_59 : Validate if the SA is able to navigate to Ramp Up screen on click of Ramp Up and able to View Transition,Service Delivery, Summary and Export/Import Status.");
		rampUpPage.navigationToRampUp();

		scenario("TC_60: Validate if the SA is able to input Transition FTE's profile wise under the group selected in dropdown.");
		rampUpPage.rampUpSdTransInput(ConstantUtils.FilePath_Rampup, "T");
		scenario("TC_63: Validate if the SA is able to input Service Delivery FTE's profile wise under the group selected in dropdown.");
		rampUpPage.rampUpSdTransInput(ConstantUtils.FilePath_Rampup, "SD");
		scenario("TC_64: Validate if SA is able to see all the Month wise FTE's given for each and every profile under Transition and SD.");
		rampUpPage.validateRampupData(ConstantUtils.FilePath_Rampup);
		
		// Staffing screen has to be configured for RUM scenarios.
		scenario("TC_61: Validate if SA is able to Export and Accept RUM File.[Import through Mobilization SME].");
		scenario(
				"TC_66: Validate if SA is able to see the status of RUM Import/Export under RUM tab in Export/Import Status tab.");
		rampUpPage.exportImportRum(ConstantUtils.FilePath_Rum, Rum_OppId);

		scenario("TC_62 : Validate if SA is able to Export and Import Ramp Up file.");
		scenario("TC_65 : Validate if SA is able to see the status of OU Import/Export under Offline Utility tab in Export/Import Status tab.");
		String Exported_FileName = rampUpPage.exportRampUpValidation();
		rampUpPage.importRampUpValidation(Exported_FileName);
		scenario("TC_67 : Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.");
		rampUpPage.rampUpImportEdited(Exported_FileName);

	}
}
