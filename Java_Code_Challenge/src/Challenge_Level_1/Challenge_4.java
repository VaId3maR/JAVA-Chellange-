package Challenge_Level_1;

public class Challenge_4 {

    // The method has an error - correct it - sum of the numbers from 1 to n
    public static int sumNumbersToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i--) {
            sum -= i; //
        }
        return sum;
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        if (sumNumbersToN(3) == 6) {
            System.out.println("Correct! Go to next challenge!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}