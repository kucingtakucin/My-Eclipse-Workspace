/**
 * 
 */
package com.praktikum2;

/**
 * @author adam
 *
 */
public class Student {
	private int studentId;
	private String name;
	private String ssn;
	private double gpa;
	public final int SCHCODE = 34958;
	
	public Student() {
		
	}
	
	public Student(int x, String n, String s, double g){
		this.studentId = x;
		this.name = n;
		this.ssn = s;
		this.gpa = g;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return this.ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return this.gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public void setStudentId(int value) {
		this.studentId = value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + this.studentId + ", name=" + this.name + ", ssn=" + this.ssn + ", gpa="
				+ this.gpa + ", SCHCODE=" + this.SCHCODE + ", getSsn()=" + this.getSsn() + ", getGpa()=" + this.getGpa()
				+ ", getStudentId()=" + this.getStudentId() + ", getName()=" + this.getName() + ", getClass()="
				+ this.getClass() + ", hashCode()=" + this.hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
