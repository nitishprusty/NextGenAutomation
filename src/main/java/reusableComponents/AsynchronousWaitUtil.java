package reusableComponents;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class AsynchronousWaitUtil extends FunctionLibrary
{
   int angularTimeout = 5;
   int angularPollTime = 10;
   
   public WebDriver jsWaitDriver;
   public WebDriverWait jsWait;
   public JavascriptExecutor jsExec;
   
   //Get the driver 
   public JavascriptExecutor setDriver () 
   {
	   jsWaitDriver = getDriver();
       jsWait = new WebDriverWait(jsWaitDriver, Duration.ofSeconds(10));
       jsExec = (JavascriptExecutor) jsWaitDriver;
       return jsExec;
   }
   
   /***************************** ajax **********************************/
   public void ajaxComplete() 
   {
	   long start = System.currentTimeMillis();
	   jsExec = setDriver();
       jsExec.executeScript("var callback = arguments[arguments.length - 1];"
           + "var xhr = new XMLHttpRequest();" + "xhr.open('GET', '/Ajax_call', true);"
           + "xhr.onreadystatechange = function() {" + "  if (xhr.readyState == 4) {"
           + "    callback(xhr.responseText);" + "  }" + "};" + "xhr.send();");
       
       long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		//printWaitTime("handleAsyncWait()",totalTime); 
   }
   
   
   /***************************** JQuery **********************************/
   void waitForJQueryLoad() 
   {
	   jsExec = setDriver();
       try 
       {
           ExpectedCondition<Boolean> jQueryLoad = driver -> ((Long) ((JavascriptExecutor) this.getDriver())
               .executeScript("return jQuery.active") == 0);
           boolean jqueryReady = (Boolean) jsExec.executeScript("return jQuery.active==0");
           if (!jqueryReady) 
           {
               jsWait.until(jQueryLoad);
           }
       } 
       catch (WebDriverException ignored) 
       {
    	   
       }
   }
   
   public void waitUntilJQueryReady()
   {
	   long start = System.currentTimeMillis();
	   jsExec = setDriver();
       Boolean jQueryDefined = (Boolean) jsExec.executeScript("return typeof jQuery != 'undefined'");
       if (jQueryDefined) 
       {
           poll(20);
           waitForJQueryLoad();
           poll(20);
       }
       else
       {
    	   logInfo("JQuery Not Defined");
       }
       long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		//printWaitTime("waitUntilJQueryReady()",totalTime); 
   }
   
   
   /***************************** JS **********************************/
   public void waitUntilJSReady() 
   {
	   jsExec = setDriver();
       try 
       {
           ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) this.getDriver())
               .executeScript("return document.readyState").toString().equals("complete");
           boolean jsReady = jsExec.executeScript("return document.readyState").toString().equals("complete");
           if (!jsReady) 
           {
               jsWait.until(jsLoad);
           }
       } 
       catch (WebDriverException ignored) 
       {
    	   
       }
   }
   
   /***************************** Angular **********************************/
   public void waitForAngularLoad() 
   {
       String angularReadyScript = "return angular.element(document).injector().get('$http').pendingRequests.length === 0";
       angularLoads(angularReadyScript);
   }
   
   
   public void angularLoads(String angularReadyScript) 
   {
	   jsExec = setDriver();
       try 
       {
           ExpectedCondition<Boolean> angularLoad = driver -> Boolean.valueOf(((JavascriptExecutor) getDriver())
               .executeAsyncScript(angularReadyScript).toString());
           boolean angularReady = Boolean.valueOf(jsExec.executeScript(angularReadyScript).toString());
           if (!angularReady)
           {
           	WebDriverWait jsWait = new WebDriverWait(getDriver(), Duration.ofSeconds(angularTimeout), Duration.ofMillis(angularPollTime));
               jsWait.until(angularLoad);
           }
       } 
       catch (WebDriverException ignored) 
       {
       }
   }
   
   
   public void waitUntilAngularReady() 
   {
	   long start = System.currentTimeMillis();
	   jsExec = setDriver();
       try
       {
           Boolean angularUnDefined = (Boolean) jsExec.executeScript("return window.angular === undefined");
           if (!angularUnDefined) 
           {
               Boolean angularInjectorUnDefined = (Boolean) jsExec.executeScript("return angular.element(document).injector() === undefined");
               if (!angularInjectorUnDefined) 
               {
                   poll(20);
                   waitForAngularLoad();
                   poll(20);
               }
           }
           else
           {
        	   logInfo("Angualar Not defined");
           }
       } catch (WebDriverException ignored) 
       {
    	   
       }
       	long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		//printWaitTime("waitUntilAngularReady()",totalTime); 
   }
   
   
   /***************************** Angular5 **********************************/
   public void waitForAngular5Load() 
   {
       String angularReadyScript = "return window.getAllAngularTestabilities().findIndex(x=>!x.isStable()) === -1";
       angularLoads(angularReadyScript);
   }
   
   public boolean waitUntilAngular5Ready() 
   {
	   	long start = System.currentTimeMillis();
	   	jsExec = setDriver();
   		boolean failedWait=false;
   		try 
   		{
	           Object angular5Check = jse.executeScript("return getAllAngularRootElements()[0].attributes['ng-version']");
	           if (angular5Check != null) 
	           {
	               Boolean angularPageLoaded = (Boolean) jsExec.executeScript("return window.getAllAngularTestabilities().findIndex(x=>!x.isStable()) === -1");
	               if (!angularPageLoaded) 
	               {
	                   waitForAngular5Load();
	               }
	         	   	failedWait=true;
	           }
	           else
	           {
	        	   logInfo("Angular 5 not defined");
	           }
   		} 
   		catch (WebDriverException ignored) 
   		{
    	   
   		}
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		//printWaitTime("waitUntilAngular5Ready()",totalTime); 
		return failedWait;
      
   }
   
   
    public void poll(long milis) 
    {
        try 
        {
            Thread.sleep(milis);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    
    
    /***************************** Secondary Waits **********************************/
    public void addSecondaryPaddedWait() 
    {
        try 
        {
            Thread.sleep(100);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void addPaddedWait(int seconds) 
    {
    	long start = System.currentTimeMillis();
		int timeout = 5;
		if (seconds > timeout) 
		{
			try 
			{
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			logInfo("Exceeds Threshold time = 5 seconds");
		} 
		else 
		{
			try 
			{
				Thread.sleep(seconds * 1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		long finish = System.currentTimeMillis();
  	   	long totalTime = finish - start; 
  	   	printWaitTime("addPaddedWait()",totalTime); 
	}
    
    public void addPaddedWaitPro(int seconds) 
    {
    	long start = System.currentTimeMillis();
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long finish = System.currentTimeMillis();
  	   	long totalTime = finish - start; 
  	   	printWaitTime("addPaddedWaitPro()",totalTime); 
	}
    
    
       
	/****************** NG WebDriver **********************/
    public void waitForAngularRequestsToFinish()
    {
    	long start = System.currentTimeMillis();
    	
    	getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(1));
    	jse = (JavascriptExecutor) getDriver();
    	NgWebDriver ngDriver = new NgWebDriver(jse);
    	Object actual = ngDriver.withRootSelector("[ng-version]").waitForAngularRequestsToFinish();
    	
    	long finish = System.currentTimeMillis();
  	   	long totalTime = finish - start; 
  	   	//printWaitTime("waitForAngularRequestsToFinish()",totalTime); 
    }
    
    public void waitForAngularRequestsToFinish_Exp()
    {
    	long start = System.currentTimeMillis();
    	
    	jse = (JavascriptExecutor) getDriver();
    	NgWebDriver ngDriver = new NgWebDriver(jse);
    	Object actual = ngDriver.withRootSelector("\"ng-component\"").waitForAngularRequestsToFinish();
    	
    	long finish = System.currentTimeMillis();
  	   	long totalTime = finish - start; 
  	   	//printWaitTime("waitForAngularRequestsToFinish_Exp()",totalTime); 
    }
}
