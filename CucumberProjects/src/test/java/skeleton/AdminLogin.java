package skeleton;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.hu.Amikor;

public class AdminLogin 
{
	WebDriver driver;
	//@Before
	public void initial()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\indumathi.krishnan\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		File pathBinary = new File("C:\\Users\\Training_b6b.00.03\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		driver = new FirefoxDriver(options);
		
		//driver=DriverUtility.getDriver("firefox");
		PageFactory.initElements(driver, AdminProduct.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

@Given("open testme and login as admin")
public void open_testme_and_login_as_admin() 
{
	 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
}

@When("admin select product and add to cart")
public void admin_select_product_and_add_to_cart() 
{
    AdminProduct.username.sendKeys("admin");
    AdminProduct.password.sendKeys("Password456");
    AdminProduct.login.click();
    AdminProduct.addProduct.click();
    
    WebElement yy=driver.findElement(By.id("categorydropid"));
	Select dd1=new Select(yy);
	dd1.selectByValue("11290");
	
	WebElement yy1=driver.findElement(By.id("subcategorydropid"));
	Select dd2=new Select(yy1);
	dd2.selectByValue("112112");
	
	AdminProduct.productName.sendKeys("HP Laptops");
	AdminProduct.price.sendKeys("40000");
	AdminProduct.quantity.sendKeys("1");
    AdminProduct.brand.sendKeys("HP");
    AdminProduct.description.sendKeys("Laptop windows-10,8GB Ram,1TB storage");
    AdminProduct.addButton.click();
    
    driver.get("http://10.232.237.143:443/TestMeApp/adminHome.htm");
    AdminProduct.viewProduct.click();
    
    WebElement yy2=driver.findElement(By.id("categorydropid"));
   	Select dd3=new Select(yy2);
   	dd3.selectByValue("11290");
   	
   	WebElement yy3=driver.findElement(By.id("subcategorydropid"));
   	Select dd4=new Select(yy3);
   	dd4.selectByValue("112112");
   	
   	AdminProduct.viewButton.click();
   	
    
	
}

@Then("view products added")
public void view_products_added() throws InterruptedException
{ 
	Thread.sleep(5000);
	driver.close();
}
}

