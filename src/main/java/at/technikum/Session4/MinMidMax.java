package at.technikum.Session4;

import java.util.Scanner;

public class MinMidMax {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        // Plan:
        // 3! = 6 faelle für untersch. der kombinationen (minimal?)
        // schreiben in result-variablen (wert, symbol getrennt)
        // unterscheidung equalness dann kurz vor schluss durch vergleich resvars

        System.out.println("Geben Sie drei Zahlen ein:");
        System.out.print("a : "); int a = sc.nextInt();
        System.out.print("b : "); int b = sc.nextInt();
        System.out.print("c : "); int c = sc.nextInt();

        int value1=0, value2=0, value3=0;
        String symbol1="", symbol2="", symbol3="";
        String compsymbol12="",compsymbol23="";

        if (a <= b && a <= c) {
            // a ist kleinstes, oder darf so tun hier
            // triggert auch z.b. wenn alle drei gleich, anm.
            value1 = a;
            symbol1 = "a";
            if (b <= c) {
                value2 = b; symbol2 = "b";
                value3 = c; symbol3 = "c";
            } else {
                value2 = c; symbol2 = "c";
                value3 = b; symbol3 = "b";
            }
        } else if (b <= a && b <= c) { // there is some optimization hidden, somewhere, possibly maybe

            value1 = b; symbol1 = "b";
            if (a <= c) {
                value2 = a; symbol2 = "a";
                value3 = c; symbol3 = "c";
            } else {
                value2 = c; symbol2 = "c";
                value3 = a; symbol3 = "a";
            }

        } else if (c <= a && c <= b) { // I rationalize this as defensive programming
            // c ist kleinestes etc
            value1 = c; symbol1 = "c";
            if (a <= b) {
                value2 = a; symbol2 = "a";
                value3 = b; symbol3 = "b";
            } else {
                value2 = b; symbol2 = "b";
                value3 = a; symbol3 = "a";
            }

        } else {
            System.out.print("ASSERT(NULL); Should not be reached; abort;");
        }

        // compsymbols;
        compsymbol12 = (value1==value2)?"=":"<";
        compsymbol23 = (value2==value3)?"=":"<";

        System.out.format("%d %s %d %s %d\n",
                value1, compsymbol12, value2, compsymbol23, value3);
        System.out.format("%s %s %s %s %s\n",
                symbol1, compsymbol12, symbol2, compsymbol23, symbol3);


    }

}
