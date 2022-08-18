package Gun07;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

public class _02_PlaceOrder extends GenelWebDriver {

    @Test
    void ProceedToCheckout(){

        WebElement searchBox =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"form-control input-lg\"")));
        searchBox.clear();
        searchBox.sendKeys("ipod");

        WebElement searchBtn = driver.findElement(By.cssSelector("[class=\"btn btn-default btn-lg\""));
        searchBtn.click();

        WebElement addChart1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=\"Add to Cart\"])[1]")));
        addChart1.click();

        Tools.bekle(1);

        WebElement cartCheck =  wait.until(ExpectedConditions.elementToBeClickable(By.id("cart-total")));
        cartCheck.click();

        WebElement checkOut =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href=\"https://opencart.abstracta.us:443/index.php?route=checkout/checkout\"])[1]")));
        checkOut.click();

        WebElement cnt1 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-payment-address")));
        cnt1.click();

        WebElement cnt2 =  wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        cnt2.click();

        WebElement cnt3 =  wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        cnt3.click();

        WebElement lastcheckbox =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type=\"checkbox\"")));
        lastcheckbox.click();

        WebElement cnt4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        cnt4.click();

        WebElement cnt5 =  wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm")));
        cnt5.click();

        wait.until(ExpectedConditions.urlContains("success"));
        WebElement lastText2 = driver.findElement(By.cssSelector("[id=\"content\"]>h1"));
        Assert.assertEquals("Your order has been placed!",lastText2.getText(),"karşılaştırma sonucu");


    }
}
