package pl.sda.arp4.sda_all.objects.daty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie2Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date: ");
        String data = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDateWpisana = LocalDate.parse(data, formatter);
        LocalDate dataPrzeszla = localDateWpisana.minusDays(10);
        System.out.println("Cofając sie o 10 dni będzie : " + dataPrzeszla);
        LocalDate dataPrzyszla = localDateWpisana.plusDays(10);
        System.out.println("Za 10 dni będzie: " + dataPrzyszla);
    }
}
