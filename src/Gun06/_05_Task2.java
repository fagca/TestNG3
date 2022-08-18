package Gun06;

import Utils.GenelWebDriver;
import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
 * sonrasında fakrlı tarayıcılar ile çalıştırınız.
 * sonrasında paralel çalıştırınız.
 */

public class _05_Task2 extends ParametreliWebDriver {


    @Test (dataProvider = "search")
    void searchFunction(String searchText){

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"form-control input-lg\"")));
        WebElement search = driver.findElement(By.cssSelector("[class=\"form-control input-lg\""));
        search.clear();
        search.sendKeys(searchText);

        WebElement searchBtn = driver.findElement(By.cssSelector("[class=\"fa fa-search\""));
        searchBtn.click();

        List<WebElement> index = driver.findElements(By.cssSelector("h4 a"));
        for (WebElement w: index
        )
        {
            System.out.println(w.getText());
            Assert.assertTrue(w.getText().toLowerCase().contains(searchText));
        }

    }

    @DataProvider(name = "search")
    public Object[] getdata3(){

        Object[] data = {"mac","ipod","samsung"};

        return data;

    }



}
