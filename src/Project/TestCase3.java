package Project;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase3 {public static void main(String[] args) {

    /*
    Given user navigates to “https://automationexercise.com/”
    Then user should see heading2 as “SUBSCRIPTION”
    And user should see and email input box with “Your email address” placeholder
    And user should see arrow submit button
    And user should see “Get the most recent updates from our site and be updated your self...”
    text under the email input box
    */


    try {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        //SUBSCRIPTION
        driver.findElement(By.cssSelector(".single-widget h2")).getText().equals("SUBSCRIPTION");

        //“Your email address”
        WebElement input_element = driver.findElement(By.id("susbscribe_email"));
        String placeholder_text = input_element.getAttribute(("placeholder"));

        System.out.println((placeholder_text.equals("Your email address")) ? "Text Box Test Passed"
                : "Text Box Test");

        //Arrow Submit Button
        System.out.println((driver.findElement(By.id("subscribe")).isDisplayed()) ? "Button is Displayed" :
                "Button is not Displayed");

        //Get the most recent updates from our site and be updated your self...
        System.out.println((driver.findElement(By.cssSelector(".searchform p")).isDisplayed()) ? "Text is displayed" :
        "Text is not Displayed");


    } catch (Exception e) {
        System.out.println("Test FAILED due to: " + e.getMessage());
    } finally {
        Driver.quitDriver();
    }

}
}
