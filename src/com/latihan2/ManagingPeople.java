/**
 * 
 */
package com.latihan2;

/**
 * @author adam
 *
 */
public class ManagingPeople {

	public static void main(String[] args) {
		Person p1 = new Person("Arial", 37);
		Person p2 = new Person("Joseph", 15);
		
		if (p1.getAge() == p2.getAge()) {
			System.out.printf("%s is the same age as %s \n", p1.getName(), p2.getName());
		} else {
			System.out.printf("%s is not the same age as %s \n", p1.getName(), p2.getName());
		}
	}
}
