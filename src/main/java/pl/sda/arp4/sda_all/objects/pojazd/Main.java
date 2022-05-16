package pl.sda.arp4.sda_all.objects.pojazd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RodzajPojazdu typ = null;

        for (RodzajPojazdu rodzaj : RodzajPojazdu.values()) {
            System.out.println(rodzaj);
        }

        do {
            System.out.println("Podaj rodzaj pojazdu: ");
            String rodzajString = scanner.next();

            try {
                // zamiast if/else dla wszystkich rodzajow i porownywac
                // mozemy zastosowac metode .valueOf ktora wygenerowana jest
                // dla kazdego typu wyliczeniowego enum.
                typ = RodzajPojazdu.valueOf(rodzajString.toUpperCase());

            } catch (IllegalArgumentException iae) {
                System.out.println("Wybrana opcja nie istnieje");
            }
        } while (typ == null);
        System.out.println(typ);
    }
}

