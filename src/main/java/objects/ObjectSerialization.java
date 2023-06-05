package objects;

import interfaces.SerializationInterface;

public class ObjectSerialization implements SerializationInterface {
    @Override
    public void serialize(Object object, String filename) {
        // Implement object serialization
    }

    @Override
    public Object deserialize(String filename) {
        // Implement object deserialization
        return null;
    }
}
