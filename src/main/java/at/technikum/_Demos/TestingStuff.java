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



        //return 1;
        System.exit(1);
    }
}
