package at.technikum.Session4;
import java.util.Scanner;



public class MinMidMax_bySophia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        if (a<=b && a<=c) {
            System.out.print(a);
            if (a==b) {System.out.printf("=%d",b);}
            else if (a==c) {System.out.printf("=%d",c);}
            else if (b<=c) {System.out.printf("<%d",b);}
            else {System.out.printf("<%d",c);}
            if (b==c) {System.out.printf("=%d",c);}
            else if (c<b) {System.out.printf("<%d",b);}
            else {System.out.printf("<%d",c);}
        } else if (b<=c) {
            System.out.print(b);
            if (b==c) {System.out.printf("=%d",c);}
            else if (a<=c) {System.out.printf("<%d",a);}
            else {System.out.printf("<%d",c);}
            if (a==c) {System.out.printf("=%d",c);}
            else if (c>a) {System.out.printf("<%d",a);}
            else {System.out.printf("<%d",c);}
        }else {
            System.out.print(c);
            if (a<=b) {System.out.printf("<%d",a);}
            else {System.out.printf("<%d",b);}
            if (a==b) {System.out.printf("=%d",b);}
            else if (a<b) {System.out.printf("<%d",b);}
            else {System.out.printf("<%d",a);}
        }

    }
}
