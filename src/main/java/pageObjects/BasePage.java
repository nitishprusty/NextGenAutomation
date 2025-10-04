package pageObjects;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;
import reusableComponents.FunctionLibrary;


public class BasePage extends FunctionLibrary 
{
	public static String AppURL = "";
	public static String Browser = "";

	public BasePage() 
	{
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//div[@id='collapseConfigMenu' or @ id='costandprice']//li[not(contains(@style,'display:none'))]//a/..")
	public List<WebElement> global_R1AndR2ScreensActive;

	@FindBy(how = How.XPATH, using = "//div[@id='collapseConfigMenu' or @ id='costandprice']//li[not(contains(@style,'display:none'))]//a")
	public List<WebElement> global_R1AndR2Screens;

	@FindBy(how = How.XPATH, using = "//div[@id='confidentialityModal']//button[text()='I understand']")
	public WebElement dashboardPage_button_IUnderstand;

	@FindBy(how = How.XPATH, using = "//*[@id='confidentialityModal']//h6")
	public List<WebElement> confidentialAcceptancePopUpHeader;

	@FindBy(how = How.XPATH, using = "//*[@id='confidentialityModal']//section//button")
	public List<WebElement> ok_confidentialPopUp;

	@FindBy(how = How.ID, using = "SclinkId")
	public WebElement CostingNewUI_SolutionCost_tab;

	@FindBy(how = How.ID, using = "MotelinkId")
	public WebElement CostingNewUI_MoTE_tab;

	@FindBy(how = How.ID, using = "guidanceCostlinkId")
	public WebElement Costing_GuidenceCosttab;

	@FindBy(how = How.XPATH, using = "//*[@id='InfrastructureChargeslinkId']")
	public WebElement GuidanceCosts_InfrastructureChargesScreen;

	@FindBy(how = How.XPATH, using = "//*[@id='SecuredBaylinkId']")
	public WebElement Costing_SecuredBay_Tab;

	@FindBy(how = How.ID, using = "VoiceconnectivitylinkId")
	public WebElement Costing_Voiceconnectivity_tab;

	@FindBy(how = How.ID, using = "DataconnectivitylinkId")
	public WebElement Costing_DataConnectivity_tab;

	@FindBy(how = How.XPATH, using = "//*[@id='ShiftlinkId']")
	public WebElement Costing_Shift_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='oncalllinkId']")
	public WebElement Costing_Oncall_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='overtimelinkId']")
	public WebElement Costing_OvertimeLink;

	@FindBy(how = How.XPATH, using = "//*[@id='DnplinkId']")
	public WebElement Costing_CostItemDNPLink;

	@FindBy(how = How.XPATH, using = ".//*[@id='locationpremiumlinkId']")
	public WebElement CostingNewUI_LP_tab;

	@FindBy(how = How.XPATH, using = "//*[@id='otherCostlinkId']")
	public WebElement Costing_OtherCost_Tab;

	@FindBy(how = How.ID, using = "otherCostlinkId")
	public WebElement Costing_OtherCost_tab;

	@FindBy(how = How.XPATH, using = "//*[@id='defineRampup']/a")
	public WebElement RampUp_navigation;

	@FindBy(how = How.XPATH, using = "//li[@id = 'MotelinkId']/a")
	public WebElement Costing_Transition_Estimate_Input_MoTE_tab;

	@FindBy(how = How.XPATH, using = ".//*[text()='Transition']")
	public WebElement Rampup_TransTab;

	@FindBy(how = How.XPATH, using = "//*[@id='servicedelanchor']")
	public WebElement DR_SDtab;

	@FindBy(how = How.XPATH, using = "//*[@id='summaryanchor']")
	public WebElement DR_Summarytab;
	
	@FindBy(how = How.XPATH, using = "//button[@id='NavUnauthorizedpopupIdCancel']")
	public WebElement global_button_operationTimeOutPopupClose;
	
	@FindBy(how = How.XPATH, using = "//button/em[text()='Save and Continue']")
	public WebElement SaveAndContinue_PopUpBtn;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Discard and continue ']")
	public WebElement DiscardContinuwBtn;

	@FindBy(how = How.XPATH, using = "//div[@id='Navdialog']//*[text()='Cancel']//parent::button")
	public WebElement CancelPopUpBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='setRoleContinue']")
	public WebElement dashboardPage_button_continue;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'overlay')]//button/em[text()='I understand']")
	public WebElement rampupPage_button_IUnderstandConfidentialPopup;
	
	@FindBy(how = How.XPATH, using = "//h6[text()='Confidential Information - Reminder']")
	public List<WebElement> ConfidentialityPopUP_Header;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'shapingParameters']")
	public WebElement ShapingParameters_tab;
	
	@FindBy(how = How.ID, using = "ROMSolutionTab")
	public WebElement ROM_tab;

	@FindBy(how = How.ID, using = "ng-loaderimgP")
	public WebElement R1loader;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'active')]//label[@class='switch']/span[@class='switch-label']")
	public WebElement global_rippleToggleButton;
	
	@FindBy(how = How.CSS, using = "#pricingByEpId > div.ripple.form.pull-right > label.switch > span.switch-label")
	public WebElement global_rippleToggleButtonCSS;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Deal Arche Type']")
	public WebElement DealArcheType;
	
	@FindBy(how = How.XPATH, using = "//div[@ref='eBodyContainer']/div[@row-id='1']//span[contains(@class,'selection')]/span")
	public List<WebElement> DealArchType_CheckBox_prop;
	
	@FindBy(how = How.XPATH, using = "//div[@ref='eBodyContainer']/div[@row-id='1']//span[contains(@class,'selection')]/span/..")
	public WebElement DealArchType_CheckBox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='button-group gradient']/button//em")
	public WebElement solInputSaveButton;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'MMSID is not valid for Productivity Assessment')]/parent::div/following-sibling::div//em[contains(text(),'OK')]/parent::button")
	public WebElement estimates_button_assementOk;
	
	/********************************* Methods ***************************************************/

	public void startBrowser(String browserType) throws Exception {
		AppURL = ConfigFileReader.getTestData("credentials.AppURL");
		launchBrowser(browserType, AppURL);
	}
	
	public void startBrowserDebug(String browserType, String portNumber) throws Exception {
		AppURL = ConfigFileReader.getTestData("credentials.AppURL");
		launchBrowserDebug(browserType, AppURL, portNumber);
	}

	public void NavigatetoROM() throws Exception {
		clickElement(ROM_tab);
		
	}
	
	
	
	public void loader() throws Exception 
	{
		jse = (JavascriptExecutor) getDriver();
		List<WebElement> loaders = getDriver()
				.findElements(By.xpath("//*[contains(@id,'oader')][contains(@class,'loader')]"));
		for (WebElement loader : loaders) 
		{
			try 
			{
				@SuppressWarnings("rawtypes")
				ArrayList attributes = (ArrayList) jse.executeScript("var s=[]; var attrs=arguments[0].attributes;"
						+ "for(var l=0;l<attrs.length;l++){var a=attrs[l];s.push(a.name+':'+a.value);}; return s;",
						loader);

				for (Object o : attributes) 
				{
					String[] att = o.toString().split(":");
					if (att[0].equals("id") && att[1].equals("appLoader"))
						waitForAttributeToChange(loader, "class", "loader d-none");
					if (att[0].equals("hidden") || att[0].equals("style"))
						switch (att[0]) 
						{
						case "hidden":
							waitForAttributeToChange(loader, att[0], "true");
							break;
						case "style":
							waitForAttributeToChange(loader, att[0], "display: none");
							break;
						case "class":
							waitForAttributeToChange(loader, att[0], "loader d-none");
							break;
						default:
							handleAsyncWait();
						}
				}

			} 
			catch (Exception e) 
			{
				if (e.getMessage().contains("stale element"))
					handleAsyncWait();
				else
					throw e;
			}

		}
	}
	public void handle_DoYouWantToSavePopUp(String option) throws InterruptedException {
		try {
		if (option.equalsIgnoreCase("Save and Continue") || option.contains("Save"))
			clickElement(SaveAndContinue_PopUpBtn);
		if (option.equalsIgnoreCase("Discard and continue") || option.contains("Discard"))
			clickElement(DiscardContinuwBtn);
		if (option.equalsIgnoreCase("Cancel"))
			clickElement(CancelPopUpBtn);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}


	public void selectDropdownByVisibleText(WebElement element, String visibleText) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(visibleText);
	}
	

	public void Navigate_to_Screen(String screenName) throws Exception 
	{
		String isActive = "";
		String tabName = "";
		
			try 
			{
				WebElement navigationTab = getDriver().findElement(By.xpath("//*[@id='" + screenName + "']"));
				waitForElementToBeVisible(navigationTab);
				scrollToElement(navigationTab);
				clickElement(navigationTab);
				scroll("top");
				handleMMSIDProductivityAssessmentPopUp(screenName);
			
				tabName = getText(navigationTab);
				logInfo("Navigated Successfully to Screen : " + tabName.replaceAll("\n", " "));
			} 
			catch (Exception e) 
			{
				logInfo("Navigation failed to Screen : " + tabName.replaceAll("\n", " "));
				e.printStackTrace();
				//throw e;
			}
			// ***** Verifying Navigation *****//*
			loader();
		
	}

	public void Navigate_to_R1Screen(String screenName) throws Exception 
	{
		scroll("top");
		try 
		{
			clickElement(getDriver().findElement(By.xpath(".//div[@id='collapseConfigMenu']//li/a[text()='" + screenName + "']")));
			handleAsyncWait();
			try 
			{
				waitForAttributeToChange(getDriver().findElement(By.xpath(".//div[@id='collapseConfigMenu']//li/a[text()='" + screenName + "']/..")),
						"class", "active");
			} 
			catch (Exception e) 
			{
				By tab_parent = By.xpath(".//div[@id='collapseConfigMenu']//li/a[text()='" + screenName + "']/..");
				waitForAttributeToChange(tab_parent,"class", "active");
			}
			if (getDriver().findElement(By.xpath(".//div[@id='collapseConfigMenu']//li/a[text()='" + screenName + "']/..")).getAttribute("class").equals("active")) 
			{
				logInfo("Successfully Navigated to " + screenName + " Screen");
			}
		} 
		catch (Exception e) 
		{
			boolean flag = false;
			String tabName = "";
			List<WebElement> R1ScreenLinks = global_R1AndR2Screens;
			for (int i = 0; i < R1ScreenLinks.size(); i++) {
				tabName = getText(R1ScreenLinks.get(i)).replace("\n", " ").trim();
				if (tabName.contains(screenName.trim())) 
				{
					flag = true;
					clickElement(R1ScreenLinks.get(i));
					loader();
					R1ScreenLinks = global_R1AndR2ScreensActive;
					waitForElementAttributeContainsString(R1ScreenLinks.get(i), "class", "active");
					if (R1ScreenLinks.get(i).getAttribute("class").contains("active")) 
					{
						logInfo("Successfully Navigated to " + screenName + " Screen");
					}
					break;
				}
				if (flag == false)
					throw e;
				loader();
				//addPaddedWait(1);
			}
		}
	}

	public void expandDropdown(WebElement dropdown) throws Exception {
		scrollToElement(dropdown);
		try
		{
			if (dropdown.getAttribute("aria-expanded").contains("false") || dropdown.getAttribute("aria-expanded") == null || dropdown.getAttribute("class").contains("collapsed")) 
			{
				clickElement(dropdown);
				isDropdown_expanded(dropdown);
			}
		}
		catch (Exception e) 
		{
			WebElement dropdown_parent = dropdown.findElement(By.xpath("./.."));
			if(!dropdown_parent.getAttribute("class").contains("open"))
			{
				clickElement(dropdown);
			}
		}
	}
	
	public void closeExpandDropdown(WebElement dropdown) throws Exception {
		scrollToElement(dropdown);
		if (dropdown.getAttribute("aria-expanded") != null || dropdown.getAttribute("aria-expanded").equals("true")) {
			clickElement(dropdown);
			isDropdown_expanded(dropdown);
		}
	}

	public Boolean isDropdown_expanded(WebElement ele) {
		try {
			waitForAttributeToChange(ele, "aria-expanded", "true");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void Navigate_to_subTab(String screenName) throws Exception 
	{
		loader();
		handleAsyncWait();
		By subTab_By = By.xpath("//a[@id='" + screenName + "']|//li[@id='" + screenName + "']");
		waitForElementToBeVisible(subTab_By);
		WebElement subTab = getDriver().findElement(subTab_By);
		scrollToElement(subTab);
		waitForElementToBeVisible(subTab);
		try
		{
			clickElement(subTab);
		}
		catch (Exception e) 
		{
			if(e.getMessage().contains("loader.svg"))
			{
				//Re-attempt
				loader();
				addSecondaryPaddedWait();
				clickElement(subTab);
			}
		}
		loader();
	}
	
	public void navigateToDashboard(String action) throws Exception {

		if (action.equalsIgnoreCase("from opportunity"))
			clickElement(getDriver().findElement(By.xpath(".//*[@id='OpportunitiesIcon']/a")));
		else
			clickElement(getDriver().findElement(By.xpath(".//*[@id='Dashboad']/img")));
	}

	public void navigate_costingScreens(String tab) throws Exception {
		jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.scrollBy(0,-900)", "");

		if (tab.contains("Solution Cost")) {
			clickElement(CostingNewUI_SolutionCost_tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='solution-cost']//div[@col-id='staffingProfile'][@role='presentation']")));
		}
		if (tab.equalsIgnoreCase("TEI")) {
			clickElement(CostingNewUI_MoTE_tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='transition']//div[@col-id='ag-Grid-AutoColumn'][@role='presentation']")));
		}
		if (tab.contains("Guidance Cost")) {
			clickElement(Costing_GuidenceCosttab);
		//	waitForElementToBeVisible(getDriver().findElement(By.xpath("//div[@col-id='GroupName'][@role='presentation']")));
		}
		if (tab.contains("Infrastructure Charges")) {
			clickElement(GuidanceCosts_InfrastructureChargesScreen);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='gridInfrastructure']//div[@class='ag-header-cell'][@col-id='0']")));
		}
		if (tab.contains("Secured Bay")) {
			clickElement(Costing_SecuredBay_Tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='Securedbay']//div[@class='ag-header-cell'][@col-id='0']")));
		}
		if (tab.contains("Voice Connectivity")) {
			clickElement(Costing_Voiceconnectivity_tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='Voiceconnectivity']//div[@col-id='ProfileNm'][@role='presentation']")));
		}
		if (tab.contains("Data Connectivity")) {
			clickElement(Costing_DataConnectivity_tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='Dataconnectivity']//div[@col-id='ProfileNm'][@role='presentation']")));
		}
		if (tab.contains("Shift")) {
			clickElement(Costing_Shift_Tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='Shift']//div[@class='ag-header-cell'][@col-id='0']")));
		}
		if (tab.contains("On Call")) {
			clickElement(Costing_Oncall_Tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='oncall']//div[@class='ag-header-cell'][@col-id='0']")));
		}
		if (tab.contains("Overtime")) {
			clickElement(Costing_OvertimeLink);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='divOvertime']//div[@class='ag-header-cell'][@col-id='0']")));
		}
		if (tab.contains("DNP")) {
			clickElement(Costing_CostItemDNPLink);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='divDnp']//div[@class='ag-header-cell'][@col-id='0']")));
		}
		if (tab.contains("Location Premium")) {
			clickElement(CostingNewUI_LP_tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='LocationPremium']//div[@col-id='ProfileNm'][@role='presentation']")));
		}
		if (tab.contains("Other Cost")) {
			clickElement(Costing_OtherCost_tab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='OtherCostgridid']//div[@class='ag-header-cell'][@col-id='0']")));
		}
		loader();
	}

	public void navigate_to_RampUpNewUI() throws Exception {
		jse.executeScript("window.scrollBy(0,-900)", "");
		try {
			clickElement(RampUp_navigation);
		} catch (Exception e) {
			// TODO: handle exception
			clickElement(RampUp_navigation);
		}
		loader();
		addPaddedWait(1);
		waitForElementToBeVisible(getDriver().findElement(
				By.xpath(".//*[contains(@id , 'RampupForm')]//div[@col-id='Profile Name'][@role='presentation']")));
		Thread.sleep(1000);
	}

	public void handleConfidentialInformationPopup() throws Exception {
		try 
		{
			loader();
			addPaddedWait(5);
			waitForElementToAppear(getByLocator(dashboardPage_button_IUnderstand));
			waitForElementToBeVisible(dashboardPage_button_IUnderstand);
			clickElement(dashboardPage_button_IUnderstand);
			try
			{
				waitForElementToBeVisible(getByLocator(dashboardPage_button_continue));
				waitForElementClickable(dashboardPage_button_continue);
				clickElement(dashboardPage_button_continue);
			}
			catch (Exception e) 
			{
				 logInfo("Role Rationalization Popup is not displayed");
			}
		} 
		catch (Exception e) 
		{
			try 
			{
				clickElement(rampupPage_button_IUnderstandConfidentialPopup);
			}
			catch(Exception e1) 
			{
			 logInfo("Confidential Information Popup is not displayed");
			}
		}
	}

	public void handleResourceNotFoundPopUp() {
		try {
			By popup = By.xpath("//button[@id='NavUnauthorizedpopupIdCancel']");
			waitForElementToAppear(popup);
			waitForElementToBeVisible(popup);
			clickElement(getDriver().findElement(By.xpath("//button[@id='NavUnauthorizedpopupIdCancel']")));
		} catch (Exception e) {
			logInfo("Pop Up not found");
		}
	}


	public void navigateToRampUp_tabs(String tab_name) throws Exception {
		jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.scrollBy(0,-900)", "");
		Thread.sleep(500);
		if (tab_name.equalsIgnoreCase("Transition")) {
			clickElement(Rampup_TransTab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='transitionGrid']//div[@col-id='Profile Name'][@role='presentation']")));
		}
		if (tab_name.equalsIgnoreCase("Service Delivery")) {
			clickElement(DR_SDtab);
//			Thread.sleep(2000);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='serviceDeliveryGrid']//div[@col-id='Profile Name'][@role='presentation']")));
		}

		if (tab_name.equalsIgnoreCase("Summary")) {
			clickElement(DR_Summarytab);
//			wait_for_element(driver.findElement(By.xpath("//*[@id='summaryGrid']//div[@col-id='ag-Grid-AutoColumn'][@role='presentation']")));
		}
		loader();
//		R1pageLoaderCheck();
	}


	public String randomString(String AB) {
		StringBuilder sb = new StringBuilder();
		sb.append(AB);
		int randomPIN = (int) (Math.random() * 9000) + 10000;
		sb.append(randomPIN);
		return sb.toString();
	}

	public void navigate_to_TransitionEstimateInput_MoTE_tab() throws Exception {
		clickElement(Costing_Transition_Estimate_Input_MoTE_tab);
		loader();
		waitForElementToBeVisible(getDriver().findElement(
				By.xpath("//*[@id='transition']//div[@col-id='ag-Grid-AutoColumn'][@role='presentation']")));
	}

	public void handleConfidentialInfoPopUp() throws Exception {
		try {
			loader();
			addPaddedWait(4);
			waitForElementToBeVisible(confidentialAcceptancePopUpHeader.get(1));
			String popUpName = confidentialAcceptancePopUpHeader.get(1).getText();
			if (popUpName.contains("Confidential Information")) {
				clickElement(ok_confidentialPopUp.get(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
			clickElement(ok_confidentialPopUp.get(1));
		}

	}

	
	public void handleBrowserPopUp_accept()
	{
		try
		{
			addPaddedWait(1);
			String msg = getDriver().switchTo().alert().getText();
			getDriver().switchTo().alert().accept();
			System.out.println("Popup Message: "+msg);
			addPaddedWait(1);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handleBrowserPopUp_dismiss()
	{
		try
		{
			addPaddedWait(1);
			getDriver().switchTo().alert().dismiss();
			addPaddedWait(1);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	
	public void handleAlertPopUp(String option) throws Exception
	{
		if(option.contains("save") || option.equalsIgnoreCase("Save and Continue") || option.contains("continue"))
		{
			List<WebElement> element = getDriver().findElements(By.xpath("//em[contains(text(),'Save and Continue')]"));
			if(element.size()>0)
			{
				try 
				{
					clickElement(element.get(0));
				}
				catch (Exception e) 
				{
					logInfo("Alert PopUp not displayed");
				}
			}
			else
			{
				logInfo("Alert PopUp not displayed");
			}
			element.clear();
		}
		else if(option.contains("Discard") || option.equalsIgnoreCase("Discard and continue ") || option.contains("continue") || option.contains("Discard and continue"))
		{
			List<WebElement> element = getDriver().findElements(By.xpath("//em[contains(text(),'Discard and continue ')]"));
			if(element.size()>0)
			{
				try 
				{
					clickElement(element.get(0));
				}
				catch (Exception e) 
				{
					logInfo("Alert PopUp not displayed");
				}
			}
			else
			{
				logInfo("Alert PopUp not displayed");
			}
			element.clear();
		}
		else if(option.contains("Cancel") || option.equalsIgnoreCase("cancel"))
		{
			List<WebElement> element = getDriver().findElements(By.xpath("//div[@id='Navdialog']//em[contains(text(),'Cancel')]"));
			if(element.size()>0)
			{
				try 
				{
					clickElement(element.get(0));
				}
				catch (Exception e) 
				{
					logInfo("Alert PopUp not displayed");
				}
			}
			else
			{
				logInfo("Alert PopUp not displayed");
			}
			element.clear();
		}
	}
	
	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	/**
	 *
	 * Convert User Specified Text to date and return with a specific date format
	 *
	 * @since 14/02/2020
	 * @author Nikhil Singh
	 * @return element
	 *
	 */
	public String changeDateFormat(String dateText, String targetFormat) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat(targetFormat);
		Date date = formatter.parse(dateText);
		return formatter.format(date);
	}
	
	/**
	 *
	 * Return today's date and time with a specific date format
	 *
	 * @since 14/02/2020
	 * @author Nikhil Singh
	 * @return element
	 *
	 */
	public String getCurrentDateTime(String dateFormat) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
	
	
	/**
	 *
	 * Return true if Element is present on WebPage.
	 *
	 * @since 22/02/2020
	 * @author Nikhil Singh
	 * @param WebElement
	 * 
	 */
	public boolean isDisplayed(WebElement element) {
		boolean found = false;
		try {
			if (element.isDisplayed())
				found = true;
		} catch (Exception e) {
			found = false;
		}
		return found;
	}

	/**
	 *
	 * Return true if Elements are present on WebPage.
	 *
	 * @since 22/02/2020
	 * @author Nikhil Singh
	 * @param WebElement
	 * 
	 */
	public boolean isDisplayed(List<WebElement> element) {
		boolean found = false;
		try {
			for (int i = 0; i < element.size(); i++) {
				if (element.get(i).isDisplayed())
					found = true;
			}
		} catch (Exception e) {
			found = false;
		}
		return found;
	}
	
	public void expand_section(WebElement element) throws Exception {
		if (element.getAttribute("class").contains("collapsed")) {
			clickElement(element);
			waitForAttributeToChange(element, "aria-expanded", "true");
		}
		Thread.sleep(500);
	}
	
	public String getPreviousYearDate(String curDate, String userformat) throws java.text.ParseException {
		final SimpleDateFormat format = new SimpleDateFormat(userformat);
		final Date date = format.parse(curDate);
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, -1);
		return format.format(calendar.getTime());
	}
	
	public String getNextDate(String curDate, String userformat) throws java.text.ParseException {
		final SimpleDateFormat format = new SimpleDateFormat(userformat);
		final Date date = format.parse(curDate);
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		return format.format(calendar.getTime());
	}

	public String getPreviousDate(String curDate, String userformat) throws java.text.ParseException {
		final SimpleDateFormat format = new SimpleDateFormat(userformat);
		final Date date = format.parse(curDate);
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		return format.format(calendar.getTime());
	}
	
	

	/**
	 *
	 * Switch to next immediate tab on right side of current focused tab
	 *
	 * @since 07/02/2020
	 * @author s.lokeshwar.rao
	 * @return winHandles
	 * @throws InterruptedException
	 *
	 */
	public Set<String> switchToNewWindow() throws Exception {
		String currentTab = getDriver().getWindowHandle();
		for (int i = 0; i < 25; i++) {
			if (getDriver().getWindowHandles().size() > 1)
				break;
			else
				Thread.sleep(1000);
		}
		Set<String> winHandles = getDriver().getWindowHandles();
		for (String handle : winHandles) {
			if (!currentTab.equals(handle))
				getDriver().switchTo().window(handle);
			addPaddedWait(1);
			loader();
		}
		return winHandles;
	}

	public void handleOperationTimeOutPopUp() 
	{
		try 
		{
			clickElement(global_button_operationTimeOutPopupClose);
		} 
		catch (Exception e) 
		{
			System.out.println("Operation time out Pop Up not found");
		}
	}
	
	/**
	 * Verifies if file exists in user downloads folder with given name, deletes the
	 * file
	 * 
	 * @author s.lokeshwar.rao
	 * @param name
	 * @return true if file exists else return false
	 */
	public boolean dir_doc_verify_del(String name) {
		boolean DownloadedStatus = false;
		File dir = new File(ConstantUtils.DownloadedFiles_FilePath);

		if (!dir.isDirectory())
			throw new IllegalStateException("file directory not found");
		for (File file : dir.listFiles()) {
//			System.out.println(file.getName());
			if (file.getName().startsWith(name)) {
				DownloadedStatus = true;
				file.delete();
			}

		}
		return DownloadedStatus;
	}

	public void handleDoYouWantToSavePopUp(String option) throws Exception {
		if (option.equalsIgnoreCase("Save and Continue") || option.contains("Save"))
			clickElement(SaveAndContinue_PopUpBtn);
		if (option.equalsIgnoreCase("Discard and continue") || option.contains("Discard"))
			clickElement(DiscardContinuwBtn);
		if (option.equalsIgnoreCase("Cancel"))
			clickElement(CancelPopUpBtn);
	}
	
	public void ConfidentialPopUPValidation() throws Exception {
		boolean appears = true;
		int Count = ConfidentialityPopUP_Header.size();

		System.out.println(Count);
		addPaddedWait(1);
		for(int i=0;i<Count;i++) {
			if(ConfidentialityPopUP_Header.get(i).isDisplayed()) {

				clickElement(getDriver().findElement(By.xpath("//div[contains(@class,'overlay-container')]//*[text()='I understand']/parent::button")));
				appears = true;
				break;
			}
			else {
				appears = false;
			}
		}
		if(appears == true) {
			logPass("The Confidential Pop Up appeared as Expected");
		}
		else {
			logFail("The Confidential Pop up did not appear while trying to Import/Export/Download the file");

		}
	}
	
	public int getYearfromMonth(int month) {
		int y = 1;
		if (month <= 12)
			y = 1;
		if (month > 12 && month <= 24)
			y = 2;
		if (month > 24 && month < 36)
			y = 3;
		if (month > 36 && month <= 48)
			y = 4;
		if (month > 48 && month <= 60)
			y = 5;
		return y;
	}
	
	
	public void navigate_to_ShapingParameters_tab() throws Exception 
	{
		clickElement(ShapingParameters_tab);
		jse.executeScript("window.scrollBy(0,-900)", "");

	}
	
	
	public void ripple(String state) throws Exception
	{
		scrollToElement(global_rippleToggleButton);
		if (state.equalsIgnoreCase("on"))
		{
			if (global_rippleToggleButton.getCssValue("background-color")
					.contains("rgba(237, 125, 49, 1)")) 
			{
				clickElement(global_rippleToggleButton);
			}
		} 
		else 
		{
			if (!global_rippleToggleButtonCSS.getCssValue("background-color")
					.contains("rgba(237, 125, 49, 1)")) 
			{
				clickElement(global_rippleToggleButtonCSS);
			}
		}
	}
	
	public void handleMMSIDProductivityAssessmentPopUp(String screenName)
	{
		if(screenName.contains("Estimates") || screenName.equalsIgnoreCase("ESTIMATES"))
		{
			By ok_button = By.xpath("//label[contains(text(),'MMSID is not valid for Productivity Assessment')]/parent::div/following-sibling::div//em[contains(text(),'OK')]/parent::button");
			try
			{
				waitForElementToAppear(ok_button);
				clickElement(estimates_button_assementOk);
			}
			catch (Exception e) 
			{
				// TODO: handle exception
				logInfo("MMSID is not valid for Productivity Assessment - Popup Not Found");
			}
		}
	}
	
	/**
	 * For closing the window
	 *  @since 04/03/2024
	 *  
	 * @author nisha.maheswaran
	 */
	public void close() {
		getDriver().close();
	}
	
	/**
	 * To quit the window
	 * 
	 *  @since 04/03/2024
	 *  
	 * @author nisha.maheswaran
	 */
	public void quit() {
		getDriver().quit();
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'loader')]//img")
	public WebElement loader;
	
	public void closeloader() {
		boolean isLoaderPresent = true;
		int wait = 0;
		while(isLoaderPresent) {
			try {	
				if(loader.getAttribute("title").contains("loader")) {
					isLoaderPresent = true;
					wait++;
				}
					
			}catch(Exception e) {
				logInfo("page Loaded");
				isLoaderPresent = false;
			}
		}
	}
	
	public void checkLoader(WebElement ele) {
		boolean isLoaderPresent = true;
		
		String attributes = (String)jse.executeScript("var items = {}; "
				+ "for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; "
				+ "return items;", ele);
		System.out.println(attributes);

//		while(isLoaderPresent) {
//			if(ele.) {S
//				isLoaderPresent = false;
//			}
//			logInfo(ele.getAttribute("hidden"));
//		}
	}
	
	public void app_loader(WebElement element){
		
		int waitTime = 55;
		long start = System.currentTimeMillis();
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())							
					.withTimeout(Duration.ofSeconds(waitTime)) 			
					.pollingEvery(Duration.ofSeconds(5)) 			
					.ignoring(Exception.class);		
			By byElement =	getByLocator(element);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(byElement));
			long finish = System.currentTimeMillis();
			long totalTime = finish/1000 - start/1000; 
			System.out.println(totalTime);
			
		}catch(Exception e) {
			getDriver().navigate().refresh();
			waitForElementToBeInvisible(element);
		}
		
		
		
	}
	
}
