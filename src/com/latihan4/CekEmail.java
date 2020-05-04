/**
 * 
 */
package com.latihan4;

import java.util.Scanner;

/**
 * @author adam
 *
 */
public class CekEmail {

	public static void main(String[] args) {
		String email, domain;
		int posisi;
		boolean isValid = false;
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Masukkan email kamu : ");
		email = inputUser.nextLine();
		while (!isValid) {
			if (email.contains("@")) {
				isValid = true;
				posisi = email.indexOf("@");
				domain = email.substring(posisi);
				System.out.printf("Email valid! email kamu : %s\n", email);
				System.out.printf("Domain : %s\n", domain);	
			} else {
				System.out.println("Email tidak valid. Coba lagi!");
				System.out.print("Masukkan lagi email kamu : ");
				email = inputUser.nextLine();
			}			
		}
		inputUser.close();
	}
}
