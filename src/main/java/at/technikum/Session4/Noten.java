package at.technikum.Session4;

import java.util.Scanner;



public class Noten {

    private static String errnostring_specced(int i) {
        switch(i) {
            case 1: return "Erste";
            case 2: return "Zweite";
            case 3: return "Dritte";
            default: return "whaaaaaaaaaaaa!";
        }
    }

    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Noten: "); int input = sc.nextInt();

        // Error checking per spec
        if (input < 100 || input > 999) { // testcases sagen der fehlercase ist nachrangig dem anderen, daher kein check mit 111 und 555
            System.out.println("Erwarte genau 3 Noten!"); return;
        };
        int num_err = 0;
        int num_eins = 0;
        int num_zwei = 0;
        int num_fuenf = 0;
        for (int i = 3, num = input; i >0 ; i--, num/=10) {
            //System.out.printf("DEBUG: %d ; %d\n", i, num);

            if (num%10 == 1) num_eins++;
            else if (num%10 == 2) num_zwei++;
            else if (num%10 == 5) num_fuenf++;
            else if (num%10 < 1 || num%10 > 5) num_err++;

            // I erred in the spec, but will keep my old code.
            // So weird breaking here
            if (num_err > 0) {
                System.out.format("%s Note muss genau zwischen 1 und 5 liegen!",
                        errnostring_specced(i));
                return;
            }
        }

        if (num_eins == 3) {
            System.out.println("Ausgezeichneter Erfolg!");
        } else if (num_eins == 2 && num_zwei == 1) {
            System.out.println("Guter Erfolg!");
        } else if (num_fuenf > 0) {
            System.out.println("Nicht bestanden!");
        } else {
            System.out.println("Bestanden.");
        }
    }

}
