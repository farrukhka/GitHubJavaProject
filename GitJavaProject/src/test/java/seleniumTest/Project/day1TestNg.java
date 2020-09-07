package seleniumTest.Project;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class day1TestNg {
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}

	@Test
	public void Demo() {

		System.out.println("hello");
		AssertJUnit.assertTrue(true);
		

	}
	@AfterSuite
	public void AfSyite() {
		System.out.println("I am the no 1 from last");
	}

	@Test
	public void SecondTest() {

		System.out.println("Bye");

	}
}
