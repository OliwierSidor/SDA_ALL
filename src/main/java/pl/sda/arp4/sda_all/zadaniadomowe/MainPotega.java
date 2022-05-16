package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainPotega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int liczba = scanner.nextInt();
        int wynik = 1;
        while (wynik < liczba) {
            System.out.println(wynik);
            wynik = wynik * 2;
        }

    }
}



