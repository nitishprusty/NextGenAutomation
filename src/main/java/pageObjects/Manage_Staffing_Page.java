package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;


public class Manage_Staffing_Page extends BasePage {
	public Actions action = new Actions(getDriver());

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Solution Components')]")
	public WebElement solution_text;

	@FindBy(how = How.XPATH, using = "//*[@id='defineStaffing']//a[text()='Staffing']")
	public WebElement staffingLink;

	@FindBy(how = How.XPATH, using = "//div[@class='progress rounded-0']")
	public WebElement staffingEnabled;

	@FindBy(how = How.XPATH, using = "//a[@id='PyramidanchorTab' and text()='Pyramid']")
	public WebElement pyramidTab;

	@FindBy(how = How.XPATH, using = "//a[@id='LBSanchorTab' and text()='LBS']")
	public WebElement LBSTab;

	@FindBy(how = How.XPATH, using = "//a[@id='siTab']")
	public WebElement skillInverntoryTab;

	@FindBy(how = How.XPATH, using = "//a[@id='importanchorTab' and text()='Export/Import status']")
	public WebElement exportImportTab;

	@FindBy(how = How.XPATH, using = "//*[@id='baselineeffortab']//a[text()='Baseline Effort']")
	public WebElement baselineEffortTab;

	@FindBy(how = How.XPATH, using = "//button[@id='SolutionGroupId']")
	public WebElement groupButton;

	@FindBy(how = How.XPATH, using = "//ul[@id='ulsolutiongroups']/li")
	public List<WebElement> group_dropDn;

	@FindBy(how = How.XPATH, using = "//span[@id='SkillinventoryLoadTabSpan']")
	public WebElement applySkill;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveAndContinueParam1'] /em")
	public WebElement saveAndContinue;

	@FindBy(how = How.XPATH, using = "//ul//li[@id='ApplyskillsId']")
	public WebElement applySkillInventory;

	@FindBy(how = How.XPATH, using = "//h4[text()='Apply Skills']")
	public WebElement applySkillsPop;

