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
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.ConstantUtils;
import reusableComponents.ExcelUtilities;
import reusableComponents.GlobalScreen;


public class  Pyramids_Page extends BasePage
{
	public Actions action = new Actions(getDriver());

	/************ Locators ********************/

	@FindBy(how = How.XPATH, using = "//*[@id='ExportPyramidLink'][1]")
	public WebElement Pyramid_SDExportbtn;

	@FindBy(how = How.XPATH, using = "//*[@id='importPyramidID']")
	public WebElement Pyramid_SDImportbtn;

	@FindBy(how = How.XPATH, using = "//*[@id='selectAllGroupsProfiles']")
	public WebElement Pyramid_GroupsProfilesSelection_radiobtn;

	@FindBy(how = How.XPATH, using = "//*[@id='selectPercentageNew']")
	public WebElement Pyramid_ModeSelection_radiobtn;

	@FindBy(how = How.XPATH, using = "//*[@id='selectPercentageNew']/../../../../..//*[text() ='OK']")
	public WebElement Pyramid_GroupsProfilespopup_savebtn;

	@FindBy(how = How.XPATH, using = "//*[@id='li_Export_Import_STATUS']")
	public WebElement ExportandImportStatustab;

	@FindBy(how = How.XPATH, using = ".//*[@id='li_SDCORE']")
	public WebElement SDCOREtab;

