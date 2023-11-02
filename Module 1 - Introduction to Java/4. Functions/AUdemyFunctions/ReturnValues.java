public class ReturnValues {
    public static void main(String[] args) {

        // 2.Call the function by passing in two matching values.
        // arguments
        // 3. THE FUNCTION CALL RETAINS THE RETURN VALUE
        double area1 = calculateArea(2.3, 3.6);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.2);
    }

    // 1.Create a function that expects to receive double length, double width.
    // parameters
    // 1. YOUR FUNCTION MUST DEFINE A RETURN TYPE
    public static double calculateArea(double length, double width) {

        // 3.The function uses its parameters to perform a task
        double area = length * width;

        // 2. YOUR FUNCTION MUST RETURN A VALUE
        return area;

    }
}
