package practice01;


import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverObject01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        new ChromeDriver();
//        WebDriverManager.chromedriver().create();


    }
}
