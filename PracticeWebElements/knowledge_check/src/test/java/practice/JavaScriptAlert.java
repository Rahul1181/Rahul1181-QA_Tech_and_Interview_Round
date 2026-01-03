package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
        driver.manage().window().maximize();

    }
    //Handle JavaScript Alerts confirm
    @Test
    public void javaScriptAlert(){
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        //Switch to Alert
        Alert alert = driver.switchTo().alert();
        //Get the Alert Text
        String alertText = alert.getText();
        System.out.println(alertText);
        Assert.assertEquals(alertText,"I am a JS Alert", "Alert Mismatch");
        alert.accept();

    }
    

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    
}
