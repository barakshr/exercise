package org.exercise.tests.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.exercise.seleniumpages.*;
import org.testng.annotations.Test;

public class Exec extends BaseTest {

    @Test
    public void test() throws Exception {

        Home home= new Home();
        home.waitForLoad(1)
                .goToTopBar()
                .hoverMen()
                .hoverTops()
                .selectJackets()
                .GoToSearch()
                .searchItem("lando")
                .chooseItem(1)
                .selectSize(SizesEnum.Large)
                .selectColor(ColorsEnum.Blue)
                .addItemToCart()
                .goToCartIcon()
                .clickCheckoutButton();
    }
}
