import java.util.Arrays;
import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to:");
        System.out.println("[1] check if one string shows up at the end of another?");
        System.out.println("[2] Or check for repetition within a string?");
        int choice = input.nextInt();
        input.nextLine();


        if (choice == 1) {
            System.out.println("Type your first string:");
            String text1 = input.nextLine();
            System.out.println("Type your second string:");
            String text2 = input.nextLine();
            if (endOther(text1, text2)) {
                System.out.println("One of your strings is at the end of the other.");
            } else {
                System.out.println("Neither of your strings is at the end of the other.");
            }
        } else if (choice == 2) {
            System.out.println("Type your string:");
            String text = input.nextLine();
            if (findRepeats(text)) {
                System.out.println("There are repeats.");
            } else {
                System.out.println("There are no repeats.");
            }
        }
    }

    public static boolean endOther(String a, String b) {
        String flatText1 = a.toLowerCase();
        String flatText2 = b.toLowerCase();
        if (flatText1.length() == flatText2.length()) {
            return flatText1.equals(flatText2);
        } else if (flatText1.length() < flatText2.length()) {
            String text2Ending = flatText2.substring(flatText2.length() - flatText1.length());
            return text2Ending.equals(flatText1);
        } else {
            String text1Ending = flatText1.substring(flatText1.length() - flatText2.length());
            return text1Ending.equals(flatText2);
        }
    }

    public static boolean findRepeats(String toTest) {
        for (int i = 2; i <= toTest.length() / 2; i++) {
            for (int innerI = 0; innerI < toTest.length() - i; innerI++) {
                if (toTest.indexOf(toTest.substring(innerI, i), innerI) >= 0) {
                    return true;
                }
            }
        }


        return false;
    }
}
