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