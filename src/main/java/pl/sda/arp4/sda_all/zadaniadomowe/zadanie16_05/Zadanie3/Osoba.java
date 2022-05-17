package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie3;

public abstract class Osoba {
    public abstract void przedstawSie();
    protected String imie;
    protected String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

}
