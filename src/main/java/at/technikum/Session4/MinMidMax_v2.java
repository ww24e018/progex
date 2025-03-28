package at.technikum.Session4;

public class MinMidMax_v2 {

    private static void gimmeoutputline_ints(int a,String c1, int b, String c2, int c) {
        // do the ints thing
        System.out.format("%d %s %d %s %d\n",a,c1,b,c1,c);
    }
    private static void gimmeoutputline_strink(String a,String c1, String b, String c2, String c) {
        // do the ints thing
        System.out.format("%s %s %s %s %sd\n",a,c1,b,c1,c);
    }

    private static void mmm_plus_output(int int1,int int2,int int3) {
        // lets do this the decision-tree-pure with <>= diff version

        int a = int1;
        int b = int2;
        int c = int3;

        if (a < b) {
            // I just realized the amount of similar code I am about to write :(
            if (a < c) {
                // not sure why I test this?

                if (b < c) {
                    // it was: a < b < c
                } else if (b > c) {
                    // it was: a < c < b .. i think?
                } else {
                    // b==c, so it was: .. well. now I have to decide how I output this.
                    // lets say a < b = c
                    // I give up. But I will keep this artefact as a memory.

                }


            } else if ( a > c) {

                if (b < c) {

                } else if (b > c) {

                } else {

                }

            } else {
                // a == c

                if (b < c) {

                } else if (b > c) {

                } else {

                }

            }

        } else if (a > b) {

        } else {
            // a==b
        }


    }

    public static void main(String[] args) {

    }
}
