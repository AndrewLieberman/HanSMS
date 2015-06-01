/*
 * Gets the successive mealtime in order to 
 * create a proper substring in FoodInfo
 */
package parser;

public class NextMealTime {
    public static String nextMeal(String meal) {
        
        if(meal.equals("BREAKFAST"))
            return "LUNCH";
        else if(meal.equals("LUNCH"))
            return "DINNER";
        else   
            return "";
    }
}
