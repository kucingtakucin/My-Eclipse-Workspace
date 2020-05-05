/**
 * 
 */
package com.latihan5;
import java.util.Scanner;

/**
 * @author adam
 *
 */
public class CekAnagram {

	public static void main(String[] args) {
		String kata1, kata2;
		boolean isAnagram = false;
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Masukkan kata pertama : ");
		kata1 = inputUser.nextLine().trim().replace(" ", "");
		System.out.print("Masukkan kata kedua : ");
		kata2 = inputUser.nextLine().trim().replace(" ", "");
		inputUser.close();
		
		if (kata1.length() == kata2.length()) {
			for (int i = 0; i < kata1.length(); i++) {
				isAnagram = false;
				for (int j = 0; j < kata2.length(); j++) {
					if (kata1.charAt(i) == kata2.charAt(j)) {
						isAnagram = !isAnagram;
					}
				}
				if (!isAnagram) {
					System.out.println("Kedua kata tersebut bukanlah anagram.");
					break;
				} else if (i == kata1.length() - 1) {
					System.out.println("Kedua kata tersebut adalah anagram.");
				}
			}
		} else {
			System.out.println("Kedua kata tersebut bukanlah anagram.");
		}
	}
}
