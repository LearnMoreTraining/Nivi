package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import resuable.BrowserCall;

import java.io.IOException;

public class AutomationSteps {

    WebDriver driver;

    @Then("Validate the success of login")
    public void loginvalidation() {

    }

    @Given("User clicks the sign in button in homepage")
    public void clickSignIn(){



    }



    @When("User enter the login credit")
    public void enterLoginData() {

    }

}
