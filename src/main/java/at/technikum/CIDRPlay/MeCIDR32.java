package at.technikum.CIDRPlay;

public class MeCIDR32 implements CIDRThingy{
    // using signed int32s for ip calcs.

    int input;
    private long input_l;
    int netbits;

    public MeCIDR32(int a, int b,int c,int d,int n) {
        // nun.
        this.netbits = n;
        this.input = 0;
        this.input_l = 0;

        /* nope
        this.input += a; this.input <<= 8;
        this.input += b; this.input <<= 8;
        this.input += c; this.input <<= 8;
        this.input += d;
        */
        /*this.input_l += a; this.input_l <<= 8;
        this.input_l += b; this.input_l <<= 8;
        this.input_l += c; this.input_l <<= 8;
        this.input_l += d;*/
        //this.input_l = d + (c << 8) + (b << 16) + (a << 24);

        //this.input = (int) (this.input_l & 0xFFFFFFFFL);
        /*if ((this.input_l / 2^31) > 0) { this.input_l -= 2^31; };
        this.input = (int) this.input_l;*/

        // it was the byte-signedness, all along;
        this.input += a; this.input <<= 8;
        this.input += b; this.input <<= 8;
        this.input += c; this.input <<= 8;
        this.input += d;


    }

    public String inputAsHex() {
        //return String.format("%8x", Long.parseLong(Integer.toUnsignedString(this.input)));
        //return String.format("%8s", Integer.toUnsignedString(this.input));
        System.out.println(String.format("%8x",this.input_l));
        System.out.println(String.format("%8x",this.input_l));
        return String.format("%8x",this.input);
    }
    public String inputAsIPString() {
        return DEFAULT_STRING;
    }
    public String inputAsBitPattern() {
        return DEFAULT_STRING;
    }
    public String bitMaskAsString() {
        return DEFAULT_STRING;
    }
}
