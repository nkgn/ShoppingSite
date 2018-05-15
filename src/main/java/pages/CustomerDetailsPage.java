package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerDetailsPage {
	private WebDriver driver;

	@FindBy(xpath = "//input[2][@name='radiobutton'][@value='2']")
	WebElement genderF;

	@FindBy(xpath = "//input[2][@name='radiobutton'][@value='1']")
	WebElement genderM;

	@FindBy(name = "fname")
	WebElement firstName;

	@FindBy(name = "lname")
	WebElement lastName;

	@FindBy(name = "day")
	WebElement day;

	@FindBy(name = "month")
	WebElement month;

	@FindBy(name = "year")
	WebElement year;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "houseno")
	WebElement houseno;

	@FindBy(name = "add1")
	WebElement streetNumber;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement county;

	@FindBy(name = "country")
	WebElement country;

	@FindBy(name = "postcode")
	WebElement postcode;

	@FindBy(name = "phone")
	WebElement dayPhone;

	@FindBy(name = "fax")
	WebElement eveningPhone;

	@FindBy(name = "password")
	WebElement pwd;

	@FindBy(name = "cpassword")
	WebElement confirmPwd;

	@FindBy(name = "newsletter")
	WebElement newsLetter;

	@FindBy(name = "terms")
	WebElement terms;

	@FindBy(name = "Submit")
	WebElement signUpButton;

	public CustomerDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getGenderF() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(genderF));
		return genderF;
	}

	public WebElement getGenderM() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(genderM));
		return genderM;
	}

	public WebElement getFirstName() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(firstName));
		return firstName;
	}

	public WebElement getLastName() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(lastName));
		return lastName;
	}

	public WebElement getDay() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(day));
		return day;
	}

	public WebElement getMonth() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(month));
		return month;
	}

	public WebElement getYear() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(year));
		return year;
	}

	public WebElement getEmail() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(email));
		return email;
	}

	public WebElement getHouseNo() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(houseno));
		return houseno;
	}

	public WebElement getStreetNumber() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(streetNumber));
		return streetNumber;
	}

	public WebElement getCity() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(city));
		return city;
	}
	public WebElement getCounty() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(county));
		return county;
	}

	public WebElement getCountry() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(country));
		return country;
	}

	public WebElement getPostCode() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(postcode));
		return postcode;
	}

	public WebElement getDayPhone() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(dayPhone));
		return dayPhone;
	}

	public WebElement getEveningPhone() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(eveningPhone));
		return eveningPhone;
	}

	public WebElement getPwd() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(pwd));
		return pwd;
	}

	public WebElement getConfirmPwd() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(confirmPwd));
		return confirmPwd;
	}

	public WebElement getNewsLetter() {
		return newsLetter;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}
}
