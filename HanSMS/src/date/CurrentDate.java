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
 * Also, there is a special case where Sunday is the 
 * last day of the month, so it rolls over to the 
 * first day (i.e., Monday) of the successive month.
 */

/*
 * TODO
 * Fix future errors for leap years and 31 December.
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
        calMonth = cal.get(Calendar.MONTH);
        calYear = cal.get(Calendar.YEAR) % 100;
        
        if(day != 0) { //I.e., if it's not Monday
            calDay -= day - 1;

            if(calDay > numDayForMonth(calMonth)) {
                calDay = 0;
                calMonth++;
            }
        }
        
        calMonth++;

        dayConv = Integer.toString(calDay);
        monthConv = Integer.toString(calMonth);
        yearConv = Integer.toString(calYear);
        totalLink = "Hans" + monthConv + "." + dayConv + "." + yearConv + ".htm";

        return totalLink;
    }

    private static int numDayForMonth(int n) {
        n = (n + 12) % 12; //Avoids month rollover

        switch(n) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}