package sauceDemoExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ControlPiece {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
//        try {
//            //Kullanıcı adı ve şifre girişi
//
//            WebElement usernameInput = driver.findElement(By.id("user-name"));
//
//            usernameInput.sendKeys("standard_user");
//
//            WebElement passwordInput = driver.findElement(By.id("password"));
//            passwordInput.sendKeys("secret_sauce");
//
//            WebElement loginButton = driver.findElement(By.id("login-button"));
//            loginButton.click();
//
//            //ürün listesini al
//
////            WebElement proudcts = driver.findElement(By.cssSelector(".inventory_list"));
//            List<WebElement> proudctsItem = driver.findElements(By.cssSelector(".inventory_item"));
//
//            for (WebElement w: proudctsItem) {
//                WebElement productName  = w.findElement(By.cssSelector(".inventory_item_name"));
//                WebElement productPrice = w.findElement(By.cssSelector(".inventory_item_price"));
//                System.out.print("      productName   =   " + productName.getText());
//                System.out.println("    productPrice  =   " + productPrice.getText());
//            }
//
//
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            //Web sürücüsünü Kapat.
//            driver.quit();
        }
    }



