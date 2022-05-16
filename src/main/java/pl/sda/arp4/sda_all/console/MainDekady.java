package pl.sda.arp4.sda_all.console;

import java.util.Scanner;

public class MainDekady {
    public static void main(String[] args) {
        System.out.println("Podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        int zmiennaWiek = scanner.nextInt();
        int wiekDekady = zmiennaWiek / 10;
        System.out.println("żyjesz już " + wiekDekady + " dekady");
    }
}
