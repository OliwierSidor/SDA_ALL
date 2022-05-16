package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainZadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaUjemna;
        int liczbaDodatnia;
        int[] tablica = new int[10];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + (i + 1) + ". ujemną liczbę:");
            liczbaUjemna = scanner.nextInt();
            while (liczbaUjemna >= 0) {
                System.out.println("Podałeś liczbę wiekszą bądź równa zero");
                System.out.println("Podaj 1 ujemną liczbę:");
                liczbaUjemna = scanner.nextInt();
                if (liczbaUjemna < 0) {
                    System.out.println("Podaj " + (i + 2) + ". ujemną liczbę:");
                    break;
                }
            }
        }
        int sumaUjemne = 0;
        for (int i = 0; i < 5; i++) {
            sumaUjemne = sumaUjemne + tablica[i];
            for (int l = 0; l < 5; l++) {
                System.out.println("Podaj " + (l + 1) + ". dodatnią liczbę:");
                liczbaDodatnia = scanner.nextInt();
                while (liczbaDodatnia <= 0) {
                    System.out.println("Podałeś liczbę mniejszą bądź równa zero");
                    System.out.println("Podaj " + (l + 1) + " dodatnią liczbę:");
                    liczbaDodatnia = scanner.nextInt();
                    if (liczbaDodatnia > 0) {
                        System.out.println("Podaj " + (l + 2) + ". dodatnią liczbę:");
                    }
                }
            }break;
        }
        int sumaDodatnie = 0;
        for (int i = 0; i < 1; i++) {
            sumaDodatnie = sumaDodatnie + tablica[i];
            System.out.println("Suma: " + (sumaUjemne + sumaDodatnie));
        }
    }
}





