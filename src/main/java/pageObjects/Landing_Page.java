package pageObjects;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import org.testng.Assert;

import reusableComponents.RandomUtilities;
import reusableComponents.ConstantUtils;
import reusableComponents.VerificationLibrary;
 
public class Landing_Page extends Login_Page { 
	/************************** LOCATORS *****************************/
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Welcome to myIntegrated Solution Platform']")
	public WebElement Landing_Page;

	@FindBy(how = How.XPATH, using = "//a[text()='Learn']")
	public WebElement Learn_Icon;

	@FindBy(how = How.XPATH, using = "//div[@class='solutioning_container']")
	public WebElement Solutioning_Workflow;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Services']")
	public WebElement Service_Icon;

	@FindBy(how = How.XPATH, using = "//div[@class='song-text']")
	public WebElement Song_Text;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Manage']")
	public WebElement Manage_Icon;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-page-header ng-star-inserted']")
	public WebElement Manage_Text;

	@FindBy(how = How.XPATH, using = "//img[@alt='mySP-logo']")
	public WebElement MYISP_Icon;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Register Now']")
	public WebElement Register_Icon;

	@FindBy(how = How.XPATH, using = "//img[@class='notificationBadge ng-star-inserted']")
	public WebElement Notification_Icon;

	@FindBy(how = How.XPATH, using = "//img[@class='user-default-icon action-hover ng-star-inserted']")
	public WebElement Profile_Icon;

	@FindBy(how = How.XPATH, using = "//h2[@class='mat-dialog-title']")
	public WebElement URR_Text;
	
//	@FindBy(how = How.XPATH, using = "//div[contains(@class,'mpl-custom-popup')]/header/h2")
//	public WebElement URR_Text;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'mat-select-value ng-tns')])[1]")
	public WebElement Capability_Dropdown;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Technology']")
	public WebElement Option_Technology;

