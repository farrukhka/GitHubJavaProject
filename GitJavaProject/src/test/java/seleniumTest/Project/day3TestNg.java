package seleniumTest.Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class day3TestNg {
	
	@BeforeClass
	public void beforclas()
	{
	System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WebloginCarLoan(String urlname, String key)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeSuite
	public void BFsuite()
	{
		System.out.println("I am no 1");
	}

	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("Mobilelogincar");	}
	@Test(enabled=false)
	public void MobilesignincarLoan()
	{
		System.out.println("Mobile SIGNIN");
	}
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String username,String password)
	{
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
		
			@BeforeMethod
			public void beforeevery()
			{
				System.out.println("I will execute before every test method in day 3 class");
			}
			
			@AfterMethod
			public void afterevery() {
			
			System.out.println("I will execute after every test method in day 3 class");
			}
		
	
	
	@Test(dependsOnMethods= {"WebloginCarLoan","dependenceMethod"})
	public void LoginAPIcarLoan()
	{
		System.out.println("APIlogincar");
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] ="firstusername";
		data[0][1] ="password";
		
		data[1][0] ="secondusername";
		data[1][1] ="secondpassword";
		
		data[2][0] ="thirdusername";
		data[2][1] ="thirdpassword";
		return data;
		
		
		
		
	}
	
	
	
	@Test
	public void dependenceMethod() {
		System.out.println("Here is my dependence Method");
	}
	
}
