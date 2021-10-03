package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;
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

    public static String getRandomEmail() {
        List<String> name = List.of("Jan", "Janina", "Paweł", "Zosia", "Krzysztof", "Janosik", "Elżbieta", "Piwowar", "Ignacy", "Inez");
        List<String> surname = List.of("Kowalski", "Nowak", "Brzęczyszczykiewicz", "Kowal", "Piekarz", "Chrzan", "Kapusta", "Lisowski");
        List<String> domains = List.of("gmail.com", "onet.pl", "wp.pl", "czlowieksukcesu.pl", "prezydent.pl", "sejm.gov.hehe", "smieszki.hehe");
        Random rand = new Random();
        return name.get(rand.nextInt(name.size())) + "." + surname.get(rand.nextInt(surname.size())) + "@" + domains.get(rand.nextInt(domains.size()));
    }
}
