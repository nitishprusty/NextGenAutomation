package reusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class ScrollUtilities extends FunctionLibrary
{
	
	public void scroll(int pixel)
	{
		jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.scrollTo(0, " + pixel + ")");
	}
	
	public void scroll(String position) 
	{
		jse = (JavascriptExecutor) getDriver();
		if (position.equalsIgnoreCase("top"))
			jse.executeScript("window.scrollTo(0, 0)");
		else if (position.equalsIgnoreCase("bottom"))
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try 
		{
			Thread.sleep(500);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public WebElement scrollToElement(WebElement element) 
	{
		By locator = getByLocator(element);
		WebElement refresh_element = (WebElement) getDriver().findElement(locator);
		String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
		jse = (JavascriptExecutor) getDriver();
		jse.executeScript(scrollElementIntoMiddle, refresh_element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return element;
	}
	
	
	/**
	 *
	 * scroll Horizontally Inside Element that includes it's own scroll bar. Provide
	 * pixel to scroll in integer.
	 *
	 * @since 04/05/2020
	 * @author Nikhil Singh
	 * @param WebElement, pixel
	 * 
	 */
	public WebElement scrollHorizontallyInsideElement(WebElement element, int pixel) 
	{
		jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollLeft += " + String.valueOf(pixel), element);
		try 
		{
			Thread.sleep(500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		return element;
	}
	
	/**
	 *
	 * scroll Vertically Inside Element that includes it's own scroll bar. Provide
	 * pixel to scroll in integer.
	 *
	 * @since 27/07/2020
	 * @author Nikhil Singh
	 * @param WebElement, pixel
	 * 
	 */
	public WebElement scrollVerticallyInsideElement(WebElement element, int pixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollTop += " + String.valueOf(pixel), element);
		try 
		{
			Thread.sleep(500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		return element;
	}

	public void scrollToElementAndClick(WebElement element) throws Exception
	{
		boolean success=false;
		 int attempts = 0;
		    while(attempts < 2) 
		    {
		        try 
		        {
		        	/******* TRY 1 ***********/
					try 
					{
						//False (Scroll To Bottom section of element)
						By locator = getByLocator(element);
						WebElement refresh_element = (WebElement) getDriver().findElement(locator);
						jse = (JavascriptExecutor) getDriver();
						scroll("bottom");
						jse.executeScript("arguments[0].scrollIntoView(false);", refresh_element);
						refresh_element.click();
						success=true;
					} 
					catch (Exception e) 
					{
						
					}
					
					/******* TRY 2 ***********/
					try
					{
						By locator = getByLocator(element);
						WebElement refresh_element = (WebElement) getDriver().findElement(locator);
						jse = (JavascriptExecutor) getDriver();
						scroll("bottom");
						jse.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'end', inline: 'nearest'});", refresh_element);
						refresh_element.click();
						success=true;
					}
					catch (Exception e) 
					{
						
					}
					
					/******* FINAL TRY 3 ***********/
					if(success==false)
					{
						//True (Scroll To Top section of element)
						By locator = getByLocator(element);
						WebElement refresh_element = (WebElement) getDriver().findElement(locator);
						jse = (JavascriptExecutor) getDriver();
						jse.executeScript("arguments[0].scrollIntoView(true);", refresh_element);
						refresh_element.click();
					}
					break;
		        }
		        catch(StaleElementReferenceException s) 
		        {
		        	System.out.println("StaleElementReferenceException: "+s);
		        }
		        catch (Exception e2) 
		        {
					throw e2;
				}
	        attempts++;
	    }
	}
}
