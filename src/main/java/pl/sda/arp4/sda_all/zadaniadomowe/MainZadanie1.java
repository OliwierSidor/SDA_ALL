package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainZadanie1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = s.nextInt();
        System.out.print("Dzielniki liczby " + liczba + " to: ");
        for (int i = 1; i <= liczba; i++) {
            if ((liczba % i) == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}