package elementy;

import konfiguracja.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Zadanie3 extends Common {
    public static void main(String[] args) {
        openHotelApp();
        WebElement signInButton = driver.findElement(By.className("user_login"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.className("account_input"));
        emailInput.sendKeys("karol.smalz@coderslab.pl");

        WebElement createNewUserButton = driver.findElement(By.id("SubmitCreate"));
        createNewUserButton.click();

    }
}
