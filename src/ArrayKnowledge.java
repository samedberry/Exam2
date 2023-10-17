import java.util.Arrays;
import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like an array of?");
        System.out.println("[1] characters");
        System.out.println("[2] integers");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.println("Please type something:");
            String text = input.nextLine();
            System.out.println("Your array is as follows:");
            System.out.println(Arrays.toString(stringToArray(text)));
        } else if (choice == 2) {
            System.out.println("What is your starting number?");
            int start = input.nextInt();
            System.out.println("What is your upper limit?");
            int end = input.nextInt();
            System.out.println("How big are your steps?");
            int step = input.nextInt();
            System.out.println("Here is your array:");
            System.out.println(Arrays.toString(generateArrayWithBounds(start, end, step)));
        }
    }

    public static char[] stringToArray(String text) {
        char[] breakout = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            breakout[i] = text.charAt(i);
        }
        return breakout;
    }

    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int range = end - start;
        int[] array;
        if (range == 0) {
            array = new int[0];
            return array;
        }
        if (range > 0 && range % step == 0) {
            array = new int[range / step];
        } else {
            array = new int[range / step + 1];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = start + step * i;
        }
        return array;
    }
}
