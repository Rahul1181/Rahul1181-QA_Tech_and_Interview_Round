package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_AuthTest {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");



    }
    //Check the basic Authentication
    @Test(priority = 1)
    public void basicAuth() throws InterruptedException{
        driver.findElement(By.xpath("//a[contains(@href ,'/basic_auth')]")).click();

        //Simply use this
        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //alert won't work so just get the currentURL
        String currURL = driver.getCurrentUrl();

        //Remove the HTTPS:// from the URL
        String authURL = currURL.replace("https://","https://admin:admin@");

        driver.get(authURL);
        Thread.sleep(2000);
        String successAuthText = driver.findElement(By.xpath("//p[contains(text(), 'Congratulations')]")).getText();
        Assert.assertTrue(successAuthText.contains("Congratulations! You must have the proper credentials."));


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
