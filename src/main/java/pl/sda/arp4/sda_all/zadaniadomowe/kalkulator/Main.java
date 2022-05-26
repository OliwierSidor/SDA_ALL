package pl.sda.arp4.sda_all.zadaniadomowe.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        boolean jestWynik = true;
        String dzialanie;

        do {
            System.out.println("Wybież działanie matematyczne (dodaj/odejmij/pomnoz/podziel/zwroc):");
            dzialanie = scanner.next();
            if ("zwroc".equalsIgnoreCase(dzialanie)) {
                System.out.println("Poprzedni wynik to: " + kalkulator.zwrocOstatniWynik(kalkulator.getWynik()));
                continue;
            }

            System.out.println("Podaj pierwszą liczbę: ");
            double liczbaPierwsza = scanner.nextInt();

            System.out.println("Podaj drugą drugą: ");
            int liczbaDruga = scanner.nextInt();

            if ("dodaj".equals(dzialanie)) {
                kalkulator.setWynik(kalkulator.dodaj(liczbaPierwsza, liczbaDruga));
            } else if ("odejmij".equals(dzialanie)) {
                kalkulator.setWynik(kalkulator.odejmij(liczbaPierwsza, liczbaDruga));
            } else if ("pomnoz".equals(dzialanie)) {
                kalkulator.setWynik(kalkulator.pomnoz(liczbaPierwsza, liczbaDruga));
            } else if ("podziel".equals(dzialanie)) {
                try {
                    kalkulator.setWynik(kalkulator.podziel(liczbaPierwsza, liczbaDruga));
                } catch (ArithmeticException nazwaZmiennejWyjatku) {
                    System.out.println("Nie można dzielić przez zero!");
                    jestWynik = false;
                }
            } else {
                System.out.println("Nie poprawna komenda!");
                jestWynik = false;
            }
            if (jestWynik) {
                System.out.println("Wynik = " + kalkulator.getWynik());
            }
        } while (!dzialanie.equalsIgnoreCase("koniec"));
    }
}


