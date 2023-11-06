public class ReturnValues {
    public static void main(String[] args) {

        // 2.Call the function by passing in two matching values.
        // arguments
        // 3. THE FUNCTION CALL RETAINS THE RETURN VALUE
        double area1 = calculateArea(2.3, 3.6);

        // double area2 = calculateArea(1.6, 2.4);

        // double area3 = calculateArea(2.6, 4.2);

        printArea(2.3, 3.6, area1);

        // calculateArea(-5, 2.3);

        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);

        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");
    }

    // 1.Create a function that expects to receive double length, double width.
    // parameters
    // 1. YOUR FUNCTION MUST DEFINE A RETURN TYPE
    public static double calculateArea(double length, double width) {

        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }

        // 3.The function uses its parameters to perform a task
        double area = length * width;

        // 2. YOUR FUNCTION MUST RETURN A VALUE
        return area;

    }

    public static String explainArea(String language) {

        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";

            default:
                return "Language not available";
        }

    }

    public static void printArea(double length, double width, double area) {
        System.out.println(
                "A rectangle with a length of " + length + " and a width of " + width + " has an area of" + area);

    }
}
