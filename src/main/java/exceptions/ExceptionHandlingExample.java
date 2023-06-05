package exceptions;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        generateNullPointerException();
        handleArithmeticException();
        handleNumberFormatException();
        handleNotSerializableException();
    }

    public static void generateNullPointerException() {
        try {
            String nullString = null;
            System.out.println(nullString.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    public static void handleArithmeticException() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    public static void handleNumberFormatException() {
        try {
            String notANumber = "abc";
            int number = Integer.parseInt(notANumber);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }

    public static void handleNotSerializableException() {
        NotSerializableClass obj = new NotSerializableClass();
        System.out.println("NonSerializableException: " + obj);


    }
}
