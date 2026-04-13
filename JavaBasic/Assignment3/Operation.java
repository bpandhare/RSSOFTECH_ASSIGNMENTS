import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number a:");
        int a = sc.nextInt();

        System.out.println("Enter Second number b:");
        int b = sc.nextInt();

        System.out.println("Enter an operation (+, -, *, /):");
        char op = sc.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println("Addition: " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Division: " + (a / b));
                else
                    System.out.println("Error! Division by zero");
                break;

            default:
                System.out.println("Invalid Operator!");
        }

        sc.close();
    }
}