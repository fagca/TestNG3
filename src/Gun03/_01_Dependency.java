package Gun03;

import org.testng.Assert;
import org.testng.annotations.Test;


/*
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.

 */

public class _01_Dependency {


    @Test
    void startCar(){
        System.out.println("Car started");


    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car driven");
        Assert.fail();  //diğerlerini skipped yapıyor

    }

    @Test (dependsOnMethods = {"startCar","driveCar"})
    void parkCar(){
        System.out.println("Car parked");

    }

    @Test(dependsOnMethods = {"parkCar","driveCar"}, alwaysRun = true) //her zaman çallışssın
    void stopCar(){
        System.out.println("Car stopped");

    }
}
