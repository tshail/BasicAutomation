package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicAutomationScript {

	
	public static void main(String[]args) throws InterruptedException{
		
		WebDriver driver;
		
		// set Chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		// create Instance of webdriver
		driver = new ChromeDriver();
		
		// Enter URL
		driver.get("http://192.168.1.102/JIBE/Account/Login.aspx");
		Thread.sleep(3000);
		
		//Verify entered URL
		String TEts=driver.getCurrentUrl();
		System.out.println(TEts);
		
		//Verify Page source
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		//Navigate Back 
		driver.navigate().back();
		Thread.sleep(5000);

		//Navigate Forward
		driver.navigate().forward();
		Thread.sleep(5000);	
	}
}
