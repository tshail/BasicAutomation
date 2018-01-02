package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HexValue_Int {


	 public void setup(WebDriver driver1) throws InterruptedException{
		 
		 WebDriver driver=driver1;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://tfsserver/JIBE/Account/Login.aspx?");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
	// ------------------------- Check 'Username' field is exist or not ------------------------------//	
		
		try{
			
		boolean username=driver.findElement(By.xpath(" .//*[@id='ctl00_MainContent_LoginUser_Password' AND class='textEntry']")).isDisplayed();
		System.out.println("Username field is exist:" +username);
		
	 }catch(Throwable e){
		 System.out.println("Username field does not exist:" +e);
	 }

	// -------------------------------------- Check 'Password' field is exist or not ------------------------------//	
		try {

			boolean Password = driver
					.findElement(By
							.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password' AND name='ctl00$MainContent$LoginUser$Password']"))
					.isDisplayed();
			System.out.println("Password field is exist:" + Password);
		} catch (Throwable e) {
			System.out.println("Password field does not exist:" + e);
		}
		
		
	//-------------------------------------------------TC_01 : Enter Valid Username and Valid Password --------------------------------------------------------//
		
		try{
	WebElement username=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']"));
	username.sendKeys("shailesh");
	String name=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']")).getAttribute("value");
	System.out.println("Entered username is:" +name);
			
	}catch(Throwable e){
		System.out.println("Exception is:" +e);
	}
	
		try{
			
			WebElement pwd=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']"));
			pwd.sendKeys("jibe@123");
			String name=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']")).getAttribute("value");
			System.out.println("Entered username is:" +name);
					
			}catch(Throwable e){
				System.out.println("Exception is:" +e);
			}
		
		
}
}
