package Challenge_Level_2;

public class Challenge_4 {

    // The method has an error - correct it - n is a prime number
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return false;
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        if (isPrime(5)) {
            System.out.println("Correct! Go to next challenge!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}