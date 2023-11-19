package ExampleDeepCopy;

import java.util.*;

public class Dealership {

    private Car[] cars;

    public Dealership(Car[] cars) {

        // deep copy
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }

        // this.cars = Arrays.copyOf(cars, cars.length);
    }

    // deep copying
    // it´s creating duplicates f your objects yto maker sure that you're protecting
    // the internal state of your class
    // to make sure that sensitive information is not being leaked.

    // getter an setter to the index
    public Car getCar(int index) {
        // DEEP COPY
        Car copy = new Car(this.cars[index]);
        return copy;

    }

    public void setCar(int index, Car newCar) {
        // DEEP COPY
        Car copy = new Car(newCar);
        this.cars[index] = copy;
    }

    // method to choice the sell car
    public void sell(int index) {
        this.cars[index].drive();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}
