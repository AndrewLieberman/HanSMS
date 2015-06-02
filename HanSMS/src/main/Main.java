package main;

import java.util.Scanner;
import parser.*;
import input.*;

public class Main {

    public static void main(String[] args) {
        String totalInput, dayInput, mealInput, dayCorrect, mealCorrect;
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
            
            FoodInfo.food(dayCorrect, mealCorrect);
        } else 
            System.err.println("Comma required!");
    }
}