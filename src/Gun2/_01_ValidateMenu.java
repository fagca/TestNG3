package Gun2;

/*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends GenelWebDriver {

    @Test
    void menuValidation(){


        List<String> menuExpectedList = new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"col-sm-3\"]//child::h5[text()=\"Information\"]")));

        By menuFinder = By.cssSelector("ul[class='nav navbar-nav']>li");
        List<WebElement> menuActualList = driver.findElements(menuFinder);

        for (WebElement w: menuActualList
             ) {
            System.out.println(w.getText());

        }

        Tools.compareToList(menuExpectedList,menuActualList);















    }


}
