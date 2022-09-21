package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_Findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //amazon sayfasina gidiniz
        driver.get("https://amazon.com");
        //Amazon sayfasindaki tag'lari input olanlarin sayisini yazdiriniz
        List<WebElement> tag = driver.findElements(By.tagName("input"));
        System.out.println("input Tag'inin sayisi : "+tag.size());
    }

}
