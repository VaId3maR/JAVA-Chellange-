package Challenge_Level_1;

public class Challenge_1 {

    // The method has an error - correct it - let it return SUM
    public static int sum(int a, int b) {
        return a - b;
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        if (sum(3, 5) == 8) {
            System.out.println("Correct! Go to next challenge!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}