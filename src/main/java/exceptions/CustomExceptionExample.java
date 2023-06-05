package exceptions;

/**
 * Create a custom exception using inheritance and use the custom exception in the previous example.
 */
public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            methodA();
        } catch (CustomException e) {
            e.printStackTrace();
        }
        try {
            throw new CustomException("Custom exception occurred.");
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }


    public static void methodA() throws CustomException {
        System.out.println("Inside method A.");
        methodB();
    }

    public static void methodB() throws CustomException {
        System.out.println("Inside method B.");
        methodC();
    }

    public static void methodC() throws CustomException {
        System.out.println("Inside method C.");
        throw new CustomException("Custom Exception in method C.");
    }
}
