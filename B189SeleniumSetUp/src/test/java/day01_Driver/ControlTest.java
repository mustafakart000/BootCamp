package day01_Driver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getCurrentUrl());
        WebElement element = driver.findElement(By.id("Google'da Ara"));
        element.sendKeys("Merhaba, Dünya!");

        driver.quit();


    }

}
