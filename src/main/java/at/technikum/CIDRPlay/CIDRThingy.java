package at.technikum.CIDRPlay;


public interface CIDRThingy {
    String DEFAULT_STRING = "ASSERT(0)";
    Integer DEFAULT_INT = 42;

    String inputAsIPString();
    String inputAsBitPattern();
    public String bitMaskAsString();
    public String inputAsHex();

}
