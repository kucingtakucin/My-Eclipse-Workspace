/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class DriverTurtle {
	
	public static void main(String[] args) {
		Turtle t1 = new Turtle(1);
		Turtle t2 = new Turtle(2);
		
		System.out.printf("Jumlah tangki total adalah %s\n\n", Turtle.getNumTanks());
		Turtle.setNumTanks(5);
		System.out.printf("Turtle t1 berusia %d bulan\n", t1.getAge());
		System.out.printf("Turtle t1 berada di tangki nomor %d\n", t1.getTankNum());
		System.out.println(Turtle.fishTanks());
		System.out.println("-----------------------------------------------------");
		System.out.printf("Turtle t2 berusia %d bulan\n", t2.getAge());
		System.out.printf("Turtle t2 berada di tangki nomor %d\n", t2.getTankNum());
		System.out.println(Turtle.fishTanks());
	}
}
