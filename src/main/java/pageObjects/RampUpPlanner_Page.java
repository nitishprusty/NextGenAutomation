package pageObjects;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusableComponents.ExcelUtilities;
import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;

public class RampUpPlanner_Page extends BasePage {
	Actions action = new Actions(getDriver());

	/************************** LOCATORS *****************************/

	@FindBy(how = How.XPATH, using = "//p[@id='Productivity']")
	public WebElement RampUpPlanner_Tab;

	@FindBy(how = How.ID, using = "li_EffortBaseline")
	public WebElement BaseLine_Subtab;

	@FindBy(how = How.ID, using = "li_Productivity")
	public WebElement Productivity_Subtab;

	@FindBy(how = How.ID, using = "li_TandSD")
	public WebElement T_SD_Split_Subtab;

	@FindBy(how = How.ID, using = "li_OnOffMix")
	public WebElement Review_Shore_Mix_Subtab;

	@FindBy(how = How.ID, using = "li_RampUp")
	public WebElement Review_Rampup_Subtab;

	@FindBy(how = How.ID, using = "li_ExportImportSTATUSRPlanner")
	public WebElement Export_Import_Subtab;

	@FindBy(how = How.XPATH, using = "//p[@id='Productivity']/..")
	public WebElement RampUpPlanner_Div;

	@FindBy(how = How.XPATH, using = "//*[@id = 'SolutionGroupId']")
	public WebElement Group_dropdown;

