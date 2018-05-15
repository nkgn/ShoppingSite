package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageResources.HelperClass;
import pages.CartPage;
import pages.ComputerCategoriesPage;
import pages.CustomerDetailsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailPage;

public class PurchaseComputer {
	
	private WebDriver driver;
	HomePage homePage;
	LoginPage loginPage ;
	ComputerCategoriesPage categories;
	ProductDetailPage prodDetails;
	CartPage cart;
	String baseURL = "http://ecommerce.saipratap.net/index.php" ;
	
	//@BeforeTest
	public void setUp() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver_new.exe");
		driver = new FirefoxDriver();
		//FirefoxOptions options = new FirefoxOptions();
		//options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //Location where Firefox is installed
 
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("moz:firefoxOptions", options);
		//set more capabilities as per your requirements
 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		//baseURL = loadPropertiesFile();
		driver.get(baseURL);
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(),baseURL);
		System.out.println(driver.getCurrentUrl());
		HelperClass.driver = driver;
		
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		categories = new ComputerCategoriesPage(driver);
		prodDetails = new ProductDetailPage(driver);
		cart = new CartPage(driver);
		
		//custDetails = new CustomerDetailsPage(driver);
	}
	
	
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver_new.exe");
			driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			//System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
		}
					
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MILLISECONDS);
		//baseURL = loadPropertiesFile();
		driver.get(baseURL);
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(),baseURL);
		//System.out.println(driver.getCurrentUrl());
		HelperClass.driver = driver;
		
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		//custDetails = new CustomerDetailsPage(driver);
		categories = new ComputerCategoriesPage(driver);
		prodDetails = new ProductDetailPage(driver);
		cart = new CartPage(driver);
		
	}
	
	@Test
	public void purchase() throws InterruptedException{
		// select computers from left menu
		homePage.selectComputersOption();
		//Thread.sleep(1000);
		categories.getAsusX55A().click();
		Thread.sleep(8000);
		//select item
		
		prodDetails.getAddToCart().click();
		//Thread.sleep(1000);
		cart.getCheckOut().click();
		
		Thread.sleep(1000);
		Assert.assertTrue(driver.getCurrentUrl().contains("ecommerce.saipratap.net/customerlogin"));
		//Assert. .assertEquals(driver.getCurrentUrl(), "http://ecommerce.saipratap.net/customerlogin.php?a=6");
		
	}
	
	@AfterTest
	public void cleanUp() {

		//driver.close();
		//driver.quit();
		
	}

}
