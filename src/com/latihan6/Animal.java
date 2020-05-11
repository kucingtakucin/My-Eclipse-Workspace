/**
 * 
 */
package com.latihan6;

/**
 * @author adam
 *
 */
public class Animal {
	private double weight, height, speed;
	private String nama;
	
	public Animal() {}
	
	public Animal(String nama, int weight, double height, int speed) {	
		this.nama = nama;
		this.weight = weight;	
		this.height = height;
		this.speed = speed;
	}

	public double getTime(double miles) {
		return miles / this.speed;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return this.height;
	}
	
	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return this.speed;
	}

	/**
	 * @return the nama
	 */
	public String getNama() {
		return this.nama;
	}

	/**
	 * @param nama the nama to set
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}	
}

class UjiAnimal {

	public static void main(String[] args) {
		Animal cheetah = new Animal("Cheetah", 70, 0.9, 58);
		Animal kijang = new Animal("Kijang", 35,0.9,54);
		
		System.out.printf("---- %s ----\n", cheetah.getNama());
		System.out.printf("%s memiliki berat %.1f kilogram, ", cheetah.getNama(), cheetah.getWeight());
		System.out.printf("tinggi %.1f meter, ", cheetah.getHeight());
		System.out.printf("dan kecepatan lari %.1f mil/jam\n", cheetah.getSpeed());
		
		System.out.printf("---- %s ----\n", kijang.getNama());
		System.out.printf("%s memiliki berat %.1f kilogram, ", kijang.getNama(), kijang.getWeight());
		System.out.printf("tinggi %.1f meter, ", kijang.getHeight());
		System.out.printf("dan kecepatan lari %.1f mil/jam\n", kijang.getSpeed());
		
	}
}
