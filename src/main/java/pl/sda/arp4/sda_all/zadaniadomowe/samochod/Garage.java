package pl.sda.arp4.sda_all.zadaniadomowe.samochod;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Garage {
    private List<Car> carList = new ArrayList<>();

    public void entry(Car car) {
        carList.add(car);
    }

    public void departure(String registationNumber) {
        for (Car car : carList) {
            if (car.getRegistationNumber().equals(registationNumber)) {
                carList.remove(car);
                System.out.println("Wyjechał " + car);
                return;
            }
        }
        System.out.println("Nie ma samochodu o numerze rejstracyjnym: " + registationNumber);
    }

    public void carInGarage() {
        System.out.println("Lista samochodow w garzu: ");
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    public void carInGarageRegisterNumber() {
        System.out.println("Rejstracje samochdów");
        for (Car car : carList) {
            System.out.println(car.getRegistationNumber());
        }
    }

    public void carStartRegisterNumber(String startRegisterNumber) {
        for (Car car : carList) {
            if (car.getRegistationNumber().startsWith(startRegisterNumber)) {
                System.out.println(car);
            }
        }
    }

    public Optional<Car> carDeparture(String registerNumber) {
        for (Car car : carList) {
            if (car.getRegistationNumber().equals(registerNumber)) {
                return Optional.of(car);
            }
        }
        return Optional.empty();
    }
}
