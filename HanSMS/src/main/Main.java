package main;

import input.MealTimeInput;
import parser.TagCount;

public class Main {

    public static void main(String[] args) {
        String meal;
        
        meal = MealTimeInput.userInput();        
        System.out.println(TagCount.count(meal));
    }
}