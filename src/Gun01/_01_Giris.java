package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {





    @Test (priority = 1) //annotation deniyor, bilgi ekleme
    void webSitesiniAc(){
        System.out.println("Driver tanımlandı ve web sitesi açıldı");

    }

    @Test (priority = 2)
    void loginTestIsleminiYap(){
        System.out.println("login test işlemi yapıldı");
        //YESİL TİCK HATALI ASSERTİON YOK DEMEKTİR
        //sıralaması verilmemişse alfabetiktir

    }

    @Test (priority = 3)
    void driveriKapat(){
        System.out.println("driver kapatıldı ve çıkıldı");

    }
}
