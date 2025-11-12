/*
 Q.2a Create a user-defined package Q_1.
 Add a class Person inside that package. 
 Create another class outside the package to use the Person class.
 */

package Q_1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
