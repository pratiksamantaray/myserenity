package selenium;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class

public class WriteToFile {
    public static void writeIntoFile(String content) {
        try {
            FileWriter myWriter = new FileWriter("webpage.txt");
            myWriter.write(content);
            myWriter.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}