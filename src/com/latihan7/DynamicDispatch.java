/**
 * 
 */
package com.latihan7;

/**
 * @author adam
 *
 */
public class DynamicDispatch {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A referensi;
		referensi = b;
		referensi.callThis();
		referensi = c;
		referensi.callThis();
		referensi = a;
		referensi.callThis();
	}
}
