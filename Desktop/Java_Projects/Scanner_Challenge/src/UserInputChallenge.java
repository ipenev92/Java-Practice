
import java.util.*;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = 0;
        int lowest = 0;
        boolean first = true;
        try {
            while (true) {
                System.out.println("Enter number: ");
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    highest = number;
                    lowest = number;
                }

                if (number > highest) {
                    highest = number;
                }

                if (number < lowest) {
                    lowest = number;
                }
            }
        } catch (InputMismatchException Error) {
            System.out.println("Value entered not a number");
            System.out.println("Java Error text: " + Error);
        }

        scanner.close();
        System.out.println("*****************");
        System.out.println("lowest number: " + lowest);
        System.out.println("highest number: " + highest);

        String asdf = "TEST";

        String new_string = asdf.toLowerCase();

        System.out.println(new_string);

    }
}
