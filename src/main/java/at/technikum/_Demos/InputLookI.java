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
        int leinput;
        do {
            num_inputs++;
            System.out.print(": ");
            leinput = sc.nextInt();
        } while (leinput > 0);
        System.out.format("cnt: %d\n", num_inputs);
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

}
