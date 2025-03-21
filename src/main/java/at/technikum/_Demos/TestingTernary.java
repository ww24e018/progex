package at.technikum._Demos;

import java.util.Scanner;

public class TestingTernary {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<32;i++) {

            boolean[] b = new boolean[5];
            int[] s = new int[5]; // s because of "short", but not short because of casting
            for (int j = 0 ; j < 5 ; j++) {
                b[j] = ((i>>j)%2)==1;
                s[j] = b[j]?1:0;
            }

            boolean ternary1res = b[0]?b[1]:b[2]?b[3]:b[4];
            boolean ternary2res = (b[0]?b[1]:b[2])?b[3]:b[4];
            boolean ternary3res = b[0]?b[1]:(b[2]?b[3]:b[4]);

            System.out.format("\n%3d: %d%d%d%d%d = ", i,s[0],s[1],s[2],s[3],s[4]);
            System.out.format("%5b %5b %5b %5b %5b ..... ", b[0],  b[1], b[2], b[3], b[4]);
            System.out.format("r1-3: %d%d%d ", ternary1res?1:0, ternary2res?1:0, ternary3res?1:0);
            System.out.format("r1+2: %d%d vs r1+3: %d%d ", ternary1res?1:0, ternary2res?1:0, ternary1res?1:0, ternary3res?1:0);

            if (ternary2res != ternary3res) {
                System.out.format("(a?b:c)?d:e != a?b:(c?d:e) fuer ");
                System.out.format("(%b?%b:%b)?%b:%b != ", b[0],  b[1], b[2], b[3], b[4]);
                System.out.format("%b?%b:(%b?%b:%b) ", b[0],  b[1], b[2], b[3], b[4]);

            }


        }

    }

}
