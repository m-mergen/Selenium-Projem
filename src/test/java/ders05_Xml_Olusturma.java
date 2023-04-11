import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ders05_Xml_Olusturma {
    WebDriver driver ;
    @BeforeTest
    public void testtenOncekiAdimlar(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void ansayfaBaglanma(){
        driver.get("https://www.google.com");
    }
    @AfterTest
    public void testSonrasiAdimlar(){
        driver.quit();
    }

}
