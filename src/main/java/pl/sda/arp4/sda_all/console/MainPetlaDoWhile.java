package pl.sda.arp4.sda_all.console;

import java.util.Scanner;

public class MainPetlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Liczbę:");
        int liczba = scanner.nextInt();
        do {
            System.out.println((liczba) + ". Hello World");
            liczba--;
        } while (liczba > 0);
        // inkrementujaca
        System.out.println("Podaj Liczbę:");
        liczba = scanner.nextInt();
        int i = 0;
        do {
            System.out.println((i) + ". Hello World");
            i++;
        } while (i < liczba);
    }
}
