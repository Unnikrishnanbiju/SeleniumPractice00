package Learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex_06_table {
    ChromeDriver driver;
    @BeforeTest
    public void openBrowser(){
         driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();
    }

    @Test
    public void Table(){

        //rows and columns in table
        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        System.out.println(row);

        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
        System.out.println(col);
    }


    @AfterTest
    public void Close (){

    }
}
