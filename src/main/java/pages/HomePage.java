package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver ;

    @FindBy(xpath="//a[text()='HOME']")
    WebElement homeTab;
    
    @FindBy(xpath="//a[text()='CATEGORIES']")
    WebElement categoriesTab;
    
    @FindBy(xpath="//a[text()='BRANDS']")
    WebElement brandsTab;
    
    @FindBy(xpath="//a[text()='PRODUCTS']")
    WebElement productsTab;
    
    @FindBy(xpath="//a[text()='MYCART']")
    WebElement myCartTab;
    
    @FindBy(xpath="//a[text()='TRACKING']")
    WebElement trackingTab;
    
    @FindBy(xpath="//a[text()='ACCOUNT']")
    WebElement accountsTab;
    
    @FindBy(xpath="//a[text()='FAQ/'S']")
    WebElement faqsTab;
    
    @FindBy(xpath="//a[text()='ABOUT US']")
    WebElement aboutUsTab;
    
    @FindBy(xpath="//a[@class='hide']")
    WebElement electronicsLeftMenu;
    
    @FindBy(xpath="//a[text()='Electronics']")
    WebElement electronics;
    
    @FindBy(xpath="//a[text()=' Computers ']")
    WebElement computersOption;
    


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public WebElement getHomeTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(homeTab));
        return homeTab;
    }
    
    public WebElement getBrandsTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(brandsTab));
        return brandsTab;
    }
    
    public WebElement getCategoriesTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(categoriesTab));
        return categoriesTab;
    }
    
    public WebElement getProductsTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(productsTab));
        return productsTab;
    }
    
    public WebElement getMyCartTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(myCartTab));
        return myCartTab;
    }
    
    public WebElement getTrackingTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(trackingTab));
        return trackingTab;
    }
    
    public WebElement getAccountsTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(accountsTab));
        return accountsTab;
    }
    
    
    public WebElement getFAQSTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(faqsTab));
        return faqsTab;
    }

    public WebElement getAboutUsTab(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(aboutUsTab));
        return aboutUsTab;
    }
    
    public WebElement getElectronics(){
        new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(electronics));
        return electronics;
    }
    
    public void selectComputersOption() throws InterruptedException{
    	//System.out.println("  from home page " + driver.getCurrentUrl());
    	Actions action = new Actions(driver);
    	WebElement ele1 = getElectronics();
		action.moveToElement(ele1).build().perform();
		Thread.sleep(6000);    	
    	new WebDriverWait(driver,90).until(ExpectedConditions.visibilityOf(computersOption));
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor)driver; 
        executor.executeScript("arguments[0].click();", computersOption);
    	//action.moveToElement(computersOption).click().build().perform();
        Thread.sleep(8000);
    }
    
    
}
