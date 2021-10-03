package konfiguracja;

import common.Utils;

public class Zadanie3 extends Utils {
    public static void main(String[] args) {
        openGoogleAndAccept();
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
