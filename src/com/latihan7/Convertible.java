/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class Convertible extends Car {
	private String roofType;
	
	/**
	 * @param numWheels
	 * @param numDoors
	 * @param isElectric
	 */
	public Convertible(int numWheels, int numDoors, boolean isElectric, String roofType) {
		super(numWheels, numDoors, isElectric);
		this.roofType = roofType;
	}

	/**
	 * @return the roofType
	 */
	public String getRoofType() {
		return this.roofType;
	}

	/**
	 * @param roofType the roofType to set
	 */
	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}
}
