package pl.sda.arp4.sda_all.interfejsy.zadanieIShape;

public class Prostokat implements IShape {
    private double bokA, bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obliczPole() {
        return (bokA * bokB);
    }

    @Override
    public double obliczObwod() {
        return (2 * bokA) + (2 * bokB);
    }
}
