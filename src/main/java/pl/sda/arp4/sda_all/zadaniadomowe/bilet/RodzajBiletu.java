package pl.sda.arp4.sda_all.zadaniadomowe.bilet;

public enum RodzajBiletu {
    NORMALNY(1.70),
    ULGOWY(0.90),
    EMERYT(0.30),
    CALODOBOWY(5.30);
    private final double cena;

    RodzajBiletu(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}
