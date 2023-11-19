public class Main2 {
    public static void main(String[] args) {

        System.out.println("-----------------------------------");

        CarConstructor chevrolet = new CarConstructor("Chevrolet", 6000, 1998, "red");
        CarConstructor skoda = new CarConstructor("Skoda", 9001, 2000, "green");

        chevrolet.setColor("Jet Black");
        skoda.setColor("Jet Black");

        chevrolet.setPrice(chevrolet.getPrice() / 2);
        skoda.setPrice(skoda.getPrice() / 2);

        System.out.println("This " + chevrolet.getMake() + " is worth $" + chevrolet.getPrice() +
                ". It was built in " + chevrolet.getYear() + ". It is " + chevrolet.getColor() + ".\n");

        System.out.println("This " + skoda.getMake() + " is worth $" + skoda.getPrice() +
                ". It was built in " + skoda.getYear() + ". It is " + skoda.getColor() + ".\n");
    }

}
