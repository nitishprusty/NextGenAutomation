package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.openqa.selenium.support.ui.Select;

import reusableComponents.ConstantUtils;



public class  WAWS_Page extends BasePage
{
	
	String FilePath = ConstantUtils.TestData_WhatAreWeSolving;
	
	/************************** LOCATORS *****************************/

	
	@FindBy(how = How.XPATH, using = "//a[text()='What Are We Solving For']")
	public WebElement WAWS;
	
	@FindBy(how = How.XPATH, using = "//*[@id='isValid']")
	public WebElement errormsg;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Value Shaping']/..")
	public WebElement ValueShaping;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Estimators / Calculators']/..")
	public WebElement EstimatorCalculators;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Solution Components']/..")
	public WebElement SolutionComponents;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Value Based Deal Construct']/..")
	public WebElement VBDC;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Digital Documentation']/..")
	public WebElement DigitalDocumentation;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Review Approvals']/..")
	public WebElement ReviewApprovals;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Contract Solution Gap Analysis']/..")
	public WebElement ContractSolution;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Transition To Delivery']/..")
	public WebElement TransitionToDelivery;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Value Shaping']")
	public WebElement ValueShapingTile;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Solution Components']")
	public WebElement SolutionComponentsTile;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Value Based Deal Construct']")
	public WebElement VBDCTile;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Digital Documentation']")
	public WebElement DigitalDocumentationTile;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Review Approvals']")
	public WebElement ReviewApprovalsTile;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Contract Solution Gap Analysis']")
	public WebElement ContractSolutionTile;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Transition To Delivery']")
	public WebElement TransitionToDeliveryTile;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Opportunity Workflow']")
	public WebElement OpportunityWorkflow;
	
	@FindBy(how = How.XPATH, using = "//a[text()='What Are We Solving For']")
	public WebElement navigate_whatAreWeSolving;
	
