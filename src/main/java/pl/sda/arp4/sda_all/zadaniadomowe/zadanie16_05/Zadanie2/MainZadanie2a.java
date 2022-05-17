package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie2;

import java.util.Scanner;

//        Rozwiń program i daj użytkownikowi możliwość wpisania więcej niż jednej linii tekstu. Po
//        wpisaniu przez użytkownika słowa „koniec” (jedna linia, bez spacji, kropek, przecinków i innych
//        znaków szczególnych) program przestaje przyjmować linie i wyświetla użytkownikowi ilość
//        zdań, które zostały wpisane
public class MainZadanie2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst;
        int iloscZdan = 0;
        System.out.println("Podaj tekst w którym chcesz policzyć zdania: (dopóki nie wpiszesz 'koniec' program będzie działać)");
        do {
            tekst = scanner.nextLine();
            char[] tablica = tekst.toCharArray();
            for (char c : tablica) {
                if (c == '.') {
                    iloscZdan++;
                }
            }
            System.out.println("Do tej pory znaleziono " + iloscZdan + " zdań");
        } while (!tekst.equalsIgnoreCase("koniec"));
        System.out.println("W sumie w tekscie są " + iloscZdan + " zdania");
    }
}
