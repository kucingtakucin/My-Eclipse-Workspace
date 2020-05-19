/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class Triangle extends Shape {
	private int alas, tinggi;

	/**
	 * @param color
	 */
	public Triangle(String color, int alas, int tinggi) {
		super(color);
		this.alas = alas;
		this.tinggi = tinggi;
	}

	@Override
	public int hitungLuas() {
		return (int)0.5 * alas * tinggi;
	}

	/**
	 * @return the alas
	 */
	public int getAlas() {
		return this.alas;
	}

	/**
	 * @param alas the alas to set
	 */
	public void setAlas(int alas) {
		this.alas = alas;
	}

	/**
	 * @return the tinggi
	 */
	public int getTinggi() {
		return this.tinggi;
	}

	/**
	 * @param tinggi the tinggi to set
	 */
	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

	@Override
	public String toString() {
		return "Triangle [alas=" + this.alas + ", tinggi=" + this.tinggi + ", hitungLuas()=" + this.hitungLuas()
				+ ", getAlas()=" + this.getAlas() + ", getTinggi()=" + this.getTinggi() + ", getColor()="
				+ this.getColor() + ", getClass()=" + this.getClass() + ", hashCode()=" + this.hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
