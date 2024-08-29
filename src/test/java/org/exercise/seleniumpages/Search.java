package org.exercise.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class Search extends  BasePage{

    @FindBy(how = How.XPATH, using = "//*[@id='search']")
    WebElement searchBar;



    public SearchResults searchItem(String name){
        searchBar.sendKeys(name);
        searchBar.sendKeys(Keys.ENTER);
        return new SearchResults();
    }





}
