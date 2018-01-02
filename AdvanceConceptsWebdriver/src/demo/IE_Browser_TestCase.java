package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IE_Browser_TestCase {
	
@Test(priority=1)
	
	public  void test() throws Exception {
		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Reshma\\lib\\IE Driver\\IEDriverServer.exe");
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
		dc.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		dc.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
		dc.setJavascriptEnabled(true); 
		//WebDriver driver = new InternetExplorerDriver(dc);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		WebDriver driver = new InternetExplorerDriver();
			 // driver.get("http://helloselenium.blogspot.com");
			  
		driver.get("https://github.com");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}


}
