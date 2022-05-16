package pl.sda.arp4.sda_all.console;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój stan cywilny: (wolny/zajęty) ");
        String stanCywilny = scanner.next();

        // Deklaracja przed if'em
        StanCywilny zmiennaStanCywilny = StanCywilny.NIEZNANY;

        // Przypisujemy wartość na podstawie wpisanego tekstu
        if (stanCywilny.equalsIgnoreCase("ZAJETY")) {
            zmiennaStanCywilny = StanCywilny.ZAJĘTY;
        } else if (stanCywilny.equalsIgnoreCase("WOLNY")){
            zmiennaStanCywilny = StanCywilny.WOLNY;
        }
        else {
            System.out.println("Nie zostało wpisane nic co pasuje :(");
        }
        // mogę skorzystać ze zmiennej którą zadeklarowałem przed if
        System.out.println(zmiennaStanCywilny);

        switch (zmiennaStanCywilny) {
            case WOLNY:
                System.out.println("To jest wolny ziomek");
                break;
            case ZAJĘTY:
                System.out.println(" Ten typ jest zajęty");
                break;
            default:
                System.out.println("Ani jest wolny, ani zajęty, nie wiemy!");
        }
    }
}