	@FindBy(how = How.XPATH, using = "//div[@class='button-group gradient']//button//em[text()='APPLY']")
	public WebElement applyBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='LBSanchorTab']")
	public WebElement Staffing_LBSTab;

	@FindBy(how = How.XPATH, using = "//button[@id='lbsAddBtn']")
	public WebElement addLbsBtn;

	@FindBy(how = How.XPATH, using = "//button[@id='StaffingProfileId']")
	public WebElement profileBtn;

	@FindBy(how = How.XPATH, using = "//input[@id='InputControlId']")
	public WebElement resourceNameInput;

	@FindBy(how = How.XPATH, using = "//button[@id='lbsSaveBtn']")
	public WebElement saveBtn;

	@FindBy(how = How.XPATH, using = "//button[@id='btnSSITypeoptions']")
	public WebElement selectInventory;

	@FindBy(how = How.XPATH, using = "//*[@id='CapabilityNm1']//span[@class='dropdown-btn']")
	public WebElement capability1;

	@FindBy(how = How.XPATH, using = "//*[@id='CapabilityNm1']//div[@class='dropdown-list']//ul[@class='item2']/li")
	public WebElement capabilitydrpDn;

	@FindBy(how = How.XPATH, using = "//*[@id='SpecialityNm1']//span[@class='dropdown-btn']")
	public WebElement speciality;

	@FindBy(how = How.XPATH, using = "//*[@id='SpecialityNm1']//span[@class='dropdown-btn']/span[1]")
	public WebElement selectText_1;

	@FindBy(how = How.XPATH, using = "//*[@id='skillNm1']//span[@class='dropdown-btn']")
	public WebElement skill;

	@FindBy(how = How.XPATH, using = "//*[@id='skillNm1']//span[@class='dropdown-btn']/span[1]")
	public WebElement selectText_2;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddCapSpecSkill']")
	public WebElement addBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='successErrorMsgField']/span[@id='SuccessErrorMsgId']")
	public WebElement popMsg;

	@FindBy(how = How.XPATH, using = "//*[@class='SkillinventoryLoadTab']//*[@id='SkillinventoryLoadTabSpan']")
	public WebElement applySkilltab;

	@FindBy(how = How.XPATH, using = "//li[@id='ApplyskillsId']/a")
	public WebElement skillInventoryIcon;

	@FindBy(how = How.XPATH, using = "//h4[text()='Apply Skills']")
	public WebElement applySkillPop;

	@FindBy(how = How.XPATH, using = "//*[@id=\"skillsInventory\"]//button/em")
	public WebElement addapplybtn;

	@FindBy(how = How.XPATH, using = "//button[@id='inventoryId']")
	public WebElement applyInventory;

	@FindBy(how = How.XPATH, using = "//button[@id='capabilityId']")
	public WebElement applycapabiity;

	@FindBy(how = How.XPATH, using = "//button[@id='specialityId']")
	public WebElement applySpeciality;

	@FindBy(how = How.XPATH, using = "//button[@id='skillId']")
	public WebElement applySkills;

	@FindBy(how = How.XPATH, using = "//span[@id='StaffingLoadTabSpan']")
	public WebElement staffing;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveBtn']")
	public WebElement staffing_saveBtn;

	@FindBy(how = How.XPATH, using = "//a[@id='exportStaffingID']/img")
	public WebElement exportIcon;

	@FindBy(how = How.XPATH, using = "//a[@id='importStaffingID']/img")
	public WebElement importIcon;

	@FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-0\"]//div//h6[text()='Confidential Information - Reminder']")
	public WebElement confidential_pop;

	@FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-0\"]//button/em[text()='I understand']")
	public WebElement understandBtn;

	@FindBy(how = How.XPATH, using = "//div[@id='divImportStaffingcls']")
	public WebElement import_pop;

	@FindBy(how = How.XPATH, using = "//*[@id='files_staffing']")
	public WebElement clickBrowser;

	@FindBy(how = How.XPATH, using = "//div[@id='//div[@id='divImportStaffingcls']//div[@class='import-btn']//button[@id='btnImprtStaffing']")
	public WebElement import_pop_ok;

	@FindBy(how = How.XPATH, using = "//li[@id='baselineeffortab']/a")
	public WebElement baseLineEffort_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='solutionHourTypeId']")
	public WebElement typeOfEstimation;

	@FindBy(how = How.XPATH, using = ".//*[@role='row' and @row-id='0']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement completedStaus;

	@FindBy(how = How.XPATH, using = ".//*[@role='row' and @row-id='1']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement completedStatusForImport;

	@FindBy(how = How.XPATH, using = "//*[@id='ErroneousFilter']/a/img")
	public WebElement showErrorIcon;

	@FindBy(how = How.XPATH, using = "//*[@id='erroneousFilterPopup']//h4[@id='NavdialogLabel' and text()='Confirm']")
	public WebElement showErrorPop;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAgree']/em")
	public WebElement showErrorPop_Ok;

	@FindBy(how = How.XPATH, using = "//*[@id='PyramidGrid']//div[@ref='eLeftContainer']//div[@role='row']//div[@col-id='ag-Grid-AutoColumn']//span[@title]")
	public List<WebElement> profile_dropDn;

	@FindBy(how = How.XPATH, using = "//div[@ref='eBodyContainer']//div[@row-index]//div[@col-id='BillCodeDesc']")
	public List<WebElement> billCode_dropDn;

	@FindBy(how = How.XPATH, using = "//div[@ref='eBodyContainer']//div[@col-id='BillCodeDesc'][contains(@class,'error-cell')]")
	public List<WebElement> errorList;

	@FindBy(how = How.XPATH, using = "//*[@id='aoStaffingSucErrMsgId']//*[@id='errorpyramid']")
	public WebElement saveEditBill_Msg;

	@FindBy(how = How.XPATH, using = "//button[@id='pyramidSaveBtn']")
	public WebElement save_Bill;

	@FindBy(how = How.XPATH, using = "//button[@id='StaffingProfileId']/following-sibling::ul[@id='ulprofiles']/li")
	public List<WebElement> profileList1;

	@FindBy(how = How.XPATH, using = "//div[@ref='eBodyContainer']//div[@role='row']//div[@col-id='ResourceNm']")
	public List<WebElement> resourceNameList;

	@FindBy(how = How.XPATH, using = "//select[@id='drpDown']/option")
	public List<WebElement> addLbs_DropDn;

	@FindBy(how = How.XPATH, using = "//span[@class='switch-label']")
	public WebElement rippleBtn;

	@FindBy(how = How.XPATH, using = "//ul[@id='ulinventory']/li")
	public List<WebElement> Inventory_dropDn;

	@FindBy(how = How.XPATH, using = "//ul[@id='ulcapability']/li")
	public List<WebElement> Capability_dropDn;

	@FindBy(how = How.XPATH, using = "//ul[@id='ulspeciality']/li")
	public List<WebElement> Speciality_dropDn;

	@FindBy(how = How.XPATH, using = "//ul[@id='ulskill']/li")
	public List<WebElement> Skill_dropDn;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dropdown-custom mt-3')]//ul[@class='dropdown-menu']/li")
	public List<WebElement> selectInventory_dropDn;

	@FindBy(how = How.XPATH, using = "//*[@id='CapabilityNm1']//div[@class='dropdown-list']//ul[@class='item2']/li")
	public List<WebElement> capabilitydropDn;

	@FindBy(how = How.XPATH, using = "//*[@id='SpecialityNm1']//div[@class='dropdown-list']//ul[@class='item2']/li")
	public List<WebElement> specialitydropDn;

	@FindBy(how = How.XPATH, using = "//*[@id='skillNm1']//div[@class='dropdown-list']//ul[@class='item2']/li")
	public List<WebElement> skilldropDn;

	@FindBy(how = How.XPATH, using = "//*[@id='successErrorMsgField']/span\"")
	public WebElement addSkillInventory_Msg;

	@FindBy(how = How.XPATH, using = "//a[@id='importanchorTab']")
	public WebElement ImportExportTab;

	@FindBy(how = How.XPATH, using = "//*[@id='expimpGrid']//div[@ref='eBodyContainer']//div[@row-id='0']//div[@col-id='FileNm']")
	public WebElement fileName;

	@FindBy(how = How.XPATH, using = "//*[@id='aoStaffingSucErrMsgId']/span[@id='errorlbs']")
	public WebElement Lbs_saveMsg;

	@FindBy(how = How.XPATH, using = "//*[@id='expimpGrid']//div[@ref='eBodyContainer']//div[@row-id='0']//div[@col-id='FileNm']//a/img")
	public WebElement downloadIcon;

	@FindBy(how = How.XPATH, using = "//button[@id='btnImprtStaffing']")
	public WebElement clickBrowserOk;

	@FindBy(how = How.XPATH, using = "//button[@id='solutionHourTypeId']/following-sibling::ul/li/a")
	public List<WebElement> typeofEstimation_dropDn;

	@FindBy(how = How.XPATH, using = "//input[@id='BaselineHours1']")
	public WebElement baseLineEffort;

	@FindBy(how = How.XPATH, using = "//li[@id='Client Baseline Hours']")
	public WebElement clientHours;

	@FindBy(how = How.XPATH, using = "//li[@id='Accenture Estimated Hours']")
	public WebElement accentureHours;

	@FindBy(how = How.XPATH, using = "//input[@id='BaselineHours1']")
	public WebElement baseEffort;

	@FindBy(how = How.XPATH, using = "//*[@id='Carousel1']//div[@class='com-baseline-input']//input[@id='BaselineHours2']")
	public WebElement baseEffort_2;

	@FindBy(how = How.XPATH, using = "//button[@id='btnsave2']")
	public WebElement save_BaseEffort;

	@FindBy(how = How.XPATH, using = "//*[@id='sucErrMsgId']/span")
	public WebElement baseLine_successMsg;

	@FindBy(how = How.XPATH, using = "//*[@id='successErrorMsgField']/span")
	public WebElement save_popMsg;

	public Manage_Staffing_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	public void navigateToStaffingByClick() throws Exception {
		waitForElementToAppear(staffingLink);
		clickElement(staffingLink);
		if (isDisplayed(staffingEnabled)) {
			logInfo("staffing link is enabled");
		} else {
			logInfo("staffing link is disabled");
		}
	}

	/**
	 * @author dhanunjay.boya
	 * @scenario -TC_74 : Validate if the SA is able to Navigate to Staffing screen
	 *           on click of 'Staffing' and able to view Pyramids,LBS, Baseline
	 *           Effort and Export/Import Status tabs.
	 * @date - 29/02/2024
	 * @release March 16
	 * 
	 */
	public void navigateToStaffing() throws Exception {
		boolean scenarioFlag = false;
		waitForElementToBeVisible(staffingLink);
		Navigate_to_Screen(GlobalScreen.STAFFING);

		if (isDisplayed(staffingEnabled)) {
			logPass("staffing link is enabled");
			scenarioFlag = true;
		} else {
			logFail("staffing link is disabled");
		}

		if (isDisplayed(pyramidTab)) {
			logPass("Pyramid Tab is displayed");
			scenarioFlag = true;
		} else {
			logFail("Pyramid Tab is not displayed");
		}

		if (isDisplayed(LBSTab)) {
			logPass("LBS Tab is displayed");
			scenarioFlag = true;
		} else {
			logFail("LBS Tab is not displayed");
		}

		if (isDisplayed(skillInverntoryTab)) {
			logPass("skill Inventory Tab is displayed");
			scenarioFlag = true;
		} else {
			logFail("skill Inventory Tab is not displayed");
		}

		if (isDisplayed(exportImportTab)) {
			logPass("Export/Import status Tab is displayed");
			scenarioFlag = true;
		} else {
			logFail("Export/Import status Tab is not displayed");
		}

		if (isDisplayed(baselineEffortTab)) {
			logPass("Baseline Tab is displayed");
			scenarioFlag = true;
		} else {
			logFail("Baseline Tab is not disabled");
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_75 : Validate if user is able to edit and save Bill code and
	 *           Skill Inventory,rate Card for all the records displayed profile
	 *           wise on staffing screen.
	 * @date - 07/03/2024
	 * @release March 16
	 * 
	 */
	public void saveEditBill(String FilePath, String SheetName, int Row) throws Exception {
		boolean scenarioFlag = true;
		waitForElementToAppear(pyramidTab);
		clickElement(pyramidTab);
		for (int i = Row; i < i + 1; i++) {
			String text = "";
			try {
				text = SetExcelPath(FilePath, SheetName, i, 0);
			} catch (Exception e) {
				text = "";
			}
			if (text.equals("null") || text.equals(null) || text.equals("")) {
				break;
			}
			String group = SetExcelPath(FilePath, SheetName, i, 0);
			clickElement(groupButton);
			for (WebElement element : group_dropDn) {
				String ele = getText(element);
				if (ele.equals(group)) {
					clickElement(element);
					break;

				}

			}
		
			clickElement(showErrorIcon);
			waitForElementToBeVisible(showErrorPop);
			String popText = getText(showErrorPop);
			if (popText.equals("Confirm")) {
				clickElement(showErrorPop_Ok);
			}
			int num_1 = profile_dropDn.size();
			if (num_1 > 0) {
				for (int k = 0; k < num_1; k++) {
					String profileName = SetExcelPath(FilePath, SheetName, i, k + 1);
					WebElement profile = getDriver()
							.findElement(By.xpath("//div[@ref='eLeftContainer']//div[@row-index='" + k
									+ "']//div[@col-id='ag-Grid-AutoColumn']//span[@title]"));
					String ele = profile.getAttribute("title");
					logInfo("Element title :" + ele);
					//if (ele.equals(profileName)) {
						clickElement(getDriver().findElement(By.xpath("//div[@ref='eLeftContainer']//div[@row-index='"
								+ k + "']//span[@ref='eContracted']/span")));
					//}

//					clickElement(showErrorIcon);
//					waitForElementToBeVisible(showErrorPop);
//					String popText = getText(showErrorPop);
//					if (popText.equals("Confirm")) {
//						clickElement(showErrorPop_Ok);
//					}
					int num_2 = errorList.size();					
					//clickElement(showErrorIcon);
					
					if (num_2 > 0) {
						for (int i2 = 0; i2 < billCode_dropDn.size(); i2++) {
							WebElement bill_Code = getDriver()
									.findElement(By.xpath("//div[@ref='eBodyContainer']//div[@row-index='" + i2
											+ "']//div[@col-id='BillCodeDesc']"));
							//waitForElementToBeVisible(bill_Code);
							String text1 = bill_Code.getAttribute("class");
							if (text1.contains("error-cell")) {
								clickElement(bill_Code);
								loader();

							}
						}

					}
					jse.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath(
							"//div[@ref='eLeftContainer']//div[@row-index='" + k + "']//span[@ref='eExpanded']/span")));
					
					clickElement(getDriver().findElement(By.xpath(
							"//div[@ref='eLeftContainer']//div[@row-index='" + k + "']//span[@ref='eExpanded']/span")));
					clickElement(getDriver().findElement(By.xpath(
							"//div[@ref='eLeftContainer']//div[@row-index='" + k + "']//span[@ref='eCheckbox']/span")));
					clickElement(getDriver().findElement(By.xpath(
							"//div[@ref='eLeftContainer']//div[@row-index='" + k + "']//span[@ref='eExpanded']/span")));
					
				}

			} else {
				logInfo("No Profiles present");
			}
			clickElement(showErrorIcon); //close
//			clickElement(showErrorIcon);
//			waitForElementToBeVisible(showErrorPop);
//			String pop_Text = getText(showErrorPop);
//			if (pop_Text.equals("Confirm")) {
//				clickElement(showErrorPop_Ok);
//			}
//			int num_3 = errorList.size();
//			if (num_3 == 0) {
//				logInfo("No error Bill Code ");
				//clickElement(showErrorIcon);

				// add skill Inventory method
			//	addSkill(ConstantUtils.FilePath_Staffing, "StaffingLbs", 5, 8);

//			} else {
//				logInfo("error Bill Codes are present");
//			}
			addSkill(ConstantUtils.FilePath_Staffing, "StaffingLbs", 5, 8);
			clickElement(save_Bill);
			String save_Msg = saveEditBill_Msg.getAttribute("title");
			if (save_Msg.equals(
					"Staffing Records Saved Successfully. Based on the updated FTEs, please update the configured Resource Based cost accordingly.")) {
				scenarioFlag = true;
			}
			loader();
			break;
			
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_76 : Validate if the SA is able to add LBS record under
	 *           correct group-profile combination along with Skill Inventory and
	 *           Staffing FTEs.
	 * @date - 08/03/2024
	 * @release March 16
	 * 
	 */
	public void addLbsUnderGroupProfile(String FilePath, String SheetName, int Row, int Col) throws Exception {
		boolean scenarioFlag = true;
		for (int i = Row; i < i + 1; i++) {
			String text = "";
			try {
				text = SetExcelPath(FilePath, SheetName, i, 0);
			} catch (Exception e) {
				text = "";
			}
			if (text.equals("null") || text.equals(null) || text.equals("")) {
				break;
			}
			String group = SetExcelPath(FilePath, SheetName, i, Col);
			String profile = SetExcelPath(FilePath, SheetName, i, Col + 1);
			String namedResource = SetExcelPath(FilePath, SheetName, i, Col + 2);
			String billable = SetExcelPath(FilePath, SheetName, i, Col + 3);
			String phase = SetExcelPath(FilePath, SheetName, i, Col + 4);
			String method = SetExcelPath(FilePath, SheetName, i, Col + 5);
			String level = SetExcelPath(FilePath, SheetName, i, Col + 6);
			String billCode = SetExcelPath(FilePath, SheetName, i, Col + 7);
			String M1 = SetExcelPath(FilePath, SheetName, 1, 2);
			Navigate_to_subTab(GlobalScreen.SUBTAB_STAFFING_LBS);
//			waitForElementToBeVisible(Staffing_LBSTab);
//			clickElement(Staffing_LBSTab);
//			waitForElementToBeVisible(saveAndContinue);
//			clickElement(saveAndContinue);

			//clickElement(Staffing_LBSTab);
			clickElement(groupButton);
			for (WebElement element : group_dropDn) {
				if ((element.getAttribute("id").trim()).equalsIgnoreCase(group)) {
					clickElement(element);
					break;
				}

			}

			clickElement(profileBtn);
			for (WebElement element : profileList1) {
				if ((element.getAttribute("id")).equals(profile)) {
					clickElement(element);
					logInfo("profile is selected");
					break;

				}

			}

			clickElement(addLbsBtn);
			int num = resourceNameList.size();
			int RowId1;
			if (num > 0) {
				RowId1 = num - 1;
			} else {
				RowId1 = 0;
			}
			WebElement resourceName = getDriver().findElement(
					By.xpath("//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='ResourceNm']"));
			clickElement(resourceName);
			clickElement(resourceNameInput);
			sendKeys(resourceNameInput, namedResource);
			WebElement Billable = getDriver()
					.findElement(By.xpath("//*[@id='LBSGrid']//div[@ref='eBodyContainer']//div[@row-id='" + RowId1
							+ "']//div[@col-id='Billable']"));
			clickElement(Billable);
			clickElement(Billable);

			for (WebElement element : addLbs_DropDn) {
				if (element.getText().equals(billable)) {
					clickElement(element);
					break;
				}

			}

			for (int k = 1; k < 3; k++) {
				action.sendKeys(Keys.ARROW_RIGHT).perform();
			}
			WebElement Phase = getDriver().findElement(By.xpath(
					"//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='DealPhase']/span"));
			// 1st click causes T to be selected.
			clickElement(Phase);
			// 2nd click will enable select dropdown xpath
			clickElement(Phase);
			for (WebElement element : addLbs_DropDn) {
				if (element.getText().equals(phase)) {
					clickElement(element);
					break;
				}

			}

			WebElement Method = getDriver().findElement(
					By.xpath("//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='PmoMethod']"));
			clickElement(Method);
			clickElement(Method);
			for (WebElement element : addLbs_DropDn) {
				if (element.getText().equals(method)) {
					clickElement(element);
					break;
				}

			}
			WebElement careerLevel = getDriver().findElement(By
					.xpath("//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='CareerLevel']"));
			clickElement(careerLevel);
			clickElement(careerLevel);

			for (WebElement element : addLbs_DropDn) {
				if (element.getText().equals(level)) {
					clickElement(element);
					logInfo("Career level is selected");
					break;
				}

			}

			WebElement BillCode = getDriver().findElement(
					By.xpath("//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='Billcode']"));
			String bill = BillCode.getAttribute("title");
			int len = bill.length();
			if (len != 0) {
				logInfo("Bill code is selected defaultly");
			} else {
				clickElement(BillCode);
				clickElement(BillCode);
				for (WebElement element : addLbs_DropDn) {
					if (element.getText().equals(billCode)) {
						clickElement(element);
						logInfo("Bill code is selected");
						break;
					}

				}
			}

			for (int k = 1; k < 8; k++) {
				action.sendKeys(Keys.ARROW_LEFT).perform();
			}
			WebElement lbsGrid_checkBox = getDriver()
					.findElement(By.xpath("//*[@id='LBSGrid']//div[@ref='eBodyContainer']//div[@row-id='" + RowId1
							+ "']//span[@ref='eCellWrapper']//span[@class='ag-icon ag-icon-checkbox-unchecked']"));
			clickElement(lbsGrid_checkBox);

			// add skill Inventory method
			addSkill(ConstantUtils.FilePath_Staffing, "StaffingLbs", 5, 8); // for adding skills

			clickElement(staffing);
			WebElement phaseIndicator = getDriver().findElement(By.xpath(
					"//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='SdCoreRumFlag']"));
			clickElement(phaseIndicator);
			for (int k1 = 1; k1 < 18; k1++) {
				action.sendKeys(Keys.ARROW_RIGHT).perform();
			}

			clickElement(rippleBtn);
			WebElement Month1 = getDriver().findElement(
					By.xpath("//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='M1']"));
			action.click(Month1).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
					.sendKeys(M1).sendKeys(Keys.ENTER).build().perform();
			WebElement Month2 = getDriver().findElement(
					By.xpath("//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='M2']"));
			clickElement(Month2);
			WebElement peekFTE = getDriver().findElement(
					By.xpath("//div[@ref='eBodyContainer']//div[@row-id='" + RowId1 + "']//div[@col-id='PeakFTE'] "));
			clickElement(peekFTE);
			for (int k1 = 1; k1 < 18; k1++) {
				action.sendKeys(Keys.ARROW_LEFT).perform();
			}
			clickElement(saveBtn);
			String LBS_SuccessMsg = Lbs_saveMsg.getAttribute("title");
			if (LBS_SuccessMsg.equals(
					"LBS Records Saved Successfully. Based on the updated FTEs, please update the configured Resource Based cost accordingly.\r\n"
							+ "")) {
				logPass(LBS_SuccessMsg);
				scenarioFlag = true;
			}
			break;

		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	public void addSkill(String FilePath, String SheetName, int Row, int Col) throws Exception

	{
		boolean scenarioFlag = true;
		for (int i = Row; i < i + 1; i++) {
			String text = "";
			try {
				text = SetExcelPath(FilePath, SheetName, i, Col);
			} catch (Exception e) {
				text = "";
			}
			if (text.equals("null") || text.equals(null) || text.equals("")) {
				break;
			}
			String applyInv = SetExcelPath(FilePath, SheetName, i, Col);
			String applyCap = SetExcelPath(FilePath, SheetName, i, Col + 1);
			String applySpec = SetExcelPath(FilePath, SheetName, i, Col + 2);
			String applySkill = SetExcelPath(FilePath, SheetName, i, Col + 3);

			waitForElementToBeVisible(applySkilltab);
			clickElement(applySkilltab);
			waitForElementToAppear(skillInventoryIcon);
			clickElement(skillInventoryIcon);

			if (isDisplayed(applySkillPop)) {
				scenarioFlag = true;
			}

			clickElement(applyInventory);
			for (WebElement element : Inventory_dropDn) {
				if ((element.getAttribute("id").trim()).equals(applyInv)) {
					clickElement(element);
					break;
				}

			}

			clickElement(applycapabiity);
			for (WebElement element : Capability_dropDn) {
				if ((element.getAttribute("id").trim()).equals(applyCap)) {
					clickElement(element);
					break;
				}

			}

			clickElement(applySpeciality);
			for (WebElement element : Speciality_dropDn) {
				if ((element.getAttribute("id").trim()).equals(applySpec)) {
					clickElement(element);
					break;
				}

			}

			clickElement(applySkills);
			for (WebElement element : Skill_dropDn) {
				if ((element.getAttribute("id").trim()).equals(applySkill)) {
					clickElement(element);
					break;
				}

			}

			clickElement(addapplybtn);
			break;
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_77 : Validate if the SA is able to add Skill Inventory on
	 *           staffing screen.
	 * @date - 04/03/2024
	 * @release March 16
	 * 
	 */
	public void addSkillInventory(String FilePath, String SheetName, int Row, int Col) throws Exception {
		boolean scenarioFlag = true;
		for (int i = Row; i < i + 1; i++) {
			String text = "";
			try {
				text = SetExcelPath(FilePath, SheetName, i, 0);
			} catch (Exception e) {
				text = "";
			}
			if (text.equals("null") || text.equals(null) || text.equals("")) {
				break;
			}
			String inventory = SetExcelPath(FilePath, SheetName, i, Col);
			String capability = SetExcelPath(FilePath, SheetName, i, Col + 1);
			String speciality1 = SetExcelPath(FilePath, SheetName, i, Col + 2);
			String skills = SetExcelPath(FilePath, SheetName, i, Col + 3);

			waitForElementToBeVisible(skillInverntoryTab);
			clickElement(skillInverntoryTab);
			app_loader(getDriver().findElement(By.id("ng-loaderimgP")));
			
			try {
				clickElement(skillInverntoryTab);
			}
			catch(Exception e) {}
			
			waitForElementToBeVisible(selectInventory);
			clickElement(selectInventory);

			for (WebElement element : selectInventory_dropDn) {
				if (element.getText().equalsIgnoreCase(inventory)) {
					clickElement(element);
					break;
				}

			}
			clickElement(capability1);
			for (WebElement element : capabilitydropDn) {
				if (element.getText().equalsIgnoreCase(capability)) {
					clickElement(element);
					break;
				}

			}
			clickElement(speciality);
			if (selectText_1.getText().equalsIgnoreCase("Select")) {
				for (WebElement element : specialitydropDn) {
					if (element.getText().equalsIgnoreCase(speciality1)) {
						clickElement(element);
						break;
					}

				}

			}
			clickElement(skill);
			if (selectText_2.getText().equalsIgnoreCase("Select")) {
				for (WebElement element : skilldropDn) {
					if (element.getText().equalsIgnoreCase(skills)) {
						clickElement(element);
						break;
					}

				}

			}
			clickElement(addBtn);
			/*
			 * if (isDisplayed(popMsg)) { String pop_msg = popMsg.getAttribute("title");
			 * logPass(pop_msg);
			 * 
			 * }
			 */
			clickElement(staffing_saveBtn);
			jse.executeScript("window.scrollBy(0, -400)", "");
			if (isDisplayed(popMsg)) {
				String pop_msg = popMsg.getAttribute("title");
				logInfo(pop_msg);
				String msg = save_popMsg.getAttribute("title");
				if (msg.equalsIgnoreCase("All Capability Speciality Skill combinations are added.")) {
					scenarioFlag = true;
					break;
				}
			}
			break;
		}
		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}

	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_78 : Validate if the SA is able to Export/Import Staffing File
	 *           and see the status in Export/Import Status tab. - TC_80 : Validate
	 *           if SA is able to see make the changes in exported excel and on
	 *           import, the same changes should reflect on UI.
	 * @date - 06/03/2024
	 * @release March 16
	 * 
	 */
	public String Staffing_ExportFile() throws Exception {
		boolean scenarioFlag = true;
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		Navigate_to_subTab(GlobalScreen.SUBTAB_STAFFING_PYRAMID);
		clickElement(exportIcon);
		// addPaddedWait(5);
		// waitForElementToBeVisible(ImportExportTab);
		// clickElement(ImportExportTab);
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(completedStaus, "Completed"));
			logPass("The Staffing ADL Export status has successfully changed to Completed");
			scenarioFlag = true;
		} catch (Exception e) {
			logFail("The Staffing ADL Export status has not changed to Completed");
		}

		String FileName = fileName.getAttribute("title");
		// logInfo(FileName);
		waitForElementToBeVisible(downloadIcon);
		clickElement(downloadIcon);

		waitForElementToAppear(confidential_pop);
		waitForElementToBeVisible(confidential_pop);
		if (isDisplayed(confidential_pop)) {
			clickElement(understandBtn);
			logPass("Exported ADL Staffing file is downloaded successfully in Downloads folder");
		}
		return FileName;
	}

	public void Staffing_ImportFile(String FileName) throws Exception {
		boolean scenarioFlag = true;
		 String FilePath = ConstantUtils.DownloadedFiles_FilePath.concat(FileName) ;
		//String FilePath = "C:\\Users\\dhanunjay.boya.DIR\\Downloads\\".concat(FileName);
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		Navigate_to_subTab(GlobalScreen.SUBTAB_STAFFING_PYRAMID);
		clickElement(importIcon);
		// logInfo("Import click");
		// logInfo("File PAth :" + FilePath);
		waitForElementToAppear(clickBrowser);
		sendKeys(clickBrowser, FilePath);
		clickElement(clickBrowserOk);
		try {

			waitForElementToBeVisible(completedStatusForImport);
			wait.until(ExpectedConditions.textToBePresentInElement(completedStatusForImport, "Completed"));
			logPass("The Staffing ADL Import status has successfully changed to Completed");
			scenarioFlag = true;
		} catch (Exception e) {
			logFail("The Staffing ADL Import status has not changed to Completed");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();
		}
	}

	/**
	 * @author dhanunjay.boya
	 * @scenario - TC_79 : Validate if SA is able to input Baseline Effort for
	 *           Client Estimated Hours and Accenture Estimated Hours and save the
	 *           screen.
	 * @date - 01/03/2024
	 * @release March 16
	 * 
	 */

	public void baseLineEffortTab(String clientValue) throws Exception {
		boolean scenarioFlag = true;

		Navigate_to_subTab(GlobalScreen.SUBTAB_STAFFING_BASELINEEFFORT);
		waitForElementToBeVisible(typeOfEstimation);
		clickElement(typeOfEstimation);
		for (int i = 0; i < typeofEstimation_dropDn.size(); i++) {

			if (getText(typeofEstimation_dropDn.get(i)).equals("Client Baseline Hours")) {
				waitForElementToBeVisible(clientHours);
				clickElement(clientHours);
//				action.click(baseLineEffort).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
//						.sendKeys(Keys.BACK_SPACE).sendKeys(clientValue).build().perform();
				waitForElementClickable(baseLineEffort);
				baseLineEffort.clear();
				sendKeys(baseLineEffort, clientValue);
				clickElement(typeOfEstimation);
			} else if (getText(typeofEstimation_dropDn.get(i)).equals("Accenture Estimated Hours")) {
				waitForElementToBeVisible(accentureHours);
				clickElement(accentureHours);
				waitForElementToBeVisible(baseEffort);
				String baseEffort_Year_1 = baseEffort.getAttribute("title");
				if (baseEffort_Year_1.equals("1")) {
//					action.click(baseLineEffort).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
//							.sendKeys(Keys.BACK_SPACE).sendKeys("2").build().perform();
					waitForElementClickable(baseLineEffort);
					baseLineEffort.clear();
					sendKeys(baseLineEffort, "2");
					
					waitForElementToBeVisible(baseEffort);
					String baseEffort_Year = baseEffort.getAttribute("title");
					logInfo("Accenture Estimated Hours :" + baseEffort_Year);
				} else {
					logInfo("Accenture Estimated Hours :" + baseEffort_Year_1);
					clickElement(typeOfEstimation);
				}
			}
		}

		clickElement(save_BaseEffort);
		String text_msg = baseLine_successMsg.getAttribute("title");
		if (text_msg.equals("Baseline Efforts saved successfully")) {
			logPass("Baseline Efforts saved successfully");
		} else {
			logFail("Baseline Efforts not saved ");
			scenarioFlag = false;
		}
		if (scenarioFlag == true) {
			scenarioPass();
		}

	}
}
