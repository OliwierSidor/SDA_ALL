package pl.sda.arp4.sda_all.objects.string;

import java.util.Scanner;

//Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych. W programie zdefiniuj wartość dochód (double)
// na pewną wartość i po obliczeniu wypisywać na ekranie należny podatek. Podatek obliczany jest wg. następujących reguł:
//        do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//        od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00

public class MainZadanie10minut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę dochodu: ");
        double dochod = scanner.nextDouble();

        if (dochod <= 85528) {
            double naleznyPodatek = dochod * 0.18 - 556.02;
            System.out.println(dochod);
            System.out.println("Podatek do zapłaty: " + naleznyPodatek);
        }
        if (dochod > 85528) {
            double naleznyPodatek = (dochod - 85528);
            double naleznyPodatekPrzekroczono = naleznyPodatek * 0.32 + 14839.02;
            System.out.println("Podatek do zapłaty: " + naleznyPodatekPrzekroczono);
        }
    }
}

