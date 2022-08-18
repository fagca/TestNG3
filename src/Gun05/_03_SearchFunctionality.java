package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */

public class _03_SearchFunctionality extends GenelWebDriver {


    @Test
    @Parameters ("search")
    void search(String searchText){

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"form-control input-lg\"")));
        WebElement search = driver.findElement(By.cssSelector("[class=\"form-control input-lg\""));
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
}
