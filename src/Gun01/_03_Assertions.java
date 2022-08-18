package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
    // Yeşi tik testte hata yok
    // sarı çarpı işareti: testte hata var
    // beyaz : test çalıştırılmadı (skip)


    @Test
    void EqualOrnek(){
        String s1 = "Merhaba";
        String s2 = "İyi akşamlar";

        Assert.assertEquals(s1,s2,"Krşılaştırma Sonucu");
    }

    @Test
    void notEqualOrnek(){
        String s1 = "Merhaba";
        String s2 = "İyi akşamlar";

        Assert.assertNotEquals(s1,s2,"Karşılaştırma Sonucu");
    }

    @Test
    void TrueOrnek(){
        int s1 = 55;
        int s2 = 55;

        Assert.assertTrue(s1==s2,"Karşılaştırma Sonucu");
    }


    @Test
    void nullOrnek(){
        String s1 = null;


        Assert.assertNull(s1,"Karşılaştırma Sonucu");
    }


    @Test
    void directFail(){
        int a = 55;
        if (a ==55)
        Assert.fail();
    }
}
