package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainZadanie6dom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = scanner.nextLine();
        String tekstBezPrzecinka = tekst.replaceAll(",", " makarena");
        System.out.println(tekstBezPrzecinka);

    }
}
