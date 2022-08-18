package z_sofskills;

import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class softSkillstestsMain_Fevzi_26_27 extends TestCasesGroup3Genel {


    @Test
    void signOut() {
        WebElement menuList = driver.findElement(By.cssSelector("svg[class='svg-inline--fa fa-angle-down']"));
        menuList.click();

        Tools.bekle(1);

        WebElement signOutBtn = driver.findElement(By.xpath("//span[text()='Sign out']"));
        signOutBtn.click();
    }

      @Test
      void changePassword(){
          WebElement menuList = driver.findElement(By.cssSelector("svg[class='svg-inline--fa fa-angle-down']"));
          menuList.click();

          Tools.bekle(2);
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Change Password']")));
          WebElement changePassword = driver.findElement(By.xpath("//span[text()='Change Password']"));
          changePassword.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mat-input-2")));
          WebElement current = driver.findElement(By.cssSelector("#mat-input-2"));
          current.sendKeys("Techno123@");
          WebElement newPassword = driver.findElement(By.cssSelector("#mat-input-3"));
          newPassword.sendKeys("Techno123@");
          WebElement newPasswordRetry = driver.findElement(By.cssSelector("#mat-input-4"));
          newPasswordRetry.sendKeys("Techno123@");
      }

}
