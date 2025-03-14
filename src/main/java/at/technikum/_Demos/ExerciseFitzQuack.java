package at.technikum._Demos;

import java.util.Scanner;

public class ExerciseFitzQuack {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        System.out.print(": "); int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            //System.out.format("%s ",(i%5==0)?"Fitz":Integer.toString(i));
            String out = "ASSERT(NULL)";
            boolean tbd5 = i%5==0;
            boolean tbd7 = i%7==0;
            int ledeciderint = (tbd5?1:0)+(tbd7?1:0)*2; // An dem Punkt stellt sich die Frage ob nested ifs nicht vielleicht *doch* besser gewesen wären ...
            //System.out.format("%d ",ledeciderint);
            switch (ledeciderint) {
                case 0: out = Integer.toString(i); break;
                case 1: out = "Fitz"; break;
                case 2: out = "Quack"; break;
                case 3: out = "FitzQuack"; break;
            }
            System.out.format("%s ",out);


            if (i%10==0) { System.out.print("\n"); }; // Angabenoutput scheint dies zu tun, is aber uu ein Formating-Dings methinks.
        }
    }

}
