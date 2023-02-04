import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        try {
            FileWriter fileWriter = new FileWriter(file);
            System.out.println("Enter text lines (\"-\" to stop): ");
            String line = scanner.nextLine();
            while (!line.equals("-")) {
                fileWriter.write(line + System.lineSeparator());
                line = scanner.nextLine();
            }
            fileWriter.close();
            System.out.println("Text written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
        scanner.close();
    }
}