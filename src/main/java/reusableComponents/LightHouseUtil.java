package reusableComponents;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import pageObjects.BasePage;

public class LightHouseUtil extends BasePage
{
	public String getLightHouseReport(String url, String portNumber) 
	{
		String time = getCurrentTime();
		String fileName = "LightHouseReport_" + time + ".html";
		String budgetFilePath = Constants.LightHouse_Budget_Directory;
		 File directory = new File(Constants.LightHouse_Directory);
		    if (! directory.exists()){
		        directory.mkdir();
		    }

		String command = "lighthouse "+url+" --disable-storage-reset --port="+portNumber+" --quite --budget-path="+budgetFilePath+"Budget.json --output html --output-path "+directory+"\\"+fileName;
		runCommand(command);
		return directory+"\\"+fileName;
    }
	
	
	public void runCommand(String command)
	{
		try {
	        ProcessBuilder builder = new ProcessBuilder(
	                "cmd.exe", "/c", command);
	            builder.redirectErrorStream(true);
	            Process p = builder.start();
	            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	            String line;
	            while (true) 
	            {
	                line = r.readLine();
	                if (line == null) 
	                { 
	                	break;
	                }
	                System.out.println(line);
	            }
	    }
		catch (IOException e) 
		{
	        e.printStackTrace();
	    }
	}
	
	
	public void GenerateLightHouseReport() throws AWTException, InterruptedException, IOException
	{
		System.out.println("\n***** Start GenerateLightHouseReport() *****");
		//Open Lighthouse DevTool
		addPaddedWait(1);
		pressKeyCombination(KeyEvent.VK_CONTROL, KeyEvent.VK_SHIFT, KeyEvent.VK_I);
		
		//Click Generate LighHouse Report Button
		addPaddedWait(2);
		click(360, 560);
		
		//Wait and click 3 dots
		addPaddedWaitPro(65);
		click(1254,455);
		
		//Click Download HTML Report button
		addPaddedWait(1);
		click(1210, 555);
		
		//Update download file path
		addPaddedWait(1);
		String time = getCurrentTime();
		String fileName = Constants.LightHouse_Directory+"LightHouseReport_"+time+".html";
		new ProcessBuilder(Constants.SaveAsExePath, fileName).start();
		addPaddedWait(3);
		
		//Close Lighthouse DevTool
		//click(1265,398);
		try {
			refreshScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resetDevConsole();
		System.out.println("\n***** End GenerateLightHouseReport() *****");
		addPaddedWaitPro(2);
	}
	
	public void resetDevConsole() throws AWTException
	{
		pressKeyCombination(KeyEvent.VK_CONTROL, KeyEvent.VK_SHIFT, KeyEvent.VK_I);
		pressKeyCombination(KeyEvent.VK_CONTROL, KeyEvent.VK_SHIFT, KeyEvent.VK_I);
		pressKeyCombination(KeyEvent.VK_CONTROL, KeyEvent.VK_SHIFT, KeyEvent.VK_I);
		pressKeyCombination(KeyEvent.VK_CONTROL, KeyEvent.VK_SHIFT, KeyEvent.VK_I);
		pressKeyCombination(KeyEvent.VK_CONTROL, KeyEvent.VK_SHIFT, KeyEvent.VK_I);
	}
	
	public static String getCurrentTime() 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu_MM_dd_HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

}
