package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainZadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[5];
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj liczbę " + (i + 1) + "  większą od zera: ");
            int liczba = scanner.nextInt();
            tablica[i] = liczba;
            if (tablica[i] <= 0){
                System.out.println("Podana liczba jest ujemna, wprowadź ponownie: ");
                i--;
            }
        }
        int maksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (maksimum < tablica[i]) {
                maksimum = tablica[i];
            }
        }
        System.out.println("Najwieksza liczba to: " + maksimum);
    }
}




