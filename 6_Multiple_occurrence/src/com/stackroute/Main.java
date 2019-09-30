//6. Write a program to find out the multiple occurrences of the given word in a ​ string​ using Matcher
//methods.
//Input : She sells seashells by the seashore
//Given word: se
//Output :
//Found at: 4 - 6
//Found at: 10 - 12
//Found at: 27 – 29

package com.stackroute;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input String: ");
        Scanner scanner=new Scanner(System.in);
        String enteredString=scanner.nextLine();
        System.out.println("Enter word of which you want to get frequency: ");
        String regex=scanner.next();
        Pattern pattern= Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(enteredString);
        while(matcher.find())
        {
            System.out.print("Found at: "+matcher.start()+"-");
            System.out.print(matcher.end());
            System.out.println();
        }
        //following method is simply done without using regular expression.
        /*int count=0;
        for(int i=0;i<enteredString.length();i++)
        {
            int j=0;
            for(j=0;j<word.length();j++)
            {
                if(word.charAt(j)!=enteredString.charAt(i+j))
                    break;
            }
            if(j==word.length())
            {
                count++;
                System.out.format("Found at: %d - %d",i,i+j);
                System.out.println();
            }
        } */

    }
}
