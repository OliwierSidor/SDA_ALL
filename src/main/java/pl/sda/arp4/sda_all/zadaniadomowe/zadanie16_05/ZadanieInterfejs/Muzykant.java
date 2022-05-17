package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.ZadanieInterfejs;

public class Muzykant implements IInstrument {

    public void zagraj(String tekst) {
    }

    private String imie;
    private IInstrument instrument = null;


    public Muzykant(String imie) {
        this.imie = imie;
    }

    public void setInstrument(IInstrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void graj(String tekst) {

    }
}
