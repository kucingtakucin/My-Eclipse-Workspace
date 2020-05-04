/**
 * 
 */
package com.latihan4;

import java.util.Scanner;

/**
 * @author adam
 *
 */
public class KelulusanVersi1 {
	
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
		if (mahasiswa1.getNilai() > 60 && mahasiswa1.getBolos() < 3) {
			System.out.printf("Mahasiswa dengan nama %s lulus!", mahasiswa1.getNama());
		} else {
			System.out.printf("Mahasiswa dengan nama %s tidak lulus!", mahasiswa1.getNama());
		}
	}
}

class Mahasiswa {
	private String nama;
	private int nilai, bolos;
	
	public Mahasiswa(String nama, int nilai, int bolos) {
		this.nama = nama;
		this.nilai = nilai;
		this.bolos = bolos;
	}

	/**
	 * @return the nama
	 */
	public String getNama() {
		return this.nama;
	}
	

	/**
	 * @return the nilai
	 */
	public int getNilai() {
		return this.nilai;
	}

	/**
	 * @param nilai the nilai to set
	 */
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	/**
	 * @return the bolos
	 */
	public int getBolos() {
		return this.bolos;
	}

	/**
	 * @param bolos the bolos to set
	 */
	public void setBolos(int bolos) {
		this.bolos = bolos;
	}
}
