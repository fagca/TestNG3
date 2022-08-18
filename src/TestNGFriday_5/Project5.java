package TestNGFriday_5;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project5 extends _Project5_GenelWebDriver {


    @Test (priority = 1)

    void LoginTestPositive(){

        Project5_POM elements = new Project5_POM(driver);

        elements.login.sendKeys("ferhat@test.com");
        elements.password.sendKeys("123456");
        elements.click.click();
        Assert.assertTrue(elements.loginCheck.getText().equals("ferhat@test.com"));
        elements.logout.click();


    }

    @Test (priority = 2)
    void LoginTestNegative(){

        Project5_POM elements = new Project5_POM(driver);

        elements.loginMain.click();
        elements.login.sendKeys("ferhat1@test.com");
        elements.password.sendKeys("123456");
        elements.click.click();
        Assert.assertTrue(elements.negativeLoginText.getText().contains("unsuccessful"));
        Assert.assertTrue(elements.negativeCustomerText.getText().contains("No customer"));
        elements.login.clear();
    }


    @Test (priority = 3)
    void PlaceAnOrder() {

        Project5_POM elements = new Project5_POM(driver);

        elements.login.sendKeys("ferhat@test.com");
        elements.password.sendKeys("123456");
        elements.click.click();
        Assert.assertTrue(elements.loginCheck.getText().equals("ferhat@test.com"));


        elements.addChart2.click();
        elements.shoppingCardBtn.click();
        elements.agrebox.click();
        elements.checkout1.click();
        elements.cnt1.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt2));
        elements.cnt2.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt3));
        elements.cnt3.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt4));
        elements.cnt4.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt5));
        elements.cnt5.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt6));
        elements.cnt6.click();
        wait.until(ExpectedConditions.urlContains("completed"));
        Assert.assertTrue(elements.success.getText().contains("successfully"));

    }

    }






