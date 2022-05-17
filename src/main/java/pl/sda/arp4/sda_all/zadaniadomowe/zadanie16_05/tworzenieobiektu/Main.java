//package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.tworzenieobiektu;
//
//import java.time.LocalDate;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String imie;
//        String nazwisko;
//        Stanowisko stanowisko;
//        String[] kwalifikacje;
//        double zarobki;
//        LocalDate poczatekPracy;
//
//        System.out.println("DODAWANIE NOWEGO PRACOWNIKA");
//        System.out.println("Podaj imię: ");
//        imie = scanner.nextLine();
//
//        System.out.println("Podaj nazwisko: ");
//        nazwisko = scanner.nextLine();
//
//        System.out.println("Podaj stanowisko: (Worker, Manager, Security, Partner)");
//        stanowisko = Stanowisko.valueOf(scanner.nextLine().toUpperCase());
//
//        System.out.println("Ile kwalifikacji ma pracownik: ");
//        kwalifikacje = scanner.nextInt();
//
//        for (int i = 0; i < kwalifikacje; i++) {
//            System.out.println("Podaj kwalifikacje: ");
//        }
//
//
//
//        System.out.println("Podaj zarobki pracownika: ");
//        zarobki = scanner.nextDouble();
//
//        System.out.println("Podaj date rozpoczęcia pracy: ");
//        poczatekPracy = scanner.nextLine();
//
//        Pracownik pracownik = new Pracownik(imie, nazwisko, stanowisko, kwalifikacje, zarobki, poczatekPracy);
//    }
//}
