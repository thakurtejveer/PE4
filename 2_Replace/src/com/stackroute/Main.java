//2. Write a program to replace all d with f and all l with t in the given ​ String
//Input: daily dry
//Output: faity fry
//Original ​ string​ : daily dry
//New ​ String​ : faity fry

package com.stackroute;

public class Main {

    public static void main(String[] args) {
        String givenString="daily dry";
        System.out.println("Old String: "+givenString);
        String string1=givenString.replace("d","f");
        String string2=string1.replace("l","t");
        System.out.println("New String: "+string2);

    }
}
