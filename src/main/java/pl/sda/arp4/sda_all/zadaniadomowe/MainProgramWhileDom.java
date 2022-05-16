package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainProgramWhileDom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Podałeś złe liczby - pierwsza liczba musi być mniejsza od drugiej");
        }
        int suma = 0;
        int i = a;
        while (i <= b) {
            suma = suma + i;
            i++;
                    }
        System.out.println(suma);
    }
}




