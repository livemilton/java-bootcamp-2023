import java.util.HashMap;

public class MainStudent {

    public static void main(String[] args) {
        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 18);
        Student charlie = new Student("Charlie", 22);

        HashMap<Student, Integer> map = new HashMap<>();
        map.put(alice, 1);
        map.put(bob, 2);
        map.put(charlie, 3);

        Student aliceQuery = new Student("Alice", 20);
        System.out.println(map.get(aliceQuery));
    }
}
