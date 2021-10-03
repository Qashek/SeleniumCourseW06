package elementy;

import common.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Zadanie1 extends Utils {
    public static void main(String[] args) {
        openHotelApp();
        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        WebElement searchButton = driver.findElement(By.id("search_room_submit"));
        WebElement newsletterSignInput = driver.findElement(By.id("newsletter-input"));

        hotelLocationInput.sendKeys("Warsaw");
        newsletterSignInput.sendKeys(getRandomEmail());

    }
}
