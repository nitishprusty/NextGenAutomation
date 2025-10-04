package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage extends BasePage {
	
	Interim_Page interimPage = PageFactory.initElements(getDriver(), Interim_Page.class);
	Actions action = new Actions(getDriver());
	
	/************************** LOCATORS *****************************/
	
	@FindBy(how = How.XPATH, using = " //a[text()= 'Manage']")
	public WebElement Manage_btn;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Total Opportunities')]")
	public WebElement TotalOpportunities;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Opportunities']")
	public WebElement OpportunitiesText;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Active Deals')]")
	public WebElement OppActiveDeals;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Interim Deals')]")
	public WebElement OppInterimDeals;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'All')]")
	public WebElement OppAll;
	
	@FindBy(how = How.XPATH, using = "//img[contains(@src,'/assets/images/Filter_icon.svg')]")
	public WebElement OpportunitiesFilterSymbol;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Status')]")
	public WebElement FilterStatus;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Stage')]")
	public WebElement FilterStage;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@name,'search-ag-grid')]")
	public WebElement SearchFilter;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunities')]")
	public WebElement BacktoOpportunitiesbtn;
	
	@FindBy(how = How.XPATH, using = "//span[@ref='lbRecordCount']")
	public WebElement TotalActiveDealsCount;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-tab-label-content'])[5]")
	public WebElement ActiveDealCount;
	
	@FindBy(how = How.XPATH, using = "//*[@col-id='MMSID']")
	public List<WebElement> MMSID;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Opportunities']")
	public WebElement OpportunitiesTitle;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Lead SA (AMS)')])[1]")
	public WebElement RoleNameText;
	
	/*@FindBy(how = How.XPATH, using = "((//span[@role='presentation'][normalize-space()='EMEA-Nordic FS'])[1]")
	public WebElement MarketCGText;*/
	
	@FindBy(how = How.XPATH, using = "(//div[@class='ID ag-cell-value'])[1]")
	public WebElement MmsIdText;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Type a text to filter')]")
	public WebElement TextFilter;
	
	@FindBy(how = How.XPATH, using = "//img[@title='Log Status']")
	public WebElement LogStatusBtn;
	
	@FindBy(how = How.XPATH, using = "//textarea[@data-placeholder='Enter the text']")
	public WebElement LogStatusTextArea;
	
	@FindBy(how = How.XPATH, using = "//button[contains(.,'Save')]")
	public WebElement LogStatusSave;
	
	@FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-container']")
	public WebElement LogStatusSuccesfulMsg;
	
	@FindBy(how = How.XPATH, using = "//li//a[text()='Manage']")
	public WebElement ManageBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Total Opportunities ')]/../../..")
	public WebElement opportunitytile;
	
	@FindBy(how = How.XPATH, using = "//*[text()=' Total Opportunities ']")
	public WebElement Total_opportunitieslink;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement search_filter;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ag-4-row-count']")
	public WebElement TotalRow_count;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ag-4-first-row']")
	public WebElement FromRow_count;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ag-4-last-row']")
	public WebElement ToRow_count;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ag-4-of-page-number']")
	public WebElement Page_count;
	
	@FindBy(how = How.XPATH, using = "//div[@role='gridcell' and @col-id='MMSID']")
	public List<WebElement> CountPerPage;
	
	@FindBy(how = How.XPATH, using = "//div[@ref='btNext']//span")
	public WebElement NextPageIcon;
	
