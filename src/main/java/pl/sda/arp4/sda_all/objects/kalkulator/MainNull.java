package pl.sda.arp4.sda_all.objects.kalkulator;

import java.util.Scanner;

public class MainNull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        // double (typ prymitywny) (tylko liczba)
        // Double (typ obiektowy/zlozony/klasowy)
        // int -> Integer (typ obiektowy/zlozony/klasowy dla int)


        Integer wynik = null;

        System.out.println("Podaj pierwszą liczbę: ");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("Podaj pierwszą drugą: ");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Wybież działanie matematyczne (dodaj/odejmij/pomnoz/podziel:");
        String dzialanie = scanner.next();
        switch (dzialanie) {
            case "dodaj":
                wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
//                System.out.println("Wynik = " + wynik);
                break;
            case "odejmij":
                wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
//                System.out.println("Wynik = " + wynik);
                break;
            case "pomnoz":
                wynik = kalkulator.pomnoz(liczbaPierwsza, liczbaDruga);
//                System.out.println("Wynik = " + wynik);
                break;
            case "podziel":
                try {
                    //try - blok kodu w ktorym moze wystapic bład
                    wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
//                    System.out.println("Wynik = " + wynik);
                } catch (ArithmeticException nazwaZmiennejWyjatku) {
                    //cach - blok ktory wywola sie tylko jesli wystapi blad i go zlapiemy
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            default:
                System.out.println("Nie poprawna komenda!");
        }
        if (wynik != null) {
            System.out.println("Wynik = " + wynik);
        }
    }
}