	@FindBy(how = How.ID, using = "defineRampup")
	public WebElement Rampup_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id = 'ulsolutiongroups']//li//a")
	public List<WebElement> All_Groups_List;

	@FindBy(how = How.XPATH, using = "//select[@id='DropValue']")
	public WebElement Baseline_Select;

	@FindBy(how = How.XPATH, using = "//div[contains(@Title,'Baseline')]")
	public WebElement Baseline_Drpdwn;

	@FindBy(how = How.XPATH, using = "//input[@id='Ripple']/following-sibling::*[@class='switch-label']")
	public WebElement Group_Ripple_Btn;

	@FindBy(how = How.XPATH, using = "//input[@id='ProfileRipple']/following-sibling::*[@class='switch-label']")
	public WebElement Profile_Ripple_Btn;

	@FindBy(how = How.XPATH, using = "//input[@id='TSDRipple']/following-sibling::*[@class='switch-label']")
	public WebElement T_SD_Ripple_Btn;

	@FindBy(how = How.XPATH, using = "//input[@id='FteInput']")
	public WebElement Fte_Input;

	@FindBy(how = How.XPATH, using = "//*[@col-id= 'ProfileNm'][@role='gridcell']")
	public List<WebElement> Profiles_List;

	@FindBy(how = How.XPATH, using = "//div[@id='productivity']//*[@col-id= 'ProfileNm'][@role='gridcell']")
	public List<WebElement> Prod_Profiles_List;

	@FindBy(how = How.XPATH, using = "//div[@id='productivity-sdsplit']//*[@col-id= 'ProfileNm'][@role='gridcell']")
	public List<WebElement> T_SD_Profiles_List;

	@FindBy(how = How.XPATH, using = "//div[@id='productivity-review-rampup']//*[@col-id= 'ProfileNm'][@role='gridcell']")
	public List<WebElement> Review_Rampup_Profiles;

	@FindBy(how = How.XPATH, using = "//div[@id='productivity-mix']//*[@col-id= 'GroupNm'][@role='gridcell'][contains(@title,'Staffed')]")
	public List<WebElement> Shore_List;

	@FindBy(how = How.ID, using = "ProfileSave")
	public WebElement Baseline_Save_Btn;

	@FindBy(how = How.ID, using = "ProductivitysaveBtn")
	public WebElement Productivity_Save_Btn;

	@FindBy(how = How.ID, using = "tandsdsavebtn")
	public WebElement T_SD_Save_Btn;

	@FindBy(how = How.XPATH, using = "//p[@id='effortbased-msg-alert']/span")
	public WebElement Baseline_Save_Msg;

	@FindBy(how = How.XPATH, using = "//p[@id='pct-msg-alert']/span")
	public WebElement Productivity_Save_Msg;

	@FindBy(how = How.XPATH, using = "//p[@id='t-sd-msg-alert']/span")
	public WebElement T_SD_Save_Msg;

	@FindBy(how = How.XPATH, using = "//p[@id='review-rampup-msg-alert']/span")
	public WebElement Rampup_Push_Msg;

	@FindBy(how = How.XPATH, using = "//*[@id = 'GroupPeriodId']")
	public WebElement Year_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@id = 'ulgroupperiod']/li")
	public List<WebElement> Year_List;

	@FindBy(how = How.XPATH, using = "//*[@id='TSDPer']/following-sibling::span[text() = 'PERCENTAGE']")
	public WebElement T_SD_Per_Switch;

	@FindBy(how = How.XPATH, using = "//div[@id='divTandSD']//span[contains(text(),'SD')]")
	public WebElement SD_View_Switch;

	@FindBy(how = How.XPATH, using = "//div[@id='divTandSD']//span[contains(text(),'T')]")
	public WebElement T_View_Switch;

	@FindBy(how = How.ID, using = "push-to-rampup-btn")
	public WebElement Push_To_Rampup_Btn;

	@FindBy(how = How.XPATH, using = "//ag-grid-angular[@id='serviceDeliveryGrid']//*[@col-id='Profile Name'][not(@role='presentation')]")
	public List<WebElement> Rampup_SDProfiles;

	@FindBy(how = How.XPATH, using = "//ag-grid-angular[@id='transitionGrid']//*[@col-id='Profile Name'][not(@role='presentation')]")
	public List<WebElement> Rampup_TransProfiles;

	@FindBy(how = How.XPATH, using = "(//a[@id='exportPlannerID'])[1]")
	public WebElement RPlanner_Export_Btn;

	@FindBy(how = How.XPATH, using = "//div[@id='ExportPop']//em[text()='OK']")
	public WebElement Groups_Profiles_Ok;

	@FindBy(how = How.ID, using = "importPlannerID")
	public WebElement RPlanner_Import_Btn;

	@FindBy(how = How.ID, using = "rbt_G")
	public WebElement Auto_Refresh_Btn;

	@FindBy(how = How.XPATH, using = "//div[@id='autoRefreshPopupIDRplanner']//*[@id='importPyramidAFId']")
	public WebElement Solution_Refresh_Ok;

	@FindBy(how = How.ID, using = "files_Pyramid")
	public WebElement Browse_Input;

	@FindBy(how = How.ID, using = "btnImprtPyramid")
	public WebElement Import_OK_Btn;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='0']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement Export_Success_Msg;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='1']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement Import_Success_Msg;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='1']//*[@col-id='FileNm'][contains(@class,'ag-cell')]/span")
	public WebElement Import_File_Text;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='0']//*[@col-id='FileNm']/span//img")
	public WebElement Download_File_Btn;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='0']//*[@col-id='FileNm']")
	public WebElement Downloaded_Filename;

	@FindBy(how = How.XPATH, using = "//div[@role='document']//em[text()='I understand']")
	public WebElement Confidential_Popup_Btn;

	/******************** METHODS ************************/
	public RampUpPlanner_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	/**
	 * 
	 * TC_51: Validate if the SA is able to navigate to Ramp-Up Planner on click of
	 * Ramp Up planner tab and able to view Baseline,Productivity,T-SD Split,Review
	 * Shore Mix,Review Ramp Up and Export/Import Status tabs.
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void rampUpNavigationValidation() throws Exception {
		boolean scenarioFlag = true;

		clickElement(RampUpPlanner_Tab);
		waitForElementToBeVisible(BaseLine_Subtab);

		if (RampUpPlanner_Div.getAttribute("class").contains("active")) {
			logPass("Succesfully navigated to the RampUpPlanner Tab.");

		} else {
			logFail("Failed to navigate to the RampUpPlanner Tab.");
			scenarioFlag = false;
		}
		// subtab check is done in the method rampUpSubtabsValidation()
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * 
	 * TC_51: Validate if the SA is able to navigate to Ramp-Up Planner on click of
	 * Ramp Up planner tab and able to view Baseline,Productivity,T-SD Split,Review
	 * Shore Mix,Review Ramp Up and Export/Import Status tabs.
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void rampUpSubtabsValidation() throws Exception {
		boolean scenarioFlag = true;
		String baselineStatus = "", productivityStatus = "", t_SD_Status = "", reviewShoreMixStatus = "",
				reviewRampUpStatus = "", exportImportStatus = "";

		waitForElementToBeVisible(BaseLine_Subtab);
		clickElement(BaseLine_Subtab);
		baselineStatus = BaseLine_Subtab.getAttribute("class");

		waitForElementToBeVisible(Productivity_Subtab);
		clickElement(Productivity_Subtab);
		productivityStatus = Productivity_Subtab.getAttribute("class");

		waitForElementToBeVisible(T_SD_Split_Subtab);
		clickElement(T_SD_Split_Subtab);
		t_SD_Status = T_SD_Split_Subtab.getAttribute("class");

		waitForElementToBeVisible(Review_Shore_Mix_Subtab);
		clickElement(Review_Shore_Mix_Subtab);
		reviewShoreMixStatus = Review_Shore_Mix_Subtab.getAttribute("class");

		waitForElementToBeVisible(Review_Rampup_Subtab);
		clickElement(Review_Rampup_Subtab);
		reviewRampUpStatus = Review_Rampup_Subtab.getAttribute("class");

		waitForElementToBeVisible(Export_Import_Subtab);
		clickElement(Export_Import_Subtab);
		exportImportStatus = Export_Import_Subtab.getAttribute("class");

		if (baselineStatus.contains("active") && productivityStatus.contains("active") && t_SD_Status.contains("active")
				&& reviewShoreMixStatus.contains("active") && reviewRampUpStatus.contains("active")
				&& exportImportStatus.contains("active")) {
			logPass("Succesfully navigated to the RampUpPlanner Subtabs.");
		} else {
			logFail("Failed to navigate to the RampUpPlanner Subtabs.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * 
	 * TC_52: Validate if SA is able to enter FTE for profiles in Baseline tab and
	 * save the screen.
	 * 
	 * @since 1/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void configureBaselineTab(String filePath, String sheet, String baseline) throws Exception {
		boolean scenarioFlag = true;
		int totalGroups;
		String successMsg = "", selectedGroup = "";
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_BASELINE);
		totalGroups = All_Groups_List.size();

		// Group baseline
		String grpColNo = SetExcelPath(filePath, sheet, 1, 1);
		float grpColNofloat = Float.valueOf(grpColNo);
		int monthStartGrp = (int) grpColNofloat;
		String grpEndNo = SetExcelPath(filePath, sheet, 1, 2);
		float grpEndNofloat = Float.valueOf(grpEndNo);
		int monthEndGrp = (int) grpEndNofloat;

		// profile baseline
		String prfleColNo = SetExcelPath(filePath, sheet, 5, 1);
		float prfColNofloat = Float.valueOf(prfleColNo);
		int monthStartPrfle = (int) prfColNofloat;
		String prfEndNo = SetExcelPath(filePath, sheet, 5, 2);
		float prfEndNofloat = Float.valueOf(prfEndNo);
		int monthEndPrfle = (int) prfEndNofloat;

		//for (int i = 0; i < totalGroups; i++) {
		for (int i = 0; i < 1; i++) {
			clickElement(Group_dropdown);
			if (Group_dropdown.getAttribute("aria-expanded").equalsIgnoreCase("false"))
				clickElement(Group_dropdown);
			clickElement(All_Groups_List.get(i));

			selectedGroup = Group_dropdown.getAttribute("title");
			logInfo("selecting group: " + selectedGroup + " index " + i);
			// selecting baseline from dropdown
			//selectRampUpPlannerBaseline(baseline);

			// Fill group baseline FTE
			for (int k = monthStartGrp; k <= monthEndGrp; k++) {
				String FTEValue = SetExcelPath(filePath, sheet, 3, k - 1);
				logInfo("Group FTEValue : " + FTEValue + " for month M" + k);
				if (k == 1) { // ripple off for 1st month
					rippleToggle("Off", "Group");
				}
				if (k == monthEndGrp) {// ripple on for last month
					rippleToggle("On", "Group");
				}

				clickElement(getDriver().findElement(By.xpath(
						"//*[@id = 'productivity-effort']//div[@row-id = '0']/div[@col-id = 'M" + k + "']//input")));
				if (k == monthEndGrp) {
					clickElement(getDriver().findElement(
							By.xpath("//*[@id = 'productivity-effort']//div[@row-id = '0']/div[@col-id = 'M" + k
									+ "']//input")));
				}

				clear(Fte_Input);
				sendKeys(Fte_Input, FTEValue);
				if (k == monthEndGrp) {
					action.sendKeys(Keys.ARROW_RIGHT).perform();// to ripple
				}
			}

			// Filling profile baseline fte
			jse.executeScript("arguments[0].scrollIntoView(true);", Profiles_List.get(0));
			for (int j = 0; j < Profiles_List.size(); j++) {
				for (int k = monthStartPrfle; k <= monthEndPrfle; k++) {
					String FTEValue = SetExcelPath(filePath, sheet, 7, k - 1);
					logInfo("Profile FTEValue : " + FTEValue + " for month M" + k);
					if (k == 1) { // ripple off for 1st month
						rippleToggle("Off", "Profile");
					}
					if (k == monthEndPrfle) {// ripple on for last month
						rippleToggle("On", "Profile");
					}
					clickElement(getDriver().findElement(By.xpath("//*[@id = 'productivity-effort']//div[@row-id = '"
							+ j + "']/div[@col-id = 'M" + k + "P']/span/input")));
					clickElement(getDriver().findElement(By.xpath("//*[@id = 'productivity-effort']//div[@row-id = '"
							+ j + "']/div[@col-id = 'M" + k + "P']")));

					clear(Fte_Input);
					sendKeys(Fte_Input, FTEValue);
					if (k == monthEndPrfle) {
						action.sendKeys(Keys.ARROW_RIGHT).perform(); // to ripple
					}
				}
			}

			clickElement(Baseline_Save_Btn);
			try {
				waitForElementToBeVisible(Baseline_Save_Msg);
				successMsg = getText(Baseline_Save_Msg);
				if (successMsg.trim().equalsIgnoreCase("Data Saved Successfully")) {
					logPass("Baseline FTE's added successfully for the profiles in " + selectedGroup);
				} else {
					logFail("Baseline FTE's not added successfully for the profiles in " + selectedGroup);
					scenarioFlag = false;
				}
			} catch (Exception e) {
				logFail("Baseline FTE's not added successfully for the profiles in " + selectedGroup);
				scenarioFlag = false;
			}
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * 
	 * Method to select Baseline value in Baseline subtab
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void selectRampUpPlannerBaseline(String baselineChoice) throws Exception {
		waitForElementToBeVisible(Baseline_Drpdwn);
		clickElement(Baseline_Drpdwn);
		Select baselineSelect = new Select(Baseline_Select);
		if (baselineChoice.contains("Client")) {
			baselineSelect.selectByValue("Client Baseline");
		} else {
			baselineSelect.selectByValue("Accenture Baseline");
		}
	}

	/**
	 * 
	 * Method to toggle Rampup Planner group/profile baseline ripple
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void rippleToggle(String choice, String type) throws Exception {
		WebElement rippleBtn;
		if (type.equalsIgnoreCase("Group")) {
			rippleBtn = Group_Ripple_Btn;
		} else if (type.equalsIgnoreCase("T_SD")) {
			rippleBtn = T_SD_Ripple_Btn;
		} else {
			rippleBtn = Profile_Ripple_Btn;
		}
		// logInfo(rippleBtn.getCssValue("background-color"));
		String rippleBgColor = rippleBtn.getCssValue("background-color");

		if (choice.equalsIgnoreCase("On")) {
			if (!(rippleBgColor.contains("rgba(255, 255, 255, 1)"))) {
				clickElement(rippleBtn);
			}
		} else {
			if (rippleBgColor.contains("rgba(255, 255, 255, 1)")) {
				clickElement(rippleBtn);
			}
		}

	}

	/**
	 * 
	 * TC_53: Validate if SA is able enter Monthwise Productivity and save the
	 * screen.
	 * 
	 * @since 5/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void configureProductivityTab(String filePath, String sheet) throws Exception {
		boolean scenarioFlag = true;

		int totalGroups, monthSelected;
		String inputFteValue = "", FTEValue = "", successMsg = "", selectedGroup = "";

		totalGroups = All_Groups_List.size();

		// Group baseline
		String ColNo = SetExcelPath(filePath, sheet, 1, 1);
		float ColNofloat = Float.valueOf(ColNo);
		int monthStart = (int) ColNofloat;
		String EndNo = SetExcelPath(filePath, sheet, 1, 2);
		float EndNofloat = Float.valueOf(EndNo);
		int monthEnd = (int) EndNofloat; // for required months, fte value taken from excel
		inputFteValue = "0"; // For remaining months data set here

		//for (int i = 0; i < totalGroups; i++) {
		for (int i = 0; i < 1; i++) {
			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_BASELINE);
			waitForElementToBeVisible(Group_dropdown);
			clickElement(Group_dropdown);
			if (Group_dropdown.getAttribute("aria-expanded").equalsIgnoreCase("false"))
				clickElement(Group_dropdown);
			waitForElementToBeVisible(All_Groups_List.get(i));
			clickElement(All_Groups_List.get(i));

			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_PRODUCTIVITY);
			selectedGroup = Group_dropdown.getAttribute("title");
			logInfo("selecting group: " + selectedGroup + " index " + i);

			waitForElementToBeVisible(Prod_Profiles_List);

			// Filling productivity for each profile
			for (int j = 0; j < Prod_Profiles_List.size(); j++) {
				// year loop
				for (int y = 0; y < Year_List.size(); y++) {
					expandDropdown(Year_Drpdwn);
					clickElement(Year_List.get(y));

					List<WebElement> monthList = getDriver()
							.findElements(By.xpath("//*[@id = 'productivity']//*[@row-id = '" + j
									+ "']/div[contains(@col-id , 'M')]/span/input"));
					clickElement(monthList.get(0));

					// month loop
					for (int k = monthStart - 1; k < monthList.size(); k++) {
						List<WebElement> monthCount = getDriver().findElements(By.xpath(
								"//*[@id = 'productivity']//*[@row-id = '" + j + "']/div[contains(@col-id , 'M')]"));
						monthSelected = Integer.parseInt(monthCount.get(k).getAttribute("col-id").split("M")[1]);
						if (monthSelected <= monthEnd) {
							FTEValue = SetExcelPath(filePath, sheet, 3, k);
							/** Uncomment if rest of fte's are required to be filled **/
