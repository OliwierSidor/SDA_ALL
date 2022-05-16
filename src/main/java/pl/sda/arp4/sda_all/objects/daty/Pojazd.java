package pl.sda.arp4.sda_all.objects.daty;

import java.time.Duration;
import java.time.LocalDateTime;


public class Pojazd {
    private String nrRejstracyjny;
    private RodzajPojazdu rodzajPojazdu;
    private LocalDateTime czasWjazdu;
    private LocalDateTime czasWyjazdu;

    public Pojazd(String nrRejstracyjny, RodzajPojazdu rodzajPojazdu) {
        this.nrRejstracyjny = nrRejstracyjny;
        this.rodzajPojazdu = rodzajPojazdu;

        this.czasWjazdu = LocalDateTime.now();
        System.out.println("Pojazd o numerze rejstracyjnym: " + nrRejstracyjny.toUpperCase() + " wjechał na autostrade o godzinie: " + czasWjazdu);
    }

    public void setCzasWyjazdu(LocalDateTime czasWyjazdu) {
        this.czasWyjazdu = czasWyjazdu;
    }

    public RodzajPojazdu getRodzajPojazdu() {
        return rodzajPojazdu;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "nrRejstracyjny='" + nrRejstracyjny + '\'' +
                ", rodzajPojazdu=" + rodzajPojazdu +
                ", czasWjazdu=" + czasWjazdu +
                ", czasWyjazdu=" + czasWyjazdu +
                '}';
    }
    public Duration obliczCzasPrzejazdu(){
       Duration czasPrzejazdu = Duration.between(czasWjazdu, czasWyjazdu);
        return czasPrzejazdu;
    }
}
