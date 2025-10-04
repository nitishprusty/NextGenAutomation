package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.ExcelUtilities;
import reusableComponents.GlobalScreen;


public class  Groups_Page extends BasePage
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
	
	
	@FindBy(how = How.XPATH, using = "//p[@id='defineGroups']//a")
	public WebElement Groups_tab;
	
	@FindBy(how = How.XPATH, using = "//div[@id='groups-active']")
	public WebElement Groupstab_active;	
	
	@FindBy(how = How.XPATH, using = "//img[@title='Add Group']/..")
	public WebElement Add_group_icon;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtGroupName']")
	public WebElement Group_name;	
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='txtGroupDesc']")
	public WebElement Group_desc;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnSubServiceType']")
	public WebElement Group_subServiceGroup;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-custom open']//ul//li//a")
	public List<WebElement> Group_subServiceGroup_values;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnServiceType']")
	public WebElement Group_AMSserviceType;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-custom open']//ul//li//a")
	public List<WebElement> Group_AMSserviceType_values;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnSkillType']")
	public WebElement Group_skillType;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-custom open']//ul//li//a")
	public List<WebElement> Group_skillType_values;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtPremiumTesting' and @class='form-control']")
	public WebElement Group_premiumTesting_enabled;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtPremiumTesting' and @class='form-control disabled']")
	public WebElement Group_premiumTesting_disabled;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnContractOffering']")
	public WebElement Group_contarctOffering;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-custom open']//ul//li//a")
	public List<WebElement> Group_contarctOffering_values;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnADTier' and @class='btnName']")
	public WebElement Group_ADTesting_skill_enabled;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnADTier' and @class='btnName disabled']")
	public WebElement Group_ADTesting_skill_disabled;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-custom open']//ul//li//a")
	public List<WebElement> Group_ADTesting_skill_values;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnAMTier' and @class='btnName']")
	public WebElement Group_AM_skill_enabled;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnAMTier' and @class='btnName disabled']")
	public WebElement Group_AM_skill_disabled;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-custom open']//ul//li//a")
	public List<WebElement> Group_AM_skill_values;
	
	@FindBy(how = How.XPATH, using = "//label[@id='lblMapProfiles']/..//a")
	public WebElement Mapprofiles_group_selectall;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'ListProfile']/li/a/input")
	public List<WebElement> Profiles_List;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-footer']//em[text()='Save']")
	public WebElement Group_save;

	@FindBy(how = How.XPATH, using = "//li[@id='liInactivate']//a//img")
	public WebElement deactivateGroup_icon;
	
	@FindBy(how = How.XPATH, using = "//a[@id='RomInactiveTab']")
	public WebElement inactivetab_group;
	
	@FindBy(how = How.XPATH, using = "//a[@id='RomActiveTab']")
	public WebElement Active_tab;
	
    @FindBy(how = How.XPATH, using = "//*[@id='ActiveGroupsGrid']//div[@col-id='SolutionGroupNm' and @role='gridcell']/..//img[@title='Edit']")
	public List<WebElement> Default_Active_groups_EditIcon;
	
    @FindBy(how = How.XPATH, using = "(//div[@ref='eBody']//div[@ref='eBodyViewport'])[2]")
	public WebElement Groups_Grid;
    
    @FindBy(how = How.XPATH, using = "//*[@id ='btnSubServiceType']/following-sibling::ul/li")
	public List<WebElement> Groups_SSG_Options;
	
	@FindBy(how = How.XPATH, using = "//*[@id ='btnSubServiceType']")
	public WebElement Groups_SSG_Drpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ActiveGroupsGrid']//div[@ref='eBodyViewport']")
	public WebElement Groups_Container;
	
	//*[@id='ActiveGroupsGrid']//div[@ref='eBodyViewport']
    
    public void navigateToManage() throws Exception {
		waitForElementToAppear(ManageBtn);
		clickElement(ManageBtn);
		
	}
	
	public void searchMMSID(String mmsid) throws Exception{

		waitForElementToBeVisible(search_filter);
		sendKeys(search_filter,mmsid);
		clickElement(getDriver().findElement(By.xpath("//div[@class='MMSID']//div[contains(text(),'"+mmsid+"')]")));
	}
	
	/**
	 * Navigation to Solution Components
	 * 
	 * @since 06/03/2024
	 * @release March 16
	 * @author kamali.a.babu
	 * 
	 */
	
	public void NavigatetoSolutionComponents(String MMSID) throws Exception 
	{
		boolean scenarioFlag = true;
		navigateToManage();
		waitForElementToBeVisible(opportunitytile);
		clickElement(Total_opportunitieslink);
		searchMMSID(MMSID);
	    waitForElementToBeVisible(SolutionComponents);
	    clickElement(SolutionComponents);
		waitForElementToAppear(Versiontab);
		if(Versiontab.isDisplayed())
			logPass("SA is able to navigate to Manage Version Screen on click Solution components.");
		else {
			logFail("SA not able to navigate to Manage Version Screen on click Solution components.");
			scenarioFlag = false;
		}
		
	    if (scenarioFlag == true)
			scenarioPass();
		
	}
	
	
	
	
	/**
	 * @author kamali.a.babu
	 * @scenario - TC_40: Validate if SA is able to navigate to Groups tab on click of groups
	 * @date - 06/03/2024
	 * @release March 16
	 * 	 
	 */
	public void NavigatetoGroupsTab() throws Exception{
		boolean scenarioFlag = true;
		
		Navigate_to_Screen(GlobalScreen.GROUPS);
		
		if(isDisplayed(Groupstab_active)) {
			logPass("SA is able to navigate to Groups tab on click of groups.");
		}
		else {
			logFail("SA is not able to navigate to Groups tab on click of groups.");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
		   scenarioPass();	
	}
	
	/**
	 * @author kamali.a.babu
	 * @scenario - TC_41: Validate if SA is able Edit the existing By default group and map profiles in it.
	 * @date - 06/03/2024
	 * @release March 16
	 * 	 
	 */
	public void EditGroup(String filepath,String sheetname,int row, int col) throws Exception{
		
	     boolean scenarioFlag = true;
	
	     String skill_type_custom = ExcelUtilities.SetExcelPath(filepath, sheetname, 4, 1);
	     String skill_type_testing = ExcelUtilities.SetExcelPath(filepath, sheetname, 4, 2);
	     String premium_testing_percent = ExcelUtilities.SetExcelPath(filepath, sheetname, 5, 1);
	     int initial_size = Default_Active_groups_EditIcon.size();
	     
	     for(int j=0;j<Default_Active_groups_EditIcon.size();j++) {
	    	 scrollHorizontallyInsideElement(Groups_Grid, 1000);
		      clickElement(Default_Active_groups_EditIcon.get(j));
		      String AMS_servicetype = Group_AMSserviceType.getAttribute("title");
		      if(AMS_servicetype.equals("AM") || AMS_servicetype.equals("AD")) {
			      clickElement(Group_skillType);
			      for(int i=0;i<Group_skillType_values.size();i++) {
			           if(Group_skillType_values.get(i).getText().trim().equalsIgnoreCase(skill_type_custom)) {
				            System.out.println(Group_skillType_values.get(i));
				            clickElement(Group_skillType_values.get(i));
				       }
			      }
	          }
		
		      else {
			        clickElement(Group_premiumTesting_enabled);
			        sendKeys(Group_premiumTesting_enabled,premium_testing_percent);
			      
			        clickElement(Group_skillType);
				    for(int i=0;i<Group_skillType_values.size();i++) {
					    if(Group_skillType_values.get(i).getText().trim().equalsIgnoreCase(skill_type_testing)) {
						   System.out.println(Group_skillType_values.get(i));
						   clickElement(Group_skillType_values.get(i));
					    }
				     }
	          }
				// To fill SSG
				waitForElementToBeVisible(Groups_SSG_Drpdwn);
				clickElement(Groups_SSG_Drpdwn);
				for (int s = 0; s < Groups_SSG_Options.size(); s++) {
					if (getText(Groups_SSG_Options.get(s)).equals("Application Managed Services")) {
						clickElement(Groups_SSG_Options.get(s));
						break;
					}
				}
		       
		}
	    
		// clickElement(Mapprofiles_group_selectall);
	   //To map profiles
		waitForElementToBeVisible(Profiles_List.get(0)); 
		clickElement(Profiles_List.get(0)); //selection of 1st profile-India
		clickElement(Profiles_List.get(4));  //selection of profile-USA
		
		waitForElementToBeVisible(Group_save);
        clickElement(Group_save);
        
        clickElement(Active_tab);
        scrollHorizontallyInsideElement(Groups_Grid, -1000);
        waitForElementToAppear(Active_tab);
        loader();
        
        int final_size = Default_Active_groups_EditIcon.size();
        if(final_size > initial_size) {
			logPass("SA is able to Edit the existing By default group and map profiles in it.");
		}
		else {
			logFail("SA is not able to Edit the existing By default group and map profiles in it.");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
		   scenarioPass();
		
	}
	
	/**
	 * @author kamali.a.babu
	 * @scenario - TC_42: Validate if SA is able to Create new Group on click of "Add Group" button.
	 * @date - 06/03/2024
	 * @release March 16
	 * 	 
	 */
	
	
	public void AddNewGroup(String filepath,String sheetname,int row, int col) throws Exception{
        
		boolean scenarioFlag = true;
		String group_name = ExcelUtilities.SetExcelPath(filepath, sheetname, 0, 1);
		String group_desc = ExcelUtilities.SetExcelPath(filepath, sheetname, 1, 1);
		String subservice_grp = ExcelUtilities.SetExcelPath(filepath, sheetname, 2, 1);
		String AMS_servicetype = ExcelUtilities.SetExcelPath(filepath, sheetname, 3, 3);
		String skill_type_custom = ExcelUtilities.SetExcelPath(filepath, sheetname, 4, 1);
		String skill_type_testing = ExcelUtilities.SetExcelPath(filepath, sheetname, 4, 2);
		String premium_testing_percent = ExcelUtilities.SetExcelPath(filepath, sheetname, 5, 1);
		String contract_offering = ExcelUtilities.SetExcelPath(filepath, sheetname, 6, 1);
		String AD_testing_skill = ExcelUtilities.SetExcelPath(filepath, sheetname, 7, 1);
		String AM_skill = ExcelUtilities.SetExcelPath(filepath, sheetname, 8, 1);
		
		
		clickElement(Add_group_icon);
		
		clickElement(Group_name);
		clear(Group_name);
		sendKeys(Group_name,group_name);
		
		clickElement(Group_desc);
		sendKeys(Group_desc,group_desc);
		
		clickElement(Group_subServiceGroup);
		for(int i=0;i<Group_subServiceGroup_values.size();i++) {
			if(Group_subServiceGroup_values.get(i).getText().trim().equalsIgnoreCase(subservice_grp)) {
				System.out.println(Group_subServiceGroup_values.get(i));
				clickElement(Group_subServiceGroup_values.get(i));
			}
		}
		clickElement(Group_AMSserviceType);
		for(int i=0;i<Group_AMSserviceType_values.size();i++) {
			if(Group_AMSserviceType_values.get(i).getText().trim().equalsIgnoreCase(AMS_servicetype)) {
				System.out.println(Group_AMSserviceType_values.get(i));
				clickElement(Group_AMSserviceType_values.get(i));
			}
		}
		if(AMS_servicetype.equals("AM")) {
		     
		     if(isDisplayed(Group_AM_skill_enabled) && isDisplayed(Group_premiumTesting_disabled) && isDisplayed(Group_ADTesting_skill_disabled)) {
			      clickElement(Group_AM_skill_enabled);
			      for(int i=0;i<Group_AM_skill_values.size();i++) {
				       if(Group_AM_skill_values.get(i).getText().trim().equalsIgnoreCase(AM_skill)) {
					        clickElement(Group_AM_skill_values.get(i));
				       }
			      }
			      clickElement(Group_skillType);
				     for(int i=0;i<Group_skillType_values.size();i++) {
					    if(Group_skillType_values.get(i).getText().trim().equalsIgnoreCase(skill_type_custom)) {
						   System.out.println(Group_skillType_values.get(i));
						   clickElement(Group_skillType_values.get(i));
					    }
				     }
	           }
		       else {
					logFail("Unable to provide value in AMS Skill Tire in Add Group.");
					scenarioFlag = false;
				}
		}
		else if(AMS_servicetype.equals("AD")) {
		     
		     if(isDisplayed(Group_ADTesting_skill_enabled) && isDisplayed(Group_premiumTesting_disabled) && isDisplayed(Group_AM_skill_disabled)) {
			      clickElement(Group_ADTesting_skill_enabled);
			      for(int i=0;i<Group_ADTesting_skill_values.size();i++) {
				       if(Group_ADTesting_skill_values.get(i).getText().trim().equalsIgnoreCase(AD_testing_skill)) {
					        clickElement(Group_ADTesting_skill_values.get(i));
				       }
			      }
			      clickElement(Group_skillType);
				     for(int i=0;i<Group_skillType_values.size();i++) {
					    if(Group_skillType_values.get(i).getText().trim().equalsIgnoreCase(skill_type_custom)) {
						   System.out.println(Group_skillType_values.get(i));
						   clickElement(Group_skillType_values.get(i));
					    }
				     }
	          }
		      else {
					logFail("Unable to provide value in AD Skill Tire in Add Group.");
					scenarioFlag = false;
				}
		}
		else {
			
		     if(isDisplayed(Group_ADTesting_skill_enabled) && isDisplayed(Group_premiumTesting_enabled) && isDisplayed(Group_AM_skill_disabled)) {
			      clickElement(Group_ADTesting_skill_enabled);
			      for(int i=0;i<Group_ADTesting_skill_values.size();i++) {
				       if(Group_ADTesting_skill_values.get(i).getText().trim().equalsIgnoreCase(AD_testing_skill)) {
					        clickElement(Group_ADTesting_skill_values.get(i));
				       }
			      }
			      clickElement(Group_premiumTesting_enabled);
			      sendKeys(Group_premiumTesting_enabled,premium_testing_percent);
			      
			      clickElement(Group_skillType);
				     for(int i=0;i<Group_skillType_values.size();i++) {
					    if(Group_skillType_values.get(i).getText().trim().equalsIgnoreCase(skill_type_testing)) {
						   System.out.println(Group_skillType_values.get(i));
						   clickElement(Group_skillType_values.get(i));
					    }
				     }
	           }
		       else {
					logFail("Unable to provide value in AD Skill Tire and Premium Testing in Add Group.");
					scenarioFlag = false;
				}
		}
	    clickElement(Group_contarctOffering);
		for(int i=0;i<Group_contarctOffering_values.size();i++) {
			if(Group_contarctOffering_values.get(i).getText().trim().equalsIgnoreCase(contract_offering)) {
				clickElement(Group_contarctOffering_values.get(i));
			}
		}
		
		// clickElement(Mapprofiles_group_selectall);
		// To map profiles
		waitForElementToBeVisible(Profiles_List.get(0));
		clickElement(Profiles_List.get(0)); // selection of 1st profile-India		
		waitForElementToBeVisible(Group_save);
        clickElement(Group_save);
        
        
        clickElement(Active_tab);
        clickElement(getDriver().findElement(By.xpath("//*[@id='ActiveGroupsGrid']//div[@title='"+group_name+"']/../div[@col-id='0']")));
        String addedGrpName = getText(getDriver().findElement(By.xpath("//*[@id='ActiveGroupsGrid']//div[@title='"+group_name+"']"))).trim();
        
        if(addedGrpName.equals(group_name)) {
			logPass("SA is able to Create new Group on click of 'Add Group' button.");
		}
		else {
			logFail("SA is not able to Create new Group on click of 'Add Group' button.");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
			   scenarioPass();
			
	}
	
	/**
	 * @author kamali.a.babu
	 * @scenario - TC_43: Validate if SA is able to Copy Group using copy functionality.
	 * @date - 06/03/2024
	 * @release March 16
	 * 	 
	 */
	public void CopyGroup(String filepath,String sheetname,int row, int col) throws Exception{
		
		boolean scenarioFlag = true;
		String group_name = ExcelUtilities.SetExcelPath(filepath, sheetname, 0, 1);
		scrollHorizontallyInsideElement(Groups_Grid, 1000);
		clickElement(getDriver().findElement(By.xpath("//*[@id='ActiveGroupsGrid']//div[@title='"+group_name+"']/..//img[@title='Copy']")));
		clickElement(Group_save);
		String ModifiedSourceName = "Copy_"+group_name;
		clickElement(Active_tab);
		clickElement(getDriver().findElement(By.xpath("//*[@id='ActiveGroupsGrid']//div[@title='"+group_name+"']/../div[@col-id='0']")));
		String CopiedGrpName = getText(getDriver().findElement(By.xpath("//*[@id='ActiveGroupsGrid']//div[@title='"+ModifiedSourceName+"']"))).trim();
		if(ModifiedSourceName.equals(CopiedGrpName)) {
			logPass("SA is able to Copy Group using copy functionality.");
		}
		else {
			logFail("SA is not able to Copy Group using copy functionality.");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
		   scenarioPass();	
	}
	
	/**
	 * @author kamali.a.babu
	 * @scenario - TC_44: Validate if SA is able to Deactivate a group and view it in Inactive tab.
	 * @date - 06/03/2024
	 * @release March 16
	 * 	 
	 */
	
	public void DeactivateGroup(String filepath,String sheetname,int row, int col) throws Exception{
		
		boolean scenarioFlag = true;
		String group_name = ExcelUtilities.SetExcelPath(filepath, sheetname, 0, 1);
		clickElement(getDriver().findElement(By.xpath("//*[@id='ActiveGroupsGrid']//div[@title='"+group_name+"']/../div[@col-id='0']")));
		(deactivateGroup_icon).click();
		getDriver().switchTo().alert().accept();
		clickElement(Active_tab);
		clickElement(inactivetab_group);
		waitForAttributeToChange(inactivetab_group, "aria-expanded", "true");
		
		String deactivatedGroup = getText(getDriver().findElement(By.xpath("//*[@id='InActiveGroupsGrid']//div[@title='"+group_name+"']"))).trim();
		if(group_name.equals(deactivatedGroup)) {
			logPass("SA is able to Deactivate a group and view it in Inactive tab.");
		}
		else {
			logFail("SA is not able to Deactivate a group and view it in Inactive tab.");
			scenarioFlag = false;
		}
		
		if (scenarioFlag == true)
		   scenarioPass();	
		
		
	}
}