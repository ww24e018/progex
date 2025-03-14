package at.technikum.Session4;

import java.util.Scanner;

public class Datum {

    private static String monat2string(int m) {
        switch(m) {
            case 1: return "Januar";
            case 2: return "Februar";
            case 3: return "Maerz";
            case 4: return "April";
            case 5: return "Mai";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "August";
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Dezember";
            default: return "ASSERT(NULL)";
        }
    }

    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Datum: "); int input = sc.nextInt();

        // der reihe nach von angabe
        int tag = (input / 1000000);
        if (tag>31 || tag<1) {
            System.out.println("Tag muss zwischen 1 und 31 liegen!"); return;
        }

        int monat = (input / 10000) % 100;
        if (monat < 1 || monat > 12) {
            System.out.println("Monat muss zwischen 1 und 12 liegen!"); return;
        }

        int jahr = input % 10000;
        if (jahr <= 1581) {
            System.out.println("Jahr muss groesser als 1581 sein!"); return;
        }
        if ((jahr*10000+monat*100+tag) <= 15821014) {
            System.out.println("Datum muss nach dem 14.10.1582 liegen!"); return;
        }

        System.out.format("%d. %s %d", tag, monat2string(monat), jahr);



    }

}
