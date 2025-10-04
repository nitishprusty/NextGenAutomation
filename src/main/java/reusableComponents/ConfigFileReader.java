package reusableComponents;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
/**
 * @author Nikhil Singh
 *
 */
public class ConfigFileReader 
{
	 private static Properties properties;
	 private final String propertyFilePath= Constants.Properties_FilePath;
	 
	 public ConfigFileReader()
	 {
		 BufferedReader reader;
		 try 
		 {
			 reader = new BufferedReader(new FileReader(propertyFilePath));
			 properties = new Properties();
			 try 
			 {
				 properties.load(reader);
				 reader.close();
			 } 
			 catch (IOException e) 
			 {
				 e.printStackTrace();
			 }
		 } 
		 catch (FileNotFoundException e) 
		 {
			 e.printStackTrace();
			 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		 } 
	 }
	 
	 public String getApplicationUrl() 
	 {
		 String url = properties.getProperty("appURL");
		 if(url != null) 
			 return url;
		 else 
			 throw new RuntimeException("url not specified in the Configuration.properties file.");
	 }
	 
	 public static String getTestDataFile()
	 {
		 String testDataFile = properties.getProperty("testDataFile");
		 if(testDataFile!=null)
			 return testDataFile; 
		 else
			 throw new RuntimeException("File not specified in the Configuration.properties file.");
	 }
	 
	 public static String getProperty(String propertyName)
	 {
		 ConfigFileReader configFileReader = new ConfigFileReader();
		 String property_Name = String.valueOf(properties.getProperty(propertyName));
		 if(property_Name!=null)
			 return property_Name; 
		 else
			 throw new RuntimeException("Property not specified in the Configuration.properties file.");
	 }
	 

	 public static String getTestData(String testDatapath) throws Exception
	    {
		 		String name=getTestDataFile();
	           File inputFile = new File(System.getProperty("user.dir")  +"\\Configuration\\"+name);                                                            
	           SAXReader saxReader = new SAXReader();                             
	           Document document = saxReader.read(inputFile);     
	           String testData = document.selectSingleNode("//"+(testDatapath.replace(".", "/"))).getText();                                            
	           return testData;
	    }
	 
}
