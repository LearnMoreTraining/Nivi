package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;
import resuable.BrowserCall;
import samplepackage.Browser;

import java.io.IOException;

public class AamzonSteps {

    @Given("user enter the keyword for the product search")
    public void searchProduct() throws IOException {
        BrowserCall.browserCall();
        HomePage.enterProduct("iphone");
        HomePage.clickSearchIcon();

    }

    @Then("Verify the suggested product")
    public void verifyTheSuggestedProduct() {

       String actualResult = SearchResultPage.getResultText();
       if(actualResult.contains("results for \"phone\"")){

           Assert.assertTrue(true);

       }
       else{

           Assert.assertTrue(false);
       }


    }

    @When("sort the product by low to high")
    public void sortTheProductByLowToHigh() {

        SearchResultPage.clickSort();
        SearchResultPage.sortBy(1);
    }
}
