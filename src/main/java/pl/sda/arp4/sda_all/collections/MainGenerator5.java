package pl.sda.arp4.sda_all.collections;

import java.util.Random;

public class MainGenerator5 {
    public static void main(String[] args) {
        int[] tablica = new int[5];
        int licznik = 0;
        int licznik1 = 0;
        for (int i = 0; i < tablica.length; i++) {
            int liczba = new Random().nextInt(5) +1;
            System.out.print(liczba + " | ");
            if (liczba == 2) {
                licznik = licznik + 1;
            }
            else if (liczba == 4) {
                licznik1 = licznik1 + 1;
            }
        }
        System.out.println();
        System.out.println("Ilość dwójek to: " + licznik);
        System.out.println("Ilość czwórek to: " + licznik1);
    }
}
