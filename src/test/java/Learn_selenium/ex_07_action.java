import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex_07_action {

 WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("ChromeDriver setup and browser maximized");

    }

    @Test
    public void testExample() {
        // Test code here
        System.out.println("Test code execution here");
        // Assertions or verification code here
    }

    @AfterTest
    public void tearDown() {
        // Code to cleanup or release resources after running tests
        System.out.println("Cleanup or resource release code here");
    }
}