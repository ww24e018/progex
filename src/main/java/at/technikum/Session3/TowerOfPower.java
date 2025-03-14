package at.technikum.Session3;

import java.util.Scanner;

public class TowerOfPower {

    public static void main(String[] args) {
        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));


        Scanner sc = new Scanner(System.in);
        int base;
        System.out.print("enter base: "); base = sc.nextInt();

        int pow = 1;
        for (int i = 1; i<8; i++) {
            pow *= base;
            System.out.printf("%8d\n", pow);
        }
    }
}
