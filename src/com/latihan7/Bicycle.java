/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class Bicycle extends Vehicle {
	private String bikeType;
	
	/**
	 * @param numWheels
	 */
	public Bicycle(int numWheels, String bikeType) {
		super(numWheels);
		this.bikeType = bikeType;
	}

	/**
	 * @return the bikeType
	 */
	public String getBikeType() {
		return this.bikeType;
	}

	/**
	 * @param bikeType the bikeType to set
	 */
	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}	
}
