package pl.sda.arp4.sda_all.interfejsy.zadanieIShape;

public class Kwadrat implements IShape {
    private double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    public double obliczPole() {
        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return 4 * dlugoscBoku;
    }
}
