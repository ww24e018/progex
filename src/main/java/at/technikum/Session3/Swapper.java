package at.technikum.Session3;

import java.util.Scanner;

public class Swapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("enter first number (a): "); a = sc.nextInt();
        System.out.print("enter first number (b): "); b = sc.nextInt();

        System.out.format("a=%d, b=%d\n",a,b);

        int n = a;
        a = b;
        b = n;

        System.out.format("swapped:\na=%d, b=%d\n",a,b);

    }
}
