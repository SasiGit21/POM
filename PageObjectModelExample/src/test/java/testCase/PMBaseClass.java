package testCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import utilities.ReadConfig;



public class PMBaseClass {

ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	//"https://demo.guru99.com/V4/index.php";
	public String username=readconfig.getUsername();;
			//"mngr381993"
	public String password=readconfig.getpassword();
			//"azAdAme";
	public static WebDriver driver;
	public static Logger logger;
	
	
	
	//@Parameters("browser")
	@BeforeClass
	public void setup()
	{		
//		logger = Logger.getLogger("ebanking");
//		PropertyConfigurator.configure("log4j.properties");
		
		
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver= new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
//		driver= new ChromeDriver();
	
		
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	public String randomestring()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
		
	}
	public static String randomeNum()
	{
		String generatedstring2 = RandomStringUtils.randomAlphabetic(4);
		return(generatedstring2);
	}
}
