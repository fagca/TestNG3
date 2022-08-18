package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {


    // @BeforeClass => her class çalışıyorken önce burası çalışır, örnek BasicStaticDirver

    // @BeforeMetod => Her metoddan (test metod) önce çalışır

        //@Test  => Benim, testlerin çalıştığım metodlar
        //@Test  => Benim, testlerin çalıştığı metodlar

    // @AfterMetod => Her metoddan (test metod) sonra çalışır

    // @AfterClass => her class çalışıyorken sonra burası çalışır


    @BeforeClass
    void beforeClass(){
        System.out.println("Her class dan önce çalışacak: BeforeClass");
    }

    @BeforeMethod
    void beforeMetod(){
        System.out.println("Her test metod dan önce çalışacak: BeforeMetod");
    }
    @AfterMethod
    void afterMetod(){
        System.out.println("Her test metod dan sonra çalışacak: AfterMetod");
    }

    @AfterClass
    void afterClass(){
        System.out.println("Her class dan sonra çalışacak: AfterClass");
    }

    @Test
    void test1(){
        System.out.println("Test1 çalıştı");
    }

    @Test
    void test2(){
        System.out.println("Test2 çalıştı");
    }






}
