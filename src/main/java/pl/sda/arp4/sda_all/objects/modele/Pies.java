package pl.sda.arp4.sda_all.objects.modele;

public class Pies {
    String imie;

    // konstruktor domyślny jest istnieje jeśli nie istnieje żaden inny konstruktor
    // konstruktor domyślny
    // konstruktor bezparametrowy
    public Pies() {

    }

    public Pies(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
