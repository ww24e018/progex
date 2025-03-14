package at.technikum.Session2;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of a side: ");
        int sidelen = sc.nextInt();
        System.out.printf("Surface Area: %.2f\n", (double) (sidelen*sidelen*6));
        System.out.printf("Volume: %.2f\n", (double) (sidelen*sidelen*sidelen));
    }
}
