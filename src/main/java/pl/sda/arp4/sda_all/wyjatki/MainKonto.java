package pl.sda.arp4.sda_all.wyjatki;

public class MainKonto {
    public static void main(String[] args) {
        Konto k = new Konto();
        double ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);

        k.przelewPrzychodzacy(500);

        try {
            k.wykonajPrzelew(1000);
            System.out.println("Sukces przelewu");

        } catch (SrodkinaKoncieExeption e) {
            System.out.println(e.getMessage());
        }

        ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);
    }
}
