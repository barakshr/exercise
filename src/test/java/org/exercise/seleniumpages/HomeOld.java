package org.exercise.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeOld extends BasePage {


    @FindBy(how = How.ID, using = "store.menu")
    WebElement d;


    public HomeOld click() {


//        WebElement men = getWebDriver().findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]"));
//        getActions().moveToElement(men).perform();
//
//        WebElement tops = men.findElement(By.xpath("//*[@id='ui-id-17']/span[2]"));
//        getActions().moveToElement(tops).perform();
//
//        WebElement jacets = men.findElement(By.xpath("//*[@id='ui-id-19']/span"));
//        jacets.click();

//        WebElement search = getWebDriver().findElement(By.xpath("//*[@id='search']"));
//        search.sendKeys("lando");
//        search.sendKeys(Keys.ENTER);


        List<WebElement> list = getWebDriver().findElements(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div[2]/ol/li"));
        //assert 1 item
        WebElement first = list.get(0);

        WebElement item = first.findElement(By.xpath("//div[@class='product details product-item-details']"));
        //small item
        getWebDriver().findElement(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li/div/div/div[3]/div[1]/div/div[1]")).click();
        //color
        getWebDriver().findElement(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li/div/div/div[3]/div[2]/div/div[1]")).click();

        //hover element
        getActions().moveToElement(first).perform();
        //add to cart
        first.findElement(By.xpath("//div/div/div[4]/div/div[1]/form/button/span")).click();

        //verify add to cart
        String countget = getWebDriver().findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]")).getText();

        //go details
        getWebDriver().findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
        getWebDriver().findElement(By.xpath("//*[@id='top-cart-btn-checkout']")).click();


        //email address
        getWebDriver().findElement(By.xpath("//*[@id='customer-email']")).sendKeys("bob@gmail.com");

        //firstname
        getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")).sendKeys("sfog");
        //lastname
        getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")).sendKeys("bob");

        //street
        getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys("soony");

        //city
        getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input")).sendKeys("tel aviv");

        //state
        WebElement select = getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select"));
        Select dropDownState = new Select(select);
        dropDownState.selectByValue("1");

        //zip
        getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input")).sendKeys("12345");


        //phone
        getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input")).sendKeys("057854150");

        //shipping:
        getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input")).click();

        //next
        getWebDriver().findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span")).click();
        return this;

    }

}
