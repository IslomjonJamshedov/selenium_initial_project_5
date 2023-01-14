package Project;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase1 {
    public static void main(String[] args) {
        try {
            WebDriver driver = Driver.getDriver();
            driver.get("https://automationexercise.com/");

            if (driver.findElement(By.cssSelector("img[alt=\"Website for automation practice\"]")).isDisplayed())
            System.out.println("Test Passed");
            else System.out.println("Test Failed");

        } catch (Exception e) {
            System.out.println("Test FAILED due to: " + e.getMessage());
        } finally {
            Driver.quitDriver();
        }

    }
}
