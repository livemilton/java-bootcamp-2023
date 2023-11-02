public class Parameters {

    public static void main(String[] args) {

        // 2.Call the function by passing in two matching values.
        // arguments
        calculateArea(2.3, 3.6);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.2);
    }

    // 1.Create a function that expects to receive double length, double width.
    // parameters
    public static void calculateArea(double length, double width) {

        // 3.The function uses its parameters to perform a task
        double area = length * width;
        System.out.println("Area: " + area);

    }
}
