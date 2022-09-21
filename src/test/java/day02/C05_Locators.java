package day02;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://amazon.com");
        //amazonda nutella aratınız
         //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);//id uniqe olduğu icin bu sorunsuz calisir
        //WebElement aramaKutusu1 = driver.findElement(By.name("field-keywords"));
        //aramaKutusu1.sendKeys("Nutella"+ Keys.ENTER);//uniqe oldugu icin sorunsuz calisir
        //WebElement aramaKutusu2 = driver.findElement(By.className("nav-search-field "));
        /*
        bu locatar calismadi
        locatar alirken gozumuzden kacan detaylar olabilir
        aldgımız bir locatar calismaz ise alternatif locatarlar denemeliyiz
         */
        driver.findElement(By.partialLinkText("oducts on Amazon")).click();//a tag'ındaki link isminden istediğimiz bir parca
        //ile locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();
    }
}
