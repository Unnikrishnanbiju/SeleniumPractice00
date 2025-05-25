package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.saucedemo.pages.BasePage.driver;

public class Selenium03 {
    WebDriver driver ;
    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void test_makeMytrip(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        //This will close
        WebElement model = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
 model.click();
        WebElement fromCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"fromCity\"]")));
// WebElement fromCity = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));

 Actions actions = new Actions(driver);
 actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

// Wait for the option to be clickable and then click on it
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Chandigarh, India']")));
        option.click();

    }



//   @AfterTest
//    public void tearDown(Thread thread){
//
//       driver.quit();
//    }
}
