import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("[1] get a green lottery ticket");
        System.out.println("[2] make chocolate");
        int choice = input1.nextInt();

        int firstNumber;
        int secondNumber;
        int thirdNumber;

        if (choice == 1) {
            System.out.println("Please enter your three lucky integers:");
            firstNumber = input1.nextInt();
            secondNumber = input1.nextInt();
            thirdNumber = input1.nextInt();
            System.out.println("You win " + greenTicket(firstNumber, secondNumber, thirdNumber));
        } else if (choice == 2) {
            System.out.println("Please enter the number of one pound chocolate bars you will make:");
            firstNumber = input1.nextInt();
            System.out.println("Please enter the number of five pound chocolate bars you will make:");
            secondNumber = input1.nextInt();
            System.out.println("Please enter a goal number for how many pounds of chocolate you want to sell:");
            thirdNumber = input1.nextInt();
            int chocolateResult = makeChocolate(firstNumber, secondNumber, thirdNumber);
            if (chocolateResult == -1) {
                System.out.println("Oh no! You didn't make enough chocolate.");
            } else {
                System.out.println("With that " + secondNumber + " five pound bars you will need to sell at least " + chocolateResult + " one pound bars to exactly meet your goal.");
            }
        }
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b & b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int makeChocolate(int small, int large, int goal) {
        int remainder = goal % 5;
        if (goal - (5 * large) < 5) {
            if (small - remainder >= 0) {
                return remainder;
            } else {
                return -1;
            }
        } else {
            if (goal - 5 * large - small <= 0) {
                return goal - 5 * large;
            } else {
                return -1;
            }
        }
    }
}
