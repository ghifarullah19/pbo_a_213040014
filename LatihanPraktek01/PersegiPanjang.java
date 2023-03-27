package LatihanPraktek01;

import java.util.Scanner;

public class PersegiPanjang {
	double panjang, lebar;
	
	public static void main(String[] args) {
		PersegiPanjang PP = new PersegiPanjang();
		Scanner sc = new Scanner(System.in);
		
		PP.panjang = sc.nextDouble();
		PP.lebar = sc.nextDouble();
		
		PP.tampil();
		
		sc.close();
	}
	
	double hitungLuas() {
		double luas;
		
		luas = panjang * lebar;
		
		return luas;
	}
	
	double hitungKeliling() {
		double keliling;
		
		keliling = 2 * (panjang + lebar);
		
		return keliling;
	}
	
	void tampil() {
		System.out.println("Panjang : " + panjang);
		System.out.println("Lebar : " + lebar);
		System.out.println("Luas : " + hitungLuas());
		System.out.println("Keliling : " + hitungKeliling());
	}
}
