package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.baseTest;

public class ProductsTest extends baseTest {

    @Test
    public void testProductionsHeaderIsDisplayed(){
       ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeadedDispalyed(),"\n Products Header is Not Displayed \n");

    }
}
