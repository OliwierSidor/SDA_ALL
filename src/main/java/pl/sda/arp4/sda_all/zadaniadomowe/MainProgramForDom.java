package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainProgramForDom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj piwerszą liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Podałeś złe liczby - pierwsza liczba musi być mniejsza od drugiej");
        }
        int suma = 0;
        for (int i = a; i <= b; i++) {
            suma = suma + i;
        }
        System.out.println(suma);
    }
}

