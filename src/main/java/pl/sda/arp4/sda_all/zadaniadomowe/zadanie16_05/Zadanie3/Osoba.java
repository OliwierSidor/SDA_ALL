package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie3;

public abstract class Osoba {
    public abstract void przedstawSie();
    String imie;
    String nazwisko;
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
