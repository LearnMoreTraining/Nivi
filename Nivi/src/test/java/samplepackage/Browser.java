package samplepackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.in/");



    }
}
