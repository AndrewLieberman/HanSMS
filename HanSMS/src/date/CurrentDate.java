/*
 * Extracts the current date and checks to see 
 * if it is Monday.
 * If it is not Monday, a switch statement 
 * decrements or increments the day until it is 
 * equal to Monday.
 * The amount added or subtracted will be relative 
 * to the calendar date, not Java's Date class 
 * (i.e., where Monday = 1).
 * Eventually, the week's Hans page is returned 
 * as a string.
 */

package date;

import java.util.Date;
import java.util.Calendar;

public class CurrentDate {

    public static String dateLink() {
        Date date;
        Calendar cal;
        int day, calDay, calMonth, calYear;
        String dayConv, monthConv, yearConv, totalLink;

        date = new Date();
        cal = Calendar.getInstance();
        day = date.getDay(); //Between 0 and 6
        calDay = cal.get(Calendar.DATE);
        calMonth = cal.get(Calendar.MONTH) + 1;
        calYear = cal.get(Calendar.YEAR) - 2000;
        
        switch(day) {
            case 0:
                calDay++;
                break;
            case 2:
                calDay--;
                break;
            case 3:
                calDay -= 2;
                break;
            case 4:
                calDay -= 3;
                break;
            case 5:
                calDay -= 4;
                break;
            case 6:
                calDay -= 5;
                break;  
            default:
                break;
        }
       
        dayConv = Integer.toString(calDay);
        monthConv = Integer.toString(calMonth);
        yearConv = Integer.toString(calYear);
        totalLink = "Hans" + monthConv + "." + dayConv + "." + yearConv + ".htm";
        
        return totalLink;
    }
}