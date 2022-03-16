package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	@FindBy(how=How.NAME, using="email")
	public static WebElement userName;
	
	@FindBy(name ="password" )
	public static  WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect'] ")
	public static WebElement loginButton;
	
	
	
}
