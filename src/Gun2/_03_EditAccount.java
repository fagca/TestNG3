package Gun2;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

/*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */

public class _03_EditAccount extends GenelWebDriver {

    By editClick = By.linkText("Edit Account") ;


    @Test (priority = 1)
    void editAccount (){

        WebElement editAccount = driver.findElement(editClick);
        editAccount.click();

        WebElement name = driver.findElement(By.id("input-firstname"));
        name.clear();
        name.sendKeys("sel_2");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("testng_2");

        WebElement cont = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
        cont.click();

        Tools.successMessageValidation();

    }

    @Test (priority = 2)
    void reEditAccount(){


        WebElement editAccount = driver.findElement(editClick);
        editAccount.click();

        WebElement name = driver.findElement(By.id("input-firstname"));
        name.clear();
        name.sendKeys("sel_1");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("testng");

        WebElement cont = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
        cont.click();

        Tools.successMessageValidation();

    }

}
