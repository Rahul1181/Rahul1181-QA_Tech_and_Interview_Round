package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Set;

public class WindowHandleTest {
    private static WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
        driver.findElement(By.cssSelector("a[href='/windows']")).click();

    }
    @Test
    public void windowHandle() throws InterruptedException{
        String heading = driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
        System.out.println("Heading of the page: " + heading);

        //Remember the main window
        String mainWindow = driver.getWindowHandle();

        //Click on the new Window link
        driver.findElement(By.cssSelector("a[href ='/windows/new']")).click();

        //Store all the window in a Set<String>
        Set<String> allWindows = driver.getWindowHandles();

        //Switch to new window
        for(String currWindow : allWindows){
            if(!currWindow.equals(mainWindow)){
                driver.switchTo().window(currWindow);
                break;
            }
        }
        Thread.sleep(2000);

        //work with new Window
        String getNewWindowTitle = driver.findElement(By.xpath("//h3[text() ='New Window']")).getText();

        //close the current window
        driver.close();
        Thread.sleep(2000);

        //Switch to mainwindow
        driver.switchTo().window(mainWindow);
        String mainWindowText = driver.findElement(By.xpath("//div[text()='Powered by ']")).getText();
        Assert.assertEquals(mainWindowText, "Powered by Elemental Selenium", "Main Window Text Mismatch");
        Thread.sleep(2000);






    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
