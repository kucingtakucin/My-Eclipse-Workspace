/**
 * 
 */
package com.latihan3;

import java.util.Scanner;

/**
 * @author adam
 *
 */
public class LuasSegitiga {

	public static void main(String[] args) {
		double luas, alas, tinggi;
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Masukkan panjang alas : ");
		alas = inputUser.nextDouble(); inputUser.nextLine();
		System.out.print("Masukkan tinggi : ");
		tinggi = inputUser.nextDouble(); inputUser.nextLine();
		
		luas = 0.5 * alas * tinggi;
		System.out.printf("Maka luas segitiga adalah %.2f \n", luas);
		inputUser.close();
	}
}
