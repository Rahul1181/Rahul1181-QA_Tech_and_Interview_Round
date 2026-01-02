package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    public static WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

    }

    @Test
    public void snapdeal() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Here js.executeScript will return a object which will type cast to WebElement interface and get stored in WomenFashion
        WebElement womensFashion = (WebElement) js.executeScript(
                "return [...document.querySelectorAll('div')]" +
                        ".find(el => el.textContent.trim() === \"Women's Fashion\");");
        js.executeScript(
                "arguments[0].dispatchEvent(new MouseEvent('mouseover', { bubbles: true }));",
                womensFashion);
        js.executeScript(
                "document.body.addEventListener(" +
                        "'mouseout', e => e.stopPropagation(), true);");
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
        WebElement subMenuItem = driver.findElement(By.xpath("//div[contains(text(),'Kurtas & Kurtis')]"));

        subMenuItem.click();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
