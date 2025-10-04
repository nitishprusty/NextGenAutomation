package reusableComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class PrintUtility extends FunctionLibrary
{
	public static final String INFO = "[INFO] ";
	public static final String PASS = "[PASS] ";
	public static final String WARN = "[WARN] ";
	public static final String SKIP = "[SKIP] ";
	public static final String FAIL = "[FAIL] ";
	public static final String STEP = "[STEP] ";
	
	String waitColors = ConsoleColors.YELLOW;
	
	/****************************** Extent-Report Methods ****************************************/

	public void scenario(String scenario) 
	{
		System.out.println(ConsoleColors.BLUE + "\n"+INFO+"Scenario: " + scenario + ConsoleColors.RESET);
		extentListener.logInfo("\nScenario: " + scenario);
	}

	public void scenarioPass() 
	{
		System.out.println(ConsoleColors.GREEN + "\n"+PASS+"Passed" + ConsoleColors.RESET);
		extentListener.logPass("Passed");
	}

	public void scenarioFail() 
	{
		System.out.println(ConsoleColors.RED + "\n"+FAIL+"Failed" + ConsoleColors.RESET);
		extentListener.logFail("Failed");
	}

	public void logFail(String message) 
	{
		System.out.println(ConsoleColors.RED + "\n"+FAIL+"Error Occurred: " + message + ConsoleColors.RESET);
		softAssertion.assertTrue(false, message);
		extentListener.logFail("\nError Occurred: " + message);
	}

	public void logWarn(String message) 
	{
		System.out.println(ConsoleColors.Warn_texasRose + "\n"+WARN+"Warning: " + message + ConsoleColors.RESET);
		softAssertion.assertTrue(false, message);
		extentListener.logWarn("\nWarning: " + message);
	}

	public void logSkip(String message) {
		System.out.println(ConsoleColors.Skip_orange + "\n"+SKIP+"Skipped: " + message + ConsoleColors.RESET);
		extentListener.logSkip("\nSkipped: " + message);
	}

	public void logPass(String message) 
	{
		System.out.println(ConsoleColors.Pass_green + "\n"+PASS+"Passed: " + message + ConsoleColors.RESET);
		// extentListener.logPass("\nPassed: "+message);
	}

	public void logInfoReport(String message) 
	{
		System.out.println(ConsoleColors.Info_turquoise + "\n"+INFO+message + ConsoleColors.RESET);
		extentListener.logInfo("\nInfo: " + message);
	}
	
	public void logInfo(String message) 
	{
		System.out.println(ConsoleColors.Info_turquoise + "\n"+INFO+ message + ConsoleColors.RESET);
	}
	
	public void logInfoMessage(String url, String report_filepath) 
	{
		System.out.println(ConsoleColors.Info_turquoise + "\n"+INFO+"Info: " + url + ConsoleColors.RESET);
		extentListener.logInfoMessage("\nInfo: " + url, report_filepath);
	}

	public void logStep(String message) 
	{
		System.out.println(ConsoleColors.BLUE + "\n"+STEP+ message + ConsoleColors.RESET);
		extentListener.logStep("\n" + message);
	}

	public void category(String category) 
	{
		extentListener.assignCategory(category);
	}

	
	 public void printWaitTime(String waitMethodType, long time, By locator)
	 {
		 long millis = TimeUnit.MILLISECONDS.toMillis(time);
		 long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
		 if(seconds>0)
		 {
			 System.out.println(waitColors + "\n"+INFO+waitMethodType+" -> "+ seconds+" sec"+" : "+ locator+ ConsoleColors.RESET);
		 }
		 else
		 {
			 System.out.println(waitColors + "\n"+INFO+waitMethodType+" -> "+ millis+" ms"+" : "+ locator+ ConsoleColors.RESET);
		 }
	 }
	 
	 public void printWaitTime(String waitMethodType, long time, String msg, By locator)
	 {
		 long millis = TimeUnit.MILLISECONDS.toMillis(time);
		 long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
		 if(seconds>0)
		 {
			 System.out.println(waitColors + "\n"+INFO+waitMethodType+" -> "+ seconds+" sec"+"  "+ msg +" : "+locator+ ConsoleColors.RESET);
		 }
		 else
		 {
			 System.out.println(waitColors + "\n"+INFO+waitMethodType+" -> "+ millis+" ms"+"  "+ msg +" : "+locator+ ConsoleColors.RESET);
		 }
	 }
	 
	 public void printWaitTime(String waitMethodType, long time)
	 {
		 long millis = TimeUnit.MILLISECONDS.toMillis(time);
		 long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
		 if(seconds>0)
		 {
			 System.out.println(waitColors + "\n"+INFO+waitMethodType+" -> "+ seconds+" sec"+ ConsoleColors.RESET);
		 }
		 else
		 {
			 System.out.println(waitColors + "\n"+INFO+waitMethodType+" -> "+ millis+" ms"+ ConsoleColors.RESET);
		 }
	 }
}
