package pageObjects;
 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
import reusableComponents.SecurityClass;
 
public class Login_Page extends BasePage {
	private String key = "mysp";
 
	@FindBy(how = How.NAME, using = "loginfmt")
	public WebElement AzureUserName;
 
	@FindBy(how = How.XPATH, using = "//span[normalize-space(text())='I understand']")
	public WebElement IunderstandBtn;
 
	@FindBy(how = How.ID, using = "idSIButton9")
	public WebElement idSIButton;
 
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public WebElement lOGIN_Password;
 
	@FindBy(how = How.XPATH, using = "//input[@type='submit']|//span[@id='submitButton']")
	public WebElement lOGIN_SignInButton;
 
	@FindBy(how = How.XPATH, using = "//img[@alt='logout']/parent::a") 
	public WebElement Logout_button;
 
	@FindBy(how = How.XPATH, using = "//div[contains(@data-test-id,'menu-dots')]")
	public WebElement AzureLogin_ThreeMenuDots;
 
	@FindBy(how = How.XPATH, using = "//a[@id='forgetLink']")
	public WebElement AzureLogin_ForgetUser;
 
	@FindBy(how = How.XPATH, using = "//img[contains(@class , 'user-default-icon')]")
	public WebElement User_Icon;
 
	@FindBy(how = How.XPATH, using = "//div[@id='mat-menu-panel-0']//span[text() = 'My Role Preferences']")
	public WebElement RolePreferences_Item;
 
	@FindBy(how = How.XPATH, using = "//div[@id='mat-menu-panel-0']//span[contains(@class,'user-role')]")
	public WebElement User_Role;
 
	@FindBy(how = How.XPATH, using = "//span[text() = ' SA ']/..//span//input")
	public WebElement SA_Radiobtn;
 
	@FindBy(how = How.XPATH, using = "//button[@class = 'close-icon']//img")
	public WebElement Close_icon;
 
	@FindBy(how = How.XPATH, using = "//h1[contains(@class , 'myspheading')]")
	public WebElement LandingPage_Heading;
	
	@FindBy(how = How.XPATH, using = "//span[@class = 'mat-button-wrapper' and contains(text(),'Save')]")
	public WebElement Save_btn;
	
	@FindBy(how = How.XPATH, using = "//span[text() = ' SA ']/..//span[contains(@class,'inner-circle')]")
	public WebElement SARole_Radiobtn;
	
	@FindBy(how = How.ID, using = "idBtn_Back")
	public WebElement No_Option;
	
	
	
	
	/******************** METHODS ************************/
	public Login_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	/**
	 * Method to login.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author darshani.kokitkar
	 * 
	 */
	public void Login(String Uname, String pwd) throws Exception {
		
		// String encrypted = SecurityClass.encryptXOR(pwd, key);
		String decrypted = SecurityClass.decryptXOR(pwd, key);
		focusCurrentWindow();
		// logInfo("encrypted: "+ encrypted);
		sendKeys(AzureUserName, Uname);
		clickElement(idSIButton);
		clickElement(lOGIN_Password);
		sendKeys(lOGIN_Password, decrypted);
		clickElement(lOGIN_SignInButton); 
		waitForElementToBeVisible(No_Option);
		clickElement(No_Option); 
		scenarioPass();
		handleConfidentialInformationPopup_pro();
		
	}
 
	public void handleConfidentialInformationPopup_pro() throws Exception {
		try {
			waitForElementToAppear(IunderstandBtn);
			waitForElementToBeVisible(IunderstandBtn);
			clickElement(IunderstandBtn);
		}catch(Exception e) {
			logInfo("Confidential PopUp not visible");
		}
	}

	/**
	 * TC_1: Validate if the SA is able to login as SA at MyISP Next Gen Platform.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nitish.kumar.prusty
	 * 
	 */
	public void validateLandingPage() throws Exception {
		boolean scenarioFlag = false;

		boolean isUserSA = validateSARole();
		waitForElementToBeVisible(LandingPage_Heading);
		boolean isLandingPageHeaderDisplayed = isDisplayed(LandingPage_Heading);

		if (isUserSA && isLandingPageHeaderDisplayed) {
			logPass("Succesfully Navigated to the Landing Page");
			scenarioFlag = true;
		} else {
			logFail("Failed to Navigate to the Landing Page");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * Method to set SA role.
	 * 
	 * @since 28/02/2024
	 * @release March 16
	 * @author nitish.kumar.prusty
	 * 
	 */
	public boolean validateSARole() throws Exception {

		boolean scenarioFlag = false;
		String userRole = "";

		clickElement(User_Icon);

		userRole = getText(User_Role);
		clickElement(RolePreferences_Item);
		boolean isSASelected = SA_Radiobtn.isSelected();
		if (userRole.contains("SA") && isSASelected) {
			clickElement(Close_icon);
			logPass("Succesfully logged in as SA Role");
			scenarioFlag = true;
		} else {
			clickElement(SARole_Radiobtn);
			clickElement(Save_btn);
			scenarioFlag = true;
		}
		return scenarioFlag;
	}
}