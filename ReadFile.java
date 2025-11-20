import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public static void readFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            System.out.println("Contents of the file:");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void writeToFile(String fileName) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to add content to the file? (yes/no): ");
        String response = sc.nextLine();

        if ("yes".equalsIgnoreCase(response)) {
            System.out.println("Enter the content you want to add:");
            String contentToAdd = sc.nextLine();

            try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
                fos.write(contentToAdd.getBytes());
                System.out.println("Content has been added to the file.");
            } catch (IOException e) {
                System.out.println("Error writing to the file: " + e.getMessage());
            }
        } else {
            System.out.println("No content will be added to the file.");
        }
    }

    public static void createFileIfNotExist(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + fileName);
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("Error creating the file: " + e.getMessage());
            }
        } else {
            System.out.println("File already exists.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the file: ");
        String fileName = sc.nextLine();

        createFileIfNotExist(fileName);

        readFile(fileName);

        writeToFile(fileName);
    }
}
