package at.technikum.Session4;

import java.util.Scanner;

public class Milch {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Fettgehalt: "); double fettgehalt = sc.nextDouble();
        System.out.print("Haltbar: "); int haltbar_int = sc.nextInt();

        boolean haltbar = (haltbar_int==1)?true:false; // a thing
        if (haltbar_int != 0 && haltbar_int != 1) {
            System.out.print("Ungueltig!"); return;
        }

        String outstring = "";
        if (fettgehalt < 0) {
            System.out.println("Ungueltig!"); return;
        }

        if (fettgehalt < 3) {
            outstring += "Leichtmilch";
        } else if (fettgehalt > 7) {
            outstring += "Extravollmilch";
        } else {
            outstring += "Normalmilch";
        }
        if (haltbar) outstring += " (haltbar)";
        else outstring += " (frisch)";

        System.out.println(outstring);

    }

}
