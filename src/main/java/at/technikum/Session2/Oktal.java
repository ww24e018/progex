package at.technikum.Session2;

import java.util.Scanner;

public class Oktal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Oktalzahl eingeben: "); int input = sc.nextInt();
        int st0 = input % 10;
        int st1 = (input / 10) % 10;
        int st2 = (input / 100) % 10; // lt spec ist das %10 superfluous
        int oz = st0+st1*8+st2*64;
        System.out.printf("dezimal: %d\n", oz);
        int ziffsum = 0;
        int oz_run = oz;
        while (oz_run > 0) {
            ziffsum += oz_run % 10;
            oz_run /= 10;
        }
        //System.out.printf("Ziffernsummer: %d\n", st0+st1+st2);
        System.out.printf("Ziffernsummer: %d\n", ziffsum);

    }
}
