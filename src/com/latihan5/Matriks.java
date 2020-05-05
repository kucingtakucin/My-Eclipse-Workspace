/**
 * 
 */
package com.latihan5;

/**
 * @author adam
 *
 */
public class Matriks {

	public static void main(String[] args) {
		int[][] matriksA = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[][] matriksB = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		penjumlahan(matriksA, matriksB);
		perkalian(matriksA, matriksB);
	}
	
	public static void penjumlahan(int[][] dataA, int[][] dataB) {
		int[][] hasilJumlah = new int[dataA.length][dataB.length];
		for (int i = 0; i < dataA.length; i++) {
			for (int j = 0; j < dataB.length; j++) {
				hasilJumlah[i][j] = dataA[i][j] + dataB[i][j];
			}
		}
		System.out.println("Hasil penjumlahan : ");
		printArray(hasilJumlah);
	}
	
	public static void perkalian(int[][] dataA, int[][] dataB) {
		int[][] hasilKali = new int[dataA.length][dataB.length];
        int buffer;
        for (int i = 0; i < dataA.length; i++){
            for (int j = 0; j < dataB[0].length; j++){
                buffer = 0;
                for (int k = 0; k < dataA[0].length; k++){
                    buffer += dataA[i][k] * dataB[k][j];
                }
                hasilKali[i][j] = buffer;
            }
        }
        System.out.println("Hasil perkalian : ");
        printArray(hasilKali);
	}
	
    public static void printArray(int[][] data){
        for (int i = 0;i < data.length;i++){
            System.out.print("[");
            for (int j = 0;j < data[0].length;j++){
                System.out.print(data[i][j]);
                if (j < (data[0].length - 1)){
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
