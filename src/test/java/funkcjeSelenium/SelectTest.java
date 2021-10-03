package funkcjeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // https://mystore-testlab.coderslab.pl/index.php?controller=identity
        WebElement checkboxOffersFromPartners = driver.findElement(By.name("optin"));

        // zapisz się na oferty od partnerów sklepu
        if (!checkboxOffersFromPartners.isSelected()) {
            checkboxOffersFromPartners.click();
        }


    }
}
