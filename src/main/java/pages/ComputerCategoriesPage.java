package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComputerCategoriesPage {
	private WebDriver driver ;
	
	

    @FindBy(xpath="//div[@id='leftblock']//div[@id='leftcontent'][contains(text(),'Asus X55A')]//a[@class='aa']")
    WebElement selectAsusX55A;
	
    
    public ComputerCategoriesPage(WebDriver driver) {
    	//System.out.println("  from categories constructor page " + driver.getCurrentUrl());
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getAsusX55A() throws InterruptedException{
    	//System.out.println("  from categories  page " + driver.getCurrentUrl());
    	Thread.sleep(3000);
    	JavascriptExecutor je = (JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView(true);",selectAsusX55A);
    	new WebDriverWait(driver,90).until(ExpectedConditions.visibilityOf(selectAsusX55A));
    	Thread.sleep(2000);
    	return selectAsusX55A;
    }
	
	
}
