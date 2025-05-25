package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S04DragandDrop {
    WebDriver driver;
  @Test
  public void Testcasedraganddrop(){

      driver = new ChromeDriver();
      driver.get("https://the-internet.herokuapp.com/drag_and_drop");
      driver.manage().window().maximize();

      Actions actions = new Actions(driver);
      WebElement from = driver.findElement(By.id("column-a"));
      WebElement to = driver.findElement(By.id("column-b"));
      actions.dragAndDrop(from,to).build().perform();

    }
}
