package operations;

import objects.User;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        User user = new User("John Doe", 25);
        String fileName = "user.ser";

        // Serialize the User object
        serializeObject(user, fileName);

        // Deserialize the User object
        User deserializedUser = deserializeObject(fileName);

        // Print the deserialized User object
        System.out.println(deserializedUser);
    }

    private static void serializeObject(User user, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static User deserializeObject(String fileName) {
        User user = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            user = (User) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
