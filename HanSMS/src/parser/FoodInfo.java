package parser;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class FoodInfo {

    public static String food() {
        Document doc;
        Element elm;
        
        try {
            doc = Jsoup.connect(DayPage.webpage()).get();
            //For tags:
            //Element elm = doc.getElementById(DayInput.correctDay);
        } catch (IOException ex) {
            Logger.getLogger(DayPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

}
