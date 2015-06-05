/*
 * Accepts user input for their desired day.
 * This program accepts spelling errors that 
 * include capitalizaiton and extra spaces.
 */

/*
 * TODO
 * Implement repective Twilio libraries in
 * order to accept user input from a mobile 
 * device.
 */
package input;

import java.util.Arrays;
import twilio.SMSSender;

public class DayInput {

    public static String correctDay = "";
    public static String[] weekdays = {"sunday", "monday", "tuesday",
        "wednesday", "thursday", "friday", "saturday"};

    public static String userInput(String day) {

        day = day.toLowerCase();
        correctDay = day.replaceAll("\\s", "");

        if(Arrays.asList(weekdays).contains(correctDay) == false) {
            SMSSender.sender("Invalid day!");
            System.exit(0);
        }
        
        return correctDay;
    }
}