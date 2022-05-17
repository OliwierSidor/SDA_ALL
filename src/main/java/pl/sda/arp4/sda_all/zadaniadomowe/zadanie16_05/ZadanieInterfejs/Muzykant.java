package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.ZadanieInterfejs;

public class Muzykant {

    private String imie;
    private IInstrument instrument = null;

    public Muzykant(String imie) {
        this.imie = imie;
    }

    public void setInstrument(IInstrument instrument) {
        this.instrument = instrument;
    }

    public void zagraj(String tekst) {
        if (instrument == null){
            System.out.println("Nie mam instrumentu do grania");
        } else {
            instrument.graj(tekst);
        }

    }
}