	@FindBy(how = How.XPATH, using = ".//*[@role='row' and @row-id='0']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement Export_Status;

	@FindBy(how = How.XPATH, using = ".//*[@role='row' and @row-id='1']//*[@col-id='expimpstatusdesc'][contains(@class,'ag-cell')]/span/*")
	public WebElement Import_Status;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'File Name')]")
	public WebElement Header_FileName;

	@FindBy(how = How.XPATH, using = ".//*[@role='row' and @row-id='0']//*[@col-id='FileNm']//img")
	public WebElement Download_icon;

	@FindBy(how = How.XPATH, using = "//div[@col-id='FileNm']/span/a/..")
	public WebElement Download_FileName;

	@FindBy(how = How.XPATH, using = "//*[@id='rbt_G']")
	public WebElement Pyramid_AutoRefreshPopUpSDImport_Autorefresh;

	@FindBy(how = How.XPATH, using = "//*[@id='rbt_A']")
	public WebElement Pyramid_AutoRefreshPopUpPyramidEditChanges;

	@FindBy(how = How.XPATH, using = "//*[@id='importPyramidAFId']//em[text()='OK']")
	public WebElement Pyramid_ActualPryramidType_SolutionRefresh_PopUp_btnOK;

	@FindBy(how = How.XPATH, using = "//input[@id='files_Pyramid']")
	public WebElement Pyramid_SDImport_clicktoBrowse;

	@FindBy(how = How.XPATH, using = "//*[@id='btnImprtPyramid' and text()='OK']")
	public WebElement Pyramid_SDImport_OkBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='EditPyramid']/a/img ")
	public WebElement NewPyramid_EditPyramid;

	@FindBy(how = How.XPATH, using = "//*[@id='sdcore-pyramid-manage']//img[contains(@src,'../assets/image/Delete')]")
	public List<WebElement> Pyramid_ClosePyramidType;

	@FindBy(how = How.XPATH, using = "//ul[@id='ulPyramidNm']/li")
	public List<WebElement> NewPyramid_drpdwn_Pyramidtypes;

	@FindBy(how = How.XPATH, using = "//button[@data-toggle='dropdown'][@id='PyramidId'] ")
	public WebElement NewPyramid_btnSelectPyramid_drpdwn;

	@FindBy(how = How.XPATH, using = "//table[@class='distribution-table']//img[contains(@src,'/image/Add')]")
	public WebElement NewPyramid_AddPyramid;

	@FindBy(how = How.XPATH, using = "//*[@id='sdcore-pyramid-manage']//tr")
	public List<WebElement> NewPyramid_PppUpPyramidistribtn;

	@FindBy(how = How.XPATH, using = "//div[@id='sdcore-pyramid-manage']//em[text()='SAVE']")
	public WebElement EditPyramid_popup_Savebtn;

	@FindBy(how = How.XPATH, using = "//input[@id='txtDistributionPct']")
	public WebElement NewPyramid_DistrPer;

	@FindBy(how = How.XPATH, using = "//*[@id='rbt_A']/../../..//em[text()='OK']")
	public WebElement EditPyramid_SolutionRefresh_PopUp_btnOK;

	@FindBy(how = How.XPATH, using = "//*[@id='successErrorDefinePyramidMsgId']//span")
	public WebElement EditPyramid_SucessMsg;

	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'Carousel-inner-Year') and not (@style='visibility:hidden')]//strong)[1]")
	public WebElement Year1_Pyramids;

	@FindBy(how = How.XPATH, using = "//div[@id='modeSelection']//input[@id='selectFTENew']")
	public WebElement FTESelection;

	@FindBy(how = How.XPATH, using = "//div[contains(@id,'overlay')]//button/em[text()='I understand']")
	public WebElement Downloadfile_IUnderstandConfidentialPopup;

	@FindBy(how = How.XPATH, using = "//ul[@role='tablist']//a")
	public List<WebElement> Tablist;

	@FindBy(how = How.XPATH, using = "//ul[@role='tablist']//li")
	public List<WebElement> Tablist_active;

	@FindBy(how = How.XPATH, using = "//div[contains(@id,'Carousel-inner-Year') and not (@style='visibility:hidden')]//div//div//strong")
	public List<WebElement> YearSplit;

	@FindBy(how = How.XPATH, using = "//*[@id='serviceDeliveryGrid']//div[@ref='eBodyViewport']")
	public WebElement MonthlyGrid;

	@FindBy(how = How.XPATH, using = "//div[@class='switch-group']//label[@class='noborderright']//span")
	public WebElement FTEbutton;

	@FindBy(how = How.XPATH, using = "//div[@class='switch-group']//label[@class='noborderleft']//span")
	public WebElement Percentagebutton;

	@FindBy(how = How.XPATH, using = "//div[contains(@col-id,'FTE') and @role='presentation']")
	public List<WebElement> MonthsList;


	/**************** Methods *********************/

	public Pyramids_Page() 
	{
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}


	/**
	 * TC_68: Validate if the SA is able to navigate to Pyramids tab on click of 'Pyramids' and 
	 * is able to view Transition,SD Core, SD RUM,SD Summary,Summary and Export Import Status tab.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author s.ah
	 */

	public void ValidationPyramidsTab() throws Exception{

		boolean scenarioFlag = true;

		if(isDisplayed(SDCOREtab))
			logPass("Pyramids tab is opened");
		else 
		{
			logFail("Pyramids tab is not opened");
			scenarioFlag = false;
		}

		for(int i=0;i<Tablist_active.size();i++) {
			clickElement(Tablist.get(i));
			loader();
			String Tabname = getText(Tablist.get(i)).trim();
			String class_active = Tablist_active.get(i).getAttribute("class").trim();
			if(class_active.equals("active")) 
				logPass("SA is able to view "+Tabname+" tab and tab is opened.");
			else {
				logFail("SA is not able to view "+Tabname+" tab and tab is not opened.");
				scenarioFlag = false;
			}
		}

		if (scenarioFlag == true)
			scenarioPass();	
	}



	/**
	 * TC_69:Validate if SA is able to Select/Edit Pyramid Type for a given Profile.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author s.ah
	 */

	public void ValidateEditPyramid() throws Exception
	{

		clickElement(SDCOREtab);

		String Percentage = "100";
		String PyramidType= "Offshore Custom AD - Skill Tier 1 Low";

		loader();
		waitForElementToBeVisible(NewPyramid_EditPyramid);
		clickElement(NewPyramid_EditPyramid);		

		for (WebElement close : Pyramid_ClosePyramidType) 
		{
			waitForElementToBeVisible(close);
			clickElement(close);
		}

		clickElement(NewPyramid_btnSelectPyramid_drpdwn);

		for(int k = 1; k <= NewPyramid_drpdwn_Pyramidtypes.size(); k++) 
		{
			jse.executeScript("arguments[0].scrollIntoView(true);", NewPyramid_drpdwn_Pyramidtypes.get(k));

			logInfo((NewPyramid_drpdwn_Pyramidtypes.get(k).getAttribute("id")));

			if (NewPyramid_drpdwn_Pyramidtypes.get(k).getAttribute("id").equalsIgnoreCase(PyramidType)) 
			{
				try 
				{
					clickElement(NewPyramid_drpdwn_Pyramidtypes.get(k));
				} 
				catch (Exception e) 
				{
					clickElement(NewPyramid_btnSelectPyramid_drpdwn);
					clickElement(NewPyramid_drpdwn_Pyramidtypes.get(k));
				}
				break;
			} 

		}
		loader();
		clear(NewPyramid_DistrPer);
		sendKeys(NewPyramid_DistrPer,Percentage);
		clickElement(NewPyramid_AddPyramid);
		clickElement(EditPyramid_popup_Savebtn);

		clickElement(Pyramid_AutoRefreshPopUpPyramidEditChanges);
		clickElement(EditPyramid_SolutionRefresh_PopUp_btnOK);

		waitForElementToBeVisible(EditPyramid_SucessMsg);
		if((EditPyramid_SucessMsg.getAttribute("title")).equalsIgnoreCase("Actual Pyramid type Saved Successfully."))
		{
			logPass("SA is able to Select and Edit Pyramid Type for a given Profile");
			scenarioPass();
		}
		else 
			logFail("SA is not able to Select and Edit Pyramid Type for a given Profile");

	}


	/**
	 * TC_70: Validate if SA is able to View the Career Level wise split for the given profile.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author kamali.babu
	 */

	public void YearSplit() throws Exception
	{

		boolean scenarioFlag = true;
		int MonthCount = 1;
		List<String> Levels = new ArrayList<>(Arrays.asList("Accenture Leadership", "5-Associate Director", "6-Senior Manager", "7-Manager", "8-Associate Manager", "9-Team Lead/Consultant", "10-Senior Analyst", "11-Analyst", "12-Associate", "13-New Associate", "PYRAMID TOTAL", "RAMP UP TOTAL"));

		clickElement(FTEbutton);

		for(int i=0;i<YearSplit.size();i++) {
			clickElement(YearSplit.get(i));
			String year = getText(YearSplit.get(i)).trim();
			if(isDisplayed(MonthlyGrid)) {
				logPass("Year "+year+" details are displayed.");
			}
			else {
				logFail("Error opening "+year+" details.");
				scenarioFlag = false;
			}
			for(int j=0;j<Levels.size();j++) {
				String Name = getDriver().findElement(By.xpath("//*[@id='serviceDeliveryGrid']//div[@role='row' and @row-index='"+j+"']//div[@col-id='CareerLevelDesc']")).getAttribute("title").trim();
				if(! Name.equals(Levels.get(j))) {
					logFail(Name+" level is not present for Year "+year);
					scenarioFlag = false;
					break;
				}
			}
			if(scenarioFlag == true) {
				logPass("All Accenture levels are present for Year "+year);
			}
			for(int k=0;k<MonthsList.size();k++) {
				if(k==4) {
					scrollHorizontallyInsideElement(MonthlyGrid, 1000);
				}
				double sum = 0;
				String colName = MonthsList.get(k).getAttribute("col-id").trim();
				for(int l=0;l<Levels.size()-2;l++) {
					double value = Double.parseDouble(getDriver().findElement(By.xpath("//div[@row-index='"+l+"']//div[@col-id='"+colName+"']")).getAttribute("title").trim());
					if(value > 0) {
						sum  += value;
					}
					else {
						logFail("Row "+(l+1)+" of M"+MonthCount+" in year "+year+" is not greater than 0.");
						scenarioFlag = false;
						break;
					}
				}
				double PyramidTotal = Double.parseDouble(getDriver().findElement(By.xpath("//div[@row-index='"+(Levels.size()-2)+"']//div[@col-id='"+colName+"']//button")).getAttribute("title").trim());
				double RampupTotal = Double.parseDouble(getDriver().findElement(By.xpath("//div[@row-index='"+(Levels.size()-1)+"']//div[@col-id='"+colName+"']//button")).getAttribute("title").trim());

				if(Math.round(sum) == PyramidTotal  && PyramidTotal == RampupTotal)
					logPass("M"+MonthCount+" details of Year "+year+" in pyramid total matched with Rampup total.");
				else {
					logFail("M"+MonthCount+" details of Year "+year+" in pyramid total not matched with Rampup total.");
					scenarioFlag = false;
					break;
				}
				MonthCount++;
			}
			scrollHorizontallyInsideElement(MonthlyGrid, -1000);

		}

		if (scenarioFlag == true)
			scenarioPass();	
	}
	
	
	/**
	 * TC_71:Validate is SA is able to Import/Export Pyramid file
	 * TC_72:Validate if SA I able to see the Status of OU in Export/Import Status File.
	 * TC_73:Validate if SA is able to see make the changes in exported excel and on import, the same changes 
	 * should reflect on UI.
	 * 
	 * @since 19/03/2024
	 * 
	 * @release March 16
	 * 
	 * @author s.ah
	 */

	public void ValidatePyramidExportImport() throws Exception {

		boolean scenarioFlag = true;

		waitForElementToBeVisible(Year1_Pyramids);
		clickElement(Year1_Pyramids);

		clickElement(FTEbutton);

		loader();
		String colName = MonthsList.get(0).getAttribute("col-id").trim();
		List<WebElement> Month_1_List = getDriver().findElements(By.xpath("//div[@col-id='"+colName+"' and @role='gridcell']"));
		String value1 = Month_1_List.get(0).getAttribute("title").trim();
		String value2 = Month_1_List.get(1).getAttribute("title").trim();
		logInfo(value1);
		logInfo(value2);

		clickElement(Pyramid_SDExportbtn);
		clickElement(FTESelection);
		clickElement(Pyramid_GroupsProfilespopup_savebtn);
		loader();

		clickElement(ExportandImportStatustab);
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
		String Real_Path = ConstantUtils.DownloadPath + path;

		writeDataToExcel(Real_Path, "SD Core", 2, 5, value2);
		writeDataToExcel(Real_Path, "SD Core", 3, 5, value1);

		clickElement(SDCOREtab);
		waitForElementToBeVisible(Pyramid_SDImportbtn);
		clickElement(Pyramid_SDImportbtn);

		clickElement(Pyramid_AutoRefreshPopUpSDImport_Autorefresh);
		clickElement(Pyramid_ActualPryramidType_SolutionRefresh_PopUp_btnOK);

		Pyramid_SDImport_clicktoBrowse.sendKeys(Real_Path);

		clickElement(Pyramid_SDImport_OkBtn);

		clickElement(ExportandImportStatustab);
		waitForElementToBeVisible(Header_FileName);
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


		clickElement(SDCOREtab);
		loader();
		clickElement(Year1_Pyramids);
		clickElement(FTEbutton);

		String colName2 = MonthsList.get(0).getAttribute("col-id").trim();
		List<WebElement> Month_1_List1 = getDriver().findElements(By.xpath("//div[@col-id='"+colName2+"' and @role='gridcell']//input"));
		String value3 = Month_1_List1.get(0).getAttribute("title").trim();
		String value4 = Month_1_List1.get(1).getAttribute("title").trim();

		logInfo("value3 -> "+ value3);
		logInfo("value4 -> "+ value4);

		if(value1.equals(value4) && value2.equals(value3)) 
			logPass("SA is able to make the changes in exported excel and on import, the same changes are reflecting on UI.");

		else
		{
			logFail("SA is not able to make the changes in exported excel and on import, the same changes are not reflecting"
					+ "on UI.");
			scenarioFlag = false;
		}

		if (scenarioFlag == true)
		{
			logPass("SA is able to make the changes in Import/Export file in SDCore tab, and"
					+ " able to view status in Export/Import tab in Pyramids screen");
			scenarioPass();
		}
		else
			logFail("SA not able to make the changes in Import/Export file in SDCore tab, and"
					+ "not able to view status in Export/Import tab in Pyramids screen");		

	}	

}