package operations;

import java.io.File;

public class FileCounter {
    public static void main(String[] args) {
        String folderPath = "path/to/folder"; // "C:\\path\\to\\folder"
        countImagesAndPDFs(folderPath);
    }

    public static void countImagesAndPDFs(String folderPath) {
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            int imageCount = 0;
            int pdfCount = 0;

            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        countImagesAndPDFs(file.getAbsolutePath()); // Recursive call
                    } else {
                        String fileName = file.getName();
                        if (fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".gif")) {
                            imageCount++;
                        } else if (fileName.endsWith(".pdf")) {
                            pdfCount++;
                        }
                    }
                }
            }

            System.out.println("Folder: " + folder.getAbsolutePath());
            System.out.println("Image Count: " + imageCount);
            System.out.println("PDF Count: " + pdfCount);
            System.out.println("--------------------");
        }
    }
}
