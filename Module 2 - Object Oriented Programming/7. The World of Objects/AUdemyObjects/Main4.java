public class Main4 {
    public static void main(String[] args) {

        // Array
        // String[] spareparts = new String[] { "Tires", "Keys" };

        CarConstructor carConstructor_1 = new CarConstructor("Nissan", 10000, 2020, "Green",
                new String[] { "Tires", "Keys" });

        // Change a carparts
        String[] carParts = carConstructor_1.getParts();
        carParts[0] = "Filter";

        CarConstructor dodge = new CarConstructor("Dodge", 11000, 2019, "Blue", new String[] { "Tires", "Keys" });

        // spareparts[0] = "Filter";
        CarConstructor carConstructor_2 = new CarConstructor(carConstructor_1);
        carConstructor_2.setColor("Yellow");

        carConstructor_2.drive();
        /*
         * carConstructor_2.setColor("Yellow");
         * carConstructor_1.setColor("Orange");
         * carConstructor_2.setColor("Blue");
         * carConstructor_1.setColor("Purple");
         * carConstructor_2.setColor("Fuchsia");
         * carConstructor_1.setColor("Beige");
         */

        /*
         * System.out.println("This " + carConstructor_1.getMake() + " is worth $" +
         * carConstructor_1.getPrice() +
         * ". It was built in " + carConstructor_1.getYear() + ". It is " +
         * carConstructor_1.getColor() + ".\n");
         *
         * System.out.println("This " + dodge.getMake() + " is worth $" +
         * dodge.getPrice() +
         * ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() +
         * ".\n");
         */
    }
}
