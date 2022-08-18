package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Itertor {



    @Test(dataProvider="getData")
    void UserNameTest(String username)
    {
        System.out.println("username = " + username);
    }

    @DataProvider
    public Iterator<Object> getData(){

        List<Object> data = new ArrayList<>();
        data.add("Nurhayat");
        data.add("Alper");
        data.add("Uğur");
        data.add("Hakan");



        return data.iterator();
    }


    /************************************/


    @Test(dataProvider="getData2")
    void UserNameTest2(String username, String password)
    {
        System.out.println("username = " + username+" password: "+password);
    }

    @DataProvider
    public Iterator<Object[]> getData2(){

        List<Object[]> data = new ArrayList<>();
        data.add(new Object[] {"Nurhayat","sdfds232"});
        data.add(new Object[] {"Alper","sdfds232"});
        data.add(new Object[] {"Uğur","sdfds232"});
        data.add(new Object[] {"Hakan","sdfds232"});

        return data.iterator();
    }


}
