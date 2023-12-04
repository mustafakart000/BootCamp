package day04_WebElements_XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ClassWork {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver= new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        webDriver.get("https://testcenter.techproeducation.com/index.php");
        System.out.println(webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)));
        WebElement button = webDriver.findElement(By.partialLinkText("Back to TechProEducation.com"));
        button.click();

        //"Application Lists" basliğini tagname ile locate ederek görünür olup olmadığını test ediniz.

        WebElement applicationsLists = webDriver.findElement(By.tagName("h1"));

        System.out.println("Actual Result: " + applicationsLists);

        if (applicationsLists.isDisplayed()) {
            System.out.println("Test passed " + applicationsLists.getText());
        }else {
            System.out.println("Test failed " + applicationsLists.getText());
        }






    }
}
