package pl.sda.arp4.sda_all.wyjatki;

public class MainRzucanieWyjatkow {
    public static void main(String[] args) {

        try {
            metoda();

        } catch (Exception e) {
            System.out.println("Złapany");
        }
    }

    public static void metoda() throws Exception {
        //throw new RuntimeException("Runetime Yo!");

        throw new Exception(":(");
    }

}

