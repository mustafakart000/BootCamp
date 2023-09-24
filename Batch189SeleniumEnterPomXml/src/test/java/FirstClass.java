import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {

//        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.edgedriver().setup();

        WebDriver driverChrome = new ChromeDriver();
//        WebDriver driverEdge = new EdgeDriver();
//        WebDriver driverFireFox = new FirefoxDriver();


//        driverEdge.get("www.google.com");
        driverChrome.get("https://www.google.com");
        driverChrome.navigate().to("https://www.google.com");
        driverChrome.manage().window().maximize();

    }
}
