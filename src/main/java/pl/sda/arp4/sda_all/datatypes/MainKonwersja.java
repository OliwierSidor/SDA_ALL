package pl.sda.arp4.sda_all.datatypes;

public class MainKonwersja {
    public static void main(String[] args) {
        short zmiennaA = 50;
        int zmiennaAKonwersja = zmiennaA;
        System.out.println(zmiennaAKonwersja);
        // przyklad B
        short zmiennaB = 51;
        long zmiennaBKonwersja = zmiennaB;
        System.out.println(zmiennaBKonwersja);
        // przyklad C

        int zmiennaC = 52;
        float zmiennaCKonwersja = zmiennaC;
        System.out.println(zmiennaCKonwersja);
        //przyklad D

        int zmiennaD = 53;
        double zmiennaDKonwersja = zmiennaD;
        System.out.println(zmiennaDKonwersja);
        //przyklad E

        long zmiennaE = 54;
        int zmiennaEKonwersja = (int) zmiennaE;
        System.out.println(zmiennaEKonwersja);
        //przyklad F
        short zmiennaF= 55;
        byte zmiennaFKonwersja = (byte) zmiennaF;
        System.out.println(zmiennaFKonwersja);
        // przyklad G
        char zmiennaG = 56;
        int zmiennaGKonwersja = zmiennaG;
        System.out.println(zmiennaGKonwersja);




    }
}
