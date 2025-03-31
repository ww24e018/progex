package at.technikum.TopicOO;

public class NestingThingy {

    class NestedThingy {
        public String nt_objectvar;

        public NestedThingy() {
            this.nt_objectvar = "";
        }
        /* this does not work; compile-time error; and kinda makes sense; the class itself is not static, etc? */
        /*public static void nestedThingyStaticMethod() {
            System.out.format("This is the static method of nestedthingy speaking\n");
        }*/
        public void nestedThingyNonStaticMethod() {
            System.out.format("This is the NON static method of nestedthingy speaking\n");
        }

    }


    public static void main(String[] args) {
        System.out.format("TestClass for testing nesting\n");

        // this does not work; "non-static variable this cannot be referenced from a static context"
        // NestedThingy myNestedT = new NestedThingy();

        // does not work, too
        // NestedThingy.nestedThingyNonStaticMethod();

        // doest not work ; see above;
        // NestedThingy myNestedThingy = new NestingThingy.NestedThingy();
        NestingThingy myNestingThingy = new NestingThingy();
        // does also not work; thank *. or .. idk. no idea
        // NestingThingy.NestedThingy myNestedThingy = new myNestingThingy.NestedThingy(); //? does this work
        // is this in my .. namespace?

        // NestedThingy myNestedThingy = new NestedThingy();
        // I give up.

        //myNestedThingy.nestedThingyNonStaticMethod();

        myNestingThingy.thisMethodIsForCallingNonStaticThings();

    }

    void thisMethodIsForCallingNonStaticThings() {
        // indeed;
        NestedThingy myNestedThingy = new NestedThingy();
        myNestedThingy.nestedThingyNonStaticMethod();
    }

}
