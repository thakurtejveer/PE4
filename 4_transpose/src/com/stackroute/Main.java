//4. Write a program to transpose the given ​ string​ .
//Input ​ String​ : a quick brown fox jumps over the lazy dog
//Output ​ String​ : a kciuq nworb xof spmuj revo eht yzal god

package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter String here: ");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] wordsOfString=s.split(" ");
        for(int i=0;i<wordsOfString.length;i++)
        {
            for(int j=wordsOfString[i].length()-1;j>=0;j--)
                System.out.print(wordsOfString[i].charAt(j));
            System.out.print(" ");
        }

    }
}
