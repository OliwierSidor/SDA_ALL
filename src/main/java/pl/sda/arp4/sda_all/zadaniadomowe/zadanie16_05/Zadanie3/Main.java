package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.next();
        System.out.println("czy jesteś żołnierzem: (tak/nie)");
        String czyZolniez = scanner.next().toUpperCase();
        Osoba osoba;

        if (czyZolniez.equals("TAK")) {
            System.out.println("jakiej rangi jesteś żołnierzem?" + Arrays.toString(Ranga.values()));
            String ranga = scanner.next().toUpperCase();
            Ranga podanaRanga = Ranga.valueOf(ranga);
            osoba = new Żołnierz(imie, nazwisko, podanaRanga);
        } else {
            osoba = new Cywil(imie, nazwisko);
        }
        osoba.przedstawSie();
    }
}
