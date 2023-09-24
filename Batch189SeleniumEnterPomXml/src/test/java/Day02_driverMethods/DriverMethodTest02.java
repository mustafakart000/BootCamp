package Day02_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodTest02 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.amazon.com");
        System.out.println("Title: "+ chromeDriver.getTitle());
        System.out.println("Link: " + chromeDriver.getCurrentUrl());
        String actualTitle = chromeDriver.getTitle();
        if (actualTitle.contains("amazon")) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        Thread.sleep(4000);
        String actualUrl = chromeDriver.getCurrentUrl();
        System.out.println("actualUrl = "+ actualUrl);
        if (actualUrl.contains("amazon")) {
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }


        //sayfa handle değeri yazdırın..."

        String amazonWindowHandle = chromeDriver.getWindowHandle();
        System.out.println("amazonWindowHandle = "+ amazonWindowHandle);

        if (amazonWindowHandle.contains("Gateway")){
            System.out.println();
        }
    }
}
