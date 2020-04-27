/**
 * 
 */
package com.latihan2;

/**
 * @author adam
 *
 */
public class Student {
	private int studentId;
	private String nama;
	private String nim;
	private int umur;
	private double ipk;
	
	public Student(int studentId, String nama, String nim, int umur, double ipk) {
		this.studentId = studentId;
		this.nama = nama;
		this.nim = nim;
		this.umur = umur;
		this.ipk = ipk;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return this.studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	/**
	 * @return the nim
	 */
	public String getNim() {
		return this.nim;
	}

	/**
	 * @param nim the nim to set
	 */
	public void setNim(String nim) {
		this.nim = nim;
	}

	/**
	 * @return the umur
	 */
	public int getUmur() {
		return this.umur;
	}

	/**
	 * @param umur the umur to set
	 */
	public void setUmur(int umur) {
		this.umur = umur;
	}

	/**
	 * @return the ipk
	 */
	public double getIpk() {
		return this.ipk;
	}

	/**
	 * @param ipk the ipk to set
	 */
	public void setIpk(double ipk) {
		this.ipk = ipk;
	}
}
