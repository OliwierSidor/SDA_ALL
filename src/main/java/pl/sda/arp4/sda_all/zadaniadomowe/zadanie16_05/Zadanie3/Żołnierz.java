package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie3;

public class Żołnierz extends Osoba {
    private Ranga ranga;

    @Override
    public void przedstawSie() {
        System.out.println("Tu " + imie + " " + nazwisko + ", " + ranga.nazwa + " Polskich sił zbrojnych!");
    }

    public Żołnierz(String imie, String nazwisko, Ranga ranga) {
        super(imie, nazwisko);
        this.ranga = ranga;
    }
}
