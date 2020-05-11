/**
 * 
 */
package com.latihan6;

/**
 * @author adam
 *
 */
public class Mahasiswa implements MahasiswaInformatika {
	private String nama, nim, prodi;
	private double ipk;
	private boolean status;
	
	public Mahasiswa(String nama, String nim, String prodi, double ipk, boolean status) {
		this.nama = nama;
		this.nim = nim;
		this.prodi = prodi;
		this.ipk = ipk;
		this.status = status;
	}
	
	public static String cetakMahasiswa(String nama, String nim){
		return String.format("Mahasiswa ini bernama %s dan memiliki nim %s\n",nama, nim);
	}
	
	public static String cetakMahasiswa(String nama, String nim, String prodi) {
		return String.format("Mahasiswa ini bernama %s, memiliki nim %s, dan prodi %s\n", nama, nim, prodi);
	}
	
	public static String cetakMahasiswa(String nama, String nim, String prodi, double ipk, boolean status) {
		return String.format("Mahasiswa ini bernama %s, memiliki nim %s, prodi %s, ipk %f, dan statusnya %b\n", nama, nim, prodi, ipk, status);
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
	 * @return the prodi
	 */
	public String getProdi() {
		return this.prodi;
	}

	/**
	 * @param prodi the prodi to set
	 */
	public void setProdi(String prodi) {
		this.prodi = prodi;
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

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return this.status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public void Ngoding() {
		System.out.println("Yeah I'm a Pro Player.");
	}
}

class UjiMahasiswa {

	public static void main(String[] args) {
		Mahasiswa m1 = new Mahasiswa("Mbah Putih","M3119000", "Teknik Informatika", 7.63, true);
		Mahasiswa m2 = new Mahasiswa("Arthur", "M3119001", "Teknik Informatika", 3.67, true);
		
		System.out.println(Mahasiswa.cetakMahasiswa(m1.getNama(), m1.getNim()));
		System.out.println(Mahasiswa.cetakMahasiswa(m1.getNama(), m1.getNim(), m1.getProdi()));
		System.out.println(Mahasiswa.cetakMahasiswa(m1.getNama(), m1.getNim(), m1.getProdi(), m1.getIpk(), m1.isStatus()));

 		System.out.println(Mahasiswa.cetakMahasiswa(m2.getNama(), m2.getNim()));
		System.out.println(Mahasiswa.cetakMahasiswa(m2.getNama(), m2.getNim(), m2.getProdi()));
		System.out.println(Mahasiswa.cetakMahasiswa(m2.getNama(), m2.getNim(), m2.getProdi(), m2.getIpk(), m2.isStatus()));

	}
}