package at.technikum._Demos;

import java.util.Arrays;

public class ILVBspArray {
    public static void main(String[] args) {

        int[] myInts = {1,2,3,4,5,6,7,0,0,0};

       int sum1 = Arrays.stream(myInts).reduce(0,(a,b) -> a+b);

        int sum2 = 0;
        for (int i = 0; i < myInts.length; i++) sum2 += myInts[i];

        System.out.format("sum1: %d\n", sum1);
        System.out.format("sum2: %d\n", sum2);

    }
}
