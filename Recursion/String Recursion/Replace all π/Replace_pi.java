package Recursion;

import java.util.Scanner;

public class Replace_pi {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            String unprocessed = scn.next();
            replacepi("", unprocessed);
        }
    }

    public static void replacepi(String processed, String unprocessed)
    {
        char ch2 = 'a';
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        char ch1 = unprocessed.charAt(0);

        if (unprocessed.length() > 1)
        {
            ch2 = unprocessed.charAt(1);
        }

        if(ch1 == 'p' && ch2 == 'i')
        {
            unprocessed = unprocessed.substring(2);
            replacepi(processed + "3.14", unprocessed);
        }
        else
        {
            unprocessed = unprocessed.substring(1);
            replacepi(processed + ch1, unprocessed);
        }
    }
}