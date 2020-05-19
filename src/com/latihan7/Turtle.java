/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class Turtle {
	private static String food = "Turtle feed";
	private static int numTanks = 3;
	private int age, tankNum;
	
	public Turtle(int age) {
		this.age = age;
		this.tankNum = (int)((Math.random() * numTanks) + 1);
		System.out.printf("Makananku adalah %s\n", Turtle.food);
	}

	public static String fishTanks() {
		return "I have " + numTanks + " fish tanks.";
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the tankNum
	 */
	public int getTankNum() {
		return this.tankNum;
	}

	/**
	 * @return the numTanks
	 */
	public static int getNumTanks() {
		return numTanks;
	}

	/**
	 * @param numTanks the numTanks to set
	 */
	public static void setNumTanks(int numTanks) {
		Turtle.numTanks = numTanks;
	}	
}
