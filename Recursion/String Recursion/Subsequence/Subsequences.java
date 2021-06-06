package Recursion;

import java.util.Scanner;

public class Subsequences {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String - ");
        String unprocessed = scn.nextLine();
        subsequence("", unprocessed);
    }

    public static void subsequence(String processed, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subsequence(processed + ch, unprocessed);
        subsequence(processed, unprocessed);
    }

}