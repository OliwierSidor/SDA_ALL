package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.tworzenieobiektu;

import java.time.LocalDate;

public class Pracownik {
    String imie;
    String nazwisko;
    Stanowisko stanowisko;
    String[] kwalifikacje;
    double zarobki;
    LocalDate poczatekPracy;

    public Pracownik(String imie, String nazwisko, Stanowisko stanowisko, String[] kwalifikacje, double zarobki, LocalDate poczatekPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.kwalifikacje = kwalifikacje;
        this.zarobki = zarobki;
        this.poczatekPracy = poczatekPracy;
    }
}
