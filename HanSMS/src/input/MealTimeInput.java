package input;

import java.util.Arrays;
import java.util.Scanner;

public class MealTimeInput {

    public static String mealTime = "";
    public static String correctMealTime = "";
    public static String[] times = {"breakfast", "lunch", "dinner"};

    public static String userInput() {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter a mealtime: ");
            mealTime = scan.nextLine();
            mealTime = mealTime.toLowerCase();
            correctMealTime = mealTime.replaceAll("\\s", "");

            if (Arrays.asList(times).contains(correctMealTime) == false) 
                System.err.println("Invalid mealtime!");

        } while (Arrays.asList(times).contains(correctMealTime) == false);

        return correctMealTime;
    }
}
