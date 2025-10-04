package testScripts.Pyramids;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import reusableComponents.GlobalScreen;
import pageObjects.BasePage;
import pageObjects.Pyramids_Page;
import testComponents.Login;


public class TestCases_Pyramids extends Login{
	
	Pyramids_Page pyramidsPage;
	String UserID = "", Password = "", OppID_LastActivity = "";
	

	@Test(dependsOnMethods={"LoginApplication"})
	public void PyramidValidation() throws Exception {
		
		pyramidsPage = PageFactory.initElements(getDriver(), Pyramids_Page.class);
		OppID_LastActivity = ConfigFileReader.getTestData("OppIDs.OppID_LastActivity");
		
		scenario("TC_68: Validate if the SA is able to navigate to Pyramids tab on click of 'Pyramids' and "
				+"is able to view Transition,SD Core, SD RUM,SD Summary,Summary and Export Import Status tab.");
		Navigate_to_Screen(GlobalScreen.PYRAMIDS);
		pyramidsPage.ValidationPyramidsTab();

		scenario("TC_69:Validate if SA is able to Select/Edit Pyramid Type for a given Profile.");
		pyramidsPage.ValidateEditPyramid();

		scenario("TC_71:Validate is SA is able to Import/Export Pyramid file");
		scenario("TC_72:Validate if SA I able to see the Status of OU in Export/Import Status File.");
		scenario("TC_73:Validate if SA is able to see make the changes in exported excel and on import, the same changes "
				+ "should reflect on UI.");
		pyramidsPage.ValidatePyramidExportImport();
		
		scenario("TC_70: Validate if SA is able to View the Career Level wise split for the given profile.");
		pyramidsPage.YearSplit();

	}
}
