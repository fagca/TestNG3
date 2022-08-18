package Gun07;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrderPOM extends GenelWebDriver {


    @Test
    void ProceedToCheckout(){

        _03_PlaceOrderElements elements = new _03_PlaceOrderElements(driver);

        wait.until(ExpectedConditions.elementToBeClickable(elements.searchBox)).sendKeys("ipod");
        elements.searchBtn.click();
        elements.addChart1.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cartCheck)).click();
        Tools.bekle(1);
        elements.checkOut.click();
        Tools.bekle(1);
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt1)).click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.lastcheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt5)).click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals("Your order has been placed!",elements.lastText2.getText(),"karşılaştırma sonucu");


    }
}
