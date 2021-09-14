package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter a noun: " );

        Scanner scanner = new Scanner(System.in);
        String noun, verb, adjective, adverb;
        noun = scanner.nextLine();

        System.out.println( "Enter a verb: " );
        verb = scanner.nextLine();

        System.out.println( "Enter an adjective: " );
        adjective = scanner.nextLine();

        System.out.println( "Enter an adverb: " );
        adverb = scanner.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's Hilarious!%n", verb, adjective, noun, adverb);
    }
}
