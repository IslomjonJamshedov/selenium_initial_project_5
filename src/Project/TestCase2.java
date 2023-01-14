package Project;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        try {
            WebDriver driver = Driver.getDriver();
            driver.get("https://automationexercise.com/");

            List<WebElement> header = driver.findElements(By.cssSelector("ul[class=\"nav navbar-nav\"]"));

            for (WebElement webElement : header){
                System.out.println(webElement.getText());
                System.out.println(webElement.isDisplayed());
                System.out.println(webElement.isEnabled());
            }

        } catch (Exception e) {
            System.out.println("Test FAILED due to: " + e.getMessage());
        } finally {
            Driver.quitDriver();
        }
    }
}
