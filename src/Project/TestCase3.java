package Project;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase3 {public static void main(String[] args) {
    try {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");






    } catch (Exception e) {
        System.out.println("Test FAILED due to: " + e.getMessage());
    } finally {
        Driver.quitDriver();
    }

}
}
