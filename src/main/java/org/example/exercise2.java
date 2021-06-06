/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner inputStr = new Scanner(System.in);
        System.out.print("What is the input string? ");

        String userInput = inputStr.nextLine(); //scanning for user input
        int stringLength = userInput.replace(" ","").length(); //length of user input

        System.out.print(""+ userInput + " has "+ stringLength + " characters.");

    }
}
