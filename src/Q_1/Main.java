/*
 * Q.3.d A Main class will demonstrate 
 * how to use these classes that implement the interface.
 */

package Q_1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        dog.sleep();
        cat.sound();
        cat.sleep();

    }
}
