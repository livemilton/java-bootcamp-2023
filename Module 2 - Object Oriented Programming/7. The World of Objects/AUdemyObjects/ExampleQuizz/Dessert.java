package ExampleQuizz;

public class Dessert {

    private String name;
    private double price;

    public Dessert(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Dessert(Dessert source) {
        this.name = source.name;
        this.price = source.price;
    }

    public String toString() {
        return "Name: " + this.name + ". Price: " + this.price + ".\n";
    }
}
