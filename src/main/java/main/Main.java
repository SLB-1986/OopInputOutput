package main;

import interfaces.SerializationInterface;
import json.JSONSerialization;
import objects.ObjectSerialization;
import objects.User;
import xml.XMLSerialization;

public class Main {
    /**
     * Assignments:
     * Read an array from a file (you can choose the structure of the file that is most suitable for you and your approach).
     * <p>
     * Write the reverse of the array into an output file in a format of your choosing.
     * <p>
     * Create one recursive method that counts the number of images and the number of pdf files for each folder in a folder structure.
     * <p>
     * Create one utility class that is able to serialize and de-serialize a User class. You need to create the user class,
     * the serialization interface and a class that demonstrates different use cases. You need to provide three implementations
     * for the serialization interfaces (for Objects, XML and JSON) and use the implementations through polymorphism based on a given parameter.
     * <p>
     * Make a call hierarchy for 3 or more method in different classes. Throw errors in the last method call and make sure they
     * reach the first method in the call hierarchy.
     * <p>
     * Create a custom exception using inheritance and use the custom exception in the previous example.
     * <p>
     * Write examples that generate(without using “throw”) and properly manage the following exceptions: NullPointerException
     * (accessing a class method), ArithmeticException (for division by 0), NumberFormatException(for parsing an integer),
     * NotSerializableException (for serialization of an object).
     */

    public static void main(String[] args) {

        User user = new User("John Doe", 30);

        SerializationInterface serializer;

        // Serialize and deserialize using ObjectSerialization
        serializer = new ObjectSerialization();
        serializer.serialize(user, "user.dat");

        User deserializedUser = (User) serializer.deserialize("user.dat");

        // Serialize and deserialize using XMLSerialization
        serializer = new XMLSerialization();
        serializer.serialize(user, "user.xml");
        deserializedUser = (User) serializer.deserialize("user.xml");

        // Serialize and deserialize using JSONSerialization
        serializer = new JSONSerialization();
        serializer.serialize(user, "user.json");
        deserializedUser = (User) serializer.deserialize("user.json");


    }
}