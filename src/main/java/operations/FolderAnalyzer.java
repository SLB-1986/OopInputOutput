package operations;

import java.io.File;

public class FolderAnalyzer {
    public static void main(String[] args) {
        String rootFolder = "path/to/root/folder"; //"C:\\path\\to\\root\\folder"
        analyzeFolder(rootFolder);
    }

    private static void analyzeFolder(String folderPath) {
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            int imageCount = 0;
            int pdfCount = 0;
            for (File file : files) {
                if (file.isDirectory()) {
                    analyzeFolder(file.getAbsolutePath());
                } else {
                    String fileName = file.getName();
                    if (fileName.toLowerCase().endsWith(".jpg") || fileName.toLowerCase().endsWith(".png")) {
                        imageCount++;
                    } else if (fileName.toLowerCase().endsWith(".pdf")) {
                        pdfCount++;
                    }
                }
            }
            System.out.println("Folder: " + folder.getAbsolutePath());
            System.out.println("Image Count: " + imageCount);
            System.out.println("PDF Count: " + pdfCount);
            System.out.println();
        }
    }
}
