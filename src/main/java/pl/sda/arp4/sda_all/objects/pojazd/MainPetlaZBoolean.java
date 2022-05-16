package pl.sda.arp4.sda_all.objects.pojazd;

import java.util.Scanner;

public class MainPetlaZBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RodzajPojazdu zmienna = null;

        for (RodzajPojazdu rodzaj : RodzajPojazdu.values()) {
            System.out.println(rodzaj);
        }
        boolean czyUstawiona = false;
        while (!czyUstawiona) {
            System.out.println("Podaj rodzaj pojazdu: ");
            String rodzajString = scanner.next();

            try {
                // zamiast if/else dla wszystkich rodzajow i porownywac
                // mozemy zastosowac metode .valueOf ktora wygenerowana jest
                // dla kazdego typu wyliczeniowego enum.
                zmienna = RodzajPojazdu.valueOf(rodzajString.toUpperCase());

                czyUstawiona = true;
                System.out.println(zmienna);

            } catch (IllegalArgumentException iae) {
                System.out.println("Wybrana opcja nie istnieje");
            }
        }
    }
}

