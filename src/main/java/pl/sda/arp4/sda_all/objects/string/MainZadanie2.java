package pl.sda.arp4.sda_all.objects.string;

import java.util.Scanner;

public class MainZadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj szukane słowo: ");
        String searched = scanner.nextLine();
        System.out.print("podaj linę tekstu: ");
        String tekst = scanner.nextLine();

        System.out.println("Znaleziono: " + tekst.toLowerCase().contains(searched.toLowerCase()));
    }
}
