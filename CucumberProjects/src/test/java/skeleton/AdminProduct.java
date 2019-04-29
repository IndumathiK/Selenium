package skeleton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminProduct 
{
  @FindBy(how=How.ID,using="userName")
  public static WebElement username;
  
  @FindBy(how=How.ID,using="password")
  public static WebElement password;
  
  @FindBy(how=How.CSS,using="input[value='Login']")
  public static WebElement login;
  
  @FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[1]/button/h4")
  public static WebElement addProduct;
  
  @FindBy(how=How.ID,using="prodid")
  public static WebElement productName;
  
  @FindBy(how=How.ID,using="priceid")
  public static WebElement price;
  
  @FindBy(how=How.ID,using="quantityid")
  public static WebElement quantity;
  
  @FindBy(how=How.ID,using="brandid")
  public static WebElement brand;
  
  @FindBy(how=How.ID,using="description")
  public static WebElement description;
  
  @FindBy(how=How.CSS,using="input[value='Add Product']")
  public static WebElement addButton;
  
  @FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[4]/button/h4")
  public static WebElement viewProduct;
    
  @FindBy(how=How.CSS,using="input[value='View Products']")
  public static WebElement viewButton;  
}
