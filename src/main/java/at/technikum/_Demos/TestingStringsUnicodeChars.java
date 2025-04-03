package at.technikum._Demos;

import java.util.ArrayList;
import java.util.List;

public class TestingStringsUnicodeChars {
    public static <Char> void main(String[] args) {

        // the plan: iterate over examples of strings;

        List<String> mylist = new ArrayList<String>();

        mylist.add("String 1");
        mylist.add("String 2");
        mylist.add("String 3: \uD83D\uDC08");
        mylist.add("\uD83D\uDC08");

        for (String str : mylist) {
            System.out.format("\nStrLen=%2d; ", str.length());
            System.out.format("Codepoints: %2d; ", str.codePointCount(0, str.length()));
            System.out.format("Str=%s; ",  str);

        }


        System.out.println("\n"); // end
    }
}
