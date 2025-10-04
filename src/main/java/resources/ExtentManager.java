package resources;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import browserFactory.DriverFactory;
import reusableComponents.FunctionLibrary;


public class ExtentManager extends FunctionLibrary
{
	private static ExtentReports extent;
	
	public static ExtentReports createInstance(String fileName)
	{
		String directoryName = "ExtentReports";
		String path = System.getProperty("user.dir")+"\\test-output";
		createDirectoryIfNotExists(path,directoryName);
		
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(fileName);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		
		
		sparkReport.config().setEncoding("utf-8");
		sparkReport.config().setDocumentTitle("Automation Report");
		sparkReport.config().setReportName("Automation Report");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setCss(".r-img { width: 30%; position: relative; height: auto;}");
		
		
		extent.setSystemInfo("Organization", "Accenture PLC");
		extent.setSystemInfo("Project", "myWizards");
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("Java", System.getProperty("java.specification.version"));
		return extent;
	}
	
	public static String screenshotPath;
	public static String screenshotName;
	
	public static String captureScreenshot()
	{
		TakesScreenshot scrShot =((TakesScreenshot)DriverFactory.getInstance().getDriver());
		File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_");
		screenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotName;
		try
		{
			FileUtils.copyFile(srcFile, new File(screenshotPath));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return screenshotPath;
	}
}
