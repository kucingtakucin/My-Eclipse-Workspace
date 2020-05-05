/**
 * 
 */
package com.latihan5;

/**
 * @author adam
 *
 */
public class UjiException {

	public static void main(String[] args) {
		String[] greeting = {"Satu", "Dua", "Tiga"};
		try {
			for (int i = 0; i <= greeting.length; i++) {
				System.out.println(greeting[i]);
			}			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		} finally {
			System.out.println("Program selesai 1");
		}
		System.out.println("Program selesai 2");
	}
}
