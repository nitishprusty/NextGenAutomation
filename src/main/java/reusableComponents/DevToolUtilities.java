package reusableComponents;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.log.Log;
import org.openqa.selenium.devtools.v117.network.Network;
import org.openqa.selenium.devtools.v117.network.model.Headers;
import org.openqa.selenium.devtools.v117.performance.Performance;
import org.openqa.selenium.devtools.v117.performance.model.Metric;

import pageObjects.BasePage;




public class DevToolUtilities extends BasePage
{
	
	public DevTools createSession()
	{
		DevTools devTools = ((ChromeDriver) getDriver()).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		return devTools;
	}
	
	public void getPageLoadTime(String URL)
	{
		DevTools devTools = createSession();
		devTools.send(Log.enable());
		devTools.addListener(Log.entryAdded(), LogEntity ->
				{
					logInfo("Page Load Time : "+LogEntity.getTimestamp());
				});
		getDriver().get(URL);
	}
	
	public void getPerformance(String URL)
	{
		DevTools devTools = createSession();
		devTools.send(Performance.enable(Optional.empty()));
		 
		getDriver().get(URL);

	    List<Metric> metrics = devTools.send(Performance.getMetrics());
	    List<String> metricNames = metrics.stream()
	    		.map(o -> o.getName())
	    		.collect(Collectors.toList());
	    
	    metricNames.forEach( metric -> logInfo(metric +
                " is : " + metrics.get(metricNames.indexOf(metric)).getValue()));

	}
	
	
	public void getResponce(String URL)
	{
		DevTools devTools = createSession();
		
		devTools.addListener(Network.responseReceived(),
		        responseReceived -> 
		{
	            Headers headers = responseReceived.getResponse().getHeaders();
	            if (!headers.isEmpty())
	            {
	                System.out.println("Headers:");
	                headers.forEach((key,value) -> 
	                {
	                	if (((String) value).contains("authorization") || ((String) value).contentEquals("authorization"))
	                		System.out.println("    " + key + "="+ value);
	                });
	            }
		});
	}
	
	
	public void getToken(String URL)
	{
		DevTools devTools = createSession();
		
		List<Boolean> metricResource = new ArrayList<Boolean>();
		
		devTools.addListener(Network.responseReceived(), response ->
		{
			Headers headers = response.getResponse().getHeaders();
            if (!headers.isEmpty())
            {
                System.out.println("Headers:");
                headers.forEach((key,value) -> 
                {
                    System.out.println("    " + key + "="+ value);
                });
            }
		});
		
	    getDriver().get(URL);
	    
	    for (int i= 0; i<metricResource.size(); i++) 
		{
			logInfo(metricResource.get(i) + " : " + metricResource.get(i));
		}
	}
}
