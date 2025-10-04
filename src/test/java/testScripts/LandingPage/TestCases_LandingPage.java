package testScripts.LandingPage;
 
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import pageObjects.Landing_Page;
import reusableComponents.ConfigFileReader;
import testComponents.Login;
 
	public class TestCases_LandingPage extends Login {

		//String UserID = "", Password = "", OppID_LastActivity = "";
		Landing_Page Landing_Page;	
 
		@Test(dependsOnMethods={"LoginApplication"})
		public void LandingPageValidation() throws Exception {
			Landing_Page = PageFactory.initElements(getDriver(), Landing_Page.class);
			//OppID_LastActivity = ConfigFileReader.getTestData("OppIDs.OppID_LastActivity");
			
			scenario("TC_1: Validate that user is able to navigate in Landing Page");
			Landing_Page.validateLandingPage();
			
			scenario("TC_2: Validate that MY  Integrated SOLUTION Platform,Learn and Manage redirection links are available in Landing Page"); 
			Landing_Page.validateMYISP();
			
			scenario("TC_3: Validate that Register now , Profile and bell icons are available in right side of the Landing Page");
			Landing_Page.validateIcons();
			
			scenario("TC_4: Validate that clicking on register now user is able to send request.");
			Landing_Page.validateRegisterNow();
			
			scenario("TC_5: Validate that clicking on Profile icon user is able to see below fields  1. English 2 My Role prefrences 3. App prefrence 4. Help 5. logout");
			Landing_Page.validateProfileIcon();	
			
			scenario("TC_07: Validate that on click on my Role preferences user able see access roles");
			Landing_Page.validateRolePreference();
			
			scenario("TC_08: Validate that user is able to switch the role in landing page");
			Landing_Page.validateSwitchRoles();
			
			scenario("TC_09:  Validate that MYISP title with icon should be available in left side corner in Landing Page.");
			Landing_Page.validateMyISPLogo();
			
			scenario("TC_10:  Validate that user able to redirect to particular section after clicking header in Landing page.");
			Landing_Page.validateHeaders();
			
			scenario("TC_11:  Validate that DISSA,SSFD and Support icons to be displayed in Landing Page.");
			Landing_Page.validateSideIcons();
			
			scenario("TC_12: Validate that clicking on Scroll down user can able to navigate Vision section");
			Landing_Page.navigateVisionSection();
			
			scenario("TC_13: Validate that all the info containers(Reporting workbook and PCW KDA Workbook 3.0) is available with download and learn more buttons in Landing page");
			Landing_Page.WorkBookValidations();
			
			scenario("TC_14: Validate that clicking on download user is able to download file");
			Landing_Page.WorkBookDownloadValidation(AppURL, Browser);
			
			scenario("TC_15: Validate that clicking on learn more user should able to navigate in particular screen");
			Landing_Page.ReportingandPCW_Workbook_LearnMore_Validations();
			
			scenario("TC_16: Validate that Footer (Accenture logo, Help support and  give feedback)is available in Landing Page with proper format");
			Landing_Page.LandingPage_FooterValidations();
			
//			Bug:3498185
//   		scenario("TC_06: Validate that click on notification user is able to view these fields MMS status mismatch, Notification, Information");
//			Landing_Page.validateNotificationBadge();
 
		}
}