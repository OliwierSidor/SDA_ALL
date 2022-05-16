package pl.sda.arp4.sda_all.interfejsy.sprzetyDomowe;

public class Piekarnik implements UrządzenieWłączalne, UrządzenieWyłączalne {
    public void wlacz(){
        System.out.println("Włączam piekarnik, jedzonko się podgrzewa");
    }
    public void wylacz(){
        System.out.println("Wyłączam piekarnik");
    }
}
