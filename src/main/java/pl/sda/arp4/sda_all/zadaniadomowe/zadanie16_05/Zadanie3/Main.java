package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("czy jesteś żołnierzem: (tak/nie)");
        String czyZolniez = scanner.nextLine().toUpperCase();
        Osoba osoba;
        if (czyZolniez.equals("TAK")) {
            System.out.println("jakiej rangi jesteś żołnierzem?");
            String ranga = scanner.nextLine().toUpperCase();
            Ranga podanaRanga = Ranga.valueOf(ranga);
            Żołnierz żołnierz = new Żołnierz();
            żołnierz.setRanga(podanaRanga);
            osoba = żołnierz;
        } else {
            osoba = new Cywil();
        }
        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        osoba.setImie(imie);
        osoba.setNazwisko(nazwisko);
        osoba.przedstawSie();
    }
}
