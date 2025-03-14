package at.technikum._Demos;

public class MixedArithmeticDemo {
    public static void main(String[] args) {
        System.out.printf("%f%n", 1. + 3 /4 );
        System.out.printf("%f%n", 1 + 3./4 );
        System.out.printf("%f%n", 1 + 3 /4.);
        System.out.printf("%f%n", 1 + (double) 3 /4); // so. what precedence does type-casting have? intuitive low, but example below suggests: high
        System.out.printf("%d%n", (int) (1 + 3. /4)); // make a guess how java casts float to int; my first vibe: round(), not floor()
        // second guess also false;
        System.out.printf("%d%n", (int) (-1 - 3. /4)); // lesigh: es ist "nachkommastellen wegschneiden :-/
        System.out.printf("%f%n", (double) (-1 - 3. /4)); // kontrolle
    }

}