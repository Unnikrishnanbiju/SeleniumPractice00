import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCheckup {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://Google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
