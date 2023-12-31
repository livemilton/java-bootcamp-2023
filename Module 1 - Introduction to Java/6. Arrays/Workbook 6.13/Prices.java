public class Prices {
    public static void main(String[] args) {
        // The instructions for this workbook are on Learn the Part (workbook 6.13)
        // Task 1
        // Create a 2D array of double values that can hold 3 rows and 5 elements per
        // row.
        double[][] prices = new double[3][5];

        // Task 2
        // Populate your 2D array with values from the following table:
        prices[0][0] = 12.99;
        prices[0][1] = 8.99;
        prices[0][2] = 9.99;
        prices[0][3] = 10.49;
        prices[0][4] = 11.99;

        prices[1][0] = 0.99;
        prices[1][1] = 1.99;
        prices[1][2] = 2.49;
        prices[1][3] = 1.49;
        prices[1][4] = 2.99;

        prices[2][0] = 8.99;
        prices[2][1] = 7.99;
        prices[2][2] = 9.49;
        prices[2][3] = 9.99;
        prices[2][4] = 10.99;

        // Task 3
        // Print the prices of each row using this format:

        System.out.println("\tBaking: " + prices[0][0] + " " + prices[0][1] + " " + prices[0][2] + " " + prices[0][3]
                + " " + prices[0][4]);
        System.out.println("\tBeverage: " + prices[1][0] + " " + prices[1][1] + " " + prices[1][2] + " " + prices[1][3]
                + " " + prices[1][4]);
        System.out.println("\tCereals: " + prices[2][0] + " " + prices[2][1] + " " + prices[2][2] + " " + prices[2][3]
                + " " + prices[2][4]);

        // Task 4
        double[][] prices1 = {
                { 12.99, 8.99, 9.99, 10.49, 11.99 },
                { 0.99, 1.99, 2.49, 1.49, 2.99 },
                { 8.99, 7.99, 9.49, 9.99, 10.99 }
        };

        System.out
                .println("\tBaking: " + prices1[0][0] + " " + prices1[0][1] + " " + prices1[0][2] + " " + prices1[0][3]
                        + " " + prices1[0][4]);
        System.out.println(
                "\tBeverage: " + prices1[1][0] + " " + prices1[1][1] + " " + prices1[1][2] + " " + prices1[1][3]
                        + " " + prices1[1][4]);
        System.out
                .println("\tCereals: " + prices1[2][0] + " " + prices1[2][1] + " " + prices1[2][2] + " " + prices1[2][3]
                        + " " + prices1[2][4]);
    }
}