	@FindBy(how = How.XPATH, using = "//div[@class='btn-wrap']//span[@class='mat-button-wrapper'][normalize-space()='Submit']")
	public WebElement Submit_Btn;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='English']")
	public WebElement English_Icon;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='My Role Preferences']")
	public WebElement MyRole_Icon;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='App Preferences']")
	public WebElement App_Icon;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Help']")
	public WebElement Help_Icon;

	@FindBy(how = How.XPATH, using = "//span[@class='menu-item-name user-logout']")
	public WebElement Logout_Icon;

	
	@FindBy(how = How.XPATH, using = "//div[@class='mpl-notification-container'][child::img]")
	public WebElement Notification_Badge;
	@FindBy(how = How.XPATH, using = "//span[text()='MMS Status Mismatch']")
	public WebElement MMS_Status_Mismatch;
	@FindBy(how = How.XPATH, using = "//span[text()='Notification']")
	public WebElement Notification;
	@FindBy(how = How.XPATH, using = "//span[text()='Information']")
	public WebElement Information;
	@FindBy(how = How.XPATH, using = "//img[contains(@class,'user')]")
	public WebElement UserProfileIcon;
	@FindBy(how = How.XPATH, using = "//span[text()='My Role Preferences']")
	public WebElement MyRolePreferences;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'role-preference')]//child::span[@class='mat-radio-label-content']")
	public List<WebElement> RolePreferences;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]/parent::button")
	public WebElement Save;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'role-container')]/span[contains(@class,'user-role')]")
	public WebElement activeRole;
	@FindBy(how = How.XPATH, using = "//img[@alt='mySP-logo']")
	public WebElement myISPLogo;
	@FindBy(how = How.XPATH, using = "//img[@id='chatbtn']")
	public WebElement chatBtn;
	@FindBy(how = How.XPATH, using = "//img[@id='ssfdbtn']")
	public WebElement ssfdBtn;
	@FindBy(how = How.XPATH, using = "//div[@id='supportNew']/img[@id='supbtn2']")
	public WebElement supportBtn;
	@FindBy(how = How.XPATH, using = "//a[text()='Overview'][ancestor::ul[contains(@class,'navigationlist')]]")
	public WebElement overviewHeader;
	@FindBy(how = How.XPATH, using = "//a[text()='Vision'][ancestor::ul[contains(@class,'navigationlist')]]")
	public WebElement visionHeader;
	@FindBy(how = How.XPATH, using = "//a[text()='Platform Capability Framework'][ancestor::ul[contains(@class,'navigationlist')]]")
	public WebElement platformArchitectureHeader;
	@FindBy(how = How.XPATH, using = "//a[text()='Product USP'][ancestor::ul[contains(@class,'navigationlist')]]")
	public WebElement productUSPHeader;
	@FindBy(how = How.XPATH, using = "//a[text()='Success Stories'][ancestor::ul[contains(@class,'navigationlist')]]")
	public WebElement successStoriesHeader;
	@FindBy(how = How.XPATH, using = "//a[text()='Utilities'][ancestor::ul[contains(@class,'navigationlist')]]")
	public WebElement utilitiesHeader;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Welcome to myIntegrated Solution Platform']")
	public WebElement welcomeHeader;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space(text())='Our Vision']")
	public WebElement visionSectionHeader;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space(text())='Platform Capability Framework']")
	public WebElement platformArchitectureSectionHeader;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space(text())='Product USP']")
	public WebElement productUSPSectionHeader;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space(text())='Product USP']")
	public WebElement successStoriesSectionHeader;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space(text())='Hello,']")
	public WebElement utilitiesSectionHeader;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@src,'/assets/images/Dashboard$Images$scrolldown_White.svg')]")
	public WebElement Scroll_Button;

	@FindBy(how = How.ID, using = "our-vision-wrapper")
	public WebElement Vision_Page;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'font-16 text-uppercase')]")
	public WebElement VisionPage_Title1;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Our Vision')]")
	public WebElement VisionPage_Title2;

	@FindBy(how = How.XPATH, using = "//div[@class='manage-card']")
	public WebElement Reporting_workbook_Container;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), ' REPORTING WORKBOOK ')]")
	public WebElement Reporting_WorkBookTitle;

	@FindBy(how = How.XPATH, using = "(//div[@class='manage-card']//following-sibling::div[2]//button[text()=' Download '])[1]")
	public WebElement Reporting_WorkBookDownloadBtn;

	@FindBy(how = How.XPATH, using = "(//div[@class='manage-card']//following-sibling::div[2]//button[text()=' Learn More '])[1]")
	public WebElement Reporting_WorkBookLearnBtn;

	@FindBy(how = How.XPATH, using = "(//div[@class='row']/div/following-sibling::div)[4]")
	public WebElement PCWKDA_workbook_Container;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'PCW')]")
	public WebElement PCWKDA_workbookTitle;

	@FindBy(how = How.XPATH, using = "(//div[@class='manage-card']//following-sibling::div[2]//button[text()=' Download '])[2]")
	public WebElement PCWKDA_WorkBookDownloadBtn;

	@FindBy(how = How.XPATH, using = "(//div[@class='manage-card']//following-sibling::div[2]//button[text()=' Learn More '])[2]")
	public WebElement PCWKDA_WorkBookLearnBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-footer-container']")
	public WebElement Page_Footer;

	@FindBy(how = How.ID, using = "Logo-Accenture")
	public WebElement Accenture_logo;

	@FindBy(how = How.XPATH, using = "//div[@class='drag-boundary']/div/a/img")
	public WebElement Ask_DiSAA;

	@FindBy(how = How.XPATH, using = "//div[@class='ng-star-inserted']")
	public WebElement SSFD;

	@FindBy(how = How.XPATH, using = "//div[@id='supportNew']/img[@class='black-icon']")
	public WebElement Support;

	@FindBy(how = How.XPATH, using = "//div[@class='mpl-footer-menu-header']/span")
	public WebElement FeedBack_Title;

	@FindBy(how = How.XPATH, using = "//div[@id='supportNew']/img[@class='black-icon']")
	public WebElement FeedBack_Description_Message;

	@FindBy(how = How.XPATH, using = "//button[@class='mpl-feedback-button']")
	public WebElement FeedBack_Btn;

	
	
	public Landing_Page () {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	/**
	 * TC_1: Validate that user is able to navigate in Landing Page
	 * 
	 * @since 12/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author sarthak.gautam
	 */

	public void validateLandingPage() throws Exception {
		boolean scenarioFlag = false;

		// Validating Landing Page
		
		waitForElementToAppear(Landing_Page);

		if (Landing_Page.isDisplayed()) {
			logPass("User is able to navigate in Landing Page.");
			scenarioFlag = true;
		} else {
			logFail("The user is NOT able to navigate in Landing Page.");
		}
		if (scenarioFlag == true)
			scenarioPass();
	}



	/**
	 * TC_2: Validate that MY Integrated SOLUTION Platform,Learn and Manage redirection links are available in Landing Page
	 * 
	 * @since 12/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author sarthak.gautam
	 */

	public void validateMYISP() throws Exception{
		boolean scenarioFlag = false, flag2 = true;

		// Validating Learn Tab

		waitForElementToAppear(Learn_Icon);
//		clickElement(Learn_Icon);
//		waitForElementToAppear(Solutioning_Workflow);

		if(Learn_Icon.isDisplayed()) {
			logPass("Learn icon redirection link is available in Landing Page");
		}
		else {
			logFail("Learn icon redirection link is not available in Landing Page");
			flag2 = false;
		}

		// Validating Manage Tab

		waitForElementToAppear(Manage_Icon);
//		clickElement(Manage_Icon);
//		waitForElementToAppear(Manage_Text);

		if(Manage_Icon.isDisplayed()) {
			logPass("Manage icon redirection link is available in Landing Page");
		}
		else {
			logFail("Manage icon redirection link is not available in Landing Page");
			flag2 = false;
		}


		// Validating MY Solution Planner tab

//		waitForElementToAppear(MYISP_Icon);
//		waitForElementToBePresent(MYISP_Icon);
//		clickElement(MYISP_Icon);
		waitForElementToAppear(Landing_Page);

		if(Landing_Page.isDisplayed()) {
			logPass("MySolution Planner redirection link is available in Landing Page");
		}
		else {
			logFail("MySolution Planner redirection link is not available in Landing Page");
			flag2 = false;
		}

		if (flag2 == true) {
			logPass("MY SOLUTION PLANNER, Learn and Manage redirection links are available in Landing Page");
			scenarioFlag = true;
		} else {
			logFail("MY SOLUTION PLANNER, Learn and Manage redirection links are available in Landing Page");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		}
	}



	/**
	 * TC_3: Validate that Register now , Profile and bell icons are available in right side of the Landing Page
	 * 
	 * @since 12/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author sarthak.gautam
	 */


	public void validateIcons() {
		boolean scenarioFlag = false;

		// Validating Register Here, profile and notification icon visibility on landing page
		waitForElementToAppear(Register_Icon);

		if (Register_Icon.isDisplayed() || Profile_Icon.isDisplayed() || Notification_Icon.isDisplayed()) {
			logPass("Register here , Profile and notification icons are getting be displayed in right side of the Landing Page");
			scenarioFlag = true;
		} else {
			logFail("Register here , Profile and notification icons are not getting be displayed in right side of the Landing Page");
		}

		if (scenarioFlag == true)
			scenarioPass();	

	}



	/**
	 * TC_4: Validate that clicking on register now user is able to send request
	 * 
	 * @since 12/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author sarthak.gautam 
	 */

	public void validateRegisterNow() throws Exception {
		boolean scenarioFlag = false;

		//Validating Register Now function
		if(!Register_Icon.getAttribute("class").contains("disableLink")) {
		clickElement(Register_Icon);
		addPaddedWait(5);
		waitForElementToAppear(URR_Text);
		clickElement(Capability_Dropdown);
		clickElement(Option_Technology);
		clickElement(Submit_Btn);
			if(Landing_Page.isDisplayed()) {
			logPass("Registration request is sent after clicking Submit");
			scenarioFlag = true;
		}
			else {
			logFail("Registration request id not sent after clicking Submit");
		}
	}
		else {
			logPass("Already Registered.....");
			}
		if (scenarioFlag == true)
			scenarioPass();	
	}



	/**
	 * TC_5: Validate that clicking on Profile icon user is able to see below fields  1. English 2 My Role prefrences 3. App prefrence 4. Help 5. logout
	 * 
	 * @since 12/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author sarthak.gautam
	 */

	public void validateProfileIcon() throws Exception {
		boolean scenarioFlag = false;

		// Validating fields in Profile Menu
		waitForElementToBePresent(Profile_Icon);
		clickElement(Profile_Icon);
		waitForElementToAppear(English_Icon);

		if (English_Icon.isDisplayed() || MyRole_Icon.isDisplayed() || Help_Icon.isDisplayed() || App_Icon.isDisplayed() || Logout_Icon.isDisplayed()) {
			logPass("Clicking on Profile icon user is able to see below fields 1. English 2 My Role prefrences 3. App prefrence 4. Help 5. logout.");
			scenarioFlag = true;
		} 
		else {
			logFail("Clicking on Profile icon user is not able to see below fields 1. English 2 My Role prefrences 3. App prefrence 4. Help 5. logout.");
		}
		
		if (scenarioFlag == true)
			scenarioPass();	
	}

	
	/**
	 * TC_06: Validate Notification icon user able to see MMS Status Mismatch, Notification, Information fields.
	 * 
	 * @since 12/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */
	public void validateNotificationBadge() throws Exception{
		boolean scenarioFlag = false;
		waitForElementToBePresent(Notification_Badge);
		waitForElementClickable(Notification_Badge);
		clickElement(Notification_Badge);
		waitForElementToBeVisible(MMS_Status_Mismatch);
		if (isElementPresent(MMS_Status_Mismatch) && isElementPresent(Notification) && isElementPresent(Information)) {
			logPass("After clicking Notification Badge able to view MMS Status Mismatch, Notification, Information");
			scenarioFlag = true;
		}
		else
			logFail("After clicking Notification Badge not able to view fields MMS Status Mismatch or Notification or Information");
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
	}
	/**
	 * TC_07: Validate that on click on my Role preferences user able see access roles
	 * 
	 * @since 13/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */
	public void validateRolePreference() throws Exception{
		boolean scenarioFlag = false;
	//	clickElement(UserProfileIcon);
	//	waitForElementToBeVisible(MyRolePreferences);
		clickElement(MyRolePreferences);
		if(RolePreferences.size()>0) {
			logPass("In Role preferences user able to see assigned roles");
			scenarioFlag = true;
		}
		else {
			logFail("In Role preferences user not able to see assigned roles");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
	}
	/**
	 * TC_08: Validate that user is able to switch the role in landing page
	 * 
	 * @since 13/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */
	public void validateSwitchRoles() throws Exception{
		boolean scenarioFlag = false;
		String rolePreference = "";
		int randomNum;
	//	clickElement(UserProfileIcon);
	//	waitForElementToBeVisible(MyRolePreferences);
	//	clickElement(MyRolePreferences);
		randomNum = RandomUtilities.generateRandomNumber(0,RolePreferences.size()-1);
		rolePreference = getText(RolePreferences.get(randomNum));
		clickElement(RolePreferences.get(randomNum));
		waitForElementClickable(Save);
		jsClick(Save);
		waitForElementToAppear(UserProfileIcon);
		waitForElementToBeVisible(UserProfileIcon);
		waitForElementClickable(UserProfileIcon);
		clickElement(UserProfileIcon);
		if(activeRole.getText().contains(rolePreference)) {
			logPass("After selecting role in role preference. User able to see the updated role in profile section");
			scenarioFlag = true;
		}
		else {
			logFail("After selecting role in role preference. User not able to see the updated role in profile section");
		}
		clickElement(activeRole);
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
	}
	/**
	 * TC_09:  Validate that MYISP title with icon should be available in left side corner in Landing Page.
	 * 
	 * @since 14/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */
	public void validateMyISPLogo() throws Exception{
		boolean scenarioFlag = false;
		waitForElementToAppear(myISPLogo);
		if(isDisplayed(myISPLogo)) {
			logPass("MyISP title with icon is diaplayed in left side corner in Landing page");
			scenarioFlag = true;
		}
		else {
			logFail("MyISP title with icon is not diaplayed in left side corner in Landing page");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
	}
	
	/**
	 * TC_10:  Validate that user able to redirect to particular section after clicking header in Landing page.
	 * 
	 * @since 14/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */
	public void validateHeaders() throws Exception{
		boolean scenarioFlag = false;
		List<Boolean> Flag = new ArrayList<>();
		List<WebElement> headers = Arrays.asList(visionHeader,platformArchitectureHeader,
				productUSPHeader,successStoriesHeader,utilitiesHeader,overviewHeader);
		List<WebElement> headersSection = Arrays.asList(visionSectionHeader,
				platformArchitectureSectionHeader,productUSPSectionHeader,successStoriesSectionHeader,
				utilitiesSectionHeader,welcomeHeader);
		for(int i = 0; i < headers.size(); i++) {
			clickElement(headers.get(i));
			if(!headers.get(i).getText().equalsIgnoreCase("Product USP") && 
					!headers.get(i).getText().equalsIgnoreCase("Success Stories")) {
				waitForElementToBeVisible(headersSection.get(i));
				if(isDisplayed(headersSection.get(i))) {
					Flag.add(true);
				}
				else {
					Flag.add(false);
				}
			}
		}
		if(!Flag.contains(false)) {
			logPass("User able to navigate to particular section after clicking headers in Landing page");
			scenarioFlag = true;
		}
		else{
			logFail("User not able to navigate to particular section after clicking headers in Landing page");
		}
		
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
		
	}

	/**
	 * TC_11:  Validate that DISSA,SSFD and Support icons to be displayed in Landing Page.
	 * 
	 * @since 14/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author ganesh.kumar.majeti
	 */
	public void validateSideIcons() throws Exception{
		boolean scenarioFlag = false;
		waitForElementToAppear(myISPLogo);
		if(isDisplayed(chatBtn) && isDisplayed(ssfdBtn) && isDisplayed(supportBtn)) {
			logPass("DISSA,SSFD and Support icons is displayed in Landing page");
			scenarioFlag = true;
		}
		else {
			logFail("DISSA or SSFD or Support icons is not displayed in Landing page");
		}
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
	}
	
	/**
	 * TC_12: Validate that clicking on Scroll down user can able to navigate Vision
	 * section
	 * 
	 * @since 12/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author shaik.Mahaboobpeer
	 */

	public void navigateVisionSection() throws Exception {
		boolean scenarioFlag = false;

		// Scroll Button
		waitForElementToBeVisible(Scroll_Button);
		clickElement(Scroll_Button);

		// Our Vision Page
		waitForElementToBeVisible(Vision_Page);
		
		if (getText(VisionPage_Title2).equals("Our Vision") && (getText(VisionPage_Title1).equals("WHAT IS"))) {
			logPass("After Clicks Scroll button the user is Navigating to Our Vision Page");
			scenarioFlag = true;

		} else
			logFail("After Clicks Scroll button the user is not Navigating to Our Vision Page");

		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	/**
	 * TC_13: Validate that all the info containers(Reporting workbook and PCW KDA
	 * Workbook 3.0) is available with download and learn more buttons in Landing
	 * page
	 * 
	 * @since 13/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author shaik.Mahaboobpeer
	 */

	public void WorkBookValidations() throws Exception {
		boolean scenarioFlag = false;

		waitForElementToBeVisible(Scroll_Button);
		clickElement(Scroll_Button);
		scroll("bottom");

		// REPORTING WORKBOOK
		waitForElementToBeVisible(Reporting_workbook_Container);

		// REPORTING WORKBOOK Title
		waitForElementToBeVisible(Reporting_WorkBookTitle);
		waitForTextToBePresentInElement(Reporting_WorkBookTitle, "REPORTING WORKBOOK");
		
		//getText(Reporting_WorkBookTitle).equals("REPORTING WORKBOOK");

		// REPORTING WORKBOOK Download Button
		waitForElementToBeVisible(Reporting_WorkBookDownloadBtn);
		waitForTextToBePresentInElement(Reporting_WorkBookDownloadBtn, "Download");
		//getText(Reporting_WorkBookDownloadBtn).equals(" Download ");

		// REPORTING WORKBOOK Learn More Button
		waitForElementToBeVisible(Reporting_WorkBookLearnBtn);
		waitForTextToBePresentInElement(Reporting_WorkBookLearnBtn, "Learn More");
		//getText(Reporting_WorkBookLearnBtn).equals(" Learn More ");

		// PCW KDA WORKBOOK
		waitForElementToBeVisible(PCWKDA_workbook_Container);

		// PCW KDA WORKBOOK Title
		waitForElementToBeVisible(PCWKDA_workbookTitle);
		waitForTextToBePresentInElement(PCWKDA_workbookTitle, "PCW KDA WORKBOOK - V3.0");
		//getText(PCWKDA_workbookTitle).equals("PCW KDA WORKBOOK - V3.0");

		// PCW KDA WORKBOOK Download Button
		waitForElementToBeVisible(PCWKDA_WorkBookDownloadBtn);
		waitForTextToBePresentInElement(PCWKDA_WorkBookDownloadBtn, "Download");
		//getText(PCWKDA_WorkBookDownloadBtn).equals(" Download ");

		// PCW KDA WORKBOOK Learn More Button
		waitForElementToBeVisible(PCWKDA_WorkBookLearnBtn);
		waitForTextToBePresentInElement(PCWKDA_WorkBookLearnBtn, "Learn More");
		//getText(PCWKDA_WorkBookLearnBtn).equals(" Learn More ");

		if (waitForTextToBePresentInElement(Reporting_WorkBookTitle, "REPORTING WORKBOOK")
				&& (waitForTextToBePresentInElement(PCWKDA_workbookTitle, "PCW KDA WORKBOOK - V3.0"))) {
			
			logPass("After Scrolling down the Reporting workbook and PCW KDA Workbook 3.0 containers available with download and learn more buttons in Landing page ");
			scenarioFlag = true;

		} else
			logFail("After Scrolling down the Reporting workbook and PCW KDA Workbook 3.0 containers not available with download and learn more buttons in Landing page ");

		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	/**
	 * TC_14: Validate that clicking on download user is able to download file
	 *
	 * @since 14/03/2024
	 *
	 * @release March 16
	 *
	 * @author shaik.Mahaboobpeer
	 */
 
	public void WorkBookDownloadValidation(String downloadPath, String fileName) throws Exception {
		boolean scenarioFlag = false;
		String isReportingWorkbookdownloaded = "";
		String ReportingWorkbookfilename = "myConcerto Reporting Workbook v1.1";
		
		// REPORTING WORKBOOK Download
		dir_doc_verify_del(ReportingWorkbookfilename);
		waitForElementToBeVisible(Reporting_WorkBookTitle);
		waitForTextToBePresentInElement(Reporting_WorkBookTitle, "REPORTING WORKBOOK");
		//getText(Reporting_WorkBookTitle).equals("REPORTING WORKBOOK");
		waitForTextToBePresentInElement(Reporting_WorkBookDownloadBtn, "Download");
		//getText(Reporting_WorkBookDownloadBtn).equals(" Download ");
		
		clickElement(Reporting_WorkBookDownloadBtn);
		addPaddedWait(5);
		addPaddedWait(5);
		isReportingWorkbookdownloaded = checkFileDownloadStatus_Reporting(ConstantUtils.DownloadedFiles_FilePath,
				ReportingWorkbookfilename);
		System.out.println(isReportingWorkbookdownloaded);
 
		// PCW KDA WORKBOOK
		String isKDAWorkbookdownloaded = "";
		String KDAWorkbookfilename = "KDA Workbook v3.0";
 
		dir_doc_verify_del(KDAWorkbookfilename);
		waitForElementToBeVisible(PCWKDA_workbookTitle);
		waitForTextToBePresentInElement(PCWKDA_workbookTitle, "PCW KDA WORKBOOK - V3.0");
		//getText(PCWKDA_workbookTitle).equals("PCW KDA WORKBOOK - V3.0");
		waitForTextToBePresentInElement(PCWKDA_WorkBookDownloadBtn, "Download");
		//getText(PCWKDA_WorkBookDownloadBtn).equals(" Download ");
		clickElement(PCWKDA_WorkBookDownloadBtn);
		addPaddedWait(5);
		addPaddedWait(5);
		isKDAWorkbookdownloaded = checkFileDownloadStatus_PCW(ConstantUtils.DownloadedFiles_FilePath, KDAWorkbookfilename);
		System.out.println(isKDAWorkbookdownloaded);
 
		if (isReportingWorkbookdownloaded.equals("true") && (isKDAWorkbookdownloaded.equals("true"))) {
			logPass(" The user can able to download the WorkBooks ");
			scenarioFlag = true;
		} else
			logFail("The user not able to download the WorkBooks");
 
		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
 
	}
 
	public String checkFileDownloadStatus_Reporting(String FilePath, String FileName) throws InterruptedException {
		//boolean scenarioFlag = true;
		String filename = "myConcerto Reporting Workbook v1.1";
		// driver.findElement(By.xpath(".//*[@id='GPSGrid']//div[contains(@class,'ag-body-container')]//div[@row-id='0']/div[@col-id='GPSDocumentNm']")).getAttribute("title");
		addPaddedWait(5);
		addPaddedWait(5);
		String DownloadedStatus = "false";
		File dir = new File(FilePath);
		if (!dir.isDirectory())
			throw new IllegalStateException("Filenotfound");
		for (File file : dir.listFiles()) {
			if (file.getName().contains(filename)){
			//if (file.getName().equals(filename)) {
				addPaddedWait(4);
				DownloadedStatus = "true";
				break;
			}
		}
		return DownloadedStatus;
	}
	
	public String checkFileDownloadStatus_PCW(String FilePath, String FileName) throws InterruptedException {
		//boolean scenarioFlag = true;
		String filename = "KDA Workbook v3.0";
		// driver.findElement(By.xpath(".//*[@id='GPSGrid']//div[contains(@class,'ag-body-container')]//div[@row-id='0']/div[@col-id='GPSDocumentNm']")).getAttribute("title");
		addPaddedWait(5);
		String DownloadedStatus = "false";
		File dir = new File(FilePath);
		if (!dir.isDirectory())
			throw new IllegalStateException("Filenotfound");
		for (File file : dir.listFiles()) {
			if (file.getName().contains(filename)){
			//if (file.getName().equals(filename)) {
				addPaddedWait(4);
				DownloadedStatus = "true";
				break;
			}
		}
		return DownloadedStatus;
	}

	/**
	 * TC_15: Validate that clicking on learn more user should able to navigate in
	 * particular screen
	 * 
	 * @since 14/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author shaik.Mahaboobpeer
	 */

	public void ReportingandPCW_Workbook_LearnMore_Validations() throws Exception {
		boolean scenarioFlag = false;
		
		String ReportingLearnURl = "https://mediaexchange.accenture.com/media/t/1_qxiz9oic";
		String PCWLearnURL = "https://mediaexchange.accenture.com/media/t/1_q0q2y3rz";
		String ReportingTitle = "REPORTING WORKBOOK";
		String PCWKDATitle = "PCW KDA WORKBOOK - V3.0";
		

		// Reporting Workbook Learn more Validations
		scrollToElement(Reporting_workbook_Container);
		getText(Reporting_WorkBookTitle).equals(ReportingTitle);
		clickElement(Reporting_WorkBookLearnBtn);
		getDriver().switchTo().defaultContent();
		
		addPaddedWait(5);
		String ReportingLearnmoreurl = getDriver().getCurrentUrl();
		getDriver().switchTo().defaultContent();
		//Assert.assertEquals(ReportingLearnmoreurl, ReportingLearnURl);
		//closeTab(1);

		// PCW Workbook Learn more Validations
		scrollToElement(PCWKDA_workbook_Container);
		getText(PCWKDA_workbookTitle).equals(PCWKDATitle);
		clickElement(PCWKDA_WorkBookLearnBtn);
		getDriver().switchTo().defaultContent();
		String PCWLearnmoreurl = getDriver().getCurrentUrl();
		//Assert.assertEquals(PCWLearnmoreurl, PCWLearnURL);

		if (getText(Reporting_WorkBookTitle).equals(ReportingTitle)
				&& getText(PCWKDA_workbookTitle).equals(PCWKDATitle)) {
			logPass(" After Clicking Learnmore button the user is  Navigation to another page  ");
			scenarioFlag = true;
		} else
			logFail("After Clicking Learnmore button the user is not Navigating to another page");

		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	/**
	 * TC_16: Validate that Footer (Accenture logo, Help support and give
	 * feedback)is available in Landing Page with proper format particular screen
	 * 
	 * @since 15/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author shaik.Mahaboobpeer
	 */

	public void LandingPage_FooterValidations() throws Exception {

		String FeedBack_Description = "Help us make the myIntegrated Solution Platform experience better. If you have a comment, idea or even a question, let us know.6";

		boolean scenarioFlag = false;
		// Navigating to Footer of the page
		//jse.executeScript("arguments[0],scrollIntoView();", Page_Footer);
		scrollToElement(Page_Footer);
		// Accenture Logo
		waitForElementToBeVisible(Accenture_logo);
		// Help support Icons
		waitForElementToBeVisible(Ask_DiSAA);
		waitForElementToBeVisible(SSFD);
		waitForElementToBeVisible(Support);

		// give feedback
		// FeedBack Title
		waitForElementToBeVisible(FeedBack_Title);
		getText(FeedBack_Title).equals("Feedback");

		// FeedBack Description
		waitForElementToBeVisible(FeedBack_Description_Message);
		getText(FeedBack_Title).equals(FeedBack_Description);

		// FeedBackButton
		waitForElementToBeVisible(FeedBack_Btn);

		if (waitForElementToBeVisible(Accenture_logo).isDisplayed()
				&& waitForElementToBeVisible(Ask_DiSAA).isDisplayed() && waitForElementToBeVisible(SSFD).isDisplayed()
				&& waitForElementToBeVisible(Support).isDisplayed()
				&& waitForElementToBeVisible(FeedBack_Btn).isDisplayed()) {
			logPass("In the Footer Page Accenture Logo, Help Support and Give Feedback details are displaying correctly to the user");
			scenarioFlag = true;
		} else
			logFail("In the Footer Page Accenture Logo, Help Support and Give Feedback details are not displaying correctly to the user");

		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}
	
 
}