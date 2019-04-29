package skeleton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoRegisterPage
{
   @FindBy(how=How.ID,using="gender-female")
   public static WebElement gender;
   
   @FindBy(how=How.ID,using="FirstName")
   public static   WebElement firstname;
   
   @FindBy(how=How.ID,using="LastName")
   public static WebElement lastname;
   
   @FindBy(how=How.ID,using="Email")
   public static   WebElement email;
   
   @FindBy(how=How.ID,using="Password")
   public static  WebElement password;
   
   @FindBy(how=How.ID,using="ConfirmPassword")
   public static  WebElement confirmPassword;
   
   @FindBy(how=How.CSS,using="input[value='Register']")
   public static WebElement registerButton;
   
  @FindBy(how=How.PARTIAL_LINK_TEXT,using="Your registration completed")
  public static WebElement registermsg;
}
