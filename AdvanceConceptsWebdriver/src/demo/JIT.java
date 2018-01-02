package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JIT {

	public static void main(String Args[]) throws InterruptedException
	{
		WebDriver Driver;
		
		//Set Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reshma\\Desktop\\chromedriver_win32\\chromedriver.exe");
		Driver=new ChromeDriver();
		
		//Enter URL
		Driver.get("https://jit.jibe.solutions/JIT/Account/Login.aspx");
		
		//Maximize browser
		Driver.manage().window().maximize();
		
		//Enter Username
		Driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']")).sendKeys("shailesh");
		Thread.sleep(2000);
		
		//Enter Password
		Driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']")).sendKeys("redcross2");
		Thread.sleep(2000);
		
		//Click on login button
		Driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']")).click();
		Thread.sleep(2000);
		
		//Open Task List page
		Driver.get("https://jit.jibe.solutions/JIT/CRM/Task/TaskIndex.aspx");
		
		// Select "Created By" Dropdown
		Select createdby = new Select (Driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ddlCreatedBy']")));
		createdby.selectByVisibleText("Shailesh Thorat");
		Thread.sleep(2000);
		
		// Select "Created By" Dropdown
		Select PIC = new Select (Driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ddlPIC']")));
		PIC.selectByVisibleText("Shailesh Thorat");
		Thread.sleep(2000);
		
		//De-Select 'In Progress' checkbox 
		Driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ddlTaskStatus_2']")).click();
		Thread.sleep(2000);
		
		//De-Select 'Planned' checkbox 
		Driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ddlTaskStatus_1']")).click();
		Thread.sleep(2000);
		
		//Click on Search button
		Driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_btnSearch']")).click();
		Thread.sleep(2000);
		
		//-------------------------------------------- Window Switch Functionality --------------------------------------------------//
		
		
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
