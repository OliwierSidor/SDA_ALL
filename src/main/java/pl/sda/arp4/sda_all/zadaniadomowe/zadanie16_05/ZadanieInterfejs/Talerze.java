package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.ZadanieInterfejs;

public class Talerze implements IInstrument {

    @Override
    public void graj(String tekst) {
        System.out.println("tss, tss, tss, tss " + tekst);
    }
}
