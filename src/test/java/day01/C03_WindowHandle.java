package day01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle());//CDwindow-5DD5402149F39AFAE645253FA4301EE3

        //farkli pencereler arasinda gezinebilmek icin getWindowHandle() methodu kullaniriz
    }
}
