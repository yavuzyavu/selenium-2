package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi: "+driver.getTitle());
        //sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");
        // sayfa adresini (url) yazdirin
        System.out.println("Sayfanin Url'i : "+driver.getCurrentUrl());
        //sayfa url'nin "amazon" icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else  System.out.println("Url testi FAILED");;
        //sayfa handle degerini yazdirin
        System.out.println("Handle degeri "+driver.getWindowHandle());
        //sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String actualPageSource = driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if(actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sourcecode Testi PASSED");
        }else System.out.println("Sourcecode Testi FAILED");
        //sayfayi kapatin
        driver.close();

    }
}
