package pageObjects;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import reusableComponents.ConfigFileReader;
import reusableComponents.ConstantUtils;

public class Profile_Page extends BasePage{
	
	/**************** Locators *******************/
	public KDAReport_Page Kda;
	
	public Actions action = new Actions(getDriver());

	@FindBy(how = How.XPATH, using = "//*[text()= 'Manage']")
	public WebElement Manage_Btn;

	@FindBy(how = How.XPATH, using = "//p[@id='defineProfiles']/a")
	public WebElement Profile_Tab;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'profile-parameter-tab')]//ul[@role='tablist']//li")
	public List<WebElement> ProfileTab_List;

	@FindBy(how = How.XPATH, using = "//li/a[@href='#profile-active']")
	public WebElement profiles_ActiveTab;

	@FindBy(how = How.XPATH, using = "//li/a[@href='#profile-inactive']")
	public WebElement profiles_InactiveTab;

	@FindBy(how = How.XPATH, using = "//li[@id='NamedResourceExportTab']")
	public WebElement NamedResourceExport_Tab;
	
	@FindBy(how = How.XPATH, using = "//*[@title='Activate Profiles']/img")
	public WebElement profiles_Activatebtn;
	
	@FindBy(how = How.XPATH, using = "//span[@id='AlertspnInActiveGridMsg']")
	public WebElement profile_Active_Inactive_SaveMsg;

	@FindBy(how = How.XPATH, using = "//span[@id='AlertspnActiveGridMsg']")
	public WebElement profile_SaveSuccessMsg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='profile-active']//div[@col-id='City']")
	public List<WebElement> Profiles_City;
	
	@FindBy(how = How.XPATH, using = "//*[@id='profile-active']//div[@ref='eBodyViewport']")
	public WebElement activeProfile_Container;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'EditEntityLabel' and contains(text() , 'Edit')]")
	public WebElement editProfile_PopUp;
	
	@FindBy(how = How.XPATH, using = "//*[@id='spnCity']")
	public WebElement add_ProfileCity;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmProfileDetails']//button//em[text()='Save']")
	public WebElement profilePage_input_Save;
	
	@FindBy(how = How.XPATH, using = "//*[@id='frmProfileDetails']//button//em[text()='Cancel']")
	public WebElement ProfileEdit_Cancelbutton;

	@FindBy(how = How.XPATH, using = "//li[@id='liSearch']")
	public WebElement profile_search;
	
	@FindBy(how = How.XPATH, using = "//*[@title='Add Profile']")
	public WebElement addProfileBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='spnPayrollCountry']")
	public WebElement add_PayrollCountry;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulPayRollCountry']/li")
	public List<WebElement> add_PayrollCountrydrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='spnWorkContry']")
	public WebElement add_WorkCountry;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulWorkCountry']/li")
	public List<WebElement> add_WorkCountrydrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='spnCareerTrack']")
	public WebElement add_CT;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulcarrerTrack']/li")
	public List<WebElement> add_CTDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='spnEconomicProfile']")
	public WebElement add_EP;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulEconomicProfile']/li")
	public List<WebElement> add_EPdrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='spnRateType']")
	public WebElement add_RateType;
	
	@FindBy(how = How.XPATH, using = "//*[@id='spnResourceType']")
	public WebElement add_ResType;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulRateType']/li")
	public List<WebElement> add_RateTypedrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulResourceType']/li")
	public List<WebElement> add_ResTypedrpdwn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='spnLoadType']")
	public WebElement add_LoadType;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulLoadtype']/li")
	public List<WebElement> add_LoadTypeDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtProfileName']")
	public WebElement add_ProfileName;
	
	@FindBy(how = How.XPATH, using = "//*[@id='profile-active']//div[@col-id='ProfileName']")
	public List<WebElement> active_ProfileList;
	
	@FindBy(how = How.XPATH, using = ".//*[@id = 'gridActive']//*[@col-id='ProfileName' and not(contains(@class,'header-cell'))]")
	public List<WebElement> activeProfiles_Profilename;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ulCity']/li")
	public List<WebElement> add_CityDrpdwn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text() ,'Auto-Refresh')]/preceding-sibling::input[@id='rbt_A']")
	public WebElement autorefreshoption;

	@FindBy(how = How.XPATH, using = " //*[@id='autoRefreshPopupID2']//button/em[text()='OK']")
	public WebElement autorefreshoption_btnOK;
	
	@FindBy(how = How.XPATH, using = "//*[@id='AlertMsgspn']")
	public WebElement save_Message;
	
	@FindBy(how = How.XPATH, using = "//p[@id='SucessErrorAlert']/span")
	public WebElement profile_EditSaveMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id='SucessErrorAlertActiveGrid']//span")
	public WebElement profile_ActiveGridSaveMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id='profile-active']//div[contains(@class,'ag-body-container')]/div/div[@col-id='0']/span")
	public List<WebElement> profiles_Chkbox;
	
	@FindBy(how = How.XPATH, using = "//*[@title='Deactivate Profiles']/img")
	public WebElement profiles_Deactivatebtn;
		
	@FindBy(how = How.XPATH, using = "//*[@id='profile-inactive']//div[contains(@class,'ag-body-container')]/div/div[@col-id='ProfileName']")
	public List<WebElement> profiles_Inactive_ProfilesNames;
	
	@FindBy(how = How.XPATH, using = "//*[@id='profile-inactive']//div[contains(@class,'ag-body-container')]/div/div[@col-id='0']/span")
	public List<WebElement> profiles_Inactive_chkbox;
	
	@FindBy(how = How.XPATH, using = "//a[@id='importNamedResourceID']")
	public WebElement nameResource_DownloadBtn;
	
	@FindBy(how = How.XPATH, using = "//a[@id='exportNamedResourceID']")
	public WebElement nameResource_ImportBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divImportNamedResourcecls']")
	public WebElement nameResource_ImportContainer;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divImportNamedResourcecls']//input[@id='files_AONamedResource']")
	public WebElement nameResource_ImportInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divImportNamedResourcecls']//button[@id='btnImprtStaffing']")
	public WebElement nameResource_ImportOKBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='NamedResourceGrid']//div[@ref='eBodyContainer']//div[@row-index='0']")
	public WebElement nameResource_ImportRow;
	
	@FindBy(how = How.XPATH, using = "//div[@role='document']//em[text()='I understand']")
	public WebElement nameResource_IUnderstand;
	
	
	
	
	/**************** Methods *********************/

	
	public Profile_Page() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}

	public void navigateToManage() throws Exception {

		waitForElementToAppear(Manage_Btn);
		clickElement(Manage_Btn);

	}
	/**
	 * TC_27: Validate if the SA able to navigate to profiles tab on click of 'Profiles'.
	 * 
	 * @since 04/03/2024
	 * @release March 16
	 * @author riya.c.goyal
	 * 
	 */

	public void profileScreen() throws Exception {

		boolean scenarioFlag = false;

//		navigateToManage();
//		getDriver().get(
//				"https://mysolutionplannernextgencore.ciostage.accenture.com/MySP/SolutionConfiguration/18847/139611/17/SolutionParameters");

		waitForElementToAppear(Profile_Tab);
		waitForElementToBeVisible(Profile_Tab);
		waitForElementClickable(Profile_Tab);
		clickElement(Profile_Tab);
		String profileTabColor = Profile_Tab.getCssValue("color");
		System.out.println(profileTabColor);
		if (Profile_Tab.isDisplayed() && profileTabColor.equals("rgba(117, 0, 192, 1)")) {
			scenarioFlag = true;
			logPass("Successfully navigated Profile Tab");
		} else {
			scenarioFlag = false;
			logFail("Failed to navigate Profile Tab");
		}

	}
	/**
	 * TC_28: Validate if the SA is able to view Active,Inactive,Named Resource Report Status and should able to navigate to repective screen.
	 * 
	 * @since 04/03/2024
	 * @release March 16
	 * @author riya.c.goyal
	 * 
	 */
	public void profileScreenTabsValidation() throws Exception {
		boolean scenarioFlag = true;
		
		if (profiles_ActiveTab.isDisplayed() && profiles_InactiveTab.isDisplayed() && NamedResourceExport_Tab.isDisplayed() ) {
			
			logPass("Profile subtabs are present");
		} else {
			scenarioFlag = false;
			logFail("Profile subtabs are not present");
		}

		if (scenarioFlag == true) {
			scenarioPass();
		} else {
			scenarioFail();

		}

		waitForElementToBeVisible(profiles_ActiveTab);
		clickElement(profiles_ActiveTab);

		String activeTab = ProfileTab_List.get(0).getAttribute("class");
		if (activeTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to Active tab");
		} else {
			logFail("Failed to navigate to Active tab");
			scenarioFlag = false;
		}

		waitForElementToBeVisible(profiles_InactiveTab);
		clickElement(profiles_InactiveTab);

		String inactiveTab = ProfileTab_List.get(1).getAttribute("class");
		if (inactiveTab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to Inactive tab");
		} else {
			logFail("Failed to navigate to Inactive tab");
			scenarioFlag = false;
		}

		waitForElementToBeVisible(NamedResourceExport_Tab);
		clickElement(NamedResourceExport_Tab);
		String namedResourceExport_Tab = ProfileTab_List.get(2).getAttribute("class");
		if (namedResourceExport_Tab.equalsIgnoreCase("active")) {
			logPass("Successfully navigated to Named Resource Export Tab");
		} else {
			logFail("Failed to navigate to Named Resource Export Tab");
			scenarioFlag = false;
		}
	}
	
	
	/**
	 * TC_30: Validate if the SA is able to add city for existing profile on click of Edit button.
	 * 
	 * @since 04/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
		
	public void add_ProfileCity(String FilePath) throws Exception{
		boolean scenarioFlag = true;
		boolean flag = true, isCityNotFilled = true;

		waitForElementToBeVisible(profiles_ActiveTab);
		clickElement(profiles_ActiveTab);
		
		try {
			waitForElementToBeVisible(Profiles_City.get(0));
		}catch(Exception e) {
			waitForElementToAppear(Profiles_City.get(0));
			waitForElementToBeVisible(Profiles_City.get(0));
			waitForElementToAppear(Profiles_City.get(0));
		}
		
		waitForElementToAppear(Profiles_City.get(0));
		
		int profileCitySize = Profiles_City.size();
		logInfo("Total Profiles Found: "+profileCitySize);
		
		for (int i = 1; i < profileCitySize; i++) 
		{
			String City = SetExcelPath(FilePath, "WorkCityData", i, 0);
			
			try {
				waitForElementToBeVisible(Profiles_City.get(i));
			}catch(Exception e) {
				waitForElementToAppear(Profiles_City.get(i));
				waitForElementToBeVisible(Profiles_City.get(i));
				waitForElementToAppear(Profiles_City.get(i));

			}
			
			String attr = Profiles_City.get(i).getAttribute("class");
			if (attr.contains("rag-red")) 
			{
				scrollHorizontallyInsideElement(activeProfile_Container, 1000);
				clickElement(profile_search);
				WebElement profilesEdit_button = getDriver().findElement(By.xpath("(//img[@title='Edit'])["+i+"]"));
				waitForElementToBeVisible(profilesEdit_button);
				clickElement(profilesEdit_button);
				
				try 
				{
					waitForElementToBeVisible(editProfile_PopUp);
					waitForElementToBeVisible(add_ProfileCity);
					clickElement(add_ProfileCity);
					sendKeys(add_ProfileCity, City);
					
					WebElement city_dropdownSuggestion = getDriver().findElement(By.xpath("//*[@id='ulCity']/li/a[text()='" + City + "']"));
					waitForElementToAppear(city_dropdownSuggestion);
					waitForElementToBeVisible(city_dropdownSuggestion);
					clickElement(city_dropdownSuggestion);
					
					waitForAttributeToChange(add_ProfileCity, "title", City);
					
					String attr_city = add_ProfileCity.getAttribute("title");
					if(attr_city.equalsIgnoreCase(City))
					{
						logInfo("City Found for respective Profile");
					}
					else
					{
						logFail("City not Found");
					}
				} 
				catch (Exception e)
				{
					if (e.getMessage().contains("stale element")) 
					{
						clear(add_ProfileCity);
						Thread.sleep(500);
						sendKeys(add_ProfileCity,City);
						addPaddedWait(1);
						clickElement(getDriver().findElement(By.xpath("//*[@id='ulCity']/li/a[text()='" + City + "']")));
					} 
					else
						throw e;
				}
				logInfo("profile(" + i + ") City is selected");

				clickElement(profilePage_input_Save);
				waitForTextToBePresentInElement(profile_EditSaveMessage,"Profile saved successfully.");
				try {
					waitForTextToBePresentInElement(profile_EditSaveMessage,"Profile saved successfully.");
					clickElement(ProfileEdit_Cancelbutton);
				}
				catch(Exception e) {}
				cityloadCheck(i);	
				
				if (Profiles_City.get(i).getAttribute("class").contains("rag-red")) {
					flag = true;
				}
			}
			else {
				isCityNotFilled = false;
			}
		}
		
		scrollHorizontallyInsideElement(activeProfile_Container, -1000);
		
		if(isCityNotFilled) {
			if(flag == true) 
				logPass("SA can to add city for existing profile on click of Edit button");
			
			else {
				logFail("SA can not to add city for existing profile on click of Edit button");
				scenarioFlag = false;
			}
		}else {
			logPass("city for existing profile is already added");
		}
		
		if(scenarioFlag)
			scenarioPass();
		else
			scenarioFail();
			
		
	}
	
	public void cityloadCheck(int i) {
		for (int w = 0; w < 15; w++) {
			try {
				if (!Profiles_City.get(i).getAttribute("class").contains("rag-red"))
					break;
			} catch (Exception e) {
				if (e.getMessage().contains("stale element"))
					cityloadCheck(i);
			}
		}
	}

	
	/**
	 * TC_29: Validate if the SA is able to create new profile on click of 'Add Profile Icon'.
	 * 
	 * @since 05/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
		
	public String AddProfile(String FilePath, String Sheetname) throws Exception 
	{
		jse.executeScript("window.scrollBy(0,-400)", "");

		boolean scenarioFlag = false;

		String WorkCntryText = null;
		String CTText = null;
		String EPText = null;
		String RTText = null;
		String LTText = null;
		String ResTypeText = null;
		String CityText = null;

		int j = 1;
			
		waitForElementToBeVisible(profiles_ActiveTab);
		clickElement(profiles_ActiveTab);

		waitForElementToBeVisible(addProfileBtn);
		clickElement(addProfileBtn);
		
		// Payroll country
		String country = SetExcelPath(FilePath, Sheetname, 10, j).trim();
		waitForElementToBeVisible(getByLocator(add_PayrollCountry));
		clickElement(add_PayrollCountry);	
		waitForElementToBeVisible(add_PayrollCountrydrpdwn);
		for (int i = 0; i < add_PayrollCountrydrpdwn.size(); i++) {
			if (add_PayrollCountrydrpdwn.get(i).getAttribute("title").trim().equals(country)) {
				waitForElementToBeVisible(add_PayrollCountrydrpdwn.get(i));
				clickElement(add_PayrollCountrydrpdwn.get(i));
				logInfo("Payroll Country is selected");
				break;
			}
		}
			
		// WorkCountry 
		String workCountry = SetExcelPath(FilePath, Sheetname, 11, j);
		waitForElementToBeVisible(add_WorkCountry);
		expandDropdown(add_WorkCountry);
		waitForElementToBeVisible(add_WorkCountrydrpdwn);
		int Count1 = add_WorkCountrydrpdwn.size();
		for (int i = 0; i < Count1; i++) {
			if (add_WorkCountrydrpdwn.get(i).getAttribute("title").equals(workCountry)) 
			{
				clickElement(add_WorkCountrydrpdwn.get(i));
				logInfo("Work Country is selected");
				try 
				{
					WorkCntryText = add_WorkCountry.getAttribute("title");
				} catch (Exception e) 
				{
					WorkCntryText = add_WorkCountry.getAttribute("title");
				}
				break;
			}
		}

		//Add City
		String city = SetExcelPath(FilePath, Sheetname, 12, j).trim();
		waitForElementToBeVisible(add_ProfileCity);
		clickElement(add_ProfileCity);
		sendKeys(add_ProfileCity,city);
		WebElement city_suggestion = getDriver().findElement(By.xpath("//*[@id='ulCity']/li[@title='" + city + "']"));
		try 
		{
			waitForElementToBeVisible(city_suggestion);
			clickElement(city_suggestion);
		} 
		catch (Exception e) 
		{
			if (e.getMessage().contains("stale element"))
				clickElement(city_suggestion);
			else
				throw e;
		}
		waitForElementToBeVisible(add_ProfileCity);
		CityText = add_ProfileCity.getAttribute("title");
		if(CityText.equals(city))
		{
			logInfo("City is selected");
		}
		else
		{
			logFail("City is not selected");
		}
			
		//Career Track
		String careertrack = SetExcelPath(FilePath, Sheetname, 13, j).trim();
		waitForElementToBeVisible(add_CT);
		clickElement(add_CT);
		waitForElementToBeVisible(add_CTDrpdwn);
		for (int i = 0; i < add_CTDrpdwn.size(); i++) 
		{
			if (add_CTDrpdwn.get(i).getAttribute("title").trim().equals(careertrack)) 
			{
				waitForElementToBeVisible(add_CTDrpdwn.get(i));
				clickElement(add_CTDrpdwn.get(i));
				logInfo("Career Track is selected");
				CTText = add_CT.getAttribute("title");
				break;
			}
		}
			
		// Economic profile
		String economicProfile = SetExcelPath(FilePath, Sheetname, 14, j).trim();
		try 
		{
			waitForElementToBeVisible(add_EP);
			clickElement(add_EP);
		} catch (Exception e) 
		{	
			waitForElementToBeVisible(add_EP);
			clickElement(add_EP);
		}
	
		waitForElementToBeVisible(add_EPdrpdwn);
		for (int i = 0; i < add_EPdrpdwn.size(); i++) {
			if (add_EPdrpdwn.get(i).getAttribute("title").trim().equals(economicProfile)) 
			{
				try 
				{
					waitForElementToBeVisible(add_EPdrpdwn.get(i));
					clickElement(add_EPdrpdwn.get(i));
				} 
				catch (Exception e) 
				{
					waitForElementToBeVisible(add_EPdrpdwn.get(i));
					clickElement(add_EPdrpdwn.get(i));
				}
				logInfo("Economic Profile is selected");
				EPText = add_EP.getAttribute("title");
				break;
			}
		}
		
		// ----RateType drop down selection
		String rateType = SetExcelPath(FilePath, Sheetname, 15, j).trim();
		waitForElementToBeVisible(add_RateType);
		clickElement(add_RateType);
		waitForElementToBeVisible(add_RateTypedrpdwn);
		for (int i = 0; i < add_RateTypedrpdwn.size(); i++)
		{
			if (add_RateTypedrpdwn.get(i).getAttribute("title").trim().equals(rateType)) 
			{
				waitForElementToBeVisible(add_RateTypedrpdwn.get(i));
				clickElement(add_RateTypedrpdwn.get(i));
				logInfo("Rate Type is selected");
				RTText = add_RateType.getAttribute("title");
				break;
			}
		}

		//LoadType 
		String loadType = SetExcelPath(FilePath, Sheetname, 16, j).trim();
		waitForElementToBeVisible(add_LoadType);
		clickElement(add_LoadType);
		waitForElementToBeVisible(add_LoadTypeDrpdwn);
		for (int i = 0; i < add_LoadTypeDrpdwn.size(); i++) 
		{
			if (add_LoadTypeDrpdwn.get(i).getAttribute("title").trim().equals(loadType)) 
			{
				waitForElementToBeVisible(add_LoadTypeDrpdwn.get(i));
				clickElement(add_LoadTypeDrpdwn.get(i));
				logInfo("Load Type is selected");
				LTText = add_LoadType.getAttribute("title");
				break;
			}
		}

		// --Resource Type
		String resourceType = SetExcelPath(FilePath, Sheetname, 17, j).trim();
		waitForElementToBeVisible(add_ResType);
		clickElement(add_ResType);	
		waitForElementToBeVisible(add_ResTypedrpdwn);
		for (int i = 0; i < add_ResTypedrpdwn.size(); i++) {
			if (add_ResTypedrpdwn.get(i).getAttribute("title").trim().contains(resourceType)) 
			{
				waitForElementToBeVisible(add_ResTypedrpdwn.get(i));
				clickElement(add_ResTypedrpdwn.get(i));
				logInfo("Resource Type is selected");
				ResTypeText = add_ResType.getAttribute("title");
				break;
			}
		}

		String profileText = ""	;
		if (j == 1) 
		{
			waitForElementToBeVisible(add_ProfileName);
			profileText = add_ProfileName.getAttribute("title");
			String ProfileTextExp = "" + WorkCntryText + " " + CTText + " " + EPText + " " + RTText + " " + LTText
					+ " " + ResTypeText + " " + CityText + "";

		}

			waitForElementToBeVisible(profilePage_input_Save);
			clickElement(profilePage_input_Save);
			waitForTextToBePresentInElement(profile_ActiveGridSaveMessage, "Profile saved successfully");
			
			logInfo("Added Profile: "+profileText);
			
			for(int i=0; i< activeProfiles_Profilename.size();i++) {
				waitForElementToAppear(activeProfiles_Profilename.get(i));
				
				if(activeProfiles_Profilename.get(i).getAttribute("title").trim().equals(profileText.trim())) {
					logPass("SA can create new profile on click of 'Add Profile Icon");
					scenarioFlag = true;
					break;
				}	
			}
			
		if (scenarioFlag == true)
			scenarioPass();
		else {
			logFail("SA can not create new profile on click of 'Add Profile Icon");
			scenarioFail();
		}
		
		return profileText;

	}
	
	
	/**
	 * TC_31: Validate if the SA is able to Edit a profile on click of Edit button under Action column of profile section.
	 * 
	 * @since 05/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
	public void editProfile(String FilePath, String Sheetname, int startRow, int startCol ) throws Exception {
//		for (int j = startCol; j < j + 1; j++) 
//		{
		int j = startCol;
		String ProfileToEdit = null;
		String name = "";
		String payrollCountry = "";
		String workCounty = "";
		String city = "";
		String CT = "";
		String EP = "";
		String RT = "";
		String LT = "";
		String resourceType = "";
		try 
		{
			ProfileToEdit = SetExcelPath(FilePath, Sheetname, startRow, j);
		} 
		catch (Exception e) {}
//		if (ProfileToEdit == null || ProfileToEdit == "")
//			break;
		try 
		{
			name = SetExcelPath(FilePath, Sheetname, startRow + 1, j);
		} 
		catch (Exception e) {}
		try 
		{
			payrollCountry = SetExcelPath(FilePath, Sheetname, startRow + 2, j);
		} 
		catch (Exception e) {}
		try 
		{
			workCounty = SetExcelPath(FilePath, Sheetname, startRow + 3, j);
		} catch (Exception e) {}
		try 
		{
			city = SetExcelPath(FilePath, Sheetname, startRow + 4, j);
		} catch (Exception e) {}
		try
		{
			CT = SetExcelPath(FilePath, Sheetname, startRow + 5, j);
		} catch (Exception e) {}
		try 
		{
			EP = SetExcelPath(FilePath, Sheetname, startRow + 6, j);
		} catch (Exception e) {}
		try 
		{
			RT = SetExcelPath(FilePath, Sheetname, startRow + 7, j);
		} catch (Exception e) {}
		try {
			LT = SetExcelPath(FilePath, Sheetname, startRow + 8, j);
		} catch (Exception e) {}
		try 
		{
			resourceType = SetExcelPath(FilePath, Sheetname, startRow + 9, j);
		} 
		catch (Exception e) {}
		
		waitForElementToAppear(profiles_ActiveTab);
		waitForElementToBeVisible(profiles_ActiveTab);
		clickElement(profiles_ActiveTab);


		for (int k = 0; k < activeProfiles_Profilename.size(); k++) 
		{
			String profileName = getText(getDriver()
					.findElement(By.xpath(".//*[@id = 'gridActive']//div[@role='row' and @row-id = '" + k
							+ "']//*[@col-id='ProfileName' and not(contains(@class,'header-cell'))]")));
			if (profileName.equalsIgnoreCase(ProfileToEdit)) 
			{
				
				scrollHorizontallyInsideElement(activeProfile_Container, 1000);
				clickElement(profile_search);
				WebElement Edit = getDriver()
						.findElement(By.xpath("//*[@id='profile-active']//div[@role='row' and @row-id = '" + k
								+ "']//div[contains(@class,'ag-cell ag-cell-not-inline-editing')]/img[@title='Edit']"));
				clickElement(Edit);
				if ((!name.equalsIgnoreCase("NA")) && (!name.equals(""))) 
				{
					waitForElementToBeVisible(add_ProfileName);
					clickElement(add_ProfileName);
					clear(add_ProfileName);
					sendKeys(add_ProfileName,name);
					action.sendKeys(Keys.TAB).perform();
				}

				// Payroll country
				if ((!payrollCountry.equalsIgnoreCase("NA")) && (!payrollCountry.equals(""))) 
				{
					expandDropdown(add_PayrollCountry);
					for (int i = 0; i < add_PayrollCountrydrpdwn.size(); i++) 
					{
						if (add_PayrollCountrydrpdwn.get(i).getAttribute("title").trim().equals(payrollCountry)) 
						{
							clickElement(add_PayrollCountrydrpdwn.get(i));
							logInfo("Payroll Country is selected");
							break;
						}
					}
				}

				//WorkCountry
				if ((!workCounty.equalsIgnoreCase("NA")) && (!workCounty.equals(""))) 
				{
					expandDropdown(add_WorkCountry);
					int Count1 = add_WorkCountrydrpdwn.size();
					for (int i = 0; i < Count1; i++) 
					{
						if (add_WorkCountrydrpdwn.get(i).getAttribute("title").equals(workCounty)) 
						{
							clickElement(add_WorkCountrydrpdwn.get(i));
							logInfo("Work Country is Edit");
							break;
						}
					}
				}

				//City 
				if ((!city.equalsIgnoreCase("NA")) && (!city.equals(""))) 
				{
					clickElement(add_ProfileCity);
					clear(add_ProfileCity);
					sendKeys(add_ProfileCity,city);
					addPaddedWait(2);
					for (int i = 0; i < add_CityDrpdwn.size(); i++) 
					{
						if (add_CityDrpdwn.get(i).getAttribute("title").trim().equals(city)) 
						{
							clickElement(getDriver().findElements(By.xpath("//*[@id='ulCity']/li")).get(i));
							logInfo("City is Edited");
							break;
						}

					}
				}
				//Career Track
				if ((!CT.equalsIgnoreCase("NA")) && (!CT.equals(""))) 
				{
					clickElement(add_CT);
					for (int i = 0; i < add_CTDrpdwn.size(); i++) 
					{
						if (add_CTDrpdwn.get(i).getAttribute("title").trim().equals(CT)) 
						{
							clickElement(add_CTDrpdwn.get(i));
							logInfo("Career Track is Edited");
							break;
						}
					}
				}

				//Economic profile
				if ((!EP.equalsIgnoreCase("NA")) && (!EP.equals("")))
				{
					clickElement(add_EP);
					for (int i = 0; i < add_EPdrpdwn.size(); i++) 
					{
						if (add_EPdrpdwn.get(i).getAttribute("title").trim().equals(EP)) 
						{
							clickElement(add_EPdrpdwn.get(i));
							logInfo("Economic Profile is Edited");
							break;
						}
					}
				}

				//RateType
				if (!RT.equals("")) {
					clickElement(add_RateType);
					for (int i = 0; i < add_RateTypedrpdwn.size(); i++) 
					{
						if (add_RateTypedrpdwn.get(i).getAttribute("title").trim().equals(RT)) 
						{
							clickElement(add_RateTypedrpdwn.get(i));
							logInfo("Rate Type is Edited");
							break;
						}
					}
				}

				//LoadType Drop down selection
				if (!LT.equals("")) {
					clickElement(add_LoadType);
					for (int i = 0; i < add_LoadTypeDrpdwn.size(); i++) {
						if (add_LoadTypeDrpdwn.get(i).getAttribute("title").trim().equals(LT)) {
							clickElement(add_LoadTypeDrpdwn.get(i));
							logInfo("Load Type is Edited");
							break;
						}
					}
				}
				//Resource Type drop down selection
				if ((!resourceType.equalsIgnoreCase("NA")) || (!resourceType.equals(""))) {
					clickElement(add_ResType);
					for (int i = 0; i < add_ResTypedrpdwn.size(); i++) {
						if (add_ResTypedrpdwn.get(i).getAttribute("title").trim()
								.contains(resourceType)) {
							clickElement(add_ResTypedrpdwn.get(i));
							logInfo("Resource Type is selected");
							break;
						}
					}
				}

				action.sendKeys(Keys.TAB).perform();
				
				try {
					profilePage_input_Save.click();
					getDriver().switchTo().alert().accept();
					logPass("profile Parameters has been edited successfully");
				}catch (Exception e) {
					clickElement(profilePage_input_Save);
					
					waitForTextToBePresentInElement(profile_EditSaveMessage,"Profile saved successfully.");
					logPass("profile Parameters has been edited successfully");
				}	
				try {
					waitForTextToBePresentInElement(profile_EditSaveMessage,"Profile saved successfully.");
					logPass("profile Parameters has been edited successfully");
				}
				catch(Exception e) {
					
				}
				
				try {
					waitForElementToBeVisible(autorefreshoption);
					clickElement(autorefreshoption);
					waitForElementToBeVisible(autorefreshoption_btnOK);
					clickElement(autorefreshoption_btnOK);
				} catch (Exception e) {}
				
				
				clickElement(ProfileEdit_Cancelbutton);
				
									
				scrollHorizontallyInsideElement(activeProfile_Container, -1000);
			}
		}
	}

	
	/**
	 * TC_33: Validate if SA is able to Deactivate a profile and view it under Inactive tab.
	 * 
	 * @since 06/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
	public void deactiveProfile(String FilePath, String SheetName, int RowNo, int ColNo) throws Exception
	{
		boolean scenarioFlag = true;
		
		scrollHorizontallyInsideElement(activeProfile_Container, -1000);
		
		try {
			waitForElementToBeVisible(activeProfiles_Profilename.get(0));
		}catch(Exception e) {
			waitForElementToAppear(activeProfiles_Profilename.get(0));
			waitForElementToBeVisible(activeProfiles_Profilename.get(0));
			waitForElementToAppear(activeProfiles_Profilename.get(0));
		}
		
		waitForElementToBeVisible(activeProfiles_Profilename);
		String profile_TOBE_removed = SetExcelPath(FilePath, SheetName, RowNo, ColNo);
		for (int i = 0; i < activeProfiles_Profilename.size(); i++) 
		{
			if (getText(activeProfiles_Profilename.get(i)).trim().equalsIgnoreCase(profile_TOBE_removed)) 
			{ 	waitForElementClickable(profiles_Chkbox.get(i));
				clickElement(profiles_Chkbox.get(i));
				break;
			}
		}
		jse.executeScript("window.scrollBy(0,-400)", "");
		waitForElementClickable(profiles_Deactivatebtn);
		jse.executeScript("arguments[0].click();", profiles_Deactivatebtn);		
		getDriver().switchTo().alert().accept();
		
		try {
			waitForTextToBePresentInElement(profile_Active_Inactive_SaveMsg, "Selected Profiles deactivated successfully.");
			waitForTextToBePresentInElement(profile_Active_Inactive_SaveMsg, "Selected Profiles deactivated successfully.");
		}catch(Exception e) {}
		
		waitForElementToBeVisible(profiles_InactiveTab);
		waitForElementClickable(profiles_InactiveTab);
		clickElement(profiles_InactiveTab);
		profiles_InactiveTab.click();
		
		boolean DeactivatedProfile_in_Inactive = false;
		
		try {
			waitForElementToBeVisible(profiles_Inactive_ProfilesNames.get(0));
		}catch(Exception e) {
			profiles_InactiveTab.click();
			waitForElementToAppear(profiles_Inactive_ProfilesNames.get(0));
			waitForElementToBeVisible(profiles_Inactive_ProfilesNames.get(0));
			waitForElementToAppear(profiles_Inactive_ProfilesNames.get(0));
		}
		
		
		for (int i = 0; i < profiles_Inactive_ProfilesNames.size(); i++) 
		{
			if (getText(profiles_Inactive_ProfilesNames.get(i)).trim().equalsIgnoreCase(profile_TOBE_removed)) 
			{
				DeactivatedProfile_in_Inactive = true;
				break;
			}
		}

		if (DeactivatedProfile_in_Inactive == true) 
		{   
			logPass("SA can Deactivate a profile and view it under Inactive tab.");
		} 
		else 
		{ 
			logFail("SA can not Deactivate a profile and view it under Inactive tab.");
			scenarioFlag = false;
		}
		
		if(scenarioFlag)
			scenarioPass();
		else
			scenarioFail();
		
	}
	
	/**
	 * TC_34: Validate if SA is able to active a profile which are deactivated and view it under active tab.
	 * 
	 * @since 07/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	public void activateProfile(String FilePath, String SheetName, int RowNo, int ColNo) throws Exception {
		boolean scenarioFlag = true;
		
		String profile_TOBE_removed = SetExcelPath(FilePath, SheetName, RowNo, ColNo);
	
		waitForElementToBeVisible(profiles_InactiveTab);
		waitForElementClickable(profiles_InactiveTab);
		clickElement(profiles_InactiveTab);
		profiles_InactiveTab.click();
		
		try {
			waitForElementToBeVisible(profiles_Inactive_ProfilesNames.get(0));
		}catch(Exception e) {
			waitForElementToAppear(profiles_Inactive_ProfilesNames.get(0));
			waitForElementToBeVisible(profiles_Inactive_ProfilesNames.get(0));
			waitForElementToAppear(profiles_Inactive_ProfilesNames.get(0));
		}
		
		for (int i = 0; i < profiles_Inactive_ProfilesNames.size(); i++) {
			if (getText(profiles_Inactive_ProfilesNames.get(i)).trim()
					.equalsIgnoreCase(profile_TOBE_removed)) {
				clickElement(waitForElementClickable(profiles_Inactive_chkbox.get(i)));
				break;
			}
		}
		
		waitForElementClickable(profiles_Activatebtn);
		jse.executeScript("arguments[0].click();", profiles_Activatebtn);
		getDriver().switchTo().alert().accept();
		
		try {
			waitForTextToBePresentInElement(profile_Active_Inactive_SaveMsg, "Selected Profiles activated successfully.");
			waitForTextToBePresentInElement(profile_Active_Inactive_SaveMsg, "Selected Profiles activated successfully.");
		}catch(Exception e) {}
		
		waitForElementClickable(profiles_ActiveTab);
		clickElement(profiles_ActiveTab);
		profiles_ActiveTab.click();
		
		try {
			waitForElementToBeVisible(activeProfiles_Profilename.get(0));
		}catch(Exception e) {
			waitForElementToAppear(activeProfiles_Profilename.get(0));
			waitForElementToBeVisible(activeProfiles_Profilename.get(0));
			waitForElementToAppear(activeProfiles_Profilename.get(0));
		}
			
		boolean ActivatedProfile_in_active = false;
		for (int i = 0; i < activeProfiles_Profilename.size(); i++) {
			if (getText(activeProfiles_Profilename.get(i)).trim().equalsIgnoreCase(profile_TOBE_removed)) {
				ActivatedProfile_in_active = true;
				break;
			}
		}
		if (ActivatedProfile_in_active == true)
			logPass("SA can active a profile which are deactivated and view it under active tab.");
		else {
			logFail("SA can not active a profile which are deactivated and view it under active tab.");
			scenarioFlag = false;
		}
		
		if(scenarioFlag)
			scenarioPass();
		else
			scenarioFail();
	}
	
	/**
	 * TC_32: Validate if the SA is able to copy a profile..
	 * 
	 * @since 07/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	
	public void copyProfile(String FilePath, String SheetName, int RowNo, int ColNo, int copydataRow) throws Exception{
	
		boolean scenarioFlag = false;
		
		String payrollCountry = "";
		String profile_TOBE_copy = SetExcelPath(FilePath, SheetName, RowNo, ColNo);
		
		try 
		{
			payrollCountry = SetExcelPath(FilePath, SheetName, copydataRow, 1);
		} 
		catch (Exception e) {}
	
		waitForElementToAppear(profiles_ActiveTab);
		waitForElementToBeVisible(profiles_ActiveTab);
		clickElement(profiles_ActiveTab);
		
		for (int k = 0; k < activeProfiles_Profilename.size(); k++) 
		{
			String profileName = getText(getDriver()
					.findElement(By.xpath(".//*[@id = 'gridActive']//div[@role='row' and @row-id = '" + k
							+ "']//*[@col-id='ProfileName' and not(contains(@class,'header-cell'))]")));
			if (profileName.equalsIgnoreCase(profile_TOBE_copy)) 
			{
				
				scrollHorizontallyInsideElement(activeProfile_Container, 1000);
				clickElement(profile_search);
				WebElement Copy = getDriver()
						.findElement(By.xpath("//*[@id='profile-active']//div[@role='row' and @row-id = '" + k
								+ "']//div[contains(@class,'ag-cell ag-cell-not-inline-editing')]/img[@title='Copy']"));
				
				clickElement(Copy);
				
				expandDropdown(add_PayrollCountry);
				for (int i = 0; i < add_PayrollCountrydrpdwn.size(); i++) 
				{
					if (add_PayrollCountrydrpdwn.get(i).getAttribute("title").trim().equals(payrollCountry)) 
					{
						waitForElementToAppear(add_PayrollCountrydrpdwn.get(i));
						waitForElementToBeVisible(add_PayrollCountrydrpdwn.get(i));
						clickElement(add_PayrollCountrydrpdwn.get(i));
						logInfo("Payroll Country is selected");
						break;
					}
				}
				
				clickElement(profilePage_input_Save);
				try {
					waitForTextToBePresentInElement(profile_SaveSuccessMsg, "Profile saved successfully");
					waitForTextToBePresentInElement(profile_SaveSuccessMsg, "Profile saved successfully");
				}catch(Exception e) {}
				
				try {
					clickElement(ProfileEdit_Cancelbutton);
				}
				catch(Exception e) {}
					
			}
		}
		
		scrollHorizontallyInsideElement(activeProfile_Container, -1000);
		String copied_Profile = "Copy_"+profile_TOBE_copy;   //Copy_Test
		
		for (int k = 0; k < activeProfiles_Profilename.size(); k++) 
		{
			if(activeProfiles_Profilename.get(k).getAttribute("title").equals(copied_Profile)) {
				scenarioFlag = true;
				break;
			}
		}
		
		if(scenarioFlag) {
			logPass("SA can copy a profile.");
			scenarioPass();
		}
		else {
			logFail("SA can not copy a profile.");
			scenarioFail();
		}		
		
	}
	
	
	//Validate if SA is able to Export Named Resource Template, import and then download the Named Resource Tab.
	public void validateNameResourceReportTab() throws Exception{
		Kda = PageFactory.initElements(getDriver(), KDAReport_Page.class);
		String name = ConfigFileReader.getTestData("credentials.UserID1");
		String user = name.split("@")[0].toLowerCase();
		boolean scenarioFlag = false;
		
		waitForElementToBeVisible(NamedResourceExport_Tab);
		clickElement(NamedResourceExport_Tab);
		
		if(nameResource_DownloadBtn.isDisplayed() && nameResource_ImportBtn.isDisplayed()) {
			logInfo("Name resource Download and Import button are displayed");
		}
		waitForElementToAppear(nameResource_DownloadBtn);
		waitForElementToBeVisible(nameResource_DownloadBtn);
		clickElement(nameResource_DownloadBtn);
		
		waitForElementToAppear(nameResource_IUnderstand);
		waitForElementToBeVisible(nameResource_IUnderstand);
		clickElement(nameResource_IUnderstand);
		loader();
		
		boolean flag = Kda.isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath,"mySP_EnterpriseIdImportTemplate");
		String resource_FileName="";
		if(flag == true) {
			logPass("File downloaded successfully");
			scenarioFlag = true;
			resource_FileName = getFilePresent(ConstantUtils.DownloadedFiles_FilePath);
		}
		logInfo(resource_FileName);
		
		String resourceNameName = ConstantUtils.DownloadedFiles_FilePath.concat(resource_FileName);;
				
		writeData(resourceNameName, "Sheet1", 2, 0, user);
		
		waitForElementToAppear(nameResource_ImportBtn);
		waitForElementToBeVisible(nameResource_ImportBtn);
		clickElement(nameResource_ImportBtn);
		waitForElementToAppear(nameResource_ImportContainer);
		waitForElementToBeVisible(nameResource_ImportContainer);
		
		sendKeys(nameResource_ImportInput, resourceNameName);	
		clickElement(nameResource_ImportOKBtn);
		loader();
		loader();
		if(nameResource_ImportRow.isDisplayed()) {
			logPass("File Imported successfully");
			scenarioFlag = true;
		}
		else {
			logPass("File not Imported successfully");
			scenarioFlag = false;
		}
		
		if(scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}
	
	
	public String getFilePresent(String dirPath) throws Exception{
		boolean flag=false;
		
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        flag = false;
	    }
	    
	    
	    File lastModifiedFile = files[0];  
    	for(int j = 1;j < files.length; j++) {
	    	if (lastModifiedFile.lastModified() < files[j].lastModified() && (files[j].getName().contains("xlsx") || files[j].getName().contains("xlsm"))) {
		           lastModifiedFile = files[j];
		    }
    	}
    	 
	    return lastModifiedFile.getName();
	}

	
	public void renameFile(File fileName, String newFileName) {
		
		String resourceUpdatedFile = ConstantUtils.DownloadedFiles_FilePath+newFileName;	
		File newFile = new File(resourceUpdatedFile);	
		fileName.renameTo(newFile);
		
	}
	
	
	
	
	
	
	
	
	
	
}
