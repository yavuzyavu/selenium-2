package day04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
public class Odev {
    /*
1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna 10 kez basinız
3- 10 kez Add element butonuna basıldığını test ediniz
4 - Delete butonuna görünmeyene kadar basınız
5- Delete butonunun görünmediğini test ediniz
6- Sayfayı kapatınız
 */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna 10 kez basinız
        WebElement addElement = driver.findElement(By.xpath("//*[text()='Add Element']"));
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            addElement.click();
        }
        //3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButtonList = driver.findElements(By.xpath("//*[text()='Delete']"));
        int expectedDeleteButtonSayiyi = 10;
        int actualDeleteButtonSayiyi = deleteButtonList.size();
        if (actualDeleteButtonSayiyi == expectedDeleteButtonSayiyi){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        //4 - Delete butonuna görünmeyene kadar basınız
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.xpath("//*[text()='Delete']")).click();
        }
        //5- Delete butonunun görünmediğini test ediniz
        WebElement anaSayfa = driver.findElement(By.className("no-js"));
        System.out.println(anaSayfa.getText());
        String deleteButton = "Delete";
        if (!anaSayfa.getText().contains(deleteButton)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        //6- Sayfayı kapatınız
        driver.close();
    }
}