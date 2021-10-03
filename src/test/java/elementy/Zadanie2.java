package elementy;

import common.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Zadanie2 extends Utils {
    public static void main(String[] args) {
        openHotelApp();
        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
        WebElement searchButton = driver.findElement(By.name("search_room_submit"));
        WebElement newsletterSignInput = driver.findElement(By.name("email"));
        WebElement subscribeButton = driver.findElement(By.name("submitNewsletter"));

        hotelLocationInput.sendKeys("Warsaw");
        newsletterSignInput.sendKeys("karol.smalz@coderslab.pl");
    }
}
