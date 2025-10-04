package browserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponents.ConfigFileReader;

public class BrowserFactory 
{
	public WebDriver createBrowserInstance(String browser)
	{
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			options.addArguments("-inprivate");
			options.addArguments("--window-size=1920,1080");
			options.addArguments("force-device-scale-factor=1.0");
			options.addArguments("high-dpi-support=1.0");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-private");
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("internet explorer"))
		{
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.addCommandSwitches("-private");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			
			}
		else if(browser.equalsIgnoreCase("microsoftedge"))
		{
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("-inprivate");
			options.addArguments("--window-size=1920,1080");
			options.addArguments("force-device-scale-factor=1.0");
			options.addArguments("high-dpi-support=1.0");
			driver = new EdgeDriver(options);
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	
	public WebDriver createSauceBrowserInstance(String browser) throws Exception
	{
		WebDriver driver = null;
		String username = ConfigFileReader.getTestData("config.username");
		String accesskey = ConfigFileReader.getTestData("config.accessKey");
		String url = "https://" + username + ":" + accesskey + ConfigFileReader.getTestData("config.url");
		String browserVersion = "";
		String platformName = ConfigFileReader.getTestData("config.platformName");
		
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("username", username);
		sauceOptions.setCapability("accessKey", accesskey);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			sauceOptions.setCapability("name", "E2E"+"-"+"Chrome");
			browserVersion = ConfigFileReader.getTestData("config.chrome_browserVersion");
			cap.setCapability("browserVersion", browserVersion);
			cap.setCapability("sauce:options", sauceOptions);
			cap.setCapability("platformName", platformName);
			cap.setCapability("browserName", "chrome");
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			sauceOptions.setCapability("name", "E2E"+"-"+"Firefox");
			browserVersion = ConfigFileReader.getTestData("config.firefox_browserVersion");
			cap.setCapability("browserVersion", browserVersion);
			cap.setCapability("sauce:options", sauceOptions);
			cap.setCapability("platformName", platformName);
			cap.setCapability("browserName", "firefox");
			
		}
		else if(browser.equalsIgnoreCase("internet explorer"))
		{
			WebDriverManager.iedriver().setup();
			sauceOptions.setCapability("name", "E2E"+"-"+"IE");
			browserVersion = ConfigFileReader.getTestData("config.ie_browserVersion");
			cap.setCapability("browserVersion", browserVersion);
			cap.setCapability("sauce:options", sauceOptions);
			cap.setCapability("platformName", platformName);
			cap.setCapability("browserName", "internet explorer");
			
		}
		else if(browser.equalsIgnoreCase("microsoftedge"))
		{
			WebDriverManager.edgedriver().setup();
			sauceOptions.setCapability("name", "E2E"+"-"+"Edge");
			browserVersion = ConfigFileReader.getTestData("config.edge_browserVersion");
			cap.setCapability("version", browserVersion);
			cap.setCapability("sauce:options", sauceOptions);
			cap.setCapability("platform", platformName);
			cap.setCapability("browserName", "microsoftedge");
		}
		else if(browser.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			sauceOptions.setCapability("name", "E2E"+"-"+"Opera");
			browserVersion = ConfigFileReader.getTestData("config.opera_browserVersion");
			cap.setCapability("version", browserVersion);
			cap.setCapability("sauce:options", sauceOptions);
			cap.setCapability("platform", platformName);
			cap.setCapability("browserName", "opera");
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			sauceOptions.setCapability("name", "E2E"+"-"+"Safari");
			browserVersion = ConfigFileReader.getTestData("config.safari_browserVersion");
			cap.setCapability("browserVersion", browserVersion);
			cap.setCapability("sauce:options", sauceOptions);
			cap.setCapability("version", browserVersion);
			cap.setCapability("sauce:options", sauceOptions);
			cap.setCapability("platform", platformName);
			cap.setCapability("browserName", "safari");
		}
		
		cap.setCapability("passed", "true");
		cap.setCapability("extendedDebugging", "true");
		
		try
		{
			driver = new RemoteWebDriver(new URL(url), cap);
			driver.manage().window().maximize();
		}
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		return driver;
	}
	
	public WebDriver createBrowserInstanceForDebug(String browser, String portNumber) throws IOException
	{
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("--remote-debugging-port="+portNumber);
		    options.setExperimentalOption("debuggerAddress", "localhost:"+portNumber);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-private");
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("internet explorer"))
		{
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.addCommandSwitches("-private");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("microsoftedge"))
		{
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	
	
	public String runCommand(String command)
	{
		String line = null;
		try 
		{
	        ProcessBuilder builder = new ProcessBuilder(
	                "cmd.exe", "/c", command);
	            builder.redirectErrorStream(true);
	            Process p = builder.start();
	            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	            line = r.readLine();
	    }
		catch (IOException e) 
		{
	        e.printStackTrace();
	    }
		return line;
	}
	
	
	public String getChromeDebugPort() throws InterruptedException
	{
		String command = "chrome-debug";
		String portNumber_Raw = runCommand(command);
		Thread.sleep(2);
		String portNumber_val = portNumber_Raw.split(":")[1];
		String portNumber = portNumber_val.trim();
		System.out.println("Chrome-debug PortNumber= "+portNumber);
		return portNumber;
	}
	
}
