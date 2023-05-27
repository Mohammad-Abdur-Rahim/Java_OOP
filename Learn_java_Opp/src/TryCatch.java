
import java.io.FileNotFoundException;
import java.io.FileReader;
public class TryCatch {

    public static void main(String[] args) {
        try {
            readFromFile("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFromFile(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
        // Code to read from the file
        // ...
    }
}

