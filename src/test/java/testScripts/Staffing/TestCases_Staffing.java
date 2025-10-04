package testScripts.Staffing;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Manage_Staffing_Page;

import testComponents.Login;
import reusableComponents.ConstantUtils;

public class TestCases_Staffing extends Login {

	Manage_Staffing_Page manageStaffingPage;

	@Test(dependsOnMethods = { "LoginApplication" })
	public void ManageStaffingValidation() throws Exception {

		manageStaffingPage = PageFactory.initElements(getDriver(), Manage_Staffing_Page.class);

		// Prior Screen configuration to be added

		scenario(
				"TC_74 : Validate if the SA is able to Navigate to Staffing screen on click of 'Staffing' and able to view Pyramids,LBS, Baseline Effort and Export/Import Status tabs.");
		manageStaffingPage.navigateToStaffing();

		scenario(
				"TC_75 : Validate if user is able to edit and save Bill code and Skill Inventory,rate Card for all the records displayed profile wise on staffing screen. ");
		manageStaffingPage.saveEditBill(ConstantUtils.FilePath_Staffing, "addBillCode", 1);

		scenario(
				"TC_76 : Validate if the SA is able to add LBS record under correct group-profile combination along with Skill Inventory and Staffing FTEs.");
		manageStaffingPage.addLbsUnderGroupProfile(ConstantUtils.FilePath_Staffing, "StaffingLbs", 5, 0);

		scenario("TC_77 : Validate if the SA is able to add Skill Inventory on staffing screen.");
		manageStaffingPage.addSkillInventory(ConstantUtils.FilePath_Staffing, "StaffingLbs", 10, 0);

		scenario(
				"1.TC_78 : Validate if the SA is able to Export/Import Staffing File and see the status in Export/Import Status tab"
						+ "2.TC_80 : Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI..");
		String Exported_FileName = manageStaffingPage.Staffing_ExportFile();
		manageStaffingPage.Staffing_ImportFile(Exported_FileName);

		scenario(
				"TC_79 : Validate if SA is able to input Baseline Effort for Client Estimated Hours and Accenture Estimated Hours and save the screen.");
		manageStaffingPage.baseLineEffortTab("23");

	}
}