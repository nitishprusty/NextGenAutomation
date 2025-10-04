package pageObjects;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.ConstantUtils;
import reusableComponents.GlobalScreen;

public class KDAReport_Page extends BasePage{
	
/***************** LOCATORS ************************/
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnSimulateSolution']")
	public WebElement simulateSolution_Btn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='IsSCCSuggesion']//button/em[text()='OK']")
	public WebElement sccSuggession_OKBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='CostSimultion-popup']//button//em[text()='Ok']")
	public WebElement costSimulationMessgae_OKBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='nearShorePopUp']//button//em[text()='Without Nearshore']")
	public WebElement nearShorePopUP_WithoutNearshoreBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='SCPSuccessErrorMessage']/span")
	public WebElement costSimulation_successMsg; // Simulation cost and price generated successfully.
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnViewSCP']")
	public WebElement costSimulation_ViewBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='divScpProgressBar']//ul/li")
	public List<WebElement> costSimulation_ProgressFields;
	
	@FindBy(how = How.XPATH, using = "//*[@id='AOKDA']")
	public WebElement KDA_screen;
	
	@FindBy(how = How.XPATH, using = "//*[@class='showhovertt']")
	public WebElement KDA_sourceDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@class='showhovertt']//following-sibling::ul/li/a")
	public List<WebElement> KDA_sourceList;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnViewKDAReport']")
	public WebElement KDA_ViewKDA;
	
	@FindBy(how = How.XPATH, using = "//button[@id='openModalButton']")
	public WebElement Kda_ReportDownloadButton;
	
	@FindBy(how = How.XPATH, using = "//h4[text()='Export to Excel']")
	public WebElement ExportToExcelTab;
	
	@FindBy(how = How.XPATH, using = "//button[@id='ddlScpExcelYearWise']")
	public WebElement ExportToExcelTab_dropDown;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='ulVersion']//li//a")
	public List<WebElement> ExportToExcelTab_dropDownList;
	
	@FindBy(how = How.XPATH, using = "//button[@id='excelInfoOk']//em")
	public WebElement ExportToExcel_download;
	
	@FindBy(how = How.XPATH, using = "//div[@role='document']//em[text()='I understand']")
	public WebElement ConfidentialPopUp_IUnderstandBtn;
	
	@FindBy(how = How.XPATH, using = "//a[@id='dealViewId']")
	public WebElement dealView;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'excel-extract')]//button[@class='close']/span")
	public WebElement close_ExportTab;
	
	@FindBy(how = How.XPATH, using = "//div[@id='tileMetricsId']//img[@id='metricsExpandId']")
	public WebElement metrics_Expand;
	
	@FindBy(how = How.XPATH, using = "//div[@id='MetricsCountId']//span[text()='View KDA']")
	public WebElement metrics_ViewKda;
	
	@FindBy(how = How.XPATH, using = "//div[@id='divMetricsKDAViewGrid']//img[contains(@src,'report')]")
	public WebElement viewKda_ReportDownloadBtn;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btnRequestPricing']")
	public WebElement GeneratePricing;

	@FindBy(how = How.XPATH, using = "//div[@id='IsSCCSuggesion']//em[text()='OK']")
	public WebElement SCC_Warning_OK_Btn;

	@FindBy(how = How.XPATH, using = "//em[text()='NO TAX']")
	public WebElement GenerateNoTaxPricing;

	@FindBy(how = How.XPATH, using = "//em[text()='ACTUAL TAX']")
	public WebElement GenerateActualTaxPricing;
	
	@FindBy(how = How.XPATH, using = "//em[text()='With Nearshore']/parent::button")
	public WebElement CS_WithNearshoreBtn;
	
	@FindBy(how = How.XPATH, using = "//em[text()='Without Nearshore']/parent::button")
	public WebElement CS_WithoutNearshoreBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='myCarouselFirst']//div[contains(@id,'Carousel-inner-Year')][not(@style)]//input")
	public List<WebElement> yearList;
	
	@FindBy(how = How.XPATH, using = "//div[@class='next-img']")
	public WebElement NextBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtBillingDiscount']")
	public WebElement billingDiscountInput;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnSaveScpScreen']")
	public WebElement saveGeneratePricing_OCP;
	
	/********************** METHODS **************************/
	
	public void NavigateToGeneratePricing() throws Exception{
		
		clickElement(NextBtn);
		Navigate_to_Screen(GlobalScreen.GENERATE_PRICING);
		Navigate_to_subTab(GlobalScreen.SUBTAB_COST_SIMULATION);
		
	}
	
	public void CS_dataFill() throws Exception{
//		jse.executeScript("arguments[0].scrollIntoView(true)",yearList.get(0));
		jse.executeScript("arguments[0].scrollIntoView(true)",yearList.get(0));
		waitForElementToAppear(yearList.get(0));
		waitForElementToBeVisible(yearList.get(0));
		for(int i=0;i<yearList.size();i++) {
			clickElement(yearList.get(i));
			clear(yearList.get(i));
			sendKeys(yearList.get(i), "5");
		}
		
		clickElement(billingDiscountInput);
		clear(billingDiscountInput);
		sendKeys(billingDiscountInput, "4");
		
		clickElement(saveGeneratePricing_OCP);
		
	}
	
	
	/**
	 * TC 121 : Validate if SA is able to view CS steps when in progress as well and 'View Simulate Cost and Price' button gets enable when CS is completed.
	 * @since 11/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	public void validateViewSimulate() throws Exception{
		boolean scenarioFlag = false;
//		CS_dataFill();
		waitForElementToBeVisible(simulateSolution_Btn);
		clickElement(simulateSolution_Btn);
		
		waitForElementToBeVisible(sccSuggession_OKBtn);
		clickElement(sccSuggession_OKBtn);
		
		try {
			waitForElementToBeVisible(costSimulationMessgae_OKBtn);
			clickElement(costSimulationMessgae_OKBtn);
		}catch(Exception e) {}
		
		waitForElementToBeVisible(nearShorePopUP_WithoutNearshoreBtn);
		clickElement(nearShorePopUP_WithoutNearshoreBtn);
		
		waitForTextToBePresentInElement(costSimulation_successMsg, "Simulation cost and price generated successfully.");
		
		boolean isCompleted = true;
		
		for(int i = 0 ; i<costSimulation_ProgressFields.size();i++) {
			if(!costSimulation_ProgressFields.get(i).getAttribute("class").equals("completed")) {
				isCompleted = false;
				break;
			}
		}
		
		if(isCompleted== true && costSimulation_ViewBtn.getAttribute("class").equals("hide show")) {
			logPass("SA can view CS steps when in progress as well and 'View Simulate Cost and Price' button gets enable when CS is completed.");
			scenarioFlag = true;
		}
		else{
			logFail("SA can not view CS steps when in progress as well and 'View Simulate Cost and Price' button gets enable when CS is completed.");
		}
		
		if(scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}
	
	
	
	/**
	 * TC 122 : Validate if SA is able to navigate to KDA tab on click of KDA.
	 * @since 12/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	public void navigateToKDAScreen() throws Exception{
		boolean scenarioFlag = false;
		
		jse.executeScript("arguments[0].scrollIntoView(true);", KDA_screen);
		waitForElementToBeVisible(KDA_screen);
		clickElement(KDA_screen);
		
		waitForElementToBeVisible(KDA_sourceDropdown);
		
		if(KDA_sourceDropdown.isDisplayed()) {
			logPass("SA can navigate to KDA tab on click of KDA");
			scenarioFlag = true;
		}
		else {
			logFail("SA can not navigate to KDA tab on click of KDA");
		}
		
		if(scenarioFlag == true)
			scenarioPass();
		else {
			scenarioFail();
		}
	}
	
	
	
	/**
	 * TC 123 : Validate if SA is able to see 'Cost Simulation, MMP and DATA' route option in the KDA dropdown.
	 * @since 12/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	public void KDASourceDropDownValidation() throws Exception{
		boolean scenarioFlag = false;
		
		waitForElementToBeVisible(KDA_sourceDropdown);
		clickElement(KDA_sourceDropdown);
		
		List<String> sourceList = KDA_sourceList.stream().map(ele->ele.getText().trim()).collect(Collectors.toList());
	
		if(sourceList.contains("MMP") && sourceList.contains("DATA") && sourceList.contains("One Click Pricing")) {
			logPass("SA can see 'One Click Pricing, MMP and DATA' route option in the KDA dropdown");
			scenarioFlag = true;
		}
		else {
			logFail("SA can see 'One Click Pricing, MMP and DATA' route option in the KDA dropdown");
		}
		clickElement(KDA_sourceDropdown);
		
		if(scenarioFlag == true)
			scenarioPass();
		else
			scenarioFail();
	}
	
	public void selectKDASource(String source) throws Exception{
		waitForElementToBeVisible(KDA_sourceDropdown);
		clickElement(KDA_sourceDropdown);
		
		for(int i=0;i<KDA_sourceList.size();i++) {
			if(KDA_sourceList.get(i).getText().equals(source)) {
				clickElement(KDA_sourceList.get(i));
				logInfo(source + " is Selected.");
				break;
			}
		}
	}
	
	
	/**
	 * TC 124 : Validate if SA is able to navigate to respective KDA based on the selection.
	 * @since 13/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	public void NavigateToKDAReport() throws Exception{
		boolean scenarioFlag = false;
		
		selectKDASource("One Click Pricing");
		
		waitForElementToBeVisible(KDA_ViewKDA);
		waitForElementClickable(KDA_ViewKDA);
		
		clickElement(KDA_ViewKDA);
		switchToTab(1);
	    loader();
	    waitForElementToAppear(Kda_ReportDownloadButton);
	    waitForElementToBeVisible(Kda_ReportDownloadButton);
	    
	    if(Kda_ReportDownloadButton.isDisplayed()) {
	    	logPass("SA can navigate to respective KDA based on the selection.");
	    	scenarioFlag = true;
	    }
	    else {
	    	logFail("SA can not navigate to respective KDA based on the selection.");
	    }
	    
	    getDriver().close();
		switchToTab(0);
		waitForElementToAppear(KDA_ViewKDA);
		waitForElementToBeVisible(KDA_ViewKDA);
		
	     
	    if(scenarioFlag == true)
	    	scenarioPass();  	
	    else
	    	scenarioFail();
	    
	}
	

	/**
	 * TC 125 : Validate if SA is able to download CY,FY,MOM, Graph and View KDA reports from CS KDA.
	 * @since 13/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * 
	 */
	public void download_CSKDAReports() throws Exception{
		boolean scenarioFlag = false;
		ArrayList<Boolean> isDownloaded = new ArrayList<Boolean>();
		
		selectKDASource("One Click Pricing");
		
		waitForElementToBeVisible(KDA_ViewKDA);
		waitForElementClickable(KDA_ViewKDA);
		
		clickElement(KDA_ViewKDA);
		switchToTab(1);
		  loader();
	    waitForElementToAppear(Kda_ReportDownloadButton);
	    waitForElementToBeVisible(Kda_ReportDownloadButton);   
	    clickElement(Kda_ReportDownloadButton);
	    
	    waitForElementToBeVisible(ExportToExcelTab);
	    clickElement(ExportToExcelTab_dropDown);
	    
	    
	    
	    for(int i=0;i<ExportToExcelTab_dropDownList.size();i++) {
	    	String type = ExportToExcelTab_dropDownList.get(i).getText();
	    	
	    	jsClick(ExportToExcelTab_dropDownList.get(i));
	    	waitForElementToBeVisible(ExportToExcel_download);
	    	clickElement(ExportToExcel_download);
	    	
	    	waitForElementToAppear(ConfidentialPopUp_IUnderstandBtn);
			clickElement(ConfidentialPopUp_IUnderstandBtn);
			boolean flag = false;
	    	switch(type) {
	    	case "Contract Year View":
	    		flag = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "OCPReport_Contract Year");
	    		logInfo("Contarct Year : "+ flag);
	    		isDownloaded.add(flag);
	    		break;
	    	case "Financial Year View":
	    		flag = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "OCPReport_Financial Year");
	    		logInfo("Financial Year : "+ flag);
	    		isDownloaded.add(flag);
	    		break;
	    	case "Month On Month":
	    		flag = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "OCPReport_MOM");
	    		logInfo("MOM : "+ flag);
	    		isDownloaded.add(flag);
	    		break;
	    	case "Graph View":
	    		flag = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "OCPReport_Graph");
	    		logInfo("Graph : "+ flag);
	    		isDownloaded.add(flag);
	    		break;
	    	}
	    	
	    	clickElement(dealView);
	    	
	    	waitForElementToAppear(Kda_ReportDownloadButton);
		    waitForElementToBeVisible(Kda_ReportDownloadButton);   
		    clickElement(Kda_ReportDownloadButton);
		    
		    waitForElementToBeVisible(ExportToExcelTab);
		    clickElement(ExportToExcelTab_dropDown);
	    }
	    
	    clickElement(close_ExportTab);
	    
	    clickElement(metrics_Expand);
	    clickElement(metrics_ViewKda);
	    
	    waitForElementToAppear(viewKda_ReportDownloadBtn);
	    waitForElementToBeVisible(viewKda_ReportDownloadBtn);
	    clickElement(viewKda_ReportDownloadBtn);
	    waitForElementToAppear(ConfidentialPopUp_IUnderstandBtn);
		clickElement(ConfidentialPopUp_IUnderstandBtn);
		
		boolean viewKdaReport = false;
		
		viewKdaReport = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "SCPKDAOutput");
		logInfo("view KDA : "+ viewKdaReport);
	    
	    
	    if(isDownloaded.contains(false) && viewKdaReport== false) {
	    	logFail("SA can not download CY,FY,MOM, Graph and View KDA reports from CS KDA.");
	    }
	    else {
	    	logPass("SA can download CY,FY,MOM, Graph and View KDA reports from CS KDA.");
	    	scenarioFlag = true;
	    }
	    
	    getDriver().close();
		switchToTab(0);
		waitForElementToAppear(KDA_ViewKDA);
		waitForElementToBeVisible(KDA_ViewKDA);
	    
	    if(scenarioFlag)
	    	scenarioPass();
	    else
	    	scenarioFail();
	    
		
	}
	
	
	
	/**
	 * TC 126 : Validate if SA is able to download CY,FY,MOM, Graph and View KDA reports from MMP KDA..
	 * @since 13/03/2024
	 * @release March 16
	 * @author sagarika.a.singh
	 * Note: Can't be Execute in ParallelProd as Request Pricing is generating for MMP KDA.
	 * 
	 */
	public void download_MMPKDAReports() throws Exception{
		boolean scenarioFlag = false;
		ArrayList<Boolean> isDownloaded = new ArrayList<Boolean>();
		
		genarateMMP("Actual TAX");
		
		jse.executeScript("arguments[0].scrollIntoView(true);", KDA_screen);
		waitForElementToBeVisible(KDA_screen);
		clickElement(KDA_screen);
		
		waitForElementToBeVisible(KDA_sourceDropdown);
		
		selectKDASource("MMP");
		
		waitForElementToBeVisible(KDA_ViewKDA);
		waitForElementClickable(KDA_ViewKDA);
		
		clickElement(KDA_ViewKDA);
		switchToTab(1);
		 loader();
	    waitForElementToAppear(Kda_ReportDownloadButton);
	    waitForElementToBeVisible(Kda_ReportDownloadButton);   
	    clickElement(Kda_ReportDownloadButton);
	    
	    waitForElementToBeVisible(ExportToExcelTab);
	    clickElement(ExportToExcelTab_dropDown);
	    
	    
	    
	    for(int i=0;i<ExportToExcelTab_dropDownList.size();i++) {
	    	String type = ExportToExcelTab_dropDownList.get(i).getText();
	    	
	    	jsClick(ExportToExcelTab_dropDownList.get(i));
	    	waitForElementToBeVisible(ExportToExcel_download);
	    	clickElement(ExportToExcel_download);
	    	
	    	waitForElementToAppear(ConfidentialPopUp_IUnderstandBtn);
			clickElement(ConfidentialPopUp_IUnderstandBtn);
			boolean flag = false;
	    	switch(type) {
	    	case "Contract Year View":
	    		flag = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "OCPReport_Contract Year");
	    		logInfo("Contarct Year : "+ flag);
	    		isDownloaded.add(flag);
	    		break;
	    	case "Financial Year View":
	    		flag = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "OCPReport_Financial Year");
	    		logInfo("Financial Year : "+ flag);
	    		isDownloaded.add(flag);
	    		break;
	    	case "Month On Month":
	    		flag = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "OCPReport_MOM");
	    		logInfo("MOM : "+ flag);
	    		isDownloaded.add(flag);
	    		break;
	    	case "Graph View":
	    		flag = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "OCPReport_Graph");
	    		logInfo("Graph : "+ flag);
	    		isDownloaded.add(flag);
	    		break;
	    	}
	    	
	    	clickElement(dealView);
	    	
	    	waitForElementToAppear(Kda_ReportDownloadButton);
		    waitForElementToBeVisible(Kda_ReportDownloadButton);   
		    clickElement(Kda_ReportDownloadButton);
		    
		    waitForElementToBeVisible(ExportToExcelTab);
		    clickElement(ExportToExcelTab_dropDown);
	    }
	    
	    clickElement(close_ExportTab);
	    
	    clickElement(metrics_Expand);
	    clickElement(metrics_ViewKda);
	    
	    waitForElementToAppear(viewKda_ReportDownloadBtn);
	    waitForElementToBeVisible(viewKda_ReportDownloadBtn);
	    clickElement(viewKda_ReportDownloadBtn);
	    waitForElementToAppear(ConfidentialPopUp_IUnderstandBtn);
		clickElement(ConfidentialPopUp_IUnderstandBtn);
		
		boolean viewKdaReport = false;
		
		viewKdaReport = isFileDownloaded_Ext(ConstantUtils.DownloadedFiles_FilePath, "SCPKDAOutput");
		logInfo("view KDA : "+ viewKdaReport);
	    
	    
	    if(isDownloaded.contains(false) && viewKdaReport== false) {
	    	logFail("SA can not download CY,FY,MOM, Graph and View KDA reports from CS KDA.");
	    }
	    else {
	    	logPass("SA can download CY,FY,MOM, Graph and View KDA reports from CS KDA.");
	    	scenarioFlag = true;
	    }
	    
	    getDriver().close();
		switchToTab(0);
		waitForElementToAppear(KDA_ViewKDA);
		waitForElementToBeVisible(KDA_ViewKDA);
	    
	    if(scenarioFlag)
	    	scenarioPass();
	    else
	    	scenarioFail();
	    
		
	}
	
	public void genarateMMP(String taxType) throws Exception{
		NavigateToGeneratePricing();
		Navigate_to_subTab(GlobalScreen.SUBTAB_PRICING_FACTORS);   
		loader();
		clickElement(GeneratePricing);
		try {
			clickElement(SCC_Warning_OK_Btn);
		} catch (Exception e) {
		}
		if (taxType.equals("NO TAX")) {
			waitForElementToBeVisible(GenerateNoTaxPricing);
			clickElement(GenerateNoTaxPricing);
		} else {
			waitForElementToBeVisible(GenerateActualTaxPricing);
			clickElement(GenerateActualTaxPricing);
		}
		nearshorePopup();
		boolean i = true;
		int c = 0;
		while (i == true) {
			try {
				boolean flag = false;
				try {
					WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
					String row = waitForElementToBeVisible(getDriver().findElements(By.xpath(
							"//*[@id='MMPGrid']//*[@class='ag-body-viewport ag-layout-normal']//div[contains(@class,'ag-body-container')]//div[@col-id='0']"))
							.get(0)).findElement(By.xpath("./..")).getAttribute("row-id");
					
					Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(getDriver())							
							.withTimeout(Duration.ofSeconds(1000)) 			
							.pollingEvery(Duration.ofSeconds(5)) 			
							.ignoring(Exception.class);		
				
					flag = fluentwait.until(ExpectedConditions.textToBePresentInElement(getDriver().findElement(By.xpath(
							"//*[@id='MMPGrid']//*[@class='ag-body-viewport ag-layout-normal']//div[contains(@class,'ag-body-container')]//div[@row-id='"
									+ row + "']//div[@col-id='0']/span/child::*")),
							"Completed"));
				} catch (Exception e) {
					if (e.getMessage().contains("stale element"))
						continue;
					else {
						c = c + 1;
						if (c > 500)
							i = false;
						else
							continue;
					}
				}
				if (flag == true) {
					logPass("MMP Generated successfully");
					break;
				} else {
					logFail("MMP Has not been genearted Successfully");
					
				}

			} catch (Exception e) {
				logFail("MMP Has not been genearted Successfully");
				
			}
		}
		
	}
	
	
	
	
	public boolean isFileDownloaded_Ext(String dirPath, String fileName) throws Exception{
		boolean flag=false;
		
		for(int i=0;i<2;i++) {
			loader();
		}
		
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
    	
    	if(lastModifiedFile.getName().contains(fileName)) {
    		flag=true;
    	}
	    
	    return flag;
	}
	
	public void nearshorePopup() throws Exception {
		try{
		waitForElementToBeVisible(CS_WithNearshoreBtn);
		if (CS_WithNearshoreBtn.getAttribute("class").contains("disabled")) {
			clickElement(CS_WithoutNearshoreBtn);
		} else {
			clickElement(CS_WithNearshoreBtn); loader();
		}}catch(Exception e) {
			logInfo("no popup");
		}
	}


	        
	

}
