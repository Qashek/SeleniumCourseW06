package funkcjeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Zadanie1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://pl.wikipedia.org");

//        WebElement element = driver.findElement(By.id("main-page-column1"));
//        System.out.println(element.getText());

        // lepiej tak
//        WebElement element = driver.findElement(By.id("main-page-content"));
//        String tekstElementu = element.getText();
        String atrybut = driver.findElement(By.id("main-page-content")).getTagName();
        System.out.println(atrybut);
    }
}
