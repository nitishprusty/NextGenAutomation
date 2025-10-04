package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Differentiation_Page extends BasePage
{

	/************************** LOCATORS *****************************/

	@FindBy(how = How.XPATH, using = "//em[text()='Differentiation Link']")
	public WebElement DifferentiationLink;

	@FindBy(how = How.XPATH, using = "//*[@id='classA-tab']")
	public WebElement Differentiation_ClassATab;

	@FindBy(how = How.XPATH, using = "//*[@id='industry-tab']")
	public WebElement Differentiation_IAndI_Tab;

	@FindBy(how = How.XPATH, using = "//*[@id='sustainability']")
	public WebElement Sustanability_tab;

	@FindBy(how = How.XPATH, using = "//*[@id='implicitSecurity-tab']")
	public WebElement ImplicitSecurity_tab;

	@FindBy(how = How.XPATH, using = "(//*[@id='classATab']//section[@class='asset-list']//input//following-sibling::span)[2]")
	public WebElement Differentiation_AssetListOption;


	@FindBy(how = How.XPATH, using = "(//*[contains(@id,'BlueRow')]//img[@title='Add value parameter'])[1]")
	public WebElement Differentiation_AddParameterValue;

	@FindBy(how = How.XPATH, using = "//*[@id='classAchkbox_DVP01']/parent::label")
	public WebElement Differentiation_ValueParameter_CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='classAbtnValue_DVP01']")
	public WebElement Differentiation_ValueParameter_DropDown;

	@FindBy(how = How.XPATH, using = "//*[@id='ulValue']//*[@title='Low']")
	public WebElement Differentiation_ValueParameter_SelectValue;

	@FindBy(how = How.XPATH, using = "//*[@id='ClassAvalueModal']//button[text()='Add']")
	public WebElement Differentiation_AddButton;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Total Current Net Revenue')]/../..//div[2]//span")
	public WebElement DealRevenue;

	@FindBy(how=How.XPATH,using="//*[text()='Opportunity Workflow']")
	public WebElement OpportunityWorkflow_BreadCrumb;

	@FindBy(how=How.XPATH,using="//*[text()='Versions ']")
	public WebElement Versions_BreadCrumb;

	@FindBy(how=How.XPATH,using="//*[text()='Opportunities']")
	public WebElement Opportunities_BreadCrumb;

	@FindBy(how=How.XPATH,using="//*[text() = 'View MMS Details ']")
	public WebElement ViewMMSDetails_Brief;

	@FindBy(how=How.XPATH,using="//*[@id='classA-tab']//span")
	public WebElement classA_status;

	@FindBy(how = How.XPATH, using = "//*[@id='commonreasonId' and @title='Select']")
	public WebElement Differentiation_Reasonfornotselecting;

	@FindBy(how = How.XPATH, using = "//*[@id='reasondrpdown' and @title='Client Mandate']")
	public WebElement Differentiation_Reason_Option;

	@FindBy(how = How.XPATH, using = "//*[@id='ChildAAssetContentId']//button[text()='Save']")
	public WebElement Differentiation_Save;

	@FindBy(how=How.XPATH,using="//*[@id='industry-tab']//span")
	public WebElement IIDifferentiators_status;

	@FindBy(how = How.XPATH, using = "//a[@id='reasons']")
	public WebElement Differentiation_ReasonLink;

	@FindBy(how = How.XPATH, using = "//button[@id='SelectedPrimDescId']")
	public WebElement Differentiation_PrimaryReason;

	@FindBy(how = How.XPATH, using = "//button[@id='SelectedSpecDescId']")
	public WebElement Differentiation_SpecificReason;

	@FindBy(how = How.XPATH, using = "//div[@id='divPrimaryId']//a[1]")
	public WebElement Differentiation_PrimaryReason_Value;

	@FindBy(how = How.XPATH, using = "//div[@id='divSpecificId']//a[1]")
	public WebElement Differentiation_SpecificReason_Value;

	@FindBy(how = How.XPATH, using = "//*[@id='AdditionalDetailsId']")
	public WebElement Differentiation_AdditionalDetails_TextBox;

	@FindBy(how = How.XPATH, using = "//*[@id ='reasonsDivId']//button[text()='Save']")
	public WebElement Differentiation_IandI_ReasonSavebtn;

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
	public WebElement Differentiator_IandIAddBtn;

	@FindBy(how = How.XPATH, using = "//*[@row-id=1]//input[@type='checkbox']")
	public WebElement Differentiator_CheckBox;

	@FindBy(how = How.XPATH, using = "//button[@id='commonsave'][text()='Save']")
	public WebElement Differentiation_CommonSave;

	@FindBy(how = How.ID, using = "AODifferentiation")
	public WebElement DifferentiationTab;

	@FindBy(how = How.XPATH, using = "//*[contains(text() ,'Contribution from Sustainability')]/..//table//*[contains(@class,'mat-select-arrow-wrapper')]")
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

	@FindBy(how=How.XPATH,using="//*[@id='implicitSecurity-tab']//span")
	public WebElement ImplicitSecuritytab_status;

	@FindBy(how = How.XPATH, using = "//div[@id='SustainabilityCalcContentId']//a[text()='link']")
	public WebElement ReasonfornotsynchingSustainability_link;

	@FindBy(how = How.XPATH, using = "//div[@id='reasonCalcPopup']//label[1]")
	public WebElement ReasonList_RadioBtn;

	@FindBy(how = How.XPATH, using = "//div[@id='reasonCalcPopup']//button[contains(text(),'Save')]")
	public WebElement Save_Popup;

	@FindBy(how = How.XPATH, using = "//*[@id='ImplicitSecuirtyContentId']//*[@id='SaveBtn']")
	public WebElement SecurityCalc_SyncBtn;

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'mat-option')][1]")
	public WebElement SecurityCalc_FirstVersion;

	@FindBy(how = How.XPATH, using = "//*[contains(text() ,'Contribution from Implicit Security')]/..//table//*[contains(@class,'mat-select-arrow-wrapper')]")
	public WebElement SecurityCalc_VersionDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='OpportunityInfo']")
	public WebElement opportunityInfo;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space(text())='Revenue']//following-sibling::span")
	public WebElement deal_revenue;
	
	@FindBy(how = How.XPATH, using = "//button[@id='closeInfo']")
	public WebElement close_Info;


	@FindBy(how = How.XPATH, using = "//div[@id='SustainabilityCalcContentId']//span[text()=' Add New Cost Calculator ']")
	public WebElement SustainabilityCalc_btn;

	@FindBy(how = How.XPATH, using = "//p[text()='Summary']")
	public WebElement SustainabilityCalc_SummaryTab;

	@FindBy(how = How.XPATH, using = "//button[text()='Continue']")
	public WebElement SustainabilityCalc_ContinueBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='loader']")
	public WebElement Addnewcal_loaderissue;
	
	@FindBy(how = How.XPATH, using = "//*[@id='LoadericonSus']")
	public WebElement Sustainablity_loaderissue;

	@FindBy(how = How.XPATH, using = "//*[@id='Loadericon']")
	public WebElement Implict_loaderissue;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'1. Is the client')]/../../../../..//*[@class='mx-image mx-name-staticImage2 img-responsive']")
	public WebElement PackageSelection_FirstQues_bluetick;

	@FindBy(how = How.XPATH, using = "//*[contains(text() ,'2. Who owns')]/../../../../..//*[@class='mx-image mx-name-staticImage2 img-responsive']")
	public WebElement PackageSelection_SecondQues_bluetick;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'3. Which IASP')]/../../../../..//*[@class='mx-image mx-name-staticImage2 img-responsive']")
	public WebElement PackageSelection_ThirdQues_bluetick;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'4. During Transition')]/../../../../..//*[@class='mx-image mx-name-staticImage2 img-responsive']")
	public WebElement PackageSelection_FourthQues_bluetick;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'5. Is Devops being')]/../../../../..//*[@class='mx-image mx-name-staticImage2 img-responsive']")
	public WebElement PackageSelection_FiveQues_bluetick;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'1. Is the client')]/../../../..//label[contains(text(),'Yes')]/..//input")
	public WebElement PackageSelection_FirstQues_YesRadiobtn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'2. Who owns')]/../../../..//label[contains(text(),'Accenture')]/..//input")
	public WebElement PackageSelection_SecondQues_YesRadiobtn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'3. Which IASP')]/../../../..//label[contains(text(),'SAAS')]/..//input")
	public WebElement PackageSelection_ThirdQues_YesRadiobtn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'4. During Transition')]/../../../..//label[contains(text(),'Light')]/..//input")
	public WebElement PackageSelection_FourthQues_YesRadiobtn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'5. Is Devops being')]/../../../..//label[contains(text(),'Yes')]/..//input")
	public WebElement PackageSelection_FiveQues_YesRadiobtn;

	@FindBy(how = How.XPATH, using = "//button[text()='Continue']")
	public WebElement Addnewcal_Continuebutton;

	@FindBy(how = How.XPATH, using = "//*[contains(@placeholder, 'Select')]/..//span")
	public WebElement PackageCost_scansperyear_dropdown;

	@FindBy(how = How.XPATH, using = "//span[contains(text(), '<30')]")
	public WebElement PackageCost_scansperyear_dropdownvalue;

	@FindBy(how = How.XPATH, using = " //div[@id='ImplicitSecuirtyContentId']//span[text()=' Add New Cost Calculator ']")
	public WebElement ImplicitCalc_btn;

	@FindBy(how = How.XPATH, using = "//*[contains(@id, 'cdk-overlay-0')]//*[contains(@id,'mat-option')][1]//span//span")
	public WebElement SecurityCalc_FirstVersionvalue;

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'mat-option')][2]//span//span")
	public WebElement sustainablitycal_FirstVersionvalue;
	
	@FindBy(how = How.XPATH, using = "//img[@id='hamburgerIconOppOverlay']")
	public WebElement diff_hamburgerIcon;
	
	@FindBy(how = How.XPATH, using = "//span[text()='MMS ID']//following-sibling::p")
	public WebElement diff_MMSID_Info;
	
	@FindBy(how = How.XPATH, using = "//em[text()='Refresh']")
	public WebElement diff_RefreshBtn;

	
	
	
	/******************************** Methods ***************************************************/
	public Differentiation_Page() 
	{
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}


	public double ValidateDifferentitationEligibility() throws Exception {

		double dealRevenue;
		
//		clickElement(ViewMMSDetails_Brief);
//		String revenue = getText(DealRevenue).split(" ")[1].replace(",", "");
//		double a = Double.parseDouble(revenue.substring(0, revenue.length()- 1));
//		clickElement(OpportunityWorkflow_BreadCrumb);
//		return a;
	
		waitForElementToBeVisible(opportunityInfo);
		clickElement(opportunityInfo);
		String revenue = getText(deal_revenue).trim().split(" ")[0].replace(",", "");
		logInfo(revenue);
		//dealRevenue = Double.parseDouble(revenue.substring(0, revenue.length()- 1));
		dealRevenue = Double.parseDouble(revenue );
		clickElement(close_Info);
		return dealRevenue;
		
	}

	/**
	 * TC_45:Validate if the SA is able to navigate to Differentiation tab if
	 * Differentiation Eligibility Criteria is fullfilled.
	 * 
	 * @since 07/03/2024 
	 * @author s.ah
	 * @return
	 */

	public void ValidateDifferentitationNavigationandEligibility(double revenue) throws Exception 
	{

		boolean scenarioFlag = true;

		if (revenue >= 1)
		{
			isDisplayed(DifferentiationTab);
			clickElement(DifferentiationTab);
			waitForElementToBeVisible(DifferentiationLink);
			isDisplayed(DifferentiationLink);
			logPass("Differntiation section is visible when Eligibility Criteria is fullfilled.");

		}
		else
		{
			logFail("Differntiation section is not visible when Eligibility Criteria is not fullfilled.");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();

	}




	/**
	 * TC_46:Validate if SA is able to Navigate to Differentiation on click of Differentiation Link'.
	 * 
	 * @since 07/03/2024 
	 * @author s.ah
	 * @return
	 */
	public void ValidateDifferentitationLink() throws Exception {

		boolean scenarioFlag = true;

		waitForElementToAppear(DifferentiationLink);
		waitForElementToBeVisible(DifferentiationLink);
		addPaddedWait(5);
		addPaddedWait(5);
		clickElement(DifferentiationLink);
        addPaddedWait(5); 
//        switchToNewWindow();
		switchToTab(1);	
        
       
		waitForElementToBeVisible(Differentiation_ClassATab);

		if( isDisplayed(Differentiation_ClassATab) && isDisplayed(Differentiation_IAndI_Tab)
				&& isDisplayed(Sustanability_tab) && isDisplayed(ImplicitSecurity_tab))
		{
			logPass("SA is able to Navigate to Differentiation on click of 'Differentiation Link'");
		}
		else {
			logFail("SA is not able to Navigate to Differentiation on click of 'Differentiation Link'");
			scenarioFlag = false;
		}
		if (scenarioFlag == true)
			scenarioPass();
	}
	
	public void PageLoaded() throws Exception{
		waitForElementToAppear(diff_hamburgerIcon);
		waitForElementToBeVisible(diff_hamburgerIcon);
		clickElement(diff_hamburgerIcon);
		addPaddedWait(5);
		if(diff_MMSID_Info.getAttribute("title").equals("")) {
			getDriver().close();
			switchToTab(0);
			addPaddedWait(5);
			clickElement(DifferentiationLink);
	        addPaddedWait(5); 
			switchToTab(1);	
			waitForElementToBeVisible(Differentiation_ClassATab);
		}
		else {
			logInfo("Page loaded Properly");
		}
		
		
	}


	/**
	 * TC_47:Validate if SA is able to Save Class A Assets tab with Assests selected from 
	 * Asset List(Submitted,Draft,Exempted)
	 * 
	 * @since 07/03/2024 
	 * @author s.ah
	 * @return
	 */

	public void ValidateDifferentitationClassAstatus() throws Exception
	{
		boolean scenarioFlag = true;
		
		PageLoaded();

		String Status_Draft = classA_status.getAttribute("title");

		scrollToElement(Differentiation_Reasonfornotselecting);
		
		waitForElementToBeVisible(Differentiation_Reasonfornotselecting);
		waitForElementClickable(Differentiation_Reasonfornotselecting);
		clickElement(Differentiation_Reasonfornotselecting);
		
		waitForElementToBeVisible(Differentiation_Reason_Option);
		waitForElementClickable(Differentiation_Reason_Option);
		clickElement(Differentiation_Reason_Option);
		
		waitForElementToBeVisible(Differentiation_Save);
		waitForElementClickable(Differentiation_Save);
		clickElement(Differentiation_Save);
		
		waitForAttributeToChange(classA_status, "title", "Exempted");
		String Status_Exempted = classA_status.getAttribute("title");

		waitForElementClickable(Differentiation_AssetListOption);
		clickElement(Differentiation_AssetListOption);	
		
		waitForElementClickable(Differentiation_AddParameterValue);
		clickElement(Differentiation_AddParameterValue);
		
		waitForElementClickable(Differentiation_ValueParameter_CheckBox);
		clickElement(Differentiation_ValueParameter_CheckBox);
		
		waitForElementClickable(Differentiation_ValueParameter_DropDown);
		clickElement(Differentiation_ValueParameter_DropDown);
		
		waitForElementClickable(Differentiation_ValueParameter_SelectValue);
		clickElement(Differentiation_ValueParameter_SelectValue);
		
		waitForElementClickable(Differentiation_AddButton);
		clickElement(Differentiation_AddButton);
		
		waitForElementClickable(Differentiation_Save);
		clickElement(Differentiation_Save);
		
		addPaddedWait(5);
		jse.executeScript("arguments[0].scrollIntoView(true);", classA_status);
		waitForAttributeToChange(classA_status, "title", "Submitted");
		String Status_submitted = classA_status.getAttribute("title");

		if(Status_Draft.equals("Draft") &&Status_Exempted.equals("Exempted")&& 
				Status_submitted.equals("Submitted"))

			logPass("SA is able to Save Class A Assets tab with Assests selected from Asset List(Submitted,Draft,Exempted)");

		else
		{
			logFail("SA not able to Save Class A Assets tab with Assests selected from Asset List(Submitted,Draft,Exempted)");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}


	/**
	 * TC_48:Validate if SA is able to save I&I Differentiators tab(Submitted,Draft,Exempted)
	 * 
	 * @since 07/03/2024 
	 * @author s.ah
	 * @return
	 */

	public void ValidateIandIDifferentiatorsstatus() throws Exception
	{
		boolean scenarioFlag = true;

		waitForElementClickable(Differentiation_IAndI_Tab);
		clickElement(Differentiation_IAndI_Tab);

		String Status_Draft = IIDifferentiators_status.getAttribute("title");

		scrollToElement(Differentiation_ReasonLink);
		clickElement(Differentiation_ReasonLink);
		clickElement(Differentiation_PrimaryReason);
		clickElement(Differentiation_PrimaryReason_Value);
		clickElement(Differentiation_SpecificReason);
		clickElement(Differentiation_SpecificReason_Value);
		clickElement(Differentiation_AdditionalDetails_TextBox);
		sendKeys(Differentiation_AdditionalDetails_TextBox, "testing");
		clickElement(Differentiation_IandI_ReasonSavebtn);
		waitForAttributeToChange(IIDifferentiators_status, "title", "Exempted");
		String Status_Exempted = IIDifferentiators_status.getAttribute("title");

		clickElement(Differentiation_I_And_I_Assets);
		clickElement(Differentiation_AddDifferentiator);
		clickElement(Differentiator_CheckBox);
		clickElement(Differentiator_AddValueParameter);
		clickElement(Differentiator_ValueParameter);
		clickElement(Differentiator_ValueBtn);
		clickElement(Differentiator_ValueOption);
		clickElement(Differentiator_IandIAddBtn);
		clickElement(Differentiation_CommonSave);
		
		jse.executeScript("arguments[0].scrollIntoView(true);", IIDifferentiators_status);
		waitForAttributeToChange(IIDifferentiators_status, "title", "Submitted");
		String Status_submitted = IIDifferentiators_status.getAttribute("title");

		if(Status_Draft.equals("Draft") &&Status_Exempted.equals("Exempted")&& 
				Status_submitted.equals("Submitted"))

			logPass("SA is able to save I&I Differentiators tab(Submitted,Draft,Exempted)");

		else
		{
			logFail("SA not able to save I&I Differentiators tab(Submitted,Draft,Exempted)");
			scenarioFlag = false;
		}
		
		
		getDriver().close();
		switchToTab(0);
		
		waitForElementToAppear(diff_RefreshBtn);
		waitForElementToBeVisible(diff_RefreshBtn);
		clickElement(diff_RefreshBtn);
		addPaddedWait(5);

		

		if (scenarioFlag == true)
			scenarioPass();

	}


	/**
	 * TC_49:Validate if SA is able to save Sustainaibility(Submitted,Draft,Exempted)
	 * 
	 * @since 07/03/2024 
	 * @author s.ah
	 * @return
	 */

	public void ValidateSustainablitiySubmittedandExemptedstatus() throws Exception
	{

		boolean scenarioFlag = true;
		
		waitForElementToBeVisible(Sustanability_tab);
		clickElement(Sustanability_tab);
		
		String Status_DefaultExempted = sustainabilitytab_status.getAttribute("title");

		addPaddedWait(5);
		waitForAttributeToChange(Sustainablity_loaderissue, "class", "loader d-none");
		waitForElementToBeVisible(SustainabilityCalc_VersionDrpdwn);
		scrollToElement(SustainabilityCalc_VersionDrpdwn);
		
		waitForElementClickable(SustainabilityCalc_VersionDrpdwn);
		clickElement(SustainabilityCalc_VersionDrpdwn);
		
		waitForElementClickable(SustainabilityCalc_FirstVersion);
		clickElement(SustainabilityCalc_FirstVersion);
		
		clickElement(SustainabilityCalc_SyncBtn);

		waitForElementClickable(SustainabilityCalc_GroupDrpdwn);
		clickElement(SustainabilityCalc_GroupDrpdwn);
		ArrayList<String> GroupOptions = new ArrayList<String>(
				Arrays.asList("Group 1", "SRE", "Service Management", "SRE Devops"));
		List<WebElement> groupOptionsUi = getDriver()
				.findElements(By.xpath("//*[@id='selectedReleaseId']/following-sibling::ul/li/a"));
		ArrayList<String> groupList = new ArrayList<String>();
		
		for (WebElement group : groupOptionsUi) {
			groupList.add(getText(group));
//				logPass("Group field along with list of Groups configured in Grouping screen is displayed");
//
//			else 
//				logFail("Group field along with list of Groups configured in Grouping screen is NOT displayed");

		}
		
		if (groupList.containsAll(GroupOptions)) 
			logPass("Group field along with list of Groups configured in Grouping screen is displayed");

		else 
			logFail("Group field along with list of Groups configured in Grouping screen is NOT displayed");
		
		clickElement(SustainabilityCalc_Group1Select);
		clickElement(SustainabilityCalc_SyncNowBtn);

		if (getText(SustainabilitySync_SuccessMsg).equalsIgnoreCase("DNP and Staffing has been Synced")) 
			logPass("Success msg is displayed on sync");

		else
		{
			logFail("Success msg is not displayed on sync");
		}
		waitForAttributeToChange(getDriver().findElement(By.xpath("//img[contains(@src,'loader')]//parent::section[@id='appLoader']")), "class", "loader d-none");
		addPaddedWaitPro(10);
		waitForElementClickable(SustainabilitySync_closepopupbutton);
		clickElement(SustainabilitySync_closepopupbutton);
		waitForAttributeToChange(sustainabilitytab_status, "title", "Submitted");
		String Status_submitted = sustainabilitytab_status.getAttribute("title");

		if(Status_DefaultExempted.equals("Exempted") && Status_submitted.equals("Submitted"))
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
	 * TC_50:Validate if SA is able to Sync Implicit Security tab.
	 * 
	 * @since 07/03/2024 
	 * @author s.ah
	 * @return
	 */

	public void ValidateImplicitSecuritySubmittedandExemptedstatus() throws Exception
	{

		boolean scenarioFlag = true;
		
		waitForElementToBeVisible(ImplicitSecurity_tab);
		waitForElementClickable(ImplicitSecurity_tab);
        clickElement(ImplicitSecurity_tab);
		
		String Status_DefaultExempted = ImplicitSecuritytab_status.getAttribute("title");

		addPaddedWait(5);
		waitForAttributeToChange(Implict_loaderissue, "class", "loader d-none");

		waitForElementClickable(SecurityCalc_VersionDrpdwn);
		clickElement(SecurityCalc_VersionDrpdwn);
		
		waitForElementClickable(SecurityCalc_FirstVersion);
		clickElement(SecurityCalc_FirstVersion);
		
		waitForElementClickable(SecurityCalc_SyncBtn);
		clickElement(SecurityCalc_SyncBtn);

		waitForElementClickable(SustainabilityCalc_GroupDrpdwn);
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
		loader();
		addPaddedWait(5);
		addPaddedWait(5);
		if (getText(SustainabilitySync_SuccessMsg).equalsIgnoreCase("DNP and Staffing has been Synced")) 
			logPass("Success msg is displayed on sync");
		else 

			logFail("Success msg is not displayed on sync");
		
		waitForAttributeToChange(getDriver().findElement(By.xpath("//img[contains(@src,'loader')]//parent::section[@id='appLoader']")), "class", "loader d-none");
		addPaddedWaitPro(10);
		waitForElementClickable(SustainabilitySync_closepopupbutton);
		clickElement(SustainabilitySync_closepopupbutton);
		jse.executeScript("arguments[0].scrollIntoView(true);", ImplicitSecuritytab_status);
		
		waitForAttributeToChange(ImplicitSecuritytab_status, "title", "Submitted");
		String Status_submitted = ImplicitSecuritytab_status.getAttribute("title");

		if(Status_DefaultExempted.equals("Exempted") && Status_submitted.equals("Submitted"))
			logPass("SA is able to save ImplicitSecuritytab and view Submitted and Draft status for above 10 million deal");

		else
		{
			logFail("SA is not able to save ImplicitSecuritytab and "
					+ "unable to view Submitted and Draft status for above 10 million deal");
			scenarioFlag = false;
		}

		getDriver().close();
		switchToTab(0);
		
		waitForElementToAppear(diff_RefreshBtn);
		waitForElementToBeVisible(diff_RefreshBtn);
		clickElement(diff_RefreshBtn);
		


		//clickElement(Versions_BreadCrumb);
		//clickElement(Opportunities_BreadCrumb);

		if (scenarioFlag == true)
			scenarioPass();


	}
	public void ValidateExemptedstatus(double revenue) throws Exception

	{

		boolean scenarioFlag = true;

		if (revenue < 10 )
		{
			isDisplayed(DifferentiationTab);
			clickElement(DifferentiationTab);

			waitForElementToBeVisible(DifferentiationLink);
			clickElement(DifferentiationLink);

			switchToNewWindow();

			boolean SustainablitiyExemptedstatus = ValidateSustainablitiyExemptedstatus();
			boolean defaultStatus_ImplicitSecuritytab = ValidateImplicitSecurityExemptedstatus();

			if(SustainablitiyExemptedstatus == true && defaultStatus_ImplicitSecuritytab  == true)
			{
				logPass("SA is able to view Exempted status for Sustainablitiy and ImplicitSecurity tabs"
						+ " for lessthan 10 million deal");


			}
			else
				logFail("SA not able to view Exempted status for Sustainablitiy and ImplicitSecurity tabs"
						+ "for lessthan 10 million deal");
			scenarioFlag = false;

		}
		else
		{
			logFail("Conditoin for Exempted status in Sustainablitiy and ImplicitSecurity tabs are fullfilled");
			scenarioFlag = false;

		}
		if (scenarioFlag == true)
			scenarioPass();

	}
	public boolean ValidateSustainablitiyExemptedstatus() throws Exception
	{

		boolean scenarioFlag = true;
		waitForElementToBeVisible(Sustanability_tab);
		clickElement(Sustanability_tab);
		String Status_DefaultExempted = sustainabilitytab_status.getAttribute("title");

		scrollToElement(ReasonfornotsynchingSustainability_link);
		clickElement(ReasonfornotsynchingSustainability_link);

		clickElement(ReasonList_RadioBtn);

		clickElement(Save_Popup);

		waitForAttributeToChange(sustainabilitytab_status, "title", "Exempted");
		String Status_ReasonfornotsynchingSustainability = sustainabilitytab_status.getAttribute("title");

		if(Status_DefaultExempted.equals("Exempted") &&  
				Status_ReasonfornotsynchingSustainability.equals("Exempted"))
			logPass("SA is able to save Reason for not synching Sustainability "
					+ " and view Exempted status for below 10 million deal");

		else
		{
			logFail("SA not able to save Reason for not synching Sustainability and"
					+ " unable to view Exempted status for below 10 million deal");
			scenarioFlag = false;
		}
		return scenarioFlag;

	}


	public boolean ValidateImplicitSecurityExemptedstatus() throws Exception
	{
		boolean scenarioFlag = true;
		switchToNewWindow();
		String Status_DefaultExempted = ImplicitSecuritytab_status.getAttribute("title");

		if(Status_DefaultExempted.equals("Exempted"))
			logPass("SA able to view Exempted status by default in ImplicitSecurity tab"
					+ " for less than 10 million deal");

		else
		{
			logFail("SA not able to view Exempted status by default in ImplicitSecurity tab"
					+ " for less than 10 million deal");
			scenarioFlag = false;
		}
		return scenarioFlag;

	}
	public void ValidatesustainabilityAddnewCalculator() throws Exception
	{	
			
		clickElement(Sustanability_tab);
		
		waitForElementToBeVisible(SustainabilityCalc_VersionDrpdwn);
		waitForElementClickable(SustainabilityCalc_VersionDrpdwn);
		clickElement(SustainabilityCalc_VersionDrpdwn);
		double Value_Beforeaddnewcal = Double.parseDouble(getText(sustainablitycal_FirstVersionvalue));
		System.out.println(Value_Beforeaddnewcal);
		clickElement(SustainabilityCalc_FirstVersion);
		
		
		waitForElementToBeVisible(SustainabilityCalc_btn);
		clickElement(SustainabilityCalc_btn);		
		
		addPaddedWaitPro(10);

		int attempts=0;
		while(attempts<6)
		{
			addPaddedWaitPro(10);
			addPaddedWaitPro(10);
			addPaddedWaitPro(10);
			addPaddedWaitPro(10);
			addPaddedWaitPro(10);
			waitForAttributeToChange(Addnewcal_loaderissue, "style", "display: none;");
			waitForElementToBeVisible(Addnewcal_Continuebutton);
			waitForElementClickable(Addnewcal_Continuebutton);
			clickElement(Addnewcal_Continuebutton);
			attempts++;

		}		
		addPaddedWaitPro(10);
		waitForElementToBeVisible(SustainabilityCalc_VersionDrpdwn);
		waitForElementClickable(SustainabilityCalc_VersionDrpdwn);
		clickElement(SustainabilityCalc_VersionDrpdwn);
		double Value_Afteraddnewcal = Double.parseDouble(getText(sustainablitycal_FirstVersionvalue));
		System.out.println(Value_Afteraddnewcal);
		waitForElementClickable(SustainabilityCalc_FirstVersion);
		clickElement(SustainabilityCalc_FirstVersion);


		if(Value_Afteraddnewcal > Value_Beforeaddnewcal)
		{
			logPass("SA is able to Add New Cost Calculater in Sustainability");
			scenarioPass();
		}
		else
			logFail("SA not able to Add New Cost Calculater in Sustainability");	
		
	}
			
	public void ValidateImplicitAddnewCalculator() throws Exception
	{
	 
		waitForElementToBeVisible(ImplicitSecurity_tab);
		waitForElementClickable(ImplicitSecurity_tab);
		clickElement(ImplicitSecurity_tab);
		
		waitForElementClickable(SecurityCalc_VersionDrpdwn);
		clickElement(SecurityCalc_VersionDrpdwn);
		
		double Value_Beforeaddnewcal = Double.parseDouble(getText(SecurityCalc_FirstVersionvalue) );
		System.out.println(Value_Beforeaddnewcal);
		waitForElementClickable(SecurityCalc_FirstVersion);
		clickElement(SecurityCalc_FirstVersion);
		
		waitForElementClickable(ImplicitCalc_btn);
		clickElement(ImplicitCalc_btn);
		
		addPaddedWaitPro(10);

		int attempts=0;
		while(attempts<6)
		{
			addPaddedWaitPro(10);
			addPaddedWaitPro(10);
			addPaddedWaitPro(10);
			addPaddedWaitPro(10);
			addPaddedWaitPro(10);

			waitForAttributeToChange(Addnewcal_loaderissue, "style", "display: none;");

			if(attempts == 0)
			{
				waitForElementToBeVisible(PackageSelection_FirstQues_YesRadiobtn);
				waitForElementClickable(PackageSelection_FirstQues_YesRadiobtn);
				clickElement(PackageSelection_FirstQues_YesRadiobtn);
				waitForElementToBeVisible(PackageSelection_FirstQues_bluetick);

				waitForElementClickable(PackageSelection_SecondQues_YesRadiobtn);
				clickElement(PackageSelection_SecondQues_YesRadiobtn);
				waitForElementToBeVisible(PackageSelection_SecondQues_bluetick);

				waitForElementClickable(PackageSelection_ThirdQues_YesRadiobtn);
         		clickElement(PackageSelection_ThirdQues_YesRadiobtn);
				waitForElementToBeVisible(PackageSelection_ThirdQues_bluetick);

				waitForElementClickable(PackageSelection_FourthQues_YesRadiobtn);
				clickElement(PackageSelection_FourthQues_YesRadiobtn);
				waitForElementToBeVisible(PackageSelection_FourthQues_bluetick);

				waitForElementClickable(PackageSelection_FiveQues_YesRadiobtn);
				clickElement(PackageSelection_FiveQues_YesRadiobtn);
				waitForElementToBeVisible(PackageSelection_FiveQues_bluetick);
				addPaddedWaitPro(10);

			}
			
			else if(attempts == 1)
			{
				addPaddedWaitPro(10);
				waitForElementToBeVisible(PackageCost_scansperyear_dropdown);
				waitForElementClickable(PackageCost_scansperyear_dropdown);
     			clickElement(PackageCost_scansperyear_dropdown);

				waitForElementClickable(PackageCost_scansperyear_dropdownvalue);
				clickElement(PackageCost_scansperyear_dropdownvalue);
				addPaddedWaitPro(10);


			}

			waitForElementToBeVisible(Addnewcal_Continuebutton);
			waitForElementClickable(Addnewcal_Continuebutton);
			clickElement(Addnewcal_Continuebutton);
			attempts++;

		}

		addPaddedWaitPro(10);
		waitForElementToBeVisible(SecurityCalc_VersionDrpdwn);
		waitForElementClickable(SecurityCalc_VersionDrpdwn);
		clickElement(SecurityCalc_VersionDrpdwn);
		double Value_Afteraddnewcal = Double.parseDouble(getText(SecurityCalc_FirstVersionvalue) );//1.0
		System.out.println(Value_Afteraddnewcal);
		clickElement(SecurityCalc_FirstVersion);
		
		if(Value_Afteraddnewcal > Value_Beforeaddnewcal)
		{
			logPass("SA is able to Add New Cost Calculater in Implicit Security");
			scenarioPass();
		}
		else
			logFail("SA not able to Add New Cost Calculater in Implicit Security");

	}
	
}
