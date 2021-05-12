package Recursion;

import java.util.Scanner;

public class searching {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The size = ");
        int n = scn.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements - ");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println("Enter search element - ");
        int m = scn.nextInt();
        System.out.println(search(n, array, m, 0));
    }

    public static int search(int n, int[] array, int m, int a)
    {
        if (a == n - 1 && array[a] != m)
        {
            return -1;
        }
        if (array[a] == m)
        {
            return a;
        }
        return search(n, array, m, a+1);
    }
}