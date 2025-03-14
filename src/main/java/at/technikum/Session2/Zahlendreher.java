package at.technikum.Session2;

import java.util.Scanner;

public class Zahlendreher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl: "); int z = sc.nextInt();
        System.out.printf("Ausgabe: %d%d%d\n", z%10, (z/10)%10, z/100);
    }
}
