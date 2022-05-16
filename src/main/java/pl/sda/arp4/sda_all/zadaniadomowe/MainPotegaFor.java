package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainPotegaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int liczba = scanner.nextInt();
        for (int wynik = 1; wynik < liczba; wynik*=2) {
            System.out.println(wynik);

        }
    }
}

