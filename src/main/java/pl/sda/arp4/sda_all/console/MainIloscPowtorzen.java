package pl.sda.arp4.sda_all.console;

import java.util.Scanner;

public class MainIloscPowtorzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość powtórzeń:");
        int powtorzenia = scanner.nextInt();
        for (int i = 0; i < powtorzenia; i++) {
            System.out.println(i + 1 + ". Hello World");
        }

        //drugi przyklad
        for (int i = 0; i < powtorzenia; i++) {
            int numerIteracji = i + 1;
            System.out.println(numerIteracji + ". Hello World");
        }
    }

}
