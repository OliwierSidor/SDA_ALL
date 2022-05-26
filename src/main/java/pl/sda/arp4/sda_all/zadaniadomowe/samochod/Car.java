package pl.sda.arp4.sda_all.zadaniadomowe.samochod;

public class Car {
    private final String registationNumber;

    public Car(String registationNumber) {
        this.registationNumber = registationNumber;
    }

    public String getRegistationNumber() {
        return registationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registerNumber='" + registationNumber + '\'' +
                '}';
    }
}
