package Challenge_Level_2;

public class Challenge_2 {

    // The method has an error - correct it - return the sum of all elements in the array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        if (sumArray(numbers) == 10) {
            System.out.println("Correct! Go to next challenge!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}