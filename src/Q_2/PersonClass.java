/*
 Q.2b Create another class outside the package to use the Person class.
 */

package Q_2;

import Q_1.Person;

public class PersonClass {
	public static void main(String[] args) {
		
		Person person1 = new Person("Alice", 30);
		person1.displayInfo();
	}
}
