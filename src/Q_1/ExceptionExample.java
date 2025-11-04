package Q_1;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("This block is always executed.");
        }

        System.out.println("Program continues...");
    }
}
