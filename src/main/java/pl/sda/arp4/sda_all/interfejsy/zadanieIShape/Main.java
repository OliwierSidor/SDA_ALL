package pl.sda.arp4.sda_all.interfejsy.zadanieIShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakiej figury geometrycznej checsz policzyc obwód i pole (KOLO, PROSTOKAT, KWADRAT): ");
        String ksztaltString = scanner.next().toUpperCase();
        IShape ksztalt = null;

        if (ksztaltString.equals("KOLO")) {
            System.out.println("Podaj promień: ");
            double podanyPromien = scanner.nextDouble();
            ksztalt = new Kolo(podanyPromien);

        } else if (ksztaltString.equals("PROSTOKAT")) {
            System.out.println("Podaj bok A: ");
            double podanyBokA = scanner.nextDouble();
            System.out.println("Podaj bok B: ");
            double podanyBokB = scanner.nextDouble();
            ksztalt = new Prostokat(podanyBokA, podanyBokB);

        } else if (ksztaltString.equals("KWADRAT")) {
            System.out.println("Podaj długość boku: ");
            double bokA = scanner.nextDouble();
            ksztalt = new Kwadrat(bokA);

        } else {
            System.out.println("Nie mozna obliczyc pola i obwodu dla podanej figury geometrycznej");
        }
        if (ksztalt != null) {
            System.out.println("Pole  to: " + ksztalt.obliczPole());
            System.out.println("Obwód to: " + ksztalt.obliczObwod());
        }
    }
}
