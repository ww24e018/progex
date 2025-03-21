package at.technikum._Demos;

import java.util.Scanner;

public class InterateOverBool {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        // What does it look like to iterate over a bool with a for loop?

        for (boolean i = false; !i ; i = !i) {
            System.out.format("The boolean 'i' currently has a value of: '%b'\n", i);
        }

        // answer: not like anything. 'cause it does not work

    }

}
