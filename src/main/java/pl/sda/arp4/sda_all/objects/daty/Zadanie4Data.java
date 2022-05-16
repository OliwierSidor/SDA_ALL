package pl.sda.arp4.sda_all.objects.daty;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie4Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Podaj pierwszą date w formacie 'yyyy-MM-dd': ");
        String dataPierwsza = scanner.next();

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM-yyyy-dd");
        System.out.println("Podaj drugą date w formacie 'MM-yyyy-dd': ");
        String dataDruga = scanner.next();

        LocalDate dataPodana1 = LocalDate.parse(dataPierwsza, formatter1);
        LocalDate dataPodana2 = LocalDate.parse(dataDruga, formatter2);

        Period period = Period.between(dataPodana1, dataPodana2);
        System.out.println(period);
    }
}
