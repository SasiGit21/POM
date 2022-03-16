package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObject {
	
	@FindBy(xpath ="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a/i")
	public static WebElement myProfile;
	
	@FindBy(name="phone")
	public static WebElement phoneNumber;
	
	@FindBy(name="city")
	public static WebElement city;
	
	@FindBy(xpath = "(//a[contains(.,'My Profile')])[2]")
	public static WebElement submit;
	
	
	
	
	
}
