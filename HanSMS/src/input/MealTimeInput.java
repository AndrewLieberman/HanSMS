/*
 * Accepts input for the desired meal time.
 * Matches input to times[] array by first 
 * neglecting all spaces and setting the string
 * to lowercase.
 * Then, meal time is set to its respective
 * abbreviation.
 */

/*
 * TODO
 * Accept input from the main method, then 
 * implement repective Twilio libraries in
 * order to accept user input from a mobile 
 * device.
 */

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

        if("breakfast".equals(correctMealTime))
            correctMealTime = "BREAKFAST";
        else if("lunch".equals(correctMealTime))
            correctMealTime = "LUNCH";
        else 
            correctMealTime = "DINNER";
        
        return correctMealTime;
    }
}
