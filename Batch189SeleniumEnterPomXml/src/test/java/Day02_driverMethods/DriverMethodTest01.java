package Day02_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodTest01 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.amazon.com");
        System.out.println("Title: "+ chromeDriver.getTitle());
        System.out.println("Link: " + chromeDriver.getCurrentUrl());
        chromeDriver.get("http://www.google.com");
        System.out.println("Title: "+ chromeDriver.getTitle());
        System.out.println("Link: " + chromeDriver.getCurrentUrl());
        chromeDriver.navigate().back();
    }
}
