package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnection {
	
	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Qadbt","root","Diana2013$");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select name,location from Employeeinfo where id ='2'");
		
		while (rs.next()) {

			System.setProperty("webdriver.chrome.driver", "//Users//farrukhka//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.findElement(By.cssSelector("[id='email']")).sendKeys(rs.getString("name"));
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys(rs.getString("location"));
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		
//
//			System.out.println(rs.getString("name"));
//			System.out.println(rs.getString("id"));
//			System.out.println(rs.getString("location"));
//			System.out.println(rs.getString("age"));

		}

	}

}
