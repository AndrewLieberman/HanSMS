package main;

import input.DayInput;
import parser.DayPage;

public class Main {

    public static void main(String[] args) {
        String link;

        DayInput.userInput();
        link = DayPage.webpage();

        System.out.println(link);
    }
}
 