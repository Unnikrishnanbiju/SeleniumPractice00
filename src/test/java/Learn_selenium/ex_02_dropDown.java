package Learn_selenium;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ex_02_dropDown {


        ChromeDriver driver;
       @BeforeTest
       public void openBrowser() {
           driver = new ChromeDriver();
          driver.get("https://the-internet.herokuapp.com/dropdown");
        }



        @Test
    public void DropDown() {

            driver.get("https://the-internet.herokuapp.com/dropdown");
            driver.manage().window().maximize();

            WebElement element = driver.findElement(By.id("dropdown"));
            Select select = new Select(element);
            select.selectByVisibleText("Option 2");

//            //Spice jet
//            driver.get("https://www.spicejet.com/");
//            driver.manage().window().maximize();
//            WebElement element = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"));
//
       }

            @AfterTest
            public void closeWindow () {
driver.quit();
            }

        }





