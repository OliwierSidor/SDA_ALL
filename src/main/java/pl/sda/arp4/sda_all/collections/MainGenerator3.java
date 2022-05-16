package pl.sda.arp4.sda_all.collections;

import java.util.Arrays;
import java.util.Random;

public class MainGenerator3 {
    public static void main(String[] args) {
        int[] tablica = new int[1000];

        for (int i = 0; i < tablica.length; i++) {
            int liczba = new Random().nextInt(5201) - 200;
            tablica[i] = liczba;
        }
        System.out.print(Arrays.toString(tablica));
    }
}
