package pageObjects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.ConstantUtils;
import reusableComponents.ExcelUtilities;
import reusableComponents.GlobalScreen;

public class DefineTeam_Page extends BasePage {
	public Actions action = new Actions(getDriver());

	@FindBy(how = How.XPATH, using = "//a[text()='Manage']")
	public WebElement ManageBtn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Total Opportunities ')]/../../..")
	public WebElement opportunitytile;

	@FindBy(how = How.XPATH, using = "//*[text()=' Total Opportunities ']")
	public WebElement Total_opportunitieslink;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement search_filter;

	@FindBy(how = How.XPATH, using = "//a[text()='Define Team']")
	public WebElement DefineTeamTile;

	@FindBy(how = How.XPATH, using = "(//*[@class='mat-card-content'])[1]//a")
	public List<WebElement> DefineTeamTileLinks;

	@FindBy(how = How.XPATH, using = "//a[text()='Deal Team']/..")
	public WebElement DealTeamTab;

	@FindBy(how = How.XPATH, using = "//*[@id='StakeHolderGrid']")
	public WebElement DealTeamGrid;

	@FindBy(how = How.XPATH, using = "//*[@id='StakeHolderGrid']//span[@ref='eText']")
	public List<WebElement> DefineTeamGridHeaders;

	@FindBy(how = How.XPATH, using = "//p[@id='addrole']//img[@alt='role']")
	public WebElement AddRoleIcon;

	@FindBy(how = How.XPATH, using = "//p[@id='addrole']//strong[text()=' Add Role']")
	public WebElement AddRole;

	@FindBy(how = How.XPATH, using = "//div[@id='btnmvparamtab']//b")
	public WebElement InfoMsg;

	@FindBy(how = How.XPATH, using = "//a[text()='SME Request Charters ']/..")
	public WebElement SMERequestChartersTab;

	@FindBy(how = How.XPATH, using = "//div[@id='accordion1']")
	public WebElement SMERequestChartersGrid;

	@FindBy(how = How.XPATH, using = "//a[text()='Deal Team']")
	public WebElement DealTeam;

	@FindBy(how = How.XPATH, using = "(//div[@role='gridcell' and @col-id='RoleName'])[1]")
	public WebElement AddRoleName;

	@FindBy(how = How.XPATH, using = "(//div[@role='gridcell' and @col-id='RoleName'])[1]/..")
	public WebElement AddRoleNameRow;

	@FindBy(how = How.XPATH, using = "(//div[@role='gridcell' and @col-id='RoleName'])[1]//select[@id='drpDwon']")
	public WebElement AddRoleNameDropDown;

	@FindBy(how = How.XPATH, using = "((//div[@role='gridcell' and @col-id='RoleName'])[1]//select[@id='drpDwon']//option)[2]")
	public WebElement AddRoleNameDropDownValue;

	@FindBy(how = How.XPATH, using = "//button[@id='CancelBtn']")
	public WebElement CancelButton;

	@FindBy(how = How.XPATH, using = "//*[text()='Opportunity Workflow']")
	public WebElement OpportunityWorkflow;

	@FindBy(how = How.XPATH, using = "//a[text()='Define Team']")
	public WebElement DefineTeam;

	@FindBy(how = How.XPATH, using = "//div[@col-id='RoleName']")
	public WebElement rolename;

	@FindBy(how = How.XPATH, using = "//div[@id='divTypeHead']//input")
	public WebElement ResourcesEIDfield;

	@FindBy(how = How.XPATH, using = "(//button[@id='SaveBtn']//em)[1]")
	public WebElement Savebutton;

	@FindBy(how = How.XPATH, using = "//a[text()='Define Team']/..//img[@class='imageresize']")
	public WebElement DefineTeamInfoIcon;

	@FindBy(how = How.XPATH, using = "//div[@id='emailcheck-popup']//h4")
	public WebElement EmailNotifyPopup;

	@FindBy(how = How.XPATH, using = "//div[@id='emailcheck-popup']//button[@id='NoBtn']")
	public WebElement EmailNotifyPopupNo;

	@FindBy(how = How.XPATH, using = "//div[@id='emailcheck-popup']//button[@id='YesBtn']")
	public WebElement EmailNotifyPopupYes;

	@FindBy(how = How.XPATH, using = "//button[@id='BtnEmailConfigurePopup']/..//h4")
	public WebElement ConfigureRolesPopup;

	@FindBy(how = How.XPATH, using = "//div[@id='email-popup']//input[@type='checkbox']")
	public List<WebElement> ConfigureRoles;

	@FindBy(how = How.XPATH, using = "//button[@id='SaveAndSendEmail']")
	public WebElement SaveandSendEmail;

