package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Random;
import java.util.Scanner;

public class MainZaDuzoZaMalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wylosowanaLiczba = new Random().nextInt(100);
        int wybranaLiczba;

        do {
            System.out.println("Podaj liczbę: ");
            wybranaLiczba = scanner.nextInt();

            if (wybranaLiczba > wylosowanaLiczba) {
                System.out.println("Podałeś za dużą liczbę");
            } else if (wybranaLiczba < wylosowanaLiczba) {
                System.out.println("Podałeś za małą liczbę");
            } else {
                System.out.println("Gratulacje");
            }
        } while (wybranaLiczba != wylosowanaLiczba);
    }
}