package pl.sda.arp4.sda_all.koszykzakupowy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość produktów które bedą na rachunku: ");
        int iloscProduktow = scanner.nextInt();
        scanner.nextLine();
        Produkt[] tablicaProduktow = new Produkt[iloscProduktow];

        for (int i = 0; i < iloscProduktow; i++) {
            System.out.println("Podaj nazwę produktu:");
            String nazwaProduktu = scanner.next();

            System.out.println("Podaj cenę netto produktu: ");
            double cenaNetto = scanner.nextDouble();

            PodatekProduktu podatekProduktu = null;
            do {
                System.out.println("Podaj rodzaj podatku: " + Arrays.toString(PodatekProduktu.values()) + " ");
                String podatekProduktuString = scanner.next();
                try {
                    podatekProduktu = PodatekProduktu.valueOf(podatekProduktuString.toUpperCase());
                } catch (IllegalArgumentException iae) {
                    System.out.println("Zły podatek produktu!");
                }
            } while (podatekProduktu == null);
            Produkt produkt = new Produkt(nazwaProduktu, cenaNetto, podatekProduktu);
            tablicaProduktow[i] = produkt;
        }
        System.out.println("Będzie faktura czy paragon?");
        String czyFaktura = scanner.next();

        if (czyFaktura.equalsIgnoreCase("faktura")) {
            System.out.println("Podaj NIP: ");
            String nip = scanner.next();

            Faktura faktura = new Faktura(nip, tablicaProduktow);
            System.out.println(faktura);
        } else {
            Rachunek rachunek = new Rachunek(tablicaProduktow);
            System.out.println(rachunek);
        }
    }
}
