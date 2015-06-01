/* 
 * During the element loop, an alternate HTML page 
 * that just shows relevant food info appears.
 * This is due to the webmaster coding in error 
 * handler, but allowing relevant info to appear.
 * So, what's returned is not the very long
 * default webpage.
 * During the loop, a string sums up the element 
 * information.
 * Lastly, the user's desired food info is parsed
 * by breaking up the string into substrings.
 */

/*
 * TODO 
 * Implement repective Twilio libraries in
 * order to send requested food info to user's 
 * mobile device.
 */

package parser;

import date.CurrentDate;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FoodInfo {

    public static void food(String day, String mealtime) {
        Document doc;
        Elements elms;
        String link, dayIndex, nextDayIndex, nextMealTime, daySubstr, 
                mealSubstr, output = "";
        int dayIndexNum, nextDayIndexNum, mealNum, nextMealNum;
        
        //Menus should start on Mondays, or else we're doomed
        link = "http://www.drexelcampusdining.com/" + CurrentDate.dateLink();
        dayIndex = DayIndex.changer(day);
        nextDayIndex = NextDayIndex.changer(day);
        nextMealTime = NextMealTime.nextMeal(mealtime);
        
        try {
            doc = Jsoup.connect(link).get();
            elms = doc.getAllElements();
            
            for(Element e : elms) {
                output += e.ownText();
                output += "\n";
            }
            
            dayIndexNum = output.indexOf(dayIndex);
            nextDayIndexNum = output.indexOf(nextDayIndex);
            daySubstr = output.substring(dayIndexNum, nextDayIndexNum);
           
            mealNum = daySubstr.indexOf(mealtime);
            nextMealNum = daySubstr.indexOf(nextMealTime);
            mealSubstr = daySubstr.substring(mealNum, nextMealNum);
            
            mealSubstr = mealSubstr.replace("\n\n", "").replace("\r", "");
            
            System.out.println(mealSubstr);
            
        } catch (IOException ex) {
            Logger.getLogger(FoodInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }         
}
