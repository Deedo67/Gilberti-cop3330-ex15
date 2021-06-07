package MPE15.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex15 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the username? ");
        String username = in.nextLine();
        System.out.print("What is the password? ");
        String password = in.nextLine();

        //known variable
        String pass = "abc$123";

        //Output
        if (password.equals(pass))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
    //main method end
}
//class end
