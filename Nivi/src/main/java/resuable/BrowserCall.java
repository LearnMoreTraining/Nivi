package resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserCall {

  public static WebDriver driver;

    public static WebDriver browserCall() throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/utility/config.properties"));
        Properties prob = new Properties();
        prob.load(fis);

//        if(prob.getProperty("browser").equalsIgnoreCase("edge")){
//            driver = new EdgeDriver();
//        }
//        else if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
//            driver = new ChromeDriver();
//        }
//        else{
//            throw new InvalidArgumentException("Pass the valid argument");
//        }

        switch (prob.getProperty("browser").toLowerCase()){
            case "edge":
                driver = new EdgeDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                throw new InvalidArgumentException("Pass the valid argument");
        }


        driver.navigate().to(prob.getProperty("url"));
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        return driver;
    }



}
