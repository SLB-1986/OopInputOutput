package exceptions;

/**
 * Create a custom exception using inheritance and use the custom exception in the previous example.
 */
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
