package exceptions;

public class NotSerializableClass extends Throwable {
    // Class definition without implementing Serializable interface
    // Can have some fields and methods, but are not truly necessary
    public NotSerializableClass() {
        super();
    }
}
