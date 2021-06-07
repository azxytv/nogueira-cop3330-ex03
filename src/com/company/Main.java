package com.company;
import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Adam Nogueira
 */

public class Main {

    public static void main(String[] args) {
        Scanner inputSt = new Scanner(System.in);
        Scanner inputAu = new Scanner(System.in);
        System.out.println("What is the quote?");

        String quotestr = inputSt.nextLine();

        System.out.println("Who said it?");

        String author = inputAu.nextLine();


        System.out.println( author + " Says,\"" + quotestr + " \"");These

    }
}
