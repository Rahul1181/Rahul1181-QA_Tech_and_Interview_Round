package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleHeadingTest {
    private static WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");

    }
    //Check the heading
    @Test
    public void checkHeading(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='heading']")));
        WebElement heading = driver.findElement(By.xpath("//h1[@class='heading']"));

        
        String getHeading = heading.getText();
        System.out.println("WebSite heading: "+ getHeading);
        Assert.assertEquals(getHeading, "Welcome to the-internet", "Heading mismatch");

    }
    //check the Website Title
    @Test
    public void checkTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "The Internet", "Title mismatch");
        System.out.println("Title of the website: " + title );

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    
}
