package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.pages;

public class TestSteps {
pages p=new pages();
	@Given("^I lopen Online booking webapp with url as \"([^\"]*)\"$")
	public void i_lopen_Online_booking_webapp_with_url_as(String url) throws Throwable {
		p.launch(url);
	    throw new PendingException();
	}
	@When("^user enters required input to book the room$")
	public void user_enters_required_input_to_book_the_room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		p.Enterdata();
	    throw new PendingException();
	}

}
