package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;

public class RampUp_Page extends BasePage {

	private static MissingCellPolicy xRow;
	public Actions action = new Actions(getDriver());

	/************************** LOCATORS *****************************/

	@FindBy(how = How.XPATH, using = "//*[@id='defineRampup']/a")
	public WebElement rampUpScreen;

	@FindBy(how = How.XPATH, using = "//ul[@role='tablist']//li/a[@id='trananchor']")
	public WebElement trasitionTab;

	@FindBy(how = How.XPATH, using = "//ul[@role='tablist']//li/a[@id='servicedelanchor']")
	public WebElement service_DeliveryTab;

	@FindBy(how = How.XPATH, using = "//ul[@role='tablist']//li/a[@id='summaryanchor']")
	public WebElement summaryTab;

	@FindBy(how = How.XPATH, using = "//ul[@role='tablist']//li[@id='li_ExptImp']/a[@id='ExportImportanchor']")
	public WebElement rampUpExportImportTab;

	@FindBy(how = How.XPATH, using = "//ul[@role='tablist']//li[@id='li_ExptImp']/a[@id='ExportImportanchor' and @aria-expanded='true']")
	public WebElement rampUpExportImportTab_true;

	@FindBy(how = How.XPATH, using = "//li[@id='exportRampupID']/a[1]/img")
	public WebElement ExportRampUpBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='ExportPop']//button//em[text()='OK']")
	public WebElement ExportRampUp_popup_Ok;

	@FindBy(how = How.XPATH, using = "//div[@row-id='0']//*[@col-id='expimpstatusdesc']/span/span")
	public WebElement ExportRampUp_status;

	@FindBy(how = How.XPATH, using = "//div[@row-id='0']//*[@col-id='FileNm']//span")
	public WebElement ExportedFileName;

	@FindBy(how = How.XPATH, using = "//div[@row-id='0']//*[@col-id='FileNm']//a")
	public WebElement DownloadExportedRampUp;

	@FindBy(how = How.XPATH, using = "//div[@role='document']//em[text()='I understand']")
	public WebElement ConfidentialPopUp_IUnderstandBtn;

	@FindBy(how = How.XPATH, using = "//li[@id='importRampupID']/a/img")
	public WebElement ImportRampUpBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='divImportRampUp']/input")
	public WebElement ImportRampUp_Browse;

	@FindBy(how = How.XPATH, using = "//div//*[@id='btnImprtRampUP']")
	public WebElement ImportRampUp_OKBtn;

	@FindBy(how = How.XPATH, using = "//div[@id='ImportOverwriteConfirmPopupID']//em[text()='OK']//parent::button")
	public WebElement ImportRampUpOverRide_OKBtn;

	@FindBy(how = How.XPATH, using = "//div[@row-id='1']//*[@col-id='expimpstatusdesc']/span/span")
	public WebElement ImportRampUp_status;

	@FindBy(how = How.XPATH, using = "//button[@id='SolutionGroupId']")
	public WebElement groupButton;

	@FindBy(how = How.XPATH, using = "//ul[@id='ulsolutiongroups']/li/a")
	public List<WebElement> group_dropDn;

	@FindBy(how = How.XPATH, using = "//*[@id='transitionGrid']//div[@ref='eBodyContainer']//div[@col-id='Profile Name']")
	public List<WebElement> ListOfProfiles;
	
	@FindBy(how = How.XPATH, using = "//*[@id='transitionGrid']//div[contains(@class,'ag-body-container')]/div[@role='row'][@row-index='0']/div[contains(@col-id,'M1<')]/span/input")
	public WebElement Month_Value;	

	@FindBy(how = How.XPATH, using = "//div[@id='autoRefreshPopupID']//h4[@id='NavdialogLabel']/b[text()='Solution Refresh']")
	public WebElement solutionRefreshPop;

	@FindBy(how = How.XPATH, using = "//div[@id='autoRefreshPopupID']//input[@id='rbt_A']")
	public WebElement autoRefreshBtn;

	@FindBy(how = How.XPATH, using = "//button[@id='importRampupAFId']/em")
	public WebElement solutionRefresOk;
	
	@FindBy(how = How.XPATH, using = "//div[@id='autoRefreshPopupID1']//h4[@id='NavdialogLabel']/b[text()='Solution Refresh']")
	public WebElement solutionRefreshPopT;

	@FindBy(how = How.XPATH, using = "//div[@id='autoRefreshPopupID1']//input[@id='rbt_C']")
	public WebElement autoRefreshBtnT;

	@FindBy(how = How.XPATH, using = "//*[@id='autoRefreshPopupID1']//em[text()='OK']")
	public WebElement solutionRefresOkT;

	@FindBy(how = How.XPATH, using = "//*[@id='ulsolutiongroups']//li")
	public List<WebElement> Group_Drpdwn_List;

	@FindBy(how = How.XPATH, using = "//*[@id='SolutionGroupId']")
	public WebElement Rampup_Group_Drpdwn;

	@FindBy(how = How.XPATH, using = "//input[@id='fteRipple']/following-sibling::*[@class='switch-label']")
	public WebElement Rampup_Ripple_Btn;

	@FindBy(how = How.XPATH, using = "//ag-grid-angular[@id='serviceDeliveryGrid']//*[@col-id='Profile Name'][not(@role='presentation')]")
	public List<WebElement> Rampup_SD_Profiles;

	@FindBy(how = How.XPATH, using = "//ag-grid-angular[@id='transitionGrid']//*[@col-id='Profile Name'][not(@role='presentation')]")
	public List<WebElement> Rampup_Trans_Profiles;

	@FindBy(how = How.XPATH, using = "//button[@id='btnsave']/em[text()='Save']")
	public WebElement Rampup_Save;

	@FindBy(how = How.XPATH, using = "//p[@id='successErrorMsgId']/span")
	public WebElement Success_Alert;

	@FindBy(how = How.XPATH, using = "(//*[@id='summaryNewDealCanvas5']/../div)[1]")
	public WebElement Opportunity_Div;

	@FindBy(how = How.XPATH, using = "//*[@id='btnappdealdetail']//h2")
	public WebElement Version_Name;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='0']//*[@col-id='File']")
	public WebElement Rum_Exported_File;

	@FindBy(how = How.XPATH, using = "//*[@id='exportADLID']//img")
	public WebElement Rampup_ExportRum_Btn;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='0']//*[@col-id='File']/span/a/img")
	public WebElement Download_Btn;

	@FindBy(how = How.XPATH, using = "//div[@role='document']//em[text()='I understand']")
	public WebElement Confidential_Popup;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='0']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement RUM_Export_Success_Msg;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and @row-id='1']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement RUM_Import_Success_Msg;

	@FindBy(how = How.XPATH, using = "//*[@role='row' and  @row-id='1' ]//*[@col-id='expimpflag'][contains(@class,'ag-cell')]")
	public WebElement RUM_Accept_Msg;

	@FindBy(how = How.ID, using = "importRumID")
	public WebElement Import_Rum;

	@FindBy(how = How.XPATH, using = "//div//input[@id='RoOnshore']")
	public WebElement Rum_Chkbx;

	@FindBy(how = How.XPATH, using = "//div[@id='importrum']//input[@name='files']")
	public WebElement Browse_Input;

	@FindBy(how = How.XPATH, using = "//*[@id='importStartMonth']")
	public WebElement Start_Mnth_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@id='ddlStartMonth']/li")
	public List<WebElement> Start_Mnth_List;

	@FindBy(how = How.XPATH, using = "//*[@id='importEndMonth']")
	public WebElement End_Mnth_Drpdwn;

	@FindBy(how = How.XPATH, using = "//*[@id='ddlEndMonth']/li")
	public List<WebElement> End_Mnth_List;

	@FindBy(how = How.ID, using = "btnImprtGo")
	public WebElement Import_OK_Btn;

	@FindBy(how = How.XPATH, using = "//*[@id='viewRumID']//img")
	public WebElement View_Rum_Btn;

	@FindBy(how = How.XPATH, using = "(//div[@id='rumlistgrid']//img[contains(@src,'accept')])[1]")
	public WebElement Accept_Rum_File;

	@FindBy(how = How.XPATH, using = "(//div[@id='rumlistgrid']//img[contains(@src,'cancel')])[1]")
	public WebElement Reject_Rum_File;

	@FindBy(how = How.XPATH, using = "(//span[contains(@id,'SpanRejactReasion')][not (contains(@class,'disabled'))])[1]/textarea")
	public WebElement Reject_Reason;

	@FindBy(how = How.XPATH, using = "//*[@id='RumsuccessErrorMsgId']/span")
	public WebElement Reject_Message;

	/************************** METHODS *****************************/

	public RampUp_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_59 : Validate if the SA is able to navigate to Ramp Up screen
	 *           on click of Ramp Up and able to View Transition,Service Delivery,
	 *           Summary and Export/Import Status.
	 * @date - 12/03/2024
	 * @release March 16
	 * 
	 */
	public void navigationToRampUp() throws Exception {
		boolean scenarioFlag = true;
		waitForElementToBeVisible(rampUpScreen);
		clickElement(rampUpScreen);
		waitForElementToBeVisible(trasitionTab);
		if (isDisplayed(trasitionTab) && isDisplayed(service_DeliveryTab) && isDisplayed(summaryTab)
				&& isDisplayed(rampUpExportImportTab)) {
			logPass("SA is able to navigate to Ramp Up screen on click of Ramp Up and able to View Transition,Service Delivery, Summary and Export/Import Status.");
			scenarioFlag = true;
		} else {
			logFail("SA is not able to navigate to Ramp Up screen on click of Ramp Up and able to View Transition,Service Delivery, Summary and Export/Import Status.");
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_62 : Validate if SA is able to Export and Import Ramp Up file.
	 *           TC_65 : Validate if SA is able to see the status of OU
	 *           Import/Export under Offline Utility tab in Export/Import Status
	 *           tab.
	 * @date - 14/03/2024
	 * @release March 16
	 * 
	 */
	public String exportRampUpValidation() throws Exception {
		boolean scenarioFlag = true;
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_TRANSITION);

		clickElement(ExportRampUpBtn);
		clickElement(ExportRampUp_popup_Ok);

		// checking the Exported RampUp Status to be changed to Completed
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(ExportRampUp_status, "Completed"));
			logPass("The RampUp Export status has successfully changed to Completed.");
		} catch (Exception e) {
			logFail("The RampUp Export status has not changed to Completed.");
			scenarioFlag = false;
		}

		if (getText(ExportRampUp_status).contains("Completed")) {
			logPass("RampUp has been Exported Successfully");
		} else {
			logFail("RampUp has not been Exported Successfully");
			scenarioFlag = false;
		}

		String FileName = getText(ExportedFileName);

		clickElement(DownloadExportedRampUp);
		waitForElementToAppear(ConfidentialPopUp_IUnderstandBtn);
		clickElement(ConfidentialPopUp_IUnderstandBtn);

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
		return FileName;
	}

	public void importRampUpValidation(String FileName) throws Exception {
		boolean scenarioFlag = true;
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

		String FilePath = ConstantUtils.DownloadedFiles_FilePath.concat(FileName);
		// String FilePath =
		// "C:\\Users\\dhanunjay.boya.DIR\\Downloads\\".concat(FileName);

		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_TRANSITION);

		clickElement(ImportRampUpBtn);

		waitForElementToBeVisible(solutionRefreshPop);
		if (isDisplayed(solutionRefreshPop)) {
			waitForElementToBeVisible(autoRefreshBtn);
			clickElement(autoRefreshBtn);
			clickElement(solutionRefresOk);
		} else {
			logInfo("No pop displayed");
		}

		waitForElementToAppear(ImportRampUp_Browse);

		sendKeys(ImportRampUp_Browse, FilePath);

		clickElement(ImportRampUp_OKBtn);

		// checking the Imported RampUp Status to be changed to Completed
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(ImportRampUp_status, "Completed"));
			logPass("The RampUp Import status has successfully changed to Completed.");
		} catch (Exception e) {
			logFail("The RampUp Import status has not changed to Completed.");
			scenarioFlag = false;
		}

		if (getText(ImportRampUp_status).contains("Completed")) {
			logPass("RampUp has been Imported Successfully");
		} else {
			logFail("RampUp has not been Imported Successfully");
			scenarioFlag = false;
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	// Method return Month value
	public String rampUpMonthValueCheck() throws Exception {
		boolean scenarioFlag = true;
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_TRANSITION);
		String MonthValue = "";
		String groupName = "Group 1";
		clickElement(groupButton);
		for (int i = 0; i < group_dropDn.size(); i++) {
			String element = getText(group_dropDn.get(i));
			if (element.equals(groupName)) {
				clickElement(group_dropDn.get(i));
				break;
			}

		}
		// Validating if UI value is updated for first profile of first group
		waitForElementToBeVisible(Month_Value);
		MonthValue = Month_Value.getAttribute("value");		
		return MonthValue;

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_67 : Validate if SA is able to see make the changes in
	 *           exported excel and on import, the same changes should reflect on
	 *           UI.
	 * @date - 15/03/2024
	 * @release March 16
	 * 
	 */
	public void rampUpImportEdited(String FileName) throws Exception {
		boolean scenarioFlag = true;
		String MonthValue = "6";
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

		// Return Month one value before making changes in RampUp exported file
		String beforeChangingMonthValueInExcel = rampUpMonthValueCheck();
		logInfo("Month one value before changing RampUp exported file :" + beforeChangingMonthValueInExcel);

		String FilePath = ConstantUtils.DownloadedFiles_FilePath.concat(FileName);
		// String FilePath =
		// "C:\\Users\\dhanunjay.boya.DIR\\Downloads\\".concat(FileName);

		// Method for making changes or writing values in the exported file.
		writeDataToExcel(FilePath, "Transition", 2, 3, MonthValue);

		clickElement(ImportRampUpBtn);

		waitForElementToBeVisible(solutionRefreshPop);
		if (isDisplayed(solutionRefreshPop)) {
			waitForElementToBeVisible(autoRefreshBtn);
			clickElement(autoRefreshBtn);
			clickElement(solutionRefresOk);
		} else {
			logInfo("No pop displayed");
		}

		waitForElementToAppear(ImportRampUp_Browse);

		sendKeys(ImportRampUp_Browse, FilePath);

		clickElement(ImportRampUp_OKBtn);

		try {
			waitForElementToAppear(ImportRampUpOverRide_OKBtn);
			clickElement(ImportRampUpOverRide_OKBtn);
		} catch (Exception e) {
			logInfo("The Import Pop up is not Present !");
		}

		// checking the Imported RampUp Status to be changed to Completed
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(ImportRampUp_status, "Completed"));
			logPass("The RampUp Import status has successfully changed to Completed.");
		} catch (Exception e) {
			logFail("The RampUp Import status has not changed to Completed.");
			scenarioFlag = false;
		}

		if (getText(ImportRampUp_status).contains("Completed")) {
			logPass("RampUp has been Imported Successfully");
		} else {
			logFail("RampUp has not been Imported Successfully");
			scenarioFlag = false;
		}

		// Return Month one value after making changes in RampUp exported file
		String afterChangingMonthValueInExcel = rampUpMonthValueCheck();
		logInfo("Month one value After changing RampUp exported file :" + afterChangingMonthValueInExcel);

		// checking whether month value is reflect on UI or not.
		if (!beforeChangingMonthValueInExcel.equals(afterChangingMonthValueInExcel)) {
			logPass("SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.");
			scenarioFlag = true;
		} else {
			// logInfo("SA is not able to see make the changes in exported excel and on
			// import, the same changes should reflect on UI.");
			logFail("Month value before changing " + beforeChangingMonthValueInExcel
					+ " and Month value after changing " + afterChangingMonthValueInExcel + " are same ");
			scenarioFlag = false;

		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * TC_60: Validate if the SA is able to input Transition FTE's profile wise
	 * under the group selected in dropdown. TC_63: Validate if the SA is able to
	 * input Service Delivery FTE's profile wise under the group selected in
	 * dropdown.
	 * 
	 * @since 11/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void rampUpSdTransInput(String FilePath, String subTab) throws Exception {
		boolean scenarioFlag = true;
		String sheetName = "", gridId = "", selectedGroup = "", fteValue = "";
		List<WebElement> rampupProfiles;

		if (subTab.contentEquals("SD")) {
			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_SERVICE_DELIVERY);
			rampupProfiles = Rampup_SD_Profiles;
			sheetName = "RampUp_SD";
			gridId = "serviceDeliveryGrid";

		} else {
			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_TRANSITION);
			sheetName = "RampUp_Transition";
			rampupProfiles = Rampup_Trans_Profiles;
			gridId = "transitionGrid";
		}
		String colStartNo = SetExcelPath(FilePath, sheetName, 0, 1);
		float columnstartfloat = Float.valueOf(colStartNo);
		int monthStart = (int) columnstartfloat;
		String colEndNo = SetExcelPath(FilePath, sheetName, 0, 2);
		float colEndNofloat = Float.valueOf(colEndNo);
		int monthEnd = (int) colEndNofloat;
		int Groupsize = Group_Drpdwn_List.size();

		//for (int i = 0; i < Groupsize; i++) {
			for (int i = 0; i < 1; i++) {
			selectedGroup = Group_Drpdwn_List.get(i).getAttribute("id");
			logInfo("selecting group index " + selectedGroup + " index: " + i);
			waitForElementToBeVisible(Rampup_Group_Drpdwn);
			clickElement(Rampup_Group_Drpdwn);
			waitForElementToBeVisible(Group_Drpdwn_List.get(i));
			clickElement(Group_Drpdwn_List.get(i));
			waitForElementToBeVisible(rampupProfiles);
			logInfo("Total profiles: " + rampupProfiles.size());

			for (int k = monthStart; k <= monthEnd; k++) {
				if (k == 1) {
					rippleToggle("Off");
				}

				if (k == monthEnd) {
					rippleToggle("On");
				}

				for (int j = 0; j < rampupProfiles.size(); j++) {
					waitForElementToBeVisible(rampupProfiles);
					fteValue = SetExcelPath(FilePath, sheetName, 2, k - 1);

					clickElement(getDriver().findElements(By.xpath("//*[@id='" + gridId
							+ "']//div[contains(@class,'ag-body-container')]/div[@role='row']/div[contains(@col-id,'M"
							+ k + "<')]/span/input")).get(j));

					clear(getDriver().findElement(By.xpath("//*[@id='" + gridId
							+ "']//div[contains(@class,'ag-body-container')]/div[@role='row']/div[contains(@col-id,'M"
							+ k + "<')]/numeric-cell/input")));

					sendKeys(getDriver().findElement(By.xpath("//*[@id='" + gridId
							+ "']//div[contains(@class,'ag-body-container')]/div[@role='row']/div[contains(@col-id,'M"
							+ k + "<')]/numeric-cell/input")), fteValue);
					getDriver().findElement(By.xpath("//*[@id='" + gridId
							+ "']//div[contains(@class,'ag-body-container')]/div[@role='row']/div[contains(@col-id,'M"
							+ k + "<')]/numeric-cell/input")).sendKeys(Keys.ENTER);

				}
			}

			clickElement(Rampup_Save);
			waitForElementToBeVisible(solutionRefreshPopT);
			if (isDisplayed(solutionRefreshPopT)) {
				waitForElementToBeVisible(autoRefreshBtnT);
				clickElement(autoRefreshBtnT);
				clickElement(solutionRefresOkT);
			} else {
				logInfo("No pop displayed");
			}

			try {
				waitForElementToBeVisible(Success_Alert);
				String successMsg = getText(Success_Alert);
				if (successMsg.trim().contains("data saved successfully")) {
					logPass("Rampup data is saved successfully for group " + selectedGroup + " in " + subTab);
				} else {
					logFail("Rampup data not saved successfully for group: " + selectedGroup + " in " + subTab);
					scenarioFlag = false;
				}
			} catch (Exception e) {
				logFail("Rampup data success message absent for group: " + selectedGroup + " in " + subTab);
				scenarioFlag = false;
			}

		}

		if (scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	/**
	 * 
	 * Method to toggle Rampup ripple
	 * 
	 * @since 12/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void rippleToggle(String choice) throws Exception {

		String rippleBgColor = Rampup_Ripple_Btn.getCssValue("background-color");

		if (choice.equalsIgnoreCase("On")) {
			if (!(rippleBgColor.contains("rgba(255, 255, 255, 1)"))) {
				clickElement(Rampup_Ripple_Btn);
			}
		} else {
			if (rippleBgColor.contains("rgba(255, 255, 255, 1)")) {
				clickElement(Rampup_Ripple_Btn);
			}
		}

	}

	/**
	 * TC_61: Validate if SA is able to Export and Accept RUM File.[Import through
	 * Mobilization SME]. TC_66: Validate if SA is able to see the status of RUM
	 * Import/Export under RUM tab in Export/Import Status tab.
	 * 
	 * @Prerequisites Rum file is already configured for deal with Country-India
	 * @since 13/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void exportImportRum(String RumImportFile, String oppId) throws Exception {
		boolean exportFlag = true, importFlag = true, acceptFlag = true;
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

		String lsaUrl = getDriver().getCurrentUrl();
		String mobSmeUrl = getDriver().getCurrentUrl().replace("/17", "/19");
		getDriver().get(mobSmeUrl);
		loader();
		exportFlag = exportRumFile(wait); // export rum

		setRumData(RumImportFile, oppId); // updating data to Rum file

		importFlag = importRumFile(RumImportFile, "1", "4", wait); // to reject rum
		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_SERVICE_DELIVERY);
		importFlag = importRumFile(RumImportFile, "1", "3", wait); // to accept rum

		getDriver().get(lsaUrl);
		loader();
		waitForElementToAppear(View_Rum_Btn);
		acceptFlag = acceptRejectRum(wait);

		if (importFlag == true && exportFlag == true && acceptFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * 
	 * Method to Export RUM
	 * 
	 * @since 13/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public boolean exportRumFile(WebDriverWait wait) throws Exception {
		boolean scenarioFlag = true;
		waitForElementToAppear(Rampup_ExportRum_Btn);
		clickElement(Rampup_ExportRum_Btn);

		try {
			wait.until(ExpectedConditions.textToBePresentInElement(RUM_Export_Success_Msg, "Completed"));
			logPass("The Rum Export status has successfully changed to Completed");
		} catch (Exception e) {
			logFail("The Rum Export status has not changed to Completed");
			scenarioFlag = false;
		}

		clickElement(Download_Btn);
		waitForElementToAppear(Confidential_Popup);
		clickElement(Confidential_Popup);

		String fileName = (Rum_Exported_File.getAttribute("title"));
		logInfo("Exported Filename:" + fileName);

		Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_SERVICE_DELIVERY);

		String DownloadedStatus = "false";
		File downloadPath = new File(ConstantUtils.DownloadedFiles_FilePath);
		if (!downloadPath.isDirectory())
			throw new IllegalStateException("Filenotfound");
		for (File downloadedFiles : downloadPath.listFiles()) {
			logInfo("FileName: " + downloadedFiles.getName());
			if (downloadedFiles.getName().equals(fileName)) {
				DownloadedStatus = "true";
				break;
			}
		}
		if (DownloadedStatus.equalsIgnoreCase("true"))
			logPass("Exported Rum file is downloaded successfully in Downloads folder");
		else {
			logFail("Exported Rum Staffing file is not downloaded successfully in Downloads folder");
			scenarioFlag = false;
		}
		return scenarioFlag;
	}

	/**
	 * 
	 * Method to Import RUM
	 * 
	 * @since 13/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public boolean importRumFile(String fileToImport, String startMonth, String endMonth, WebDriverWait wait)
			throws Exception {
		boolean scenarioFlag = true;

		waitForElementToBeVisible(Import_Rum);
		clickElement(Import_Rum);
		clickElement(Rum_Chkbx);

		sendKeys(Browse_Input, fileToImport);

		clickElement(Start_Mnth_Drpdwn);
		for (int i = 0; i < Start_Mnth_List.size(); i++) {
			String FirstMonth = "M" + startMonth;
			if (getText(Start_Mnth_List.get(i)).equals(FirstMonth)) {
				clickElement(Start_Mnth_List.get(i));
				logInfo("Start Month is selected");
				break;
			}
		}
		clickElement(End_Mnth_Drpdwn);
		for (int i = 0; i < End_Mnth_List.size(); i++) {
			String EndMonth = "M" + endMonth;
			if (getText(End_Mnth_List.get(i)).equals(EndMonth)) {
				clickElement(End_Mnth_List.get(i));
				logInfo("End Month is selected");
				break;
			}
		}
		clickElement(Import_OK_Btn);

		try {
			wait.until(ExpectedConditions.textToBePresentInElement(RUM_Import_Success_Msg, "Completed"));
			logPass("The Rum Import status has successfully changed to Completed.");
		} catch (Exception e) {
			logFail("The Rum Import status has not changed to Completed.");
			scenarioFlag = false;
		}

		return scenarioFlag;
	}

	/**
	 * 
	 * Method to Reject and Accept first 2 RUM files
	 * 
	 * @since 13/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public boolean acceptRejectRum(WebDriverWait wait) throws Exception {
		boolean scenarioFlag = true;
		// Reject rum file
		waitForElementToAppear(View_Rum_Btn);
		clickElement(View_Rum_Btn);
		waitForElementToBeVisible(Reject_Reason);
		sendKeys(Reject_Reason, "Reject check");
		Reject_Reason.sendKeys(Keys.TAB);
		clickElement(Reject_Rum_File);

		try {
			wait.until(ExpectedConditions.textToBePresentInElement(Reject_Message, "RUM data has been Rejected."));
			logPass("RUM File has been rejected and success message is displayed");
		} catch (Exception e) {
			logFail("RUM File has not been rejected and success message is not displayed");
			scenarioFlag = false;
		}

		// accept rum file
		clickElement(View_Rum_Btn);
		waitForElementToBeVisible(Accept_Rum_File);
		clickElement(Accept_Rum_File);

		try {
			wait.until(ExpectedConditions.textToBePresentInElement(RUM_Accept_Msg, "Accept"));
			wait.until(ExpectedConditions.textToBePresentInElement(RUM_Import_Success_Msg, "Completed"));
			logPass("RUM File has been Accepted and success message is displayed");
		} catch (Exception e) {
			logFail("RUM File is not Accepted and success message is not displayed");
			scenarioFlag = false;
		}

		return scenarioFlag;
	}

	/**
	 * 
	 * Method to write data to RUM file
	 * 
	 * @since 13/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void setRumData(String Filename, String OppID) throws Exception {

		String solutionId = getDriver().getCurrentUrl().split("SolutionConfiguration/")[1].split("/")[0].trim();
		String Version = "V" + Version_Name.getAttribute("textContent").split("-")[1].split("[|]")[0].trim();
		logInfo("opportunity: " + OppID + " solutionId: " + solutionId + " Version: " + Version);

		FileInputStream fs = new FileInputStream(Filename);
		XSSFWorkbook workBook = new XSSFWorkbook(fs);
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell Cell0, Cell1, Cell2;
		sheet = workBook.getSheet("Pyramid Staffing");

		try {
			for (int i = 3; i < sheet.getPhysicalNumberOfRows(); i++) {
				row = sheet.getRow(i);
				Cell0 = row.getCell(0, xRow.RETURN_BLANK_AS_NULL);
				Cell1 = row.getCell(1, xRow.RETURN_BLANK_AS_NULL);
				Cell2 = row.getCell(2, xRow.RETURN_BLANK_AS_NULL);
				if (Cell2 == null) {// writing version
					Cell2 = row.createCell(2);
					Cell2.setCellValue(Version);
				} else {
					Cell2.setCellValue(Version);
				}

				if (Cell1 == null) {// writing Solution Id
					Cell1 = row.createCell(1);
					Cell1.setCellValue(solutionId);
				} else {
					Cell1.setCellValue(solutionId);
				}

				if (Cell0 == null) {// writing Opportunity id
					Cell0 = row.createCell(0);
					Cell0.setCellValue(OppID);
				} else {
					Cell0.setCellValue(OppID);
				}
			}
//				FileOutputStream fileOut = new FileOutputStream(Filename);
//				workBook.write(fileOut);
//				fileOut.flush();
//				fileOut.close();
//			}
//
//		} catch (Exception e) {
//			logInfo("Writing data to Rum file failed!.");
//			throw (e);
//
//		}
//		
//		FileInputStream fs = new FileInputStream(Filename);
//		XSSFWorkbook workBook = new XSSFWorkbook(fs);
//		XSSFSheet sheet;
//		XSSFRow row;
//		XSSFCell Cell0, Cell1, Cell2;
		sheet = workBook.getSheet("LBS Staffing");

		
			for (int j = 3; j < sheet.getPhysicalNumberOfRows(); j++) {
				row = sheet.getRow(j);
				Cell0 = row.getCell(0, xRow.RETURN_BLANK_AS_NULL);
				Cell1 = row.getCell(1, xRow.RETURN_BLANK_AS_NULL);
				Cell2 = row.getCell(2, xRow.RETURN_BLANK_AS_NULL);
				if (Cell2 == null) {// writing version
					Cell2 = row.createCell(2);
					Cell2.setCellValue(Version);
				} else {
					Cell2.setCellValue(Version);
				}

				if (Cell1 == null) {// writing Solution Id
					Cell1 = row.createCell(1);
					Cell1.setCellValue(solutionId);
				} else {
					Cell1.setCellValue(solutionId);
				}

				if (Cell0 == null) {// writing Opportunity id
					Cell0 = row.createCell(0);
					Cell0.setCellValue(OppID);
				} else {
					Cell0.setCellValue(OppID);
				}
			}
				FileOutputStream fileOut = new FileOutputStream(Filename);
				workBook.write(fileOut);
				fileOut.flush();
				fileOut.close();
			

			}catch (Exception e) {
			logInfo("Writing data to Rum file failed!.");
			throw (e);

		}

	}

	/**
	 * TC_64: Validate if SA is able to see all the Month wise FTE's given for each
	 * and every profile under Transition and SD.
	 * 
	 * @since 18/03/2024
	 * @release March 16
	 * @author surabhi.shervegar
	 * 
	 */
	public void validateRampupData(String FilePath) throws Exception {
		boolean transStatus = true, serviceDStatus = true;

		serviceDStatus = validateRampupFTE("SD", FilePath); // sd tab
		transStatus = validateRampupFTE("T", FilePath); // t tab

		if (serviceDStatus == true && transStatus == true)
			scenarioPass();
		else {
			scenarioFail();
		}

	}

	public boolean validateRampupFTE(String subTab, String FilePath) throws Exception {
		boolean scenarioFlag = true;
		String selectedProfile = "", gridId = "", selectedGroup = "", rampupValue = "", sheetName = "", value = "";
		List<WebElement> rampupProfiles;

		ArrayList<String> savedValues = new ArrayList<String>();
		ArrayList<String> uiValues = new ArrayList<String>();

		if (subTab.contentEquals("SD")) {
			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_SERVICE_DELIVERY);
			rampupProfiles = Rampup_SD_Profiles;
			gridId = "serviceDeliveryGrid";
			sheetName = "RampUp_SD";
		} else {
			Navigate_to_subTab(GlobalScreen.SUBTAB_RAMPUP_TRANSITION);
			rampupProfiles = Rampup_Trans_Profiles;
			gridId = "transitionGrid";
			sheetName = "RampUp_Transition";
		}

		String colStartNo = SetExcelPath(FilePath, sheetName, 0, 1);
		float columnstartfloat = Float.valueOf(colStartNo);
		int monthStart = (int) columnstartfloat;
		String colEndNo = SetExcelPath(FilePath, sheetName, 0, 2);
		float colEndNofloat = Float.valueOf(colEndNo);
		int monthEnd = (int) colEndNofloat;
		for (int m = monthStart; m <= monthEnd; m++) {
			value = SetExcelPath(FilePath, sheetName, 2, m - 1).replace(".0", "");
			savedValues.add(value);
		}savedValues.add(value);//add 1 more rippled value

		int Groupsize = Group_Drpdwn_List.size();
		//for (int i = 0; i < Groupsize; i++) {
			for (int i = 0; i < 1; i++) {
			waitForElementToBeVisible(Rampup_Group_Drpdwn);
			clickElement(Rampup_Group_Drpdwn);
			waitForElementToBeVisible(Group_Drpdwn_List.get(i));
			clickElement(Group_Drpdwn_List.get(i));

			selectedGroup = Group_Drpdwn_List.get(i).getAttribute("id");
			logInfo("selecting group index " + selectedGroup + " index: " + i);

			waitForElementToBeVisible(rampupProfiles);
			logInfo("Total profiles: " + rampupProfiles.size());

			for (int j = 0; j < rampupProfiles.size(); j++) {
				waitForElementToBeVisible(rampupProfiles);
				selectedProfile = rampupProfiles.get(j).getAttribute("title");

				for (int k = 1; k <= 5; k++) {
					rampupValue = getDriver().findElement(By.xpath("//*[@id='" + gridId
							+ "']//div[contains(@class,'ag-body-container')]/div[@role='row']/div[contains(@col-id,'M"
							+ k + "<')]//input")).getAttribute("title");
					uiValues.add(rampupValue);
				}
				logInfo("uiValues: " + uiValues + " savedValues: " + savedValues);
				if (uiValues.equals(savedValues)) {
					logPass("FTE's are added for the profiles: " + selectedProfile + " in " + selectedGroup + " for "
							+ subTab);
				} else {
					logFail("FTE's are added not for the profiles:: " + selectedProfile + " in " + selectedGroup
							+ " for " + subTab);
					scenarioFlag = false;
				}
				uiValues.clear();
			}

		}

		return scenarioFlag;
	}
}
