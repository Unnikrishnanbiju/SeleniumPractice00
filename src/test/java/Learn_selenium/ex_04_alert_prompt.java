package Learn_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex_04_alert_prompt {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
    }

    @Test
    public void popUp() {
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);

        alert.sendKeys("Hello , Good morning");
        alert.accept();
    }

    @AfterTest
    public void closeBrowser(){
//        driver.quit();
    }

}
