package at.technikum.Session4;

import java.util.Scanner;

public class IntervalleSchliessen {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        // methinks "geschlossen" is derived from translating "enclosing"
        // or something.

        // this is the point where I switched fonts to something
        // where "1" and "l" display differently
        System.out.print("Grenze 1: "); int lb_1 = sc.nextInt();
        System.out.print("Grenze 2: "); int ub_1 = sc.nextInt();
        System.out.print("Grenze 1: "); int lb_2 = sc.nextInt();
        System.out.print("Grenze 2: "); int ub_2 = sc.nextInt();

        if (lb_1 > ub_1) { int tmp = lb_1; lb_1 = ub_1; ub_1 = tmp; }
        if (lb_2 > ub_2) { int tmp = lb_2; lb_2 = ub_2; ub_2 = tmp; }

        System.out.format("Intervall 1: [%d, %d]\n", lb_1, ub_1);
        System.out.format("Intervall 2: [%d, %d]\n", lb_2, ub_2);

        int enclosure_lb = (lb_1 < lb_2)?lb_1:lb_2;
        int enclosure_ub = (ub_1 > ub_2)?ub_1:ub_2;

        System.out.format("geschlossenes Intervall: [%d, %d]\n", enclosure_lb, enclosure_ub);


    }

}
