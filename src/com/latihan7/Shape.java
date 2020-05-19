/**
 * 
 */
package com.latihan7;
/**
 * @author adam
 *
 */
abstract public class Shape {
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
 	abstract public int hitungLuas();
}
