package reusableComponents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionEngine extends FunctionLibrary 
{
	
		public void	clickElement(WebElement element) throws Exception
		{
			long start = System.currentTimeMillis();
			try 
			{
				try
				{
					scrollToElement(element);
					element.click();
				}
				catch(Exception e1)
				{
					scrollToElementAndClick(element);
				}
				handleAsyncWait();
				long finish = System.currentTimeMillis();
				long totalTime = finish - start; 
				printWaitTime("clickElement()",totalTime, getByLocator(element)); 
			} 
			catch (Exception e2) 
			{
				String message = e2.getMessage();
				if (message.contains("Other element would receive the click") || message.contains("element click intercepted"))
				{
					if (message.contains("class=\"loader\"")) 
					{
						handleOtherElementClick(element);
					}
					else if(message.contains("chatbot"))
					{
						handleChatbot(element);
					}
					else
					{
						System.out.println(ConsoleColors.RED + "\n"+PrintUtility.FAIL+"clickElement() Failed: " +getByLocator(element)+ ConsoleColors.RESET);
						throw e2;
					}
				}
				else if(message.contains("no such element: Unable to locate element:"))
				{
					handleUnExpectedPopUp();
					try
					{
						element.click();
					}
					catch (Exception e) 
					{
						System.out.println(ConsoleColors.RED + "\n"+PrintUtility.FAIL+"clickElement() Failed: " +getByLocator(element)+ ConsoleColors.RESET);
						throw e2;
					}
				}
				else if (message.contains("navtokenExpireTime-popup"))
				{
					handleSessionExpiredPopUp();
					try
					{
						element.click();
					}
					catch (Exception e) 
					{
						System.out.println(ConsoleColors.RED + "\n"+PrintUtility.FAIL+"clickElement() Failed: " +getByLocator(element)+ ConsoleColors.RESET);
						throw e2;
					}
				}
				else
				{
					System.out.println(ConsoleColors.RED + "\n"+PrintUtility.FAIL+"clickElement() Failed: " +getByLocator(element)+ ConsoleColors.RESET);
					throw e2;
				}
			}
		} 
		
		
		public void jsClick(WebElement element) 
		{
			long start = System.currentTimeMillis();
			jse.executeScript("arguments[0].click();", element);
			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			printWaitTime("jsClick()",totalTime, getByLocator(element)); 
		}
		
		public void sendKeys(WebElement element,String text) 
		{
			long start = System.currentTimeMillis();
			try 
			{
				element.sendKeys(text);
				long finish = System.currentTimeMillis();
				long totalTime = finish - start; 
				printWaitTime("sendKeys()", totalTime, " value: "+text, getByLocator(element));
			} 
			catch (Exception e) 
			{
				logFail("sendKeys() Failed: "+getByLocator(element)+ "\nException:"+e);
			}
		}
		

	

		public void clear(WebElement element) 
		{
			long start = System.currentTimeMillis();
			try 
			{
				element.clear();
				Thread.sleep(250);
				long finish = System.currentTimeMillis();
				long totalTime = finish - start; 
				printWaitTime("clear()",totalTime, "Successfully Cleared Data",getByLocator(element));  
			} 
			catch (Exception e) 
			{
				logFail("clear() -> Unable to clear Data on element: " +getByLocator(element) +"\nException: "+e);
			} 
		}

		public void moveToElementAndHover(WebElement element)
		{
			long start = System.currentTimeMillis();
			try
			{
				try
				{
					scrollToElement(element);
				}
				catch(Exception e)
				{
					
				}
				Actions actions = new Actions(getDriver());		
				actions.moveToElement(element).build().perform();
				long finish = System.currentTimeMillis();
				long totalTime = finish - start; 
				printWaitTime("moveToElementAndHover()",totalTime, "Mouse hovered Successfully!",getByLocator(element));  
			}
			catch(Exception e)
			{
				logFail("moveToElementAndHover() Failed: Unable to hover mouse on Element: " +getByLocator(element) +"\nException: "+e);
			}
		}


		public boolean isElementPresent(WebElement element)
		{
			long start = System.currentTimeMillis();
			boolean flag = false;
			try 
			{
				flag = element.isDisplayed();
				long finish = System.currentTimeMillis();
				long totalTime = finish - start; 
				printWaitTime("isElementPresent()",totalTime, "Presence of field is: "+ flag,getByLocator(element));  
				return flag;
			} 
			catch (Exception e) 
			{
				logFail("isElementPresent() Failed: Checking for presence of Element: " +getByLocator(element) +"\nException: "+e);
				return flag;
			}
		}


		public String getText(WebElement element)
		{
			long start = System.currentTimeMillis();
			String text = "";
			try 
			{
				text = element.getText();
				long finish = System.currentTimeMillis();
				long totalTime = finish - start; 
				printWaitTime("getText()",totalTime, "Text retrived: "+ text,getByLocator(element));  
				return text;
			} 
			catch (Exception e) 
			{	
				System.out.println(ConsoleColors.RED + "\n"+PrintUtility.FAIL+"getText() Failed: Text not retrived from Element: " +getByLocator(element)+ "\nException: "+ e + ConsoleColors.RESET);
				throw e;
			}
		}
		
		
		public void handleUnExpectedPopUp() throws Exception
		{
			List<WebElement> element = getDriver().findElements(By.xpath("//button[@id='NavUnauthorizedpopupIdCancel']"));
			try
			{
				if(element.size()>0)
				{
					WebElement title = getDriver().findElement(By.xpath("//h4[@id='SpanAppMsgTitleId']"));
					String title_text = title.getText();
					logInfo(title_text+" Popup Appeared");
				}
				element.get(0).click();
			}
			catch (Exception e) 
			{
				throw e;
			}
		}
		
		public void handleOtherElementClick(WebElement element) throws Exception
		{
			try
			{
				addPaddedWait(5);
				element.click();
			}
			catch (Exception e) 
			{
				throw e;
			}
		}
		
		public void handleChatbot(WebElement element) throws Exception
		{
			try
			{
				jsClick(element);
			}
			catch (Exception e) 
			{
				throw e;
			}
		}
		
		public void handleSessionExpiredPopUp()
		{
			logWarn("Session Expired PopUp appeared");
			getDriver().findElement(By.xpath("//*[@id='navtokenExpireTime-popup']//em[text()='Continue']")).click();
			handleAsyncWait();
		}
		
		
		public void pressKeyCombination(int key1,int key2,int key3) throws AWTException 
		{
			Robot robot = new Robot();
	        robot.setAutoDelay(250);
			robot.keyPress(key1);
			robot.keyPress(key2);
			robot.keyPress(key3);
			robot.keyRelease(key1);
			robot.keyRelease(key2);
			robot.keyRelease(key3);
			robot.setAutoDelay(250);
	    }
		


}
