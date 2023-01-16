package Project;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase4 {
    public static void main(String[] args) {

        /*
        Given user navigates to “https://automationexercise.com/”
        Then user should see “Copyright © 2021 All rights reserved” text in the footer
        */
        try{
            WebDriver driver =  Driver.getDriver();
            driver.get("https://automationexercise.com/");

            System.out.println(driver.findElement(By.cssSelector("p[class=\"pull-left\"]")).isDisplayed() ?
                    "Text is Displayed" : "Text is Not Displayed");


        }catch (Exception e){
            System.out.println("Test FAILED due to: " + e.getMessage());
        } finally {
            Driver.quitDriver();
        }

    }
}
