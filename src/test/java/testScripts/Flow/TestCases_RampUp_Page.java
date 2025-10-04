package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;

public class TestCases_RampUp_Page extends TestCases_RampupPlanner_Page {

	@Test(dependsOnMethods = { "RampupPlanner" })
	public void RampUp() throws Exception {

		scenario(
				"TC_59 : Validate if the SA is able to navigate to Ramp Up screen on click of Ramp Up and able to View Transition,Service Delivery, Summary and Export/Import Status.");
		rampUpPage.navigationToRampUp();

		scenario(
				"TC_60: Validate if the SA is able to input Transition FTE's profile wise under the group selected in dropdown.");
		rampUpPage.rampUpSdTransInput(ConstantUtils.FilePath_Rampup, "T");
		scenario(
				"TC_63: Validate if the SA is able to input Service Delivery FTE's profile wise under the group selected in dropdown.");
		rampUpPage.rampUpSdTransInput(ConstantUtils.FilePath_Rampup, "SD");
		scenario(
				"TC_64: Validate if SA is able to see all the Month wise FTE's given for each and every profile under Transition and SD.");
		rampUpPage.validateRampupData(ConstantUtils.FilePath_Rampup);

		scenario("TC_62 : Validate if SA is able to Export and Import Ramp Up file.");
		scenario(
				"TC_65 : Validate if SA is able to see the status of OU Import/Export under Offline Utility tab in Export/Import Status tab.");
		String Exported_FileName = rampUpPage.exportRampUpValidation();
		rampUpPage.importRampUpValidation(Exported_FileName);
		scenario(
				"TC_67 : Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.");
		rampUpPage.rampUpImportEdited(Exported_FileName);

	}

}
