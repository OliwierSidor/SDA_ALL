package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;
//  Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji dodawania, odejmowania
//  mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma identyﬁkować sytuację wprowadzenia błędnego
//  symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję if else do wykonania odpowiedniego działania
//  w zależności od wprowadzonego symbolu operacji. Scenariusz działania programu:
//        Program wyświetla informację o swoim przeznaczeniu.
//        Wczytuje pierwszą liczbę.
//        Wczytuje symbol operacji arytmetycznej: +, -, *, /.
//        Wczytuje drugą liczbę.
//        Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.


public class MainZadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze!");

        do {
            System.out.println("Podaj pierwszą liczbe całkowitą: ");
            int liczbaPierwsza = scanner.nextInt();
            System.out.println("Podaj jakie działanie chcesz wykonać: (+,-,*,/)");
            String działanie = scanner.next();
            System.out.println("Podaj drugą liczbę całkowitą: ");
            int liczbaDruga = scanner.nextInt();
            if (działanie.equals("+")) {
                System.out.println("Wynik to: " + liczbaDruga + liczbaPierwsza);
                break;
            } else if (działanie.equals("-")) {
                System.out.println("Wynik to: " + (liczbaDruga - liczbaPierwsza));
                break;
            } else if (działanie.equals("*")) {
                System.out.println("Wynik to: " + liczbaDruga * liczbaPierwsza);
                break;
            } else if (działanie.equals("/")) {
                if (liczbaDruga == 0) {
                    System.out.println("nie mozna dzielic przez zero!");
                } else {
                    System.out.println("Wynik to: " + liczbaDruga / liczbaPierwsza);
                }
            }
        } while (true);
    }
}