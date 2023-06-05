package interfaces;

public interface SerializationInterface {
    void serialize(Object object, String filename);

    Object deserialize(String filename);
}
