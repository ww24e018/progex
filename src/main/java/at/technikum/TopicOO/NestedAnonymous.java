package at.technikum.TopicOO;

public class NestedAnonymous {

    public static void sof(Object o) {
        System.out.format(o.toString());
    }

    public static void main(String[] args) {
        System.out.format("le main method, she is starting. ");

        Object normalObject = new Object();
        sof(normalObject);

        Object adaptedObject = new Object() {
            @Override
            public String toString() {
                return "adapted Object, with custom toString method?";
            }
        };
        sof(adaptedObject);

        // ok, how ecma can you get?
        String localMethodScopeString = "hello. i am a string.";

        Object theorecticalSubDTO = new Object() {
            @Override
            public String toString() { return localMethodScopeString; }

        };
        sof(theorecticalSubDTO);

    }
}
