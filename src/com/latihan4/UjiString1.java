/**
 * 
 */
package com.latihan4;

/**
 * @author adam
 *
 */
public class UjiString1 {

	public static void main(String[] args) {
		String S1 = "ABC";
		String S2 = new String("DEF");
		String S3 = "AB" + "C";
		System.out.println("a. " + S1.compareTo(S2));
		System.out.println("b. " + S2.equals(S3));
		System.out.println("c. " + (S3 == S1));
		System.out.println("d. " + S2.compareTo(S3));
		System.out.println("e. " + S3.equals(S1));
	}
}
