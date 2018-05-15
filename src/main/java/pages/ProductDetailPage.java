package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage {
private WebDriver driver ;
	
	

    @FindBy(xpath="//input[@type='image'][@value='Add to Cart']")
    WebElement addToCart;
    
    @FindBy(name="cart")
    WebElement cartForm;
    
  
	
    
    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public WebElement getAddToCart() throws InterruptedException{
    	JavascriptExecutor je = (JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView(true);",addToCart);
    	new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(addToCart));
    	//System.out.println(addToCart.getAttribute("value"));
    	//Thread.sleep(5000);
    	return addToCart;
    }
	
    public void getCartForm(){
    	//JavascriptExecutor je = (JavascriptExecutor) driver;
    	//je.executeScript("arguments[0].scrollIntoView(true);",cartForm);
    	cartForm.submit();
    	//new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(addToCart));
    	//return Cart;
    }
	

}
