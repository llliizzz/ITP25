import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("12/input.txt"))) {

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            try {
                int result = num1 / num2;
                System.out.println("result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("division by zero is not allowed");
            }

        } catch (FileNotFoundException e) {
            System.out.println("input file not found: " + e.getMessage());
        }
    }
}
