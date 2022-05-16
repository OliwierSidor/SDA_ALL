package pl.sda.arp4.sda_all.objects.modele;

public class Obywatel {
    @Override
    public String toString() {
        return "Obywatel{" +
                "imie='" + imie + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    private String imie;
    private String pesel;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String  getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Obywatel(String imie, String pesel) {
        this.imie = imie;
        this.pesel = pesel;
    }

}
