package at.technikum.Session4;

import java.util.Scanner;

public class EANCheck {
    public static void main(String[] args) {
        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter all 13 digits of an EAN (enter 0 for 9783890111048/notvalid):");
        long mightbeEAN = sc.nextLong();
        if (mightbeEAN == 0) { mightbeEAN = 9783890111048L; }

        long worknumber = mightbeEAN / 10; // remove check digit
        int sum_even = 0;
        int sum_odd = 0;
        for (int i = 1; i<13; i++) {
            if ((i%2) == 1) {
                sum_even += worknumber % 10;
            } else {
                sum_odd += worknumber % 10;
            }
            worknumber /= 10;
        }
        //System.out.format("DEBUG: odd/even: %d und %d\n", sum_odd, sum_even); // Note: default# should be 26 and 25 here

        int step345 = ((sum_even*3 + sum_odd)-1) % 10;
        long step6 = 9-step345;

        long check = mightbeEAN % 10;

        if (step6 == check) {
            System.out.println("The EAN is VALID.");
        } else {
            System.out.println("The EAN is NOT VALID.");
        }

    }

}
