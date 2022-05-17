package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.ZadanieInterfejs;

public class Gitara implements IInstrument{
    @Override
    public void graj(String tekst) {

        System.out.println("tyryryn, tyryryryrn " + tekst);
    }
}
