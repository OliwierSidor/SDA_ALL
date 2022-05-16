package pl.sda.arp4.sda_all.zadaniadomowe;

import java.util.Scanner;

public class MainZadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst w którym chcesz zliczyć słowa: ");


        String tekst = scanner.nextLine();
        String tekstBezPrzecinkow = tekst.replaceAll(",", "");
        String tekstBezKropekIPrzecinkow = tekstBezPrzecinkow.replaceAll("[.]", "");
        String[] slowa = tekstBezKropekIPrzecinkow.split(" ");

        for (int i = 0; i < slowa.length; i++) {
            String slowoSzukane = slowa[i];

            int licznik = 0;

            for (int j = 0; j < slowa.length; j++) {
                String slowoPorownywane = slowa[j];
                if ((j < i) && (slowoSzukane.equals(slowoPorownywane))) {
                    break;
                }
                if (slowoSzukane.equals(slowoPorownywane)) {
                    licznik++;
                }
            }
            if (licznik != 0) {
                System.out.println("Słowo szukane: " + slowoSzukane + " wystąpiło " + licznik + " razy");
            }
        }
    }
}


