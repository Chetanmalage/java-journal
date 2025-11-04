package Q_1;

import java.util.Scanner;

public class Calculator {
    static int num1;
    static int num2;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();
        sc.close();
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.getInput();
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + c.addNumbers(num1, num2));
    }
}

