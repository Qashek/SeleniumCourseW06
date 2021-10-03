package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Utils {
    protected static WebDriver driver;

    public static void openChrome() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void openGoogleAndAccept() {
        openChrome();

        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
    }

    public static void openHotelApp() {
        openChrome();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }
}
