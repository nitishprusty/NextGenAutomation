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

import reusableComponents.GlobalScreen;
import reusableComponents.ConstantUtils;
import reusableComponents.ExcelUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;



public class  ProductivityAssessment_Page extends BasePage
{
	/************************** LOCATORS *****************************/
	@FindBy(how = How.ID, using = "tabProductivity_Assessment_Outcome")
	public WebElement ProductivityAssessmentTab;
	
	@FindBy(how = How.ID, using = "tabManageEstimates")
	public WebElement ManageEstimatesTab;
	
	@FindBy(how = How.ID, using = "AMOutCome")
	public WebElement AMOutCome;
	
	@FindBy(how = How.ID, using = "ADOutCome")
	public WebElement ADOutCome;
	
	@FindBy(how = How.ID, using = "GENAIProductivity")
	public WebElement GENAIProductivity;
	
	@FindBy(how = How.XPATH, using = "//*[@id='productivityAM']//*[@id='takeassessment']")
	public WebElement AMtakeassessment;
	
	@FindBy(how = How.XPATH, using = "//*[@id='productivityAD']//*[@id='takeassessmentad']")
	public WebElement ADtakeassessment;
	
	@FindBy(how = How.XPATH, using = "//*[@id='takeassessment']")
	public WebElement Productivity_TakeAssessment;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Assessment Description ']/../textarea")
	public WebElement Productivity_AssessmentDescription;
	
	@FindBy(how = How.XPATH, using = "//em[text()='Start']")
	public WebElement Productivity_Start;
	
	@FindBy(how = How.XPATH, using = "//p[@class='alert-msg success-msg text-success']")
	public WebElement Productivity_SuccessMsg;
	
	@FindBy(how = How.ID, using = "AD_Tab")
	public WebElement Productivity_ADQuestionnaire;
	
	@FindBy(how = How.XPATH, using = "//*[@id='prod-tab-1']//section[contains(@class,'position-absolute')]")
	public List<WebElement> Productivity_AssessmentTaken;

