/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class Circle extends Shape {
	private int jejari;

	/**
	 * @param color
	 */
	public Circle(String color, int jejari) {
		super(color);
		this.jejari = jejari;
	}

	@Override
	public int hitungLuas() {
		return (int) (3.14 * Math.pow(jejari, 2));
	}

	/**
	 * @return the jejari
	 */
	public int getJejari() {
		return this.jejari;
	}

	/**
	 * @param jejari the jejari to set
	 */
	public void setJejari(int jejari) {
		this.jejari = jejari;
	}

	@Override
	public String toString() {
		return "Circle [jejari=" + this.jejari + ", hitungLuas()=" + this.hitungLuas() + ", getJejari()="
				+ this.getJejari() + ", getColor()=" + this.getColor() + ", getClass()=" + this.getClass()
				+ ", hashCode()=" + this.hashCode() + ", toString()=" + super.toString() + "]";
	}
}
