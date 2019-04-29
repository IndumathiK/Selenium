package skeleton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderDetails 
{

	  @FindBy(how=How.ID,using="userName")
	  public static WebElement username;
	  
	  @FindBy(how=How.ID,using="password")
	  public static WebElement password;
	  
	  @FindBy(how=How.CSS,using="input[value='Login']")
	  public static WebElement login;
	  
	  @FindBy(how=How.ID,using="myInput")
	  public static WebElement search;
	  
	  @FindBy(how=How.CSS,using="input[value='FIND DETAILS']")
	  public static WebElement findDetails;
	  
	  @FindBy(how=How.CSS,using="a[class='btn btn-success btn-product']")
	  public static WebElement addCart;
	  
	  @FindBy(how=How.PARTIAL_LINK_TEXT,using="Cart")
	  public static WebElement cart;
	  
	  @FindBy(how=How.CSS,using="a[href='checkout.htm']")
	  public static WebElement checkOut;
	  
	  @FindBy(how=How.CSS,using="input[value='Proceed to Pay']")
	  public static WebElement proceedPay;
	  
	  //@FindBy(how=How.CSS,using="input[value='Andhra Bank']")
	 // public static WebElement selectBank;
	  
	  @FindBy(how=How.CSS,using="a[onclick='radioValue()']")
	  public static WebElement continueButton;
	  
	  @FindBy(how=How.NAME,using="username")
	  public static WebElement userID;
	  
	  @FindBy(how=How.NAME,using="password")
	  public static WebElement passID;
	  
	  @FindBy(how=How.CSS,using="input[value='LOGIN']")
	  public static WebElement loginPay;
	  
	  @FindBy(how=How.NAME,using="transpwd")
	  public static WebElement transID;
	  
	  @FindBy(how=How.CSS,using="input[value='PayNow']")
	  public static WebElement payNow;
	  
	  
	 
	  
	  
	  
	  
}