//	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
//	public WebElement FilterTextField;
//	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'GB_HH_NHS Health & Social Care Info Cent')]")
	public WebElement ClientNameText;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ag-cell-value']")
	public WebElement OpportunityNameText;
 	
	@FindBy(how = How.XPATH, using = "(//div[@class='mpl-table-cell-wrapper'])[1]")
	public WebElement LogStatusText;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	public WebElement LogStatusCancelBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@col-id='MMSID']//div[@class='MMSID']/div")
	public WebElement MMSid ;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'In Progress')]")
	public WebElement OpportunitiesInProgressButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'ALL')]")
	public WebElement OpportunitiesStageAllCheckbox;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Apply')]")
	public WebElement OpportunitiesFilterApplyButton;
	
	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'InProgress')])[1]")
	public WebElement OpportunitiesInProgressStatus;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Composition')]")
	public WebElement OpportunitiesCompositionField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'MMS ID')]")
	public WebElement OpportunitiesMMSIDField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Applicable SG')]")
	public WebElement OpportunitiesApplicableSGField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Role Name')]")
	public WebElement OpportunitiesRoleNameField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Client Name')]")
	public WebElement OpportunitiesClientNameField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Opportunity Name')]")
	public WebElement OpportunitiesOpportunityNameField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Market-CG')]")
	public WebElement OpportunitiesMarketCGField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'MMS Status')]")
	public WebElement OpportunitiesMMSStatusField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bookmark')]")
	public WebElement OpportunitiesBookmarkField;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Actions')]")
	public WebElement OpportunitiesActionsField;
	
	@FindBy(how = How.XPATH, using = "//img[@class='composition-icon ng-star-inserted']")
	public WebElement OpportunitiesCreateCompositionButton;
	
	@FindBy(how = How.XPATH, using = "//input[@aria-label='Press Space to toggle row selection (unchecked)']")
	public WebElement OpportunitiesSelectSecondaryListButton;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Create']")
	public WebElement OpportunitiesCreateButton;
	
	@FindBy(how = How.XPATH, using = "//img[@class='Primary-icon ng-star-inserted']")
	public WebElement OpportunitiesCompositionCreatedSuccessfullIcon;
	
	@FindBy(how = How.XPATH, using = "//span[@class='ag-icon ag-icon-next']")
	public WebElement OpportunityNextIcon;
	
	@FindBy(how = How.XPATH, using = "(//img[@class='icon ng-star-inserted'])[1]")
	public WebElement OpportunitiesDetachExpandButton;
	
	@FindBy(how = How.XPATH, using = "(//img[@class='icon ng-star-inserted'])[1]")
	public WebElement OpportunitiesDetachButton;
	
	@FindBy(how = How.XPATH, using = "(//img[@class='pin-black icon'])[1]")
	public WebElement OpportunitiesPinButton;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type a text to filter']")
	public WebElement FilterTextField;
	
	@FindBy(how = How.XPATH, using = "//img[@class='Primary-icon ng-star-inserted']")
	public WebElement OpportunitiesCompositeResultsImage;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	public WebElement OpportunitiesCompositionDetagConfirmButton;
	@FindBy(how = How.XPATH, using = "//img[@class='icon ng-star-inserted']")
	public WebElement OpportunitiesCompositeDetagDropdown;
	@FindBy(how = How.XPATH, using = "//img[@title='Detag Composition.']")
	public WebElement OpportunitiesCompositeDetagButton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm')]")
	public WebElement OpportunityDetagConfirmButton;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Opportunities')]")
	public WebElement OpportunityBreadscrum;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'TECH')]")
	public WebElement CompositionID;
	
	
	
	/******************************Methods************************************/
	
	  
		/**
		 * TC_1: Validate that user is able to view oppoprtunities page
		 * 
		 * @since 13/03/2024
		 * @author Lakshmi Keerthi
		 * @return
		 * 
		 */
		
		public void viewOpportunitiesPage() throws Exception
		{
			boolean scenarioFlag = false;
			clickElement(TotalOpportunities);	
			String oppText = OpportunitiesText.getText();
			if (oppText.contains("Opp")) {
				scenarioFlag = true;
				logPass("Succesfully user is able to view oppoprtunities page ");
			} else {
				logFail("Failed to view oppoprtunities page");
			}
			if (scenarioFlag == true) {
				scenarioPass();
			} 

		}
		
		/**
		 * TC_2: Validate that user is able to see All, Active, Interim deals columns in opp Page"
		 * 
		 * @since 13/03/2024
		 * @author Lakshmi Keerthi
		 * @return
		 * 
		 */
		
		public void oppTabsValidation() throws Exception {

			boolean scenarioFlag = false;
			clickElement(OppActiveDeals);

			String oppcolumstab = OppActiveDeals.getText();
			if (oppcolumstab.contains("Active")) {
				scenarioFlag = true;
				logPass("Succesfully navigated to the Active deals tab of Opportunties page");
			} else {
				logFail("Failed to navigate to the Active deals tab of Opportunities page");
			}

			if (scenarioFlag == true) {
				scenarioPass();
			} 
			
			clickElement(OppInterimDeals);

			oppcolumstab = OppInterimDeals.getText();
			if (oppcolumstab.contains("Interim")) {
				scenarioFlag = true;
				logPass("Succesfully navigated to the Interim Deals tab of Opportunties page");
			} else {
				logFail("Failed to navigate to the Interim Deals tab of Opportunities page");
			}

			if (scenarioFlag == true) {
				scenarioPass();
			} 
			
			clickElement(OppAll);

			oppcolumstab = OppAll.getText();
			if (oppcolumstab.contains("All")) {
				scenarioFlag = true;
				logPass("Succesfully navigated to the All tab of Opportunties page");
			} else {
				logFail("Failed to navigate to the All tab of Opportunities page");
			}

			if (scenarioFlag == true) {
				scenarioPass();
			}
				
		}
		
		/**
		 * TC_5: Validate that on clicking on filter user is able to see status and stage options
		 * 
		 * @since 13/03/2024
		 * @author Lakshmi Keerthi
		 * @return
		 * 
		 */
		
		public void validateFilterStatusandStage() throws Exception
		{
			boolean scenarioFlag = false;
			clickElement(OpportunitiesFilterSymbol);
			boolean filterStatus = FilterStatus.isDisplayed();
			boolean filterStage = FilterStage.isDisplayed();
			
			if (filterStatus && filterStage) {
				logPass("Total status and stage Header is present");
				scenarioFlag = true;
			} else {
				logFail("Total status and stage Header is not present");
			}
			clickElement(OpportunitiesFilterSymbol);
			if (scenarioFlag == true)
				scenarioPass();
			
			
		}
		/**
		 * TC_4: Validate that user is able to search a deal from search bar"
		 * 
		 * @since 13/03/2024
		 * @author Lakshmi Keerthi
		 * @return
		 * 
		 */
		
		public void  oppValidateSearchFilter(String MMSID) throws Exception
		{
			boolean scenarioFlag = true;
			clickElement(SearchFilter);
			clear(SearchFilter);
			sendKeys(SearchFilter, MMSID);
			
			waitForElementToAppear(MMSid);
			if(getText(MMSid).equals(MMSID))
			{
				logPass("user is able to search a deal from search bar");
				scenarioFlag = true;
			} else {
				logFail("user is failed to search a deal from search bar");
				scenarioFlag = false;
			}
			clickElement(OpportunitiesFilterSymbol);
			if (scenarioFlag == true)
				scenarioPass();
			refreshScreen();
			
		}
		/**
		 * TC_3:  Validate that user is able to see all active deals in All active deals column
		 * 
		 * @since 13/03/2024
		 * @author Lakshmi Keerthi
		 * @return
		 * 
		 */
		public void  oppValidateActiveDealData() throws Exception
		{
			boolean scenarioFlag = false;
			waitForElementToAppear(OppActiveDeals);
			clickElement(OppActiveDeals);
			
			String activeDealCount= ActiveDealCount.getText();
			String activeDealTotalCount = TotalActiveDealsCount.getText();
			
			if(activeDealCount.contains(activeDealTotalCount) && MMSID.size() >=1) 
			{
				logPass("Total ActiveDeals are present");
				scenarioFlag = true;
			}else {
				logFail("Total ActiveDeals are not present");
			}			
			if (scenarioFlag == true)
				scenarioPass();
		
			clickElement(OppAll);
		}	
		
		/**
		 * TC_06: Validate that user is able to filter the data based on status and stage of deal.
		 * 
		 * @since 12/03/2024
		 * @release March 16
		 * @author shreyash.srivastava
		 * 
		 */
		
			public void OpportunitiesFilter() throws Exception {
				clickElement(ManageBtn);
				clickElement(TotalOpportunities);
				clickElement(OpportunitiesFilterSymbol);
				clickElement(OpportunitiesInProgressButton);
				clickElement(OpportunitiesStageAllCheckbox);
				clickElement(OpportunitiesFilterApplyButton);
				boolean inProgressStatus = OpportunitiesInProgressStatus.isDisplayed();
				boolean scenarioFlag=true;
				if(inProgressStatus) {
					logPass("user is able to filter the data based on status and stage of deal");
				    scenarioFlag = true;
				}
				else {
					logFail("user is not able to filter the data based on status and stage of deal");
					scenarioFlag = false;
				}
				if (scenarioFlag == true)
					scenarioPass();
			}
			
		/**
		 * TC_07: Validate that user is able to view composition,MMS ID,Applicable SG,Role name, Client name,opportunity name,Market-CG,MMS Status,Bookmarks,Actions headers in opportunity page.
		 * 
		 * @since 13/03/2024
		 * @release March 16
		 * @author shreyash.srivastava
		 * 
		 */	
			public void OpportunitiesCheckFilter() {
				boolean scenarioFlag=true;
				if(isDisplayed(OpportunitiesCompositionField) && isDisplayed(OpportunitiesMMSIDField) && 
						isDisplayed(OpportunitiesApplicableSGField) && isDisplayed(OpportunitiesRoleNameField)
						&& isDisplayed(OpportunitiesClientNameField) && isDisplayed(OpportunitiesOpportunityNameField)
						&& isDisplayed(OpportunitiesMarketCGField) && isDisplayed(OpportunitiesMMSStatusField)
						&& isDisplayed(OpportunitiesBookmarkField) && isDisplayed(OpportunitiesActionsField)) {
					
					logPass("user is able to view composition,MMS ID,Applicable SG,Role name, "
							+ "Client name,opportunity name,Market-CG,MMS Status,Bookmarks,"
							+ "Actions headers in opportunity page.");
				    scenarioFlag = true;
				}
				else {
					logFail("user is able to view composition,MMS ID,Applicable SG,Role name,Client name,"
							+ "opportunity name,Market-CG,MMS Status,Bookmarks,"
							+ "Actions headers in opportunity page.");
					scenarioFlag = false;
				}
				if (scenarioFlag == true)
					scenarioPass();
			}
			/**
			 * TC_08: Validate that user is able to create a composition
			 * 
			 * @since 14/03/2024
			 * @release March 16
			 * @author shreyash.srivastava
			 * @throws Exception 
			 * 
			 */
			public void createComposition() throws Exception {
				boolean scenarioFlag=true;
				String mmsID= "TECH-8000005532";
				sendKeys(FilterTextField,mmsID);
				clickElement(OpportunitiesCreateCompositionButton);
				clickElement(OpportunitiesSelectSecondaryListButton);
				clickElement(OpportunitiesCreateButton);
				clickElement(OpportunityBreadscrum);
				clickElement(OpportunityNextIcon);
				if(isDisplayed(OpportunitiesCompositionCreatedSuccessfullIcon)) {
					logPass("user is able to create a composition");
					scenarioFlag = true;
				}
				else {
					logFail("user is not able to create a composition");
					scenarioFlag = false;
				}
				if (scenarioFlag == true)
					scenarioPass();
				//for Detag composition
					clickElement(OpportunitiesCompositeDetagDropdown);
					clickElement(OpportunitiesCompositeDetagButton);
					clickElement(OpportunityDetagConfirmButton);
			}
	
		/**
		 * TC_09: Validate that user is able to pin any deal 
		 * 
		 * @since 14/03/2024
		 * @release March 16
		 * @author shreyash.srivastava
		 * @throws Exception 
		 * 
		 */	
			
			public void pin() throws Exception {
				//clickElement(TotalOpportunities);
				moveToElementAndHover(OpportunitiesPinButton);
				clickElement(OpportunitiesPinButton);
				boolean scenarioFlag=true;
				if((OpportunitiesPinButton.isEnabled())) {
					logPass("user is able to pin any deal");
					scenarioFlag = true;
				}
				else {
					logFail("user is not able to pin any deal");
					scenarioFlag = false;
				}
				if (scenarioFlag == true)
					scenarioPass();
				
				waitForElementToAppear(OpportunitiesPinButton);
				clickElement(OpportunitiesPinButton);
			}
		/**
		 * TC_11: Validate that user is able to log the status of any deal
		 * 
		 * @since 13/03/2024
		 * @author Swaranjali Kulkarni
		 * @return
		 * 
		 */
		
		public void opportunitiesLogStatus(String OpId) throws Exception
		{
			boolean scenarioFlag = true;
			String str="abcd";
			waitForElementToAppear(TextFilter);
			sendKeys(TextFilter, OpId);
			clickElement(LogStatusBtn);
			sendKeys(LogStatusTextArea,str);
			clickElement(LogStatusSave);
			clickElement(LogStatusBtn);
			String logStatus = LogStatusText.getText();
			clickElement(LogStatusCancelBtn);
			
			if(logStatus.equals(str)) {
				logPass("user is able to log the status of any deal");
			    scenarioFlag = true;
			}
			else {
				logFail("user is not able to log the status of any deal");
				scenarioFlag = false;
			}
			
			if (scenarioFlag == true)
				scenarioPass();
				refreshScreen();
		}
		
		
		/**
		 * TC_12: Validate that user is able to see correct pagination to view all deals
		 * 
		 * @since 13/03/2024
		 * @author Swaranjali Kulkarni
		 * @return
		 * 
		 */
		
		public void pagination_count() throws Exception{
			boolean scenarioFlag = true;
			int Totalcount = Integer.parseInt(getText(TotalRow_count).trim());
			logInfo("Total Pages count: "+Totalcount);
			int Pagecount = Integer.parseInt(getText(Page_count).trim());
			int sum = 0;
			for(int i=0;i<Pagecount;i++) {
				int To_count = Integer.parseInt(getText(ToRow_count).trim());
				sum += CountPerPage.size();
				logInfo("Page: "+(i+1)+" count: "+CountPerPage.size());
				if(sum == To_count) {
					logPass("Page count and Deal counts are matched for Page: "+(i+1));
				}
				else {
					logFail("Page count and Deal counts are not matched for Page: "+(i+1));
					scenarioFlag = false;
					break;
				}
				clickElement(NextPageIcon);
			}
			if(sum == Totalcount) {
				logPass("pagination details are correct to view all deals");
			}
			else {
				logFail("Error in Pagination details");
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
		
		
		
		
		/**
		 * TC_13: Validate that on hovering any column data the completed data should appear in the tool tip	 * 
		 * 
		 * @since 13/03/2024
		 * @author ageeru.ashish
		 * @return
		 * 
		 */
		
		public void validateColumnData(String OppID_Productivity)throws Exception {
			boolean scenarioFlag = true;
			clear(search_filter);
			sendKeys(search_filter, OppID_Productivity);
			String ClientNameActual="GB_HH_NHS Health & Social Care Info Cent";
			String OpportunityNameActual = "OBSOLETE_Rebar Testing";
			action.moveToElement(ClientNameText).build().perform();
			String ClientNameToolTipText = ClientNameText.getText();
			action.moveToElement(OpportunityNameText).build().perform();
			String OpportunityNameToolTipText = OpportunityNameText.getText();
			if(ClientNameToolTipText.contains(ClientNameActual) && OpportunityNameToolTipText.contains(OpportunityNameActual)) {
				logPass("On hovering any column data the complete data appeared in the tool tip");
			    scenarioFlag = true;
			}
			else {
				logFail("On hovering any column data the complete data not appeared in the tool tip");
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
		}
		
		
		/**
		 * TC_14: Validate that on hovering MMS ID colour should get changed to blue
		 * 
		 * @since 13/03/2024
		 * @author ageeru.ashish
		 * @return
		 * 
		 */
		
		public void hoverMmsID()throws Exception {
			boolean scenarioFlag = true;
			String beforeHoverColor = MmsIdText.getCssValue("color");
			action.moveToElement(MmsIdText).build().perform();
			String afterHoverColor = MmsIdText.getCssValue("color");
			logInfo("Before Hover Color: "+beforeHoverColor+" "+"After Hover Color: "+afterHoverColor);
			//Assert.assertNotEquals(beforeHoverColor,afterHoverColor);
			if(!beforeHoverColor.equals(afterHoverColor) && afterHoverColor.equals("rgba(161, 0, 255, 1)")) {
				logPass("On hovering MMS ID colour get changed to blue");
			    scenarioFlag = true;
			}
			else {
				logFail("On hovering MMS ID colour not get changed to blue");
				scenarioFlag = false;
			}
			if (scenarioFlag == true)
				scenarioPass();
			//FilterTextField.clear();
			refreshScreen();			
		}
		
		
		
}




