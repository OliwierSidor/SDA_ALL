package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainZadanie7dom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zad7 zad = null;

        do {
            System.out.println("Podaj tekst: ");
            String tekst = scanner.nextLine();
            System.out.println();
            System.out.println("Podaj czy tekst ma być napisany dużymi czy małymi literami: (D/M): ");
            String wybor = scanner.nextLine().toUpperCase();
            if (wybor.equals("D")) {
                System.out.println("Tekst wielkimi literami: " + tekst.toUpperCase());
            } else if (wybor.equals("M")) {
                System.out.println("Tekst małymi literami: " + tekst.toLowerCase());
            } else {
                System.out.println("Nie ma takiej opcji podaj D lub M");
            }  break;
        } while (zad == null);
    }
}

