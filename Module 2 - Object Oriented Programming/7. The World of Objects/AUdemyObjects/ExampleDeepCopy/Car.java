package ExampleDeepCopy;

import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // Fix constructor to avoid reference trap in the parts array
    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // copy constructor to initialize an object
    // fix copy constructor to avoid reference trap
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // method drive
    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.color + " " + this.make + " for "
                + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    // method to String
    @Override
    public String toString() {
        return "Make: " + this.make + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Color: " + this.color + ".\n"
                + "Parts: " + Arrays.toString(parts) + ".\n";

    }
}
