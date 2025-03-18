import java.io.File;
import java.util.*;

public class FileManager {

    // Create a method that will list the directory with all the file
    public void listFiles(String directoryPath){
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()){
            File[] contents = directory.listFiles();

            if (contents != null){
                for (File file : contents){
                    if (file.isDirectory()){
                        System.out.println("[DIR]: " + file.getName());
                    } else {
                        System.out.println("[FILE]: " + file.getName());
                    }
                }
            } else {
                System.out.println("Directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path: Path either doesn't exist or is not a directory.");
        }
    }

    // Create a method which will allow the user to create a directory
    public void createDirectory(String directoryPath){
        File directory = new File(directoryPath);
        if (directory.mkdir()){
            System.out.println("Successfully created a directory");
        } else {
            System.out.println("Failed to create a directory.");
        }
    }

    // Create a method to delete directories or files
    public void deleteFileOrDirectory(String directoryOrFilePath){
        File file = new File(directoryOrFilePath);
        if (file.delete()){
            System.out.println("Successfully deleted the file");
        } else {
            System.out.println("Failed to delete file");
        }
    }
}
