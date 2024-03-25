package Odev5;

public class Muhasebe {

    int gunlukUcret = 500;
    int maas;
    int prim;

    public int maasHesapla(int calisilanGun){
        if (calisilanGun <= 25){
            maas = calisilanGun * gunlukUcret;
            return maas;
        }
        else{
            prim = (1000 * (calisilanGun -25) );
            maas = (calisilanGun * gunlukUcret) + prim ;
            return maas;
        }


    }
}
