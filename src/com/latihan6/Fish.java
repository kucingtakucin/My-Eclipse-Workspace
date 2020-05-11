/**
 * 
 */
package com.latihan6;

/**
 * @author adam
 *
 */
public class Fish extends Animal implements SeaAnimal {
	private String typeOfFish;
	private int friendLiness;
	
	public Fish() {		// default constructor
		this.typeOfFish = null;
		this.friendLiness = 3;
	}
	
	public Fish(String nama, String typeOfFish, int friendLiness) {
		this.setNama(nama);
		this.typeOfFish = typeOfFish;
		this.friendLiness = friendLiness;
	}
	
	/**
	 * @param nama
	 * @param weight
	 * @param height
	 * @param speed
	 */
	public Fish(String nama, int weight, double height, int speed, String typeOfFish, int friendLiness) {
		super(nama, weight, height, speed);
		this.typeOfFish = typeOfFish;
		this.friendLiness = friendLiness;
	}

	/**
	 * @return the typeOfFish
	 */
	public String getTypeOfFish() {
		return this.typeOfFish;
	}

	/**
	 * @param typeOfFish the typeOfFish to set
	 */
	public void setTypeOfFish(String typeOfFish) {
		this.typeOfFish = typeOfFish;
	}

	/**
	 * @return the friendLiness
	 */
	public int getFriendLiness() {
		return this.friendLiness;
	}

	/**
	 * @param friendLiness the friendLiness to set
	 */
	public void setFriendLiness(int friendLiness) {
		this.friendLiness = friendLiness;
	}
	
	public static Fish nicestFish(Fish fish1, Fish fish2) {
		if (fish1.getFriendLiness() < fish2.getFriendLiness()) 
			return fish1;
		return fish2;
	}
	
	public static Fish nicestFish(Fish ...fishs) {
		Fish temp = fishs[0];
		for (int i = 0; i < fishs.length; i++) {
			if (temp.getFriendLiness() < fishs[i].getFriendLiness()) {
				temp = fishs[i];
			}
		}
		return temp;
	}

	@Override
	public void berenang() {
		System.out.println("Yeah I'm Pro Player.");
	}
}

class UjiFish {
	
	public static void main(String[] args) {
		Fish Amber = new Fish("Amber", "AngelFish", 5);
		Fish James = new Fish("James", "Guppy", 3);
		Fish Arthur = new Fish("Arthur", "MbahFish", 5);
		
		Fish hasil1 = Fish.nicestFish(Amber, James);
		System.out.printf("%s memiliki friendliness yang paling tinggi\n", hasil1.getNama());
		Fish hasil2 = Fish.nicestFish(Amber, James, Arthur);
		System.out.printf("%s memiliki friendliness yang paling tinggi\n", hasil2.getNama());

	}
}
