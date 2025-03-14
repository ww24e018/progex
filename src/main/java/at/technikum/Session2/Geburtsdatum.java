package at.technikum.Session2;

import java.util.Scanner;

public class Geburtsdatum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geburtsdatum: ");
        int tmj = sc.nextInt();
        int j = tmj % 100;
        int m = (tmj / 100) % 100;
        int t = tmj / 10000;
        System.out.printf("Ausgabe: %02d%02d%02d\n",j,m,t);
    }
}
