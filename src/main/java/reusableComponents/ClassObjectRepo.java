package reusableComponents;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

import resources.ExtentListener;






public class ClassObjectRepo 
{
	public static ExtentListener extentListener;
	public static JavascriptExecutor jse;
	public static SoftAssert softAssertion;
	public static ConfigFileReader configFileReader;
	public static BrowserUtilities utilities;
	public static ExcelUtilities excelUtilities;
	public static AsynchronousWaitUtil asynchronousWaitUtil;
	public static ScrollUtilities scrollUtilities;
	public static PrintUtility printUtility;
	public static ActionEngine actionEngine;
	public static RandomUtilities randomUtilities;
	public static LightHouseUtil lightHouseUtil;
	public static BrowserUtilities browserUtilities;
	public static DevToolUtilities devToolUtilities;
}
