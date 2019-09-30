//5. Write a program with the implementation of ​ Regular Expression​ to find the presence of the name
//Harry in a ​ string​ .
//Input: This is Harry.
//Output: Is Harry here ? true
//Input : This is Henry.
//Output: Is Harry here ? False

package com.stackroute;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter String here to check Harry is there or not, Input:  ");
        Scanner scanner=new Scanner(System.in);
        String enteredString=scanner.nextLine();
        System.out.print("Is Harry here ? ");
        //matcher start
        String regex="Harry";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(enteredString);
        if(matcher.find())
        {
            System.out.print("true");
            return;
        }
        System.out.print("false");
        return;
        //matcher end here
        /*String[] wordsOfString=enteredString.split(" ");
        for(int i=0;i<wordsOfString.length;i++)
        {
            if(wordsOfString[i].equals("Harry"))
            {
                System.out.print("true");
                return;
            }
        }
        System.out.print("false");
        return; */
    }
}
