package pl.sda.arp4.sda_all.objects.modele;

import java.util.Scanner;

public class MainObywatel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imię: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj PESEL: ");
        String pesel = scanner.nextLine();


        Obywatel obywatel1 = new Obywatel(imie, pesel);
        System.out.println(obywatel1);
    }
}
