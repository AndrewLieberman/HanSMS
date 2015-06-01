package main;

import parser.*;
import input.*;

public class Main {

    public static void main(String[] args) {
        String dayInput, mealtime;

        dayInput = DayInput.userInput();
        mealtime = MealTimeInput.userInput();

        FoodInfo.food(dayInput, mealtime);
    }
}
