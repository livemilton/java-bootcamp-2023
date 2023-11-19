import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {

        // The workbook contains an array that stores four prices.
        double[] price = {1.99, 2.99, 3.99, 4.99};

        // The workbook contains an array that stores four prices.
        double[] afterTax = new double[price.length];

        // See instructions on Learn the Part (Workbook 6.9)
        System.out.println("The original prices are: " + Arrays.toString(price));

        for (int i = 0; i < price.length; i++) {
            afterTax[i] = ((price[i] * 0.13) + price[i]);
        }
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));

    }
}
