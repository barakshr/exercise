package org.exercise.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPreview  extends SiteBasePage{


    ///html/body/div[2]/header/div[2]/div[1]/a/span[2]
    @FindBy(how = How.XPATH, using = "//button[@id='top-cart-btn-checkout']")
    WebElement checkout;

    public CheckOut clickCheckoutButton() throws InterruptedException {
        checkout.click();
        return new CheckOut();
    }
}
