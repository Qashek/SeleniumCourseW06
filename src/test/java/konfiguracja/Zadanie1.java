package konfiguracja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Zadanie1 extends Common {
    public static void main(String[] args) {
        openGoogleAndAccept();

        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Piwo bezalkoholowe");
        element.submit();
    }
}
