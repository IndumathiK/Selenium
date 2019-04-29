package skeleton;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class WebShopRegister 
{ 
	WebDriver driver;
	//@Before
	public void init()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\indumathi.krishnan\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		File pathBinary = new File("C:\\Users\\Training_b6b.00.03\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		driver = new FirefoxDriver(options);
		
		//driver=DriverUtility.getDriver("firefox");
		PageFactory.initElements(driver, DemoRegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given("The URL of DemoWebShop APP")
	public void the_URL_of_DemoWebShop_APP() 
	{
	   driver.get("http://demowebshop.tricentis.com/register");
	  }

	@When("user registers")
	public void user_registers() 
	{
		DemoRegisterPage.gender.click();
		DemoRegisterPage.firstname.sendKeys("Indumathi");
		DemoRegisterPage.lastname.sendKeys("Krishnan");
		DemoRegisterPage.email.sendKeys("askmail126@gmail.com");
		DemoRegisterPage.password.sendKeys("Acc@123");
		DemoRegisterPage.confirmPassword.sendKeys("Acc@123");
        DemoRegisterPage.registerButton.click();			    
	}

	@Then("user registers successfully")
	public void user_registers_successfully() 
	{
		String s=DemoRegisterPage.registermsg.getText();
		Assert.assertEquals(s, "Your registration completed");
	    driver.close();
	}

}
