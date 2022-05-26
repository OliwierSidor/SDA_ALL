package pl.sda.arp4.sda_all.zadaniadomowe.kalkulator;

public class Kalkulator {
    public double getWynik() {
        return wynik;
    }

    public void setWynik(double wynik) {
        this.wynik = wynik;
    }

    private double wynik;

    public double zwrocOstatniWynik(double wynik) {
        return wynik;
    }

    public double dodaj(double LiczbaA, double liczbaB) {
        return LiczbaA + liczbaB;
    }

    public double odejmij(double LiczbaA, double liczbaB) {
        return LiczbaA - liczbaB;
    }

    public double pomnoz(double LiczbaA, double liczbaB) {
        return LiczbaA * liczbaB;
    }

    public double podziel(double LiczbaA, double liczbaB) {
        return LiczbaA / liczbaB;
    }
}
