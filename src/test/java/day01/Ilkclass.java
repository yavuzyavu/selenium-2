package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {
    /*
    En temel haliyle bir otomasyon yapmak icin
    Claasımıza otomasyon yapmak icin gerekli olan webdriver in yerini gostermemiz gerekir
    binin icin java kutuphanesinde System.setProperty() methodunu kullaniriz
    ve methodun icine ilk olarak driver yazariz. ikinci olarak onun fiziki yolunu kopyalariz
     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");
        System.out.println("Actual Title: "+driver.getTitle());//girilen sitenin basligini yazdirir
        System.out.println("Actual Url: "+driver.getCurrentUrl());// girilen sayfanin Url 'ini getirir

        System.out.println(driver.getPageSource());// butun kaynak kodlarini getirir


    }

}


