package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Dropdown {
    private static WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");

    }
    @Test
    public void dropDownCheck() throws InterruptedException{
        //Click on the Dropdown link
        driver.findElement(By.cssSelector("a[href ='/dropdown']")).click();

        //Find the Dropdown menu and store in WebElement interface
        WebElement dropdownMenu = driver.findElement(By.cssSelector("select[id='dropdown']"));

        //Now handle the dropdown using Select class of Selenium
        Select select = new Select(dropdownMenu);

        //Select By Text
        select.selectByVisibleText("Option 1");
        Thread.sleep(2000);

        //Store the option 1 in string
        String firstOption = select.getFirstSelectedOption().getText();

        //SoftAssertion to check if the Option 1 is correct or not
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(firstOption.contains("Option 1"));

        //Select By Value tag
        select.selectByValue("2");
        Thread.sleep(2000);

        String secondOption = select.getFirstSelectedOption().getText();
        softAssert.assertTrue(secondOption.contains("Option 2"));

        //Select by index
        select.selectByIndex(1);
        Thread.sleep(2000);

        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
