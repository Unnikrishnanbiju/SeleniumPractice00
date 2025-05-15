package Learn_selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex_07_action {

    ChromeDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void testExample() {
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);
        actions.moveToElement(name)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys(name, "biju")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();



    }

    @AfterTest
    public void close() {
        System.out.println("Cleanup or resource release code here");
//        driver.quit(); // Optional: close browser after test
    }
}
