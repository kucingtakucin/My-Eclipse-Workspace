package com.praktikum;

import java.util.Scanner;

/**
 * @author adam
 *
 */
public class GalToLit {
	
	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		int jumlahGalon = 0, hasilLiter;
		
		try {
			System.out.print("Masukkan jumlah galon : ");
			jumlahGalon = inputUser.nextInt();
			inputUser.nextLine();			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.err.println("Yang anda masukkan bukan angka!");
		} finally {
			hasilLiter = jumlahGalon * 3785;
			System.out.printf("Nilai awal %d, dan hasil konversi %d \n", jumlahGalon, hasilLiter);	
		}
		inputUser.close();
	}
}
