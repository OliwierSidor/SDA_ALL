package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.ZadanieInterfejs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.println("Cześć " + imie + " Podaj tekst piosenki: ");
        String tekst = scanner.nextLine();
        IInstrument instrument = null;
        Muzykant muzykant = new Muzykant(imie);
        String coRobimy;
        do {
            System.out.println("Czy czesz zaśpiewać czy zagrać (zaspiewaj/zagraj): ");
            coRobimy = scanner.nextLine().toUpperCase();
            if (coRobimy.equals("ZAGRAJ")) {
                System.out.println("Na jakim instrumencie chcesz zagrać? (beben, flet, gitara, talerze, glos)");
                String wybranyInstrument = scanner.nextLine();
                if (wybranyInstrument.equals("beben")) {
                    Beben beben = new Beben();
                    beben.graj(tekst);
                } else if (wybranyInstrument.equals("flet")) {
                    Flet flet = new Flet();
                    flet.graj(tekst);
                } else if (wybranyInstrument.equals("gitara")) {
                    Gitara gitara = new Gitara();
                    gitara.graj(tekst);
                } else if (wybranyInstrument.equals("glos")) {
                    Glos glos = new Glos();
                    glos.graj(tekst);
                } else if (wybranyInstrument.equals("talerze")) {
                    Talerze talerze = new Talerze();
                    talerze.graj(tekst);
                }

            } else {
                System.out.println("nie mam instrumentu do grania :(");
            }
        } while (!coRobimy.equals("koniec"));

    }
}
