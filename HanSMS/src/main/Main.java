package main;

import com.twilio.sdk.TwilioRestException;
import twilio.SMSSender;
import java.util.Scanner;
import parser.*;
import input.*;
import twilio.GetUser;

public class Main {

    public static void main(String[] args) {
        String totalInput, dayInput, mealInput, dayCorrect, mealCorrect, 
                food = "";
        String[] parts = null;
        Scanner scan = new Scanner(System.in);
        
        totalInput = scan.nextLine();
        totalInput = totalInput.replaceAll("\\s", "");
        
        if(totalInput.contains(",")) {
            parts = totalInput.split(",");
            dayInput = parts[0];
            mealInput = parts[1];
             
            dayCorrect = DayInput.userInput(dayInput);
            mealCorrect = MealTimeInput.userInput(mealInput);
            
            food = FoodInfo.food(dayCorrect, mealCorrect);
        } else 
            SMSSender.sender("Comma required!");
        
        SMSSender.sender(food);
        //GetUser.user();
    }
}