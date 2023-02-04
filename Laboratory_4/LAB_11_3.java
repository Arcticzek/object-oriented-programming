import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class BirthdateToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the output file: ");
        String fileName = scan.nextLine();

        System.out.print("Enter your birth day (dd): ");
        int day = scan.nextInt();

        System.out.print("Enter your birth month (mm): ");
        int month = scan.nextInt();

        System.out.print("Enter your birth year (yyyy): ");
        int year = scan.nextInt();

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(toBinary(day));
            fos.write(toBinary(month));
            fos.write(toBinary(year));
            System.out.println("Data was successfully saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the data.");
            e.printStackTrace();
        }
    }

    private static byte[] toBinary(int num) {
        byte[] binary = new byte[32];
        int index = 31;
        int bit;

        for (int i = 0; i < 32; i++) {
            bit = num & 1;
            binary[index] = (byte) bit;
            num = num >> 1;
            index--;
        }

        return binary;
    }
}