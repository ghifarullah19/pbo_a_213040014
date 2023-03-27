package LatihanPraktek02;

public class LingkaranMain {
	
	public static void main(String[] args) {
		Lingkaran l1 = new Lingkaran(5);
		Lingkaran l2 = l1;
		System.out.println(l1.getJari2());
		System.out.println(l2.getJari2());
		ubahJari2(l2);
		System.out.println(l1.getJari2());
		System.out.println(l2.getJari2());	
		
		// Referensi 3 Variabel
//		Lingkaran l1 = new Lingkaran(5);
//		Lingkaran l2 = l1;
//		Lingkaran l3 = new Lingkaran(7);
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());
//		l1 = null;
//		l2 = null;
//		l3 = null;
		
//		Lingkaran l1 = new Lingkaran(5);
//		Lingkaran l2 = l1;
//		Lingkaran l3 = new Lingkaran(7);
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());
//		l2 = null;
//		System.out.println(l1.getJari2());
//		if (l2 != null) System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());
		
//		Lingkaran l1 = new Lingkaran(5);
//		Lingkaran l2 = l1;
//		Lingkaran l3 = new Lingkaran(7);
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());
//		l2 = null;
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());
		
//		Lingkaran l1 = new Lingkaran(5);
//		Lingkaran l2 = l1;
//		Lingkaran l3 = new Lingkaran(7);
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());
//		l2 = l3;
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
//		System.out.println(l3.getJari2());
		
		// Referensi > 1 Variabel
//		Lingkaran l1 = new Lingkaran(5);
//		Lingkaran l2 = l1;
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
//		l2.setJari2(10);
//		System.out.println(l1.getJari2());
//		System.out.println(l2.getJari2());
	}
	
	public static void ubahJari2(Lingkaran obj) {
		obj.setJari2(4);
	}
}
