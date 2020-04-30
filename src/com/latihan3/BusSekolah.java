/**
 * 
 */
package com.latihan3;

import java.util.Scanner;

/**
 * @author adam
 *
 */
public class BusSekolah {
	private int penumpang;
	private final int kursi = 45;
	
	public BusSekolah(int penumpang) {
		this.penumpang = penumpang;
	}

	/**
	 * @return the penumpang
	 */
	public int getPenumpang() {
		return this.penumpang;
	}

	/**
	 * @param penumpang the penumpang to set
	 */
	public void setPenumpang(int penumpang) {
		this.penumpang = penumpang;
	}

	/**
	 * @return the kursi
	 */
	public int getKursi() {
		return this.kursi;
	}
}

class TestBus{

	public static void main(String[] args) {
		int penumpang, van, kosong;
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Masukkan jumlah penumpang = ");
		penumpang = inputUser.nextInt(); inputUser.nextLine();
		
		BusSekolah busSekolah = new BusSekolah(penumpang);
		System.out.printf("Jumlah penumpang saat ini adalah = %d\n", busSekolah.getPenumpang());
		System.out.printf("Sedangkan jumlah kursi = %d\n", busSekolah.getKursi());
		if (busSekolah.getPenumpang() > busSekolah.getKursi()) {
			van = busSekolah.getPenumpang() - busSekolah.getKursi();
			System.out.printf("Wah penumpangnya terlalu banyak, jadi ada %d penumpang yang naik van\n", van);
		} else {
			kosong = busSekolah.getKursi() - busSekolah.getPenumpang();
			System.out.printf("Wah masih ada %d kursi yang kosong\n", kosong);
		}
		inputUser.close();
	}
}
