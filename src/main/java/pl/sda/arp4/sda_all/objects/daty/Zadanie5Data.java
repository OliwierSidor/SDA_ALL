package pl.sda.arp4.sda_all.objects.daty;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//4. Napisz aplikację, która obliczy twój wiek. Podaj wiek w formacie:
//        Masz X lat, Y miesięcy, Z dni. (użyj Period)
//        Masz XYZ sekund. (użyj Duration)

public class Zadanie5Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");

        System.out.println("Podaj date urodzenia w formacie yyyy-MM-dd HH-mm-ss: ");
        String data = scanner.nextLine();
        LocalDateTime dataWpisana = LocalDateTime.parse(data, formatter);

        LocalDateTime dataTeraz = LocalDateTime.now();

        Period period = Period.between(dataWpisana.toLocalDate(), dataTeraz.toLocalDate());
        Duration duration = Duration.between(dataWpisana, dataTeraz);
        System.out.println("Żyjesz: " + period.getYears() + " lata " + period.getMonths() + " miesiecy " + period.getDays() + " sekund ");
        System.out.println("Żyjesz: " + duration.getSeconds() + " sekund");

    }
}
