/*
 Q.1.b Write a Java program that creates a DisplayInfo class, takes user input (name, age, city, 
and date of birth), and then displays the information
*/

package Q_1;

import java.util.Scanner;

public class DisplayInfo {
    private String name;
    private int age;
    private String city;
    private String dob;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your city: ");
        city = sc.nextLine();
        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        dob = sc.nextLine();
        sc.close();
    }

    public void display() {
        System.out.println("\n--- Displaying User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Date of Birth: " + dob);
    }

    public static void main(String[] args) {
        DisplayInfo user = new DisplayInfo();
        user.getInput();
        user.display();
    }
}
