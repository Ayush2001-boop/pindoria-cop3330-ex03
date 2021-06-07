package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String quote;
        System.out.print("What is the quote? ");
        quote = input.nextLine();
        String person;
        System.out.print("Who said it? ");
        person = input.nextLine();

        System.out.printf("%s says, \"%s\"", person, quote);

    }//end main method
}//end classB