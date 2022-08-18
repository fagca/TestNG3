package Gun08;

/*
    Senaryo ;
    1- Siteye gidiniz..
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */

import Utils.GenelWebDriver;
import Utils.ParametreliWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_WishList extends GenelWebDriver {

    @Test
    @Parameters("search")
    void searchCheck(String searchText){

        _02_WishListElements elements = new _02_WishListElements(driver);

        wait.until(ExpectedConditions.urlContains("account"));
        elements.search.sendKeys(searchText);
        elements.searchBtn.click();

     //  int rasgtele = (int)(Math.random()*4);
     //  System.out.println(rasgtele);
     //  elements.searchResults.get(rasgtele).click();

        int rndNumber = Tools.RandomGenerator(elements.searchResults.size());

        String rndUrunAd = elements.searchResults.get(rndNumber).getText();
        elements.wishBtnList.get(rndNumber).click();
        Tools.bekle(1);
        elements.btnWish.click();



        boolean bulundu = false;
        for (WebElement e: elements.tableNames ) {
            if (e.getText().equals(rndUrunAd))
            {
                bulundu = true;
                break;
            }
        }

        Assert.assertTrue(bulundu);


    }

}
