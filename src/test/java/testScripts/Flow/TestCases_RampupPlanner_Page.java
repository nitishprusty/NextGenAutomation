package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;

public class TestCases_RampupPlanner_Page extends TestCases_Differentiation_Page{
	
	@Test(dependsOnMethods ={"Differentiation"})
	public void RampupPlanner() throws Exception{
		
//		parameter.NavigateToParameter();
//		parameter.addDate(ConstantUtils.TestData_Parameter, "NewDSPTestData", 35);
		
		scenario("TC_51: Validate if the SA is able to navigate to Ramp-Up Planner on click of Ramp Up planner tab and able to view Baseline,Productivity,T-SD Split,Review Shore Mix,Review Ramp Up and Export/Import Status tabs.");		
		rampUpPlannerPage.rampUpNavigationValidation();		
		
		scenario("TC_52: Validate if SA is able to enter FTE for profiles in Baseline tab and save the screen.");		
		rampUpPlannerPage.configureBaselineTab(ConstantUtils.FilePath_RampupPlanner, "Baseline_Subtab", "Client");
		rampUpPlannerPage.rampUpSubtabsValidation(); //continuation of scenario 51.
		
		scenario("TC_53: Validate if SA is able enter Monthwise Productivity and save the screen.");		
		rampUpPlannerPage.configureProductivityTab(ConstantUtils.FilePath_RampupPlanner, "Productivity_Subtab");
		
		scenario("TC_54: Validate if the SA is able to save T-SD Split and save the screen.");		
		rampUpPlannerPage.configureTSDSplitTab(ConstantUtils.FilePath_RampupPlanner, "T_SD_Subtab");		
		
		scenario("TC_56: Validate if the SA is able review 'Review Ramp-UP' screen.[Profile wise split].");		
		scenario("TC_58: Validate if SA is able to Push the data to Ramp Up on click on 'Push To Ramp-Up' button.");	
		rampUpPlannerPage.reviewRampUpValidation();
		
		scenario("TC_57: Validate if SA is able to Export/Import Ramup Up Planner report and able to view the status in Export/Import Status Tab.");	
		rampUpPlannerPage.exportImportValidation();

		

		
	}


}
