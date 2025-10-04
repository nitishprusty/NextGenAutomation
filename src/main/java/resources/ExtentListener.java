package resources;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import browserFactory.DriverFactory;
import reusableComponents.ClassObjectRepo;
import reusableComponents.ConsoleColors;

public class ExtentListener extends ClassObjectRepo implements ITestListener
{
	static Date d = new Date();
	//static String fileName = "Report_" + d.toString().replace(":", "_") + ".html";
	static String fileName = "Report.html";
	private static ExtentReports report ;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) 
	{
		test = report.createTest("<b>@Class: </b> "+result.getTestClass().getName()+ "<br><b>@Test: </b>"+result.getMethod().getMethodName()+"()");
		ExtentFactory.getInstance().setExtent(test);
	}
	
	public void onTestSuccess(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>"+methodName+"() : PASSED"+"</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		ExtentFactory.getInstance().getExtent().pass(m);
	}
	
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		String screenshotpath = ExtentManager.captureScreenshot();
		ExtentFactory.getInstance().getExtent().fail("<b><font color=red>" + "Failure URL: " + "</font></b>" +
						  "<a style='#F0F8FF' href='"+DriverFactory.getInstance().getDriver().getCurrentUrl()+"'>"+DriverFactory.getInstance().getDriver().getCurrentUrl()+"</a>");
		
		try 
		{
			ExtentFactory.getInstance().getExtent().fail("<b><font color=red>" + "Failure Screeshot: " + "</font></b>",
				MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
		ExtentFactory.getInstance().getExtent().fail("<details>" + "<summary>" + "<b>" + "<font color="+"red>" + "Exception Occured: Click to see"
				+ "</font>" + "</b>" + "</summary>" + exceptionMessage.replaceAll(",", "<br>") + "</details>" + "\n");
		
		String logText = "<b>"+methodName+"() : FAILED"+"</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		ExtentFactory.getInstance().getExtent().log(Status.FAIL,m);
		
		System.out.println(ConsoleColors.RED+"\n\nTest Case Failed:\n"+ConsoleColors.RESET);
		result.getThrowable().printStackTrace();
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>"+methodName+"() : SKIPPED"+"</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
		ExtentFactory.getInstance().getExtent().skip(m);
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>"+methodName+"() : WARNING"+"</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
		ExtentFactory.getInstance().getExtent().warning(m);
	}

	public void onStart(ITestContext context) 
	{
		String filePath = System.getProperty("user.dir")+"\\test-output\\ExtentReports\\"+fileName;
		try 
		{
			 report = ExtentManager.createInstance(filePath);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void onFinish(ITestContext context) 
	{
		Iterator<ITestResult> skippedTestCases = context.getSkippedTests().getAllResults().iterator();
        while (skippedTestCases.hasNext())
        {
            ITestResult skippedTestCase = skippedTestCases.next();
            ITestNGMethod method = skippedTestCase.getMethod();           
            int skip_size = context.getSkippedTests().getResults(method).size();
            if ( skip_size > 1)
            {
            	skippedTestCases.remove();
            	//report.removeTest(test);
            }
            else
            {
            	int pass_size = context.getPassedTests().getResults(method).size();
                if (pass_size > 0)
                {
                	skippedTestCases.remove();
                	//report.removeTest(test);
                }                         
            }           
        }
		// TODO Auto-generated method stub
		if(report!=null)
		{
			report.flush();
		}
	}
	

	public void assignCategory(String category)
	{
		ExtentFactory.getInstance().getExtent().assignCategory(category);
	}
	
	/*************************** Log Events ******************************/
	public void logFail(String message)
	{
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "<p style='color:"+LogEventColor.Fail_radicalRed+"';>" + message + "</font>");
	}
	
	public void logWarn(String message)
	{
		ExtentFactory.getInstance().getExtent().log(Status.WARNING, "<p style='color:"+LogEventColor.Warn_texasRose+"';>" + message + "</font>");
	}
	
	public void logSkip(String message)
	{
		ExtentFactory.getInstance().getExtent().log(Status.SKIP, "<p style='color:"+LogEventColor.Skip_orange+"';>" + message + "</font>");
	}
	
	public void logPass(String message)
	{
		ExtentFactory.getInstance().getExtent().log(Status.PASS, "<p style='color:"+LogEventColor.Pass_green+"';>" + message + "</p>");
	}
	
	public void logInfo(String message)
	{
		ExtentFactory.getInstance().getExtent().log(Status.INFO, "<p style='color:"+LogEventColor.Info_turquoise+"';>" + message + "</p>");
	}
	
	//Custom
	public void logInfoMessage(String url, String filePath)
	{
		ExtentFactory.getInstance().getExtent().log(Status.PASS, "<div style='padding-top:18px;padding-bottom:18px;'>"
				+ "<p style='color:"+LogEventColor.Info_turquoise+"; display: inline;'>" + url + "</p>"
				+ "<a href='"+filePath+"' style='background-color: #EEEEEE;"
				+ "padding: 3px 12px;font-weight:bold;border-radius:5px;"
				+ "cursor:pointer;font-size:11px; color:#dc143c;"
				+ "float: right; display: inline;'>PERFORMANCE REPORT</a>"
			+ "</div>");
	}
	
	
	//Custom
	public void logStep(String message)
	{
		ExtentFactory.getInstance().getExtent().log(Status.INFO, "<p style='color:"+LogEventColor.Step_persianBlue+"';>" + message + "</p>");
	}
	
	
	
	
	
	
	
	
}
