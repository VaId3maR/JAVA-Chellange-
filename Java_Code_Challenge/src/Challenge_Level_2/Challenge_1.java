package Challenge_Level_2;

public class Challenge_1 {

    // The method has an error - correct it - return 0 if division by zero occurs
    public static int safeDivide(int a, int b) {
        return a / b;
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        if (safeDivide(10, 5) == 2 && safeDivide(10, 0) == 0) {
            System.out.println("Correct! Go to next challenge!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}