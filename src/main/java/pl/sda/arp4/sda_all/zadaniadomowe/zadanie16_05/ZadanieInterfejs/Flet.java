package pl.sda.arp4.sda_all.zadaniadomowe.zadanie16_05.ZadanieInterfejs;

import jdk.swing.interop.SwingInterOpUtils;

public class Flet implements IInstrument{
    @Override
    public void graj(String tekst) {
        System.out.println("fiuu, fiuuu " + tekst +  " fiuuu");
    }
}
