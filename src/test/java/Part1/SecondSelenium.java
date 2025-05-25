package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.net.URL;

public class SecondSelenium {

    @Test
    public void testSelenium() {
        WebDriver driver = new ChromeDriver();

        //Action
        //MOve to Element
        //click
        //sendKeys
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

//        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"));
//        dropDown.click();
//
//        Select dropdown = new Select(dropDown);
//        dropdown.selectByIndex(3);
        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

Actions actions = new Actions(driver);

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

        driver.quit();
    }
}