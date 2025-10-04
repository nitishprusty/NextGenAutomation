package testScripts.Costing;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import testComponents.BaseTest;


public class TestCases_Costing extends BaseTest {
	
	String OppID = "";

	@Test(dependsOnMethods={"LoginApplication"})
	public void CostingValidation() throws Exception {

		//In Parameter screen, Start month should be 1-Jan-2024

		scenario("TC_81: Validate if the SA is able to navigate to Costing Screen on click of costing and able to see PMO, "
				+ "Transition Estimate Input(MOTE),Solution Cots, Solution Standard cost,Other Costs Export/Import Status");
		CostingPage.NavigatetoCostingScreen();
		
		scenario("TC_82:Validate if SA is able to view all the records of PMO as per the default template and is able to enter FTEs for T and SD.");
		CostingPage.EnterFTE();
		
		scenario("TC_83:Validate if SA is able to export and import the PMO file.");
		scenario("TC_84: Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.");
		CostingPage.ValidatePMOExportImport();

		scenario("TC_85: Validate if the SA is able to Accept the MOTE records imported and view them on the screen.");
		CostingPage.ValidateMOTErecords();
		
		scenario("TC_86: Validate if SA is able to view People Management and Avanade Tech Charges under Solution Cost");
		CostingPage.ValidateSolutionCost();
		
		scenario("TC_87: Validate if user is able to add Solution Standard Costs like Data,On call, DNP,overtime, etc under Solution Standard Costs.");
		CostingPage.applySolutionStandardCosts(ConstantUtils.TestData_Costing);
		
		scenario("TC_88: Validate if SA is able to configure existing rows of other cost and also able to add new rows in FTE Based and Fixed Amount section.");
		CostingPage.costing_OtherData(ConstantUtils.TestData_Costing,"OtherData",0,0);
		
		scenario("TC_89: Validate if SA is able to export and import other cost file.");
		scenario("TC_91: Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.");
		CostingPage.ValidateOtherCostExportImport();
		
		scenario("TC_90: Validate if the SA is able to view the Export/Import status of OU file in PMO section under Export/Import Status \r\n"
				+ "	 and Other Cost Section under Export/Import Status.");
		CostingPage.ValidateExportImportTab();
		
		
		

	}
}
