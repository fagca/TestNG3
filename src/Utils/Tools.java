package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void compareToList(List<String> menuExpectedList, List<WebElement> menuActualList){

        for (int i = 0; i < menuExpectedList.size();i++)
            Assert.assertEquals(menuExpectedList.get(i),menuActualList.get(i).getText(),"Karşılaştırma Sonucu");

    }

    public static void successMessageValidation(){

        WebElement yesiyazi = GenelWebDriver.driver.findElement(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]"));
        Assert.assertTrue(yesiyazi.getText().toLowerCase().contains("success"));
    }

    public static void bekle(int Saniye) {
        try {
            Thread.sleep(Saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static double WebElementToDouble(WebElement e){

        String result = e.getText();
        result = result.replaceAll("[^ \\d]","");

        return Double.parseDouble(result);
    }

    public static int RandomGenerator(int max){


        return (int)(Math.random()*max);
    }


}
