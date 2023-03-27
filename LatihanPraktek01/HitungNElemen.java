package LatihanPraktek01;

import java.util.Scanner;

public class HitungNElemen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, total;
		
		System.out.print("N = ");
		N = sc.nextInt();
		
		total = 0;
		
		if (N > 0) {
			
			for (int i = 0; i < N; i++) {
				total += sc.nextInt();
			}
			
		} else {
			System.out.println("N tidak boleh nol atau minus");
		}
		
		System.out.println("total = " + total);
		
		sc.close();
	}
}
