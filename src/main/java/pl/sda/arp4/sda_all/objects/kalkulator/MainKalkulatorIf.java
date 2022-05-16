package pl.sda.arp4.sda_all.objects.kalkulator;

import java.util.Scanner;

public class MainKalkulatorIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        int wynik;
        System.out.println("Podaj pierwszą liczbę: ");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("Podaj pierwszą drugą: ");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Wybież działanie matematyczne (dodaj/odejmij/pomnoz/podziel:");
        String dzialanie = scanner.next();
        if ("dodaj".equals(dzialanie)) {
            wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("odejmij".equals(dzialanie)) {
            wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("pomnoz".equals(dzialanie)) {
            wynik = kalkulator.pomnoz(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("podziel".equals(dzialanie)) {
            try {
                //try - blok kodu w ktorym moze wystapic bład
                wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
            } catch (ArithmeticException nazwaZmiennejWyjatku) {
                //cach - blok ktory wywola sie tylko jesli wystapi blad i go zlapiemy
                System.out.println("Nie można dzielić przez zero!");
            }
        } else {
            System.out.println("Nie poprawna komenda!");
        }
    }
}
