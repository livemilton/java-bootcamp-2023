public class Shirt {

    String brand;
    double price;
    String size;

    // constructor ...
    public Shirt(String brand, double price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public String getSize() {
        return this.size;
    }

}
