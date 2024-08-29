package org.exercise.seleniumpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class TopBar extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]")
    WebElement menSelection;

    @FindBy(how = How.XPATH, using = "//*[@id='ui-id-17']/span[2]")
    WebElement topSelection;

    @FindBy(how = How.XPATH, using = "//*[@id='ui-id-19']/span")
    WebElement jacketsSelection;

    public TopBar hoverMen() {
        getActions().moveToElement(menSelection).perform();
        return this;
    }

    public TopBar hoverTops() {
        getActions().moveToElement(topSelection).perform();
        return this;
    }

    public Jackets selectJackets() {
        jacketsSelection.click();
        return new Jackets();
    }



}
