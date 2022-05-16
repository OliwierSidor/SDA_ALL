package pl.sda.arp4.sda_all.collections;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainTablica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            int wpisanaLiczba = new Random().nextInt(21) - 10;
            tablica[i] = wpisanaLiczba;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + "  ");
        }
        double suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        System.out.println();
        System.out.print("Suma: " + suma);
        System.out.println();

        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (minimum > tablica[i]) {
                minimum = tablica[i];
            }
        }
        System.out.println("Minimum: " + minimum);

        int maksimum = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (maksimum < tablica[i]) {
                maksimum = tablica[i];
            }
        }
        System.out.println("Maksimum: " + maksimum);
        int indeksMaksimum = 0;
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
                indeksMaksimum = i;
            }
        }
        System.out.println("Numer komórki maksimum: " + indeksMaksimum);
        double srednia = suma / tablica.length;
        System.out.println("Średnia arytmetyczna wynosi: " + srednia);
        int licznikWiekszychElementow = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > srednia) {
                System.out.print(tablica[i] + "  ");
                licznikWiekszychElementow = licznikWiekszychElementow + 1;
            }
        }
        System.out.println();
        System.out.println("Licznik większych elementów: " + licznikWiekszychElementow);
        int licznikMniejszychElementow = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < srednia) {
                System.out.print(tablica[i] + "  ");
                licznikMniejszychElementow = licznikMniejszychElementow + 1;
            }
        }
        System.out.println();
        System.out.println("Licznik mniejszych elementów: " + licznikMniejszychElementow);
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + "  ");
        }
        Arrays.sort(tablica);
        System.out.println();
        System.out.println("Posortowana tablica od najmniejszych liczb:");
        System.out.print(Arrays.toString(tablica));


       double mediana;
        if (tablica.length % 2 == 0){
            int indeksSrodkowyElement = tablica.length/2;

            int wartosc1 = tablica[indeksSrodkowyElement];
            int wartosc2 = tablica[indeksSrodkowyElement - 1];

            mediana = (wartosc1 - wartosc2 / 2.0);
        }
        else {
            int indeksSrodkowyElement = tablica.length/2;
            mediana = tablica[indeksSrodkowyElement];
            mediana = tablica[indeksSrodkowyElement];
        }
        System.out.println();
        System.out.println("Mediana to: " + mediana);
    }
}
