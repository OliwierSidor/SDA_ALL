package pl.sda.arp4.sda_all.objects.daty;

public enum RodzajPojazdu {
    OSOBOWY(3.2),
    CIĘŻAROWY(5.9),
    JEDNOŚLAD(1.1);
    private final double cena;

    RodzajPojazdu(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}
