package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePage {

	WebDriver driver;

	public RediffHomePage(WebDriver driver) {

		this.driver = driver;
	}
	

	By shoppingElement = By.cssSelector("[title='Online Shopping']");
	By searchBoxElement = By.cssSelector("[id='srchword']");
	By searchElement = By.cssSelector(".newsrchbtn");
	

	public WebElement Shopping() {
		return driver.findElement(shoppingElement);

	}


	public WebElement SearchBox() {
		return driver.findElement(searchBoxElement);

	}


	public WebElement Search() {
		return driver.findElement(searchElement);
	}
}
