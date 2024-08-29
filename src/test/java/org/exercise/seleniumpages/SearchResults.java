package org.exercise.seleniumpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchResults extends SiteBasePage {

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/main/div[3]/div[1]/div[2]/div[2]/ol/li")
    List<WebElement> results;

    public Item chooseItem(int itemNumber) {
        WebElement first = results.get(--itemNumber);
        return new Item(first);
    }



}
