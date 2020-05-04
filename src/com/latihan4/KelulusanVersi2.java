/**
 * 
 */
package com.latihan4;

import java.util.Scanner;

/**
 * @author adam
 *
 */
public class KelulusanVersi2 {

	public static void main(String[] args) {
		String nama;
		int nilai, bolos;
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Masukkan nama kamu : ");
		nama = inputUser.nextLine();
		System.out.print("Masukkan nilai : ");
		nilai = inputUser.nextInt();
		inputUser.nextLine();
		System.out.print("Masukkan berapa kali bolos : ");
		bolos = inputUser.nextInt();
		inputUser.close();
		
		Mahasiswa mahasiswa1 = new Mahasiswa(nama, nilai, bolos);
		String hasil = (mahasiswa1.getNilai() > 60 && mahasiswa1.getBolos() < 3) ? mahasiswa1.getNama() + " lulus!" : mahasiswa1.getNama() + " tidak lulus!"; 
		System.out.printf("Pengumuman : %s\n", hasil);
	}
}
