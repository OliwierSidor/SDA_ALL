package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.Zadanie3;

public enum Ranga {
    POLKOWNIK("Pułkownik"),
    MAJOR("Major"),
    KAPITAN("Kapitan"),
    PORUCZNIK("Porucznik"),
    CHORAZY("Chorąży"),
    SIERZANT("Sieżant"),
    KAPRAL("Kapral");

    String nazwa;

    Ranga(String nazwa) {
        this.nazwa = nazwa;
    }
}
