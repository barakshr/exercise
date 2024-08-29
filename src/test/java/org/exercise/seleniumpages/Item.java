package org.exercise.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Item extends SiteBasePage {

    @FindBy(how = How.XPATH, using = "//div/div/div[4]/div/div[1]/form/button/span")
    WebElement addItemToCartButton;

    private final WebElement itemElement;


    public Item(WebElement itemElement) {
        this.itemElement = itemElement;
    }

    public Item selectSize(SizesEnum size) {
        String sizeLocator = String.format("//div[@aria-label='%s']", size.getSize());

        //   itemElement.findElement(By.xpath("//div/div/div[3]/div[1]/div/div[1]")).click();
        WebElement sizes = itemElement.findElement(By.xpath("//div/div/div[3]/div[1]/div"));
        sizes.findElement(By.xpath(sizeLocator)).click();
        return this;
    }

    public Item selectColor(ColorsEnum color) {
        String colorLocator = String.format("//div[@aria-label='%s']", color.toString());
        WebElement colors = itemElement.findElement(By.xpath("//div/div/div[3]/div[2]/div"));
        colors.findElement(By.xpath(colorLocator)).click();
        return this;
    }


    public Item addItemToCart() {
        addItemToCartButton.click();
        return this;
    }


}
