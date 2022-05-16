package pl.sda.arp4.sda_all.console;

import java.util.Scanner;

public class MainDoWhileZadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do {
            System.out.println("Podaj Liczbę:");
            liczba = scanner.nextInt();
            if (liczba > 0) {
                System.out.println("Hello World");
            }
        } while (liczba > 0);
    }
}
