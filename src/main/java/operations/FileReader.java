package operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Desktop\\storehouse guid";
        try {
            File file = new File(filePath);
            Scanner myScanner = new Scanner(file);
            while (myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                System.out.println(line);
            }
            myScanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found: " + filePath);
        }
    }
}
