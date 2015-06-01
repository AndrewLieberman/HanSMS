/*
 * Accepts user input for their desired day.
 * This program accepts spelling errors that 
 * include capitalizaiton and extra spaces.
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

public class DayInput {
    
    public static String day = "";
    public static String correctDay = "";
    public static String[] weekdays = {"sunday", "monday", "tuesday", 
        "wednesday", "thursday", "friday", "saturday"};

    public static String userInput() {
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Enter a day: ");
            day = scan.nextLine();
            day = day.toLowerCase();
            correctDay = day.replaceAll("\\s", "");
            
            if(Arrays.asList(weekdays).contains(correctDay) == false)
                System.err.println("Invalid day!");
            
        } while(Arrays.asList(weekdays).contains(correctDay) == false);
        
        return correctDay;
    }
}