package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import commonUtility.ExcelUtilities;
import reusableComponents.ConstantUtils;
import reusableComponents.ExcelUtilities;
import reusableComponents.GlobalScreen;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import reusableComponents.FunctionLibrary;


public class  SolutionComponentsPage extends BasePage
{
	public Actions action = new Actions(getDriver());
	
	@FindBy(how = How.XPATH, using = "//li//a[text()='Manage']")
	public WebElement ManageBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Total Opportunities ')]/../../..")
	public WebElement opportunitytile;
	
	@FindBy(how = How.XPATH, using = "//*[text()=' Total Opportunities ']")
	public WebElement Total_opportunitieslink;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement search_filter;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Solution Components']")
	public WebElement SolutionComponents;
	
	@FindBy(how = How.XPATH, using = "//a[@id='ActiveTab']")
	public WebElement Versiontab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ManageVersionsGrid']//div[@role='row' and @row-id='1']//img[@title='Delete']")
	public WebElement delete_image_icon;
	
	@FindBy(how = How.XPATH, using = "//div[@id='DeleteNavdialog']//h4[contains(text(),'Confirm')]")
	public WebElement delete_confirm_popup;
	
	@FindBy(how = How.XPATH, using = "//div[@id='DeleteNavdialog']//em[contains(text(),'Ok')]")
	public WebElement delete_confirm_popup_ok;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'deleted')]")
	public WebElement deleted_success;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ManageVersionsGrid']//div[@role='row' and @row-id='1']//img[@title='Lock/Unlock']")
	public WebElement lock_unlock_image_icon;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Version Locked')]")
	public WebElement locked_success;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Version Un-Locked')]")
	public WebElement Un_locked_success;
	
	@FindBy(how = How.XPATH, using = "//div[@row-id='1']//div[@col-id='SolutionVersionNbrtooltip']//span//a")
	public WebElement version_link;
	
	@FindBy(how = How.XPATH, using = "//p[@id='tabParameters']//a")
	public WebElement parameters_tab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ManageVersionsGrid']//div[@role='row' and @row-id='1']//img[@title='Comments']")
	public WebElement Comment_Icon;
 
	@FindBy(how = How.XPATH, using = "//textarea[@id='commentsText']")
	public WebElement Comment_Area;
 
	@FindBy(how = How.XPATH, using = "//button[@id='saveComments']//em")
	public WebElement Comment_Save;
 
	@FindBy(how = How.XPATH, using = "//p[@id='manageVersionCommentSucErrMsgId']//span")
	public WebElement Save_Message;
 
	@FindBy(how = How.XPATH, using = "//button[@id='idoverlayclose']//span")
	public WebElement Close_Comment;
	
	@FindBy(how = How.XPATH, using = "//div[@id='btn-CopyfromOtherOpportunity']/button/em")
	public WebElement manageVersions_copyOtherOpportunity_btn;
 
	@FindBy(how = How.XPATH, using = "//*[@id='MmsInput']")
	public WebElement manageVersions_copyOpportunity_SourceMMSID;
 
	@FindBy(how = How.XPATH, using = "//*[@id='reasonToCopyText']")
	public WebElement manageVersions_copyOpportunity_ReasontoCopy;
 
	@FindBy(how = How.XPATH, using = "//*[@id='saveCopyfromOtherOpp']")
	public WebElement manageVersions_copyOpportunity_SubmitBtn;
	
	@FindBy(how = How.XPATH, using = "//em[text()='No']/..")
	public WebElement MasterVerConfirmation_Popup_No;
	
	@FindBy(how = How.XPATH, using = "//*[@id='manageVersionSucErrMsgId']//span[@id='errorConfig']")
	public WebElement ManageVer_Msg;
	
	@FindBy(how = How.XPATH, using = "//a[@id='CopyVersionStatusTab']")
	public WebElement copy_version_tab;
	
	@FindBy(how = How.XPATH, using = "//div[@row-index='0']//div[@col-id='SourceMmsId' and @role='gridcell']")
	public WebElement copyTab_SourcemmsID;
	
	@FindBy(how = How.XPATH, using = "//div[@row-index='0']//div[@col-id='TargetMmsId' and @role='gridcell']")
	public WebElement copyTab_TargetmmsID;	
	
	@FindBy(how = How.XPATH, using = "//div[@row-index='0']//div[@col-id='1' and @role='gridcell']//span//span")
	public WebElement copyTab_status;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-CreateNewVersionAO']/button")
	public WebElement CreateNewVersionButton;
	
	@FindBy(how = How.ID, using = "numericInputStringId")
	public WebElement MngVer_textInput;
	
	@FindBy(how = How.ID, using = "defaultValDrpDown")
	public WebElement MngVer_dropdown_select;

	@FindBy(how = How.XPATH, using = "//*[text()= 'Manage']")
	public WebElement Manage_Btn;

	@FindBy(how = How.XPATH, using = "//*[text()=' Total Opportunities ']")
	public WebElement Total_Opportunites;

	@FindBy(how = How.XPATH, using = "//div[@class='ID ag-cell-value'][1]")
	public WebElement MMS_ID;

	@FindBy(how = How.XPATH, using = "//a[text()='Solution Components']")
	public WebElement Solution_Component;
	
	@FindBy(how = How.XPATH, using = "//input[@name='search-ag-grid']")
	public WebElement OPP_ID;
	
	@FindBy(how = How.XPATH, using = "//a[@id='RateCardStatusTab']")
	public WebElement RateCard_Tab;
	
	@FindBy(how = How.XPATH, using = "//li[@id='ConfigureRateCardTab']")
	public WebElement RateCard_SubTab;
	
	@FindBy(how = How.XPATH, using = "//a[@id='addNewRateCard']")
	public WebElement Add_RateCard;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='RateCardNm']//input")
	public WebElement RateCardName;
	
	@FindBy(how = How.XPATH, using = "//div[@role='gridcell' and @col-id='CountryName']")
	public WebElement Country_Location;
	
	@FindBy(how = How.XPATH, using = "//div[@role='gridcell' and @col-id='CurrencyName']")
	public WebElement Currency_Name;
	
	@FindBy(how = How.XPATH, using = "//div[@role='gridcell' and @col-id='MonthofFirstIncreaseName']")
	public WebElement MonthofFirst_IncreaseName;
	
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='FXAssumption']//input")
	public WebElement Fx_Assumption;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='COLAAssumption']//input")
	public WebElement Cola_Assumption;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='PaymentTerm']//input")
	public WebElement PaymentTerm;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='OtherAssumption']//input")
	public WebElement OtherAssumption;
	
	@FindBy(how = How.XPATH, using = "//*[@id='RateCardPopupGrid']/div/div[2]/div[1]/div[3]/div[2]/div")
	public WebElement Scroll_Right;
	
	@FindBy(how = How.XPATH, using = "//img[@data-action-type = 'AddRateCardData']")
	public WebElement AddNewRateCard;
	
	@FindBy(how = How.XPATH, using = "//*[@id='addNewCard']//em[text()='Save']")
	public WebElement Save_Button;
	
	@FindBy(how = How.XPATH, using = "//*[@id='RateCardPopupGrid']//div[@role='gridcell' and @col-id='CountryName']")
	public WebElement CountryLocation_DrpDwn;

	@FindBy(how = How.XPATH, using = "//div[@ref='eList']//div[contains(@class,'select')]")
	public List<WebElement> Country_LocationList;

	@FindBy(how = How.XPATH, using = "//*[@id='RateCardPopupGrid']//div[@role='gridcell' and @col-id='CurrencyName']")
	public WebElement CurrencyName_DrpDWn;

	@FindBy(how = How.XPATH, using = "//div[@class='ag-popup-editor']//div[@class='ag-virtual-list-item']//div[contains(@class,'ag-rich-select-row')]")
	public List<WebElement> Currency_NameList;

	@FindBy(how = How.XPATH, using = "//*[@id='RateCardPopupGrid']//div[@role='gridcell' and @col-id='MonthofFirstIncreaseName']")
	public WebElement MonthofFirst_IncreaseName_DrpDwn;

	@FindBy(how = How.XPATH, using = "//div[@class='ag-virtual-list-container']//div[contains(@class,'ag-virtual-list-item')]")
	public List<WebElement> MonthofFirst_IncreaseNameList;

	@FindBy(how = How.XPATH, using = "//*[@id='RateCardPopupGrid']//div[@col-id='YoyIncreasePct']//input")
	public WebElement Yoyo_Increase;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Differentiation Needed: ']/span")
	public WebElement DifferentiationNeeded;

	// ---------------------------------- new Xpaths
	@FindBy(how = How.XPATH, using = "(//*[@id='classATab']//section[@class='asset-list']//input//following-sibling::span)[1]")
	public WebElement Differentiation_AssetListOption;

	@FindBy(how = How.XPATH, using = "(//*[contains(@id,'BlueRow')]//img[@title='Add value parameter'])[1]")
	public WebElement Differentiation_AddParameterValue;

	@FindBy(how = How.XPATH, using = "//button[@id='commonsave'][text()='Save']")
	public WebElement Differentiation_CommonSave;
	
	@FindBy(how = How.XPATH, using = "//button[@id='FinalSaveId'][text()='Save']")
	public WebElement Differentiation_SustainabilitySave;
	
	@FindBy(how = How.XPATH, using = "//button[@id='FinalSaveId']")
	public WebElement Sustainablity_Save;
	
	@FindBy(how = How.XPATH, using = "//*[@id='classA-tab']")
	public WebElement Differentiation_ClassATab;

	@FindBy(how = How.XPATH, using = "//*[@id='classAchkbox_DVP01']/parent::label")
	public WebElement Differentiation_ValueParameter_CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='classAbtnValue_DVP01']")
	public WebElement Differentiation_ValueParameter_DropDown;

	@FindBy(how = How.XPATH, using = "//*[@id='ulValue']//*[@title='Low']")
	public WebElement Differentiation_ValueParameter_SelectValue;

	@FindBy(how = How.XPATH, using = "//*[@id='ClassAvalueModal']//button[text()='Add']")
	public WebElement Differentiation_AddButton;

	@FindBy(how = How.XPATH, using = "//*[@id='industry-tab']")
	public WebElement Differentiation_IAndI_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='ChildAAssetContentId']//button[text()='Save']")
	public WebElement Differentiation_Save;

	@FindBy(how = How.XPATH, using = "//*[@id='commonreasonId']")
	public WebElement Differentiation_CommonReason;

	@FindBy(how = How.XPATH, using = "//*[@title='Client Mandate']")
	public WebElement Differentiation_Reason_Option;

	@FindBy(how = How.XPATH, using = "//*[text()='I&I Assets']")
	public WebElement Differentiation_I_And_I_Assets;

	@FindBy(how = How.XPATH, using = "//*[@title='Add differentiator']")
	public WebElement Differentiation_AddDifferentiator;

	@FindBy(how = How.XPATH, using = "//div[@row-id='1']//*[@title='Add value parameter']")
	public WebElement Differentiator_AddValueParameter;

	@FindBy(how = How.XPATH, using = "//*[@id='chkboxIA_DVP01']/parent::label")
	public WebElement Differentiator_ValueParameter;

	@FindBy(how = How.XPATH, using = "//*[@id='btnValueIA_DVP01']")
	public WebElement Differentiator_ValueBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='lblIA_DVP01']/..//a[@title='Low']")
	public WebElement Differentiator_ValueOption;

	@FindBy(how = How.XPATH, using = "//*[@id='valueModalIA']//*[text()='ADD']")
	public WebElement Differentiator_AddBtn;

	@FindBy(how = How.XPATH, using = "//*[text()='Acquisitions']")
	public WebElement Differentiation_Acquisitions;

	@FindBy(how = How.XPATH, using = "//*[text()='Venture Partners']")
	public WebElement Differentiation_VenturePartners;

	@FindBy(how = How.XPATH, using = "//em[text()='Differentiation Link']")
	public WebElement DifferentiationLink;

	@FindBy(how = How.XPATH, using = "//*[@id='differentiatorTab']//div[@class='col-3 text-center']/img[@class='anchor__cursor']")
	public List<WebElement> AddDifferentiations;

	@FindBy(how = How.XPATH, using = "//label[@class='checkbox d-block mb-0']")
	public List<WebElement> AssetNameCheckBox;

	@FindBy(how = How.XPATH, using = "//img[@data-target='#valueModal']")
	public List<WebElement> AssetNamePlusIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@row-id=1]//input[@type='checkbox']")
	public WebElement Differentiator_CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='sustainability']")
	public WebElement Sustanability_tab;

	@FindBy(how = How.XPATH, using = "//div[@id='sustainabilityTab']//a[text()='link']")
	public WebElement ReasonForNotSelectingSustainainabilty_link;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mat-select-1']//div[2]")
	public WebElement Arrow_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cdk-overlay-0']//mat-option[3]")
	public WebElement Dropdown_version;
	
	@FindBy(how = How.XPATH, using = "//*[@id='SustainabilityCalcContentId']//button[@id='SaveBtn']//em")
	public WebElement Sustainablity_savebutton;
	
	@FindBy(how = How.XPATH, using = "//button[@id='selectedReleaseId']")
	public WebElement Dropdown_Grouparrow;
	
	@FindBy(how = How.XPATH, using = "//*[@id='releaseDropdownId']//li[1]")
	public WebElement Dropdown_Group;
	
	@FindBy(how = How.XPATH, using = "//em[contains(text(),'sync Now')]")
	public WebElement Sync_savebutton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Overall Differentiation ')]/small")
	public WebElement OverAllDifferentiationValue;

	@FindBy(how = How.XPATH, using = "//*[text()='Differentiation Link']/../../..//em[text()='Refresh']")
	public WebElement Differentiation_Refresh;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(@class,'mat-select-arrow-wrapper')])[3]")
	public WebElement SustainabilityCalc_VersionDrpdwn;

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'mat-option')][2]")
	public WebElement SustainabilityCalc_FirstVersion;

	@FindBy(how = How.XPATH, using = "//*[@id='SustainabilityCalcContentId']//*[@id='SaveBtn']")
	public WebElement SustainabilityCalc_SyncBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='selectedReleaseId']")
	public WebElement SustainabilityCalc_GroupDrpdwn;

	@FindBy(how = How.XPATH, using = "//*[text()='Group 1']")
	public WebElement SustainabilityCalc_Group1Select;

	@FindBy(how = How.XPATH, using = "//*[text()='sync Now']")
	public WebElement SustainabilityCalc_SyncNowBtn;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'confirmtext')]/span")
	public WebElement SustainabilitySync_SuccessMsg;

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'popup-btnclose')]//span[text()='×']")
	public WebElement SustainabilitySync_closepopupbutton;

	@FindBy(how=How.XPATH,using="//*[@id='sustainabilityCalc-tab']//span")
	public WebElement sustainabilitytab_status;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@col-id,'SolutionVersionNbr')][not(@role='presentation')]")
	public List<WebElement> MngVer_verNos;
	
	@FindBy(how = How.XPATH, using = "//*[@id='anchPricingByGroup']")
	public WebElement Pricing_Groups_navigation;

	@FindBy(how = How.XPATH, using = "//*[@id='NavtoOtherdialog']//div//div[3]//div//button//em[text()='Ok']")
	public WebElement Pricing_Groups_PopUpOk;

	@FindBy(how = How.XPATH, using = "//*[@id='NavtoOtherdialog']//div//div")
	public WebElement Pricing_Groups_PopUp;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='SolutionGroupNm' and contains(@class,'ag-cell')]")
	public List<WebElement> Pricing_Groups_GroupNames;

	@FindBy(how = How.XPATH, using = "//div[@col-id='PricingOption' and contains(@class,'ag-cell')]")
	public List<WebElement> Pricing_Groups_PricingOptionCol;

	@FindBy(how = How.XPATH, using = "//*[@id='AOPricedrpDown']")
	public WebElement Pricing_Groups_Select;

	@FindBy(how = How.XPATH, using = ".//*[@id='group']//em[text()='Save']")
	public WebElement Pricing_Groups_Save;

	@FindBy(how = How.XPATH, using = ".//*[@id='SaveConfirmPricing']//em[text()='Ok']")
	public WebElement Pricing_Groups_SavePricingConfirm;

	@FindBy(how = How.XPATH, using = ".//*[@id='errorPricebygroup']")
	public WebElement Pricing_Groups_SuccessMsg;

	@FindBy(how = How.XPATH, using = ".//*[@id='priceByRateCardGroup']")
	public WebElement Pricing_Groups_PricingByRateCard;

	@FindBy(how = How.XPATH, using = ".//*[@id='redirectToStaffing']")
	public WebElement Pricing_Groups_StaffingRedirectYes;

	@FindBy(how = How.XPATH, using = ".//*[@id='defineStaffing']")
	public WebElement Pricing_Groups_StaffingTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='SolutionGroupId']")
	public WebElement Staffing_Groupdrpdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulsolutiongroups']//li")
	public List<WebElement> Staffing_GroupdrpMenuList;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='ag-Grid-AutoColumn']/span[@class='ag-row-group-indent-0'][1]/span[4]/span/span")
	public List<WebElement> Staffing_Profiles_List;

	@FindBy(how = How.XPATH, using = "//div[@col-id='ag-Grid-AutoColumn']/span[@class='ag-row-group-indent-0'][1]/span[3]")
	public List<WebElement> Staffing_CheckBoxes_Profiles_List;
	
	@FindBy(how = How.XPATH, using = ".//*[@id = 'PyramidForm']//div[@class='ag-body-viewport-wrapper']//div[@row-id][not(contains(@class,'expanded'))][not(contains(@class,'contracted'))]//div[@col-id='DealPhase']")
	public List<WebElement> Staffing_Dealphase;

	@FindBy(how = How.XPATH, using = "//*[@id='PyramidGrid']//div[contains(@class , 'ag-body-viewport ')][@role = 'presentation'][@ref]")
	public WebElement Staffing_pyramid_grid;

	@FindBy(how = How.XPATH, using = "//div[@col-id='ag-Grid-AutoColumn']//span[@class='ag-row-group-indent-0']//span[@class='ag-group-expanded']//span")
	public WebElement Staffing_ProfileContract;

	@FindBy(how = How.XPATH, using = "//button[@id='pyramidSaveBtn']//parent::div")
	public WebElement Staffing_PyramidSave;

	@FindBy(how = How.XPATH, using = "//span[@id='errorpyramid']")
	public WebElement Staffing_Msg;

	@FindBy(how = How.XPATH, using = ".//*[@id = 'PyramidForm']//div[@ref='eBodyViewport']")
	public WebElement ViewPyramid_Grid;
	
	@FindBy(how = How.XPATH, using = "//*[@id='importRateCardId']//parent::li//a")
	public WebElement ImportRateCard;
	
	@FindBy(how = How.XPATH, using = "//*[@id='divImportStaffing']/input")
	public WebElement ImportRateCard_Browse;
	
	@FindBy(how = How.XPATH, using = "//*[@id='divImportRateCardcls']")
	public WebElement ImportRateCardWindow;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnImportCR']")
	public WebElement ImportRateCard_OKBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ImportOverwriteConfirmPopupID']//em[text()='OK']//parent::button")
	public WebElement ImportRateCardOverRide_OKBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@row-id='1']//*[@col-id='expimpstatusdesc']/span/span")
	public WebElement ImportRateCard_status;
	
	@FindBy(how = How.XPATH, using = "//div[@row-id='0']//*[@col-id='expimpstatusdesc']/span/span")
	public WebElement ExportRateCard_status;
	
	@FindBy(how = How.XPATH, using = "//div[@role='row']/div[@col-id='RateCardNm']/span/span[@ref='eValue']")
	public List<WebElement> ImportRateCard_Names;
	
	@FindBy(how = How.XPATH, using = "//div[@class='next-img']")
	public WebElement NextScreens;
	
	@FindBy(how = How.XPATH, using = "//div[@class='previous-img']")
	public WebElement PreviousScreens;
	
	//div[@class='previous-img']
	
	@FindBy(how = How.ID, using = "ratecard")
	public WebElement RateCardTable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='liADL']")
	public WebElement GenerateADLBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ADLGrid']//*[@class='ag-body-viewport ag-layout-normal']//div[contains(@class,'ag-body-container')]//div[@row-id='0']//div[@col-id='0']/span/child::*")
	public WebElement ADLStatus;
	
	@FindBy(how = How.XPATH, using = "//div[@id='IsSCCSuggesion']//em[text()='OK']")
	public WebElement SCC_Warning_OK_Btn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ddlADLVersion']")
	public WebElement Solutionshaping_ddlADLVersion;

	@FindBy(how = How.XPATH, using = "//*[@id='ulVersion']/li")
	public WebElement Solutionshaping_R12;

	@FindBy(how = How.XPATH, using = "//*[@id='pricing-factor-general-adl']//button//em[text()='Ok']")
	public WebElement Solutionshaping_btnGenerateADLOK;

	@FindBy(how = How.XPATH, using = "//div[@id='valErrorModal']//button[@class='close']")
	public WebElement ADL_ErrorPopUp_Close;
	
	@FindBy(how = How.ID, using = "ADLGenerationPricingNo")
	public WebElement DataLake_Popup_NO_Btn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'datalake-response')]//*[@title='OK']//ancestor::button")
	WebElement DataLake_ResponcePopUp_Ok;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='ulsolutiongroups']/li")
	public List<WebElement> Staffing_Groupdrpdwn_list;

	@FindBy(how = How.XPATH, using = "//*[@id='SolutionGroupId']")
	public WebElement Staffing_btnGroupdrpDwn;

	@FindBy(how = How.XPATH, using = "//div[@col-id='ag-Grid-AutoColumn']/span[@class='ag-row-group-indent-0'][1]/span[3]/following-sibling::span/span/span")
	public List<WebElement> Staffing_CheckBoxes_Profiles_List_sibling;

	@FindBy(how = How.XPATH, using = "//div[@role='row']/div[@col-id='ActionFields']/span/span/img")
	public List<WebElement> Staffing_SubActions;

	@FindBy(how = How.XPATH, using = "//div[@col-id='ag-Grid-AutoColumn']//span[@class='ag-row-group-indent-0']/span[@class='ag-group-expanded']")
	public List<WebElement> NewStaffing_Expanded;

	@FindBy(how = How.XPATH, using = "//button[@id='pyramidSaveBtn']")
	public WebElement Staffing_Savebtn;

	@FindBy(how = How.XPATH, using = "//span[@id='errorpyramid']")
	public WebElement Staffing_Savemessage;

	@FindBy(how = How.XPATH, using = "//div[@col-id='ag-Grid-AutoColumn']/span[@class='ag-row-group-indent-0'][1]/span[3]")
	public List<WebElement> Staffing_CheckboxesList;
	
	@FindBy(how = How.XPATH, using = "//span[@id = 'SkillinventoryLoadTabSpan']")
	public WebElement Staffing_SkillInventoryTab;

	@FindBy(how = How.XPATH, using = "//li[@title = 'Apply Skill Inventory']//img[contains(@src,'settings')]")
	public WebElement Staffing_ApplySkillInventory;


	@FindBy(how = How.XPATH, using = "//button[@id ='inventoryId']")
	public WebElement Staffing_SelectInventory;

	@FindBy(how = How.XPATH, using = "//ul[@id ='ulinventory']//li//a")
	public List<WebElement> Staffing_InventoryList;

	@FindBy(how = How.XPATH, using = "//button[@id ='capabilityId']")
	public WebElement Staffing_SelectCapability;

	@FindBy(how = How.XPATH, using = "//ul[@id ='ulcapability']//li//a")
	public List<WebElement> Staffing_CapabilityList;

	@FindBy(how = How.XPATH, using = "//button[@id ='specialityId']")
	public WebElement Staffing_SelectSpeciality;

	@FindBy(how = How.XPATH, using = "//ul[@id ='ulspeciality']//li//a")
	public List<WebElement> Staffing_SpecialityList;

	@FindBy(how = How.XPATH, using = "//button[@id ='skillId']")
	public WebElement Staffing_SelectSkill;

	@FindBy(how = How.XPATH, using = "//ul[@id ='ulskill']//li//a")
	public List<WebElement> Staffing_SkillList;

	@FindBy(how = How.XPATH, using = "(//button[@type = 'submit']//em[text()='APPLY'])[2]")
	public WebElement Staffing_ApplySkillSave;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ag-body-container')]//div[@role='row' and contains(@class,'level-1') ]")
	public List<WebElement> Staffing_ExpandedLevels;

	@FindBy(how = How.XPATH, using = "//div[@role = 'row' and contains(@class,'level-1')]//div[@col-id = 'Inventory' and contains(@class,'inline-editing')]")
	public List<WebElement> Staffing_InventoryLevelData;

	@FindBy(how = How.XPATH, using = "//div[@role = 'row' and contains(@class,'level-1')]//div[@col-id = 'Capability' and contains(@class,'inline-editing')]")
	public List<WebElement> Staffing_CapabilityLevelData;

	@FindBy(how = How.XPATH, using = "//div[@role = 'row' and contains(@class,'level-1')]//div[@col-id = 'Speciality' and contains(@class,'inline-editing')]")
	public List<WebElement> Staffing_SpecialityLevelData;

	@FindBy(how = How.XPATH, using = "//div[@role = 'row' and contains(@class,'level-1')]//div[@col-id = 'Skills' and contains(@class,'inline-editing')]")
	public List<WebElement> Staffing_SkillLevelData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='RatecardExport']")
	public WebElement ExportRateCardBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='RateCardExportImportStatusTab']")
	public WebElement RateCardImportExportStatus_Subtab;
	
	@FindBy(how = How.XPATH, using = "//div[@row-id='0']//*[@col-id='FileNm']//a")
	public WebElement DownloadExportedRateCard;
	
	@FindBy(how = How.XPATH, using = "//div[@role='document']//em[text()='I understand']")
	public WebElement ConfidentialPopUp_IUnderstandBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@row-id='0']//*[@col-id='FileNm']//span")
	public WebElement ExportedFileName;
	
	@FindBy(how = How.XPATH, using = "//ag-grid-angular[@id='PyramidGrid']//div[@ref='eBodyViewport']")
	public WebElement StaffingPage_section_pyramidViewPort;
	
	@FindBy(how = How.XPATH, using = "//*[@id='countryId']")
	public WebElement Tax_Config_cntry_dropdwn;

	@FindBy(how = How.XPATH, using = "//*[@id='ulClientContracCountries']/li/a")
	public List<WebElement> Tax_Config_Cntry_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//*[@id='TypeOfServicesId']")
	public WebElement Tax_Config_TService_dropdwn;

	@FindBy(how = How.XPATH, using = "//*[@id='ulTypeOfServices']/li/a")
	public List<WebElement> Tax_Config_TService_Drpdwnlist;

	@FindBy(how = How.XPATH, using = "//*[@id='BrazilianBranchId']")
	public WebElement Tax_Config_Brazilian_dropdwn;

	@FindBy(how = How.XPATH, using = "//*[@id='ulBrazilianBranch']/li/a")
	public List<WebElement> Tax_Config_Brazilian_Drpdwnlist;
	
	@FindBy(how = How.XPATH, using = "//*[@id='configuration']//*[text()='Save']")
	public WebElement Tax_Config_Save;
	
	@FindBy(how = How.XPATH, using = "//*[@id='solutionHourTypeId']")
	public WebElement Staffing_BaseLineEffort_solHrTypeId;

	@FindBy(how = How.XPATH, using = "//a[@id='Client Baseline Hoursanch']")
	public WebElement NDSP_Param2_ClientEstimatedHours;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'com-baseline-input')]/input")
	public List<WebElement> NDSP_baselineHours;

	@FindBy(how = How.XPATH, using = "//button[@id='btnsave2']")
	public WebElement NDSP_savebtn_P2;

	@FindBy(how = How.XPATH, using = "//*[@id='sucErrMsgId']/span")
	public WebElement BaselineEffortsTab_WarningMsg;



	
	@FindBy(how = How.XPATH, using = "//a[text()='Solution Components']")
	public WebElement SolutionComponentTab;
	
	@FindBy(how = How.XPATH, using = "//a[@id='ActiveTab']")
	public WebElement versionTab;
	
	@FindBy(how = How.XPATH, using = "//a[@id='ActiveTab']//parent::li")
	public WebElement versionTab_Active;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='SolutionVersionNm']//input[@class='sw-data edit-data']")
	public WebElement versionNameTxtbox;	
	@FindBy(how = How.XPATH, using = "//input[@id='numericInputStringId']")
	public WebElement versionInput;

	@FindBy(how = How.XPATH, using = "//span[@class='action-icon  ']//img[@title='Save']")
	public WebElement saveBtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'editing')]//div[@col-id='SelfEnabled']")
	public WebElement selfEnable_field;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'editing')]//div[@col-id='SelfEnabled']//select")
	public WebElement selfEnable_dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'editing')]//div[@col-id='MilestoneStage']")
	public WebElement milestone_field;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'editing')]//div[@col-id='MilestoneStage']//select")
	public WebElement milestone_dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'editing')]//div[@col-id='SolutionType']")
	public WebElement solutionType_field;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'editing')]//div[@col-id='SolutionType']//select")
	public WebElement solutionType_dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row']")
	public List<WebElement> versionList;
	
	@FindBy(how = How.XPATH,using="//*[@id='btn-CreateNewVersionAO']//*[text()='Create New Version']")
	public WebElement createNewVersion;	
	
	@FindBy(how = How.XPATH,using="//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row']//div[@col-id='SolutionVersionNm']/span/input[not(contains(@class,'disabled'))]//ancestor::div[@role='row']")
	public WebElement newVersionSpace;
	
	@FindBy(how = How.XPATH, using = "//em[text()='No']")
	public WebElement CopyVer_MasterVerConfirmation_Popup_No;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='SolutionVersionNm'][not(@role='presentation')]")
	public List<WebElement> MngVer_verNames;

	@FindBy(how = How.ID, using = "copyVersionId")
	public WebElement MngVer_CopyVer_SelectMRDBVer_popup_Ok;
	
	@FindBy(how = How.ID, using = "CopyVersionStatusTab")
	public WebElement copyVersionStatus_tab;

	@FindBy(how = How.ID, using = "ActiveTab")
	public WebElement Versions_tab;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@col-id,'SourceCopyVersionNbr')][not(@role='presentation')]")
	public List<WebElement> versions_text_SourceCopyVersionNbr;
	
	@FindBy(how = How.XPATH, using = "//div[@id='SolutionComponents']/p")
	public WebElement sol_Component_Div;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ErroneousFilter']/a/img")
	public WebElement showErrorIcon;

	@FindBy(how = How.XPATH, using = "//*[@id='erroneousFilterPopup']//h4[@id='NavdialogLabel' and text()='Confirm']")
	public WebElement showErrorPop;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAgree']/em")
	public WebElement showErrorPop_Ok;
	
	
	
	public SolutionComponentsPage() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method id to Search a MMS Id for Lead SA Dashboard
	 * 
	 * @since 01/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	public void searchMMSID(String mmsid) throws Exception{

		waitForElementToBeVisible(search_filter);
		sendKeys(search_filter,mmsid);
		clickElement(getDriver().findElement(By.xpath("//div[@class='MMSID']//div[contains(text(),'"+mmsid+"')]")));
	}
	
	/**
	 * This method is to Navigate to Solution Components Versions page from Landing Page
	 * 
	 * @since 01/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	public void NavigatetoSolutionComponents(String MMSID) throws Exception 
	{
		navigateToManage();
		waitForElementToBeVisible(opportunitytile);
		clickElement(Total_opportunitieslink);
		searchMMSID(MMSID);
	    waitForElementToAppear(SolutionComponents);
	    waitForElementToBeVisible(SolutionComponents);
	    loader();
	    clickElement(SolutionComponents);
		waitForElementToAppear(Versiontab);
		if(Versiontab.isDisplayed())
			logInfo("SA is able to navigate to Manage Version Screen on click Solution components.");
	
	}
	
	/**
	 * This Method is to Create a new version
	 * 
	 * @since 27/02/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	public void CreateNewVersion() throws Exception {
		
		waitForElementToAppear(CreateNewVersionButton);
		clickElement(CreateNewVersionButton);
		
		String rowID = getDriver().findElement(By.xpath(
				".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row']//div[@col-id='SolutionVersionNm']/span/input[not(contains(@class,'disabled'))]/../../.."))
				.getAttribute("row-id");

		By manageVersion_grid_row = By.xpath(
				".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"
						+ rowID + "']//div[@col-id='SolutionVersionNm']");

		waitForElementToBeVisible(manageVersion_grid_row);
		clickElement(getDriver().findElement(By.xpath(
				".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"
						+ rowID + "']//div[@col-id='SolutionVersionNm']")));
		sendKeys(MngVer_textInput,"testing");

		clickElement(getDriver().findElement(By.xpath(".//*[@id='ManageVersionsGrid']//div[@role='row' and @row-id='"
				+ rowID + "']//div[@col-id='ActionField']//img[@title='Save']")));
		
		//click on pop up
		clickElement(MasterVerConfirmation_Popup_No);
		

		String msg = "";
		try {
			msg = waitForElementToBeVisible(ManageVer_Msg).getAttribute("title");
		} catch (Exception e) {
		}

		if (msg.equals(
				"Version saved successfully. Deleted version number will not be available for the newly created version."))
			logInfo("Version is Created Successfully");
		
	}
	
	/**
	 * TC 18 : Validate if the SA is able to Lock/Unlock the version on click of Lock/Unlock button under Action column.
	 * 
	 * @since 27/02/2024
	 * @release March 16
	 * @author kamali.a.babu
	 * 
	 */
	
	public void DeleteVersion() throws Exception
	{
		boolean scenarioFlag = true;
		
		try {
			clickElement(delete_image_icon);
			waitForElementToAppear(delete_confirm_popup);
			waitForElementToBeVisible(delete_confirm_popup);
			clickElement(delete_confirm_popup_ok);
		}catch(Exception e) {
			delete_image_icon.click();
			waitForElementToBeVisible(delete_confirm_popup);
			waitForElementToAppear(delete_confirm_popup);
			delete_confirm_popup_ok.click();
		}
		waitForElementToAppear(deleted_success);
		if(deleted_success.getText().trim().equals("Solution Version has been deleted successfully"))
		{
			logPass("Solution Version has been deleted successfully.");
		}
		else {
			logFail("Solution Version has not been deleted successfully.");
			scenarioFlag = false;
		}
			
		if (scenarioFlag == true)
		   scenarioPass();
		
	}
	
	/**
	 * TC 18 : Validate if the SA is able to Lock/Unlock the version on click of Lock/Unlock button under Action column.
	 * 
	 * @since 27/02/2024
	 * @release March 16
	 * @author kamali.a.babu
	 * 
	 */
	
	public void Lock_unlock_version() throws Exception
	{
		
		boolean scenarioFlag = true;
		
		waitForElementToBeVisible(lock_unlock_image_icon);
		clickElement(lock_unlock_image_icon);
		waitForElementToAppear(locked_success);
		//Lock the version
		if(locked_success.getText().trim().equals("Solution Version Locked successfully."))
		{
			logPass("Solution Version has been Locked successfully.");
		}
		else {
			logFail("Solution Version has not been Locked successfully.");
			scenarioFlag = false;
		}
		//Unlock the version
		clickElement(lock_unlock_image_icon);
		waitForElementToAppear(Un_locked_success);
		if(Un_locked_success.getText().trim().equals("Solution Version Un-Locked successfully."))
		{
			logPass("Solution Version has been Un-Locked successfully.");
		}
		else {
			logFail("Solution Version has not been Un-Locked successfully.");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
		   scenarioPass();
	}
	
	/**
	 * TC 18 : Validate if the SA is able to Lock/Unlock the version on click of Lock/Unlock button under Action column.
	 * 
	 * @since 27/02/2024
	 * @release March 16
	 * @author kamali.a.babu
	 * 
	 */
	
	public void NavigationtoParametersTab() throws Exception{
		
		boolean scenarioFlag = true;
		waitForElementToBeVisible(version_link);
		clickElement(version_link);
		waitForElementToAppear(parameters_tab);
		app_loader(getDriver().findElement(By.id("ng-loaderimgP")));
		if(getText(parameters_tab).trim().equals("Parameters"))
		{
			logPass("Navigate to Parameters tab of the respective Version by clicking on the Verison Number");
		}
		else {
			logFail("Not able to Navigate to Parameters tab of the respective Version by clicking on the Verison Number");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
		   scenarioPass();
		
	}
	
	/**
	 * TC 19 : Validate if the SA is able to Add comment on click of Comment button under Action column..
	 * 
	 * @since 27/02/2024
	 * @release March 16
	 * @author riya.c.goyal
	 * 
	 */
	public void add_comment() throws Exception {
		boolean scenarioFlag = false;
		
		String comments = "New Test success ";
		
		waitForElementToBeVisible(Comment_Icon);
		clickElement(Comment_Icon);
 
		waitForElementToBeVisible(Comment_Area);
		clickElement(Comment_Area);
 
		sendKeys(Comment_Area, comments);
		clickElement(Comment_Save);
 
		String message = "";
		try {
			message = waitForElementToBeVisible(Save_Message).getAttribute("title");
		} catch (Exception e) {
		}
 
		if (message.equals("Change logged successfully."))
			logPass("Comment is successfully saved");
		else {
			logFail("Comment gives error message: " + message);
			scenarioFlag = false;
 
		}
		clickElement(Close_Comment);
	}
	/**
	 * This method is to Copy Version from Other opportunity but this is not in Scope for March 16 release as per manual team's confirmation
	 * 
	 * @since 01/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	
	public void copyVersionFromOtherOpportunity(String MMSID) throws Exception {
		boolean scenarioFlag = true;
		
		//getDriver().get("https://mysolutionplannernextgencore.ciostage.accenture.com/MySP/Solutions/18847/708115/17/ManageVersions");
		waitForElementToBeVisible(manageVersions_copyOtherOpportunity_btn);
		clickElement(manageVersions_copyOtherOpportunity_btn);
		waitForElementToBeVisible(manageVersions_copyOpportunity_SourceMMSID);
		clear(manageVersions_copyOpportunity_SourceMMSID);
		clickElement(manageVersions_copyOpportunity_SourceMMSID);
		sendKeys(manageVersions_copyOpportunity_SourceMMSID, MMSID);
		waitForElementToBeVisible(getDriver().findElement(By.xpath("//a[@id='searchdropdownlist'][contains(text(),'" + MMSID + "')]")));
        clickElement(getDriver().findElement(By.xpath("//a[@id='searchdropdownlist'][contains(text(),'" + MMSID + "')]")));
        waitForElementToBeVisible(manageVersions_copyOpportunity_ReasontoCopy);
        clickElement(manageVersions_copyOpportunity_ReasontoCopy);
		sendKeys(manageVersions_copyOpportunity_ReasontoCopy,"Copy Version from Existing Opportunity Test");
 
		clickElement(manageVersions_copyOpportunity_SubmitBtn);
		clickElement(MasterVerConfirmation_Popup_No);
		if(ManageVer_Msg.getText().trim().equals("Request queued successfully.Please navigate to Copy Version Status tab to view the progress."))
		{
			logPass("Request queued successfully.");
		}
		else {
			logFail("Request is not queued successfully.");
			scenarioFlag = false;
		}
		clickElement(copy_version_tab);
		waitForElementToBeVisible(copyTab_SourcemmsID);
		String sourceMmsID = copyTab_SourcemmsID.getText().trim();
		String targetMmsID = copyTab_TargetmmsID.getText().trim();
		String msg = copyTab_status.getText().trim();
		if(sourceMmsID.equals(MMSID)  && targetMmsID.equals(MMSID) && msg.equals("Completed"))
		{
			logPass("SA is able to copy a version from another deal using Copy From Other Opportunity button");
		}
		else {
			logFail("SA is not able to copy a version from another deal using Copy From Other Opportunity button");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
		   scenarioPass();
	}
	
	////***********************************************Rate Card ************************************//

	/**
	 * This method is to Navigate to Manage Page
	 * 
	 * @since 02/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	public void navigateToManage() throws Exception {

		waitForElementToAppear(Manage_Btn);
		clickElement(Manage_Btn);

	}
	
	/**
	 * TC 21 : Validate if SA is able to add Rate Card.
	 * 
	 * @since 02/03/2024
	 * @release March 16
	 * @author riya.c.goyal
	 * 
	 */
	
	public void add_RateCard(String FilePath, String Sheet, int Row, int Col) throws Exception {
		
		boolean scenarioFlag = false;
		
		waitForElementToBeVisible(RateCard_Tab);
		clickElement(RateCard_Tab);

		String ratecardTab = RateCard_SubTab.getAttribute("class");
		if (ratecardTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to Rate Card tab");
		} else {
			logFail("Failed to navigate to Rate Card tab");
			scenarioFlag = false;
		}

		waitForElementToAppear(Add_RateCard);
		clickElement(Add_RateCard);
		String A = "test";
		String generatedString = RandomStringUtils.randomAlphabetic(10);
		generatedString = A.concat(generatedString);
		//System.out.println(generatedString);
		
		waitForElementToAppear(RateCardName);
		waitForElementToBeVisible(RateCardName);
		clickElement(RateCardName);
		sendKeys(RateCardName, generatedString);
		
		waitForElementToAppear(getByLocator(CountryLocation_DrpDwn));
		waitForElementToBeVisible(CountryLocation_DrpDwn);
		clickElement(CountryLocation_DrpDwn);
		String desiredElementText = ExcelUtilities.SetExcelPath(FilePath, Sheet, 0, 1);
		System.out.println(desiredElementText);
		for (WebElement element : Country_LocationList) {
			if (element.getText().equalsIgnoreCase(desiredElementText)) {
				clickElement(element);
				logInfo("Country is Selected");
				break;
			}
	}
		waitForElementToAppear(getByLocator(CurrencyName_DrpDWn));
		waitForElementToBeVisible(CurrencyName_DrpDWn);
		clickElement(CurrencyName_DrpDWn);
		String currencyname = ExcelUtilities.SetExcelPath(FilePath, Sheet, 1, 1);
		System.out.println(currencyname);
		for (WebElement element : Currency_NameList) {
			if (element.getText().trim().equals(currencyname)) {
				clickElement(element);
				logInfo("Currency is Selected");
				break;
			}
		}
		waitForElementToAppear(getByLocator(MonthofFirst_IncreaseName_DrpDwn));
		waitForElementToBeVisible(MonthofFirst_IncreaseName_DrpDwn);
		clickElement(MonthofFirst_IncreaseName_DrpDwn);
		String monthofincrease = ExcelUtilities.SetExcelPath(FilePath, Sheet, 2, 1);
		for (WebElement element : MonthofFirst_IncreaseNameList) {
			if (element.getText().equals(monthofincrease)) {
				clickElement(element);
				logInfo("Month of First Increase added");
				break;
			}
		}

		scrollHorizontallyInsideElement(Scroll_Right, 1000);
		
		
		String yoyincrease = ExcelUtilities.SetExcelPath(FilePath, Sheet, 3, 1);
	    waitForElementToBeVisible(Yoyo_Increase);
		clickElement(Yoyo_Increase);
		sendKeys(Yoyo_Increase,yoyincrease);
		
		waitForElementToBeVisible(AddNewRateCard);
		clickElement(AddNewRateCard);
		logInfo("New Row Added Successfully");

		waitForElementToBeVisible(Save_Button);
		clickElement(Save_Button);
		logInfo("Row is added and Saved Successfully");
	}
	
	
	/**
	 * Method to select the very first version after Master version created version
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	
	public String RefreshVersion() throws Exception 
	{
		String versionRowID = "";
		if (MngVer_verNos.size() == 1)
			versionRowID = "0";
		else
			versionRowID = "1";

		By version_by = By.xpath(".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"+ versionRowID + "']//div[contains(@col-id,'SolutionVersionNbr')]/span/a");
		waitForElementToAppear(version_by);
		WebElement version = getDriver().findElement(version_by);
		String MyVersion = getText(version);
		
		clickElement(version);

		logInfo("Version " + MyVersion + " is selected and navigated to Parameters screen");
		logInfo(getDriver().getCurrentUrl());
		return MyVersion;
	}
	
	/**
	 * Method to Navigate to subtab - Group under Pricing Input
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	public void Pricing_groups_navigation() throws Exception 
	{
		loader();
		Navigate_to_subTab(GlobalScreen.SUBTAB_GROUP);
		
		try {
			waitForElementToBeVisible(Pricing_Groups_PopUp);
		if (Pricing_Groups_PopUp.isDisplayed()) {
			clickElement(Pricing_Groups_PopUpOk);
			scroll(400);
		}
		}catch(Exception e) {}
	}
	
	/**
	 * Method to change Group to Hourly Rate in Pricing Input Screen for Test Case - 
	 * TC 22 : Validate if SA is able to Apply Rate Card to staffing records if Pricing input is selected as Hourly.
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	
	public void ChangeGroupToHourlyRate(String FilePath, int row) throws Exception {
		boolean scenarioFlag = false;
		
		String groups[] = getExcelValue(FilePath, "Pricing_Groups", row, 0).split(",");
		
		for (int i = 0; i < groups.length; i++) {
			System.out.println(groups[i]);
			for (int j = 0; j < Pricing_Groups_GroupNames.size(); j++) {
				if (getText(Pricing_Groups_GroupNames.get(j)).equals(groups[i].trim())) {
					clickElement(Pricing_Groups_PricingOptionCol.get(j));
					Select pricingSelection = new Select(Pricing_Groups_Select);
					pricingSelection.selectByVisibleText("Hourly Rate");
					
					break;
				}
			}
		}waitForElementToBeVisible(Pricing_Groups_Save);
		//loader();
		clickElement(Pricing_Groups_Save);
		try {
			clickElement(Pricing_Groups_SavePricingConfirm);
		} catch (Exception E) {
			logInfo("Confirm Pop up not present");
		}
		waitForElementToAppear(Pricing_Groups_SuccessMsg);
		waitForElementToBeVisible(Pricing_Groups_SuccessMsg);
		if (getText(Pricing_Groups_SuccessMsg).equalsIgnoreCase("Pricing By Group Saved Successfully."))
			logPass("The Hourly Rate Pricing Option is successfully selected for the groups :"
					+ String.join(",", groups) + "");
		else {
			logFail("The Hourly Rate Pricing Option is  not selected for the groups :" + String.join(",", groups) + "");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();
	}
	
	/**
	 * Method to Check if Rate Card details is applied to Staffing records if Pricing Input is selected as Hourly.
	 * TC 22 : Validate if SA is able to Apply Rate Card to staffing records if Pricing input is selected as Hourly.
	 * 
	 * @since 29/02/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	
	public void Staffing_RateCardApply(String FilePath, int No) throws Exception {	
			
			boolean scenarioFlag = true;
			loader();
			String Group = getExcelValue(FilePath, "Pricing_Groups", No, 0).trim();
			scroll(-800);
			
			String GroupSplit[] = Group.split(",");
			//for (int g = 0; g < GroupSplit.length; g++) { changed for AMS flow
			for (int g = 0; g < 1; g++) {
				clickElement(Staffing_Groupdrpdown);
				loader();
				for (int i = 0; i < Staffing_GroupdrpMenuList.size(); i++) {
					if (getText(Staffing_GroupdrpMenuList.get(i)).equalsIgnoreCase(GroupSplit[g])) {
						clickElement(Staffing_GroupdrpMenuList.get(i));
						break;
					}
				} 
				loader();
			
				clickElement(showErrorIcon);
				waitForElementToBeVisible(showErrorPop);
				String popText = getText(showErrorPop);
				if (popText.equals("Confirm")) {
					clickElement(showErrorPop_Ok);
				}
				
				for (int j = Staffing_Profiles_List.size(); j > 0; j--) {
					waitForElementToBeVisible(Staffing_CheckBoxes_Profiles_List.get(j - 1));
					clickElement(Staffing_CheckBoxes_Profiles_List.get(j - 1));
					
					int SDSize = 0;
					System.out.println(Staffing_Dealphase.size());
				
					scrollHorizontallyInsideElement(ViewPyramid_Grid, 5000);
					//scroll("bottom");
					List<WebElement> ErrorRateCardName = getDriver()
							.findElements(By.xpath("//div[@col-id='RateCardName'][contains(@class,'error-cell')]"));
					for (int k = 0; k < ErrorRateCardName.size(); k++) 
					{
						if (k == 0) 
						{
							clickElement(ErrorRateCardName.get(k));
							
						}
						else
						{
							scrollToElement(ErrorRateCardName.get(k));
							//clickElement(ErrorRateCardName.get(k));
							action.sendKeys(Keys.ARROW_DOWN).perform();
							action.sendKeys(Keys.ENTER).perform();
						}

						if (k == ErrorRateCardName.size() - 1) {
							for (int i = 0; i < 30; i++) {
								action.sendKeys(Keys.ARROW_UP).perform();
							}
						}
					}
					clickElement(Staffing_pyramid_grid);
					scrollHorizontallyInsideElement(ViewPyramid_Grid, -1000);
				
					clickElement(Staffing_ProfileContract);
					loader();
				}
				scroll(800);
				clickElement(Staffing_PyramidSave);
				loader();
				if (Staffing_Msg.getAttribute("title").contains("Staffing Records Saved Successfully")||Staffing_Msg.getAttribute("title").contains("No records modified."))
					logPass("The Rate Card Names and the External Roles are applied successfully for the Group: " + Group
							+ "");
				else {
					logFail("The Rate Card Names and the External Roles are not applied for the Group: " + Group + "");
					scenarioFlag = false;
				}
			}
			if (scenarioFlag == true)
				scenarioPass();		
	}

	
	/**
	 * TC 23 : Validate if SA is able to Export to Rate Card and see if all the records are flowing to Rate Card Exported Excel.
	 * Note - We are testing the Export Functionality only and not doing Excel Validations
	 * @since 4/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * 
	 */
	
	public String ExportRateCardValidation() throws Exception {
		boolean scenarioFlag = true;
		
		clickElement(ExportRateCardBtn);
		waitForElementAttributeContainsString(RateCardImportExportStatus_Subtab, "class", "active");
		
		if(RateCardImportExportStatus_Subtab.getAttribute("class").contains("active")) {
			logPass("Rate Card Export Request is Queued successfully & Navigated to Import Export Status tab");
		}
		else {
			logFail("Rate Card Export Request is not Queued");
			scenarioFlag = false;
		}
		
		//checking the Exported Rate Card Status to be changed to Completed
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())							
				.withTimeout(Duration.ofSeconds(1000)) 			
				.pollingEvery(Duration.ofSeconds(5)) 			
				.ignoring(Exception.class);		
		wait.until(ExpectedConditions.textToBePresentInElement(ExportRateCard_status, "Completed"));
		
		if(ExportRateCard_status.getText().contains("Completed")) {
			logPass("Rate Card has been Exported Successfully");
		}
		else {
			logFail("Rate Card has not been Exported Successfully");
			scenarioFlag = false;
		}
		
		String FileName = ExportedFileName.getText();
		
		clickElement(DownloadExportedRateCard);
		waitForElementToAppear(ConfidentialPopUp_IUnderstandBtn);
		clickElement(ConfidentialPopUp_IUnderstandBtn);
		loader();
			
		if(scenarioFlag == true)
			scenarioPass();
		return FileName;
		
	}
	
	
	/**
	 * TC 24 : Validate if SA is able to import Rate Card and the changes made are reflecting in UI.
	 * Note - We are testing the Import Functionality only and not doing Excel Validations
	 * @since 4/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
	public void ImportRateCardValidation(String FileName) throws Exception {
		boolean scenarioFlag = true;
		
		String FilePath = ConstantUtils.DownloadedFiles_FilePath.concat(FileName) ;
		
		clickElement(RateCard_SubTab);
		waitForElementToAppear(ImportRateCard);
		
//		for(int i=0;i<5;i++) {
//			ImportRateCard.click();
//			jse.executeScript("arguments[0].click();", ImportRateCard);
//			action.click(ImportRateCard).build().perform();
//			if(ImportRateCardWindow.getAttribute("class").contains("active")) {
//				break;
//			}
//		}
		
		boolean flag = true;
		while(flag) {
			action.moveToElement(getDriver().findElement(By.xpath("//*[@id='importRateCardId']//parent::li//a//img[1]")));
			jse.executeScript("arguments[0].click();", getDriver().findElement(By.xpath("//*[@id='importRateCardId']//parent::li//a//img[2]")));
		
			if(ImportRateCardWindow.getAttribute("class").contains("active")) {
				flag = false;
			}
		}
		
		
		waitForElementToAppear(ImportRateCard_Browse);
		
		sendKeys(ImportRateCard_Browse, FilePath);
		
		try {
			waitForElementToBeVisible(ImportRateCard_OKBtn);
			ImportRateCard_OKBtn.click();
		}catch(Exception e) {
//			clickElement(ExportRateCardBtn);
//			waitForElementAttributeContainsString(RateCardImportExportStatus_Subtab, "class", "active");
//			clickElement(RateCard_SubTab);
			waitForElementToAppear(ImportRateCard);
			jsClick(ImportRateCard);
		}
		
		try {
			waitForElementToAppear(ImportRateCardOverRide_OKBtn);
			clickElement(ImportRateCardOverRide_OKBtn);
		}catch(Exception e)
		{
			logInfo("The Import Pop up is not Present !");
		}
		
		waitForElementAttributeContainsString(RateCardImportExportStatus_Subtab, "class", "active");
		
		if(RateCardImportExportStatus_Subtab.getAttribute("class").contains("active")) {
			logPass("Rate Card Import Request is Queued successfully & Navigated to Import Export Status tab");
		}
		else {
			logFail("Rate Card Import Request is not Queued");
			scenarioFlag = false;
		}
		
		
		if(scenarioFlag == true)
			scenarioPass();
		
	}
	
	/**
	 * Method to Click on Next Button to see Next hidden Screens
	 * 
	 * @since 1/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
	public void NavigatetoNextScreens() throws Exception {
		clickElement(NextScreens);
	}
	
	public void NavigatetoPreviousScreens() throws Exception {
		clickElement(PreviousScreens);
	}
	
	/**
	 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
	 * 
	 * @since 1/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
	public void GenerateADL() throws Exception {
		
		boolean scenarioFlag = true;
		clickElement(GenerateADLBtn);
		
		try {
			clickElement(SCC_Warning_OK_Btn);
		}catch(Exception e) {}
		expandDropdown(Solutionshaping_ddlADLVersion);
		clickElement(Solutionshaping_R12);
		waitForElementToBeVisible(Solutionshaping_btnGenerateADLOK);
		clickElement(Solutionshaping_btnGenerateADLOK);
		
		HandleDataLakePopUp_ADL_Generation();
		
		/*
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())							
				.withTimeout(Duration.ofSeconds(200)) 			
				.pollingEvery(Duration.ofSeconds(5)) 			
				.ignoring(Exception.class);		
		wait.until(ExpectedConditions.textToBePresentInElement(ADLStatus, "Completed"));
		
		if(ADLStatus.getText().contains("Completed")) {
			logPass("ADL has been Generated Successfully");
		}
		else if(ADLStatus.getText().contains("Validation Error")) {
			logFail("ADL has not been Generated.");
			scenarioFlag = false;
		}*/

		if (scenarioFlag == true)
			scenarioPass();
	}
	
	/**
	 * Method to handle Data Lake Pop up while generating ADL to support below TC
	 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
	 * 
	 * @since 1/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
	public void HandleDataLakePopUp_ADL_Generation() throws Exception {
		
		By DataLake_Popup_By =  By.id("ADLGenerationPricingNo");
		try
		{
			waitForElementToAppear(DataLake_Popup_By);
			waitForElementToBeVisible(DataLake_Popup_By);
			clickElement(DataLake_Popup_NO_Btn);
			waitForElementToAppear(DataLake_ResponcePopUp_Ok);
			waitForElementToBeVisible(DataLake_ResponcePopUp_Ok);
			waitForElementClickable(DataLake_ResponcePopUp_Ok);
			clickElement(DataLake_ResponcePopUp_Ok);
			
		}
		catch (Exception e) 
		{
			try {
				clickElement(DataLake_ResponcePopUp_Ok);
			} catch (Exception e2) {
				logInfo("DataLake Popup not present");
			}
		}
		
	} 
	
	public void EnterSkillCapabilities() {
		boolean scenarioFlag = true;
		
	}

	/**
	 * Method to apply skills and Capabilities in Staffing screen to support below TC
	 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
	 * @since 04/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
public void Apply_SkillsCapabilities() throws Exception {

	boolean scenarioFlag = true;
	for (int i = 0; i < Staffing_Groupdrpdwn_list.size(); i++) 
	{
		
		scrollToElement(Staffing_btnGroupdrpDwn);
		loader();
		clickElement(Staffing_btnGroupdrpDwn);
		loader();
		waitForElementToBeVisible(Staffing_Groupdrpdwn_list.get(i));
		clickElement(Staffing_Groupdrpdwn_list.get(i));
		
		//Staffing_Pageload_check(0);
		loader();
		for (int y = Staffing_CheckboxesList.size(); y > 0; y--) {
			clickElement(Staffing_CheckboxesList.get(y - 1));
		
			clickElement(Staffing_SkillInventoryTab);
			clickElement(Staffing_ApplySkillInventory);
			clickElement(Staffing_ApplySkillSave);
		}
		
		clickElement(Staffing_PyramidSave);
		
		try {
			scrollToElement(Staffing_CheckboxesList.get(0));
			
			clickElement(Staffing_CheckboxesList.get(0));
			
			clickElement(Staffing_SkillInventoryTab);
			}catch(Exception e) {}
		
	}
	
	if (scenarioFlag == true)
		scenarioPass();

}

/**
 * Method to Enter Baseline data values in Staffing screen - for supporting below TC
 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
 * @since 1/03/2024
 * @release March 16
 * @author rupali.umat
 * @throws Exception 
 * 
 */
