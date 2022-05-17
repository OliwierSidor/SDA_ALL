package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.ZadanieInterfejs;

public class Beben implements IInstrument {

    @Override
    public void graj(String tekst) {
        System.out.println("bum bum, dum dum, " + tekst + " dyn dyn");
    }
}
