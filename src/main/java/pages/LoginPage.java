package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//a[contains(@href,'customer.php')]")
	WebElement signUpLink;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement pwd;

	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignUpLink() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(signUpLink));
		return signUpLink;
	}

	public WebElement getEmail() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(email));
		return email;
	}

	public WebElement getPassword() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(pwd));
		return pwd;
	}

	public WebElement getLoginButton() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(loginButton));
		return loginButton;
	}

}
