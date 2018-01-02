package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class NewTest {
	
	
	public void Adminm(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

			System.setProperty("webdriver.ie.driver","C:\\Users\\Reshma\\git\\jibe_purc\\AdvanceConceptsWebdriver\\src\\libs\\IEDriverServer.exe");
			
			
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver();
			
			driver.get("http://tfsserver/JIBE/Account/Login.aspx");
			Thread.sleep(3000);
		/*	driver.get("http://114.79.180.66/JIBE/Account/Login.aspx?");
			Thread.sleep(3000);
			driver.manage().window().maximize();

				// Select "crew" module
				WebElement crew = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
				Actions action = new Actions(driver);
				action.moveToElement(crew).build().perform();
				action.moveToElement(crew).perform();
				Thread.sleep(2000);

				// Select "admin"
				WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
				admin.click();
				action.moveToElement(admin).build().perform();

				// Select "crew rank"
				WebElement crewrank = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[32]/a/span"));
				crewrank.click();
				Thread.sleep(5000);
				
				
				driver.findElement(By.xpath(".//input[@type='checkbox']")).getSize();
				Thread.sleep(5000);
				
}*/
	}}	