	@FindBy(how = How.XPATH, using = "//p[@id='MsgId']//span")
	public WebElement SuccessMsg;
	
	@FindBy(how = How.XPATH, using = "//span[@id='SuccessErrorMsgId']")
	public WebElement PMOSuccessMsg;

	@FindBy(how = How.XPATH, using = "//div[@col-id='RoleName' and @role='gridcell']")
	public List<WebElement> DefineTeamGrid;

	//

	@FindBy(how = How.XPATH, using = "//a[text()='Opportunity Workflow']")
	public WebElement OppWorkflowLink;

	@FindBy(how = How.XPATH, using = "//*[text()='Mobilisation SME']/parent::div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']")
	public WebElement defineTeam_MobilisationResource;

	@FindBy(how = How.XPATH, using = "//*[text()='CDAT SME']/parent::div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']")
	public WebElement defineTeam_Resource;

	@FindBy(how = How.XPATH, using = "//*[text()='Industry Lead']/parent::div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']")
	public WebElement defineTeam_IndustryResource;

	@FindBy(how = How.XPATH, using = "//*[text()='PCAT SME Lead']/parent::div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']")
	public WebElement defineTeam_PCATResource;

	@FindBy(how = How.XPATH, using = "//div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']//input[@type='text']")
	public WebElement solutionTeam_ResourcesSelect;

	@FindBy(how = How.XPATH, using = "//p[@id='addrole']")
	public WebElement addrole;

	@FindBy(how = How.XPATH, using = ".//*[@id='SaveBtn']")
	public WebElement ConfigSolTeam_SaveBtn;

	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']")
	public WebElement roledropname;

	@FindBy(how = How.XPATH, using = "(//*[@id='StakeHolderGrid']//div[@col-id='RoleName'])[2]")
	public WebElement clicktab;

	@FindBy(how = How.XPATH, using = "//*[@id='NoBtn']//em[text()='No']")
	public WebElement SelectNo;

	@FindBy(how = How.XPATH, using = "//*[@col-id='ActionField']//span/img[@title='Request SME']")
	public WebElement Request_Icon;

	@FindBy(how = How.XPATH, using = "//*[@col-id='ActionField']//span/img[@title='Delete']")
	public WebElement Delete_Icon;

	@FindBy(how = How.XPATH, using = "//*[@id='charterTab']")
	public WebElement Sme_Tab;

	@FindBy(how = How.XPATH, using = "//ul[@role='tablist']//li")
	public List<WebElement> Tablist;

	@FindBy(how = How.XPATH, using = "//div[@id='accordion1' and @role='tablist']//h4")
	public List<WebElement> Sme_Tablist;

