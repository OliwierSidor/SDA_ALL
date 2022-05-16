package pl.sda.arp4.sda_all.datatypes;

public class MainString {
    public static void main(String[] args) {
        String zmiennaA = "ala";
        String zmiennaB = new String("ala");
        String zmiennaC = new String("ala");
        String zmiennaD = "ala";
        String zmiennaE = "ala ";
        String zmiennaF = "Ala";

        System.out.println(zmiennaA == zmiennaB);
        System.out.println(zmiennaA == zmiennaD);
        System.out.println(zmiennaA == zmiennaC);
        System.out.println(zmiennaC == zmiennaD);

        System.out.println(zmiennaA.equals(zmiennaB));
        System.out.println(zmiennaA.equals(zmiennaC));
        System.out.println(zmiennaA.equals(zmiennaD));

        System.out.println(zmiennaA.equals(zmiennaE));

        System.out.println(zmiennaA.equals(zmiennaF));
        System.out.println(zmiennaA.equalsIgnoreCase(zmiennaF));
    }
}
