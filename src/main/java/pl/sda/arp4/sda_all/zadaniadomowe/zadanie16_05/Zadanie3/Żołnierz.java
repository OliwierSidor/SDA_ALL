package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie3;

public class Żołnierz extends Osoba {
    Ranga ranga;

    @Override
    public void przedstawSie() {
        System.out.println("Tu " + imie + " " + nazwisko + ", " + ranga.nazwa + " Polskich sił zbrojnych!");
    }

//    public Żołnierz(String imie, String nazwisko, Ranga ranga) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.ranga = ranga;
//    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setRanga(Ranga ranga){
        this.ranga = ranga;
    }
}
