package pl.sda.arp4.sda_all.zadaniadomowe.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        double wynik = 0;
        boolean jestWynik = true;
        String dzialanie;

        do {
            System.out.println("Wybież działanie matematyczne (dodaj/odejmij/pomnoz/podziel/zwroc):");
            dzialanie = scanner.next();
            if ("zwroc".equalsIgnoreCase(dzialanie)) {
                System.out.println(kalkulator.zwrocOstatniWynik(wynik));
                continue;
            }

            System.out.println("Podaj pierwszą liczbę: ");
            double liczbaPierwsza = scanner.nextInt();

            System.out.println("Podaj pierwszą drugą: ");
            int liczbaDruga = scanner.nextInt();

            if ("dodaj".equals(dzialanie)) {
                wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
//                System.out.println("Wynik = " + wynik);
            } else if ("odejmij".equals(dzialanie)) {
                wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
//                System.out.println("Wynik = " + wynik);
            } else if ("pomnoz".equals(dzialanie)) {
                wynik = kalkulator.pomnoz(liczbaPierwsza, liczbaDruga);
//                System.out.println("Wynik = " + wynik);
            } else if ("podziel".equals(dzialanie)) {
                try {
                    wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
//                    System.out.println("Wynik = " + wynik);
                } catch (ArithmeticException nazwaZmiennejWyjatku) {
                    System.out.println("Nie można dzielić przez zero!");
                    jestWynik = false;
                }
            } else {
                System.out.println("Nie poprawna komenda!");
                jestWynik = false;
            }
            if (jestWynik) {
                System.out.println("Wynik = " + wynik);
            }
        } while (!dzialanie.equalsIgnoreCase("koniec"));
    }
}


