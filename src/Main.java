import Utils.Driver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        try {
            WebDriver driver = Driver.getDriver();
            driver.get("");


        } catch (Exception e) {
            System.out.println("Test FAILED due to: " + e.getMessage());
        } finally {
            Driver.quitDriver();
        }

    }
}
