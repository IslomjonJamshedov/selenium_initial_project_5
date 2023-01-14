package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){};

    public static WebDriver getDriver(){
        if (driver == null) {
            System.setProperty("webdriver.chromedriver", "/Users/jonjamshedov/IdeaProjects/initial_selenium_project_5/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }


    public static void main(String[] args) {
        try{
            WebDriver driver =  Driver.getDriver();




        }catch (Exception e){
            System.out.println("Test FAILED due to: " + e.getMessage());
        } finally {
            Driver.quitDriver();
        }

    }
}
