package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    private By productsHeader = By.xpath("//span[text()='Products']");

    public boolean isProductsHeadedDispalyed(){
        return find(productsHeader).isDisplayed();
    }

}
