package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie2;

import java.util.Scanner;

public class MainZadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst w którym chcesz policzyć zdania: ");
        String tekst = scanner.nextLine();
        char[] tablica = tekst.toCharArray();
        int iloscZdan = 0;
        for (char c : tablica) {
            if (c == '.') {
                iloscZdan++;
            }
        }
        System.out.println("W tekscie są " + iloscZdan + " zdań");
    }
}
