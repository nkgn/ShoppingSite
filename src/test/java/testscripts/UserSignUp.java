package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageResources.HelperClass;
import pages.CustomerDetailsPage;
import pages.HomePage;
import pages.LoginPage;

public class UserSignUp {
	private WebDriver driver;
	HomePage homePage;
	LoginPage loginPage ;
	
	
	@BeforeClass
	public void setUp(){
		driver = HelperClass.driver;
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		
	}
	@Test
	public void signUp() throws InterruptedException {
		homePage.getAccountsTab().click();
		loginPage.getEmail().sendKeys("n_kgn@yahoo.com");
		loginPage.getPassword().sendKeys("xxx");
		loginPage.getLoginButton().click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"http://ecommerce.saipratap.net/thankyoumessage.php?msg=login" );
			
	}
}
