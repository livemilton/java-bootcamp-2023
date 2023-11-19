public class MainDessert {

    public static void main(String[] args) {

        Dessert cake = new Dessert(4.99);
        Dessert pie = new Dessert(cake);

        String[] ingredients = new String[] { "Eggs", "Flower", "Baking Powder" };
        pie.setIngredients(ingredients);

        ingredients[2] = "Filling";
        /** BREAKPOINT */

        // Dessert cake = new Dessert(4.99);
        // cake.setIngredients(new String[] { "Eggs", "Flower", "Baking Powder" });

        // String[] randomArray = cake.getIngredients();
        // randomArray[2] = "Filling";

        /*** BREAKPOINT 1 ***/

        // cake.setIngredients(new String[] { "Eggs", "Flower", "Baking Powder" });
        // Dessert pie = new Dessert(cake);

        /*** BREAKPOINT 2 ***/

    }
}
