package pl.sda.arp4.sda_all.collections;

import java.util.Random;

public class MainGenerator4 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        int liczba;
        int licznik = 0;
        for (int i = 0; i < tablica.length; i++) {
            liczba = new Random().nextInt(10);
            System.out.print(liczba + " ");
            if (liczba == 5) {
                licznik = licznik +1;
            }
        }
        System.out.println();
        System.out.println("Wylosowano: " + licznik);
    }
}



