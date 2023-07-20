package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BrowserCall;

import java.io.IOException;
import java.time.Duration;

public class NewSteps {

    WebDriver driver;
    WebElement curencyElement;
    @Given("Select the dropdwon value from currency dropdown")
    public void selectValue() throws IOException {

        BrowserCall b = new BrowserCall();
        driver = b.browserCall();
        curencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
       Select currnecyDrop = new Select(curencyElement);
      // currnecyDrop.selectByIndex(2);
      //  currnecyDrop.selectByVisibleText("KWD");
        currnecyDrop.selectByValue("EUR");

        driver.findElement(By.id("divpaxinfo")).click();

       WebElement adultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
       Select adultDrop = new Select(adultElement);
       adultDrop.selectByIndex(3);

    }

    @When("Iterate the dropdown values")
    public void iterateTheDropdownValues() {

       int dropSize = curencyElement.findElements(By.tagName("option")).size();

        for(int i =0 ; i < dropSize ;i++){

          String value =  curencyElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);
        }

    }

    @Given("user handles the dynamic dropdown")
    public void userHandlesTheDynamicDropdown() throws IOException {

      driver = BrowserCall.browserCall();

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

//        WebElement toDrop = driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
//        toDrop.findElement(By.xpath("//a[@value='MAA']")).click();

        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();


    }

    @Given("user handles the auto suggestive dropdown")
    public void userHandlesTheAutoSuggestiveDropdown() throws IOException {

       driver = BrowserCall.browserCall();
       driver.findElement(By.name("flying_from_N")).click();
       WebElement from = driver.findElement(By.name("flying_from"));

       from.sendKeys("che");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

       int i =0 ;
       while(i < 3){
           from.sendKeys(Keys.ARROW_DOWN);
         i++;
       }

       for(int j=0; j< 3 ; j++){
           from.sendKeys(Keys.ARROW_DOWN);
       }


       from.sendKeys(Keys.ENTER);




    }

    @Given("User handles the table")
    public void userHandlesTheTable() throws IOException {

        driver = BrowserCall.browserCall();

        WebElement ey = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

        for (int i = 0; i < ey.findElements(By.tagName("td")).size(); i++) {

            String value = ey.findElements(By.tagName("td")).get(i).getText();

            System.out.println(value);

        }

        WebElement revenuTable = driver.findElement(By.className("wikitable"));

        for(int j=0 ;j<revenuTable.findElements(By.xpath("//tr/td[5]")).size();j++){

            String val =revenuTable.findElements(By.xpath("//tr/td[5]")).get(j).getText();
            System.out.println(val);
        }

    }

    @Given("User Handles the hyperlink")
    public void userHandlesTheHyperlink() throws IOException {

       driver = BrowserCall.browserCall();

       WebElement getToKnow = driver.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility']"));


       for(int i = 0 ; i < getToKnow.findElements(By.tagName("li")).size() ;i++ ){

          getToKnow.findElements(By.tagName("li")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
       }

        WebElement connect = driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[@class='navFooterLinkCol navAccessibility'][2]"));


        for(int i = 0 ; i < connect.findElements(By.tagName("li")).size() ;i++ ){

           String keyAction = Keys.chord(Keys.CONTROL, Keys.ENTER);
           WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
           connect.findElements(By.tagName("li")).get(i).sendKeys(keyAction);
        }






    }
}
