package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import reusableComponents.GlobalScreen;
import reusableComponents.ConstantUtils;
import reusableComponents.ExcelUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.io.IOException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;



public class  Costing_Page extends BasePage
{   public KDAReport_Page Kda;
	public Actions action = new Actions(getDriver());
	/************************** LOCATORS *****************************/
	
	@FindBy(how = How.ID, using = "costing")
	public WebElement costingTab;
	
	@FindBy(how = How.ID, using = "PmolinkId")
	public WebElement PMO_Tab;
	
	@FindBy(how = How.ID, using = "MotelinkId")
	public WebElement MOTELink;
	
	@FindBy(how = How.ID, using = "SclinkId")
	public WebElement SolutionCostLink;
	
	@FindBy(how = How.ID, using = "guidanceCostlinkId")
	public WebElement SolStdCostLink;
	
	@FindBy(how = How.ID, using = "otherCostlinkId")
	public WebElement OtherLink;
	
	@FindBy(how = How.ID, using = "importstab")
	public WebElement ExportImportsTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='PmoStaffingLoadTabId']/..//span")
	public WebElement PMO_StaffingLoadTab;
	
	@FindBy(how = How.XPATH, using = "//div[@title='Profile Name']/../div/span[@class = 'ag-header-select-all'][@role='presentation']")
	public WebElement Costing_PMO_selectAll_Checkboxs;
	
	@FindBy(how = How.XPATH, using = "//input[@id='PmoFTERipple']/../span")
	public WebElement CostingPMO_RippleButton;
	
	@FindBy(how = How.ID, using = "PmoFTERipple")
	public WebElement PmoFTERipple;
	
	@FindBy(how = How.XPATH, using = "//input[@id='TransitionAndSD']/../span")
	public WebElement SDandT;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@col-id,'M1')]//input")
	public List<WebElement> PMO_rows;
	
	@FindBy(how = How.XPATH, using = "//*[@id='PMOgridid']//div[contains(@class , 'ag-body-viewport ')][@role = 'presentation'][@ref]")
	public WebElement Costing_PMO_grid;
	
	@FindBy(how = How.XPATH, using = "//div[@id = 'pmo']//button/em[text() ='Save']")
	public WebElement PMO_Savebtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='MsgId']//span")
	public WebElement PMO_Msg;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'ag-header-cell') and @title]")
	public List<WebElement> PMO_Header;
	
	@FindBy(how = How.XPATH, using = "//*[@id='PMOExport']")
	public WebElement PMOExportbtn;

	@FindBy(how = How.XPATH, using = "//*[@id='importPMOID']")
	public WebElement PMOImportbtn;
	
	@FindBy(how = How.XPATH, using = ".//*[@role='row' and @row-id='0']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement Export_Status;
	
	@FindBy(how = How.XPATH, using = ".//*[@role='row' and @row-id='1']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement Import_Status;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'File Name')]")
	public WebElement Header_FileName;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Export/Import flag')]")
	public WebElement FileStatus;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Export/Import Status')]")
	public WebElement Other_FileStatus;

	@FindBy(how = How.XPATH, using = ".//*[@role='row' and @row-id='0']//*[@col-id='FileNm']//img")
	public WebElement Download_icon;

	@FindBy(how = How.XPATH, using = "//div[@col-id='FileNm']/span/a/..")
	public WebElement Download_FileName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='files_pmo'][2]")
	public WebElement PMOImport_clicktoBrowse;

	@FindBy(how = How.XPATH, using = "//*[@id='divImportPmocls']//*[text()='OK']")
	public WebElement PMOImport_OkBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='OtherExport']")
	public WebElement OCExportbtn;

	@FindBy(how = How.XPATH, using = "//*[@id='importOtherCostId']")
	public WebElement OCImportbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='files_pmo']")
	public WebElement OCImport_clicktoBrowse;

	@FindBy(how = How.XPATH, using = "//*[@id='divImportOtherCostcls']//*[text()='OK']")
	public WebElement OCImport_OkBtn;
	
	@FindBy(how = How.ID, using = "PMOTab")
	public WebElement ExportImport_PMOTab;
	
	@FindBy(how = How.ID, using = "OtherCostTab")
	public WebElement ExportImport_OtherCostTab;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'File Name')])[2]")
	public WebElement OtherHeader_FileName;
	
	@FindBy(how = How.XPATH, using = "//*[@id='solution-cost']//span[text()='PEOPLE']")
	public WebElement PEOPLEMANAGEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id='solution-cost']//span[text()='AVANADE TECH']")
	public WebElement AVANADETECHCHARGES;
	
	@FindBy(how = How.XPATH, using = "//img[@id='moteImportImg']/ancestor::li[@title='Import MoTE extract']/a")
	public WebElement ImportMOTEExtract_icon;

	@FindBy(how = How.XPATH, using = "//p[@id = 'MsgId']/span")
	public WebElement MoTE_Message;
	
	@FindBy(how = How.XPATH, using = "//p[text()='Click to browse']/ancestor::div[@class='import-group']/input")
	public WebElement MoTE_BrowseFile;

	@FindBy(how = How.XPATH, using = "//span[@id = 'importStartMonth']")
	public WebElement MoTE_UploadFile_StartMonth_dropdown;

	@FindBy(how = How.XPATH, using = "//ul[@id = 'ddlStartMonth']/li")
	public List<WebElement> MoTE_UploadFile_StartMonth_list;

	@FindBy(how = How.XPATH, using = "//span[@id = 'importEndMonth']")
	public WebElement MoTE_UploadFile_EndMonth_dropdown;

	@FindBy(how = How.XPATH, using = "//ul[@id = 'ddlEndMonth']/li")
	public List<WebElement> MoTE_UploadFile_EndMonth_list;

	@FindBy(how = How.XPATH, using = "//button[@id = 'btnImprtGo']")
	public WebElement ImportMoTE_ok_btn;
	
	@FindBy(how = How.XPATH, using = "//li[@title = 'View MoTE extract File']/a")
	public WebElement ViewMoTEExtractFile_icon;

	@FindBy(how = How.XPATH, using = "//li[@title = 'Accept MoTE extract']//a")
	public WebElement MoTEFileAccept;
	
	@FindBy(how = How.XPATH, using = "//li[@title = 'Reset All']/a")
	public WebElement Costing_Transition_Estimate_Input_MoTE_ResetAll_icon;
	
	@FindBy(how = How.XPATH, using = "//li[@title = 'Reject MoTE extract']//a")
	public WebElement MoTEFileReject;
	
	@FindBy(how = How.XPATH, using = "//td[text()='Active']/..//following::b[@title = 'Accept MoTE extract']//img")
	public List<WebElement> Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileAccept;
	
	@FindBy(how = How.XPATH, using = "//td[text()='Active']/..//following::b[@title = 'Reject MoTE extract']//img")
	public List<WebElement> Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileReject;
 
	@FindBy(how = How.XPATH, using = "//*[@col-id='Description'][not(@role='presentation')]/span/span")
	public List<WebElement> OtherCost_Descriptions;
 
	@FindBy(how = How.XPATH, using = "//*[@id='FixedBasedGrid']//div[contains(@class , 'ag-body-viewport ')][@role = 'presentation'][@ref]")
	public WebElement Costing_other_grid;
 
	@FindBy(how = How.XPATH, using = "//*[@id='OtherCostFixedAmount']")
	public WebElement Costing_OtherCost_FixedAmount;
 
	@FindBy(how = How.XPATH, using = "//*[@data-target= '#OtherCost-add']//em")
	public WebElement Costing_AddNewRow_button;
 
	@FindBy(how = How.XPATH, using = "//*[@id= 'Phasedropdown']")
	public WebElement Costing_PhaseDropdown;
 
	@FindBy(how = How.XPATH, using = "//*[@id='ulPhase']/li")
	public List<WebElement> Costing_PhaseDropdownList;
 
	@FindBy(how = How.XPATH, using = "//*[@id= 'DescriptionDropdown']")
	public WebElement Costing_DescriptionDropdown;
 
	@FindBy(how = How.XPATH, using = "//*[@id='ulDescription']/li")
	public List<WebElement> Costing_DescriptionDropdownList;
 
	@FindBy(how = How.XPATH, using = "//*[@id= 'ResourcePhaseLevelDropdown']")
	public WebElement Costing_ResourcePhaseLevelDropdown;
 
	@FindBy(how = How.XPATH, using = "//*[@id='ulResourcePhaseLevel']/li")
	public List<WebElement> Costing_ResourcePhaseLevelDropdownList;
 
	@FindBy(how = How.XPATH, using = "//*[@id= 'ProfilenameDropdown']")
	public WebElement Costing_ProfilenameDropdown;
 
	@FindBy(how = How.XPATH, using = "//*[@id='ulProfilename']/li")
	public List<WebElement> Costing_ProfilenameDropdownList;
 
	@FindBy(how = How.XPATH, using = "//*[@id= 'ApplicableGroupDropdown']")
	public WebElement Costing_ApplicableGroupDropdown;
 
	@FindBy(how = How.XPATH, using = "//*[@id='ulApplicableGroup']/li")
	public List<WebElement> Costing_ApplicableGroupDropdownList;
 
	@FindBy(how = How.XPATH, using = "//*[@class='col-xs-4 text-right']//div//em")
	public WebElement Costing_addNewRowSaveButtons;
 
	@FindBy(how = How.XPATH, using = "//*[@id='AlertMsgspn']")
	public WebElement Profiles_AlertMsg;
 
	@FindBy(how = How.XPATH, using = "//p[@id='MsgId']//span")
	public WebElement Costing_NonApplicableMessage;
 
	@FindBy(how = How.XPATH, using = "//input[@id='OtherCostFteBased']//following-sibling::span[text()]")
	public WebElement Fte_Tab;
 
	@FindBy(how = How.XPATH, using = "//*[@data-target= '#OtherCost-add']//em")
	public WebElement Fte_AddNewRow_button;
 
	@FindBy(how = How.XPATH, using = "//span[@ref='eContracted']/span")
	public WebElement Service_Expand;
 
	@FindBy(how = How.XPATH, using = "//*[@id='OtherCostRipple']/../span[1]")
	public WebElement Ripple_button;
 
	@FindBy(how = How.XPATH, using = "//button[@type='submit']//em")
	public WebElement CheckRowSave_button;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ResourcePhaseLevel' and contains(@class,'dropdown-cell')]//span//span")
	public List<WebElement> Months_row;
 
	@FindBy(how = How.XPATH, using = "//p[@id='MsgId']//span")
	public WebElement PopUp_Message;
 
    @FindBy(how = How.XPATH, using = ".//*[@id='Contigency']//*[@id='grid']//div[contains(@class,'ag-body-container')]//div[@role='row'][not(contains(@class,'header'))]")
	public List<WebElement> GuidanceCost_Contigency_Rows;
 
	@FindBy(how = How.ID, using = "drpDwon")
	public WebElement costing_Contigency_dropdown;
 
	@FindBy(how = How.XPATH, using = "//*[@id='contingencysave']")
	public WebElement Costing_Contigency_Savebtn;
 
	@FindBy(how = How.XPATH, using = "//p[@id = 'MsgId']/span")
	public WebElement Costing_Contigency_msg;
 
	@FindBy(how = How.XPATH, using = "//div[contains(@col-id , 'Year')][not(@role = 'presentation')]/span/span")
	public List<WebElement> costing_Contingency_years_data;
 
	@FindBy(how = How.XPATH, using = ".//*[@id='divInfrastructureCharges']//*[@id='gridInfrastructure']//div[contains(@class,'ag-body-container')]//div[@role='row']")
	public List<WebElement> GuidanceCost_Infrastructure_Rows;
 
	@FindBy(how = How.XPATH, using = "//*[@id='btnInfrastructureChrgsSave']/em")
	public WebElement InfraStructure_SaveBtn;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div")
	public List<WebElement> Costing_SecuredbayGrid_rows;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='SecureBayTypeName']")
	public List<WebElement> Costing_SecuredbayGrid_SecureBayType_div;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='SecureBayTypeName']//select")
	public WebElement Costing_SecuredbayGrid_SecureBayType_drp;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='SecuredBayGuidance']")
	public List<WebElement> Costing_SecuredbayGrid_SecuredBayGuidance_div;
 
	@FindBy(how = How.XPATH, using = "//*[@id='Securedbaysavebtn']")
	public WebElement Costing_Securedbaysavebtn;
 
	@FindBy(how = How.XPATH, using = ".//*[@id='Voiceconnectivity']//*[@id='grid']//div[contains(@class,'ag-body-container')]//div[@role='row']")
	public List<WebElement> GuidanceCost_VoiceConnectivity_Rows;
 
	@FindBy(how = How.ID, using = "Voiceconnectivitysavebtn")
	public WebElement Costing_VoiceConnectivity_Save_btn;
 
	@FindBy(how = How.XPATH, using = ".//*[@id='Dataconnectivity']//*[@id='grid']//div[contains(@class,'ag-body-container')]//div[@role='row']")
	public List<WebElement> GuidanceCost_DataConnectivity_Rows;
 
	@FindBy(how = How.XPATH, using = "//*[@id='Dataconnectivitysavebtn']")
	public WebElement Costing_DataConnectivity_Save_btn;
 
	@FindBy(how = How.XPATH, using = "//*[@id='Shiftaddbtn']")
	public WebElement Shift_add_btn;
 
	@FindBy(how = How.XPATH, using = "//button[@id='Shiftsavebtn']")
	public WebElement Shift_save;
 
	@FindBy(how = How.XPATH, using = "//p[@id='MsgId']/span[contains(@title,'Shift Details saved successfully.')]")
	public WebElement Shift_savemsg;
 
	@FindBy(how = How.XPATH, using = "//button[@id='oncalladdbtn']")
	public WebElement oncalladdbtn;
 
	@FindBy(how = How.XPATH, using = "//div[@id='oncall']//div[@col-id='ProfileNm'][not(@title)]")
	public List<WebElement> oncall_profile_last;
 
	@FindBy(how = How.XPATH, using = "//releasedropdown-editor-cell//select[@id='drpDwon']")
	public WebElement Shift_dropdwn_edit;
 
	@FindBy(how = How.XPATH, using = "//div[@id='oncall']//div[@col-id='SolutionGroupNm'][not(@title)]")
	public List<WebElement> oncall_SolutionGroupNm_last;
 
	@FindBy(how = How.XPATH, using = "//div[@id='oncall']//div[@col-id='OnCallType'][not(@title)]")
	public List<WebElement> oncall_OnCallType_last;
 
	@FindBy(how = How.XPATH, using = "//div[@id='oncall']//div[@col-id='TypeOfSupportName'][not(@title)]")
	public List<WebElement> oncall_TypeOfSupportName_last;
 
	@FindBy(how = How.XPATH, using = "//div[@id='oncall']//div[@col-id='OnCallTeamPct'][not(@title)]")
	public List<WebElement> oncall_OnCallTeamPct_last;
	@FindBy(how = How.XPATH, using = "//numeric-cell/input")
	public WebElement Shift_input_edit;
 
	@FindBy(how = How.XPATH, using = "//button[@id='oncallsavebtn']")
	public WebElement oncallsavebtn;
	@FindBy(how = How.XPATH, using = ".//*[@id='divDnp']//*[@id='grid']//div[contains(@class,'ag-body-container')]//div[@role='row']")
	public List<WebElement> GuidanceCost_DNP_Rows;
 
	@FindBy(how = How.XPATH, using = "//*[@id= 'btndnpsave']")
	public WebElement Costing_DNPSaveButton;
 
	@FindBy(how = How.XPATH, using = "//*[@id='SecuredbaycancelBtn']//em[text()='Cancel']")
	public WebElement Costing_SecuredbayCancelbtn;
 
	@FindBy(how = How.XPATH, using = "//*[@id='Securedbayaddbtn']")
	public WebElement Costing_Securedbayaddbtn;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='ProfileName']")
	public List<WebElement> Costing_SecuredbayGrid_ProfileName_div;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='ProfileName']//select")
	public WebElement Costing_SecuredbayGrid_ProfileName_drp;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='ActionFields']//img[@alt='Comments']")
	public List<WebElement> Costing_SecuredbayGrid_Comments_div;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='ActionFields']//textarea")
	public WebElement Costing_SecuredbayGrid_Comments_textarea;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='ActionFields']//button")
	public WebElement Costing_SecuredbayGrid_Comments_SaveButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='MsgId']/span")
	public WebElement Costing_SecuredBay_Msg;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='ApplicableGroup']")
	public List<WebElement> Costing_SecuredbayGrid_Group_div;
 
	@FindBy(how = How.XPATH, using = "//*[@id='grid']//div[contains(@class,'ag-body-container')]/div/div[@col-id='ApplicableGroup']//select")
	public WebElement Costing_SecuredbayGrid_Group_drp;
 
	@FindBy(how = How.XPATH, using = "//*[@id='ContRipple']/../span[1]")
	public WebElement Costing_Ripple;
 
	@FindBy(how = How.XPATH, using = "//*[@id='btnInfrastructureChrgsAdd']")
	public WebElement Infrastructure_add;
 
	@FindBy(how = How.XPATH, using = "//*[@id='Voiceconnectivityaddbtn']")
	public WebElement Voiceconnectivity_add;
 
	@FindBy(how = How.XPATH, using = "//*[@id='Dataconnectivityaddbtn']")
	public WebElement Dataconnectivity_add;
 
	@FindBy(how = How.XPATH, using = "//*[@id='btndnpAdd']")
	public WebElement DNP_add;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ProfileName'][not(@role='presentation')]")
	public WebElement Infra_profilenameDrpdwn;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='SolutionGroupName'][not(@role='presentation')] ")
	public WebElement Infra_GroupnameDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDown']//option")
	public List<WebElement> Infra_profilenameDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDown']//option")
	public List<WebElement> Infra_GroupnameDrpDwnlist;
 
	@FindBy(how = How.XPATH, using = "//*[@id='Securedbayaddbtn']")
	public WebElement SecuredBay_add;
 
	@FindBy(how = How.XPATH, using = "//*[@id='btnovertimeAdd']")
	public WebElement Overtime_add;
 
	@FindBy(how = How.XPATH, using = "//*[@id='locationpremiumaddbtn']")
	public WebElement Location_add;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ProfileName'][not(@role='presentation')]  ")
	public WebElement SecuredBay_ProfileDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDown']//option")
	public List<WebElement> Secured_profilenameDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ApplicableGroup'][not(@role='presentation')]  ")
	public WebElement SecuredBay_GroupDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDown']//option")
	public List<WebElement> Secured_groupnameDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='SecureBayTypeName'][not(@role='presentation')]")
	public WebElement SecuredBay_DrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDown']//option")
	public List<WebElement> SecuredBay_Drpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ProfileNm'][not(@role='presentation')]")
	public WebElement VoiceConnectivity_DrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> VoiceConnectivity_Drpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ProfileNm'][not(@role='presentation')]")
	public WebElement DataConnectivity_DrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> DataConnectivity_Drpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@id='Shift']//div[@col-id='ProfileNm'][not(@role='presentation')]")
	public WebElement Shift_ProfileDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> Shift_ProfileDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@id='Shift']//div[@col-id='SolutionGroupNm'][not(@role='presentation')]")
	public WebElement Shift_GroupDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> Shift_GroupDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@id='oncall']//div[@col-id='ProfileNm'][not(@role='presentation')]")
	public WebElement OnCall_ProfileDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> OnCall_ProfileDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@id='oncall']//div[@col-id='SolutionGroupNm'][not(@role='presentation')]")
	public WebElement OnCall_GroupDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> OnCall_GroupDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='OnCallType'][not(@role='presentation')]")
	public WebElement OnCall_typeDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> OnCall_typeDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='TypeOfSupportName'][not(@role='presentation')]")
	public WebElement OnCall_supportDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> OnCall_supportDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ProfileNm'][not(@role='presentation')]")
	public WebElement Overtime_ProfileDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> OvertimeProfile_Drpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='SolutionGroupNm'][not(@role='presentation')]")
	public WebElement Overtime_GroupDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> Overtime_GroupDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//*[@col-id='UpliftToHoursPct' ]//input")
	public WebElement Overtime_hours;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ProfileNm'][not(@role='presentation')]")
	public WebElement DNP_profilenameDrpdwn;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='SolutionGroupNm'][not(@role='presentation')] ")
	public WebElement DNP_GroupnameDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//*[@col-id='ServiceDNPDesc']//input")
	public WebElement Dnp_Description;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> DNP_profilenameDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> DNP_GroupnameDrpDwnlist;
 
	@FindBy(how = How.XPATH, using = "//div[@col-id='ProfileNm'][not(@role='presentation')]")
	public WebElement Location_ProfileDrpDwn;
 
	@FindBy(how = How.XPATH, using = "//select[@id='drpDwon']//option")
	public List<WebElement> Location_ProfileDrpdwnlist;
 
	@FindBy(how = How.XPATH, using = "//*[@col-id='ChangeToPayRollPct']//input")
	public WebElement Location_Payroll;
 
	@FindBy(how = How.XPATH, using = "//*[@id='locationpremiumsavebtn']")
	public WebElement Location_Save;
 
	@FindBy(how = How.XPATH, using = " //*[@id='btnovertimesave']")
	public WebElement Overtime_Save;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'overlay')]//button/em[text()='I understand']")
	public WebElement Downloadfile_IUnderstandConfidentialPopup;
 
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Import Alert')]/../../..//em[contains(text(),'OK')]")
	public WebElement PMO_ImportAlert;
 
	@FindBy(how = How.XPATH, using = "//*[@row-id='0']//*[contains(@col-id,'M1')]//input")
	public WebElement StaffingPMO_Month1value;
 

	/************************** METHODS *****************************/
	
	public Costing_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
	/**
	 * TC_81: Validate if the SA is able to navigate to Costing Screen on click of costing and able to see PMO, 
	 * Transiiton Estimate Inpute(MOTE),Soluiton Cots, Solution Standard cost,Other Costs Export/Import Status
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void NavigatetoCostingScreen() throws Exception {
		loader();
		boolean scenarioFlag = true;
		clickElement(costingTab);
		waitForElementToAppear(PMO_Tab);
		if (isDisplayed(PMO_Tab) && isDisplayed(MOTELink) && isDisplayed(SolutionCostLink) &&
				isDisplayed(SolStdCostLink) && isDisplayed(OtherLink) && isDisplayed(ExportImportsTab))
			logPass("SA is able to navigate to Costing Screen");
		else {
			logFail("SA is not able to navigate to Costing Screen");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}
	
	/**
	 * TC_82:Validate if SA is able to view all the records of PMO as per the default template and is able to enter FTEs for T and SD.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void EnterFTE() throws Exception {
		boolean scenarioFlag = true;
		List<Boolean> Flag = new ArrayList<>();
		String[] TandSD= {"SD","T"};
		loader();
		clickElement(PMO_Tab);
		waitForElementToAppear(PMO_StaffingLoadTab);
		clickElement(PMO_StaffingLoadTab);
		ArrayList<String> Header = new ArrayList<String>();
		ArrayList<String> UIHeader = new ArrayList<>(Arrays.asList("Billable","Role","Career level","Method","Billcode","Profile Name"));
		for (WebElement header: PMO_Header) {
			Header.add(header.getAttribute("title"));
		}
		
		if(Header.containsAll(UIHeader)){
			Flag.add(true);
		}
		else {
			Flag.add(false);
		}
		
		
		
		for (String T_SD : TandSD){
			String month = "";
			if(T_SD=="T") {
				if (!PmoFTERipple.getAttribute("class").contains("toggle_off")) {
					clickElement(CostingPMO_RippleButton);
				}
				clickElement(SDandT);
				month="M2";
			}else {
				month="M1";
			}
			clickElement(Costing_PMO_selectAll_Checkboxs);
			scrollVerticallyInsideElement(Costing_PMO_grid, -1600);
			for(int i=0; i<PMO_rows.size();i++) {
				if(i%3==0)
				{
				scrollVerticallyInsideElement(Costing_PMO_grid, 400);
				}
				clickElement(getDriver().findElement(By.xpath("//*[@row-id='" + i +"']//*[contains(@col-id,'" + month + "')]//input")));
				clear(getDriver().findElement(By.xpath("//*[@row-id='" + i +"']//*[contains(@col-id,'" + month + "')]//input")));
				sendKeys(getDriver().findElement(By.xpath("//*[@row-id='" + i +"']//*[contains(@col-id,'" + month + "')]//input")),"10");
				
			}
			scroll("bottom");
			clickElement(PMO_Savebtn);
			loader();
			scroll("top");
			if (PMO_Msg.getAttribute("title").contains("PMO Details Saved Successfully."))
			{
				logPass("SA is able to save FTE for "+T_SD);
				Flag.add(true);
			}
			else {
				logFail("SA is not able to save FTE for "+T_SD);
				Flag.add(false);
			}
		
		}
		if(!Flag.contains(false)) {
			logPass("SA is able to save FTE for SD and T");
		}
		else {
			logFail("SA is not able to save FTE for SD and T");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

	}

	/**
	 * TC_83:Validate if SA is able to export and import the PMO file.
	 * TC_84: Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void ValidatePMOExportImport() throws Exception {
		Kda = PageFactory.initElements(getDriver(), KDAReport_Page.class);
		boolean scenarioFlag = true;
 
		clickElement(PMOExportbtn);
		loader();
 
		clickElement(ExportImportsTab);
		waitForElementToBeVisible(Header_FileName);
 
		try 
		{
			waitForTextToBePresentInElement(Export_Status,"Completed");
			logPass("SA able to Export and status also successfully changed to Completed");
		}
 
		catch (Exception e)
		{
			logFail("SA not able to Export and status also not changed to Completed");
			scenarioFlag = false;
		}
 
		waitForElementToBeVisible(Download_icon);
		clickElement(Download_icon);
 
		clickElement(Downloadfile_IUnderstandConfidentialPopup);
 
 
		waitForElementToBeVisible(Download_FileName);
		String path = getText(Download_FileName);
		String Real_Path = ConstantUtils.DownloadedFiles_FilePath + path;
		Kda.isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, path);//to wait for file download
	
	    
		//TC_84: Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.
		String Value_passing_in_excel = "20.00";
		logInfo("changing value in excel for month1  " + Value_passing_in_excel);
 
		writeDataToExcel(Real_Path, "PMO Staffing", 6, 24, Value_passing_in_excel);
 
		clickElement(PMO_Tab);
		clickElement(PMOImportbtn);
 
		PMOImport_clicktoBrowse.sendKeys(Real_Path);
 
		clickElement(PMOImport_OkBtn);
 
		loader();
		clickElement(ExportImportsTab);
		loader();
		waitForElementToAppear(Header_FileName);
		waitForElementToBeVisible(Header_FileName);
		Navigate_to_subTab(GlobalScreen.SUBTAB_COSTING_PMO);
		clickElement(ExportImportsTab);
		loader();
		try 
		{
			waitForTextToBePresentInElement(Import_Status,"Completed");
			logPass("SA able to Import and status also successfully changed to Completed");
		}
 
		catch (Exception e)
		{
			logFail("SA not able to Import and status also not changed to Completed");
			scenarioFlag = false;
		}
 
		clickElement(PMO_Tab);
 
		waitForElementToAppear(PMO_StaffingLoadTab);
		clickElement(PMO_StaffingLoadTab);
 
		clickElement(Costing_PMO_selectAll_Checkboxs);
 
		String UI_ImportValue = StaffingPMO_Month1value.getAttribute("value");
		logInfo("UI Month1 value After changing value in excel " + UI_ImportValue);
 
		if(Value_passing_in_excel.equals(UI_ImportValue)) 
			logPass("SA is able to make the changes in exported excel and on import, the same changes are reflecting on UI.");
 
		else {
			logFail("SA is not able to make the changes in exported excel and on import, the same changes are not reflecting"
					+ "on UI.");
			scenarioFlag = false;
		}
 
		if (scenarioFlag == true)
		{
			logPass("SA is able to Import/Export file and changes also reflecting in UI in PMO tab under Costing");
			scenarioPass();
		}
		else
			logFail("SA is not able to Import/Export file and changes also reflecting in UI in PMO tab under Costing");		
 
	}	
	/**
	 * TC_89:Validate if SA is able to export and import other cost file.
	 * TC_91: Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
public void ValidateOtherCostExportImport() throws Exception {
 
		
		boolean scenarioFlag = true;
		loader();
		clickElement(OtherLink);
 
		clickElement(OCExportbtn);
		loader();
 
		clickElement(ExportImportsTab);
		clickElement(ExportImport_OtherCostTab);
		try {
			waitForElementToBeVisible(Header_FileName);
		}
		catch(Exception e) {}
		try 
		{
			waitForTextToBePresentInElement(Export_Status,"Completed");
			logPass("SA able to Export and status also successfully changed to Completed");
		}
 
		catch (Exception e)
		{
			logFail("SA not able to Export and status also not changed to Completed");
			scenarioFlag = false;
		}
 
		waitForElementToBeVisible(Download_icon);
		clickElement(Download_icon);
 
		clickElement(Downloadfile_IUnderstandConfidentialPopup);
 
 
		waitForElementToBeVisible(Download_FileName);
		String path = getText(Download_FileName);
		String Real_Path = ConstantUtils.DownloadedFiles_FilePath + path;
 
		//TC_91: Validate if SA is able to see make the changes in exported excel and on import, the same changes should reflect on UI.
		String Value_passing_in_excel = "20.00";
		logInfo("changing value in excel for month1  " + Value_passing_in_excel);
 
		writeDataToExcel(Real_Path, "Other Costs-Fixed Amt", 4, 10, Value_passing_in_excel);
 
		clickElement(OtherLink);
		clickElement(OCImportbtn);
 
		OCImport_clicktoBrowse.sendKeys(Real_Path);
 
		try
		{
			clickElement(OCImport_OkBtn);
		}
		catch(Exception e) {
			clickElement(OCImportbtn);
			clickElement(OCImport_OkBtn);
		}
		loader();
		clickElement(ExportImportsTab);
		clickElement(ExportImport_OtherCostTab);

		waitForElementToBeVisible(OtherHeader_FileName);
 
		try 
		{
			waitForTextToBePresentInElement(Import_Status,"Completed");
			logPass("SA able to Import and status also successfully changed to Completed");
		}
 
		catch (Exception e)
		{
			logFail("SA not able to Import and status also not changed to Completed");
			scenarioFlag = false;
		}

 
		clickElement(OtherLink);
		loader();
 
		waitForElementToBeVisible(Service_Expand);
		clickElement(Service_Expand);
 
		String UI_ImportValue = StaffingPMO_Month1value.getAttribute("value");
		logInfo("UI Month1 value After changing value in excel " + UI_ImportValue);
 
		if(Value_passing_in_excel.equals(UI_ImportValue)) 
			logPass("SA is able to make the changes in exported excel and on import, the same changes are reflecting on UI.");
 
		else {
			logFail("SA is not able to make the changes in exported excel and on import, the same changes are not reflecting"
					+ "on UI.");
			scenarioFlag = false;
		}

 
		if (scenarioFlag == true)
		{
			logPass("SA is able to Import/Export file and changes also reflecting in UI in othercost tab under Costing");
			scenarioPass();
		}
		else
		logFail("SA is not able to Import/Export file and changes also reflecting in UI in othercost tab under Costing");		
	}		

	/**
	 * TC_86: Validate if SA is able to view People Management and Avanade Tech Charges under Solution Cost
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void ValidateSolutionCost() throws Exception {
		boolean scenarioFlag = true;
		loader();
		clickElement(SolutionCostLink);
		waitForElementToAppear(PEOPLEMANAGEMENT);
		if (isDisplayed(PEOPLEMANAGEMENT) && isDisplayed(AVANADETECHCHARGES))
			logPass("SA is able to view People Management and Avanade Tech Charges under Solution Cost");
		else {
			logFail("SA is not able to view People Management and Avanade Tech Charges under Solution Cost");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}
	
	/**
	 * TC_90: Validate if the SA is able to view the Export/Import status of OU file in PMO section under Export/Import Status 
	 * and Other Cost Section under Export/Import Status.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void ValidateExportImportTab() throws Exception {
		boolean scenarioFlag = true;
		List<Boolean> Flag = new ArrayList<>();
		clickElement(ExportImportsTab);
		waitForElementToAppear(ExportImport_PMOTab);
		if(isDisplayed(ExportImport_PMOTab) && isDisplayed(ExportImport_OtherCostTab)){
			Flag.add(true);
		}
		else {
			Flag.add(false);
		}
		clickElement(ExportImport_PMOTab);
		waitForElementToAppear(FileStatus);
		if(isDisplayed(FileStatus)) {
			Flag.add(true);
		}
		else {
			Flag.add(false);
		}
			
		clickElement(ExportImport_OtherCostTab);
		waitForElementToAppear(Other_FileStatus);
		if(isDisplayed(Other_FileStatus)) {
			Flag.add(true);
		}
		else {
			Flag.add(false);
		}
		if(!Flag.contains(false)) {
			logPass("SA is able to view the Export/Import status of OU file in PMO section under Export/Import Status \r\n"
					+ "	 and Other Cost Section under Export/Import Status.");
		}
		else {
			logFail("SA is not able to view the Export/Import status of OU file in PMO section under Export/Import Status \r\n"
					+ "	 and Other Cost Section under Export/Import Status.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}
	
	/**
	 * TC_85: Validate if the SA is able to Accept the MOTE records imported and view them on the screen.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void ValidateMOTErecords() throws Exception {
		loader();
		boolean scenarioFlag = true;
		List<Boolean> Flag = new ArrayList<>();
		String TestDataFilePath = ConstantUtils.TestData_Costing;
		String TestDataSheet = "Costing_MOTE";
		clickElement(MOTELink);
		loader();
		String LeadSAUrl = getDriver().getCurrentUrl();
		String MobSMEUrl = LeadSAUrl.replace("/17/", "/19/");
		getDriver().get(MobSMEUrl);
		loader();
		String StartMonth = SetExcelPath(TestDataFilePath, TestDataSheet, 1, 0);
		String EndMonth = SetExcelPath(TestDataFilePath, TestDataSheet, 1, 1);
		loader();
		boolean Importflag = Costing_TransitionEstimateInput_MoTE_ImportMOTE_File_MobilisationSME(ConstantUtils.FilePath_Costing_TEI_MoTE_FileUpload, StartMonth, EndMonth);
		getDriver().get(LeadSAUrl);
		loader();
		getDriver().navigate().refresh();
		loader();
		if(Importflag) {
			Flag.add(true);
		}
		else {
			Flag.add(false);
		}
		loader();
		boolean Acceptflag = Costing_TransitionEstimateInput_MoTE_Accept_Download_FileUploadRequest();
		getDriver().get(MobSMEUrl);
		loader();
		getDriver().navigate().refresh();
		loader();
		if(Acceptflag) {
			Flag.add(true);
		}
		else {
			Flag.add(false);
		}
		boolean Rejectflag = Costing_TransitionEstimateInput_MoTE_RejectFileUploadRequest(LeadSAUrl, MobSMEUrl,ConstantUtils.FilePath_Costing_TEI_MoTE_FileUpload, StartMonth, EndMonth);
		
		if(Rejectflag) {
			Flag.add(true);
		}
		else {
			Flag.add(false);
		}
		
		if(!Flag.contains(false)) {
			logPass("SA is able to Accept the MOTE records imported and view them on the screen.");
		}
		else {
			logFail("SA is not able to Accept the MOTE records imported and view them on the screen.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}
	
	/**
	 * Import the MOTE records imported.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public boolean Costing_TransitionEstimateInput_MoTE_ImportMOTE_File_MobilisationSME(String MoTE_FilePath,
			String StartMonth, String EndMonth) throws Exception {
		loader();
		boolean scenarioFlag = true;
		loader();
		
		waitForElementToAppear(ImportMOTEExtract_icon);
		if (ImportMOTEExtract_icon.isDisplayed()) {
			if (ImportMOTEExtract_icon.getAttribute("class")
					.equals("disabled")) {
				getDriver().navigate().refresh();
				loader();
			}
			logPass("Import MOTE Extract is enabled for Mobilisation SME");
			clickElement(ImportMOTEExtract_icon);
			//try {getDriver().switchTo().alert().accept();}catch(Exception e) {}
			Import_MoTE_file(MoTE_FilePath, StartMonth, EndMonth);
			loader();
			if (MoTE_Message.getAttribute("title")
					.contains("MoTE Extract data has been imported successfully."))
				logPass("Mobilisation SME is able to upload MoTE file successfully");
			else {
				logFail("Mobilisation SME is not able to upload MoTE file successfully");
				scenarioFlag = false;
				}
				
		} else {
			logFail("Error Occurred: Import MOTE Extract tab in Costing is not displayed for Mobilisation SME");
			scenarioFlag = false;
		}
		jse.executeScript("window.scrollBy(0,-900)", "");
		loader();
		refreshScreen();
		if (scenarioFlag == true)
			scenarioPass();
		return scenarioFlag;
	}
	
	/**
	 * For importing the MOTE records imported.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void Import_MoTE_file(String MoTE_FilePath, String StartMonth, String EndMonth) throws Exception {
		waitForElementToBePresent(MoTE_BrowseFile);
		scrollToElement(MoTE_BrowseFile);
		MoTE_BrowseFile.sendKeys(MoTE_FilePath);
		loader();
		try {
			waitForElementClickable(MoTE_UploadFile_StartMonth_dropdown);
			clickElement(MoTE_UploadFile_StartMonth_dropdown);
		} catch (Exception e) {
			loader();
			waitForElementClickable(MoTE_UploadFile_StartMonth_dropdown);
			clickElement(MoTE_UploadFile_StartMonth_dropdown);
		}
		loader();
		for (int i = 0; i < MoTE_UploadFile_StartMonth_list.size(); i++) {
			if (getText(MoTE_UploadFile_StartMonth_list.get(i)).equals(StartMonth)) {
				clickElement(MoTE_UploadFile_StartMonth_list.get(i));
				break;
			}
		}
		clickElement(MoTE_UploadFile_EndMonth_dropdown);
		loader();
		for (int i = 0; i < MoTE_UploadFile_StartMonth_list.size(); i++) {
			if (getText(MoTE_UploadFile_EndMonth_list.get(i)).equals(EndMonth)) {
				clickElement(MoTE_UploadFile_EndMonth_list.get(i));
				break;
			}
		}
		clickElement(ImportMoTE_ok_btn);
		loader();
	}
	
	/**
	 * Accept the MOTE records imported.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public boolean Costing_TransitionEstimateInput_MoTE_Accept_Download_FileUploadRequest() throws Exception
	{
		boolean scenarioFlag = true;
		loader();
		getDriver().navigate().refresh();
		loader();
		waitForElementToAppear(MoTEFileAccept);
		if (MoTEFileAccept.isDisplayed()) {
			if (MoTEFileAccept.getAttribute("class")
					.equals("disabled")) {
				refreshScreen();
				loader();
			}
			try {
				waitForElementClickable(MoTEFileAccept);
				MoTEFileAccept.click();
				getDriver().switchTo().alert().accept();
			}catch(Exception e) {
				clickElement(ViewMoTEExtractFile_icon);
				loader();
				waitForElementToBePresent(Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileAccept.get(Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileAccept.size() - 1));
				Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileAccept.get(Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileAccept.size() - 1).click();
				getDriver().switchTo().alert().accept();
			}
			loader();
			jse.executeScript("window.scrollBy(0,900)", "");
			loader();
			if (MoTE_Message.getAttribute("title").equals("Accepted successfully."))
				logPass("Lead SA is able to Accept Latest file request from Mobilisation SME");
			else {
				logFail("Lead SA is not able to Accept Latest file request from Mobilisation SME");
				scenarioFlag = false;
			}

		} else {
			logFail("Accept MoTE File tab is not displayed in Costing - Transition Estimate Input (MoTE) screen");
			scenarioFlag = false;
		}
		return scenarioFlag;

	}
	
	/**
	 * Reject the MOTE records imported.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public boolean Costing_TransitionEstimateInput_MoTE_RejectFileUploadRequest(String LeadSA_url, String MobSME_url,
			String MoTeFilePath, String StartMonth, String EndMonth) throws Exception {
		boolean scenarioFlag = true;
		loader();
		getDriver().navigate().refresh();
		loader();
		waitForElementToBeVisible(ImportMOTEExtract_icon);
		if (ImportMOTEExtract_icon.getAttribute("class")
				.equals("disabled")) {
			getDriver().navigate().refresh();
			loader();
		}
		try {
			loader();
			try {
				Costing_Transition_Estimate_Input_MoTE_ResetAll_icon.click();
			} catch (Exception e1) {
				jse.executeScript("window.scrollBy(0,50)", "");
				Costing_Transition_Estimate_Input_MoTE_ResetAll_icon.click();
			}
			getDriver().switchTo().alert().accept();
			loader();
			jse.executeScript("window.scrollBy(0,-400)", "");
			clickElement(ImportMOTEExtract_icon);
			loader();
		} catch (Exception e) {
		}
		Import_MoTE_file(MoTeFilePath, StartMonth, EndMonth);
		getDriver().get(LeadSA_url);
		loader();
		getDriver().navigate().refresh();
		loader();
		refreshScreen();
		waitForElementToBeVisible(MoTEFileReject);
		if (MoTEFileReject.isDisplayed()) {
			if (MoTEFileReject.getAttribute("class")
					.equals("disabled")) {
				getDriver().navigate().refresh();
				loader();
			}
			loader();
			jse.executeScript("window.scrollBy(0,300)", "");
			try{
				MoTEFileReject.click();
				getDriver().switchTo().alert().accept();
			}catch(Exception e) {
				clickElement(ViewMoTEExtractFile_icon);
				loader();
				scrollToElement(Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileReject
						.get(Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileReject.size() - 1));
				Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileReject
						.get(Costing_Transition_Estimate_Input_MoTE_ViewMOTE_MoTEFileReject.size() - 1).click();
				getDriver().switchTo().alert().accept();
			}
			
			loader();
			jse.executeScript("window.scrollBy(0,900)", "");
			loader();
			if (MoTE_Message.getAttribute("title").equals("Rejected successfully."))
				logPass("Lead SA is able to Reject file request from Mobilisation SME");
			else {
				logFail("Lead SA is not able to Reject file request from Mobilisation SME");
				scenarioFlag = false;
			}

		} else {
			logFail("Reject MoTE File tab is not displayed in Costing - Transition Estimate Input (MoTE) screen");
			scenarioFlag = false;
		}

		
		if (scenarioFlag == true)
			scenarioPass();
		return scenarioFlag;
	}
	
	/**
	 * TC_88: Validate if SA is able to configure existing rows of other cost and also able to add new rows in FTE Based and Fixed Amount section.
	 *
	 * @since 12/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 *
	 */
	public void costing_OtherData(String Filepath, String Sheet, int Row, int Col) throws Exception {
		 
		clickElement(OtherLink);
		boolean ScenarioFlag = true;
 
		String rippleCheckboxClass = "";
 
		waitForElementToBeVisible(Service_Expand);
		clickElement(Service_Expand);
 
		try {
		rippleCheckboxClass = Ripple_button.getAttribute("class");
 
		if (!rippleCheckboxClass.contains("switch-input toggle_off")) {
			Ripple_button.click();
		}
		}catch(Exception e) {
			jsClick(Ripple_button);
		}
		int size = Months_row.size();
		for (int i = 0; i < size; i++) {
 
			clickElement(
					getDriver().findElement(By.xpath("//*[@row-id='" + i + "']//*[contains(@col-id,'M1')]//input")));
			clear(getDriver().findElement(By.xpath("//*[@row-id='" + i + "']//*[contains(@col-id,'M1')]//input")));
			sendKeys(getDriver().findElement(By.xpath("//*[@row-id='" + i + "']//*[contains(@col-id,'M1')]//input")),
					"50");
 
		}
		clickElement(CheckRowSave_button);
 
		waitForElementToBeVisible(PopUp_Message);
 
		if (isDisplayed(PopUp_Message)) {
			String message = getText(PopUp_Message);
 
			if (message.contains("Other cost Fixed Details Saved successfully."))
				logPass("Other cost Fixed Details Saved successfully.");
			else {
				logFail("Popup gives error message: " + message);
				ScenarioFlag = false;
 
			}
 
		} else {
			logFail("Popup message not Displayed ");
		}
		if (ScenarioFlag == true)
			scenarioPass();
		
		loader();
 
		if (Costing_OtherCost_FixedAmount.isSelected() == true) {
			logPass("By Default Other cost- Fixed amount should be displayed.");
		} else {
			logFail("By Default Other cost- Fixed amount should not be displayed.");
 
		}
 
		
		scroll(900);
		clickElement(Costing_AddNewRow_button);
 
		clickElement(Costing_PhaseDropdown);
		String selectPhase = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 9, 1);
		for (WebElement costingphase : Costing_PhaseDropdownList) {
			if (costingphase.getText().equals(selectPhase)) {
				clickElement(costingphase);
				logInfo("Accenture IP Contracting Entity from dropdown is selected");
				break;
			}
		}
		waitForElementToBeVisible(Costing_DescriptionDropdown);
		clickElement(Costing_DescriptionDropdown);
		String addNewDescription = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 10, 1);
		for (WebElement costingdescription : Costing_DescriptionDropdownList) {
			if (costingdescription.getText().equals(addNewDescription)) {
				clickElement(costingdescription);
				logInfo("Costing Description Entity from dropdown is selected");
				break;
			}
		}
 
		clickElement(Costing_ResourcePhaseLevelDropdown);
		String selectResource = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 11, 1);
		for (WebElement costingresource : Costing_ResourcePhaseLevelDropdownList) {
			if (costingresource.getText().equals(selectResource)) {
				clickElement(costingresource);
				logInfo("Resource is selected");
				handleAsyncWait();
				break;
			}
		}
 
		waitForElementToBeVisible(Costing_ProfilenameDropdown);
		clickElement(Costing_ProfilenameDropdown);
		String selectprofile = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 12, 1);
		for (WebElement costingprofile : Costing_ProfilenameDropdownList) {
			if (costingprofile.getText().equals(selectprofile)) {
				clickElement(costingprofile);
				logInfo("ProfileName is selected");
 
				break;
			}
		}
 
		clickElement(Costing_ApplicableGroupDropdown);
		String selectapplicable = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 13, 1);
		for (WebElement costingapplicable : Costing_ApplicableGroupDropdownList) {
			if (costingapplicable.getText().equals(selectapplicable)) {
				clickElement(costingapplicable);
				logInfo("Group is selected");
 
				break;
			}
		}
 
		clickElement(Costing_addNewRowSaveButtons);
 
		waitForElementToBeVisible(PopUp_Message);
 
		if (isDisplayed(PopUp_Message)) {
			String message = getText(PopUp_Message);
 
			if (message.contains("Other cost Fixed Details Saved successfully."))
				logPass("Other cost Fixed Details Saved successfully.");
			else {
				logFail("Popup gives error message: " + message);
				ScenarioFlag = false;
 
			}
 
		} else {
			logFail("Popup message not Displayed ");
		}
		if (ScenarioFlag == true)
			scenarioPass();
		
		
 
		waitForElementToBeVisible(Fte_Tab);
		clickElement(Fte_Tab);
 
		loader();
 
		waitForElementToBeVisible(Costing_AddNewRow_button);
		clickElement(Costing_AddNewRow_button);
 
		clickElement(Costing_PhaseDropdown);
		String selectPhaseFte = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 17, 1);
		for (WebElement costingphase : Costing_PhaseDropdownList) {
			if (costingphase.getText().equals(selectPhaseFte)) {
				clickElement(costingphase);
				logInfo("Accenture IP Contracting Entity from dropdown is selected");
				break;
			}
		}
 
		waitForElementToBeVisible(Costing_DescriptionDropdown);
		clickElement(Costing_DescriptionDropdown);
		String addNewDescriptionFte = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 18, 1);
		for (WebElement costingdescription : Costing_DescriptionDropdownList) {
			if (costingdescription.getText().equals(addNewDescriptionFte)) {
				clickElement(costingdescription);
 
				break;
			}
		}
		waitForElementToBeVisible(Costing_ProfilenameDropdown);
		clickElement(Costing_ProfilenameDropdown);
		String selectprofilefte = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 19, 1);
		for (WebElement costingprofile : Costing_ProfilenameDropdownList) {
			if (costingprofile.getText().equals(selectprofilefte)) {
				clickElement(costingprofile);
				logInfo("ProfileName is selected");
 
				break;
			}
		}
		waitForElementToBeVisible(Costing_ApplicableGroupDropdown);
		clickElement(Costing_ApplicableGroupDropdown);
		String groupText = ExcelUtilities.SetExcelPath(Filepath, "OtherData", 20, 1);
		for (WebElement appgrp : Costing_ApplicableGroupDropdownList) {
			if (appgrp.getText().equals(groupText)) {
				clickElement(appgrp);
				logInfo("Application Group is selected");
 
				break;
			}
		}
		clickElement(Costing_addNewRowSaveButtons);
		
		waitForElementToBeVisible(PopUp_Message);
 
		if (isDisplayed(PopUp_Message)) {
			String message = getText(PopUp_Message);
 
			if (message.contains("Other Cost FTE Based Details Saved Successfully."))
				logPass("Other Cost FTE Based Details Saved Successfully..");
			else {
				logFail("Popup gives error message: " + message);
				ScenarioFlag = false;
 
			}
 
		} else {
			logFail("Popup message not Displayed ");
		}
		if (ScenarioFlag == true)
			scenarioPass();
	}
	
	/**
	 * TC_87: Validate if user is able to add Solution Standard Costs like Data,On call, DNP,overtime, etc under Solution Standard Costs.
	 *
	 * @since 12/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 *
	 */
	public void applySolutionStandardCosts(String Path) throws Exception {
 
		clickElement(SolStdCostLink);
		String sheet = "GuidanceCost";
		String sheet1 = "SecuredBay";
		String rippleCheckbox = "";
		boolean scenarioFlag = true;
 
		String securedProfile = SetExcelPath(Path, sheet1, 1, 1);
		String securedGroup = SetExcelPath(Path, sheet1, 2, 1);
		String shiftProfile = SetExcelPath(Path, sheet, 2, 0);
		String shiftGroup = SetExcelPath(Path, sheet, 2, 1);
		String onCallProfile = SetExcelPath(Path, sheet, 14, 0);
		String onCallGroup = SetExcelPath(Path, sheet, 14, 1);
		String overtimeProfile = SetExcelPath(Path, sheet, 17, 0);
		String overtimeGroup = SetExcelPath(Path, sheet, 17, 1);
		String overtimehours = SetExcelPath(Path, sheet, 17, 2);
		String dnpProfile = SetExcelPath(Path, sheet, 20, 0);
		String dnpGroup = SetExcelPath(Path, sheet, 20, 1);
		String dnpdes = SetExcelPath(Path, sheet, 20, 2);
		String locationProfile = SetExcelPath(Path, sheet, 23, 0);
		String locationpayroll = SetExcelPath(Path, sheet, 23, 2);
 
		rippleCheckbox = Costing_Ripple.getAttribute("class");
 
//		if (!rippleCheckbox.contains("switch-input toggle_off")) {
//			clickElement(Costing_Ripple);
//		}
 
		for (int i = 0; i < GuidanceCost_Contigency_Rows.size(); i++) {
			String contractType = getDriver().findElement(By.xpath(
					".//*[@id='Contigency']//*[@id='grid']//div[contains(@class,'ag-body-container')]//div[@row-id='"
							+ i + "']/div[@col-id='ContractType']"))
					.getAttribute("title");
			if (contractType.trim().equals("Custom")) {
				clickElement(getDriver().findElement(By.xpath(
						".//*[@id='Contigency']//*[@id='grid']//div[contains(@class,'ag-body-container')]//div[@row-id='"
								+ i + "']/div[@col-id='ContractType']")));
				loader();
				Select drpDown = new Select(costing_Contigency_dropdown);
				drpDown.selectByVisibleText("Normal Risk");
				loader();
			}
		}
		clickElement(Costing_Contigency_Savebtn);
		loader();
		
		if (isDisplayed(Costing_Contigency_msg)) {
		String msg = getText(Costing_Contigency_msg);
		if (msg.contains("Contingency Details saved successfully")) {
			logPass("Contingency Details saved successfully");
		}
		else{
				logFail("Error Occurred: Page is not saved successfully after applying Custom Values in Contingency");
			}
		}
       if (scenarioFlag == true)
			scenarioPass();
 
		navigate_costingScreens("Infrastructure Charges");
		
		clickElement(Infra_profilenameDrpdwn);
		
		
		for (int i = 0; i < GuidanceCost_Infrastructure_Rows.size(); i++) {
			String applyGuidanceVal = getDriver().findElement(By.xpath(
					".//*[@id='divInfrastructureCharges']//*[@id='gridInfrastructure']//div[contains(@class,'ag-body-container')]//div[@row-id='"
							+ i + "']/div[@col-id='InfrastructureGuidance']"))
					.getAttribute("title");
			if (!applyGuidanceVal.trim().equals("Y")) {
				clickElement(getDriver().findElement(By.xpath(
						".//*[@id='divInfrastructureCharges']//*[@id='gridInfrastructure']//div[contains(@class,'ag-body-container')]//div[@row-id="
								+ i + "]/div[@col-id='InfrastructureGuidance']")));
				loader();
				Select drpDown = new Select(costing_Contigency_dropdown);
				drpDown.selectByVisibleText("Y");
				loader();
			}
		}
		loader();
		clickElement(InfraStructure_SaveBtn);
		waitForElementToBeVisible(Costing_Contigency_msg);
		if (isDisplayed(Costing_Contigency_msg)) {
			String msg_infra = getText(Costing_Contigency_msg);
			if (msg_infra.contains("Infrastructure Charges Details Saved Successfully."))
				logPass("Infrastructure Charges Details Saved Successfully.");
			else {
				logFail("Popup gives error message: " + msg_infra);
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
 
		navigate_costingScreens("Secured Bay");
		clickElement(SecuredBay_add);
		clickElement(SecuredBay_ProfileDrpDwn);
		for (WebElement sprofilename : Secured_profilenameDrpdwnlist) {
			if (sprofilename.getText().equals(securedProfile)) {
				clickElement(sprofilename);
				logInfo("Secured Bay Profile is selected from dropdown");
				break;
			}
		}
 
		clickElement(SecuredBay_GroupDrpDwn);
 
		for (WebElement securedgrp : Secured_groupnameDrpdwnlist) {
			if (securedgrp.getText().equals(securedGroup)) {
				clickElement(securedgrp);
				logInfo("Secured Bay Group is selected from dropdown");
				break;
			}
		}
 
		int GridIndex = Costing_SecuredbayGrid_rows.size() - 1;
		if (getText(Costing_SecuredbayGrid_SecureBayType_div.get(GridIndex).findElement(By.xpath("./span/span")))
				.equals("None")) {
			clickElement(Costing_SecuredbayGrid_SecureBayType_div.get(GridIndex));
			loader();
			clickElement(Costing_SecuredbayGrid_SecureBayType_drp);
			sendKeys(Costing_SecuredbayGrid_SecureBayType_drp, "Secure");
			clickElement(Costing_SecuredbayGrid_SecuredBayGuidance_div.get(GridIndex));
			clickElement(waitForElementClickable(Costing_Securedbaysavebtn));
 
			waitForElementToBeVisible(Costing_Contigency_msg);
			if (isDisplayed(Costing_Contigency_msg)) {
				String msg_secured = getText(Costing_Contigency_msg);
				if (msg_secured.contains("Securedbay Details Saved Successfully."))
					logPass("Securedbay Details Saved Successfully.");
				else {
					logFail("Popup gives error message: " + msg_secured);
					scenarioFlag = false;
				}
				if (scenarioFlag == true)
					scenarioPass();
			}
 
			navigate_costingScreens("Voice Connectivity");
			
			clickElement(VoiceConnectivity_DrpDwn);
			loader();
		
 
		clickElement(Costing_VoiceConnectivity_Save_btn);
 
		waitForElementToBeVisible(Costing_Contigency_msg);
		if (isDisplayed(Costing_Contigency_msg)) {
			String msg_voice = getText(Costing_Contigency_msg);
			if (msg_voice.contains("VoiceConnectivity Details Saved Successfully."))
				logPass("VoiceConnectivity Details Saved Successfully.");
			else {
				logFail("Popup gives error message: " + msg_voice);
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
 
		navigate_costingScreens("Data Connectivity");
		
        clickElement(DataConnectivity_DrpDwn);
 
		clickElement(Costing_DataConnectivity_Save_btn);
 
		waitForElementToBeVisible(Costing_Contigency_msg);
		if (isDisplayed(Costing_Contigency_msg)) {
			String msg_data = getText(Costing_Contigency_msg);
			if (msg_data.contains("Dataconnectivity Details Saved Successfully"))
				logPass("Dataconnectivity Details Saved Successfully");
			else {
				logFail("Popup gives error message: " + msg_data);
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
 
		navigate_costingScreens("Shift");
		clickElement(Shift_add_btn);
 
		clickElement(Shift_ProfileDrpDwn);
		for (WebElement shiftprofilename : Shift_ProfileDrpdwnlist) {
			if (shiftprofilename.getText().equals(shiftProfile)) {
				clickElement(shiftprofilename);
				logInfo("Shift profile is selected from dropdown");
				break;
			}
		}
 
		clickElement(Shift_GroupDrpDwn);
 
		for (WebElement shiftgrp : Shift_GroupDrpdwnlist) {
			if (shiftgrp.getText().equals(shiftGroup)) {
				clickElement(shiftgrp);
				logInfo("Shift Group is selected from dropdown");
				break;
			}
		}
 
		clickElement(Shift_save);
		waitForElementToBeVisible(Costing_Contigency_msg);
		if (isDisplayed(Costing_Contigency_msg)) {
			String msg_shift = getText(Costing_Contigency_msg);
			if (msg_shift.contains("Shift Details saved successfully."))
				logPass("Shift Details saved successfully.");
			else {
				logFail("Popup gives error message: " + msg_shift);
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
 
		navigate_costingScreens("On Call");
		clickElement(oncalladdbtn);
 
		clickElement(OnCall_ProfileDrpDwn);
		for (WebElement oncallprofilename : OnCall_GroupDrpdwnlist) {
			if (oncallprofilename.getText().equals(onCallProfile)) {
				clickElement(oncallprofilename);
				logInfo("OnCall Profile is selected from dropdown");
				break;
			}
		}
 
		clickElement(OnCall_GroupDrpDwn);
 
		for (WebElement oncallgrp : OnCall_GroupDrpdwnlist) {
			if (oncallgrp.getText().equals(onCallGroup)) {
				clickElement(oncallgrp);
				logInfo("OnCall Group is selected from dropdown");
				break;
			}
		}
		clickElement(oncall_OnCallType_last.get(0));
		loader();
		Select oncalltypevalue = new Select(Shift_dropdwn_edit);
		oncalltypevalue.selectByIndex(0);
		clickElement(oncall_TypeOfSupportName_last.get(0));
		loader();
		Select typeofsupprt = new Select(Shift_dropdwn_edit);
		typeofsupprt.selectByIndex(0);
		loader();
		clickElement(oncall_OnCallTeamPct_last.get(oncall_OnCallTeamPct_last.size() - 1));
		sendKeys(Shift_input_edit, "1");
		Shift_input_edit.sendKeys(Keys.TAB);
		clickElement(oncallsavebtn);
 
		waitForElementToBeVisible(Costing_Contigency_msg);
		if (isDisplayed(Costing_Contigency_msg)) {
			String msg_oncall = getText(Costing_Contigency_msg);
			if (msg_oncall.contains("On Call Details saved successfully."))
				logPass("On Call Details saved successfully.");
			else {
				logFail("Popup gives error message: " + msg_oncall);
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
 
		navigate_costingScreens("Overtime");
 
		clickElement(Overtime_add);
		clickElement(Overtime_ProfileDrpDwn);
		for (WebElement overtimeprofile : OvertimeProfile_Drpdwnlist) {
			if (overtimeprofile.getText().equals(overtimeProfile)) {
				clickElement(overtimeprofile);
				logInfo("Overtime Profile is selected from dropdown");
				break;
			}
		}
 
		clickElement(Overtime_GroupDrpDwn);
 
		for (WebElement overtimegrp : Overtime_GroupDrpdwnlist) {
			if (overtimegrp.getText().equals(overtimeGroup)) {
				clickElement(overtimegrp);
				logInfo(" Overtime Group is selected from dropdown");
				break;
			}
		}
 
		clickElement(Overtime_hours);
		sendKeys(Overtime_hours, overtimehours);
 
		clickElement(Overtime_Save);
		waitForElementToBeVisible(Costing_Contigency_msg);
		if (isDisplayed(Costing_Contigency_msg)) {
			String msg_overtime = getText(Costing_Contigency_msg);
			if (msg_overtime.contains("Overtime Details saved successfully."))
				logPass("Overtime Details saved successfully.");
			else {
				logFail("Popup gives error message: " + msg_overtime);
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
 
		navigate_costingScreens("DNP");
		clickElement(DNP_add);
 
		clickElement(Dnp_Description);
		sendKeys(Dnp_Description, dnpdes);
 
		clickElement(DNP_profilenameDrpdwn);
		for (WebElement dnpprofile : DNP_profilenameDrpdwnlist) {
			if (dnpprofile.getText().equals(dnpProfile)) {
				clickElement(dnpprofile);
				logInfo("DNP Profile is selected from dropdown");
				break;
			}
		}
 
		clickElement(DNP_GroupnameDrpDwn);
 
		for (WebElement dnpgrp : DNP_GroupnameDrpDwnlist) {
			if (dnpgrp.getText().equals(dnpGroup)) {
				clickElement(dnpgrp);
				logInfo("DNP Group is selected from dropdown");
				break;
			}
		}
 
		for (int i = 0; i < GuidanceCost_DNP_Rows.size(); i++) {
 
			String applyGuidanceVal = getDriver().findElement(By
					.xpath(".//*[@id='divDnp']//*[@id='grid']//div[contains(@class,'ag-body-container')]//div[@row-id='"
							+ i + "']/div[@col-id='ApplyGuidance']"))
					.getAttribute("title");
			if (applyGuidanceVal.trim().equals("Y")) {
				clickElement(getDriver().findElement(By.xpath(
						".//*[@id='divDnp']//*[@id='grid']//div[contains(@class,'ag-body-container')]//div[@row-id=" + i
								+ "]/div[@col-id='ApplyGuidance']")));
				loader();
				Select drpDown11 = new Select(costing_Contigency_dropdown);
				drpDown11.selectByVisibleText("N");
				loader();
			}
 
		}
		clickElement(Costing_DNPSaveButton);
		waitForElementToBeVisible(Costing_Contigency_msg);
		if (isDisplayed(Costing_Contigency_msg)) {
			String msg_dnp = getText(Costing_Contigency_msg);
			if (msg_dnp.contains("DNP Details Saved Successfully"))
				logPass("DNP Details Saved Successfully");
			else {
				logFail("Popup gives error message: " + msg_dnp);
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
 
		navigate_costingScreens("Location Premium");
 
		clickElement(Location_add);
		clickElement(Location_ProfileDrpDwn);
		for (WebElement locationprofile : Location_ProfileDrpdwnlist) {
			if (locationprofile.getText().equals(locationProfile)) {
				clickElement(locationprofile);
				logInfo("Location Profile is selected from dropdown");
				break;
			}
		}
 
		clickElement(Location_Payroll);
		clear(Location_Payroll);
		sendKeys(Location_Payroll, locationpayroll);
 
		clickElement(Location_Save);
		waitForElementToBeVisible(Costing_Contigency_msg);
		if (isDisplayed(Costing_Contigency_msg)) {
			String msg_location = getText(Costing_Contigency_msg);
			if (msg_location.contains("Location Premium Details Saved Successfully."))
				logPass("Location Premium Details Saved Successfully.");
			else {
				logFail("Popup gives error message: " + msg_location);
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
	}
}

}
