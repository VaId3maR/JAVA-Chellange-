package Challenge_Level_2;

import java.util.Random;

public class Challenge_5 {

    public static boolean playGame(int userGuess) {
        Random random = new Random(123);
        int number = random.nextInt(100) + 1;
        return userGuess == number;
    }

    // Run and check if the result is correct
    // Find a winner number
    public static void main(String[] args) {
        boolean result = playGame(9); // <--- correct these number !!!
        if (result) {
            System.out.println("Correct! Go to next level!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}