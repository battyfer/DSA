package Recursion;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number = ");
        int n = scn.nextInt();
        System.out.println("Enter The Power = ");
        int m = scn.nextInt();
        System.out.println(power(n,m,1));
    }

    public static int power(int n, int m, int ans)
    {
        if(m == 0)
        {
            return ans;
        }
        ans = ans*n;
        return power(n,m-1, ans);
    }
}