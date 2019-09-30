package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String Here: ");
        String input=scanner.nextLine();
        //following method will not work in java due to immutable nature of String.
        int initialCount=input.length();
        System.out.println("Enter character you want to check: ");
        String charString= scanner.next(); //this will take first letter of entered string through key board.
        String secondString= input.replace(charString,"");
        int finalCount=secondString.length();
        int answer=initialCount-finalCount;
        System.out.println("Character a has occurred "+answer+" times");
    }
}
