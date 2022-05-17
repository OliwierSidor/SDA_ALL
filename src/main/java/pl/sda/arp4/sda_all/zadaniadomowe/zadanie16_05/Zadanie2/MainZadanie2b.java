package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie2;

import java.util.Scanner;

//       Zmodyfikuj program tak, aby wyświetlał użytkownikowi ilość zdań, które miały:
//        i. Brak przecinków
//        ii. Jeden przecinek,
//        iii. Dwa przecinki,
//        iv. Ponad dwa przecinki
//      Wynik wyświetl użytkownikowi prezentując wynik w postaci ilości zdań prostych (brak
//        przecinków), oraz ilości zdań złożonych (z przecinkami, z podziałem na ich ilość)

public class MainZadanie2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst;
        int iloscZdan = 0;
        System.out.println("Podaj tekst w którym chcesz policzyć zdania: (dopóki nie wpiszesz 'koniec' program będzie działać)");

        int liczbaPrzecinkow = 0;
        int iloscZdanBezPrzecinkow = 0;
        int iloscZdanZJednymPrzecinkiem = 0;
        int iloscZdanZDwomaPrzecinkami = 0;
        int iloscPonadDwaPrzecinki = 0;
//        int[] licznikiPrzecinkow = new int[4];
        do {
            tekst = scanner.nextLine();
            char[] tablica = tekst.toCharArray();
            for (char c : tablica) {
                if (c == ',') {
                    liczbaPrzecinkow++;
                } else if (c == '.') {
                    iloscZdan++;
                    if (liczbaPrzecinkow == 0) {
                        iloscZdanBezPrzecinkow++;
                    } else if (liczbaPrzecinkow == 1) {
                        iloscZdanZJednymPrzecinkiem++;
                    } else if (liczbaPrzecinkow == 2) {
                        iloscZdanZDwomaPrzecinkami++;
                    } else if (liczbaPrzecinkow > 2) {
                        iloscPonadDwaPrzecinki++;
                    }
                    liczbaPrzecinkow = 0;
                }
            }
            System.out.println("Do tej pory znaleziono " + iloscZdan + " zdań.");
            System.out.println("Wpisz kolejne zdanie lub zakończ program wpisując 'koniec'.");
        } while (!tekst.equals("koniec"));

        System.out.println("W sumie w tekscie są " + iloscZdan + " zdania.");
        System.out.println("W tekście występuje " + iloscZdanBezPrzecinkow + " zdań prostych.");
        System.out.println("W tekście występuje " + (iloscZdanZDwomaPrzecinkami + iloscZdanZJednymPrzecinkiem + iloscPonadDwaPrzecinki) + " zdań złożonych.");
        System.out.println("W tekście występuje " + iloscZdanZJednymPrzecinkiem + " zdań z jednym przecinkiem.");
        System.out.println("W tekście występuje " + iloscZdanZDwomaPrzecinkami + " zdań z dwoma przecinkami.");
        System.out.println("W tekście występuje " + iloscPonadDwaPrzecinki + " zdania z więcej niż dwoma przecinkami.");
    }
}


//                  if (liczbaPrzecinkow == 0) {
//                          licznikiPrzecinkow[0]++;
//                          } else if (liczbaPrzecinkow == 1) {
//                          licznikiPrzecinkow[1]++;
//                          } else if (liczbaPrzecinkow == 2) {
//                          licznikiPrzecinkow[2]++;
//                          } else if (liczbaPrzecinkow > 2) {
//                          licznikiPrzecinkow[3]++;