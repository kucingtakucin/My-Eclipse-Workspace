/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class Square extends Rectangle {
	private int sisi;
	
	/**
	 * @param color
	 * @param panjang
	 * @param lebar
	 */
	public Square(String color, int sisi) {
		super(color, sisi, sisi);
	}

	@Override
	public int hitungLuas() {
		return (int) Math.pow(sisi, 2);
	}

	/**
	 * @return the sisi
	 */
	public int getSisi() {
		return this.sisi;
	}

	/**
	 * @param sisi the sisi to set
	 */
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}

	@Override
	public String toString() {
		return "Square [sisi=" + this.sisi + ", hitungLuas()=" + this.hitungLuas() + ", getSisi()=" + this.getSisi()
				+ ", getPanjang()=" + this.getPanjang() + ", getLebar()=" + this.getLebar() + ", toString()="
				+ super.toString() + ", getColor()=" + this.getColor() + ", getClass()=" + this.getClass()
				+ ", hashCode()=" + this.hashCode() + "]";
	}
}
