package Learn_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex_09_File_Upload {

    ChromeDriver driver;

    @BeforeTest
    public void setup() {
        // Set up ChromeDriver

        driver = new ChromeDriver();


    }

    @Test
    public void testExample() {
        // Test code here

    }

    @AfterTest
    public void tearDown() {

    }
}