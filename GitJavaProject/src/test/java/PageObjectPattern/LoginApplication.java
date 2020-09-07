package PageObjectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;

public class LoginApplication {
	
	@Test
	public void Login()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/farrukhka/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com");
		
//		//FIRST CLASS HAS BEEN ACTIVATED
//		RediffLoginPage rd = new RediffLoginPage(driver);
//		rd.SignIn().click();
//		rd.UserName().sendKeys("Almaz");
//	    rd.Password().sendKeys("Farrukh");
//		rd.LogIn().click();
//		rd.GoBack().click();
//		
		//SECOND CLASS HAS BEEN ACTIVATED
		RediffHomePage rh = new RediffHomePage(driver);
		rh.Shopping().click();
	    rh.SearchBox().sendKeys("TV");
		rh.Search().click();
		
		
		
		

	

}
}