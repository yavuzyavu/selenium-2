package day02;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.choreme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://techproeducation.com");
        driver.close();

        /*
        İleride wait konusunu daha genis olarak ele alacagız
        Bir sayfa acılırken, ilk başta sayfanin icerisinde bulunan elementlere gore bir yukleme suresine ihtiyac
        vardir veya bir webelementin kullanilabilmesi icin zamana ihtiyac olabilir.
        ImlicitliyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek MAXIMUM sureyi beliirleme
        olanagi tanir
        */


    }

}
