package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import reusableComponents.GlobalScreen;



public class  DefineTeams_Page extends BasePage
{
	/************************** LOCATORS *****************************/

	
	@FindBy(how = How.XPATH, using = "//*[text()='Opportunity Workflow']")
	public WebElement OpportunityWorkflow;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Define Team']")
	public WebElement DefineTeam;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Supporting SA']/parent::div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']")
	public WebElement defineTeam_SupportingSAResource;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']//input[@type='text']")
	public WebElement solutionTeam_ResourcesSelect;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='RoleName']")
	public WebElement rolename;
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Supporting SA']")
	public WebElement supportsa;
	
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
	
	@FindBy(how = How.XPATH, using = "//*[@id='stacksuccess']")
	public WebElement stacksuccess;
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='RoleName'][not(contains(@class,'header'))]/span")
	public List<WebElement> roleNameList ;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Opportunity Workflow']")
	public WebElement oppWorkFlowHeading;
	
	
	
	/************************** METHODS *****************************/
	
	public DefineTeams_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	Actions action = new Actions(getDriver());
	
	/**
	 * TC_8: Validate if the SA is able to asign required roles to themselves or others from Define Team tab.
	 * 
	 * @since 27/02/2024
	 * 
	 * @release March 16
	 * 
	 * @author nisha.maheswaran
	 */
	public void addRole() throws Exception {
		boolean scenarioFlag = true;
		boolean flag = false;
		waitForElementToAppear(DefineTeam);
		waitForElementToBeVisible(DefineTeam);
		jse.executeScript("arguments[0].scrollIntoView(true)", DefineTeam);
		clickElement(DefineTeam);
//		Navigate_to_Screen(GlobalScreen.DEFINE_TEAM);
		loader();
		String SA= "Supporting SA";
		String resourceId = "nisha.maheswaran";
		
		try {
			waitForElementClickable(ConfigSolTeam_SaveBtn);
		}catch(Exception e) {
			getDriver().navigate().refresh();
		}
		
//		try
//		{
		
		int row = scrollBottom();
		logInfo("result : "+ row);
		
		for(int i = 0;i<row;i++) {
			action.sendKeys(Keys.ARROW_UP).perform();
		}
		
		waitForElementToAppear(roleNameList.get(0));
		waitForElementToBeVisible(roleNameList.get(0));
		waitForElementToAppear(roleNameList.get(0));
		roleNameList.get(0).click();
		for(int i=0;i<row;i++) {
			action.sendKeys(Keys.ARROW_DOWN).perform();
			String roleName = getText(getDriver().findElement(By.xpath("//div[@row-index='"+i+"']//div[@col-id='RoleName'][not(contains(@class,'header'))]/span")));
			if(roleName.trim().equals(SA)) {
				clickElement(defineTeam_SupportingSAResource);
				try {
					clickElement(getDriver().findElement(By.xpath("//span[contains(text(),'" + resourceId + "')]/a")));
				}catch(Exception e) {}
				waitForElementToBeVisible(solutionTeam_ResourcesSelect);
				sendKeys(solutionTeam_ResourcesSelect,resourceId);
				loader();
				waitForElementToAppear(getDriver().findElement(By.xpath("//div[@col-id='RoleName']/following-sibling::div[@col-id='"
						+ "Resources']//div[contains(text(),'" + resourceId + "')]")));
				clickElement(getDriver().findElement(By.xpath("//div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']//"
						+ "div[contains(text(),'" + resourceId + "')]")));
				scroll("bottom");
				clickElement(ConfigSolTeam_SaveBtn);
				loader();
				scrollToElement(SelectNo);
				jsClick(SelectNo);
				flag = true;
				break;
			}
		}
		if(flag == false) {
//				throw new Exception();
//			}
//		}
//        catch(Exception e)
//		{  
        	
			clickElement(addrole);
        	clickElement(clicktab);
        	Select selfEnabledPricingType = new Select(waitForElementToBeVisible(roledropname));
			selfEnabledPricingType.selectByVisibleText(SA);
			clickElement(defineTeam_SupportingSAResource);
			waitForElementToBeVisible(solutionTeam_ResourcesSelect);
			sendKeys(solutionTeam_ResourcesSelect,resourceId);
			loader();
			waitForElementToBeVisible(getDriver().findElement(By.xpath("//div[@col-id='RoleName']/following-sibling::div[@col-id='"
					+ "Resources']//div[contains(text(),'" + resourceId + "')]")));
			clickElement(getDriver().findElement(By.xpath("//div[@col-id='RoleName']/following-sibling::div[@col-id='Resources']//"
					+ "div[contains(text(),'" + resourceId + "')]")));
			scroll("bottom");
			clickElement(ConfigSolTeam_SaveBtn);  
			loader();
			scrollToElement(SelectNo);
			jsClick(SelectNo);
		}
		if (isDisplayed(stacksuccess))
			logPass("SA is able to assign required roles from Define Team tab.");
		else {
			logFail("SA is not able to assign required roles from Define Team tab.");
			scenarioFlag = false;
		}
		loader();
		scroll("top");
		jse.executeScript("arguments[0].scrollIntoView(true)", OpportunityWorkflow);
		clickElement(OpportunityWorkflow);
//		try {
//			getDriver().navigate().back();
//			clickElement(OpportunityWorkflow);
//			if(!(oppWorkFlowHeading.isDisplayed()))
//				throw new Exception();
//				
//		}catch(Exception e) {
//			getDriver().navigate().back();
//		}
		
		if (scenarioFlag == true)
			scenarioPass();
	}
	
	@FindBy(how = How.XPATH, using = "//div[@col-id='RoleName'][not(contains(@class,'header'))]//parent::div[@row-index='1']")
	public WebElement roleNameFirstRow ;
	
	public int scrollBottom(){
		boolean isRowPresent = true;
		WebElement roleNameRow = null;
		int row = 1;
		roleNameFirstRow.click();
		while(isRowPresent) {
			try {
				roleNameRow = getDriver().findElement(By.xpath("//div[@col-id='RoleName'][not(contains(@class,'header'))]//parent::div[@row-index='"+row+"']"));
				if(roleNameRow.isDisplayed()) {
					action.sendKeys(Keys.ARROW_DOWN).perform();
					isRowPresent = true;
					row++;
					logInfo("scroll bottom working");
				}
				else {
					throw new Exception("End Of Roles");
				}	
			
			}catch(Exception e) {
				isRowPresent = false;
			}
		}
		
		logInfo(row + " no of Role present.");
		return row;
	}
	

}