//						} else {
//							FTEValue = inputFteValue;
//						}

							logInfo("FTEValue : " + FTEValue + " for month M" + monthSelected + " for Profile " + j);
							clear(Fte_Input);
							sendKeys(Fte_Input, FTEValue);
							action.sendKeys(Keys.ARROW_RIGHT).perform();
							action.sendKeys(Keys.ENTER).perform();
						}
					}

				}

			}

			clickElement(Productivity_Save_Btn);
			try {
				waitForElementToBeVisible(Productivity_Save_Msg);
				successMsg = getText(Productivity_Save_Msg);
				if (successMsg.trim().equalsIgnoreCase("Data Saved Successfully")) {
					logPass("Productivity FTE's added successfully for the profiles in " + selectedGroup);
				} else {
					logFail("Productivity FTE's not added successfully for the profiles in " + selectedGroup);
					scenarioFlag = false;
				}
			} catch (Exception e) {
				logFail("Productivity FTE's not added successfully for the profiles in " + selectedGroup);
				scenarioFlag = false;
			}
		}
		expandDropdown(Year_Drpdwn);
		clickElement(Year_List.get(0));
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * 
	 * TC_54: Validate if the SA is able to save T-SD Split and save the screen.
	 * 
	 * @since 6/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void configureTSDSplitTab(String filePath, String sheet) throws Exception {
		boolean scenarioFlag = true;

		int totalGroups;
		String FTEValueSD = "", FTEValueT = "", successMsg = "", selectedGroup = "";

		// Number of months to be filled
		String ColNo = SetExcelPath(filePath, sheet, 1, 1);
		float ColNofloat = Float.valueOf(ColNo);
		int monthStart = (int) ColNofloat;
		String EndNo = SetExcelPath(filePath, sheet, 1, 2);
		float EndNofloat = Float.valueOf(EndNo);
		int monthEnd = (int) EndNofloat;

		totalGroups = All_Groups_List.size();
		// group loop
		//for (int i = 0; i < totalGroups; i++) {
		for (int i = 0; i < 1; i++) {
			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_BASELINE);
			waitForElementToBeVisible(Group_dropdown);
			clickElement(Group_dropdown);
			if (Group_dropdown.getAttribute("aria-expanded").equalsIgnoreCase("false"))
				clickElement(Group_dropdown);
			waitForElementToBeVisible(All_Groups_List.get(i));
			clickElement(All_Groups_List.get(i));

			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_TSD_SPLIT);
			selectedGroup = Group_dropdown.getAttribute("title");
			logInfo("selecting group: " + selectedGroup + " index " + i);

			waitForElementToBeVisible(T_SD_Profiles_List);

			// profile loop
			for (int j = 0; j < T_SD_Profiles_List.size(); j++) {
				// month loop
				for (int k = monthStart; k <= monthEnd; k++) {
					FTEValueT = SetExcelPath(filePath, sheet, 3, k); // T percentage value
					FTEValueSD = SetExcelPath(filePath, sheet, 4, k); // SD percentage value
					logInfo("Profile FTEValueSD : " + FTEValueSD + " FTEValueT: " + FTEValueT + " for month M" + k);
					if (k == 1) { // ripple off for 1st month
						rippleToggle("Off", "T_SD");
					}
					if (k == monthEnd) {// ripple on for last month
						rippleToggle("On", "T_SD");
					}
					// filling sd
					clickElement(getDriver().findElement(By.xpath("//*[@id = 'productivity-sdsplit']//div[@row-id = '"
							+ j + "']/div[@col-id = 'M" + k + "SD']")));
					clickElement(getDriver().findElement(By.xpath("//*[@id = 'productivity-sdsplit']//div[@row-id = '"
							+ j + "']/div[@col-id = 'M" + k + "SD']")));
					clear(Fte_Input);
					sendKeys(Fte_Input, FTEValueSD);

					// filling T
					clickElement(getDriver().findElement(By.xpath("//*[@id = 'productivity-sdsplit']//div[@row-id = '"
							+ j + "']/div[@col-id = 'M" + k + "T']")));
					clickElement(getDriver().findElement(By.xpath("//*[@id = 'productivity-sdsplit']//div[@row-id = '"
							+ j + "']/div[@col-id = 'M" + k + "T']")));
					clear(Fte_Input);
					sendKeys(Fte_Input, FTEValueT);
					if (k == monthEnd) {
						action.sendKeys(Keys.ARROW_RIGHT).perform(); // to ripple T
					}
				}
			}

			clickElement(T_SD_Save_Btn);
			try {
				waitForElementToBeVisible(T_SD_Save_Msg);
				successMsg = getText(T_SD_Save_Msg);
				if (successMsg.trim().equalsIgnoreCase("Data Saved Successfully")) {
					logPass("T_SD tab FTE's added successfully for the profiles in " + selectedGroup);
				} else {
					logFail("T_SD tab FTE's not added successfully for the profiles in " + selectedGroup);
					scenarioFlag = false;
				}
			} catch (Exception e) {
				logFail("T_SD tab FTE's not added successfully for the profiles in " + selectedGroup);
				scenarioFlag = false;
			}

		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * 
	 * TC_56: Validate if the SA is able review 'Review Ramp-UP' screen.[Profile
	 * wise split] TC_58: Validate if SA is able to Push the data to Ramp Up on
	 * click on 'Push To Ramp-Up' button.
	 * 
	 * @since 7/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void reviewRampUpValidation() throws Exception {
		boolean scenarioFlag = true, pushMsgFlag = true, rampupFlag = true;
		List<WebElement> monthListSD, monthListT;
		int totalGroups;
		String selectedGroup = "", selectedProfile = "", successMsg = "";
		// T_SD split values
		ArrayList<String> savedValuesT = new ArrayList<String>(Arrays.asList("2.88", "2.76", "2.65", "6.72", "6.72"));
		ArrayList<String> savedValuesSD = new ArrayList<String>(Arrays.asList("2.88", "2.76", "2.65", "0", "0"));

		totalGroups = All_Groups_List.size();
		// group loop
		//for (int i = 0; i < totalGroups; i++) {
			for (int i = 0; i < 1; i++) {
			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_BASELINE);
			waitForElementToBeVisible(Group_dropdown);
			clickElement(Group_dropdown);
			if (Group_dropdown.getAttribute("aria-expanded").equalsIgnoreCase("false"))
				clickElement(Group_dropdown);
			waitForElementToBeVisible(All_Groups_List.get(i));
			clickElement(All_Groups_List.get(i));

			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_REVIEW_RAMPUP);
			selectedGroup = Group_dropdown.getAttribute("title");
			logInfo("selecting group: " + selectedGroup + " index " + i);

			waitForElementToBeVisible(Review_Rampup_Profiles);

			// profile loop
			for (int j = 0; j < Review_Rampup_Profiles.size(); j++) {
				selectedProfile = Review_Rampup_Profiles.get(j).getAttribute("title");
				ArrayList<String> uiValuesT = new ArrayList<String>();
				ArrayList<String> uiValuesSD = new ArrayList<String>();

				clickElement(T_View_Switch);// Transition view
				monthListT = getDriver().findElements(By.xpath("//*[@id = 'productivity-review-rampup']//*[@row-id = '"
						+ j + "']/div[contains(@col-id , 'M')]/span/span"));

				// Transition month loop
				for (int k = 0; k < 5; k++) {
					String rampupvalue = getText(monthListT.get(k));
					uiValuesT.add(rampupvalue);
				}

				clickElement(SD_View_Switch);
				monthListSD = getDriver().findElements(By.xpath("//*[@id = 'productivity-review-rampup']//*[@row-id = '"
						+ j + "']/div[contains(@col-id , 'M')]/span/span"));
				// SD month loop
				for (int k = 0; k < 5; k++) {
					String rampupvalue = getText(monthListSD.get(k));
					uiValuesSD.add(rampupvalue);
				}
				logInfo("uiValuesT:" + uiValuesT + " uiValuesSD: " + uiValuesSD);
				if (uiValuesT.equals(savedValuesT) && uiValuesSD.equals(savedValuesSD)) {
					logPass("User is able to view the month wise FTE split for profile: " + selectedProfile + " in "
							+ selectedGroup);
				} else {
					logFail("User is not able to view the month wise FTE split for profile: " + selectedProfile + " in "
							+ selectedGroup);
					scenarioFlag = false;
				}

			}

			// Pushing data to Rampup tab
			waitForElementToBeVisible(Push_To_Rampup_Btn);
			clickElement(Push_To_Rampup_Btn);
			try {
				waitForElementToBeVisible(Rampup_Push_Msg);
				successMsg = getText(Rampup_Push_Msg);
				if (successMsg.trim().equalsIgnoreCase("All FTE's for selected group pushed to Ramp up Successfully"))
					logPass("Ramp Up push success message shown for " + selectedGroup);
				else {
					logFail("Ramp Up push success message not shown for " + selectedGroup);
					pushMsgFlag = false;
				}
			} catch (Exception e) {
				logFail("Ramp Up push success message not shown for " + selectedGroup);
				pushMsgFlag = false;
			}

		}

		// Checking if data is pushed to Rampup screen
		rampupFlag = rampUpCheck(All_Groups_List);

		if (scenarioFlag == true && pushMsgFlag == true && rampupFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * 
	 * Method to check RampupTab data
	 * 
	 * @since 7/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * @return
	 * 
	 */
	public boolean rampUpCheck(List<WebElement> allGroupsList) throws Exception {

		clickElement(Rampup_Tab);
		waitForElementToAppear(Group_dropdown);
		waitForElementToBeVisible(Group_dropdown);
		waitForElementClickable(Group_dropdown);

		ArrayList<String> plannerValuesT = new ArrayList<String>(Arrays.asList("2.88", "2.76", "2.65", "6.72", "6.72"));
		ArrayList<String> plannerValuesSD = new ArrayList<String>(
				Arrays.asList("2.88", "2.76", "2.65", "0.00", "0.00"));

		boolean scenarioFlag = true;
		int totalGroups;
		String selectedGroup = "", rampupvalue = "", selectedProfile = "";

		// Checking if data is flowing for SD Tab
		totalGroups = allGroupsList.size();
		//for (int i = 0; i < totalGroups; i++) {
		for (int i = 0; i < 1; i++) {
			waitForElementToBeVisible(Group_dropdown);
			clickElement(Group_dropdown);
			if (Group_dropdown.getAttribute("aria-expanded").equalsIgnoreCase("false"))
				clickElement(Group_dropdown);
			waitForElementToAppear(allGroupsList.get(i));
			clickElement(allGroupsList.get(i));

			selectedGroup = Group_dropdown.getAttribute("title");
			logInfo("selecting group: " + selectedGroup + " index " + i);
			loader();
			waitForElementToAppear(Rampup_SDProfiles.get(0));
			waitForElementToBeVisible(Rampup_SDProfiles.get(0));

			// profile loop
			for (int j = 0; j < Rampup_SDProfiles.size(); j++) {
				selectedProfile = Rampup_SDProfiles.get(j).getAttribute("title");
				ArrayList<String> uiRampupSD = new ArrayList<String>();

				for (int k = 1; k <= 5; k++) {
					rampupvalue = (getDriver().findElement(By.xpath(
							"//*[@id='serviceDeliveryGrid']//div[contains(@class,'ag-body-container')]/div[@role='row'][@row-id='"
									+ j + "']/div[contains(@col-id,'M" + k + "<')]//input"))).getAttribute("value");
					uiRampupSD.add(rampupvalue);
				}

				logInfo("uiRampupSD: " + uiRampupSD);
				if (uiRampupSD.equals(plannerValuesSD)) {
					logPass("For SD, Month wise FTE is successfully pushed to Rampup for profile: " + selectedProfile
							+ " in " + selectedGroup);
				} else {
					logFail("For SD, Month wise FTE is Not pushed to Rampup for profile: " + selectedProfile + " in "
							+ selectedGroup);
					scenarioFlag = false;
				}
			}
		}

		// Checking if data is flowing for T Tab
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_TRANSITION);
		for (int i = 0; i < 1; i++) {
		//for (int i = 0; i < totalGroups; i++) {
			waitForElementToBeVisible(Group_dropdown);
			clickElement(Group_dropdown);
			if (Group_dropdown.getAttribute("aria-expanded").equalsIgnoreCase("false"))
				clickElement(Group_dropdown);
			waitForElementToBeVisible(allGroupsList.get(i));
			clickElement(allGroupsList.get(i));

			selectedGroup = Group_dropdown.getAttribute("title");
			logInfo("selecting group: " + selectedGroup + " index " + i);
			loader();
			waitForElementToAppear(Rampup_TransProfiles.get(0));
			waitForElementToBeVisible(Rampup_TransProfiles.get(0));

			// profile loop
			for (int j = 0; j < Rampup_TransProfiles.size(); j++) {
				selectedProfile = Rampup_TransProfiles.get(j).getAttribute("title");
				ArrayList<String> uiRampupT = new ArrayList<String>();

				for (int k = 1; k <= 5; k++) {
					rampupvalue = (getDriver().findElement(By.xpath(
							"//*[@id='transitionGrid']//div[contains(@class,'ag-body-container')]/div[@role='row'][@row-id='"
									+ j + "']/div[contains(@col-id,'M" + k + "<')]//input"))).getAttribute("value");
					uiRampupT.add(rampupvalue);
				}

				logInfo("uiRampupT: " + uiRampupT);
				if (uiRampupT.equals(plannerValuesT)) {
					logPass("For T, Month wise FTE is successfully pushed to Rampup for profile: " + selectedProfile
							+ " in " + selectedGroup);
				} else {
					logFail("For T, Month wise FTE is Not pushed to Rampup for profile: " + selectedProfile + " in "
							+ selectedGroup);
					scenarioFlag = false;
				}
			}
		}

		return scenarioFlag;
	}

	/**
	 * 
	 * TC_57: Validate if SA is able to Export /Import Ramup Up Planner report and
	 * able to view the status in Export/Import Status Tab
	 * 
	 * @since 8/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void exportImportValidation() throws Exception {
		boolean scenarioFlag = true, baselineExportFlag = true, baselineImportFlag = true, prodExportFlag = true,
				prodImportFlag = true, splitExportFlag = true, splitImportFlag = true, shoreExportFlag = true,
				shoreImportFlag = true, rampupExportFlag = true, rampupImportFlag = true;
		List<Object> returnedValues;
		String exportedFile = "";
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		clickElement(RampUpPlanner_Tab);
		waitForElementToAppear(BaseLine_Subtab);
		/*** For baseline tab */
		// export
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_BASELINE);
		returnedValues = exportedStatusCheck("Baseline", wait);
		baselineExportFlag = (boolean) returnedValues.get(0);
		exportedFile = (String) returnedValues.get(1);
		// import
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_BASELINE);
		baselineImportFlag = importStatusCheck("Baseline", exportedFile, wait);

		/*** For Productivity tab */
		// export
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_PRODUCTIVITY);
		returnedValues = exportedStatusCheck("Productivity", wait);
		prodExportFlag = (boolean) returnedValues.get(0);
		exportedFile = (String) returnedValues.get(1);
		// import
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_PRODUCTIVITY);
		prodImportFlag = importStatusCheck("Productivity", exportedFile, wait);

		/*** For T-Sd split tab */
		// export
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_TSD_SPLIT);
		returnedValues = exportedStatusCheck("T-SD-Split", wait);
		splitExportFlag = (boolean) returnedValues.get(0);
		exportedFile = (String) returnedValues.get(1);
		// import
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_TSD_SPLIT);
		splitImportFlag = importStatusCheck("T-SD-Split", exportedFile, wait);

		/*** For Review shore mix tab */
		// export
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_SHORE_MIX);
		returnedValues = exportedStatusCheck("Review Shore Mix", wait);
		shoreExportFlag = (boolean) returnedValues.get(0);
		exportedFile = (String) returnedValues.get(1);
		// import
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_SHORE_MIX);
		shoreImportFlag = importStatusCheck("Review Shore Mix", exportedFile, wait);

		/*** For Review Rampup tab */
		// export
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_REVIEW_RAMPUP);
		returnedValues = exportedStatusCheck("Review RAmpup", wait);
		rampupExportFlag = (boolean) returnedValues.get(0);
		exportedFile = (String) returnedValues.get(1);
		// import
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_PLANNER_REVIEW_RAMPUP);
		rampupImportFlag = importStatusCheck("Review Rampup", exportedFile, wait);

		if (baselineImportFlag == true && baselineExportFlag == true && prodExportFlag == true && prodImportFlag == true
				&& splitExportFlag == true && splitImportFlag == true && shoreExportFlag == true
				&& shoreImportFlag == true && rampupExportFlag == true && rampupImportFlag == true) {
			logPass("Successfully Exported/Imported Ramup Up Planner report and able to view the status in Export/Import Status Tab.");
		} else {
			logFail("Failed to Export/Import Ramup Up Planner report and unable to view the status in Export/Import Status Tab.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	public List<Object> exportedStatusCheck(String subTab, WebDriverWait wait) throws Exception {
		boolean scenarioFlag = true;
		String DownloadedStatus = "false";

		waitForElementToAppear(RPlanner_Export_Btn);
		clickElement(RPlanner_Export_Btn);
		clickElement(Groups_Profiles_Ok);

		try {
			wait.until(ExpectedConditions.textToBePresentInElement(Export_Success_Msg, "Completed"));
			logPass("The " + subTab + " Export status has successfully changed to Completed.");
		} catch (Exception e) {
			logFail("The " + subTab + " Export status has not changed to Completed.");
			scenarioFlag = false;
		}
		waitForElementToBeVisible(Download_File_Btn);
		clickElement(Download_File_Btn);

		try {
			//addPaddedWait(3);
			waitForElementToBeVisible(Confidential_Popup_Btn);
			clickElement(Confidential_Popup_Btn);
		} catch (Exception e) {
			logInfo("Confidential popup click failed.");
		}

		String fileName = (Downloaded_Filename.getAttribute("title"));
		logInfo("Exported Filename:" + fileName);

//		addPaddedWait(5); // wait required for file to be downloaded.
//		addPaddedWait(5);
//		addPaddedWait(5);
//		File downloadPath = new File(ConstantUtils.DownloadedFiles_FilePath);
//		if (!downloadPath.isDirectory())
//			throw new IllegalStateException("Filenotfound");
//		for (File downloadedFiles : downloadPath.listFiles()) {
//			logInfo("FileName: " + downloadedFiles.getName());
//			if (downloadedFiles.getName().equals(fileName)) {
//				DownloadedStatus = "true";
//				break;
//			}
//		}
//		if (DownloadedStatus.equalsIgnoreCase("true"))
//			logPass("Exported " + subTab + " file is downloaded successfully in the Downloads folder");
//		else {
//			logFail("Exported " + subTab + " file is not downloaded successfully in the Downloads folder");
//			scenarioFlag = false;
//		}

		return Arrays.asList(scenarioFlag, fileName);

	}

	public boolean importStatusCheck(String subTab, String fileToImport, WebDriverWait wait) throws Exception {
		boolean scenarioFlag = true;
		String importFilePath = ConstantUtils.DownloadedFiles_FilePath + fileToImport;
		waitForElementToBeVisible(RPlanner_Import_Btn);
		clickElement(RPlanner_Import_Btn);
		try {
			clickElement(Auto_Refresh_Btn);
			clickElement(Solution_Refresh_Ok);
		} catch (Exception e1) {
			logInfo("Refresh popup absent.");
		}
		sendKeys(Browse_Input, importFilePath);
		clickElement(Import_OK_Btn);
		try {

			wait.until(
					ExpectedConditions.textToBePresentInElement(Import_File_Text, fileToImport.replace(".xlsx", "")));
			
			wait.until(ExpectedConditions.textToBePresentInElement(Import_Success_Msg, "Completed"));
			logPass("The " + subTab + " Import status has successfully changed to Completed.");
		} catch (Exception e) {
			logFail("The " + subTab + " Import status has not changed to Completed.");
			scenarioFlag = false;
		}
		return scenarioFlag;
	}
}