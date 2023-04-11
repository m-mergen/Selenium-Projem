import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ders01_giris {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        WebElement element1=driver.findElement(By.id(""));
//        WebElement element2=driver.findElement(By.cssSelector(""));
//        WebElement element3=driver.findElement(By.xpath(""));
//        WebElement element4=driver.findElement(By.name(""));
//        WebElement element5=driver.findElement(By.linkText(""));
//        WebElement element6=driver.findElement(By.className(""));
//
//
//        element1.click(); // tıklama işlemi yapar
//        element2.sendKeys(); // elemana text(metin) gönderme işlemi yapar

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fulName = driver.findElement(By.id("userName"));
        fulName.click();
        fulName.sendKeys("Mesut Manisa");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("ykopboz@gmail.com");

        WebElement currentAddress   = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
        currentAddress.click();
        currentAddress.sendKeys("Manisa/Alaşehir");

        JavascriptExecutor ekranAsagıyaKaydr=(JavascriptExecutor) driver;
        ekranAsagıyaKaydr.executeScript("window.scrollBy(0,300)");

        WebElement permanentAddress = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
        permanentAddress.click();
        permanentAddress.sendKeys("Mesut Kopya");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();
        driver.quit();








    }
}
