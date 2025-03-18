package at.technikum.Session4;

import java.util.Scanner;

public class GroesseGewicht {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        double gr,gw;
        System.out.print("Groesse: "); gr = sc.nextDouble();
        System.out.print("Gewicht: "); gw = sc.nextDouble();

        if (!( gw > 0 && gr > 0)) {
            System.out.println("Ungueltig!"); return;
        }

        String klass_string = "assert(0)";
        // I want to try the feel of else if here; In case you are wondering
        if (gw <= 90 && gr <= 200) {
            klass_string = "normal";
        } else if (gw > 90 && gr <= 200) {
            klass_string = "uebergewichtig";
        } else if (gw <= 90 && gr > 200) {
            klass_string = "hager";
        } else if (gw > 90 && gr > 200) {
            klass_string = "riesig";
        }
        if (gr < 50 || gw > 200) {
            klass_string += " (*)"; // I don't need the string afterwards
        }
        System.out.printf(klass_string);
    }

}
