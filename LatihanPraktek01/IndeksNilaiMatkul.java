package LatihanPraktek01;

import java.util.Scanner;

public class IndeksNilaiMatkul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		double nilaiAkhir;
		
		input = sc.nextLine();
		
		if (input.length() == 0) {
			System.out.println("Nilai harus diisi");
		} else {
			nilaiAkhir = Double.valueOf(input);
			
			if (nilaiAkhir >= 81 && nilaiAkhir <= 100) {
				System.out.println("A");			
			} else if (nilaiAkhir >= 76 && nilaiAkhir <= 80) {
				System.out.println("AB");
			} else if (nilaiAkhir >= 56 && nilaiAkhir <= 75) {
				System.out.println("B");
			} else if (nilaiAkhir >= 51 && nilaiAkhir <= 55) {
				System.out.println("BC");
			} else if (nilaiAkhir >= 41 && nilaiAkhir <= 50) {
				System.out.println("C");
			} else if (nilaiAkhir >= 21 && nilaiAkhir <= 40) {
				System.out.println("D");
			} else if (nilaiAkhir >= 0 && nilaiAkhir <= 20) {
				System.out.println("E");
			} else {
				System.out.println("Nilai di luar jangkauan");
			}
		}
		
		sc.close();
	}
}
