package main;

import parser.*;
import input.*;

public class Main {

    public static void main(String[] args) { 
        String comment;
        
        comment = DayComment.comment("monday");
        FoodInfo.food(comment);
    }
}