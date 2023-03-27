package LatihanPraktek01;

import java.util.Scanner;

public class PersegiPanjang02 {
	public static void main(String[] args) {
		int panjang, lebar, luas, keliling;
		
		Scanner sc = new Scanner(System.in);
		
		panjang = sc.nextInt();
		lebar = sc.nextInt();
		
		luas = panjang * lebar;
		keliling = 2 * (panjang + lebar);
		
		System.out.println("Panjang : " + panjang);
		System.out.println("Lebar : " + lebar);
		System.out.println("Luas : " + luas);
		System.out.println("Keliling : " + keliling);
		
		sc.close();
	}
}
