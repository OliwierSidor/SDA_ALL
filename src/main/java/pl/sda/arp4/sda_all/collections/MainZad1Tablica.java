package pl.sda.arp4.sda_all.collections;

import java.util.Random;

public class MainZad1Tablica {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            int liczby = new Random().nextInt(21) - 10;

            tablica[i] = liczby;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " | ");
        }
    }
}
