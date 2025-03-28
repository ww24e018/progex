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
        /*for (int x2 = sc.nextInt(); x2 > 0 ; x2 = sc.nextInt()) {
            // do something
        }*/
        // aw: still have to duplicate the nextInt()

        // v1:
        int num_inputs = -1;
        int sum_inputs = 0;
        int max_inputs = Integer.MIN_VALUE;
        int leinput;
        do {
            num_inputs++;
            System.out.print(": ");
            leinput = sc.nextInt();
            sum_inputs += leinput;
            if (validInputNumber(leinput) && max_inputs < leinput) max_inputs = leinput;
        } while (validInputNumber(leinput));
        sum_inputs -= leinput;
        System.out.format("cnt: %d\n", num_inputs);
        System.out.format("sum: %d\n", sum_inputs);
        System.out.format("max: %d\n", max_inputs);
        System.out.println("End.");

        // and now ...
        /*System.out.print(": ");
        for (int ni = -1, lei = sc.nextInt() ; lei > 0 ; ni++, lei = sc.nextInt()) {
            System.out.print(": ");
        }
        System.out.format("cnt: %d\n", num_inputs);
        System.out.println("End.");*/
        // nun; kann das do-while nicht ganz ersetzen, ":" fehlt; also die vollst. duplizierung des codeblocks.
        // quick googling: kein is_undef() in java?

    }

    private static boolean validInputNumber(int myInt) {
        return (myInt > 0)?true:false;
    }

}
