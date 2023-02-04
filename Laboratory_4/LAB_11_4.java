import java.io.*;
import java.util.Scanner;

class ReadBinaryFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path:");
        String filePath = scanner.nextLine();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int day = dis.readInt();
            int month = dis.readInt();
            int year = dis.readInt();
            System.out.println("Birthday: " + day + "/" + month + "/" + year);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading the file!");
        }
    }
}