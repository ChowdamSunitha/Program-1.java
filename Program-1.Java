import java.util.Scanner;

class Calculator {

    double a, b;
    String operation;

    void calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result = " + (a + b));
                break;

            case "subtract":
                System.out.println("Result = " + (a - b));
                break;

            case "multiply":
                System.out.println("Result = " + (a * b));
                break;

            case "divide":
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero is not allowed");
                break;

            default:
                System.out.println("Invalid operation");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator c = new Calculator();

        System.out.print("Enter value of a: ");
        c.a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        c.b = sc.nextDouble();

        System.out.print("Enter operation (add / subtract / multiply / divide): ");
        c.operation = sc.next();

        c.calculate();
    }
}
