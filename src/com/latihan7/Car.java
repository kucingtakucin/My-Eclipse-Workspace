/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class Car extends Vehicle{
	private int numDoors;
	private boolean isElectric;

	/**
	 * @param numWheels
	 */
	public Car(int numWheels, int numDoors, boolean isElectric) {
		super(numWheels);
		this.numDoors = numDoors;
		this.isElectric = isElectric;
	}

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}

	/**
	 * @param numDoors the numDoors to set
	 */
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
	/**
	 * @return the isElectric
	 */
	public boolean isElectric() {
		return this.isElectric;
	}

	/**
	 * @param isElectric the isElectric to set
	 */
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
}
