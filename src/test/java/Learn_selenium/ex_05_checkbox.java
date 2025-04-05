package Learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ex_05_checkbox {


    ChromeDriver driver;
    @BeforeTest
    public void BeforeTest(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

    }


    @Test
    public  void TestCheckbox(){
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[1]"));

    if(!checkboxes.isEmpty()){
        checkboxes.get(0).click();
    }


    }
    @AfterTest
    public void closeBrowser() {

    }
}
