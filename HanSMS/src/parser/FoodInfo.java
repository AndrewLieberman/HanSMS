/*
 * TODO
 * On Hans source page, see relation between meal times and arrays 
 * Parse JavaScript and organize food from the arrays
 */

package parser;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import input.MealTimeInput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.select.Elements;

public class FoodInfo {

    public static String links = "";

    public static void food(String mealTime) {
        Document doc;
        Elements elm;

        try {
            doc = Jsoup.connect("http://www.drexelcampusdining.com/WeeklyMenu.htm").get();
            elm = doc.select(mealTime);
            
            for(Element e : elm) 
                System.out.println(e.attr(mealTime));
            
        } catch (IOException ex) {
            Logger.getLogger(FoodInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
