package at.technikum._Demos;

import java.util.Scanner;

public class InputLookI {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        /*int x = 1;
        while (x > 0) {
            x = sc.nextInt();
        }
        */

        // how does a for look here?
        for (int x2 = sc.nextInt(); x2 > 0 ; x2 = sc.nextInt()) {
            // do something
        }
        // aw: still have to duplicate the nextInt()

    }

}