	@FindBy(how = How.XPATH, using = "//*[@id='headingFour']")
	public WebElement Mobilization_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='headingFive']")
	public WebElement Industry_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='headingSeven']")
	public WebElement PCAT_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='mobilizationExpectedDate']")
	public WebElement MobilizationExpected_Date;

	@FindBy(how = How.XPATH, using = "//*[@id='mobilizationProposed']")
	public WebElement Mobilization_Proposed;

	@FindBy(how = How.XPATH, using = "//*[@id='mobilizationFTE']")
	public WebElement MobilizationFTE;

	@FindBy(how = How.XPATH, using = "//*[@id='ClientCaptiveId']")
	public WebElement ClientCaptiveId;

	@FindBy(how = How.XPATH, using = "//*[@id='mobilizationOnshoreSlider']")
	public WebElement MobilizationOnshore_Slider;

	@FindBy(how = How.XPATH, using = "//*[@id='isPeopleTransferId']//..")
	public WebElement PeopleTransfer_Id;

	@FindBy(how = How.XPATH, using = "//*[@id='mobilizationOffshoreSlider']")
	public WebElement MobilizationOffshore_Slider;

	@FindBy(how = How.XPATH, using = "//*[@id='IFSStatustrackId']")
	public WebElement IFSStatustrackId_DrpDwn;

	@FindBy(how = How.XPATH, using = "//span[text()='Mobilisation SME']")
	public WebElement MobilisationSME;

	@FindBy(how = How.XPATH, using = "//span[text()='Industry Lead']")
	public WebElement Industry_Lead;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Mobilization SME is assigned')]")
	public WebElement Mobilization_Sme;

	@FindBy(how = How.XPATH, using = "(//div[@id='collapseFour']//p)[1]")
	public WebElement MobilSme_Message;

	@FindBy(how = How.XPATH, using = "//a[@id='ActiveTab']")
	public WebElement Deal_Team;

	@FindBy(how = How.XPATH, using = "//*[@id='StakeHolderGrid']")
	public WebElement Scroll_Bottom;

	@FindBy(how = How.XPATH, using = "//*[@id='slaAssessmentstatusId']")
	public WebElement laAssessmentstatus_Id;

	@FindBy(how = How.XPATH, using = "//*[@id='pcatAssessmentDataId']")
	public WebElement pcatAssessmentData_Id;

	@FindBy(how = How.XPATH, using = "(//*[@id='ddlAnyKeyRequiements']//span)[1]")
	public WebElement DdlAnyKeyRequiements;

	@FindBy(how = How.XPATH, using = "//*[@id='PCATAddDetailsId']")
	public WebElement PCATAddDetailsId;

	@FindBy(how = How.XPATH, using = "//*[@id='drpPCATStakeholders']")
	public WebElement PCATStakeholder;

	@FindBy(how = How.XPATH, using = "//*[@id='PCATSMECommentsText']")
	public WebElement PCATSMECommentsText;

	@FindBy(how = How.XPATH, using = "//*[@id='IsSlaDocuments']//..")
	public WebElement IsSlaDocuments_Toggle;

	@FindBy(how = How.XPATH, using = "//*[@id='IsPcatEgble']//..")
	public WebElement IsPcatEgble_Toggle;

	@FindBy(how = How.XPATH, using = "//*[@id='divSLAStatusComments']")
	public WebElement NonStandardSLAComments;

	@FindBy(how = How.XPATH, using = "//*[@id='headingSeven']/h4/span/img")
	public WebElement PCATInfo_icon;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'PCAT documents')]")
	public WebElement PCAT_Message;

	@FindBy(how = How.XPATH, using = "//span[text()='PCAT SME Lead']")
	public WebElement PCAT_Deal;

	@FindBy(how = How.XPATH, using = "//*[@id='PCATSMEAddInfoId']")
	public WebElement PCAT_PMOLimit;

	@FindBy(how = How.XPATH, using = "//span[@id='SLAComments']")
	public WebElement SLA_CommentLimit;

	@FindBy(how = How.XPATH, using = "//*[text()='CDAT SME']/parent::div[@col-id='RoleName']/following-sibling::div[@col-id='RequestStatus']//span/span")
	public WebElement CDAT_RequestStatus;

	@FindBy(how = How.XPATH, using = "//*[text()='CDAT SME']")
	public WebElement CDAT_SME;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divNotesForPCATPmo']")
	public WebElement PCAT_PMO;
	
	@FindBy(how = How.XPATH, using = "//div[@id='sp-charter']//button[@id='SaveBtn']//em")
	public WebElement PMO_Save;
	
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> RoleDropdown;
	
	@FindBy(how = How.XPATH, using = "//button[@id='NavUnauthorizedpopupIdCancel']//span")
	public WebElement OperationCancel;
	
	

	/************************** METHODS *****************************/
   
	
	/**
	 * TC:1 Validate user is able to see Define team tile in Opportunity workflow
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */
	
	public void ValidationDefineTeam(String MMSID) throws Exception {
		boolean scenarioFlag = true;
		String Info = "Allows Solution Architect to align required Stakeholders for the Opportunity.";
		waitForElementToAppear(ManageBtn);
		clickElement(ManageBtn);
		waitForElementToBeVisible(opportunitytile);
		loader();
		clickElement(Total_opportunitieslink);
		waitForElementToBeVisible(search_filter);
		sendKeys(search_filter, MMSID);
		clickElement(getDriver().findElement(By.xpath("//div[@class='MMSID']//div[contains(text(),'" + MMSID + "')]")));
		
		waitForElementToAppear(DefineTeamTile);
		if (DefineTeamTileLinks.size() == 2) {
			if (DefineTeamInfoIcon.getAttribute("title").equals(Info)) {
				logPass("On Hovering Info icon the message is displayed");
				String Link1 = getText(DefineTeamTileLinks.get(0)).trim();
				String Link2 = getText(DefineTeamTileLinks.get(1)).trim();
				
				loader();
				if (Link1.equals("Deal Team") && Link2.equals("SME Request Charters")) {
					action.moveToElement(DefineTeamTileLinks.get(0)).perform();
					String colour1 = DefineTeamTileLinks.get(0).getCssValue("color");

					action.moveToElement(DefineTeamTileLinks.get(1)).perform();
					String colour2 = DefineTeamTileLinks.get(1).getCssValue("color");

					if (colour1.equals("rgba(161, 0, 255, 1)") && colour2.equals("rgba(161, 0, 255, 1)")) {
						logPass("On hovering the links it is changing to purple colour.");

						clickElement(DefineTeamTileLinks.get(0));
						waitForElementToBeVisible(DealTeamGrid);
						if (DealTeamTab.getAttribute("class").equals("active") && isDisplayed(DealTeamGrid)) {
							logPass("Deal Team Tab opened");
						} else {
							logFail("Error opening Deal Team Tab");
							scenarioFlag = false;
						}
						clickElement(SMERequestChartersTab);
						waitForElementToBeVisible(SMERequestChartersGrid);
						if (SMERequestChartersTab.getAttribute("class").equals("active")
								&& isDisplayed(SMERequestChartersGrid)) {
							logPass("SME Request Charters tab is opened");
						} else {
							logFail("Error opening SME Request Charters Tab");
							scenarioFlag = false;
						}
					}

					else {
						logFail("On hovering the links it is not changing to purple colour.");
						scenarioFlag = false;
					}

				} else {
					logFail("Error in Define Team Tile Hyperlinks");
					scenarioFlag = false;
				}
			} else {
				logFail("On Hovering Info icon the message is not displayed");
				scenarioFlag = false;
			}
		}

		else {
			logFail("Define Team Tile Hyperlinks count is not equal to 2");
			scenarioFlag = false;
		}

		if (scenarioFlag == true) {
			scenarioPass();
		}

	}
    
	
	/**
	 * TC:2 Validate user is navigated to Deal Team on click of Define Team tile
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */
	
	public void ValidationDealTeamTab() throws Exception {

		boolean scenarioFlag = true;
		
		String Infomsg = "SME Request Charter for the corresponding specific roles to be captured in order to raise a request";
		List<String> Headers = new ArrayList<>(Arrays.asList("Role Name", "Resources", "Request Status", "Actions"));
		
		if (isDisplayed(DealTeam)) {
			clickElement(DealTeam);
			waitForElementToBeVisible(DealTeamGrid);
			String Textcolour = DealTeam.getCssValue("color");
			String UnderlineColour = DealTeamTab.getCssValue("border-bottom");
			

			if (Textcolour.equals("rgba(161, 0, 255, 1)") && UnderlineColour.contains("rgb(161, 0, 255)")) {
				logPass("Define team tile is highligted in purple with purple underline below");
				if (isDisplayed(DealTeamGrid)) {
					for (int i = 0; i < DefineTeamGridHeaders.size(); i++) {
						String GridHead = getText(DefineTeamGridHeaders.get(i)).trim();
						if (!GridHead.equals(Headers.get(i))) {
							scenarioFlag = false;
							logFail(Headers.get(i) + " is not visible in DefineTeam Grid");
							break;
						}
					}
					if (scenarioFlag == true)
						logPass("Grid with all Headers are visible");

					if (isDisplayed(AddRoleIcon) && isDisplayed(AddRole))
						logPass("Add Role and Add Role Icon are visible");

					else {
						scenarioFlag = false;
						logFail("Add Role and Add Role Icon are not visible");
					}

					if (getText(InfoMsg).equals(Infomsg))
						logPass("Info Msg is visible in DefineTeam");

					else {
						scenarioFlag = false;
						logFail("Info Msg is not visible in DefineTeam");
					}
				} else {
					scenarioFlag = false;
					logFail("DealTeam Grid is not visible");
				}

			} else {
				scenarioFlag = false;
				logFail("Deal Team tab is not opened");
			}
		}
		if (scenarioFlag == true) {
			scenarioPass();
		}
	}
    
	/**
	 * TC:3 Validate user is able to Add roles from the role names dropdown
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */
	
	public void AddRole(String File, String sheet, int Row, int Column, String val, boolean scenario) throws Exception {
		boolean scenarioFlag = true;
		//getDriver().get("https://mysolutionplannernextgencoreparallel.accenture.com/MySP/Solutions/11879/806071/17/SolutionTeam");
		String RoleName = "";
		String EID = ExcelUtilities.SetExcelPath(File, sheet, 1, 1);

		
		if (val == "Mobilisation")
			RoleName = ExcelUtilities.SetExcelPath(File, sheet, 0, 2);
		else if (val == "Industry Lead")
			RoleName = ExcelUtilities.SetExcelPath(File, sheet, 0, 3);
		else if(val == "PCAT SME Lead")
			RoleName = ExcelUtilities.SetExcelPath(File, sheet, 0, 4);
		
		else if(val == "First"){
			if(isDisplayed(OperationCancel)) {
				clickElement(OperationCancel);
			}
		clickElement(AddRoleIcon);
		clickElement(AddRoleName);
		clickElement(AddRoleNameDropDown);
		for(int i=1;i<RoleDropdown.size();i++) {
			RoleName = getText(RoleDropdown.get(i));
			clickElement(RoleDropdown.get(i));
			try{
			    clickElement(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources' and not(contains(@class,'mock-disabled'))]")));
			    
			    clickElement(ResourcesEIDfield);
				if (isDisplayed(ResourcesEIDfield)) {
					logPass("Role got added in Role name column and Resource column got Enabled");
					writeDataToExcel(File, sheet, 0, 1, RoleName);
					sendKeys(ResourcesEIDfield, EID);
					waitForElementToBeVisible(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources']//div[text()='" + EID + "']")));
					jsClick(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources']//div[text()='" + EID + "']")));
					WebElement selectedResource = getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@title='" + EID + "']"));
					if (isDisplayed(selectedResource) && isDisplayed(Savebutton)) {
						logPass("EID is added for paticular role and able to click on save button");
						clickElement(Savebutton);
						break;
					} else {
						scenarioFlag = false;
						logFail("EID is not added for paticular role and not able to click on save button");
					}

				} else {
					scenarioFlag = false;
					logFail("Role is not added in Role name column and Resource column not Enabled");
				}
			   }
			 catch(Exception e){
				 
				 clickElement(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']")));
				 clickElement(getDriver().findElement(By.xpath("//select[@id='drpDwon']")));
			     continue;
			 }
 			
		}
		
		
		}
		else {
			RoleName = ExcelUtilities.SetExcelPath(File, sheet, 0, 1);
		}
		if(!(val.equals("First"))) {
			if(isDisplayed(OperationCancel)) { 
				clickElement(OperationCancel);
			}
		clickElement(AddRoleIcon);
		clickElement(AddRoleName);
		clickElement(AddRoleNameDropDown);
		
		clickElement(getDriver().findElement(By.xpath("//option[text()='" + RoleName + "']")));
		clickElement(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources']")));
		clickElement(ResourcesEIDfield);
		if (isDisplayed(ResourcesEIDfield)) {
			logPass("Role got added in Role name column and Resource column got Enabled");
			sendKeys(ResourcesEIDfield, EID);
			waitForElementToBeVisible(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources']//div[text()='" + EID + "']")));
			jsClick(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources']//div[text()='" + EID + "']")));
			WebElement selectedResource = getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@title='" + EID + "']"));
			if (isDisplayed(selectedResource) && isDisplayed(Savebutton)) {
				logPass("EID is added for paticular role and able to click on save button");
				clickElement(Savebutton);
				
			} else {
				scenarioFlag = false;
				logFail("EID is not added for paticular role and not able to click on save button");
			}

		} else {
			scenarioFlag = false;
			logFail("Role is not added in Role name column and Resource column not Enabled");
		}
		
		}
		

		if (scenarioFlag == true && scenario) {
			scenarioPass();
		}

	}
    
	/**
	 * TC:4 Validate user is able to see pop up opened when try to click on save button
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */
	
	public void EmailNotification(String File, String sheet, int Row, int Column) throws Exception {
		boolean scenarioFlag = true;
		

		String Role = ExcelUtilities.SetExcelPath(File, sheet, 0, 1);
		String EID = ExcelUtilities.SetExcelPath(File, sheet, 1, 1);

		if (isDisplayed(EmailNotifyPopup)) {
			logPass("Email Notification to StakeHolders pop up opened when clicking on save button");
			clickElement(EmailNotifyPopupNo);
			waitForElementToBeVisible(SuccessMsg);
			String MsgNo = SuccessMsg.getAttribute("title").trim();
			
			loader();
			waitForElementToBeVisible(getDriver().findElement(By.xpath("//span[text()='" + Role + "']")));
			WebElement role = getDriver().findElement(By.xpath("//span[text()='" + Role + "']"));
			String Eid = getDriver().findElement(By.xpath("//span[text()='" + Role + "']/../..//div[@col-id='Resources']")).getAttribute("title").trim();
			if (MsgNo.equals("Records Submitted Successfully.") && isDisplayed(role) && Eid.equals(EID))
				logPass("Role got added to the given EID when selecting No in Email Notification to StakeHolders and successful message appeared.");
			else {
				scenarioFlag = false;
				logFail("Role is not added to the given EID when selecting No in Email Notification to StakeHolders.");
			}
			getDriver().findElement(By.xpath("//span[text()='" + Role + "']/../..//div[@col-id='ActionField']//img[@title='Delete']")).click();
			getDriver().switchTo().alert().accept();

			loader();
			waitForElementToBeVisible(DealTeamGrid);

			refreshScreen();
			loader();
			AddRole(ConstantUtils.FilePath_DefineTeam, "DealTab", 0, 0, Role, false);

			clickElement(EmailNotifyPopupYes);
			for (int i = 0; i < ConfigureRoles.size(); i++) {
				String val = ConfigureRoles.get(i).getAttribute("value").trim();
				if (val.equals("false")) {
					clickElement(ConfigureRoles.get(i));
					break;
				}
			}
			clickElement(SaveandSendEmail);
			waitForElementToBeVisible(SuccessMsg);

			String MsgYes = SuccessMsg.getAttribute("title").trim();
			
			loader();
			waitForElementToBeVisible(getDriver().findElement(By.xpath("//span[text()='" + Role + "']")));
			WebElement role1 = getDriver().findElement(By.xpath("//span[text()='" + Role + "']"));
			String Eid1 = getDriver().findElement(By.xpath("//span[text()='" + Role + "']/../..//div[@col-id='Resources']")).getAttribute("title").trim();

			if (MsgYes.equals("Stakeholders are assigned successfully and email sent to Stakeholders") && isDisplayed(role1) && Eid1.equals(EID))
				logPass("Configure Roles for Email Notification pop up opened on click of Yes and able to select any required roles and role is saved and successful message appeared.");
			else {
				scenarioFlag = false;
				logFail("Role is not saved on clicking of Yes in Email Notification pop up");
			}

			getDriver().findElement(By.xpath("//span[text()='" + Role + "']/../..//div[@col-id='ActionField']//img[@title='Delete']")).click();
			getDriver().switchTo().alert().accept();
			waitForElementToBeVisible(AddRoleIcon);

		} else {
			scenarioFlag = false;
			logFail("Email Notification to StakeHolders pop up not opened when clicking on save button");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		}
	}
	
	/**
	 * TC:5 Validate user is able to see cancel button next to save button
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author kamali.a.babu
	 * 
	 */
	
	
	public void CancelButton(String File, String sheet, int Row, int Column) throws Exception {
		boolean scenarioFlag = true;

		String RoleName = ExcelUtilities.SetExcelPath(File, sheet, 0, 1);;
		String EID = ExcelUtilities.SetExcelPath(File, sheet, 1, 1);
		loader();
		waitForElementToBeVisible(DealTeamGrid);
		
		
		clickElement(AddRoleIcon);
		clickElement(AddRoleName);
		clickElement(AddRoleNameDropDown);
		clickElement(getDriver().findElement(By.xpath("//option[text()='" + RoleName + "']")));
		clickElement(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources']")));
	    clickElement(ResourcesEIDfield);
		sendKeys(ResourcesEIDfield, EID);
		waitForElementToBeVisible(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources']//div[text()='" + EID + "']")));
		clickElement(getDriver().findElement(By.xpath("//span[text()='" + RoleName + "']/../..//div[@col-id='Resources']//div[text()='" + EID + "']")));
		int NoofRow1 = DefineTeamGrid.size();
		clickElement(CancelButton);

		//waitForElementToBeVisible(SuccessMsg);
		//String ResetMsg = SuccessMsg.getAttribute("title").trim();
		// logPass(ResetMsg);
		loader();

		int NoofRow2 = DefineTeamGrid.size();
		if (NoofRow1 != NoofRow2)
			logPass("changes got removed on click on cancel button");

		else {
			scenarioFlag = false;
			logFail("changes are not removed on click on cancel button");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		}
	}

	/**
	 * TC:8 Validate user is navigated to SME Charters
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */
	

	public void SMETab() throws Exception {
		boolean scenarioFlag = true;
		refreshScreen();
		clickElement(OppWorkflowLink);
		waitForElementToBeVisible(DefineTeamTileLinks);

		action.moveToElement(DefineTeamTileLinks.get(1)).perform();
		String colour = DefineTeamTileLinks.get(1).getCssValue("color");

		if (colour.equals("rgba(161, 0, 255, 1)")) {
			logPass("SME Charters hyperlink highlight in purple on hovering.");

			clickElement(DefineTeamTileLinks.get(1));
			waitForElementToBeVisible(SMERequestChartersTab);
			clickElement(SMERequestChartersTab);
			waitForElementToBeVisible(SMERequestChartersGrid);
			if (SMERequestChartersTab.getAttribute("class").equals("active") && isDisplayed(SMERequestChartersGrid)) {
				logPass("SME Request Charters tab is opened when clicking on tab under Define team ");
				if (isDisplayed(Mobilization_Tab) && isDisplayed(Industry_Tab) && isDisplayed(PCAT_Tab))
					logPass("All 3 tabs are present under SME Charter");
				else {
					logFail("Tabs under SME Charter are not present");
					scenarioFlag = false;
				}
			} else {
				logFail("Error opening SME Request Charters Tab when clicking on tab under Define team ");
				scenarioFlag = false;
			}
		} else {
			logFail("SME Charters hyperlink are not highlighting in purple on hovering.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true) {
			scenarioPass();
		}
	}
    
	/**
	 * TC:9 Validate Mobilization SME Charter
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */
	
	public void MobilizationTab() throws Exception {
		boolean scenarioFlag = true;
		
        String expectedText = "If RUM or MoTE inputs are required from Mobilization SME, then this section is mandatory";

		clickElement(Deal_Team);
		waitForElementToBeVisible(DealTeamGrid);

		try {
			clickElement(MobilisationSME);
		} catch (Exception e) {
			logPass("There is no Mobilisation SME Role under Deal Tab");
			logPass("Adding Mobilisation SME Role under Deal Tab");

			AddRole(ConstantUtils.FilePath_DefineTeam, "DealTab", 0, 0, "Mobilisation", false);

			if (isDisplayed(EmailNotifyPopup)) {
				logPass("Email Notification to StakeHolders pop up opened when clicking on save button");
				clickElement(EmailNotifyPopupNo);
				waitForElementToBeVisible(SuccessMsg);
				String MsgNo = SuccessMsg.getAttribute("title").trim();
				loader();
				clickElement(MobilisationSME);
				if (MsgNo.equals("Records Submitted Successfully.") && isDisplayed(MobilisationSME))
					logPass("Mobilisation SME Role got added to the given EID when selecting No in Email Notification to StakeHolders.");
				else {
					scenarioFlag = false;
					logFail("Mobilisation SME Role is not added to the given EID when selecting No in Email Notification to StakeHolders.");
				}
			}
		}
		if (scenarioFlag == true) {
			if (isDisplayed(MobilisationSME)) {
				clickElement(Sme_Tab);
				waitForElementToBeVisible(Mobilization_Sme);

				String mobileSme = getText(MobilSme_Message).trim();
				String mobilization_Sme = getText(Mobilization_Sme).trim();

				if (mobileSme.contains(expectedText)) {
					logPass("User can able to see Mobilzation tab with info message in right corner");
					if (mobilization_Sme.contains("Mobilization SME is assigned")) {
						logPass("The MMS ID got assigned for Mobilization SME and User can see Mobilization SME Assigned Message");
						if (isDisplayed(MobilizationExpected_Date) && isDisplayed(Mobilization_Proposed)
								&& isDisplayed(MobilizationFTE))
							logPass("User can able to see few fields Under Mobilization tab");

						else {
							logFail("User cannot able to see few fields Under Mobilization tab");
							scenarioFlag = false;
						}
					} else {
						scenarioFlag = false;
						logFail("The MMS ID got assigned for Mobilization SME but User cannot see Mobilization SME Assigned Message");
					}

				} else {
					scenarioFlag = false;
					logFail("User cannot able to see Mobilzation tab with info message in right corner");
				}
			}
		}

		if (scenarioFlag == true) {
			scenarioPass();
		}
	}
    
	/**
	 * TC:10 Validate Industry & Functions SME Charter
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */
	
	public void Industry_Tab() throws Exception {
		boolean scenarioFlag = true;
		getDriver().get("https://mysolutionplannernextgencore.ciostage.accenture.com/MySP/Solutions/14479/645168/17/SolutionTeam");
		
		clickElement(Deal_Team);
		waitForElementToBeVisible(DealTeamGrid);
		
		try {
			clickElement(Industry_Lead);
		}
		catch(Exception e) {
			logPass("There is no Industry Lead Role under Deal Tab");
			logPass("Adding Industry Lead Role under Deal Tab");
			
			AddRole(ConstantUtils.FilePath_DefineTeam, "DealTab", 0, 0, "Industry Lead", false);
			
			if(isDisplayed(EmailNotifyPopup)) {
				logPass("Email Notification to StakeHolders pop up opened when clicking on save button");
				clickElement(EmailNotifyPopupNo);
				waitForElementToBeVisible(SuccessMsg);
				String MsgNo = SuccessMsg.getAttribute("title").trim();
				loader();
				clickElement(Industry_Lead);
				if(MsgNo.equals("Records Submitted Successfully.") && isDisplayed(Industry_Lead)) 
					logPass("Industry Lead Role got added to the given EID when selecting No in Email Notification to StakeHolders.");
				else {
					scenarioFlag = false;
					logFail("Industry Lead Role is not added to the given EID when selecting No in Email Notification to StakeHolders.");
				}
		    }
		}
		if (scenarioFlag == true) {
			if (isDisplayed(Industry_Lead)) {
				clickElement(Sme_Tab);
				clickElement(Industry_Tab);
		        waitForElementToBeVisible(IFSStatustrackId_DrpDwn);
		       if (isDisplayed(IFSStatustrackId_DrpDwn)) {
			      logPass("Under Industry tab fields IFS Status DropDown is present");
		       }
		       else {
			      logFail("Under Industry tab fields IFS Status DropDown is not present");
			      scenarioFlag = false;
		       }
			}
		}
	
		if (scenarioFlag == true) {
			scenarioPass();
		}
		
	}
    
	
	/**
	 * TC:11 Validate PCAT Charter
	 * 
	 * @since 26/03/2024
	 * @release March 26
	 * @author riya.c.goyal
	 * 
	 */
	public void PCAT_Tab() throws Exception {
		boolean scenarioFlag = true;
		getDriver().get("https://mysolutionplannernextgencore.ciostage.accenture.com/MySP/Solutions/14479/645168/17/SolutionTeam");
		
		clickElement(Deal_Team);
		waitForElementToBeVisible(DealTeamGrid);
		
		try {
			clickElement(PCAT_Deal);
		}
		catch(Exception e) {
			logPass("There is no PCAT SME Lead Role under Deal Tab");
			logPass("Adding PCAT SME Lead Role under Deal Tab");
			
			AddRole(ConstantUtils.FilePath_DefineTeam, "DealTab", 0, 0, "PCAT SME Lead", false);
			
			if(isDisplayed(EmailNotifyPopup)) {
				logPass("Email Notification to StakeHolders pop up opened when clicking on save button");
				clickElement(EmailNotifyPopupNo);
				waitForElementToBeVisible(SuccessMsg);
				String MsgNo = SuccessMsg.getAttribute("title").trim();
				loader();
				clickElement(PCAT_Deal);
				if(MsgNo.equals("Records Submitted Successfully.") && isDisplayed(PCAT_Deal)) 
					logPass("PCAT SME Lead Role got added to the given EID when selecting No in Email Notification to StakeHolders.");
				else {
					scenarioFlag = false;
					logFail("PCAT SME Lead Role is not added to the given EID when selecting No in Email Notification to StakeHolders.");
				}
		    }
		}
		if(scenarioFlag == true) {
		    if(isDisplayed(PCAT_Deal)) {
			    clickElement(Sme_Tab);
			    clickElement(PCATInfo_icon);
			    
			    
			    String InfoMsg = "PCAT documents haven't been uploaded yet in documents screen";
		        String Comments = NonStandardSLAComments.getAttribute("title").trim();
		        //logPass(""+Comments.length());
		        action.moveToElement(PCATInfo_icon).perform();
		        
		         if(getText(PCAT_Message).trim().equals(InfoMsg)) {
			        logPass("User is able to see the Info Message");
		            if(isDisplayed(laAssessmentstatus_Id) && isDisplayed(pcatAssessmentData_Id) && isDisplayed(DdlAnyKeyRequiements) && isDisplayed(PCATAddDetailsId) && isDisplayed(PCATSMECommentsText) && isDisplayed(PCATStakeholder)&& isDisplayed(IsSlaDocuments_Toggle) &&  isDisplayed(IsPcatEgble_Toggle) && isDisplayed(NonStandardSLAComments)) {
		            	if((getText(SLA_CommentLimit).equals("2000 Characters left")  || (Comments.length() == 2000 && getText(SLA_CommentLimit).equals("0 Characters left")))  && getText(PCAT_PMOLimit).equals("2000 Characters left")) {
		            		logPass("All the fields under PCAT Charter is present");
		            		clickElement(PCATSMECommentsText);
		            		clear(PCATSMECommentsText);
		            		sendKeys(PCATSMECommentsText,"Test");
		            		clickElement(PMO_Save);
		            		waitForElementToBeVisible(PMOSuccessMsg);
		            		String SuccessMsg = PMOSuccessMsg.getAttribute("title"); 
		            		waitForElementToBeVisible(PCATSMECommentsText);
		            		String Text = PCAT_PMO.getAttribute("title");
		            		if(SuccessMsg.equals("Data Saved Successfully.") && Text.equals("Test"))
		            			logPass("PCAT SME Lead can edit and make changes under PCAT Charters tab");
		            		else {
		            			scenarioFlag = false;
						         logFail("PCAT SME Lead cannot edit and make changes under PCAT Charters tab");
		            		}
		            		
		    	        }
		    	         else {
		    		         scenarioFlag = false;
					         logFail("Error in Comments Limit");
		    	         }
		             }
		             else {
		    	         scenarioFlag = false;
					     logFail("All the fields are not present under PCAT Charter");
				     }
		          }
		          else {
			         scenarioFlag = false;
			         logFail("User is not able to see the Info Message");
		          }
		
		    }
		}
	     if (scenarioFlag == true) {
		     scenarioPass();
      	}

	
	
     }


	
}
