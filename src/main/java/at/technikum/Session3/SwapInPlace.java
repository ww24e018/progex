package at.technikum.Session3;

import java.util.Scanner;

public class SwapInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(": ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        System.out.format("Before: \n a= %d\n b= %d\n", a,b);

        /*

        // values 1,2,? odre x,y
        a: xy-x = y;
        b: y-x-y = -x
        */
        a += b;
        b = a - b;
        a = a - b;

        System.out.format("After: \n a= %d\n b= %d\n", a,b);

        boolean doingTheTests = true;
        if (doingTheTests) {
            for (int i = 0; i<100; i++) {
                int testv1 = (int) ((Math.random()-0.5)*Integer.MAX_VALUE);
                int testv2 = (int) ((Math.random()-0.5)*Integer.MAX_VALUE);
                System.out.format("Testing values: %#016x und %#016x -- %11d und %11d : ", testv1, testv2, testv1, testv2);

                a = testv1;
                b = testv2;

                a+=b; b = a-b; a = a-b;
                if ((a==testv2) && (b==testv1)) {
                    System.out.println("Checks out.");
                } else {
                    System.out.println("ERROR_SWAP: did not work out");
                };
            }
        }

        double aa; double bb;
        if (doingTheTests) {
            for (int i = 0; i<100; i++) {
                double testv1 = (Math.random()-0.5);
                double testv2 = (Math.random()-0.5);
                System.out.format("Testing values: %20g und %20g -- %11f und %11f : ", testv1, testv2, testv1, testv2);

                aa = testv1;
                bb = testv2;

                aa+=bb; bb = aa-bb; aa = aa-bb;
                if ((aa==testv2) && (bb==testv1)) {
                    System.out.println("Checks out.");
                } else {
                    System.out.println("ERROR_SWAP: did not work out");
                };
            }
        }


        if (doingTheTests) {
            for (int i = 0; i<100; i++) {
                double testv1 = (Math.random()-0.5)*Float.MAX_VALUE; // Absicht.
                double testv2 = (Math.random()-0.5)*Float.MAX_VALUE;
                System.out.format("Testing values: %20g und %20g -- %11f und %11f : ", testv1, testv2, testv1, testv2);

                aa = testv1;
                bb = testv2;

                aa+=bb; bb = aa-bb; aa = aa-bb;
                if ((aa==testv2) && (bb==testv1)) {
                    System.out.println("Checks out.");
                } else {
                    System.out.print("ERROR_SWAP: did not work out ");
                    System.out.printf(" -- minus gives diffs = (%g,%g)", aa-testv2, bb-testv1);
                };
            }
        }
        if (doingTheTests) {
            for (int i = 0; i<100; i++) {
                int foo1 = (int) (Math.random()*30);
                double testv1 = (Math.random()-0.5)*Math.pow(10,foo1);
                int foo2 = (int) (Math.random()*30);
                double testv2 = (Math.random()-0.5)*Math.pow(10,foo2);
                System.out.format("4Testing values: %20g und %20g -- %30f und %30f : ", testv1, testv2, testv1, testv2);

                aa = testv1;
                bb = testv2;

                aa+=bb; bb = aa-bb; aa = aa-bb;
                if ((aa==testv2) && (bb==testv1)) {
                    System.out.println("Checks out.");
                } else {
                    System.out.print("ERROR_SWAP: did not work out ");
                    System.out.printf(" -- minus gives diffs = (%g,%g)\n", aa-testv2, bb-testv1);
                };
            }
        }


    }
}
