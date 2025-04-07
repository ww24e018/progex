package at.technikum.w3res;

public class ExceptionTryingOne {
    public static void main(String[] args) {
        // ???
        try {
            System.out.format("entering try block\n");
            Exception e = new Exception();
            throw e;
        } catch(Exception e) {
            System.out.format("entering catch block\n");
        }
        for (int i = 0; i < 10; i++) {
            try {
                System.out.format("entering another try block (#%d); ",i);
                if (Math.random() > 0.5) {
                    Exception e = new Exception();
                    throw e;
                }
                System.out.format("leaving this try block in a casual way\n");
            } catch(Exception e) {
                System.out.format("entering catch block\n");
            }
        }


        for (int i = 0; i<50; i++) {
            try {
                System.out.format("test(ing the idea 'surround' function (iteration %d) ", i);
                if (Math.random() < 0.05) { throw new Exception(); }
            } catch (Exception e) {
                System.out.format("about to throw an exception ...\n");
                throw new RuntimeException(e);
            } finally {
               System.out.format("??? (finally block speaking here)\n");
            }
        }

    }
}
