package parser;

import input.DayInput;

public class DayPage {
    
    public static String webpage() {
        String site, fullSite;
   
        site = "http://www.drexelcampusdining.com/WeeklyMenu.htm";
        fullSite = site + "#" + DayInput.correctDay;

        return fullSite;
    }
}