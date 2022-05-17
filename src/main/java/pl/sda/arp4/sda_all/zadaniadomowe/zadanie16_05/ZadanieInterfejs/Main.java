package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.ZadanieInterfejs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.println("Cześć " + imie + " Podaj tekst piosenki: ");
        String tekst = scanner.nextLine();

        Muzykant muzykant = new Muzykant(imie);
        String coRobimy;
        do {
            System.out.println("Czy chcesz zaśpiewać czy wybrać instrument? (zaśpiewaj/instrument): ");
            coRobimy = scanner.nextLine().toUpperCase();
            if (coRobimy.equals("INSTRUMENT")) {
                System.out.println("Na jakim instrumencie chcesz zagrać? (beben, flet, gitara, talerze, glos, trabka)");
                String wybranyInstrument = scanner.nextLine();

                if (wybranyInstrument.equals("beben")) {
                    muzykant.setInstrument(new Beben());

                } else if (wybranyInstrument.equals("flet")) {
                    muzykant.setInstrument(new Flet());

                } else if (wybranyInstrument.equals("gitara")) {
                    muzykant.setInstrument(new Gitara());

                } else if (wybranyInstrument.equals("glos")) {
                    muzykant.setInstrument(new Glos());

                } else if (wybranyInstrument.equals("talerze")) {
                    muzykant.setInstrument(new Talerze());

                } else if (wybranyInstrument.equals("trabka")) {
                    muzykant.setInstrument(new Trabka());
                }
                System.out.println("Wybieram  " + wybranyInstrument);

            } else if (coRobimy.equals("ZASPIEWAJ")) {
                muzykant.zagraj(tekst);
            } else if (coRobimy.equals("KONIEC")) {
                System.out.println("Do zobaczenia!");
            } else {
                System.out.println("Nie rozumiem - podaj 'zaspiewaj' albo 'instrument'");
            }
        } while (!coRobimy.equals("KONIEC"));

    }
}
