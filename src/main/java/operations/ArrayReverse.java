package operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {
    public static void main(String[] args) {
        // Read array from file
        List<String> array = readArrayFromFile("input.txt");

        // Reverse the array
        Collections.reverse(array);

        // Write the reversed array to an output file
        writeArrayToFile(array, "output.txt");
    }

    private static List<String> readArrayFromFile(String fileName) {
        try {
            File file = new File(fileName);
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void writeArrayToFile(List<String> array, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String element : array) {
                writer.write(element + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
