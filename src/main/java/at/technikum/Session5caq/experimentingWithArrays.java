package at.technikum.Session5caq;

public class experimentingWithArrays {
    public static void main(String[] args) {

        // folie sagt array wird mit "default-werten", 0 für int "initialisiert
        // weiters: was soll das mit dem "[10]", das ist sonder-array-syntax, no?
        int[] myIntArray = new int[10];

        for (int i = 0; i < 10; i++)
            System.out.format("%d",myIntArray[i]);
        System.out.format("\n");
        // Cool. Test bestanden. Stellt sich die Frage. Wie geht das für den "Default"-Wert.
        // wie geht das.

        Integer[] myIntEgerArray = new Integer[10];

        for (int i = 0; i < 10; i++)
            System.out.format("%d",myIntEgerArray[i]);
        System.out.format("\n");

        // Nun. Seh ich ein. "default" is ein bißchen hart für "null", aber ok.
        // hm. undef is anders als null in java, if memory servers. ok.

        String[] myStringArray = new String[10];
        // Arrays sind wichtig. So wichtig, dass sie ihre eigene Syntax bekommen. Meh.
        for (int i = 0; i < 10; i++)
            System.out.format("%d",myStringArray[i]);
        System.out.format("\n");

        /* nun. das geht nicht. eh. Bekomm exception.
        for (int i = 0; i < 10; i++)
            System.out.format(myStringArray[i]);
        System.out.format("\n");
         */

        /* das is keine exception. compiler sagt "das mach ich nicht."
        String fooxy;
        System.out.format(fooxy);
         */

        String fooxy;
        // "false" als condition -> "might not have" ; "true" als condition -> compiles just fine.
        // Was ist mit "Math.random()`?
        // AW: Nope. if(true) wird halt wegoptimized;
        //if (false) fooxy = "";
        //if (true) fooxy = "";
        //if (Math.random() < 0.001) fooxy = "";
        //if (fooxy == null) fooxy = "";
        //System.out.format("%s", fooxy);





    }
}
