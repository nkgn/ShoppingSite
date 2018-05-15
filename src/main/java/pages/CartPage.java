package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
private WebDriver driver ;
	
	

    @FindBy(xpath="//a[@class='continue']/div[text()='Checkout']")
    WebElement checkOut;
	
    
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getCheckOut(){
    	new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(checkOut));
    	return checkOut;
    }

	
	
}