	@FindBy(how = How.XPATH, using = "//button[@id='SG']")
	public WebElement SG_Selected;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'WRWS')]//label[normalize-space(text())='Primary Deal Arche Type']")
	public WebElement primaryArchHeading;
	
	@FindBy(how = How.XPATH, using = "//button[@id='PriDealArchbtn']")
	public WebElement primaryArchdropdown;	
	
	@FindBy(how = How.XPATH, using = "//div[@id='PriDealArchId']//ul/li/a")
	public List<WebElement> primaryArchList;
	
	@FindBy(how = How.XPATH, using = "//div[@id='div1PricingStructureId']//span[@class='dropdown-down']")
	public WebElement pricingStructDropDown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='DivPricingStructureId']//ul[@class='item1']/li/div[text()='Select All']")
	public WebElement pricingStructSelectAll;
	
	@FindBy(how = How.XPATH, using = "//div[@id='DivPricingStructureId']//ul[@class='item1']/li/div[text()='UnSelect All']")
	public WebElement pricingStructUnSelectAll;
	
	@FindBy(how = How.XPATH, using = "//div[@id='div1PricingStructureId']//span[@class='dropdown-up']")
	public WebElement pricingStructDropUP;
	
	@FindBy(how = How.XPATH, using = "//div[@id='div1PricingStructureId']//ul[@class='item2']/li//div")
	public WebElement pricingStrct_Option;
	
	@FindBy(how = How.XPATH, using = "//div/*[@id='ddlPricingStructure']")
	public WebElement pricingStrctTextValue;	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ddlPricingStructure']//following-sibling::div//ul[@class='item1']//input[@type='text']")
	public WebElement pricingStrct_searchSpace;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Continue']")
	public WebElement btn_Continue;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@id,'SaveBtn') and text()='Save']")
	public WebElement btn_Save;
	
	@FindBy(how = How.XPATH, using = "//button[@id='Servicesbtn']")
	public WebElement service_btn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='Technologybtn']")
	public WebElement technology_btn;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Custom']")
	public WebElement customField;
	
	@FindBy(how = How.XPATH, using = "//div/*[@id='ddCustom']//span[@class='dropdown-down']")
	public WebElement customField_dropdown;
	
	@FindBy(how = How.XPATH, using = "//div/*[@id='ddCustom']//span[@class='dropdown-up']")
	public WebElement customField_dropUP;

	@FindBy(how = How.XPATH, using = "//div/*[@id='ddCustom']")
	public WebElement customField_TextValue;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Custom']//following-sibling::div//ul[@class='item1']//input")
	public WebElement customField_searchSpace;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Custom']//following-sibling::div//ul[@class='item2']//div")
	public WebElement customField_option;
	
	@FindBy(how = How.XPATH, using = "//div/*[@id='ddERP']//span[@class='dropdown-down']")
	public WebElement ERPField_dropdown;
	
	@FindBy(how = How.XPATH, using = "//div/*[@id='ddERP']//span[@class='dropdown-up']")
	public WebElement ERPField_dropUP;
	
	@FindBy(how = How.XPATH, using = "//div/*[@id='ddERP']")
	public WebElement ERPField_TextValue;
	
	@FindBy(how = How.XPATH, using = "//*[text()='ERP']//following-sibling::div//ul[@class='item1']//input")
	public WebElement ERPField_searchSpace;
	
	@FindBy(how = How.XPATH, using = "//*[text()='ERP']//following-sibling::div//ul[@class='item2']//div")
	public WebElement ERPField_option;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Primary Technology']")
	public WebElement primaryTech;
	
	@FindBy(how = How.XPATH, using = "//div/*[@id='PatternTechnologyIdbtn']")
	public WebElement primaryTech_Btn;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='ulPrimaryTech']//li/a")
	public List<WebElement> primaryTech_List;
	
	@FindBy(how = How.XPATH, using = "//div/*[@id='TechnologyArcheIdbtn']")
	public WebElement TechArch_Btn;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='ulTechnologyArche']//li/a")
	public List<WebElement> TechArch_List;
	
	@FindBy(how = How.XPATH, using = "//button[@id='DeliveryCenterbtn']")
	public WebElement deliveryCenter_btn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='AMSbtnDealTypeoptions']")
	public WebElement AMS_oppTYpe_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//button[@id='SIbtnDealTypeoptions']")
	public WebElement SI_oppTYpe_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='AMSulDealTypeoptions']//li/a")
	public List<WebElement> AMS_oppType_Options;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='UlbtnDealTypeoptions']//li/a")
	public List<WebElement> SI_oppType_Options;
	
	
	@FindBy(how = How.XPATH, using = "//button[@id='AMSPrimarydeliveryId']")
	public WebElement AMS_primaryDiv_dropdown;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='AMSulprimarydelivery']//li/a")
	public List<WebElement> AMS_primaryDiv_Options;
	
	@FindBy(how = How.XPATH, using = "//button[@id='SIPrimarydeliveryId']")
	public WebElement SI_primaryDiv_dropdown;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='SIulprimarydelivery']//li/a")
	public List<WebElement> SI_primaryDiv_Options;
	

	@FindBy(how = How.XPATH, using = "//span[text()='Market']/parent::div//following-sibling::div/span")
	public WebElement market_text;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'breadcrumb')]/a[text()='Opportunity Workflow']")
	public WebElement Opp_workFlow_breakcrumb;
	
	@FindBy(how = How.XPATH, using = "//span[@class='TitleMMS']")
	public WebElement view_MMSDetails_Link;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'main-pageHeader')]//div[text()='MMS Details']")
	public WebElement MMSDetailsPageHeading;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnAMSAssessment']")
	public WebElement StartAssessment;
	
	@FindBy(how = How.XPATH, using = "//*[@id='assessmentTab']")
	public WebElement assessmentTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id='savepart']")
	public WebElement saveAssessmentButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='AMSAssessmentSucccessMsg']")
	public WebElement saveAssessmentMsg;
	
	@FindBy(how = How.XPATH, using = "//button[@title='Refresh']")
	public WebElement refreshButton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'appropriate if any or all')]/..//*[@id='awsdrpdown']/button")
	public WebElement busConstraintDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Translation capability')]/..//*[@id='awsdrpdown']/button")
	public WebElement clientCommunicationDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'* High - No workarounds')]/..//*[@id='awsdrpdown']/button")
	public WebElement regRestrictionDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Production systems')]/..//*[@id='awsdrpdown']/button")
	public WebElement limitedDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'local governance. ')]/..//*[@id='awsdrpdown']/button")
	public WebElement localGoveranceDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'transfer clause.')]/..//*[@id='awsdrpdown']/button")
	public WebElement overallTeamDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'breadcrumb')][text()='Opportunity Workflow']")
	public WebElement solComp_OppWorkFlow_breadcrumb;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Opportunity on a Page']//preceding-sibling::img")
	public WebElement OppOnPage_Link;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Scope']//preceding-sibling::img")
	public WebElement scope_Link;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Preliminary Assessment']//preceding-sibling::img")
	public WebElement pre_Assessment_Link;
	
	@FindBy(how = How.XPATH, using = "//button[@id='IMSbtnForDealTypeoptions']")
	public WebElement IMS_oppTYpe_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IMSulDealTypeoptions']//li/a")
	public List<WebElement> IMS_oppType_Options;
	
	@FindBy(how = How.XPATH, using = "//button[@id='IMSPrimarydeliveryId']")
	public WebElement IMS_primaryDiv_dropdown;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IMSulimsprimarydelivery']//li/a")
	public List<WebElement> IMS_primaryDiv_Options;
	
	@FindBy(how = How.XPATH, using = "//img[@class='loader'][contains(@src,'loader')]")
	public WebElement waws_loader;
	
	

	
	/************************** METHODS *****************************/
	
	public WAWS_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	
	/**
	 * TC_9: Validate if What are we solving Questionaire is not attempted, all other components except Define Teams are disable.
	 * 
	 * @since 27/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void validateAllComponentsDisabled() throws Exception {
		boolean scenarioFlag = true;
		
		waitForElementToAppear(WAWS);
		waitForElementToBeVisible(WAWS);
		jse.executeScript("arguments[0].scrollIntoView(true);", WAWS);
		clickElement(WAWS);
		
		if (getText(errormsg).contains("Mandatory Inputs are pending.")) {
			if (ValueShaping.getAttribute("class").contains("disabled") && EstimatorCalculators.getAttribute("class").contains("disabled") 
					&& SolutionComponents.getAttribute("class").contains("disabled") && VBDC.getAttribute("class").contains("disabled")
					&& DigitalDocumentation.getAttribute("class").contains("disabled") && ReviewApprovals.getAttribute("class").contains("disabled")
					&& ContractSolution.getAttribute("class").contains("disabled") && TransitionToDelivery.getAttribute("class").contains("disabled"))
				logPass("All other components except Define Teams are disabled.");
			else {
				logFail("All other components are not disabled.");
				scenarioFlag = false;
			}
			clickElement(OpportunityWorkflow);
			if (ValueShapingTile.getAttribute("class").contains("disabled") 
					&& SolutionComponentsTile.getAttribute("class").contains("disabled") && VBDCTile.getAttribute("class").contains("disabled")
					&& DigitalDocumentationTile.getAttribute("class").contains("disabled") && ReviewApprovalsTile.getAttribute("class").contains("disabled")
					&& ContractSolutionTile.getAttribute("class").contains("disabled") && TransitionToDeliveryTile.getAttribute("class").contains("disabled"))
				logPass("All other components except Define Teams are disabled.");
			else {
				logFail("All other components are not disabled.");
				scenarioFlag = false;
			}
		}
		else {
			try {
				waitForElementToAppear(OpportunityWorkflow);
				jse.executeScript("arguments[0].scrollIntoView(true)", OpportunityWorkflow);
				clickElement(OpportunityWorkflow);
			}catch(Exception e) {
				jsClick(OpportunityWorkflow);
			}
			logPass("What are we solving Questionaire is already configured");
		}

		if (scenarioFlag == true)
			scenarioPass();

	}
	
	public void NavigateToWhatAreWeSolvingPage() throws Exception{
		clickElement(navigate_whatAreWeSolving);	
	}
	
	public String getMarket() throws Exception{
		String market = "";
		
		waitForElementToAppear(view_MMSDetails_Link);
		try {
			clickElement(view_MMSDetails_Link);
		}catch(Exception e) {
			jse.executeScript("arguments[0].scrollIntoView(true);", view_MMSDetails_Link);
			jse.executeScript("arguments[0].click();", view_MMSDetails_Link);
		}
		
		if(!(market_text.isDisplayed())) {
			jse.executeScript("arguments[0].scrollIntoView(true);", view_MMSDetails_Link);
			jse.executeScript("arguments[0].click();", view_MMSDetails_Link);
		}
		scroll(400);
		market = getText(market_text);
		scroll(-400);
		clickElement(Opp_workFlow_breakcrumb);
	
		return market;
	}
	
	/**
	 * TC_10: Validate if What are we solving Questionnaire are attempted, all components on Opportunity Workflow should get enable.
	 * 
	 * @since 04/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 */

	public void checkAllWAWS_Components() throws Exception{
		
		boolean scenarioFlag = true;
		boolean flag = false;
		boolean isEnable = true;
		// fill Mandatory data in What are we solving page...
		fillMandatoryData_WhatAreWeSolvingFor();
		
		// return back to Opportunity workflow page..
		jse.executeScript("arguments[0].scrollIntoView(true);",solComp_OppWorkFlow_breadcrumb);
		try {
		clickElement(solComp_OppWorkFlow_breadcrumb);
		}catch(Exception e) {
			jsClick(solComp_OppWorkFlow_breadcrumb);
		}
		
		//check for Started SVG
				
		if(!OppOnPage_Link.getAttribute("src").contains("Not_Started") && !scope_Link.getAttribute("src").contains("Not_Started")) {
			flag = true;
		}
		
		if(!pre_Assessment_Link.getAttribute("src").contains("Not_Started") || !pre_Assessment_Link.getAttribute("src").contains("Not_Applicable")) {
			flag = true;
		}
		
		String screens[] = {"Value Shaping", "Solution Components","Value Based Deal Construct","Digital Documentation","Review Approvals","Transition To Delivery"};
		
		for(int i = 0;i<screens.length;i++) {
			WebElement screenElement = getDriver().findElement(By.xpath("//a[contains(text(),'"+screens[i]+"')]//ancestor::mat-card[contains(@class,'item')]"));
			scrollToElement(screenElement);
			
			if(screenElement.getAttribute("class").contains("disabled")) {
				isEnable = false;
				break;
			}
		}
		
		if(isEnable == true && flag == true) {
			logPass("When What are we solving Questionnaire are attempted, all components on Opportunity Workflow are get enabled.");
		}
		else {
			logFail("When What are we solving Questionnaire are attempted, all components on Opportunity Workflow are not get enable.");
			scenarioFlag = false;
		}
		
		if(scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
		
	}
	
	public void fillMandatoryData_WhatAreWeSolvingFor() throws Exception{
		String primaryArchValue = SetExcelPath(FilePath, "WAWS", 1, 1);
		String pricingStructure = SetExcelPath(FilePath, "WAWS", 2, 1);
		String customValue = SetExcelPath(FilePath, "WAWS", 5, 1);
		String ERPValue = SetExcelPath(FilePath, "WAWS", 6, 1);
		String OppType_Value = SetExcelPath(FilePath, "WAWS", 9, 1);
		String primaryDiv_Value = SetExcelPath(FilePath, "WAWS", 10, 1);
		
		String market = getMarket();
		String OppTypeIMS_Value = "CAPACITY MODEL";

		NavigateToWhatAreWeSolvingPage();
		
		waitForElementToAppear(primaryArchdropdown);
		waitForElementToBeVisible(primaryArchdropdown);
		clickElement(primaryArchdropdown);
		for(int i=0;i<primaryArchList.size();i++) {
			if(primaryArchList.get(i).getText().equals(primaryArchValue)) {
				clickElement(primaryArchList.get(i));
				break;
			}
		}
		
		waitForElementToBeVisible(pricingStrctTextValue);
		clickElement(pricingStructDropDown);
		waitForElementToAppear(pricingStructSelectAll);
		clickElement(pricingStructSelectAll);
		waitForElementToAppear(pricingStructUnSelectAll);
		waitForElementToBeVisible(pricingStructUnSelectAll);
		clickElement(pricingStructUnSelectAll);
		
		String expectedValue =  pricingStrctTextValue.getAttribute("title");
		String actual = pricingStructure;
		
		if(!pricingStrctTextValue.getAttribute("title").contains(pricingStructure)) {
//			clickElement(pricingStructDropDown);
			clickElement(pricingStrct_searchSpace);
			sendKeys(pricingStrct_searchSpace, pricingStructure);
			clickElement(pricingStrct_Option);
			clickElement(pricingStructDropUP);
		}
		else {
			logInfo("Value already given");
		}

		waitForElementClickable(btn_Save);
		clickElement(btn_Save);
		waitForElementClickable(btn_Continue);
		clickElement(btn_Continue);
		loader();
		waitForElementToBeInvisible(waws_loader);
		
		scroll("top");
		
		String SG = SG_Selected.getAttribute("title");
		waitForElementToAppear(btn_Continue);
		waitForElementClickable(btn_Continue);
		jsClick(btn_Continue);
		loader();
		waitForElementToBeInvisible(waws_loader);
		//clickElement(btn_Continue);	
		
		if(SG.equals("AMS")) {
		
			waitForElementToBeVisible(customField);
			if(!customField_TextValue.getAttribute("title").contains(customValue)) {
				clickElement(customField_dropdown);
				clickElement(customField_searchSpace);
				sendKeys(customField_searchSpace, customValue);
				clickElement(customField_option);
				clickElement(customField_dropUP);
			}
			else {
				logInfo("Value already given");
			}
			
			if(!ERPField_TextValue.getAttribute("title").equals(ERPValue)) {
				clickElement(ERPField_dropdown);
				clickElement(ERPField_searchSpace);
				sendKeys(ERPField_searchSpace, ERPValue);
				clickElement(ERPField_option);
				clickElement(ERPField_dropUP);
			}
			else {
				logInfo("Value already given");
			}
		}
		else if(SG.equals("SI")) {
			
			String PrimaryTech = "ABC";
			String TechArch = "ABC";
			
			if(!primaryTech_Btn.getAttribute("title").equals(PrimaryTech)) {
				clickElement(primaryTech_Btn);
				boolean isExpanded = isDropdown_expanded(primaryTech_Btn);
				
				if(!isExpanded) {
					clickElement(primaryTech_Btn);
				}
				
				for(int i=0;i<primaryTech_List.size();i++) {
					if(primaryTech_List.get(i).getText().equals(PrimaryTech)) {
						clickElement(primaryTech_List.get(i));
						break;
					}
				}

			}
			else {
				logInfo("Value already given");
			}
			
			if(!TechArch_Btn.getAttribute("title").equals(TechArch)) {
				clickElement(TechArch_Btn);
				boolean isExpanded = isDropdown_expanded(TechArch_Btn);
				
				if(!isExpanded) {
					clickElement(TechArch_Btn);
				}
				
				for(int i=0;i<TechArch_List.size();i++) {
					if(TechArch_List.get(i).getText().equals(PrimaryTech)) {
						clickElement(TechArch_List.get(i));
						break;
					}
				}
			}
			else {
				logInfo("Value already given");
			}
		}
		
		jsClick(btn_Save);
		//clickElement(btn_Save);
		waitForElementToAppear(btn_Continue);
		
		try {
			clickElement(btn_Continue);
			loader();
			waitForElementToBeInvisible(waws_loader);
			waitForElementToAppear(AMS_oppTYpe_Dropdown);
			waitForElementToBeVisible(AMS_oppTYpe_Dropdown);
		}catch (Exception e) {
			waitForElementToAppear(btn_Continue);
			jsClick(btn_Continue);
			waitForElementToBeInvisible(waws_loader);
		}
		
		if(SG.equals("AMS")) {
			waitForElementClickable(AMS_oppTYpe_Dropdown);
			loader();
			clickElement(AMS_oppTYpe_Dropdown);
			for(int i=0;i<AMS_oppType_Options.size();i++) {
				if(AMS_oppType_Options.get(i).getText().equals(OppType_Value)) {
					clickElement(AMS_oppType_Options.get(i));
					break;
				}
			}
			clickElement(AMS_primaryDiv_dropdown);
			for(int i=0;i<AMS_primaryDiv_Options.size();i++) {
				if(AMS_primaryDiv_Options.get(i).getText().equals(primaryDiv_Value)) {
					clickElement(AMS_primaryDiv_Options.get(i));
					break;
				}
			}
		}
		else if(SG.equals("SI")){
			clickElement(SI_oppTYpe_Dropdown);
			for(int i=0;i<SI_oppType_Options.size();i++) {
				if(SI_oppType_Options.get(i).getText().equals(OppType_Value)) {
					clickElement(SI_oppType_Options.get(i));
					break;
				}
			}
			clickElement(SI_primaryDiv_dropdown);
			for(int i=0;i<SI_primaryDiv_Options.size();i++) {
				if(SI_primaryDiv_Options.get(i).getText().equals(primaryDiv_Value)) {
					clickElement(SI_primaryDiv_Options.get(i));
					break;
				}
			}
		}
		else if(SG.equals("IMS")){
			clickElement(IMS_oppTYpe_Dropdown);
			for(int i=0;i<IMS_oppType_Options.size();i++) {
				if(IMS_oppType_Options.get(i).getText().equals(OppTypeIMS_Value)) {
					clickElement(IMS_oppType_Options.get(i));
					break;
				}
			}
			clickElement(IMS_primaryDiv_dropdown);
			for(int i=0;i<IMS_primaryDiv_Options.size();i++) {
				if(IMS_primaryDiv_Options.get(i).getText().equals(primaryDiv_Value)) {
					clickElement(IMS_primaryDiv_Options.get(i));
					break;
				}
			}
		}
	
		waitForElementToAppear(btn_Save);
		waitForElementToBeVisible(btn_Save);
		loader();
		waitForElementToAppear(btn_Save);
		try {
			jse.executeScript("arguments[0].click();", getDriver().findElement(By.xpath("//button[contains(@id,'SaveBtn') and text()='Save']")));
			clickElement(btn_Save);
		}catch(Exception e) {
			loader();
			waitForElementToAppear(btn_Save);
			waitForElementToBeVisible(btn_Save);
			waitForElementClickable(btn_Save);
			clickElement(btn_Save);
		}
		waitForElementToAppear(btn_Continue);
		waitForElementToBeVisible(btn_Continue);
//		clickElement(btn_Continue);
		try {
			clickElement(btn_Continue);
			loader();
			waitForElementToBeInvisible(waws_loader);
			waitForElementToAppear(StartAssessment);
			waitForElementToBeVisible(StartAssessment);
		}catch (Exception e) {
			jsClick(btn_Continue);
			waitForElementToBeInvisible(waws_loader);
		}
		loader();
		takeAssessment(market);

	}
	
	public void takeAssessment(String marketValue)
			throws Exception {
		
		String SG = SG_Selected.getAttribute("title");
		
		if (marketValue.contains("Growth Market") || marketValue.contains("EMEA")) {
			if (!SG.equals("IMS")) {
				waitForElementToAppear(StartAssessment);
				waitForElementToBeVisible(StartAssessment);
				waitForElementClickable(StartAssessment);

				if (StartAssessment.getText().equalsIgnoreCase("View Assessment"))
					logInfo("Assessment has already been taken for this deal");
				else {
					clickElement(StartAssessment);
					switchToTab(1);
					handleAssessmentQuestions(marketValue);
					clickElement(saveAssessmentButton);
					getDriver().close();
					switchToTab(0);
					clickElement(refreshButton);

				}
			}
			else {
				logInfo("Preliminary Assessment is not required for IMS deal.");
			}
		} 
		else {
			logInfo("Deal does not Preliminary Assessment");
		}
	}
	
	public void handleAssessmentQuestions(String marketValue) throws Exception {

		
		String busConstraintValue = SetExcelPath(FilePath, "Assessment", 1, 1);
		String clientCommunicationValue = SetExcelPath(FilePath, "Assessment", 2, 1);
		String regRestrictionValue = SetExcelPath(FilePath, "Assessment", 3, 1);
		String limitedDrpdwnValue = SetExcelPath(FilePath, "Assessment", 4, 1);
		String localGoveranceValue = SetExcelPath(FilePath, "Assessment", 5, 1);
		String overallTeamValue = SetExcelPath(FilePath, "Assessment", 6, 1);
		
		if (marketValue.contains("EMEA")) {	
			
			clickElement(busConstraintDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='1' or @id='2') and text()='"+busConstraintValue+"']")));

			clickElement(clientCommunicationDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='3' or @id='4' or @id='5') and text()='"+clientCommunicationValue+"']")));

			clickElement(regRestrictionDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='6' or @id='7' or @id='8') and text()='"+regRestrictionValue+"']")));

			clickElement(limitedDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='9' or @id='10' or @id='11') and text()='"+limitedDrpdwnValue+"']")));

			clickElement(localGoveranceDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='12' or @id='13' or @id='14') and text()='"+localGoveranceValue+"']")));

			clickElement(overallTeamDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='15' or @id='16') and text()='"+overallTeamValue+"']")));
		} else {	
			
			clickElement(busConstraintDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='17' or @id='18') and text()='"+busConstraintValue+"']")));

			clickElement(clientCommunicationDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='19' or @id='20' or @id='21') and text()='"+clientCommunicationValue+"']")));

			clickElement(regRestrictionDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='22' or @id='23' or @id='24') and text()='"+regRestrictionValue+"']")));

			clickElement(limitedDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='25' or @id='26' or @id='27') and text()='"+limitedDrpdwnValue+"']")));

			clickElement(localGoveranceDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='28' or @id='29' or @id='30') and text()='"+localGoveranceValue+"']")));

			clickElement(overallTeamDrpdwn);
			clickElement(getDriver().findElement(By.xpath("//a[(@id='31' or @id='32') and text()='"+overallTeamValue+"']")));
		} 
	}
	
	

}
