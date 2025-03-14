package at.technikum.Session2;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the TimeCalculator!\nplease enter a duration in milliseconds:");
        long muchms = sc.nextLong(); long backupms = muchms;

        long ms = muchms % 1000 ; muchms /= 1000;
        long s = muchms % 60 ; muchms /= 60;
        long m = muchms % 60 ; muchms /= 60;
        long h = muchms % 24 ; muchms /= 24;
        long d = muchms;
        muchms = backupms;

        System.out.printf("%d ms are exactly:\n",muchms);
        System.out.printf("%8s %d\n", "days", d);
        System.out.printf("%8s %d\n", "hours", h);
        System.out.printf("%8s %d\n", "minutes", m);
        System.out.printf("%8s %d\n", "seconds", s);
        System.out.printf("%8s %d\n", "ms", ms);


    }
}
