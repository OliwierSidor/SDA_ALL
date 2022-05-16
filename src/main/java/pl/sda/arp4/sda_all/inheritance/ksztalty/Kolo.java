package pl.sda.arp4.sda_all.inheritance.ksztalty;

public class Kolo extends Ksztalt{
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double obliczPole(){
        return Math.PI * promien * promien;
    }

    @Override
    public double obliczObwod() {
        return  2*Math.PI * promien;
    }
}
