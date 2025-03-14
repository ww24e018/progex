package at.technikum.CIDRPlay;

public class MeCIDR implements CIDRThingy {
    private long ip_int;
    private long netbits;
    private long a,b,c,d;

    private void assertByteValue(long n) {
        if (n < 0 || n > 255) {
            System.out.printf("Assert failed: %d not in UInt8 value range.\n", n);
            System.exit(127);
        }
    }
    private String longAsUInt8Binary(long n) {
        return String.format("%8s",Long.toBinaryString(n)).replace(" ", "0");
    }
    private String longAsUint32DotNotation(long n) {
        return String.format("%s.%s.%s.%s",
                longAsUInt8Binary((n & 0xFF000000l) >> 24),
                longAsUInt8Binary((n & 0x00FF0000l) >> 16),
                longAsUInt8Binary((n & 0x0000FF00l) >> 8),
                longAsUInt8Binary((n & 0x000000FFl))
                );
    }

    public MeCIDR(long a,long b,long c,long d,long n) {
        assertByteValue(a);assertByteValue(b);assertByteValue(c);assertByteValue(d);
        this.ip_int = d + (c << 8) + (b << 16) + (a << 24);
        this.netbits = n;
        this.a = a; this.b = b; this.c = c; this.d = d; // lets call it convenience
    }

    public String inputAsIPString() {
        return this.inputAsIP_v1();
    }

    public String inputAsIP_v1() {
         return String.format("%d.%d.%d.%d", this.a, this.b, this.c, this.d);
    }
    public String inputAsIP_v2() { // this is basically a check if my shifts work about as expected.
        long a,b,c,d;
        d = this.ip_int%256;
        c = this.ip_int/256%256;
        b = this.ip_int/256/256%256;
        a = this.ip_int/256/256/256%256; // last modulo just to keep the pattern? pretend we never have a non-uint32 :/
        return String.format("%d.%d.%d.%d",a,b,c,d);
    }

    public String inputAsBitPattern() {
        return longAsUint32DotNotation(this.ip_int);
    }
    public String inputAsBitPattern2_depr() {
        // seems slightly intense to do leading zeros. lets try without them?
        // update: deprecated
        return String.format("%8s.%8s.%8s.%8s",
                Long.toBinaryString(a),
                Long.toBinaryString(b),
                Long.toBinaryString(c),
                Long.toBinaryString(d)
                );
    }

    public long bitmaskAsLong() {
        // I .. do not want.
        long bm = 0;
        for (int i = 0; i < this.netbits; i++) {
            bm += 1;
            bm <<= 1;
        };
        bm <<= (32-this.netbits-1);
        return bm;
    }

    public String bitMaskAsString() {
        // this works because the "highest bit" is always "1". methinks. We are still using a long because there is not %!+* uint32
        String withOutDots =  String.format("%s", Long.toBinaryString(this.bitmaskAsLong()));
        String res = String.format("%s.%s.%s.%s",
                withOutDots.substring(0,8),
                withOutDots.substring(8,16),
                withOutDots.substring(16,24),
                withOutDots.substring(24,32)
        );
        return res;
    }
    public String inputAsHex() {
        return String.format("%8x", this.ip_int);
    }

}
