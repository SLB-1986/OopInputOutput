package exceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class ExceptionHandling extends ExceptionHandlingExample {
    public static void main(String[] args) {
        // NullPointerException example
        String nullString = null;
        try {
            nullString.toUpperCase();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        // ArithmeticException example
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        // NumberFormatException example
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        // NotSerializableException example
        try {
            NotSerializableClass obj = new NotSerializableClass();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            oos.writeObject(obj);
            oos.close();
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
