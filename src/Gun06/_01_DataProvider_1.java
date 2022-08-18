package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider_1 {

    //diğer yöntemi çağırmanın

    @Test (dataProvider="userlar")
    void UserNameTest2(String username)
    {
        System.out.println("username = " + username);
    }

    @DataProvider (name = "userlar")
    public Object[] getData2(){

        Object[] data = {"Nurhayat","Alper","Uğur","Hakan"};

    return data;
    }
}