public void StaffingBaselineData() throws Exception {
		boolean scenarioFlag = true;
	
		loader();
	clickElement(Staffing_BaseLineEffort_solHrTypeId);
	
	clickElement(NDSP_Param2_ClientEstimatedHours);
	
	clickElement(NDSP_baselineHours.get(0));
	clear(NDSP_baselineHours.get(0));
	sendKeys(NDSP_baselineHours.get(0),"23");
	Actions action = new Actions(getDriver());
	action.sendKeys(Keys.TAB).build().perform();
	clickElement(NDSP_savebtn_P2);
	loader();
	String text = BaselineEffortsTab_WarningMsg.getAttribute("title");
	if (text.contains("Baseline Efforts saved successfully")) {
		logPass("Baseline Efforts saved successfully");
	} else {
		logFail("Baseline Efforts not saved successfully");
		scenarioFlag = false;
	}
	if (scenarioFlag == true)
		scenarioPass();
}


	public void Staffing_Pageload_check(int loaderIndex) throws Exception {
		try {
			clickElement(Staffing_btnGroupdrpDwn);
		
			clickElement(Staffing_btnGroupdrpDwn);
		
		} catch (Exception e) {
			loaderIndex = loaderIndex + 1;
			
			jse.executeScript("window.scrollBy(0,-900)", "");
			if (loaderIndex < 15)
				Staffing_Pageload_check(loaderIndex);
	}
}
	
	
	/**
	 * Method to Apply Bill Code in missing rows in Staffing screen - for supporting below TC
	 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
	 * @since 1/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
public void BillCode_Apply() throws Exception, IOException 
{
	boolean scenarioFlag = true;
		
	By profileNameColumn = By.xpath("//div[@col-id='ag-Grid-AutoColumn'][@role='presentation']");
			waitForElementToAppear(profileNameColumn);
			waitForElementToBeVisible(getDriver().findElement(By.xpath("//div[@col-id='ag-Grid-AutoColumn'][@role='presentation']")));
			
			waitForElementToBeVisible(Staffing_Groupdrpdwn_list);
			for (int i = 0; i < Staffing_Groupdrpdwn_list.size(); i++) 
			{
				waitForElementToAppear(Staffing_btnGroupdrpDwn);
				waitForElementToBeVisible(Staffing_btnGroupdrpDwn);
				waitForElementClickable(Staffing_btnGroupdrpDwn);
				
				expandDropdown(Staffing_btnGroupdrpDwn);
				
				waitForElementToBeVisible(Staffing_Groupdrpdwn_list.get(i));
				String grouptext = Staffing_Groupdrpdwn_list.get(i).getAttribute("id");
				
				clickElement(Staffing_Groupdrpdwn_list.get(i));
				jse.executeScript("window.scrollBy(0,-500)", "");
			   
				List<String> Profilenames = new ArrayList<String>();
				waitForElementToBeVisible(Staffing_Profiles_List);
				for (int s = 0; s < Staffing_Profiles_List.size(); s++) 
				{
					List<WebElement> Staffing_Profiles_List = getDriver().findElements(By.xpath("//div[@col-id='ag-Grid-AutoColumn']/span[@class='ag-row-group-indent-0'][1]/span[4]/span/span"));
					String Text = Staffing_Profiles_List.get(s).getAttribute("title").trim();
					Profilenames.add(Text);
				}
				for (int k = 0; k < Profilenames.size(); k++) 
				{
					resetProfileSelection();
					
					By Staffing_CheckBoxes_Profiles_List_By = By.xpath("//div[@col-id='ag-Grid-AutoColumn']//span[@class='ag-row-group-indent-0']/span[contains(@class,'checkbox')]");
					waitForElementToAppear(Staffing_CheckBoxes_Profiles_List_By);
					
					checkboxloop: for (int g = 0; g < Staffing_CheckBoxes_Profiles_List.size(); g++) 
					{
						waitForElementToAppear(getByLocator(Staffing_CheckBoxes_Profiles_List_sibling.get(g)));
						waitForElementToBeVisible(getByLocator(Staffing_CheckBoxes_Profiles_List_sibling.get(g)));
						String Text = Staffing_CheckBoxes_Profiles_List_sibling.get(g).getAttribute("title").trim();
						if (Text.equals(Profilenames.get(k))) 
						{
							scrollToElement(Staffing_CheckBoxes_Profiles_List.get(g));
							clickElement(Staffing_CheckBoxes_Profiles_List.get(g));
							
								try 
								{
									By BillCodeDesc = By.xpath("//div[contains(@class,'level-1')]//div[@col-id='BillCodeDesc'][not(@role='presentation')]");
									waitForElementToBeVisible(BillCodeDesc);
									
									WebElement BillCodeEmpty = getDriver().findElement(By.xpath("//div[@row-index=0]//div[@col-id='BillCodeDesc'][not(@role='presentation')]"));
									clickElement(BillCodeEmpty);
									
									List<WebElement> ErrorBC = getDriver().findElements(By.xpath("//div[contains(@class,'level-1')]//div[@col-id='BillCodeDesc'][not(@role='presentation')]"));
									
									for (int b = 0; b < ErrorBC.size()+3; b++) 
									{
										String attr="";
										String attr_compID="";
										try
										{
											ErrorBC = getDriver().findElements(By.xpath("//div[contains(@class,'level-1')]//div[@col-id='BillCodeDesc'][not(@role='presentation')]"));
											attr = ErrorBC.get(b).getAttribute("class");
											attr_compID = ErrorBC.get(b).getAttribute("comp-id");
										}
										catch(Exception e)
										{
											logInfo("Not able to get attribute value");
										}
										if(attr.contains("error-cell"))
										{
											waitForElementToAppear(ErrorBC.get(b));
											action.sendKeys(Keys.ENTER).perform();
											waitForAttributeToChange(R1loader, "style", "display: none");
											action.sendKeys(Keys.ARROW_DOWN).perform();
										}
										else
										{   
											action.sendKeys(Keys.ENTER).perform(); //added line to ensure billcode is always filled
											action.sendKeys(Keys.ARROW_DOWN).perform();
											action.sendKeys(Keys.ENTER).perform();
										}
										
									}								
								
										waitForElementToBeVisible(Staffing_PyramidSave);
										clickElement(Staffing_PyramidSave);
										
								} 
								catch (Exception e) 
								{
									
								}
								try 
								{
									waitForElementToBeVisible(NewStaffing_Expanded.get(0));
									clickElement(NewStaffing_Expanded.get(0));
									
								} 
								catch (Exception e) 
								{
								}

							
							break checkboxloop;
						}
					}
				}
			}
			
			if (scenarioFlag == true)
				scenarioPass();
}


/**
 * Method to reseting the Profile - for supporting below TC
 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
 * @since 5/03/2024
 * @release March 16
 * @author rupali.umat
 * @throws Exception 
 * 
 */
	
	public void resetProfileSelection() throws Exception
	{
		String attr="";
		
		scrollVerticallyInsideElement(StaffingPage_section_pyramidViewPort, -900);
		
		List<WebElement> Staffing_CheckBoxes_Profiles_List = getDriver().findElements(By.xpath("//div[@col-id='ag-Grid-AutoColumn']//span[@class='ag-row-group-indent-0']/span[contains(@class,'checkbox')]/span/span[contains(@class,'checked') and not(contains(@class,'ag-hidden')) and not(contains(@class,'unchecked'))]"));
		int checkedProfiles = Staffing_CheckBoxes_Profiles_List.size();
		for (int s = 0; s < checkedProfiles; s++) 
		{
			attr = Staffing_CheckBoxes_Profiles_List.get(s).getAttribute("class");
			logInfo("attr :" +attr);
			if(attr.contains("checkbox-checked"))
			{try {
				Staffing_CheckBoxes_Profiles_List.get(s).click();
			}catch(Exception e) {}
			}
		}
		
		int expandedProfile = NewStaffing_Expanded.size();
		for (int s = 0; s < expandedProfile; s++) 
		{
			attr = NewStaffing_Expanded.get(s).getAttribute("class");
			
			if(attr.contains("expanded"))
			{
				try
				{
					clickElement(NewStaffing_Expanded.get(s));
				}
				catch (Exception e) {
					// TODO: handle exception
					logInfo("Exception : "+e);
				}
			}
		}
		
	}
	
	/**
	 * Method to configure tax screen as it is mandatory to generate ADL 
	 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
	 * @since 04/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
	public void ConfigureTaxScreen(String FilePath, String Sheet, int Row, int Col) throws Exception 
	{
		waitForElementToAppear(getByLocator(Tax_Config_cntry_dropdwn));
		waitForElementToBeVisible(Tax_Config_cntry_dropdwn);
		clickElement(Tax_Config_cntry_dropdwn);
		for (int i = 0; i < Tax_Config_Cntry_Drpdwnlist.size(); i++) 
		{
			if (getText(Tax_Config_Cntry_Drpdwnlist.get(i))
					.equals(ExcelUtilities.SetExcelPath(FilePath, Sheet, Row, Col))) 
			{
				clickElement(Tax_Config_Cntry_Drpdwnlist.get(i));
				logInfo("CLient contracting Country is selected");
				break;
			}

		}
		clickElement(Tax_Config_TService_dropdwn);
		for (int i = 0; i < Tax_Config_TService_Drpdwnlist.size(); i++) 
		{
			if (getText(Tax_Config_TService_Drpdwnlist.get(i))
					.equals(ExcelUtilities.SetExcelPath(FilePath, Sheet, Row + 1, Col))) {
				clickElement(Tax_Config_TService_Drpdwnlist.get(i));
				logInfo("Type of Service is selected");
				break;
			}

		}

		clickElement(Tax_Config_Brazilian_dropdwn);
		for (int i = 0; i < Tax_Config_Brazilian_Drpdwnlist.size(); i++) 
		{
			if (getText(Tax_Config_Brazilian_Drpdwnlist.get(i))
					.equals(ExcelUtilities.SetExcelPath(FilePath, Sheet, Row + 2, Col))) {
				clickElement(Tax_Config_Brazilian_Drpdwnlist.get(i));
				logInfo("Brazilian drop down is selected");
				break;
			}

		}
		clickElement(Tax_Config_Save);
		loader();
		
	}
	
	public String DifferentitationNeededValue() throws Exception {
		String Value = getText(DifferentiationNeeded);
		return Value;
	}
	
	/**
	 * Method to enter differentiation as it is mandatory to generate ADL 
	 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
	 * @since 06/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
	public void ValidateDifferentitation() throws Exception {
		boolean scenarioFlag = true;

		waitForElementToAppear(DifferentiationLink);
		waitForElementToBeVisible(DifferentiationLink);
		clickElement(DifferentiationLink);

		switchToNewWindow();

		// Enter Class A Asset

		waitForElementToBeVisible(Differentiation_ClassATab);
		clickElement(Differentiation_ClassATab);

		waitForElementToBeVisible(Differentiation_AssetListOption);
		scrollToElement(Differentiation_AssetListOption);
		clickElement(Differentiation_AssetListOption);

		waitForElementToAppear(Differentiation_AddParameterValue);
		if (isDisplayed(Differentiation_AddParameterValue)) {
			waitForElementToBeVisible(Differentiation_AddParameterValue);
			clickElement(Differentiation_AddParameterValue);

			waitForElementToBeVisible(Differentiation_ValueParameter_CheckBox);
			clickElement(Differentiation_ValueParameter_CheckBox);

			waitForElementToBeVisible(Differentiation_ValueParameter_DropDown);
			clickElement(Differentiation_ValueParameter_DropDown);

			waitForElementToBeVisible(Differentiation_ValueParameter_SelectValue);
			clickElement(Differentiation_ValueParameter_SelectValue);

			waitForElementToBeVisible(Differentiation_AddButton);
			clickElement(Differentiation_AddButton);
		}
		
		waitForElementToBeVisible(Differentiation_Save);
		clickElement(Differentiation_Save);
		
		// Enter I&I Differentiators tab

		scroll("top");
		waitForElementToBeVisible(Differentiation_IAndI_Tab);
		waitForElementClickable(Differentiation_IAndI_Tab);
		clickElement(Differentiation_IAndI_Tab);

		waitForElementToBeVisible(Differentiation_I_And_I_Assets);
		clickElement(Differentiation_I_And_I_Assets);

		waitForElementToAppear(Differentiation_AddDifferentiator);
		if (isDisplayed(Differentiation_AddDifferentiator)) {
			waitForElementToBeVisible(Differentiation_AddDifferentiator);
			clickElement(Differentiation_AddDifferentiator);

			waitForElementToBeVisible(Differentiator_CheckBox);
			clickElement(Differentiator_CheckBox);

			waitForElementToBeVisible(Differentiator_AddValueParameter);
			clickElement(Differentiator_AddValueParameter);

			waitForElementToBeVisible(Differentiator_ValueParameter);
			clickElement(Differentiator_ValueParameter);

			waitForElementToBeVisible(Differentiator_ValueBtn);
			clickElement(Differentiator_ValueBtn);

			waitForElementToBeVisible(Differentiator_ValueOption);
			clickElement(Differentiator_ValueOption);

			waitForElementToBeVisible(Differentiator_AddBtn);
			clickElement(Differentiator_AddBtn);
		}

		waitForElementToBeVisible(Differentiation_CommonSave);
		clickElement(Differentiation_CommonSave);

		// Enter Venture Partners

		waitForElementToBeVisible(Differentiation_VenturePartners);
		clickElement(Differentiation_VenturePartners);

		waitForElementToAppear(Differentiation_AddDifferentiator);
		if (isDisplayed(Differentiation_AddDifferentiator)) {
			waitForElementToBeVisible(Differentiation_AddDifferentiator);
			clickElement(Differentiation_AddDifferentiator);

			waitForElementToBeVisible(Differentiator_CheckBox);
			clickElement(Differentiator_CheckBox);

			waitForElementToBeVisible(Differentiator_AddValueParameter);
			waitForElementClickable(Differentiator_AddValueParameter);
			clickElement(Differentiator_AddValueParameter);

			waitForElementToBeVisible(Differentiator_ValueParameter);
			clickElement(Differentiator_ValueParameter);

			waitForElementToBeVisible(Differentiator_ValueBtn);
			clickElement(Differentiator_ValueBtn);

			waitForElementToBeVisible(Differentiator_ValueOption);
			clickElement(Differentiator_ValueOption);

			waitForElementToBeVisible(Differentiator_AddBtn);
			clickElement(Differentiator_AddBtn);
		}

		// commented since this is removed
		try {
			waitForElementToBeVisible(Differentiation_CommonSave);
			clickElement(Differentiation_CommonSave);
			addPaddedWait(2);
			}
		catch(Exception e) 
		{
			
		}
		ValidateSustainablitiySubmittedandDraftstatus();
		
		waitForElementToBeVisible(OverAllDifferentiationValue);
		closeTab(1);
		switchToTab(0);

		waitForElementToBeVisible(Differentiation_Refresh);
		clickElement(Differentiation_Refresh);

		if (scenarioFlag == true)
			scenarioPass();
	}
	
	/**
	 * Method to enter differentiation as it is mandatory to generate ADL 
	 * TC 25 : Validate if SA is able to see the Rate Card details are flowing to ADL.
	 * @since 07/03/2024
	 * @release March 16
	 * @author rupali.umat
	 * @throws Exception 
	 * 
	 */
	public void ValidateSustainablitiySubmittedandDraftstatus() throws Exception
	{

		boolean scenarioFlag = true;

		clickElement(Sustanability_tab);
		String Status_Draft = sustainabilitytab_status.getAttribute("title");

		scrollToElement(SustainabilityCalc_VersionDrpdwn);
		clickElement(SustainabilityCalc_VersionDrpdwn);
		clickElement(SustainabilityCalc_FirstVersion);
		clickElement(SustainabilityCalc_SyncBtn);

		clickElement(SustainabilityCalc_GroupDrpdwn);
		ArrayList<String> GroupOptions = new ArrayList<String>(
				Arrays.asList("Group 1", "SRE", "Service Management", "SRE Devops"));
		List<WebElement> groupOptionsUi = getDriver()
				.findElements(By.xpath("//*[@id='selectedReleaseId']/following-sibling::ul/li/a"));
		for (WebElement group : groupOptionsUi) {
			if (GroupOptions.contains(getText(group))) 
				logPass("Group field along with list of Groups configured in Grouping screen is displayed");

			else 
				logFail("Group field along with list of Groups configured in Grouping screen is NOT displayed");

		}
		clickElement(SustainabilityCalc_Group1Select);
		clickElement(SustainabilityCalc_SyncNowBtn);

		if (getText(SustainabilitySync_SuccessMsg).equalsIgnoreCase("DNP and Staffing has been Synced")) 
			logPass("Success msg is displayed on sync");

		else
		{
			logFail("Success msg is not displayed on sync");
		}
		clickElement(SustainabilitySync_closepopupbutton);
		loader();
		loader();
		loader();
		String Status_submitted = sustainabilitytab_status.getAttribute("title");

		if(Status_Draft.equals("Draft") && Status_submitted.equals("Submitted"))
			logPass("SA is able to save Sustainaibility and view Submitted and Draft status for above 10 million deal");

		else
		{
			logFail("SA is not able to save Sustainaibility and "
					+ "unable to view Submitted and Draft status for above 10 million deal");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();
	}

	
	
	
	
	
	/**
	 * TC_11: Validate if the SA is able to navigate to Manage Version Screen on click Solution components.
	 * 
	 * @since 04/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
	public void navigateToManageVersionPage() throws Exception{
		boolean scenarioFlag = true;
		
		scrollToElement(SolutionComponents);
		closeloader();
		waitForElementToAppear(SolutionComponents);
		clickElement(SolutionComponents);
		loader();
		if(versionTab_Active.getAttribute("class").equals("active")) {
			logPass("SA can to navigate to Manage Version Screen on click Solution components");
		}
		else {
			logFail("SA not to navigate to Manage Version Screen on click Solution components");
			scenarioFlag = false;
		}
		
		if(scenarioFlag) 
			scenarioPass();
		else
			scenarioFail();
		
	}
	
	/**
	 * TC_12: Validate if SA is able to create a new Version on click of Create Version button.
	 * TC_13: Validate if SA is able to add Version Name, Solution Type,Self Enable Pricing , Version Flow, Milestone and save the version.
	 * 
	 * @since 27/02/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
	public String createNewVersion_WithDetails() throws Exception
	{
		boolean scenarioFlag = true;
		
		String version = "";
		
		String versionName = "Test";
		String soluionType = "Detail";   //SetExcelPath(ConstantUtils.FilePath, "VersionDetails", 2, 0);
		String selfEnabled = "Enable";//SetExcelPath(ConstantUtils.FilePath, "VersionDetails", 1, 0)
		String milestone = "Stage 0A";
		
		try {
			waitForElementToAppear(createNewVersion);
			clickElement(createNewVersion);
		}catch(Exception e) {
			logInfo("Creating First New Version.");
		}
		
		waitForElementToAppear(newVersionSpace);
		waitForElementToBeVisible(newVersionSpace);
		waitForElementToAppear(newVersionSpace);
		String rowId1 = newVersionSpace.getAttribute("row-id");
		logInfo("row id :"+rowId1);
		
		By manageVersion_grid_row = By.xpath(
				".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"
						+ rowId1 + "']//div[@col-id='SolutionVersionNm']");

		waitForElementToBeVisible(manageVersion_grid_row);
		clickElement(getDriver().findElement(By.xpath(
				".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"
						+ rowId1 + "']//div[@col-id='SolutionVersionNm']")));

		sendKeys(MngVer_textInput,versionName);
		
		clickElement(getDriver().findElement(By.xpath(
				".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"
						+ rowId1 + "']//div[@col-id='SolutionType']")));
		
		Select solutionTypedrpDown = new Select(MngVer_dropdown_select);
		solutionTypedrpDown.selectByVisibleText(soluionType);

		clickElement(getDriver().findElement(By.xpath(
				".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"
						+ rowId1 + "']//div[@col-id='SelfEnabled']")));

		Select selfEnabledPricingType = new Select((MngVer_dropdown_select));
		selfEnabledPricingType.selectByVisibleText(selfEnabled);
		
		clickElement(getDriver().findElement(By.xpath(
				".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"
						+ rowId1 + "']//div[@col-id='MilestoneStage']")));

		Select milestoneType = new Select((MngVer_dropdown_select));
		milestoneType.selectByVisibleText(milestone);
		

		clickElement(getDriver().findElement(By.xpath(".//*[@id='ManageVersionsGrid']//div[@role='row' and @row-id='"
				+ rowId1 + "']//div[@col-id='ActionField']//img[@title='Save']")));
		addPaddedWait(1);
		
		try {
			waitForElementToBeVisible(CopyVer_MasterVerConfirmation_Popup_No);
			clickElement(CopyVer_MasterVerConfirmation_Popup_No);

		} catch (Exception e) {
			logInfo("Master version pop up wont come if new first version is created ");
		}
		
		waitForElementToAppear(ManageVer_Msg);
		waitForElementToBeVisible(ManageVer_Msg);
		
		String msg = "";
		try {
			msg = ManageVer_Msg.getAttribute("title");
		} catch (Exception e) {
		}
		if (msg.equals(
				"Version saved successfully. Deleted version number will not be available for the newly created version."))
			logPass("Version is Created Successfully");
		else {
			logFail("Version is not Created with error message: " + msg);

		}	
		
		String versionRowID = "";
		if (MngVer_verNos.size() == 1)
			versionRowID = "0";
		else
			versionRowID = "1";

		By version_by = By.xpath(".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"+ versionRowID + "']//div[contains(@col-id,'SolutionVersionNbr')]/span/a");
		waitForElementToAppear(version_by);
		WebElement Myversion = getDriver().findElement(version_by);
		version = getText(Myversion);
		
		return version;
	}
	

	/**
	 * TC_14: Validate if the SA is able to copy an exiting Version using copy button in actions column.
	 * 
	 * @since 27/02/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
	public String CopyVersion(String versionNumber) throws Exception {
		
		boolean scenarioFlag=true;
		
		Actions action = new Actions(getDriver());
		float no1 = Float.parseFloat(versionNumber);
		int version = (int) no1;
		boolean hasNewElement = false;
		List<String> Version = new ArrayList<String>();
		DecimalFormat df = new DecimalFormat("#.00"); 
		
		try 
		{
			By element_by = By.xpath("(//div[@col-id='SolutionVersionNm'][not(@role='presentation')])[1]");
			waitForElementToAppear(element_by);
			waitForElementToBeVisible(MngVer_verNames.get(0));
			clickElement(MngVer_verNames.get(0));
		} 
		catch (Exception e) 
		{
			waitForElementToAppear(MngVer_verNames.get(0));
			waitForElementToBeVisible(MngVer_verNames.get(0));
			clickElement(MngVer_verNames.get(0));
		}
		boolean exitFlag = false;
		do 
		{
			hasNewElement = false;
			try 
			{
				Iterator<WebElement> Versionitr = MngVer_verNos.iterator();
				while (Versionitr.hasNext()) 
				{
					WebElement ver = Versionitr.next();
					String s = getText(ver);
					int index = Version.indexOf(s);
					if (!s.equals(""))
						action.sendKeys(Keys.ARROW_DOWN).perform();
					if (-1 == index) 
					{
						Version.add(s);
						hasNewElement = true;
						if (getText(ver).trim().equals(df.format(version).trim())) 
						{
							exitFlag = true;
							String rowID = ver.findElement(By.xpath("./..")).getAttribute("row-id");
							clickElement(getDriver().findElement(
									By.xpath(".//*[@id='ManageVersionsGrid']//div[@role='row' and @row-id='" + rowID
											+ "']//div[@col-id='ActionField']//img[@title='Copy']")));
		
							String versionType = getDriver()
									.findElement(By.xpath("//*[@id='ManageVersionsGrid']//div[@role='row' and @row-id='"
											+ rowID + "']/div[@col-id='SolutionType']"))
									.getAttribute("title");

							try 
							{
								clickElement(CopyVer_MasterVerConfirmation_Popup_No);
							} 
							catch (Exception e) {}
							try 
							{
								clickElement(MngVer_CopyVer_SelectMRDBVer_popup_Ok);
							} 
							catch (Exception e) {}
							break;
						}

					}
				}
			} 
			catch (Exception e) 
			{
				if (e.getMessage().contains("stale element"))
					continue;
				else
					throw e;
			}
		} while (hasNewElement);

		if (exitFlag == false) 
		{
			logFail("Version: " + df.format(version).trim() + "is not exists in Manage Versions screen to Copy");
			scenarioFlag = false;
		} else
			logPass("Version: " + df.format(version).trim() + "to Copy");

		return getCopiedVersion(df.format(version).trim());
	}
	
	
	public String getCopiedVersion(String version) throws Exception {

		waitForElementToBeVisible(copyVersionStatus_tab);
		clickElement(copyVersionStatus_tab);
		String targetVersion = "";
		boolean flag = false;
		waitForElementToBeVisible(versions_text_SourceCopyVersionNbr);
		List<WebElement> versions = versions_text_SourceCopyVersionNbr;
		if (versions.size() >= 1) 
		{
			for (int r = 0; r < versions.size(); r++) 
			{
				WebElement ver = getDriver().findElement(By.xpath("//div[@row-index='" + r + "']/div[contains(@col-id,'SourceCopyVersionNbr')]"));
				if (getText(ver).equals(version)) 
				{
					flag = true;
					WebElement status = getDriver().findElement(By.xpath("//div[@row-index='" + r + "']/div[text()='"+ version + "']/following-sibling::div/span/span"));
					waitForTextToBePresentInElement(status, "Completed");
					targetVersion = getText(getDriver().findElement(By.xpath("//div[@row-index='" + r + "']//a[@id='COPYCSIAutoLock']")));
					break;
				}
			}
		} 
		else 
		{
			logPass(version + " : version to copy");
		}
		if (flag == false) 
		{
			logFail(version + " : version to copy is not present in Copy Version Status tab in Manage Versions");
		} 
		else
			logInfo("copied version: " + targetVersion);
		
		waitForElementToBeVisible(Versions_tab);
		clickElement(Versions_tab);
		return targetVersion;
	}
	
	public void navigateBackToVersion() throws Exception{
		loader();
		waitForElementToAppear(sol_Component_Div);
		waitForElementToBeVisible(sol_Component_Div);
		jse.executeScript("arguments[0].scrollIntoView(true);", sol_Component_Div);
		clickElement(sol_Component_Div);
		waitForElementToAppear(versionTab_Active);
		waitForElementToBeVisible(versionTab_Active);
		
	}
	
	public String RefreshVersion(String versionNo) throws Exception 
	{
		addPaddedWait(5);
		Actions actions = new Actions(getDriver());
		String text = "";
		float no1 = Float.parseFloat(versionNo);
		int version = (int) no1;
		boolean hasNewElement = false;
		List<String> Version = new ArrayList<String>();
		DecimalFormat df = new DecimalFormat("#.00");
		loop: do 
		{
			try 
			{
				Iterator<WebElement> Versionitr = MngVer_verNos.iterator();
				while (Versionitr.hasNext()) 
				{
					WebElement ver = Versionitr.next();
					String s = ver.getText();
					int index = Version.indexOf(s);

					if (-1 == index) 
					{

						Version.add(s);

						hasNewElement = true;
						if (ver.getText().trim().equals(df.format(version).trim())) 
						{
							String rowID = ver.findElement(By.xpath("./..")).getAttribute("row-id");
							WebElement verNo = getDriver().findElement(By.xpath(
									".//*[@id='ManageVersionsGrid']//div[contains(@class,'ag-body-container')]//div[@role='row' and @row-id='"
											+ rowID + "']//div[contains(@col-id,'SolutionVersionNbr')]/span/a"));
							text = getText(verNo);
//							clickElement(MoreDetails);
//							waitForElementToBeVisible(MarketUnit);
//							String marketValue=getText(MarketUnit);
//							clickElement(MoreDetails);
//							if (marketValue.contains("Growth") || marketValue.contains("Europe")) {
//								waitForElementClickable(verNo);
//								clickElement(verNo);
//								boolean AssessmntTabPresent = assessmentPopupExistingVersion(rowID, verNo, marketValue);
//								if (AssessmntTabPresent) {
//									clickElement(verNo);
//								}
//							} else {
								waitForElementClickable(verNo);
								clickElement(verNo);
								addPaddedWait(2);
//							}
//							waitForElementToBeVisible(DSP_CurrencyReference);
							loader();
							break loop;
						}

					}
				}
			} catch (Exception e) {
				logInfo("Exception is thrown");
			}
			try {
				clickElement(getDriver().findElement(By.id("ManageVersionsGrid")));
				actions.sendKeys(Keys.PAGE_DOWN).perform();
			} catch (Exception e) {
			}

		} while (hasNewElement);
		return text;

	}

		
}