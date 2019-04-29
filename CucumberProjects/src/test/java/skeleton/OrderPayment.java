package skeleton;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderPayment 
{
	WebDriver driver;
	@Before
	public void initial2()
	{	
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, OrderDetails.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("Type URL and login with valid Username")
	public void type_URL_and_login_with_valid_username() 
	{
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("Larry added a headphone to the cart")
	public void larry_added_a_headphone_to_the_cart() 
	{
	    OrderDetails.username.sendKeys("Lalitha");
	    OrderDetails.password.sendKeys("Password123");
	    OrderDetails.login.click();  
	    OrderDetails.search.sendKeys("Summer wear");
	    OrderDetails.findDetails.click();
	    OrderDetails.addCart.click();    
	}

	@When("checkout for the payment")
	public void checkout_for_the_payment() 
	{
		OrderDetails.cart.click();
		OrderDetails.checkOut.click();
		OrderDetails.proceedPay.click();
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		OrderDetails.continueButton.click();	    
	}

	@When("fills transaction details")
	public void fills_transaction_details() 
	{
	   OrderDetails.userID.sendKeys("123456");
	   OrderDetails.passID.sendKeys("Pass@456");
	   OrderDetails.loginPay.click();
	}

	@Then("the product is succesfully ordered")
	public void the_product_is_succesfully_ordered() throws InterruptedException 
	{
		 OrderDetails.transID.sendKeys("Trans@456");
		 OrderDetails.payNow.click();
		 Thread.sleep(5000);
		 driver.close();
		 
	}


}
