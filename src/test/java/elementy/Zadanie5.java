package elementy;

import konfiguracja.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Zadanie5 extends Common {
    public static void main(String[] args) {
        openHotelApp();

        WebElement signInButton = driver.findElement(By.className("user_login"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.className("account_input"));
        emailInput.sendKeys("karol.smalz@asdasdasd.pl");

        WebElement createNewUserButton = driver.findElement(By.id("SubmitCreate"));
        createNewUserButton.click();

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstNameInput.clear();
        firstNameInput.sendKeys("Karol");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastNameInput.clear();
        lastNameInput.sendKeys("Smałz");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='passwd']"));
        passwordInput.clear();
        passwordInput.sendKeys("ultr4t4jneh4sl0");

        WebElement registerButton = driver.findElement(By.id("submitAccount"));
        registerButton.click();

        WebElement myPersonalInformation = driver.findElement(By.cssSelector("a[title='Information']"));
        WebElement addressesButton = driver.findElement(By.cssSelector("a[title='Addresses']"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addressesButton.click();
    }
}
