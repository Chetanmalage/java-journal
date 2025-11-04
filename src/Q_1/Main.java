package Q_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing DisplayInfo ===");
        DisplayInfo info = new DisplayInfo();
        // Uncomment next two lines if you want to test interactively
        // info.getInput();
        // info.display();

        System.out.println("\n=== Testing Calculator ===");
        Calculator calc = new Calculator();
        calc.addNumbers(10, 20);
        System.out.println("The sum is: " + calc.addNumbers(10, 20));

        System.out.println("\n=== Testing Person ===");
        Person p = new Person("Alice", 25);
        p.displayInfo();

        System.out.println("\n=== Testing Interface ===");
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        dog.sleep();
        cat.sound();
        cat.sleep();

        System.out.println("\n=== Testing Exception Handling ===");
        ExceptionExample.main(null);
    }
}
