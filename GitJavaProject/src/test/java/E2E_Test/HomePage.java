package E2E_Test;

import java.io.IOException;

import org.testng.annotations.Test;

import E2EProject.baseInternet;

public class HomePage  extends baseInternet{
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
		
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com");
		
		
	}

}
