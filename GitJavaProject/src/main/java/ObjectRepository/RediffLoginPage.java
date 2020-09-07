package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By signin = By.xpath("//*[@class='signin']");
	By username = By.id("login1");
	By password = By.name("passwd");
	By login = By.cssSelector("[class='signinbtn']");
	By goback = By.linkText("linkText");
			

	public WebElement SignIn() {
		return driver.findElement(signin);

	}

	public WebElement UserName() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement LogIn() {
		return driver.findElement(login);
	}
	
	public WebElement GoBack() {
		return driver.findElement(goback);
	}
}
