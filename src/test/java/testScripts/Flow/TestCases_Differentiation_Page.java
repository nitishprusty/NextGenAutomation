package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConfigFileReader;
import testComponents.BaseTest;

public class TestCases_Differentiation_Page extends TestCases_Group_Page{
	
	String OppID_WAWS="";
	
	@Test(dependsOnMethods ={"Group"})
	public void Differentiation() throws Exception{
		
		
		
//		OppID_WAWS = ConfigFileReader.getTestData("OppIDs.OppID_LeadSA");
//		solComponent.NavigatetoSolutionComponents(OppID_WAWS);
//		
//		solComponent.RefreshVersion("806.00");
		
		  double Revenue = DifferentiationPage.ValidateDifferentitationEligibility();
		  
		  scenario("TC_45:Validate if the SA is able to navigate to Differentiation tab if Differentiation"
		  + "Eligibility Criteria is fullfilled."); 
		  DifferentiationPage.ValidateDifferentitationNavigationandEligibility(Revenue);
		  
		  scenario("TC_46:Validate if SA is able to Navigate to Differentiation on click of "
		  + "'Differentiation Link'."); 
		  DifferentiationPage.ValidateDifferentitationLink();
		  
		  scenario("TC_47:Validate if SA is able to Save Class A Assets tab with Assests selected from"
		  + "Asset List(Submitted,Draft,Exempted)"); 
		  DifferentiationPage.ValidateDifferentitationClassAstatus();
		  
		  scenario("TC_48:Validate if SA is able to save I&I Differentiators tab(Submitted,Draft,Exempted)"); 
		  DifferentiationPage.ValidateIandIDifferentiatorsstatus();
		  
	      //scenario("TC_127:Validate if SA is able to Add New Cost Calculater in Sustainability");
		  //DifferentiationPage.ValidatesustainabilityAddnewCalculator();
		    
//		  scenario("TC_49:Validate if SA is able to save Sustainaibility(Submitted,Draft,Exempted)");
//		  DifferentiationPage.ValidateSustainablitiySubmittedandExemptedstatus();
		  
		 // scenario("TC_128:Validate if SA is able to Add New Cost Calculater in Implicit Security");
		//DifferentiationPage.ValidateImplicitAddnewCalculator();
		  
//		  scenario("TC_50:Validate if SA is able to Sync Implicit Security tab.");
//		  DifferentiationPage.ValidateImplicitSecuritySubmittedandExemptedstatus();
		  
		  // new deal 0011523313 //OppID_Differentiation_Lessthan10million Revenue =
		//  DifferentiationPage.ValidateDifferentitationEligibility(); //opportunity
		  //workflow code //new version
		//  DifferentiationPage.ValidateExemptedstatus(Revenue);
		 
	}


}
