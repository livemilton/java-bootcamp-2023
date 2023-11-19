public class MainShirtQuizz {
    public static void main(String[] args) {

        ShirtQuizz nike = new ShirtQuizz("Nike", 20.99, "Small");

        ShirtQuizz nike2 = new ShirtQuizz(nike);
        nike2.setSize("Large");

        System.out.println("Brand: " + nike.getBrand());
        System.out.println("Price: " + nike.getPrice());
        System.out.println("Size: " + nike.getSize());

    }
}
