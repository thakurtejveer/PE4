//3. Write a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
//a. Extract the words from the text and sort them into alphabetical order.
//b. Display the sorted list of words.

package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Your String here: ");
        Scanner scanner=new Scanner(System.in);
        String enteredString=scanner.nextLine();
        String[] wordsOfEneteredString = enteredString.split(" ");
        for(int i=0;i<wordsOfEneteredString.length;i++)
        {
            char word[] =wordsOfEneteredString[i].toCharArray();
            Arrays.sort(word);
            String s=new String(word);
            wordsOfEneteredString[i]=s;
        }
        for(int i=0;i<wordsOfEneteredString.length;i++)
        {
            System.out.print(wordsOfEneteredString[i]);
            System.out.print(" ");
        }
    }
}
