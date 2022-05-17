package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie1;

import java.util.Scanner;

//        Stwórz program, który przyjmuje od użytkownika linię tekstu i zlicza ilość kropek i przecinków, które
//        występują w tekście, a następnie wypisuje ich ilości na ekran (na konsoli).

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst w którym chcesz zliczyć kropki i przecinki: ");
        String tekst = scanner.nextLine();

        char[] tablica = tekst.toCharArray();
        int liczbaKropek = 0;
        int liczbaPrzecinkow = 0;
        for (char znak : tablica) {
            if (znak == '.') {
                liczbaKropek++;
            } else if (znak == ',') {
                liczbaPrzecinkow++;
            }
        }
        System.out.println("W tekście wystąpiły " + liczbaKropek + " kropek i "+ liczbaPrzecinkow+ " przecinków.");
    }
}
