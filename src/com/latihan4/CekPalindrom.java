/**
 * 
 */
package com.latihan4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author adam
 *
 */
public class CekPalindrom {

	public static void main(String[] args) {
		String kata;
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Masukkan suatu kata : ");
		kata = inputUser.nextLine();
		
		char[] kalimat = kata.toCharArray();
		System.out.println(Arrays.toString(kalimat));
		System.out.println(Arrays.toString(reverseArray(kalimat)));
	
		if (Arrays.toString(kalimat).equals(Arrays.toString(reverseArray(kalimat)))) {
			System.out.println("Ini adalah palindrom");
		} else {
			System.out.println("Ini bukanlah palindrom");
		}
		inputUser.close();
	}
	
	public static char[] reverseArray(char[] data) {
		char temp;
		for (int i = 0; i < data.length / 2; i++) {
			temp = data[i];
			data[i] = data[(data.length - 1) - i];
			data[(data.length - 1) - i] = temp;
		}
		return data;
	}
}
