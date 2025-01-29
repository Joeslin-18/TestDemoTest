package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.build.Plugin;
import pages.SearchEngine;

import static pages.SearchEngine.*;

public class BasePage  extends SearchEngine {
    @Given("User opens browser")
    public void user_opens_browser() {
        hit_Url();

    }
    @When("User sees browser address bar")
    public void user_sees_browser_address_bar() {
       find_location();

    }
    @Then("User types Search Engine URL")
    public void user_types_search_engine_url() {
       enter_value();

    }
    @Then("Close the browser")
    public void Close_the_browser(){
    close_search();
    }

}
