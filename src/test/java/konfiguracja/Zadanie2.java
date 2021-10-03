package konfiguracja;

public class Zadanie2 extends Common {
    public static void main(String[] args) {
        openChrome();
        driver.get("https://coderslab.pl/pl");
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        driver.get("https://qloapps.coderslab.pl/en/");
    }
}
