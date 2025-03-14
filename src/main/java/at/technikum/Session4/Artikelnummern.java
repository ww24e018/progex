package at.technikum.Session4;

import java.util.Scanner;

public class Artikelnummern {
    public static void main(String[] args) {

        // for testing:
        // while(true) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        int artikelgruppe, untergruppe, artikelnummer;
        String outstring = "ASSERT(NULL)";
        String err = "Falsche eingabe";

        System.out.print(": "); artikelgruppe = sc.nextInt();
        switch(artikelgruppe) {
            case 1: // hier sind getraenke
                System.out.print(": "); untergruppe = sc.nextInt();
                switch(untergruppe) {
                    case 1: // wir sind getranke - bier
                        System.out.print(": "); artikelnummer = sc.nextInt();
                        switch(artikelnummer) {
                            case 1: outstring = "Bier (hell, 0,5)"; break;
                            case 2: outstring = "Bier (hell, 0,33)"; break;
                            case 3: outstring = "Zwickel (0,5)"; break;
                            case 4: outstring = "Zwickel (0,33)"; break;
                            default: outstring = err; break;
                        };
                        break;
                    case 2: // hier sind getraenke - non-alk
                        System.out.print(": "); artikelnummer = sc.nextInt();
                        switch(artikelnummer) {
                            case 1: outstring = "Cola"; break;
                            case 2: outstring = "Fanta"; break;
                            default: outstring = err; break;
                        }
                        break;
                    case 3: // das waeren  getraenke - wein
                        System.out.print(": "); artikelnummer = sc.nextInt();
                        switch(artikelnummer) {
                            case 1: outstring = "Rotwein"; break;
                            case 2: outstring = "Weißer Spritzer"; break;
                            default: outstring = err; break;
                        }
                        break;
                    default:
                        outstring = err;
                }
                break;
            case 2: // hier waeren "Speisen"
                System.out.print(": "); untergruppe = sc.nextInt();
                switch(untergruppe) {
                    case 1: // "klassisch"
                        System.out.print(": "); artikelnummer = sc.nextInt();
                        switch(artikelnummer) {
                            case 1: outstring = "Schnitzel"; break;
                            case 2: outstring = "Schweinsbraten"; break;
                            default: outstring = err; break;
                        }
                        break;
                    case 2: // "kl. speisen"
                        System.out.print(": "); artikelnummer = sc.nextInt();
                        switch(artikelnummer) {
                            case 1: outstring = "Frankfurter"; break;
                            default: outstring = err; break;
                        }
                        break;
                    case 9: // "sonstiges"
                        System.out.print(": "); artikelnummer = sc.nextInt();
                        switch (artikelnummer) {
                            case 1: outstring = "Ketchup"; break;
                            default: outstring = err; break;
                        }
                        break;
                    default:
                        outstring = err; break;
                }
                break;

            case 3: // hier sind "sonstiges"
                System.out.print(": "); untergruppe = sc.nextInt();
                // meine hand tut weh. aber mit der programmlogik as required wär ein switch auf ifs auch nicht hilfreich methinks;
                switch(untergruppe) {
                    case 1:
                        System.out.print(": "); artikelnummer = sc.nextInt();
                        switch(artikelnummer) {
                            case 1: outstring = "Zigaretten"; break;
                            default: outstring = err; break;
                        }
                        break;
                    default:
                        outstring = err; break;
                }

                break;

            default:
                outstring = err;
        }
        System.out.println(outstring);


        // for testing:
        // }

    }
}
