import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class DisplayFileContent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filePath = input.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                System.out.println(line);
            }
            System.out.println("The file has " + lineCount + " lines.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}