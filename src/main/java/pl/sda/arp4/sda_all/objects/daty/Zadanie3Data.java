package pl.sda.arp4.sda_all.objects.daty;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie3Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą date w formacie \"yyyy-MM-dd\": ");
        String dataPierwsza = scanner.nextLine();
        System.out.println("Podaj drugą date w formacie \"yyyy-MM-dd\": ");
        String dataDruga = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataWpisanaPierwsza = LocalDate.parse(dataPierwsza, formatter);
        LocalDate dataWpisanaDruga = LocalDate.parse(dataDruga, formatter);
        Period period = Period.between(dataWpisanaPierwsza, dataWpisanaDruga);

        System.out.println("Od daty 1 do daty 2 minelo: " + period.getYears() + " lat " + period.getMonths() + " miesiecy " + period.getDays() + " dni");

        // Math.abs(x) -> wartość bezwzględna z wartości zmiennej x
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("years: " + years + " months: " + months + " days: " + days);
    }
}
