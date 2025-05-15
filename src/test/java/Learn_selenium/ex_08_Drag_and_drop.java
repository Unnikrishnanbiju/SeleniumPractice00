package Learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex_08_Drag_and_drop {

    ChromeDriver driver;

    @BeforeTest
    public void setup() {
        // Set up ChromeDriver

        driver = new ChromeDriver();


    }

    @Test
    public void testExample() {
        // Test code here
       String URL = "https://the-internet.herokuapp.com/drag_and_drop";
       driver.get(URL);

       WebElement from = driver.findElement(By.xpath("//div[@id='column-a']"));
       WebElement to = driver.findElement(By.xpath("//div[@id='column-b']"));


        Actions builder = new Actions(driver);
        builder.dragAndDrop(from,to).perform();
    }

    @AfterTest
    public void tearDown() {
        // Code to cleanup or release resources after running tests

    }
}