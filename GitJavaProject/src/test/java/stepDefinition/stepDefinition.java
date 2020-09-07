package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
		
		 System.out.println("Navigated to login url");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	
    	System.out.println(strArg1);
    	System.out.println(strArg2);;
    	
    	
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	
    	System.out.println("Validated home page");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    	
    }

}




