package at.technikum._Demos;

import java.util.Scanner;

public class ExerciseInputLoop {
    public static void main(String[] args) {

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        Scanner sc = new Scanner(System.in);

        int cnt = -1;
        int input = 1;
        int sum = 0;
        int max = 0;
        while(input > 0) {
            System.out.print(": "); input = sc.nextInt();
            cnt++;
            sum += input;
            max = Math.max(max,input);
        }
        sum -= input;
        System.out.format("cnt: %d\nsum: %d\nmax: %d\nEnd.", cnt, sum, max);

    }

}
