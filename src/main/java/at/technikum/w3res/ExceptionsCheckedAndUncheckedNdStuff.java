package at.technikum.w3res;

public class ExceptionsCheckedAndUncheckedNdStuff {
    public static void main(String[] args) {
        // these: wenn ich versuch eine checked exception hier zu werfen regt sich der compiler auf?
        System.out.format("This psvm has just started.\n");
        Exception pureEx = new Exception();
        RuntimeException runEx = new RuntimeException();

        throw runEx; // works
        //throw pureEx; // ide regt sich schon auf .. jep. compiler beschwert sich.
    }
}
