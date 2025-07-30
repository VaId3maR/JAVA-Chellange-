package Challenge_Level_1;

public class Challenge_2 {

    // The method has an error - correct it - let it return TRUE for even numbers
    public static boolean evenNumber(int n) {
        return n % 2 == 1;
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        if (evenNumber(4)) {
            System.out.println("Correct! Go to next challenge!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}