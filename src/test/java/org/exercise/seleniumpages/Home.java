package org.exercise.seleniumpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class Home extends  SiteBasePage{

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]")
    WebElement menSelection;

    public Home waitForLoad(int sec){
        getElementWait().waitForClickable(menSelection, Duration.ofSeconds(sec));
        return this;
    }
}
