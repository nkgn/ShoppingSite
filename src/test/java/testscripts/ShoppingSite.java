package testscripts;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pageResources.HelperClass;
import pages.CustomerDetailsPage;
import pages.HomePage;
import pages.LoginPage;

public class ShoppingSite {

	private WebDriver driver;
	HomePage homePage;
	LoginPage loginPage ;
	CustomerDetailsPage custDetails;
	//String baseURL ; // = "http://ecommerce.saipratap.net/index.php" ;
	String baseURL = "http://ecommerce.saipratap.net/index.php" ;
	Properties properties;
	
	//@BeforeSuite
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
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
		custDetails = new CustomerDetailsPage(driver);
	}
	
	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		System.out.println();
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.firefox.marionette", "drivers/geckodriver.exe");
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
		
		//Call take screenshot function

        takeSnapShot(driver, "c://test.png") ;     

		
		//System.out.println(driver.getCurrentUrl());
		HelperClass.driver = driver;
		
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		custDetails = new CustomerDetailsPage(driver);
		
		
	}
	
	
	/* This function will take screenshot

    * @param webdriver

    * @param fileWithPath

    * @throws Exception

    */

   public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

       //Convert web driver object to TakeScreenshot

       TakesScreenshot scrShot =((TakesScreenshot)webdriver);

       //Call getScreenshotAs method to create image file

               File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

           //Move image file to new destination

               File DestFile=new File(fileWithPath);

               //Copy file at destination

               FileUtils.copyFile(SrcFile, DestFile);

   }


	
	
	
	public void setUpParallel() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
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
		custDetails = new CustomerDetailsPage(driver);
	}

		
	@AfterSuite
	public void cleanUp() {

		driver.close();
		driver.quit();
		
	}
}
