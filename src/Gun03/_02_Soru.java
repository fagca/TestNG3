package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.
 */

public class _02_Soru extends GenelWebDriver {




    @Test
    void adressEkle(){

        WebElement adressBook = driver.findElement(By.linkText("Address Book"));
        adressBook.click();

        WebElement adressBookBtn = driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]"));
        adressBookBtn.click();

        WebElement firstName = driver.findElement(By.cssSelector("[name=\"firstname\"]"));
        firstName.sendKeys("ferhat");

        WebElement lastName = driver.findElement(By.cssSelector("[name=\"lastname\"]"));
        lastName.sendKeys("agca");

        WebElement company = driver.findElement(By.cssSelector("[name=\"company\"]"));
        company.sendKeys("altek");

        WebElement adress1 = driver.findElement(By.cssSelector("[name=\"address_1\"]"));
        adress1.sendKeys("beylikduzu");

        WebElement city = driver.findElement(By.cssSelector("[name=\"city\"]"));
        city.sendKeys("istanbul");

        WebElement postCode = driver.findElement(By.cssSelector("[name=\"postcode\"]"));
        postCode.sendKeys("34000");

    //  int randomNum =(int) (Math.random()*254);
    //  WebElement country = driver.findElement(By.xpath("//select[@name=\"country_id\"]//child::option["+randomNum+ "]"));
    //  country.click();


    //  WebElement region = driver.findElement(By.xpath("//select[@name=\"zone_id\"]//child::option[2]"));
    //  bekle(1);
    //  region.click();

   //  WebElement country=driver.findElement(By.id("input-country"));
   //  Select countryS=new Select(country);
   //  countryS.selectByVisibleText("United States");

   //  WebElement State=driver.findElement(By.id("input-zone"));
   //  Select state=new Select(State);
   //  state.selectByVisibleText("California");



        WebElement country=driver.findElement(By.id("input-country"));
        Select countryS=new Select(country);
        countryS.selectByIndex(10);

        WebElement State=driver.findElement(By.id("input-zone"));
        Select state=new Select(State);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),state.getOptions().size()));

        System.out.println(state.getOptions().size());

        State = driver.findElement(By.id("input-zone"));
        state = new Select(State);



     // System.out.println(state.getOptions().size());

     // for (WebElement w: state.getOptions()
     //      ) {
     //     System.out.println(w.getText());

     // }

        state.selectByIndex(2);

        WebElement defaultAddress=driver.findElement(By.cssSelector("input[value='1']"));
        defaultAddress.click();


        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();




    }

      @Test (dependsOnMethods = {"adressEkle"})
      void adressEdit(){

          List<WebElement> editAll = driver.findElements(By.linkText("Edit"));
          WebElement sonEdit = editAll.get(editAll.size()-1);
          System.out.println(editAll.size());
          sonEdit.click();

          WebElement lastName = driver.findElement(By.cssSelector("[name=\"lastname\"]"));
          lastName.clear();
          lastName.sendKeys("agca2");

          WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
          ctn.click();


          wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
          //bu elemanın bayatlamış hali gidene kadar bekle


          WebElement country=driver.findElement(By.id("input-country"));
          Select countryS=new Select(country);
          countryS.selectByIndex(10);

          WebElement State=driver.findElement(By.id("input-zone"));
          Select state=new Select(State);
          wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),state.getOptions().size()));

          System.out.println(state.getOptions().size());

          State = driver.findElement(By.id("input-zone"));
          state = new Select(State);

          state.selectByIndex(2);

          WebElement defaultAddress=driver.findElement(By.cssSelector("input[value='1']"));
          defaultAddress.click();

          WebElement ctn2=driver.findElement(By.cssSelector("input[type='submit']"));
          ctn2.click();

          //Tools.successMessageValidation();

      }
      @Test (dependsOnMethods = {"adressEdit"})
      void adressDelete(){

          WebElement delete = driver.findElement(By.xpath("(//a[@class=\"btn btn-danger\"])[2]"));
          delete.click();

       // List<WebElement> editAll = driver.findElements(By.linkText("Edit"));
       // WebElement sonEdit = editAll.get(editAll.size()-1);
       // System.out.println(editAll.size());
       // sonEdit.click();





          Tools.successMessageValidation();
      }



      /*

    void addAddress(){

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        WebElement newAddress= driver.findElement(By.linkText("New Address"));
        newAddress.click();

        WebElement firsName=driver.findElement(By.id("input-firstname"));
        firsName.sendKeys("Ahmet");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Demir");

        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("Techno Study");

        WebElement address1=driver.findElement(By.id("input-address-1"));
        address1.sendKeys("21a London Road");

        WebElement address2=driver.findElement(By.id("input-address-2"));
        address2.sendKeys("RG2 5BJ");

        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("Reading");

        WebElement postCode=driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("12345");

        WebElement country=driver.findElement(By.id("input-country"));
        Select countryS=new Select(country);
        countryS.selectByVisibleText("Turkey");

        wait.until(ExpectedConditions.elementToBeClickable(country));
        // wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        //bu elemanın bayatlamış hali gidene kadar bekle

        WebElement State=driver.findElement(By.id("input-zone"));
        Select state=new Select(State);
        state.selectByIndex(10);

        WebElement defadres=driver.findElement(By.cssSelector("label [name='default'][value='1']"));
        defadres.click();

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();
    }

       */


}
