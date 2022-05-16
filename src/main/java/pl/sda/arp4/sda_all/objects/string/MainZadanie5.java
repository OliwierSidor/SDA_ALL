package pl.sda.arp4.sda_all.objects.string;

import java.util.Scanner;

public class MainZadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = scanner.nextLine();

        char[] znaki = tekst.toCharArray();


        for (int i = 0; i < znaki.length; i++) {
            int licznik = 0;
            char literkaI = znaki[i];

            for (int j = 0; j < znaki.length; j++) {
                char literkaJ = znaki[j];

                if ((j < i) && (literkaI == literkaJ)) {
                    break;
                }
                if (literkaI == literkaJ) {
                    licznik = licznik + 1;
                }
            }
            if (licznik != 0) {
                System.out.println(literkaI + " ->" + licznik);
            }
        }
    }
}
