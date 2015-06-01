/*
 * Finds the index of the successive day.
 * E.g., if it is Monday, this class will 
 * search for the "T U E S D A Y" index.
 */

package parser;

public class NextDayIndex {

    public static String changer(String day) {
        String dayChange;

        switch (day) {
            case "sunday":
                dayChange = "M O N D A Y";
                break;
            case "monday":
                dayChange = "T U E S D A Y";
                break;
            case "tuesday":
                dayChange = "W E D N E S D A Y";
                break;
            case "wednesday":
                dayChange = "T H U R S D A Y";
                break;
            case "thursday":
                dayChange = "F R I D A Y";
                break;
            case "friday":
                dayChange = "S A T U R D A Y";
                break;
            case "saturday":
                dayChange = "S U N D A Y";
                break;
            default:
                dayChange =  "";
                break;             
        
        }
        return dayChange;
    }
}
