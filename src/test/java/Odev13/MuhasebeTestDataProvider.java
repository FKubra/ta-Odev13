package Odev13;

import Odev5.Muhasebe;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MuhasebeTestDataProvider {

    Muhasebe muhasebe = new Muhasebe();

    @Test(groups = "PassTest", dataProvider = "maasData")
    public void maasHesaplaTest(int x, int y){
        assertEquals(muhasebe.maasHesapla(x), y);
    }

    @DataProvider(name = "maasData")
    public Object[][] maasData(){
        return new Object[][]{{5,2500},{10,5000}};

    }

}
