/**
 * 
 */
package com.latihan5;

/**
 * @author adam
 *
 */
public class MataKuliah {
	// Basis Data, Desain Web, Struktur Data, OOP
	private int[] basda, desgraf, desweb, oop;
	private float nilaiAkhir;
	private final float bobotBasda = 0.2f;
	private final float bobotDesgraf = 0.1f;
	private final float bobotDesweb = 0.2f;
	private final float bobotOop = 0.5f;
	
	public MataKuliah(int[] basda, int[] desgraf, int[] desweb, int[] oop) {
		this.basda = basda;
		this.desgraf = desgraf;
		this.desweb = desweb;
		this.oop = oop;
	}

	/**
	 * @return the nilaiAkhir
	 */
	public float getNilaiAkhir() {
		this.nilaiAkhir = (getValue(this.basda, this.bobotBasda) +
				getValue(this.desgraf, this.bobotDesgraf) + 
				getValue(this.desweb, this.bobotDesweb) + 
				getValue(this.oop, this.bobotOop));
		return this.nilaiAkhir;
	}

	/**
	 * @return the value
	 */
	private float getValue(int[] data, float bobot) {
		float total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		return total * bobot;
	}
}

class CekMataKuliah {

	public static void main(String[] args) {
		int[] basda = {70,80,75};	// Daftar nilai mata kuliah Basis Data
		int[] desgraf = {70,70,80};	// Daftar nilai mata kuliah Desain Grafis
		int[] desweb = {80,85,90};	// Daftar nilai mata kuliah Desain Web
		int[] oop = {90,80,85};		// Daftar nilai mata kuliah OOP
		MataKuliah matkul = new MataKuliah(basda, desgraf, desweb, oop);
		System.out.printf("Nilai akhirnya adalah : %.1f\n", matkul.getNilaiAkhir());
	}
}
