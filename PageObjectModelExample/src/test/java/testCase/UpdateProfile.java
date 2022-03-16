package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObject;

public class UpdateProfile {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void updateprofile() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");

		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, UpdateProfileObject.class);

		UpdateProfileObject.myProfile.click();
		UpdateProfileObject.phoneNumber.clear();
		UpdateProfileObject.phoneNumber.sendKeys("1234557668789");
		UpdateProfileObject.city.clear();
		UpdateProfileObject.city.sendKeys("Kings Landing");
		UpdateProfileObject.submit.click();


	}

}
