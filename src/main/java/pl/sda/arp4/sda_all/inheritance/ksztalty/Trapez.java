package pl.sda.arp4.sda_all.inheritance.ksztalty;

public class Trapez extends Ksztalt{
    private double bokA, bokB, bokC, bokD;
    private double wysokość;

    public Trapez(double bokA, double bokB, double bokC, double bokD, double wysokość) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.bokD = bokD;
        this.wysokość = wysokość;
    }

    @Override
    public double obliczPole() {
        return ((bokA + bokB) * wysokość)/2;
    }

    @Override
    public double obliczObwod() {
        return 0;
    }
}
