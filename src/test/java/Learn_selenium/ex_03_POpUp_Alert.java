package Learn_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class ex_03_POpUp_Alert {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
    }

    @Test
    public  void alertTest(){

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
  String alertText = alert.getText();
        System.out.println(alertText);

//        alert.accept();
alert.dismiss();

    }


    @AfterTest
    public  void CloseBrowser(){
driver.quit();
    }
}

