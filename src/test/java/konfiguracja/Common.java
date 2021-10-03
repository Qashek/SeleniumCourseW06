package konfiguracja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
    protected static WebDriver driver;

    public static void openChrome() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void openGoogleAndAccept() {
        openChrome();

        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
    }
}
