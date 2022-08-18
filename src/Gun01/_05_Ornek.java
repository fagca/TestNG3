package Gun01;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _05_Ornek extends GenelWebDriver {


    @Test
    void loginTest(){

        WebElement login = driver.findElement(By.id("input-email"));
        login.sendKeys("cucumber_1@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("12345");

        WebElement click = driver.findElement(By.cssSelector("[value=\"Login\"]"));
        click.click();



    }



}
