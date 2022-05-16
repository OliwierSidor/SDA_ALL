package pl.sda.arp4.sda_all.koszykzakupowy;

public class Produkt {
    private String nazwaProduktu;
    private double cenaProduktu;
    private PodatekProduktu podatek;

    public Produkt(String nazwaProduktu, double cenaProduktu, PodatekProduktu podatek) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktu = cenaProduktu;
        this.podatek = podatek;
    }

    public double cenaBrutto() {
        double cenaProduktuBrutto = cenaProduktu + (cenaProduktu * podatek.getWartoscPodatku());
        return cenaProduktuBrutto;
    }


    @Override
    public String toString() {
        return "Product{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaProduktu=" + cenaProduktu +
                ", podatekProduku=" + podatek +
                '}';
    }
}
