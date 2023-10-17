/*
Question 3:
    Write a method named greenTicket
        takes three integer arguments: a, b and c
        returns an integer.
    You have a green lottery ticket, with ints a, b, and c on it.
    If the numbers are all different from each other, the result is 0.
    If all of the numbers are the same, the result is 20.
    If two of the numbers are the same, the result is 10.


Examples:
greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */

public class LogicKnowledge {
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("[1] get a green lottery ticket");
        System.out.println("[2] make chocolate");
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
}
