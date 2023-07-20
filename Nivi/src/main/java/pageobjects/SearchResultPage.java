package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import resuable.BrowserCall;

public class SearchResultPage extends BrowserCall {

   private static WebElement sort ;

    public static void sortBy(int index){
       sortElement();
       sort.findElements(By.tagName("li")).get(index).click();

    }

    public static void sortElement(){

        sort = driver.findElement(By.className("a-popover-inner"));
    }

    public static void clickSort(){
        driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
    }

    public static String getResultText(){

      return driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
    }


}
