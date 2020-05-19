/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class UjiBangunDatar {

	public static void main(String[] args) {
		Shape persegiPanjang = new Rectangle("Merah Muda", 2,3);
		Shape lingkaran = new Circle("Kuning", 4);
		Shape segitiga = new Triangle("Hijau muda", 5, 10);
		Rectangle persegi = new Square("Biru muda", 8);
		
		System.out.println(persegiPanjang.toString());
		System.out.println(lingkaran.toString());
		System.out.println(segitiga.toString());
		System.out.println(persegi.toString());
	}
}
