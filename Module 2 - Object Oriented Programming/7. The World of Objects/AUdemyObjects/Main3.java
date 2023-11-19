public class Main3 {
    public static void main(String[] args) {

        Shirt nike = new Shirt("Nike", 20.99, "Small");

        String brand = nike.getBrand();
        brand = "woops, accidental update";

        System.out.println("Brand: " + nike.getBrand());
        System.out.println("Price: " + nike.getPrice());
        System.out.println("Size: " + nike.getSize());
    }
}
