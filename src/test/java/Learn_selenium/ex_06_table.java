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
//        driver.get("https://awesomeqa.com/webtable.html");
        driver.get("https://demoqa.com/webtables");

        driver.manage().window().maximize();
    }

    @Test
    public void Table(){

        //rows and columns in table
//        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
//        System.out.println(row);
//

        int row = driver.findElements(By.xpath("//div[@role='grid']/following-sibling::/")).size();
        System.out.println(row);

//        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
//        System.out.println(col);


        //x path of table

//        String first_part = "//table[@id='customers']/tbody/tr[";
//        String second_part = "]/td[";
//        String third_part = "]";
//
//        for (int i = 2; i <=row ; i++) {
//            for (int j = 1; j <=col ; j++) {
//               String dynamic_path = first_part+i+second_part+j+third_part;
//                System.out.println(dynamic_path);
//            }\

//
//        }
        String first_part = "//table[@id='customers']/tbody/tr[";
        String second_part = "]/td[";
       String third_part = "]";

    }


    @AfterTest
    public void Close (){

    }
}
