package at.technikum.TheLifeOfPi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void helperlein(String fs) {
        Double mypi = 3.14159265359;
        System.out.printf("Pi = %"+fs+"f!\n", mypi);
    }
    public static void main(String[] args) {

        /*String[] array = new String[] {"tets", "test"};

        List<String> values = new ArrayList<String>();
        values.add("");
        values.add("test2");

        for (String value: array) {

            System.out.println(value);
        }*/
        helperlein("");
        //String[] myfsds = new String[] {"12", "12.2", "10.0", "13.11", "015", "+015.2"};
        for (String value: new String[] {"12", "12.2", "10.0", "13.11", "015", "+015.2"}) {
            helperlein(value);
        }

    }
}
