/*
 Q.3.b Two classes, Dog and Cat, will implement this interface
 by providing their  own versions of these methods.
 */

package Q_1;

public class Dog implements Animal {
    public void sound() {
        System.out.println("The dog says: Woof Woof");
    }

    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}
