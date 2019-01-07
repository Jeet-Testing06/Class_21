package pkg1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1 {
	
	@Test
	public void tc1() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
        RemoteWebDriver f = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
        Thread.sleep(1000);
		f.get("https://www.youtube.com");
	
	}

}
