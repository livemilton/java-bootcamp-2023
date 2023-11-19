public class MainToString {

    public static void main(String[] args) {

        CarConstructor nissan = new CarConstructor("Nissan", 10000, 2020, "Green", new String[] { "tires", "keys" });
        CarConstructor dodge = new CarConstructor("Dodge", 11000, 2019, "Blue", new String[] { "Tires", "Keys" });

        CarConstructor nissan2 = new CarConstructor(nissan);

        System.out.println(nissan);
        System.out.println(dodge);
        System.err.println(nissan2);

    }
}
