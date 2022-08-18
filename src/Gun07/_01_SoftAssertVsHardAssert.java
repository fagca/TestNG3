package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {

    @Test
    void hardAssert(){
        String s1 = "Merhaba";

        System.out.println("Hard Assert öncesi");
        Assert.assertEquals("Merhaba 123",s1,"HardAssertSonuc");
        System.out.println("Hard Assert sonrası"); //hardassert çalıştığında sonrası çallışmaz
    }

    @Test
    void softAssert(){
        String strHomepage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String strEditAccountPage = "www.facebook.com/editAccountpage";

        SoftAssert _softAssert = new SoftAssert();
        _softAssert.assertEquals("www.facebook.com/homepage",strHomepage); //doğru
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile",strCartPage); //yanlış
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/setting",strEditAccountPage); //yanlış
        System.out.println("assert 3");

        _softAssert.assertAll();
        System.out.println("aktiflik sonrası");




    }
}
