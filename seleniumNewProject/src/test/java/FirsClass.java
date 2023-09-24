import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirsClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.com","src/resources/drivers/chrome.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");


    }
}
