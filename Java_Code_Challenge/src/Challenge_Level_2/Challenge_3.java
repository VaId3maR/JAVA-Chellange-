package Challenge_Level_2;

public class Challenge_3 {

    // The method has an error - correct it - return the sum of numbers from 1 to n
    public static int sumToN(int n) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
        } while (i <= n);
        return sum;
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        if (sumToN(5) == 15) {
            System.out.println("Correct! Go to next challenge!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}