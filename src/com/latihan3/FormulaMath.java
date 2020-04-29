/**
 * 
 */
package com.latihan3;

import java.util.Scanner;

/**
 * @author adam
 *
 */
public class FormulaMath implements MyFormula {
	protected double a,b,c,d,e,f,x,y,z;
	
	public FormulaMath(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void soal1() {
		// a = √(𝑥^5 − 6) / 4     
		this.a = Math.sqrt(Math.pow(x, 5) - 6) / 4;
		System.out.printf("Hasil dari a adalah %f\n", this.a);
	}
	
	@Override
	public void soal2() {
		// b = 𝑥^𝑦 − 6^𝑥
		this.b = Math.pow(this.x, this.y) - Math.pow(6, this.x);
		System.out.printf("Hasil dari b adalah %f\n", this.b);
	}
	
	@Override
	public void soal3() {
		// c = 4.𝑐𝑜𝑠(𝑧  / 5) − 𝑠𝑖𝑛 𝑥^2  
		this.c = 4 * Math.cos(this.z / 5) - Math.sin(Math.pow(this.x, 2));
		System.out.printf("Hasil dari c adalah %f\n", this.c);		
	}
	
	@Override
	public void soal4() {
		// d = 𝑥^4 − √(6𝑥 − 𝑦^3)
		this.d = Math.pow(this.x, 4) - Math.sqrt(6 * this.x - Math.pow(this.y, 3));
		System.out.printf("Hasil dari d adalah %f\n", this.d);
	}
	
	@Override
	public void soal5() {
		// e = 7(𝑐𝑜𝑠(√(5 − 𝑠𝑖𝑛√(3𝑥 − 4)))
		this.e = 7 * (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * this.x - 4)))));
		System.out.printf("Hasil dari e adalah %f\n", this.e);
	}
}

class TestFormula {
	protected static double x, y, z;
	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
	
		System.out.print("Masukkan nilai x = ");
		x = inputUser.nextDouble();
		inputUser.nextLine();
		System.out.print("Masukkan nilai y = ");
		y = inputUser.nextDouble();
		inputUser.nextLine();
		System.out.print("Masukkan nilai z = ");
		z = inputUser.nextDouble();	
		inputUser.close();
		
		FormulaMath formulaMath = new FormulaMath(x, y, z);
		formulaMath.soal1();
		formulaMath.soal2();
		formulaMath.soal3();
		formulaMath.soal4();
		formulaMath.soal5();
	}

}
