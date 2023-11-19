public class Grocer {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.3).

        // In this workbook, your job is to help customers find what they're looking
        // for.

        // Create an array that stores aisles.
        String[] aisles = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

        // A customer is looking for coffee.
        System.out.println("\nDo you sell coffee?");

        // Create a for loop that searches the array for the coffee aisle.
        // 0 1 2 3 4 5
        // "apples", "bananas", "candy", "chocolate", "coffee", "tea"

        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals("coffee")) {
                // Once you find the aisle (when your condition is true), display the following
                // message:
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }

    }
}
