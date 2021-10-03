package elementy;

import common.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Zadanie4 extends Utils {
    public static void main(String[] args) {
        openHotelApp();
        WebElement signInButton = driver.findElement(By.className("user_login"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.className("account_input"));
        emailInput.sendKeys("karol.smalz@coderslab.pl");

        WebElement createNewUserButton = driver.findElement(By.id("SubmitCreate"));
        createNewUserButton.click();

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstNameInput.clear();
        firstNameInput.sendKeys("Karol");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastNameInput.clear();
        lastNameInput.sendKeys("Smałz");

        WebElement emailCreateInput = driver.findElement(By.xpath("//input[@id='email']"));
        emailCreateInput.clear();
        emailCreateInput.sendKeys("karol.smalz@gmail.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='passwd']"));
        passwordInput.clear();
        passwordInput.sendKeys("ultr4t4jneh4sl0");
    }
}
