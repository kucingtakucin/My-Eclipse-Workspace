/**
 * 
 */
package com.latihan2;

/**
 * @author adam
 *
 */
public class UjiStudents {

	public static void main(String[] args) {
		// studentId, nama, nim, umur, ipk
		Student student1 = new Student(1, "Adam Arthur Faizal", "M3119001", 17, 3.67);
		Student student2 = new Student(2, "Mbah Putih Mulyosugito", "M3119000", 107, -3.67);
		
		// Student 1
		System.out.printf("Halo, namaku %s \n", student1.getNama());
		System.out.printf("Umurku baru %d \n", student1.getUmur());
		System.out.printf("Kemarin aku dapet IPK %f \n\n", student1.getIpk());
		
		// Student 2
		System.out.printf("Halo, namaku %s \n", student2.getNama());
		System.out.printf("Umurku baru %d \n", student2.getUmur());
		System.out.printf("Kemarin aku dapet IPK %f \n\n", student2.getIpk());
		
	}
}
