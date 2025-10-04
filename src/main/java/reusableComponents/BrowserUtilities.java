package reusableComponents;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;

import pageObjects.BasePage;

public class BrowserUtilities extends BasePage
{

	/**
	 * 
	 * Creates a new browser tab and switches the focus for future commands of this driver to the new tab.
	 * 
	 * @since 11/11/2021
	 * @author Nikhil Singh
	 */
	public void openNewTab()
	{
		getDriver().switchTo().newWindow(WindowType.TAB);
	}
	
	/**
	 * 
	 * Creates a new browser window and switches the focus for future commands of this driver to the new window.
	 * 
	 * @since 11/11/2021
	 * @author Nikhil Singh
	 * 
	 */
	public void openNewWindow()
	{
		getDriver().switchTo().newWindow(WindowType.WINDOW);
	}
	
	/**
	 *
	 * Switch to tab with respect to index position of Opened tab (0th Index -> 1st Tab).
	 *
	 * @since 12/02/2020
	 * @author Nikhil Singh
	 * @return element
	 * @throws InterruptedException
	 *
	 */
	public void switchToTab(int tabIndexPosition) {
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(tabIndexPosition));
	}
	
	public void closeTab(int tabIndexPosition) 
	{
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(tabIndexPosition)).close();
	}
	
	public void focusCurrentWindow() 
	{
		String current = getDriver().getWindowHandle();
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		for (int i = 0; i < tabs.size(); i++) 
		{
			if (tabs.get(i).equals(current)) 
			{
				switchToTab(i);
				break;
			}
		}
	}
	
	public void refreshScreen() throws Exception 
	{
		long start = System.currentTimeMillis();
		getDriver().navigate().refresh();
		addPaddedWait(2);
		handleAsyncWait();
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		printWaitTime("refreshScreen()", totalTime);
	}
	
	
	public String duplicateTab() throws Exception {

		String url = getDriver().getCurrentUrl();
		String currentWinHandle =  getDriver().getWindowHandle();
		((JavascriptExecutor) getDriver()).executeScript("window.open()");
		Set<String> winHandles =  getDriver().getWindowHandles();

		String Sub_window = "";
		for (String handle : winHandles) {
			if (!handle.equals(currentWinHandle)) {
				Sub_window = handle;
			}
		}
		getDriver().switchTo().window(Sub_window);
		getDriver().get(url);
		loader();
		return currentWinHandle;
	}
}
