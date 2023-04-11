package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class proje01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //  1.Web sayfası açılır
        driver.get("https://demoqa.com");
        JavascriptExecutor kaydir = (JavascriptExecutor) driver;
        kaydir.executeScript("window.scrollBy(0, 200)");

        //  2.Elements başlığına gidilir.
        WebElement elemnets = driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));
        elemnets.click();

        JavascriptExecutor kaydir2 = (JavascriptExecutor) driver;
        kaydir.executeScript("window.scrollBy(0, 200)");

        //  3. Web Tables alt başlığına gidilir.
        WebElement webTables = driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
        webTables.click();

        //  4.Add butonuna tıklanır.
        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addButton.click();

        //  5.Tüm gerekli bilgiler doldurulur.
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.click();
        firstName.sendKeys("Mesut");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.click();
        lastName.sendKeys("Gökçe");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.click();
        email.sendKeys("ychag@example.com");

        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("20");

        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.click();
        salary.sendKeys("10000");

        WebElement department    = driver.findElement(By.xpath("//input[@id='department']"));
        department.click();
        department.sendKeys("IT");


        //  6.Submit edilir
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
        //  7.Quit ile proje bitirilir.
       driver.quit();


    }
}
