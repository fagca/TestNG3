package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_DataProvider {

    /**
     * Aşağıdaki ikili ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılır, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     * Dataprovider bir testi birden fazla DATA ile çok çalıştırmak için kullanılır.
     * XML filer file gruplama, pararalel, ve farklı tesleri koordine edip birarada çalıştırmak için kullanılır.
     */



    @Test (dataProvider="getData")
    void UserNameTest(String username)
    {
        System.out.println("username = " + username);
    }

    @DataProvider
    public Object[] getData(){

        Object[] data = {"Nurhayat","Alper","Uğur","Hakan"};

    return data;
    }
}
