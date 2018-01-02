package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test {
	@Test
	//@Parameters("Browser")
	public  void test1(String browser) {
	 
	if(browser.equalsIgnoreCase("FF")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abc\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
	
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	driver.quit();
	 
	}
	else if(browser.equalsIgnoreCase("IE")){
	 
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Abc\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	 
	WebDriver driver=new InternetExplorerDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	driver.quit();
	}
	}
	 
	}
	 

