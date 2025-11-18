import java.io.*;


public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output.txt")) {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch (FileNotFoundException e) {
            if (e.getMessage().contains("input.txt")) {
                System.out.println("input file not found" + e.getMessage());
            } else if (e.getMessage().contains("output.txt")) {
                System.out.println("output file not found");
            } else {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("no write-permission for the output file" + e.getMessage());
        }
    }
}