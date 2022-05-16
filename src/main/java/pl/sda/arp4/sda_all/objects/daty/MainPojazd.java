package pl.sda.arp4.sda_all.objects.daty;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MainPojazd {
    public static void main(String[] args) {
        RodzajPojazdu rodzajPojazdu = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr rejstracyjny: ");
        String numerRejstracyjny = scanner.nextLine().toUpperCase();

        do {
            System.out.println("Podaj rodzaj pojazdu (OSOBOWY, CIĘŻAROWY, JEDNOŚLAD): ");
            String rodzajPojazduText = scanner.nextLine().toUpperCase();
            try {
                rodzajPojazdu = RodzajPojazdu.valueOf(rodzajPojazduText.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.out.println("Wprowadzono nieprawidłowy rodzaj pojazdu!");
            }
        } while (rodzajPojazdu == null);
        Pojazd pojazd1 = new Pojazd(numerRejstracyjny, rodzajPojazdu);
        String wpisaneSlowo;
        do {
            System.out.println("Wpisz 'wyjazd' aby opuścić autostrade: ");
            wpisaneSlowo = scanner.nextLine().toUpperCase();


        } while (!wpisaneSlowo.equals("WYJAZD"));
        LocalDateTime czasWyjazdu = LocalDateTime.now();
        pojazd1.setCzasWyjazdu(czasWyjazdu);
        Duration czasPrzejazdu = pojazd1.obliczCzasPrzejazdu();

        double kwotaDoZaplaty = (czasPrzejazdu.getSeconds() / 60.0) * pojazd1.getRodzajPojazdu().getCena();
        String komunikat = String.format("Kwota to zapłaty to: %.2f czas spędzony na autostradzie to %d s", kwotaDoZaplaty, czasPrzejazdu.getSeconds());
        System.out.println(komunikat);

    }
}
