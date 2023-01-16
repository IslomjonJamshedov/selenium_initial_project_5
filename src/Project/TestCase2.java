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

            List<WebElement> header = driver.findElements(By.cssSelector(".nav.navbar-nav li"));
            String[] element = {"Home", "Products", "Cart", "Signup / Login", "Test Cases", "API Testing",
                    "Video Tutorials", "Contact us"};

            for (int i = 0; i < header.size(); i++) {
                System.out.println(header.get(i).getText().equals(element[i]));
                System.out.println(header.get(i).isDisplayed());
                System.out.println(header.get(i).isEnabled());
            }

        } catch (Exception e) {
            System.out.println("Test FAILED due to: " + e.getMessage());
        } finally {
            Driver.quitDriver();
        }
    }
}
