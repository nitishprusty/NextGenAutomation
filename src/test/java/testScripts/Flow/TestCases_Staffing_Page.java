package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;

public class TestCases_Staffing_Page extends TestCases_Pyramids_Page {
	String Rum_OppId = "";

	@Test(dependsOnMethods = { "Pyramids" })
	public void Staffing() throws Exception {

		Rum_OppId = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA_MobSME");

		scenario(
				"TC_74 : Validate if the SA is able to Navigate to Staffing screen on click of 'Staffing' and able to view Pyramids,LBS, Baseline Effort and Export/Import Status tabs.");
		staffingPage.navigateToStaffing();

		scenario(
				"TC_75 : Validate if user is able to edit and save Bill code and Skill Inventory,rate Card for all the records displayed profile wise on staffing screen. ");
		staffingPage.saveEditBill(ConstantUtils.FilePath_Staffing, "addBillCode", 1);

		scenario(
				"TC_76 : Validate if the SA is able to add LBS record under correct group-profile combination along with Skill Inventory and Staffing FTEs.");
		staffingPage.addLbsUnderGroupProfile(ConstantUtils.FilePath_Staffing, "StaffingLbs", 5, 0);

		scenario("TC_77 : Validate if the SA is able to add Skill Inventory on staffing screen.");
		staffingPage.addSkillInventory(ConstantUtils.FilePath_Staffing, "StaffingLbs", 10, 0);

		scenario(
				"1.TC_78 : Validate if the SA is able to Export/Import Staffing File and see the status in Export/Import Status tab"
						+ "2.TC_80 : Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI..");
		String Exported_FileName = staffingPage.Staffing_ExportFile();
		staffingPage.Staffing_ImportFile(Exported_FileName);

		scenario(
				"TC_79 : Validate if SA is able to input Baseline Effort for Client Estimated Hours and Accenture Estimated Hours and save the screen.");
		staffingPage.baseLineEffortTab("23");
		
		Navigate_to_Screen(GlobalScreen.RAMP_UP);
		//Added here as Staffing screen has to be configured for RUM scenarios.
		scenario("TC_61: Validate if SA is able to Export and Accept RUM File.[Import through Mobilization SME].");
		scenario(
				"TC_66: Validate if SA is able to see the status of RUM Import/Export under RUM tab in Export/Import Status tab.");
		rampUpPage.exportImportRum(ConstantUtils.FilePath_Rum, Rum_OppId);

		scenario("TC 22 : Validate if SA is able to Apply Rate Card to staffing records if Pricing input is selected as Hourly.");			
		Navigate_to_Screen(GlobalScreen.PRICING);
		solComponent.Pricing_groups_navigation();
		solComponent.ChangeGroupToHourlyRate(ConstantUtils.FilePath_RateCard, 2);
		
		Navigate_to_Screen(GlobalScreen.STAFFING);
		solComponent.Staffing_RateCardApply(ConstantUtils.FilePath_RateCard, 2);
		

		
	}

}
