package at.technikum._Demos;

public class TestingStuff {
    public static void main(String[] args) {
        System.out.println("Test");
        System.out.printf( "Test.f.locale: %f\n", 1.5);
        System.out.format(java.util.Locale.forLanguageTag("en"), "Test.f.locale(2): %f\n", 1.5);

        java.util.Locale.setDefault(java.util.Locale.forLanguageTag("en"));
        System.out.printf( "Test.f.locale(3): %f\n", 1.5);

        double mydouble = Double.parseDouble("1.234e-10");
        System.out.format("Testing: double-construction: %g == %f", mydouble, mydouble);
        double mydouble2 = 1.234e-10;
        System.out.format("Testing: double-construction: %g == %f", mydouble2, mydouble2);

        int goTo = 1;
        int lowerCase = 2;
        int lOwErCaSe = 3;

        System.out.format("\n%d %d %d\n", goTo, lowerCase, lOwErCaSe);

        boolean z = true?true:false;
        z = (true)?(true):(false);
        z = true?true:false?true:false; // think: insert whole block in the first position; evaluates "true"
        z = false?false:false?false:false; // this should and does evaluate to "false"
        z = (false?false:true)?false:false; // false
        z = (false?false:true)?true:false; // true
        z = false?false:true?true:false; // true? true.
        z = false?false:(true?true:false); // also true, for different reasons

        System.out.println(z);

        // nebenquest: bool & autocasts
        int i = 1;
        // if (i) System.out.println("does int 1 autocast to true?"); // -> does not autocast
        // if ((boolean) i) System.out.println("*can* I cast int to boolean?"); // -> nope
        // ternary: for this to be convenient "==" needs to be higher precedence than ternary
        if (i==1?true:false) System.out.println("ternary: for this to be convenient \"==\" needs to be higher precedence than ternary");
        if (i!=1?true:false) System.out.println("cast-to-bool-with-ternary: this simulates the .. traditional .. behaviour");
        if (i==0?false:true) System.out.println("cast-to-bool-with-ternary: as does this but this looks .. slightly .. saner?");
        // in practice: instead of cast, or autocast, I have to write an operator-statement that returns bool. ok.


        // checking scope of fors
        for (int uniuzJztbd = 17; uniuzJztbd < 18; uniuzJztbd++) {
            System.out.println(uniuzJztbd);
        }
        // System.out.println(uniuzJztbd); // does not work; out of scope;

        /*
        int uniuzJztbd = 42;
        for (int uniuzJztbd = 17; uniuzJztbd < 18; uniuzJztbd++) {
            System.out.println(uniuzJztbd);
        }
         */ // doing this says "cant do dave; name already used

        /*
        javascript code I tried in ff console for comparision:

        var i = "hello";
        console.log(i);
        for (var i = 0; i < 1; i++) {
        console.log(i);
        };
        console.log(i);

        Annoyingly, but - if memory serves - kinda logically this outputs <Lestring>,0,1,undefined ;
        Cause a for loop does not a new scope make, in js. I think.

         */



        //return 1;
        System.exit(1);
    }
}
