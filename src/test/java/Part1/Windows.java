package Part1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;
import Learn_selenium.CommonToAll;

public class Windows extends CommonToAll {

 @Test
 public void test_windows(){

     String URL = "https://the-internet.herokuapp.com/windows";
     driver.get(URL);
     driver.manage().window().maximize();

     String parent = driver.getWindowHandle();
     System.out.println(parent);

     WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
     link_parent.click();

     Set<String> windowHandles = driver.getWindowHandles();
     System.out.println(windowHandles);

     driver.switchTo().window(parent);
 }
    }

