package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;

public class TestCases_RateCard_Page extends TestCases_SolutionComponent_Page{
	
	@Test(dependsOnMethods ={"SolutionComponent"})
	public void RateCard() throws Exception{
		
		scenario("TC 21 : Validate if SA is able to add Rate Card.");
		solComponent.add_RateCard(ConstantUtils.FilePath_RateCard, "Add RateCard", 0,0);
		
		scenario("TC 23 : Validate if SA is able to Export to Rate Card and see if all the records are flowing to Rate Card Exported Excel.");
		String ExportedFileName = solComponent.ExportRateCardValidation();
		
		scenario("TC 24 : Validate if SA is able to import Rate Card and the changes made are reflecting in UI.");
		solComponent.ImportRateCardValidation(ExportedFileName);
		
		Navigate_to_subTab(GlobalScreen.VERSIONS);
//		solComponent.RefreshVersion();
		
	}


}
