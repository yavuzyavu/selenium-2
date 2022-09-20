package day01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        1 - Amazon sayfasina gidiniz
        2 - Basligin amazon icerdigini test ediniz
        3- Url'nin amazon icerdigini test ediniz
        4- Sayfayi kapatiniz
         */
//        1 - Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

//        2 - Basligin amazon icerdigini test ediniz
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

//        3- Url'nin amazon icerdigini test ediniz
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        //4- Sayfayi kapatiniz
        driver.close();

    }
}
