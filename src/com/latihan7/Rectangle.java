/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class Rectangle extends Shape{
	private int panjang, lebar;

	/**
	 * @param color
	 */
	public Rectangle(String color, int panjang, int lebar) {
		super(color);
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	public int hitungLuas() {
		return this.panjang * this.lebar;
	}

	/**
	 * @return the panjang
	 */
	public int getPanjang() {
		return this.panjang;
	}

	/**
	 * @param panjang the panjang to set
	 */
	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}

	/**
	 * @return the lebar
	 */
	public int getLebar() {
		return this.lebar;
	}

	/**
	 * @param lebar the lebar to set
	 */
	public void setLebar(int lebar) {
		this.lebar = lebar;
	}

	@Override
	public String toString() {
		return "Rectangle [panjang=" + this.panjang + ", lebar=" + this.lebar + ", hitungLuas()=" + this.hitungLuas()
				+ ", getPanjang()=" + this.getPanjang() + ", getLebar()=" + this.getLebar() + ", getColor()="
				+ this.getColor() + ", getClass()=" + this.getClass() + ", hashCode()=" + this.hashCode()
				+ ", toString()=" + super.toString() + "]";
	}	
}
