package pl.sda.arp4.sda_all.console;

import java.util.Scanner;

public class MainPorownajImie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scanner.nextLine();
        if (imie.equalsIgnoreCase("Marian")) {
            System.out.println("Siema kolego! Dawno się nie widzieliśmy!");
        } else {
            System.out.println("Witaj " + imie);
        }
    }
}

