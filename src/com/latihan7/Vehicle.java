/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
abstract public class Vehicle {
	private int numWheels;
	
	public Vehicle(int numWheels) {
		this.numWheels = numWheels;
	}

	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @param numWheels the numWheels to set
	 */
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
}
