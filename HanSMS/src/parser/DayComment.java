/*
 * Sets days to their corresponding day comments.
 * I.e., their HTML comments from the Hans source page.
 */

package parser;

public class DayComment {
    
    public static String comment(String day) {
        String commentHTML;
        
        switch(day) {
            case "sunday":
                commentHTML = "<!-- SUNDAY -->";
                break;
            case "monday":
                commentHTML = "<!-- MONDAY -->";
                break;
            case "tuesday":
                commentHTML = "<!-- TUESDAY -->";
                break;
            case "wednesday":
                commentHTML = "<!-- WEDNESDAY -->";
                break;
            case "thursday":
                commentHTML = "<!-- THURSDAY -->";
                break;
            case "friday":
                commentHTML = "<!-- FRIDAY -->";
                break;
            case "saturday":
                commentHTML = "<!-- SATURDAY -->";
                break;
            default:
                commentHTML =  "";
                break;             
        }
        
        return commentHTML;
    }
}
