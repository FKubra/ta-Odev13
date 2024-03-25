package Odev13;

import Odev5.Muhasebe;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MuhasebeTestNG {

    Muhasebe muhasebe = new Muhasebe();

    @Test(groups = "PassTests")
    public void maasHesaplaTest() {
        assertEquals(muhasebe.maasHesapla(5),2500);
    }

    @Test(groups = "FailTests")
    public void maasHesaplaTestHata() {
        assertEquals(muhasebe.maasHesapla(10),1000);

    }

}

