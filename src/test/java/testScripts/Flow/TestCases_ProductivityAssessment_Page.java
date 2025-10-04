package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;

public class TestCases_ProductivityAssessment_Page extends TestCases_RampUp_Page{
	
	@Test(dependsOnMethods ={"RampUp"})
	public void ProductivityAssessment() throws Exception{
		
		scenario("TC_36: Validate if SA is able to Navigate to Productivity Assesment tab( \r\n"
				+ "Deal Duration should be greater than 3 years, Pricing Type should not be Time and Material");
		ProductivityAssessmentPage.NavigatetoProductivityAssessment();
		
		scenario("TC_37: Validate if SA is able to take AM Assesment tab and view it if already taken.");
		scenario("TC_38: Validate if SA is able to take AD Assesment tab and view it if already taken.");
		ProductivityAssessmentPage.Productivity_Assessment();
		
	}

}
