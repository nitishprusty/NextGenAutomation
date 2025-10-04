package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;

public class TestCases_Parameter_Page extends TestCases_RateCard_Page{
	
	@Test(dependsOnMethods ={"RateCard"})
	public void Parameter() throws Exception{
		
		scenario("TC 20 : Validate if the SA is able to navigate to Parameters tab of the respective Version by clicking on the Verison Number.");
		solComponent.NavigationtoParametersTab();
		
		scenario("TC_26: Validate if the SA is able to fill the input fields like Start Date,End Date Deal Currency and Onshore/offshore split, etc and save the screen.");
		parameter.fillData_ParameterScreen(ConstantUtils.TestData_Parameter);

		
	}

}
