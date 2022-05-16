package pl.sda.arp4.sda_all.collections;

import java.util.Scanner;

public class MainTablica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("podaj " + (i+1) +" liczbę");
            int wpisanaLiczba = scanner.nextInt();
            tablica[i] = wpisanaLiczba;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        System.out.print("suma: " + suma);
    }
}
