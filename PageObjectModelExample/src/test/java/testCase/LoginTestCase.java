package testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
public class LoginTestCase  {
	
	
	
	@Test
	public void login() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		Thread.sleep(3000);
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
		
		
		
//		WebElement userName = driver.findElement(By.name("email"));
//		userName.sendKeys("user@phptravels.com");
//		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("demouser");
//		
//		WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect'] "));
//		loginButton.click();
	}

}
