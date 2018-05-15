package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageResources.HelperClass;
import pageResources.ReadExcelGuru99;
import pages.CustomerDetailsPage;
import pages.HomePage;
import pages.LoginPage;

public class RegisterNewUser {
	private WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	CustomerDetailsPage custDetails;

	@BeforeClass
	public void setUp() {
		driver = HelperClass.driver;
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		custDetails = new CustomerDetailsPage(driver);
	}

	/* provide data to the test */
	@DataProvider
	public Object[][] RawData() throws Exception {
		ReadExcelGuru99 readExcelSheet = new ReadExcelGuru99();
		Object[][] testObjArray = readExcelSheet.readExcel("UserDetails.xlsx", "Sheet1");
		return testObjArray;
	}

	@Test(dataProvider = "RawData")
	public void registerUser(String gender, String fname, String lname, String day, String month, String year,
			String email, String houseno, String streetno, String city, String county, String country, String postcode,
			String dayphone, String eveningphone, String pwd, String cpwd) throws InterruptedException, IOException {
		//System.out.println(" cpwd= " + cpwd);
		homePage.getAccountsTab().click();
		loginPage.getSignUpLink().click();
		custDetails.getGenderF().click();
		custDetails.getFirstName().sendKeys(fname);
		custDetails.getLastName().sendKeys(lname);
		custDetails.getDay().sendKeys(day); // need validation here
		custDetails.getMonth().sendKeys(month);
		custDetails.getYear().sendKeys(year);
		custDetails.getEmail().sendKeys(email);// validation
		custDetails.getHouseNo().sendKeys(houseno);
		custDetails.getStreetNumber().sendKeys(streetno);
		custDetails.getCity().sendKeys(city);
		custDetails.getCounty().sendKeys(county);
		// custDetails.getCountry().sendKeys(country);
		custDetails.getPostCode().sendKeys(postcode);
		custDetails.getDayPhone().sendKeys(dayphone);
		custDetails.getEveningPhone().sendKeys(eveningphone);
		custDetails.getPwd().sendKeys(pwd);
		// Thread.sleep(4000);
		custDetails.getConfirmPwd().sendKeys(cpwd);
		// Thread.sleep(8000);
		// custDetails.getNewsLetter().click();
		custDetails.getTerms().click();
		// Thread.sleep(5000);
		custDetails.getSignUpButton().click();
		// Thread.sleep(10000);
		// Assert.assertEquals(driver.getCurrentUrl(),
		// "http://ecommerce.saipratap.net/thankyoumessage.php?msg=reg");

	}

	@Test
	public void registerSingleUser() {

		homePage.getAccountsTab().click();
		loginPage.getSignUpLink().click();
		custDetails.getGenderF().click();
		custDetails.getFirstName().sendKeys("Nandan");
		custDetails.getLastName().sendKeys("Patrick");
		custDetails.getDay().sendKeys("2"); // need validation here
		custDetails.getMonth().sendKeys("2");
		custDetails.getYear().sendKeys("2000");
		custDetails.getEmail().sendKeys("ap@yahoo.com");// validation
		custDetails.getHouseNo().sendKeys("22");
		custDetails.getStreetNumber().sendKeys("123");
		custDetails.getCity().sendKeys("SS");
		custDetails.getCounty().sendKeys("11aa");
		// custDetails.getCountry().sendKeys(country);
		custDetails.getPostCode().sendKeys("23445");
		custDetails.getDayPhone().sendKeys("22222222");
		custDetails.getEveningPhone().sendKeys("22222222");
		custDetails.getPwd().sendKeys("xxx");
		// Thread.sleep(4000);
		custDetails.getConfirmPwd().sendKeys("xxx");
		// Thread.sleep(8000);
		// custDetails.getNewsLetter().click();
		custDetails.getTerms().click();
		// Thread.sleep(5000);
		custDetails.getSignUpButton().click();
		// Thread.sleep(10000);
		// Assert.assertEquals(driver.getCurrentUrl(),
		// "http://ecommerce.saipratap.net/thankyoumessage.php?msg=reg");

	}

}
