package pl.sda.arp4.sda_all.wyjaztkiZadanie;

public class CholeroExeption extends RuntimeException{

    public CholeroExeption() {
        super("Nigdy cholero nie dziel przez zero :)");
    }
}
