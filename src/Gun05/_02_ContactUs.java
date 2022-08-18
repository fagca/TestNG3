package Gun05;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends GenelWebDriver {


    @Test
    @Parameters("mesaj")
    void ContactUs(String gelenMesaj){

        WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
        contactUs.click();

        WebElement message = driver.findElement(By.id("input-enquiry"));
        message.sendKeys(gelenMesaj);

        WebElement submit = driver.findElement(By.cssSelector("[type=\"submit\""));
        submit.click();

        WebElement messageContactUs = driver.findElement(By.id("content"));
        System.out.println(messageContactUs.getText());
        Assert.assertTrue(messageContactUs.getText().contains("Contact"));


    }



}
