package pl.sda.arp4.sda_all.zadaniadomowe.samochod;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new Car("GKA1");
        Car car2 = new Car("GKA2");
        Car car3 = new Car("GKA3");

        garage.entry(car1);
        garage.entry(car2);
        garage.entry(car3);

        garage.departure("GKA2");

        garage.carStartRegisterNumber("GK");

        garage.departure("GKA3");
        garage.carInGarage();
        garage.carInGarageRegisterNumber();

        Optional<Car> maybeCar = garage.carDeparture("GKA3");
        if (maybeCar.isPresent()){
            Car carDeparture = maybeCar.get();
            System.out.println("Wyjechał: " + carDeparture.getRegistationNumber());
        }else{
            System.out.println("Skradziono");
        }
    }
}
