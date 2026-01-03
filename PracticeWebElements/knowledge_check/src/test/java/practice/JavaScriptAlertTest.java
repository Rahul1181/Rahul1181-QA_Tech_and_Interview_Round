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

public class JavaScriptAlertTest {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //Opening the URL
        driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
        //Clcking on the JavaScript Alert
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();

    }
    //Handle JavaScript Alerts Accept
    @Test
    public void jsAlertAccept(){
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        //Switch to Alert
        Alert alert = driver.switchTo().alert();
        //Get the Alert Text
        String alertText = alert.getText();
        System.out.println(alertText);
        Assert.assertEquals(alertText,"I am a JS Alert", "Alert Mismatch");
        alert.accept();

    }
    //Handle JavaScript Alerts confirm
    @Test
    public void jsAlertConfirm() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        //Switch to Alert
        Alert alert = driver.switchTo().alert();

        //Get the Alert text and assert it
        String confirmAlertText = alert.getText();
        System.out.println(confirmAlertText);
        Assert.assertEquals(confirmAlertText, "I am a JS Confirm", "Alert Mismatch");

        //Click on Cancel
        alert.dismiss();
        String dismissText = driver.findElement(By.cssSelector("#result")).getText();
        Assert.assertEquals(dismissText, "You clicked: Cancel", "Accept Text Mismatch");
        Thread.sleep(1000);

        //click on the JS confirm button
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        alert.accept();
        String accpetText = driver.findElement(By.cssSelector("#result")).getText();
        Assert.assertEquals(accpetText, "You clicked: Ok", "Dismiss Text Mismatch");
        Thread.sleep(500);

    }

    @Test
    public void jsAlertPrompt() throws InterruptedException{
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();

        //Switch to Alert
        Alert alert = driver.switchTo().alert();

        //Get the Alert prompt text and verify it
        String alertPromptText = alert.getText();
        Assert.assertEquals(alertPromptText, "I am a JS prompt", "Prompt Text Mismatch");
        System.out.println(alertPromptText);

        //SendKeys
        alert.sendKeys("Rahul");
        alert.accept();
        Thread.sleep(2000);
        String accpetResult = driver.findElement(By.cssSelector("#result")).getText();
        Assert.assertEquals(accpetResult, "You entered: Rahul", "Dismiss Text Mismatch");



        //Clicked on Dismiss
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        alert.dismiss();
        Thread.sleep(2000);
        String dismissResult = driver.findElement(By.cssSelector("#result")).getText();
        Assert.assertEquals(dismissResult, "You entered: null", "Dismiss Text Mismatch");

    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    
}
