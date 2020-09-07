package E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseInternet {

	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("//Users//farrukhka//eclipse-workspace//Project//src//main//java//E2EProject//data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println("browserName");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "//Users//farrukhka//Downloads//chromedriver");
			WebDriver driver = new ChromeDriver();
			
	}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "//Users//farrukhka//Downloads//geckodriver");
			WebDriver driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
	
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
