package pl.sda.arp4.sda_all.inheritance.ptaki;

public class Ptak {
    public void spiewaj(){
        System.out.println("ćwir ćwir");
    }
    public static void main(String[] args) {

        Sowa s = new Sowa();
        s.spiewaj();

        Kukulka k = new Kukulka();
        k.spiewaj();

        Bocian b = new Bocian();
        b.spiewaj();

        Ptak p = new Ptak();
        p.spiewaj();
    }
}



