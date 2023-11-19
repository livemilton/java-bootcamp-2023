import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {

        // updating array with index
        String[] menu = { "Espresso", "Iced Coffe", "Macchiato" };
        menu[2] = "Latte";

        System.out.println(Arrays.toString(menu));
        // To update a size in array , make a new array
        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }

        newMenu[3] = "house Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }

}
