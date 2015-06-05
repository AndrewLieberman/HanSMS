/* 
 * The original Hans' page was unfortunately
 * recently deleted, so an archived version was 
 * utilized instead and read in as an HTML file.
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
 * As a side note, all of the caught exceptions
 * send a message to the user stating the 
 * error.
 */

package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import twilio.SMSSender;

public class FoodInfo {

    public static String food(String day, String mealtime) {
        Document doc;
        Elements elms;
        String link, dayIndex, nextDayIndex, nextMealTime, daySubstr, 
                mealSubstr, output = "";
        int dayIndexNum, nextDayIndexNum, mealNum, nextMealNum;
        
        //Menus should start on Mondays, or else we're doomed
        //link = "http://www.drexelcampusdining.com/" + CurrentDate.dateLink();
        dayIndex = DayIndex.changer(day);
        nextDayIndex = NextDayIndex.changer(day);
        nextMealTime = NextMealTime.nextMeal(mealtime);
        
        String totalLink = "";

        try {
            File file = new File("page.html");
            Scanner scan = new Scanner(Paths.get("page.html"));

            while(scan.hasNextLine()) {
                String line = scan.nextLine();

                totalLink += line;
                totalLink += "\n";
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            SMSSender.sender("FileNotFoundException caught");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            SMSSender.sender("IOException caught");
        }
    
        doc = Jsoup.parse(totalLink);
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
        
      
        mealSubstr = mealSubstr.replace("\n\n\n", "").replace("\r", "");
        mealSubstr = mealSubstr.replace("\n\n\n\n", "").replace("\r", "");
        mealSubstr = mealSubstr.replace("\n\n\n\n\n", "").replace("\r", "");
        
        return mealSubstr;
    }         
}