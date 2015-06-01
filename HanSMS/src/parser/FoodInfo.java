/*
 * TODO
 * Apply the mealtime argument so 
 * corresponding meals will be printed.
 * I want to find the comment in the body.
 * I will loop from there and print out the food until
 * the next day's comment is found.
 */

package parser;

import date.CurrentDate;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class FoodInfo {

    public static void food(String comment) {
        Document doc;
        Element elm, temp;
        String link, tempText, text;

        //Menus should start on Mondays, or else we're doomed
        link = "http://www.drexelcampusdining.com/" + CurrentDate.dateLink();

        try {

            doc = Jsoup.connect(link).get();

            //Will change incrementer length to something not arbitrary
            for (int i = 0; i < 15; i++) {
                elm = doc.select("span[class=ul]").get(i);
                text = elm.text();
                System.out.println(text);
            }

        } catch (IOException ex) {
            Logger.getLogger(FoodInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
