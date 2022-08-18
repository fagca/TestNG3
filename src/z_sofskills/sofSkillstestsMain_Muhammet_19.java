package z_sofskills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sofSkillstestsMain_Muhammet_19 extends TestCasesGroup3Genel{

    @Test
    void attendance(){

        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='ATTENDANCE']")));
        WebElement btn= driver.findElement(By.xpath("//span[text()='ATTENDANCE']"));
        btn.click();

        By present = By.cssSelector(".apexcharts-legend-series>span+span");

        wait.until(ExpectedConditions.stalenessOf(driver.findElement(present)));
        WebElement deger= driver.findElement(present);
        int cevirme = Integer.parseInt(deger.getText().replaceAll("[^0-9]",""));
        System.out.println(cevirme);
        Assert.assertTrue(cevirme>0);

    }
}
