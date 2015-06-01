/*
 * Sets days to their corresponding day indicies.
 * I.e., capitalized days that index the menu.
 */

package parser;

public class DayIndex {
    
    public static String changer(String day) {
        String dayChange;
        
        switch(day) {
            case "sunday":
                dayChange = "S U N D A Y";
                break;
            case "monday":
                dayChange = "M O N D A Y";
                break;
            case "tuesday":
                dayChange = "T U E S D A Y";
                break;
            case "wednesday":
                dayChange = "W E D N E S D A Y";
                break;
            case "thursday":
                dayChange = "T H U R S D A Y";
                break;
            case "friday":
                dayChange = "F R I D A Y";
                break;
            case "saturday":
                dayChange = "S A T U R D A Y";
                break;
            default:
                dayChange =  "";
                break;             
        }
        
        return dayChange;
    }
}
