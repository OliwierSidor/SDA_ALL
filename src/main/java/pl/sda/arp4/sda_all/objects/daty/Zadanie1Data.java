package pl.sda.arp4.sda_all.objects.daty;
//Stwórz aplikację która w pętli przyjmuje polecenie:
//        - wpisanie ‘date’ wypisuje obecny LocalDate
//        - wpisanie ‘time’ wypisuje obecny LocalTime
//        - wpisanie ‘datetime’ wypisuje obecny LocalDateTime
//        (W wybranym przez Ciebie formacie)
//        Jeśli użytkownik wpisze 'quit' to zakoncz program.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Zadanie1Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wpisane;
        do {
            System.out.println("wpisz 'date'', jeśli chcesz poznać date, wpisz 'time' jesli chcesz poznac czas, wpisz 'datetime' jesli chcesz poznac obie rzeczy: ");
            wpisane = scanner.nextLine();
            if (wpisane.equals("date")) {
                LocalDate localDate = LocalDate.now();
                System.out.println(localDate);
            } else if (wpisane.equals("time")) {
                LocalTime localTime = LocalTime.now();
                System.out.println(localTime);
            } else if (wpisane.equals("datetime")) {
                LocalDateTime localDateTime = LocalDateTime.now();
                System.out.println(localDateTime);
            }
        } while (!wpisane.equals("quit"));
    }
}
