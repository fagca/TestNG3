package Gun2;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _03_EditAccount_Metod extends GenelWebDriver {

    @Test
    void EditAccount(){

        editAccount("Ahmet","Demir");
        editAccount("İsmet","Temur");

    }



    void editAccount(String ad, String soyad)
    {

        WebElement edit = driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys(ad);

        WebElement lasttName = driver.findElement(By.id("input-lastname"));
        firstName.clear();
        firstName.sendKeys(soyad);

        WebElement cntBtn = driver.findElement(By.cssSelector("input[value='Continue']"));
        cntBtn.click();

        Tools.successMessageValidation();


    }
}
