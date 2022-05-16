package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainZadanie7dom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = scanner.nextLine();
        System.out.println("Tekst małymi literami: " + tekst.toLowerCase());
        System.out.println("Tekst wielkimi literami: " + tekst.toUpperCase());
    }
}

