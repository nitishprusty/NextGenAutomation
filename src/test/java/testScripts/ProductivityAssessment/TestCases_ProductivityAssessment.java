package testScripts.ProductivityAssessment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;
import testComponents.Login;
import pageObjects.BasePage;
import pageObjects.ProductivityAssessment_Page;
import reusableComponents.ConfigFileReader;

public class TestCases_ProductivityAssessment extends Login {
	ProductivityAssessment_Page ProductivityAssessmentPage;
	String OppID_Productivity = "";

	@Test(dependsOnMethods={"LoginApplication"})
	public void ProductivityAssessmentValidation() throws Exception {

		ProductivityAssessmentPage = PageFactory.initElements(getDriver(), ProductivityAssessment_Page.class);		
		OppID_Productivity = ConfigFileReader.getTestData("OppIDs.OppID_Productivity");
		

		scenario("TC_36: Validate if SA is able to Navigate to Productivity Assesment tab( \r\n"
				+ "Deal Duration should be greater than 3 years, Pricing Type should not be Time and Material");
		ProductivityAssessmentPage.NavigatetoProductivityAssessment();
		
		scenario("TC_37: Validate if SA is able to take AM Assesment tab and view it if already taken.");
		scenario("TC_38: Validate if SA is able to take AD Assesment tab and view it if already taken.");
		ProductivityAssessmentPage.Productivity_Assessment();
		

	}
}
