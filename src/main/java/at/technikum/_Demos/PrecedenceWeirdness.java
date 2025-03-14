package at.technikum._Demos;

public class PrecedenceWeirdness {

    public static void main(String[] args) {
        /* page: 108 */

        int x = 1;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        // dok sagt postfix++ ist left assoz und higher order
        // und ++prefix wäre right assoz;
        // left assoc 1+1+1 means ((1-1)+1); meaning ich .. reduce ... von links kommend jeweils ein paar.
        // left assoc für unary bedeutet dann .. von links kommend reduce ich .. singleops?

        /*
        x = 0;
        int y = 0;
        y = x++++++++; // 8 pluses
        System.out.println(y);
        */ // does not work
        // x++++ .. also (x++)++ .. d.h. etwas das den wert einer variable ändern will kann das nicht. check.

        // also: java: alles links-assoziativ, außer dem/den zuweisungsoperatoren
        // dort macht low precendece sinn. und glaub ich auch rechts-assoziativität
        // a = b = c = d  ... bedeutet entweder:
        // - ( (a=b) =c) =d) = links assoz; und das bedeutet ungültige syntax
        // - a = (b = (c = d)) ... was gültig sein kann

        // anm. ! und was uch immer ~ ist sind auch rechts assoz

        // x++++ ... (x++)++ vs x(++...

        // in j = i++ .. will ich .. was? prefix gibt neuen wert? j = ++i für j neuer wert von i?
        // hm. ok.



    }
}
