package pl.sda.arp4.sda_all.inheritance.ksztalty;

public class Main {
    public static void main(String[] args) {
        Kwadrat k = new Kwadrat(5);
        System.out.println("Pole: " + k.obliczPole());
        System.out.println("Pole: " + k.obliczObwod());

        Ksztalt[] ksztalts = new Ksztalt[5];

        ksztalts[0] = new Kolo(32);
        ksztalts[1] = new Kwadrat(2.3);
        ksztalts[2] = new Trapez(12, 14, 14,10, 50);
        ksztalts[3]= new Kwadrat(15.);
        ksztalts[4] = new Kolo(12);

        double sumaPolksztaltow = 0;
        double sumaObwodow = 0;
        for (Ksztalt ksztalt : ksztalts) {
            System.out.println("Pole: " + ksztalt.obliczPole());
            System.out.println("Obwod: " + ksztalt.obliczObwod());
            sumaPolksztaltow = sumaPolksztaltow + ksztalt.obliczPole();
            sumaObwodow = sumaObwodow + ksztalt.obliczObwod();
        }
        System.out.println("Suma pól: " + sumaPolksztaltow);
        System.out.println("Suma obwodow: " + sumaObwodow);
    }
}
