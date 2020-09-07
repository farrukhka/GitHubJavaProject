package seleniumTest.Project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class day4TestNg {
	
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname)
	{
	System.out.println("webloginhome");
	
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan ()
	{
		System.out.println("MobileloginHome");
	}
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginHome");
	}
	
	}
