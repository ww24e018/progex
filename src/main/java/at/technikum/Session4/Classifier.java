package at.technikum.Session4;

import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        int p, q;
        System.out.print("enter price: "); p = sc.nextInt();
        System.out.print("enter quality: "); q = sc.nextInt();

        System.out.println((p>50)?"low price":"high price");
        System.out.println((q>50)?"low quality":"high quality");





    }
}
