package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;
	private By txt_username = By.id("email");
	private By txt_passowrd = By.id("pass");
	private By btn_login = By.name("login");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_passowrd).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_login).sendKeys(Keys.RETURN);
	}
}
