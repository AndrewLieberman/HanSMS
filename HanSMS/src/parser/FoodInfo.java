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
            doc = Jsoup.connect("http://www.drexelcampusdining.com/WeeklyMenu.htm").get();
            
        
        } catch (IOException ex) {
            Logger.getLogger(FoodInfo.class.getName()).log(Level.SEVERE, null, ex);
        }


        return "";
    }

}
