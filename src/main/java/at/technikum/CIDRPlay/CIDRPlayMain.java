package at.technikum.CIDRPlay;

public class CIDRPlayMain {
    public static void main(String[] args) {

        CIDRThingy first = new MeCIDR(192,168,0,1,24);
        CIDRThingy first32 = new MeCIDR32( 192,168, 0, 1, 24);

        System.out.println(first.inputAsIPString());
        //System.out.println(first.inputAsIP_v2());
        System.out.println(first.inputAsBitPattern());

        System.out.println(new MeCIDR(255,255,255,255,24).inputAsBitPattern());
        System.out.println(new MeCIDR(128,128,128,128,24).inputAsBitPattern());

        System.out.println(first.bitMaskAsString());

        System.out.println(first.inputAsHex());
        System.out.println(first32.inputAsHex());


    }
}
