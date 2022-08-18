package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {


    @Test(dataProvider="getData")
    void UserNameTest(String username, String password)
    {
        System.out.println("username = " + username+" password: "+password);
    }

    @DataProvider
    public Object[][] getData(){

        Object[][] data ={
                {"Nurhayat","1231231"},
                {"Alper", "sdf23123"},
                {"Uğur", "zxc23"},
                {"Hakan","dsasdas123"}
                };

        return data;
    }
}
