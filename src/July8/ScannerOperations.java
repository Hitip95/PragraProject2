package July8;
import java.util.Scanner;


public class ScannerOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the operator (+, -, *): ");
        String operator = scanner.next();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result;

        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operator");
        }

        scanner.close();
    }

    }


