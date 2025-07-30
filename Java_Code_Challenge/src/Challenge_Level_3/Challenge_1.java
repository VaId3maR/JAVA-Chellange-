package Challenge_Level_3;

public class Challenge_1 {

    public static String machine1(String commandName) {
        if (commandName.equals("alive")) {
            return "alive:11101001101:end";
        } else {
            return "alive:no";
        }
    }

    // Create method that accept a variable from machine1 and extracts numbers (hint: regex)
    public static String exhaustionNumbers(String commandName) {
        return "";
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        String numbers = exhaustionNumbers(machine1("alive"));
        if (numbers.equals("11101001101")) {
            System.out.println("Correct! Go to next level!");
        } else {
            System.out.println("Wrong! Please try again!");
        }
    }

}