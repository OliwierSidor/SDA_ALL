package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie3;

public class Cywil extends Osoba {
    public Cywil(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko + ", jestem obywatelem Polskim!");
    }
}