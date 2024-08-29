package org.exercise.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SiteBasePage extends BasePage{

    @FindBy(how = How.XPATH, using = "//div[@class='minicart-wrapper']/a")
    WebElement cartIcon;


    public TopBar goToTopBar(){
        return new TopBar();
    }

    public Search GoToSearch(){
        return new Search();
    }

    public CartPreview  goToCartIcon(){
       cartIcon.click();
        return new CartPreview();
    }
}
