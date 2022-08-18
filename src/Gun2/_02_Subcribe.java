package Gun2;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
  3- Subscribe kısmını değiştir, ve kontrol et
 */

public class _02_Subcribe extends GenelWebDriver {

    By link = By.linkText("Newsletter");
    By yes = By.xpath("//input[@value=\"1\"]");
    By no = By.xpath("//input[@value=\"0\"]");
    By contin = By.xpath("//div//input[@type=\"submit\"]");


    @Test (priority = 1)
    void  subscribeNewsletter(){

        //   (//*[text()='Newsletter'])[2]



        WebElement newsletter = driver.findElement(link);
        newsletter.click();

        WebElement acceptYes = driver.findElement(yes);
        acceptYes.click();

        WebElement cont = driver.findElement(contin);
        cont.click();

        Tools.successMessageValidation();
    }

    @Test (priority = 2)
    void  unSubscribeNewsletter(){

        WebElement newsletter = driver.findElement(link);
        newsletter.click();

        WebElement acceptNo = driver.findElement(no);
        acceptNo.click();

        WebElement cont = driver.findElement(contin);
        cont.click();

        Tools.successMessageValidation();
    }

    @Test (priority = 3)
    void subscribeChange(){
        WebElement newsletter = driver.findElement(link);
        newsletter.click();

        WebElement acceptYes = driver.findElement(yes);

        WebElement acceptNo = driver.findElement(no);

            if (acceptYes.isSelected())
                acceptNo.click();
            else acceptYes.click();
        WebElement cont = driver.findElement(contin);
        cont.click();

        Tools.successMessageValidation();

    }

}