	@FindBy(how = How.XPATH, using = "//*[@id='17']")
	public WebElement Productivity_DealTypeField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='18']")
	public WebElement Productivity_DealTermField;

	@FindBy(how = How.XPATH, using = "//*[@id='17']/div/a")
	public List<WebElement> Productivity_DealTypeDrpDwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='18']/div/a")
	public List<WebElement> Productivity_DealTermDrpDwn;

	@FindBy(how = How.XPATH, using = "//*[@id='19']")
	public WebElement Productivity_SDFTE;

	@FindBy(how = How.XPATH, using = "//*[@id='19']/div/a")
	public List<WebElement> Productivity_SDFTEDrpDwn;

	@FindBy(how = How.XPATH, using = "//*[@id='20']")
	public WebElement Productivity_ToolingApproach;

	@FindBy(how = How.XPATH, using = "//*[@id='20']/div/a")
	public List<WebElement> Productivity_ToolingApproachDrpDwn;

	@FindBy(how = How.XPATH, using = "//*[@id='24']")
	public WebElement ProductivityInstance;

	@FindBy(how = How.XPATH, using = "//*[@id='24']/div/a")
	public List<WebElement> ProductivityInstanceDrpDwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='21']")
	public WebElement ConcurrentUsers;

	@FindBy(how = How.XPATH, using = "//*[@id='21']/div/a")
	public List<WebElement> ConcurrentUsersDrpDwn;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Custom ')]/ancestor::div[@id='22']/div/input")
	public WebElement AMTechStack_CustomValue;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Package ')]/ancestor::div[@id='22']/div/input")
	public WebElement AMTechStack_PackageValue;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Custom ')]/ancestor::div[@id='23']/div/input")
	public WebElement ADTechStack_CustomValue;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Package ')]/ancestor::div[@id='23']/div/input")
	public WebElement ADTechStack_PackageValue;

	@FindBy(how = How.XPATH, using = "//*[@id='assessmentTab']//button[text()='Save']")
	public WebElement Productivity_Save;
	
	@FindBy(how = How.XPATH, using = "//section[@class='question-tab__body p-3']//div[@class='row mb-3']")
	public List<WebElement> AMQuestionnaire_SectionFields;
	
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	public WebElement Productivity_AM_AD_QuestionSubmit;
	
	@FindBy(how = How.XPATH, using = "//*[@id='assessmentTab']//section[contains(@class,'h-100')]/section/div")
	public List<WebElement> ADQuestionnaire_Sections;

	@FindBy(how = How.XPATH, using = "//div[@class='row mb-3']")
	public List<WebElement> ADQuestionnaire_SectionFields;
	
	@FindBy(how = How.XPATH, using = "//*[@id='fs']")
	public WebElement ADQuestionnaire_FutureState;

	@FindBy(how = How.XPATH, using = "//*[@id='fs']/../div/a")
	public List<WebElement> ADQuestionnaire_FutureStateDrpDwn;
	

	/************************** METHODS *****************************/
	
	public ProductivityAssessment_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
	/**
	 * TC_36: Validate if SA is able to Navigate to Productivity Assesment tab( 
	 * Deal Duration should be greater than 3 years, Pricing Type should not be Time and Material)
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void NavigatetoProductivityAssessment() throws Exception {
		boolean scenarioFlag = true;
		clickElement(ProductivityAssessmentTab);
		waitForElementToAppear(AMOutCome);
		if (isDisplayed(AMOutCome) && isDisplayed(ADOutCome) && isDisplayed(GENAIProductivity))
			logPass("SA is able to Navigate to Productivity Assesment tab");
		else {
			logFail("SA is not able to Navigate to Productivity Assesment tab");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
			scenarioPass();

	}
	
	/**
	 * TC_37: Validate if SA is able to take AM Assesment tab and view it if already taken.
	 * TC_38: Validate if SA is able to take AD Assesment tab and view it if already taken.
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void Productivity_Assessment() throws Exception{
		boolean scenarioFlag = true;
		List<Boolean> Flag = new ArrayList<>();
		waitForElementToAppear(Productivity_TakeAssessment);
		waitForElementClickable(Productivity_TakeAssessment);
		clickElement(Productivity_TakeAssessment);
		waitForElementToBeVisible(Productivity_AssessmentDescription);
		clickElement(Productivity_AssessmentDescription);
		sendKeys(Productivity_AssessmentDescription, "AutomationTest");
		clickElement(Productivity_Start);
		switchToTab(1);
		loader();

		//Productivity Assessment for MySP
		Initial_Assessment();

		//TC_37: Validate if SA is able to take AM Assesment tab and view it if already taken.
		//AM Questionnaire
		AMQuestionnaire_Assessment();
		if(getText(Productivity_SuccessMsg).contains("AM Assessment has been submitted successfully!")) {
			Flag.add(true);
			logPass("TC_37 : AM Assessment has been submitted successfully");
		}
		else {
			Flag.add(false);
			logFail("TC_37 : AM Assessment not submitted successfully");
		}

		//TC_38: Validate if SA is able to take AD Assesment tab and view it if already taken.
		//AD Questionnaire
		waitForElementClickable(Productivity_ADQuestionnaire);
		clickElement(Productivity_ADQuestionnaire);
		ADQuestionnaire_Assessment();
		if(getText(Productivity_SuccessMsg).contains("AD Assessment has been submitted successfully!")) {
			Flag.add(true);
			logPass("TC_38 : AD Assessment has been submitted successfully");
		}
		else {
			Flag.add(false);
			logFail("TC_38 : AD Assessment not submitted successfully");
		}

		if(!Flag.contains(false)) {
			logPass("Productivity Assessment is taken successfully");
		}
		else{
			logFail("Productivity Assessment is not taken successfully");
			scenarioFlag = false;
		}
		close();
		switchToTab(0);
		loader();

		if(scenarioFlag==true)
			scenarioPass();
	}

	/**
	 * To fill Productivity Assessment Initial Questions
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void Initial_Assessment() throws Exception{

		scroll("top");
		loader();
		waitForElementToAppear(Productivity_AssessmentTaken.get(2));
		waitForElementToBeVisible(Productivity_AssessmentTaken);
		waitForElementClickable(Productivity_AssessmentTaken.get(2));
		clickElement(Productivity_AssessmentTaken.get(2));
		
		waitForElementToBeVisible(Productivity_DealTypeField);
		clickElement(Productivity_DealTypeField);
		waitForElementToBeVisible(Productivity_DealTypeDrpDwn);
		clickElement(Productivity_DealTypeDrpDwn.get(6));//AD+AM+Testing
		
		clickElement(Productivity_DealTermField);
		waitForElementToAppear(Productivity_DealTypeField);
		waitForElementToBeVisible(Productivity_DealTermDrpDwn);
		clickElement(Productivity_DealTermDrpDwn.get(4));// 5 years 
		
		clickElement(Productivity_SDFTE);
		waitForElementToBeVisible(Productivity_SDFTEDrpDwn);
		clickElement(Productivity_SDFTEDrpDwn.get(0));
		
		waitForElementToBeVisible(Productivity_ToolingApproach);
		clickElement(Productivity_ToolingApproach);
		waitForElementToBeVisible(Productivity_ToolingApproachDrpDwn);
		clickElement(Productivity_ToolingApproachDrpDwn.get(0));
		
		waitForElementToBeVisible(ProductivityInstance);
		clickElement(ProductivityInstance);
		waitForElementToBeVisible(ProductivityInstanceDrpDwn);
		clickElement(ProductivityInstanceDrpDwn.get(0));
		
		waitForElementToBeVisible(ConcurrentUsers);
		clickElement(ConcurrentUsers);
		waitForElementToBeVisible(ConcurrentUsersDrpDwn);
		clickElement(ConcurrentUsersDrpDwn.get(0));
		clear(AMTechStack_CustomValue);
		sendKeys(AMTechStack_CustomValue, "50");
		clear(AMTechStack_PackageValue);
		sendKeys(AMTechStack_PackageValue, "50");
		clear(ADTechStack_CustomValue);
		sendKeys(ADTechStack_CustomValue, "50");
		clear(ADTechStack_PackageValue);
		sendKeys(ADTechStack_PackageValue, "50");
		clickElement(Productivity_Save);
		loader();
	}

	/**
	 * To fill AM Questionnaire
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void AMQuestionnaire_Assessment() throws Exception{

		int a;
		waitForElementToBeVisible(AMQuestionnaire_SectionFields);
		ArrayList<String> AMOptions = new ArrayList<>(Arrays.asList("Deal Type and Construct","Commercial Construct","Tool Landscape",
				"Service Management Automation", "Service Management tickets availability", "DevOps"));
		for(int i=0;i<AMOptions.size();i++) {
			clickElement(getDriver().findElement(By.xpath("//*[@id='" + AMOptions.get(i) + "']")));
			for(int j=0;j<AMQuestionnaire_SectionFields.size();j++) {
				int k = j+1;
				clickElement(getDriver().findElements(By.xpath("//div[@class='row mb-3']["+k+"]//span[@class='radio__checkmark']")).get(0));
			}
		}
		clickElement(Productivity_AM_AD_QuestionSubmit);
		waitForElementToBeVisible(Productivity_SuccessMsg);
	}

	/**
	 * To fill AD Questionnaire
	 * 
	 * @since 04/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void ADQuestionnaire_Assessment() throws Exception{

		waitForElementToBeVisible(ADQuestionnaire_Sections);
		for(int i=0;i<ADQuestionnaire_Sections.size();i++) {
			clickElement(ADQuestionnaire_Sections.get(i));
			for(int j=0;j<ADQuestionnaire_SectionFields.size();j++) {
				int k = j+1;
				clickElement(getDriver().findElements(By.xpath("//div[@class='row mb-3']["+k+"]//span[@class='radio__checkmark']")).get(0));
			}
		}
		
		waitForElementToBeVisible(ADQuestionnaire_FutureState);
		clickElement(ADQuestionnaire_FutureState);
		waitForElementToBeVisible(ADQuestionnaire_FutureStateDrpDwn.get(0));
		clickElement(ADQuestionnaire_FutureStateDrpDwn.get(0));
		clickElement(Productivity_AM_AD_QuestionSubmit);
		waitForElementToBeVisible(Productivity_SuccessMsg);
	}


}
