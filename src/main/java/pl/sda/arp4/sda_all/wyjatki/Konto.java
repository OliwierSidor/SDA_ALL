package pl.sda.arp4.sda_all.wyjatki;


public class Konto {
    private double iloscSrodkow;

    public double podajIloscSrodkow() {
        return iloscSrodkow;
    }
    public void wykonajPrzelew(double kwota1)throws SrodkinaKoncieExeption{
        if (iloscSrodkow < kwota1){
            throw new SrodkinaKoncieExeption("Błąd, brak środków na koncie!");
        }
        iloscSrodkow = iloscSrodkow - kwota1;
    }

    public void przelewPrzychodzacy(double kwota2){

        iloscSrodkow = iloscSrodkow + kwota2;
    }
}

