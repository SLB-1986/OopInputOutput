package operations;

import java.io.*;
import java.util.*;

public class ArrayFileOperations {

    public static void main(String[] args) {
        // Read array from input file
        int[] array = readArrayFromFile("input.txt");

        // Reverse the array
        int[] reversedArray = reverseArray(array);

        // Write the reversed array to output file
        writeArrayToFile("output.txt", reversedArray);
    }

    public static int[] readArrayFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            List<Integer> list = new ArrayList<>();

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                list.add(num);
            }

            scanner.close();

            int[] array = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }

            return array;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - i - 1] = array[i];
        }
        return reversedArray;
    }

    public static void writeArrayToFile(String filename, int[] array) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < array.length; i++) {
                writer.write(Integer.toString(array[i]));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
