package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Random;
import java.util.Scanner;

public class MainZadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[5];
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(49) + 1;
            tablica[i] = wylosowanaLiczba;
//            System.out.println(tablica[i]);
        }
        System.out.println("Podaj liczbę żeby sprawdzić czy jest w zbiorze 1-49: ");
        int liczba = scanner.nextInt();
        boolean czyZnalazl = false;
        for (int i = 0; i < tablica.length; i++) {
            if (liczba == tablica[i]) {
                czyZnalazl = true;
            }
        }
        if (czyZnalazl){
            System.out.println("Brawo Twoja liczbą jest w zbiorze! :)");
        }
        else {
            System.out.println("Nie znaleziono liczby :(");
        }
    }
}


