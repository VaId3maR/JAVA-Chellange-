package Challenge_Level_1;

public class Challenge_5 {

    // The method has an error - correct it - should return correctly day - must add "Sunday" and "Unknown day"
    public static String dayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return "";
    }

    // Run and check if the result is correct
    public static void main(String[] args) {
        if (dayName(0).equals("Sunday") && dayName(7).equals("Unknown day")){
            System.out.println("Correct! Go to next level!");
        } else
            System.out.println("Wrong! Please try again!");
        }

}