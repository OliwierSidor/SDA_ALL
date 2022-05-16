package pl.sda.arp4.sda_all.objects.modele;

public class Mis {
    private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Mis(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Mis{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}
