public class WorkSchedule {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        int day = 6; // 3rd day of the week...
        boolean holiday = false;

        // IF - ELSE IF - ELSE HERE!
        if (day == 3 && holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 3 || holiday) {
            System.out.println("Wake up at 7:00 :(");
        } else if (day == 6 || day == 7 || holiday) {
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("work!");
        }

        }

    }
