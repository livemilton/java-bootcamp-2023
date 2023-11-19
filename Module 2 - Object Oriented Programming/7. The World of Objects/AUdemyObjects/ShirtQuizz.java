public class ShirtQuizz {

    private String brand;
    private double price;
    private String size;

    public ShirtQuizz(String brand, double price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public ShirtQuizz(double price, String size) {
        this.brand = "No name";
        this.price = price;
        this.size = size;
    }

    public ShirtQuizz(double price) {
        this.brand = "No name";
        this.price = price;
        this.size = "One size fits all";
    }

    public ShirtQuizz(ShirtQuizz source) {
        this.brand = source.brand;
        this.price = source.price;
        this.size = source.size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
