/*
 * TODO
 * The current Hans webpage is not WeeklyMenu.htm.
 * Rather, for example, it is Hans5.18.15.htm for 
 * the week of Monday, May 18, 2015. Later, I can
 * implement a Java library to obtain the current
 * date. Additionally, I would like the tag counter
 * to cease incrementing once it hits the current 
 * day (which can be found in HTML comments). From 
 * there, I can pass the correct menu tag to the
 * FoodInfo class, which will read off the info of
 * the respective tag. I will change the TagCount's 
 * return type when necessary.
 */

package parser;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TagCount {

    public static int count(String mealTime) {
        Document doc;
        Elements elm;
        int brkCount = 0, lunCount = 0, dinCount = 0;

        try {
            doc = Jsoup.connect("http://www.drexelcampusdining.com/WeeklyMenu.htm").get();
            elm = doc.select("tr[class]");

            for (Element e : elm) {
                if ("brk".equals(e.attr("class"))) 
                    brkCount++;
                else if ("lun".equals(e.attr("class"))) 
                    lunCount++;
                else 
                    dinCount++;
            }
                  
        } catch(IOException ex) {
            Logger.getLogger(TagCount.class.getName()).log(Level.SEVERE, null, ex);
        }

        if("brk".equals(mealTime)) 
            return brkCount;
        else if("lun".equals(mealTime)) 
            return lunCount;
        else
            return dinCount;
    }    
}
